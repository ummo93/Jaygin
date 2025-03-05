package com.github.ummo93.framework.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamUtils {
    public static String replaceInYamlInputStream(InputStream inputStream, Map<String, String> replacements) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }
        String content = baos.toString(StandardCharsets.UTF_8);

        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            String placeholder = String.format("\\$\\{%s\\}", entry.getKey());
            content = content.replaceAll(placeholder, entry.getValue());
        }

        Matcher matcher = Pattern.compile("\\$\\{([^:}]+)(?::([^}]+))?\\}").matcher(content);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String key = matcher.group(1);
            String defaultValue = matcher.group(2);
            String replacement = replacements.getOrDefault(key, defaultValue != null ? defaultValue : matcher.group(0));
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);
        return result.toString();
    }
}

package com.github.ummo93;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.*;

public class RaylibApiStructure {
    public final static Map<String, String[]> argsMap = new HashMap<>();
    public final static Map<String, String> infoMap = new HashMap<>();

    public static void loadRaylibMethodInfos(String apiFileName) {
        try (var fis = new FileInputStream("raylib/src/main/resources/" + apiFileName)) {
            var jsonStr = new String(fis.readAllBytes(), StandardCharsets.UTF_8);
            var jsonObj = new JSONObject(jsonStr);
            var functions = jsonObj.getJSONArray("functions");
            functions.forEach((function) -> {
                try {
                    var functionJson = (JSONObject)function;
                    var methodName = functionJson.getString("name");
                    if (methodName != null) {
                        try {
                            var params = functionJson.getJSONArray("params");
                            var paramList = params.toList();
                            var argNames = paramList.stream().map(obj -> ((Map)obj).get("name").toString()).toArray(String[]::new);
                            argsMap.put(methodName, argNames);
                        } catch (JSONException e) {}
                        try {
                            var info = functionJson.getString("description");
                            if (info != null) {
                                infoMap.put(methodName, info);
                            }
                        } catch (JSONException e) {}
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Total methods in args cache loaded: %d\n", argsMap.size());
        System.out.printf("Total methods in info cache loaded: %d\n", argsMap.size());
    }
}

package com.github.ummo93.framework.utils;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class ResourceUtils {
    private static final String ASSETS_PATH = "assets/%s";

    public static String getAssetPath(String assetName) {
        File externalAssets = new File("assets", assetName);
        if (externalAssets.exists()) {
            return externalAssets.getAbsolutePath();
        }

        try {
            URL resource = ResourceUtils.class
                .getClassLoader()
                .getResource(String.format(ASSETS_PATH, assetName));

            return Paths.get(resource.toURI())
                .toFile()
                .getAbsolutePath();
        } catch (Exception e) {
            throw new RuntimeException("Asset not found: " + assetName);
        }
    }
}
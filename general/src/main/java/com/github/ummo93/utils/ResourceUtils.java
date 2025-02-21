package com.github.ummo93.utils;

import java.io.File;

public class ResourceUtils {

    public static String getAssetPath(String assetName) {
        File externalAssets = new File("assets", assetName);
        if (externalAssets.exists()) {
            return externalAssets.getAbsolutePath();
        }

        File devAssets = new File("general/src/main/resources/assets", assetName);
        if (devAssets.exists()) {
            return devAssets.getAbsolutePath();
        }

        throw new RuntimeException("Asset not found: " + assetName);
    }
}
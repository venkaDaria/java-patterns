package com.globallogic.java_patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image {

    private Image realImage = new LargeImage();
    private Map<String, Image> loadedImages = new HashMap<>();

    @Override
    public Image get(final String name) {
        if (loadedImages.containsKey(name)) {
            return loadedImages.get(name);
        }

        Image image = realImage.get(name);
        loadedImages.put(name, image);
        return image;
    }
}

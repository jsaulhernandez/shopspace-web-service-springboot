package com.shopspace.shopspacewebservice.util;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;

public class ShopspaceUtil {
    public static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    public static MultiValueMap<String, String> getHeaders(Map<String, Collection<String>> oldHeaders) {
        MultiValueMap<String, String> newHeaders = new LinkedMultiValueMap<>();

        for (Map.Entry<String, Collection<String>> entry : oldHeaders.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString().replace("[", "").replace("]", "");

            newHeaders.add(key, value);
        }

        return newHeaders;
    }
}

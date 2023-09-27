package com.shopspace.shopspacewebservice.util;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ShopspaceUtil {
    public static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}

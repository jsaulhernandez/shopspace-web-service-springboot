package com.shopspace.shopspacewebservice.enums;

import java.util.Arrays;
import java.util.List;

public enum WhiteListOfPath {
    CATEGORY("/category/**"), PRODUCT("/product/**"), BRAND("/brand/**"), MEDIA("/media/**"), COMBINE("/combine/**"), COUPON("coupon/**"), PAYMENT_METHOD("/payment-method/**"),TYPE_CLASSIFICATION("/type-classification/**"), FAQS("/faqs/**");
    private String path;

    WhiteListOfPath(String path) {
        this.setPath(path);
    }

    public String getPath() {
        return path;
    }

    private void setPath(String path) {
        this.path = path;
    }

    public static String[] getPaths() {
        WhiteListOfPath[] values = WhiteListOfPath.values();
        List<String> arr = Arrays.stream(values).map(WhiteListOfPath::getPath).toList();
        return arr.toArray(new String[0]);
    }
}

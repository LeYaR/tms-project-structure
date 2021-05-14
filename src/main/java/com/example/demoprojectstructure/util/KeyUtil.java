package com.example.demoprojectstructure.util;

import java.util.UUID;

public class KeyUtil {

    public static String getUuidKey() {
        return UUID.randomUUID().toString();
    }
}

package com.example.security;

public class MD5 {
    static {
        System.loadLibrary("md5");
    }

    public static native String mdString(String string);

    public static native String mdFile(String filename);
}
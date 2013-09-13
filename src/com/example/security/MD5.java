package com.example.security;

public class MD5 {
    static {
        System.loadLibrary("md5");
    }

    /**
     * Calculate md5 of a String
     * @param string The string
     * @return md5, or null if any error occurs.
     */
    public static native String mdString(String string);

    /**
     * Calculate md5 of a File
     * @param filename The full path of the file
     * @return md5, or null if any error occurs.
     */
    public static native String mdFile(String filename);
}
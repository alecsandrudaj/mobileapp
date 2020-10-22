package com.google.ads.c;

public enum b {
    NONE("none"),
    DASHED("dashed"),
    DOTTED("dotted"),
    SOLID("solid");
    
    private String e;

    private b(String str) {
        this.e = str;
    }

    public String toString() {
        return this.e;
    }
}

package com.google.tagmanager.a;

public enum br {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.valueOf(false)),
    STRING(""),
    BYTE_STRING(h.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object j;

    private br(Object obj) {
        this.j = obj;
    }
}

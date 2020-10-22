package com.google.gson;

import java.io.IOException;

public final class JsonNull extends JsonElement {
    private static final JsonNull INSTANCE = new JsonNull();

    /* Access modifiers changed, original: protected */
    public void toString(Appendable sb, Escaper escaper) throws IOException {
        sb.append("null");
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof JsonNull);
    }

    static JsonNull createJsonNull() {
        return INSTANCE;
    }
}

package com.google.gson;

import com.google.android.gms.e;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map.Entry;

final class Streams {

    /* renamed from: com.google.gson.Streams$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];

        static {
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    private static class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite;

        static class CurrentWrite implements CharSequence {
            char[] chars;

            CurrentWrite() {
            }

            public int length() {
                return this.chars.length;
            }

            public char charAt(int i) {
                return this.chars[i];
            }

            public CharSequence subSequence(int start, int end) {
                return new String(this.chars, start, end - start);
            }
        }

        /* synthetic */ AppendableWriter(Appendable x0, AnonymousClass1 x1) {
            this(x0);
        }

        private AppendableWriter(Appendable appendable) {
            this.currentWrite = new CurrentWrite();
            this.appendable = appendable;
        }

        public void write(char[] chars, int offset, int length) throws IOException {
            this.currentWrite.chars = chars;
            this.appendable.append(this.currentWrite, offset, offset + length);
        }

        public void write(int i) throws IOException {
            this.appendable.append((char) i);
        }

        public void flush() {
        }

        public void close() {
        }
    }

    Streams() {
    }

    static JsonElement parse(JsonReader reader) throws JsonParseException {
        boolean isEmpty = true;
        try {
            reader.peek();
            isEmpty = false;
            return parseRecursive(reader);
        } catch (EOFException e) {
            if (isEmpty) {
                return JsonNull.createJsonNull();
            }
            throw new JsonIOException(e);
        } catch (MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e22) {
            throw new JsonIOException(e22);
        } catch (NumberFormatException e222) {
            throw new JsonSyntaxException(e222);
        }
    }

    private static JsonElement parseRecursive(JsonReader reader) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[reader.peek().ordinal()]) {
            case e.MapAttrs_cameraBearing /*1*/:
                return new JsonPrimitive(reader.nextString());
            case e.MapAttrs_cameraTargetLat /*2*/:
                return new JsonPrimitive(JsonPrimitive.stringToNumber(reader.nextString()));
            case e.MapAttrs_cameraTargetLng /*3*/:
                return new JsonPrimitive(Boolean.valueOf(reader.nextBoolean()));
            case e.MapAttrs_cameraTilt /*4*/:
                reader.nextNull();
                return JsonNull.createJsonNull();
            case e.MapAttrs_cameraZoom /*5*/:
                JsonElement array = new JsonArray();
                reader.beginArray();
                while (reader.hasNext()) {
                    array.add(parseRecursive(reader));
                }
                reader.endArray();
                return array;
            case e.MapAttrs_uiCompass /*6*/:
                JsonElement object = new JsonObject();
                reader.beginObject();
                while (reader.hasNext()) {
                    object.add(reader.nextName(), parseRecursive(reader));
                }
                reader.endObject();
                return object;
            default:
                throw new IllegalArgumentException();
        }
    }

    static void write(JsonElement element, boolean serializeNulls, JsonWriter writer) throws IOException {
        Iterator i$;
        if (element == null || element.isJsonNull()) {
            if (serializeNulls) {
                writer.nullValue();
            }
        } else if (element.isJsonPrimitive()) {
            JsonPrimitive primitive = element.getAsJsonPrimitive();
            if (primitive.isNumber()) {
                writer.value(primitive.getAsNumber());
            } else if (primitive.isBoolean()) {
                writer.value(primitive.getAsBoolean());
            } else {
                writer.value(primitive.getAsString());
            }
        } else if (element.isJsonArray()) {
            writer.beginArray();
            i$ = element.getAsJsonArray().iterator();
            while (i$.hasNext()) {
                JsonElement e = (JsonElement) i$.next();
                if (e.isJsonNull()) {
                    writer.nullValue();
                } else {
                    write(e, serializeNulls, writer);
                }
            }
            writer.endArray();
        } else if (element.isJsonObject()) {
            writer.beginObject();
            for (Entry<String, JsonElement> e2 : element.getAsJsonObject().entrySet()) {
                JsonElement value = (JsonElement) e2.getValue();
                if (serializeNulls || !value.isJsonNull()) {
                    writer.name((String) e2.getKey());
                    write(value, serializeNulls, writer);
                }
            }
            writer.endObject();
        } else {
            throw new IllegalArgumentException("Couldn't write " + element.getClass());
        }
    }

    static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable, null);
    }
}

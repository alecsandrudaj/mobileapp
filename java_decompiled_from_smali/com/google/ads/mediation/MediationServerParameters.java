package com.google.ads.mediation;

import com.google.ads.util.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class MediationServerParameters {

    public static class MappingException extends Exception {
        public MappingException(String message) {
            super(message);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface Parameter {
        String name();

        boolean required() default true;
    }

    public void load(Map<String, String> parameters) throws MappingException {
        Field field;
        HashMap hashMap = new HashMap();
        for (Field field2 : getClass().getFields()) {
            Parameter parameter = (Parameter) field2.getAnnotation(Parameter.class);
            if (parameter != null) {
                hashMap.put(parameter.name(), field2);
            }
        }
        if (hashMap.isEmpty()) {
            b.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Entry entry : parameters.entrySet()) {
            field = (Field) hashMap.remove(entry.getKey());
            if (field != null) {
                try {
                    field.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    b.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    b.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                b.e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str = null;
        for (Field field3 : hashMap.values()) {
            String str2;
            if (((Parameter) field3.getAnnotation(Parameter.class)).required()) {
                b.b("Required Server Option missing: " + ((Parameter) field3.getAnnotation(Parameter.class)).name());
                str2 = (str == null ? "" : str + ", ") + ((Parameter) field3.getAnnotation(Parameter.class)).name();
            } else {
                str2 = str;
            }
            str = str2;
        }
        if (str != null) {
            throw new MappingException("Required Server Option(s) missing: " + str);
        }
        a();
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }
}

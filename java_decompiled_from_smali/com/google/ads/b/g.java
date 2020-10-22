package com.google.ads.b;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class g {
    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public void a(Map map) {
        Field field;
        HashMap hashMap = new HashMap();
        for (Field field2 : getClass().getFields()) {
            i iVar = (i) field2.getAnnotation(i.class);
            if (iVar != null) {
                hashMap.put(iVar.a(), field2);
            }
        }
        if (hashMap.isEmpty()) {
            com.google.ads.util.g.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Entry entry : map.entrySet()) {
            field = (Field) hashMap.remove(entry.getKey());
            if (field != null) {
                try {
                    field.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    com.google.ads.util.g.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    com.google.ads.util.g.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                com.google.ads.util.g.e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str = null;
        for (Field field3 : hashMap.values()) {
            String str2;
            if (((i) field3.getAnnotation(i.class)).b()) {
                com.google.ads.util.g.b("Required Server Option missing: " + ((i) field3.getAnnotation(i.class)).a());
                str2 = (str == null ? "" : str + ", ") + ((i) field3.getAnnotation(i.class)).a();
            } else {
                str2 = str;
            }
            str = str2;
        }
        if (str != null) {
            throw new h("Required Server Option(s) missing: " + str);
        }
        a();
    }
}

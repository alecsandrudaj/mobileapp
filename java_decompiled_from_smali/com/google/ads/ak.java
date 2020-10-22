package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ak extends aj {
    static boolean c = false;
    private static Method d = null;
    private static Method e = null;
    private static Method f = null;
    private static Method g = null;
    private static Method h = null;
    private static String i = null;
    private static long j = 0;

    static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public static ak a(String str, Context context) {
        b(str, context);
        return new ak(context);
    }

    protected static synchronized void b(String str, Context context) {
        synchronized (ak.class) {
            if (!c) {
                try {
                    i = str;
                    f(context);
                    j = b().longValue();
                    c = true;
                } catch (a | UnsupportedOperationException e) {
                }
            }
        }
    }

    protected ak(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A:{Splitter:B:1:0x0001, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A:{Splitter:B:1:0x0001, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A:{Splitter:B:1:0x0001, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            return;
     */
    public void b(android.content.Context r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = c();	 Catch:{ a -> 0x002f, a | IOException -> 0x0027 }
        r3.a(r0, r1);	 Catch:{ a -> 0x002f, a | IOException -> 0x0027 }
    L_0x0008:
        r0 = 2;
        r1 = a();	 Catch:{ a -> 0x002d, a | IOException -> 0x0027 }
        r3.a(r0, r1);	 Catch:{ a -> 0x002d, a | IOException -> 0x0027 }
    L_0x0010:
        r0 = 25;
        r1 = b();	 Catch:{ a -> 0x002b, a | IOException -> 0x0027 }
        r1 = r1.longValue();	 Catch:{ a -> 0x002b, a | IOException -> 0x0027 }
        r3.a(r0, r1);	 Catch:{ a -> 0x002b, a | IOException -> 0x0027 }
    L_0x001d:
        r0 = 24;
        r1 = d(r4);	 Catch:{ a -> 0x0029, a | IOException -> 0x0027 }
        r3.a(r0, r1);	 Catch:{ a -> 0x0029, a | IOException -> 0x0027 }
    L_0x0026:
        return;
    L_0x0027:
        r0 = move-exception;
        goto L_0x0026;
    L_0x0029:
        r0 = move-exception;
        goto L_0x0026;
    L_0x002b:
        r0 = move-exception;
        goto L_0x001d;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0010;
    L_0x002f:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.ak.b(android.content.Context):void");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A:{Splitter:B:6:0x0010, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A:{Splitter:B:6:0x0010, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A:{Splitter:B:6:0x0010, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A:{Splitter:B:6:0x0010, ExcHandler: a | IOException (e java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            return;
     */
    public void c(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 2;
        r1 = a();	 Catch:{ a -> 0x0087, a | IOException -> 0x007d }
        r6.a(r0, r1);	 Catch:{ a -> 0x0087, a | IOException -> 0x007d }
    L_0x0008:
        r0 = 1;
        r1 = c();	 Catch:{ a -> 0x0085, a | IOException -> 0x007d }
        r6.a(r0, r1);	 Catch:{ a -> 0x0085, a | IOException -> 0x007d }
    L_0x0010:
        r0 = b();	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r0 = r0.longValue();	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r2 = 25;
        r6.a(r2, r0);	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r2 = j;	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x0025:
        r2 = 17;
        r3 = j;	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r0 = r0 - r3;
        r6.a(r2, r0);	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r0 = 23;
        r1 = j;	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
        r6.a(r0, r1);	 Catch:{ a -> 0x0083, a | IOException -> 0x007d }
    L_0x0034:
        r0 = r6.a;	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r1 = r6.b;	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r1 = a(r0, r1);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r2 = 14;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r3 = r0.longValue();	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r6.a(r2, r3);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r2 = 15;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r3 = r0.longValue();	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r6.a(r2, r3);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r0 = r1.size();	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r2 = 3;
        if (r0 < r2) goto L_0x0073;
    L_0x0063:
        r2 = 16;
        r0 = 2;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r0 = r0.longValue();	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
        r6.a(r2, r0);	 Catch:{ a -> 0x0081, a | IOException -> 0x007d }
    L_0x0073:
        r0 = 27;
        r1 = e(r7);	 Catch:{ a -> 0x007f, a | IOException -> 0x007d }
        r6.a(r0, r1);	 Catch:{ a -> 0x007f, a | IOException -> 0x007d }
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        goto L_0x007c;
    L_0x007f:
        r0 = move-exception;
        goto L_0x007c;
    L_0x0081:
        r0 = move-exception;
        goto L_0x0073;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0085:
        r0 = move-exception;
        goto L_0x0010;
    L_0x0087:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.ak.c(android.content.Context):void");
    }

    static String a() throws a {
        if (i != null) {
            return i;
        }
        throw new a();
    }

    static Long b() throws a {
        if (d == null) {
            throw new a();
        }
        try {
            return (Long) d.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new a(e);
        } catch (InvocationTargetException e2) {
            throw new a(e2);
        }
    }

    static String d(Context context) throws a {
        if (h == null) {
            throw new a();
        }
        try {
            String str = (String) h.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new a();
        } catch (IllegalAccessException e) {
            throw new a(e);
        } catch (InvocationTargetException e2) {
            throw new a(e2);
        }
    }

    static String c() throws a {
        if (e == null) {
            throw new a();
        }
        try {
            return (String) e.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new a(e);
        } catch (InvocationTargetException e2) {
            throw new a(e2);
        }
    }

    static ArrayList<Long> a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws a {
        if (g == null || motionEvent == null) {
            throw new a();
        }
        try {
            return (ArrayList) g.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (IllegalAccessException e) {
            throw new a(e);
        } catch (InvocationTargetException e2) {
            throw new a(e2);
        }
    }

    static String e(Context context) throws a {
        if (f == null) {
            throw new a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return aq.a(byteBuffer.array(), false);
            }
            throw new a();
        } catch (IllegalAccessException e) {
            throw new a(e);
        } catch (InvocationTargetException e2) {
            throw new a(e2);
        }
    }

    private static String b(byte[] bArr, String str) throws a {
        try {
            return new String(an.a(bArr, str), "UTF-8");
        } catch (com.google.ads.an.a e) {
            throw new a(e);
        } catch (ap e2) {
            throw new a(e2);
        } catch (UnsupportedEncodingException e3) {
            throw new a(e3);
        }
    }

    private static void f(Context context) throws a {
        try {
            byte[] a = an.a(ao.a());
            byte[] a2 = an.a(a, ao.b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                cacheDir = context.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new a();
                }
            }
            File createTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(a2, 0, a2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(b(a, ao.c()));
            Class loadClass2 = dexClassLoader.loadClass(b(a, ao.i()));
            Class loadClass3 = dexClassLoader.loadClass(b(a, ao.g()));
            Class loadClass4 = dexClassLoader.loadClass(b(a, ao.k()));
            Class loadClass5 = dexClassLoader.loadClass(b(a, ao.e()));
            d = loadClass.getMethod(b(a, ao.d()), new Class[0]);
            e = loadClass2.getMethod(b(a, ao.j()), new Class[0]);
            f = loadClass3.getMethod(b(a, ao.h()), new Class[]{Context.class});
            g = loadClass4.getMethod(b(a, ao.l()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            h = loadClass5.getMethod(b(a, ao.f()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (ap e) {
            throw new a(e);
        } catch (FileNotFoundException e2) {
            throw new a(e2);
        } catch (IOException e3) {
            throw new a(e3);
        } catch (ClassNotFoundException e4) {
            throw new a(e4);
        } catch (com.google.ads.an.a e5) {
            throw new a(e5);
        } catch (NoSuchMethodException e6) {
            throw new a(e6);
        } catch (NullPointerException e7) {
            throw new a(e7);
        }
    }
}

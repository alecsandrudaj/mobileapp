package com.google.tagmanager.a;

public abstract class d implements aq {
    private static final o a = o.a();

    private bf a(am amVar) {
        return amVar instanceof a ? ((a) amVar).Q() : amVar instanceof c ? ((c) amVar).b() : new bf(amVar);
    }

    private am b(am amVar) {
        if (amVar == null || amVar.j()) {
            return amVar;
        }
        throw a(amVar).a().a(amVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A:{Splitter:B:0:0x0000, ExcHandler: IOException (r0_4 'e' java.io.IOException)} */
    /* JADX WARNING: Missing block: B:12:0x0017, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x001f, code skipped:
            throw new java.lang.RuntimeException("Reading from a ByteString threw an IOException (should never happen).", r0);
     */
    public com.google.tagmanager.a.am a(com.google.tagmanager.a.h r4, com.google.tagmanager.a.o r5) {
        /*
        r3 = this;
        r1 = r4.h();	 Catch:{ af -> 0x0015, IOException -> 0x0017 }
        r0 = r3.b(r1, r5);	 Catch:{ af -> 0x0015, IOException -> 0x0017 }
        r0 = (com.google.tagmanager.a.am) r0;	 Catch:{ af -> 0x0015, IOException -> 0x0017 }
        r2 = 0;
        r1.a(r2);	 Catch:{ af -> 0x000f, IOException -> 0x0017 }
        return r0;
    L_0x000f:
        r1 = move-exception;
        r0 = r1.a(r0);	 Catch:{ af -> 0x0015, IOException -> 0x0017 }
        throw r0;	 Catch:{ af -> 0x0015, IOException -> 0x0017 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Reading from a ByteString threw an IOException (should never happen).";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.a.d.a(com.google.tagmanager.a.h, com.google.tagmanager.a.o):com.google.tagmanager.a.am");
    }

    /* renamed from: b */
    public am c(h hVar, o oVar) {
        return b(a(hVar, oVar));
    }
}

package com.google.tagmanager.a;

import java.io.Serializable;

public abstract class t extends a implements Serializable {
    protected t() {
    }

    protected t(v vVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    private static boolean b(com.google.tagmanager.a.q r6, com.google.tagmanager.a.am r7, com.google.tagmanager.a.k r8, com.google.tagmanager.a.m r9, com.google.tagmanager.a.o r10, int r11) {
        /*
        r2 = 0;
        r1 = 1;
        r0 = com.google.tagmanager.a.bk.a(r11);
        r3 = com.google.tagmanager.a.bk.b(r11);
        r4 = r10.a(r7, r3);
        if (r4 != 0) goto L_0x0019;
    L_0x0010:
        r0 = r2;
        r3 = r1;
    L_0x0012:
        if (r3 == 0) goto L_0x004a;
    L_0x0014:
        r0 = r8.a(r11, r9);
    L_0x0018:
        return r0;
    L_0x0019:
        r3 = r4.b;
        r3 = r3.a();
        r3 = com.google.tagmanager.a.q.a(r3, r2);
        if (r0 != r3) goto L_0x0028;
    L_0x0025:
        r0 = r2;
        r3 = r2;
        goto L_0x0012;
    L_0x0028:
        r3 = r4.b;
        r3 = r3.d;
        if (r3 == 0) goto L_0x0047;
    L_0x002e:
        r3 = r4.b;
        r3 = r3.c;
        r3 = r3.c();
        if (r3 == 0) goto L_0x0047;
    L_0x0038:
        r3 = r4.b;
        r3 = r3.a();
        r3 = com.google.tagmanager.a.q.a(r3, r1);
        if (r0 != r3) goto L_0x0047;
    L_0x0044:
        r0 = r1;
        r3 = r2;
        goto L_0x0012;
    L_0x0047:
        r0 = r2;
        r3 = r1;
        goto L_0x0012;
    L_0x004a:
        if (r0 == 0) goto L_0x009c;
    L_0x004c:
        r0 = r8.s();
        r0 = r8.c(r0);
        r3 = r4.b;
        r3 = r3.a();
        r5 = com.google.tagmanager.a.bm.ENUM;
        if (r3 != r5) goto L_0x0080;
    L_0x005e:
        r2 = r8.w();
        if (r2 <= 0) goto L_0x0096;
    L_0x0064:
        r2 = r8.n();
        r3 = r4.b;
        r3 = r3.e();
        r2 = r3.b(r2);
        if (r2 != 0) goto L_0x0076;
    L_0x0074:
        r0 = r1;
        goto L_0x0018;
    L_0x0076:
        r3 = r4.b;
        r2 = r4.a(r2);
        r6.b(r3, r2);
        goto L_0x005e;
    L_0x0080:
        r3 = r8.w();
        if (r3 <= 0) goto L_0x0096;
    L_0x0086:
        r3 = r4.b;
        r3 = r3.a();
        r3 = com.google.tagmanager.a.q.a(r8, r3, r2);
        r5 = r4.b;
        r6.b(r5, r3);
        goto L_0x0080;
    L_0x0096:
        r8.d(r0);
    L_0x0099:
        r0 = r1;
        goto L_0x0018;
    L_0x009c:
        r0 = com.google.tagmanager.a.u.a;
        r3 = r4.b;
        r3 = r3.b();
        r3 = r3.ordinal();
        r0 = r0[r3];
        switch(r0) {
            case 1: goto L_0x00c9;
            case 2: goto L_0x0104;
            default: goto L_0x00ad;
        };
    L_0x00ad:
        r0 = r4.b;
        r0 = r0.a();
        r0 = com.google.tagmanager.a.q.a(r8, r0, r2);
    L_0x00b7:
        r2 = r4.b;
        r2 = r2.c();
        if (r2 == 0) goto L_0x011d;
    L_0x00bf:
        r2 = r4.b;
        r0 = r4.a(r0);
        r6.b(r2, r0);
        goto L_0x0099;
    L_0x00c9:
        r2 = 0;
        r0 = r4.b;
        r0 = r0.c();
        if (r0 != 0) goto L_0x0128;
    L_0x00d2:
        r0 = r4.b;
        r0 = r6.a(r0);
        r0 = (com.google.tagmanager.a.am) r0;
        if (r0 == 0) goto L_0x0128;
    L_0x00dc:
        r0 = r0.n();
    L_0x00e0:
        if (r0 != 0) goto L_0x00ea;
    L_0x00e2:
        r0 = r4.b();
        r0 = r0.o();
    L_0x00ea:
        r2 = r4.b;
        r2 = r2.a();
        r3 = com.google.tagmanager.a.bm.GROUP;
        if (r2 != r3) goto L_0x0100;
    L_0x00f4:
        r2 = r4.a();
        r8.a(r2, r0, r10);
    L_0x00fb:
        r0 = r0.h();
        goto L_0x00b7;
    L_0x0100:
        r8.a(r0, r10);
        goto L_0x00fb;
    L_0x0104:
        r2 = r8.n();
        r0 = r4.b;
        r0 = r0.e();
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x00b7;
    L_0x0114:
        r9.d(r11);
        r9.b(r2);
        r0 = r1;
        goto L_0x0018;
    L_0x011d:
        r2 = r4.b;
        r0 = r4.a(r0);
        r6.a(r2, r0);
        goto L_0x0099;
    L_0x0128:
        r0 = r2;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.a.t.b(com.google.tagmanager.a.q, com.google.tagmanager.a.am, com.google.tagmanager.a.k, com.google.tagmanager.a.m, com.google.tagmanager.a.o, int):boolean");
    }

    /* Access modifiers changed, original: protected */
    public void R() {
    }

    /* Access modifiers changed, original: protected */
    public boolean a(k kVar, m mVar, o oVar, int i) {
        return kVar.a(i, mVar);
    }

    public aq c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}

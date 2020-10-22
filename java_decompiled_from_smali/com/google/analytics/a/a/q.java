package com.google.analytics.a.a;

import com.google.analytics.b.a.a.c;
import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.util.Collections;
import java.util.List;

public final class q extends t implements t {
    public static aq a = new r();
    private static final q c = new q(true);
    private static volatile ap x = null;
    private final h d;
    private int e;
    private ai f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private Object m;
    private Object n;
    private Object o;
    private Object p;
    private c q;
    private float r;
    private boolean s;
    private ai t;
    private int u;
    private byte v;
    private int w;

    static {
        c.S();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:154:0x02bb=Splitter:B:154:0x02bb, B:121:0x023f=Splitter:B:121:0x023f} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02a4  */
    /* JADX WARNING: Missing block: B:8:0x002e, code skipped:
            r3 = r2;
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:88:0x01b5, code skipped:
            r0 = r2;
            r2 = r3;
     */
    private q(com.google.tagmanager.a.k r14, com.google.tagmanager.a.o r15) {
        /*
        r13 = this;
        r11 = 8;
        r10 = 4;
        r9 = 2;
        r8 = 16;
        r1 = 1;
        r13.<init>();
        r0 = -1;
        r13.v = r0;
        r0 = -1;
        r13.w = r0;
        r13.S();
        r3 = 0;
        r5 = com.google.tagmanager.a.h.i();
        r6 = com.google.tagmanager.a.m.a(r5);
        r2 = 0;
    L_0x001d:
        if (r2 != 0) goto L_0x01b9;
    L_0x001f:
        r0 = r14.a();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        switch(r0) {
            case 0: goto L_0x0031;
            case 10: goto L_0x0034;
            case 18: goto L_0x004e;
            case 26: goto L_0x006a;
            case 34: goto L_0x0086;
            case 42: goto L_0x00a2;
            case 50: goto L_0x00bf;
            case 58: goto L_0x00de;
            case 74: goto L_0x00fd;
            case 82: goto L_0x010d;
            case 98: goto L_0x011d;
            case 106: goto L_0x012d;
            case 114: goto L_0x013d;
            case 125: goto L_0x016c;
            case 130: goto L_0x017c;
            case 136: goto L_0x0199;
            case 144: goto L_0x01a9;
            default: goto L_0x0026;
        };	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x0026:
        r0 = r13.a(r14, r6, r15, r0);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        if (r0 != 0) goto L_0x01b5;
    L_0x002c:
        r0 = r1;
        r2 = r3;
    L_0x002e:
        r3 = r2;
        r2 = r0;
        goto L_0x001d;
    L_0x0031:
        r0 = r1;
        r2 = r3;
        goto L_0x002e;
    L_0x0034:
        r4 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 & 1;
        if (r0 == r1) goto L_0x02ff;
    L_0x003c:
        r0 = new com.google.tagmanager.a.ah;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.f = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 1;
    L_0x0045:
        r3 = r13.f;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.a(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x004e:
        r0 = r3 & 2;
        if (r0 == r9) goto L_0x02fc;
    L_0x0052:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.g = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 2;
    L_0x005b:
        r3 = r13.g;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.b.a.a.c.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x006a:
        r0 = r3 & 4;
        if (r0 == r10) goto L_0x02f9;
    L_0x006e:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.h = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 4;
    L_0x0077:
        r3 = r13.h;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.a.a.m.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x0086:
        r0 = r3 & 8;
        if (r0 == r11) goto L_0x02f6;
    L_0x008a:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.i = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 8;
    L_0x0093:
        r3 = r13.i;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.a.a.i.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00a2:
        r0 = r3 & 16;
        if (r0 == r8) goto L_0x02f3;
    L_0x00a6:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.j = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 16;
    L_0x00af:
        r3 = r13.j;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.a.a.i.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00bf:
        r0 = r3 & 32;
        r4 = 32;
        if (r0 == r4) goto L_0x02f0;
    L_0x00c5:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.k = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 32;
    L_0x00ce:
        r3 = r13.k;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.a.a.i.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00de:
        r0 = r3 & 64;
        r4 = 64;
        if (r0 == r4) goto L_0x02ed;
    L_0x00e4:
        r0 = new java.util.ArrayList;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.l = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 64;
    L_0x00ed:
        r3 = r13.l;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = com.google.analytics.a.a.u.a;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r4 = r14.a(r4, r15);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.add(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x00fd:
        r0 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 1;
        r13.e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.m = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x010d:
        r0 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 2;
        r13.e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.n = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x011d:
        r0 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 4;
        r13.e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.o = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x012d:
        r0 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 | 8;
        r13.e = r4;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.p = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x013d:
        r0 = 0;
        r4 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r4 & 16;
        if (r4 != r8) goto L_0x02ea;
    L_0x0144:
        r0 = r13.q;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0.n();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4 = r0;
    L_0x014b:
        r0 = com.google.analytics.a.a.c.a;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.a(r0, r15);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = (com.google.analytics.a.a.c) r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.q = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        if (r4 == 0) goto L_0x0162;
    L_0x0157:
        r0 = r13.q;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r4.a(r0);	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r4.d();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.q = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x0162:
        r0 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 16;
        r13.e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x016c:
        r0 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 32;
        r13.e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.c();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.r = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x017c:
        r4 = r14.l();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 & 16384;
        r7 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r0 == r7) goto L_0x02e7;
    L_0x0186:
        r0 = new com.google.tagmanager.a.ah;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0.<init>();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.t = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r3 | 16384;
    L_0x018f:
        r3 = r13.t;	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r3.a(r4);	 Catch:{ af -> 0x02e2, IOException -> 0x02de, all -> 0x02d9 }
        r12 = r2;
        r2 = r0;
        r0 = r12;
        goto L_0x002e;
    L_0x0199:
        r0 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 128;
        r13.e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.f();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.u = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x01a9:
        r0 = r13.e;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r0 | 64;
        r13.e = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r0 = r14.i();	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
        r13.s = r0;	 Catch:{ af -> 0x023e, IOException -> 0x02ba }
    L_0x01b5:
        r0 = r2;
        r2 = r3;
        goto L_0x002e;
    L_0x01b9:
        r0 = r3 & 1;
        if (r0 != r1) goto L_0x01c6;
    L_0x01bd:
        r0 = new com.google.tagmanager.a.bg;
        r1 = r13.f;
        r0.<init>(r1);
        r13.f = r0;
    L_0x01c6:
        r0 = r3 & 2;
        if (r0 != r9) goto L_0x01d2;
    L_0x01ca:
        r0 = r13.g;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.g = r0;
    L_0x01d2:
        r0 = r3 & 4;
        if (r0 != r10) goto L_0x01de;
    L_0x01d6:
        r0 = r13.h;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.h = r0;
    L_0x01de:
        r0 = r3 & 8;
        if (r0 != r11) goto L_0x01ea;
    L_0x01e2:
        r0 = r13.i;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.i = r0;
    L_0x01ea:
        r0 = r3 & 16;
        if (r0 != r8) goto L_0x01f6;
    L_0x01ee:
        r0 = r13.j;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.j = r0;
    L_0x01f6:
        r0 = r3 & 32;
        r1 = 32;
        if (r0 != r1) goto L_0x0204;
    L_0x01fc:
        r0 = r13.k;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.k = r0;
    L_0x0204:
        r0 = r3 & 64;
        r1 = 64;
        if (r0 != r1) goto L_0x0212;
    L_0x020a:
        r0 = r13.l;
        r0 = java.util.Collections.unmodifiableList(r0);
        r13.l = r0;
    L_0x0212:
        r0 = r3 & 16384;
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r0 != r1) goto L_0x0221;
    L_0x0218:
        r0 = new com.google.tagmanager.a.bg;
        r1 = r13.t;
        r0.<init>(r1);
        r13.t = r0;
    L_0x0221:
        r6.a();	 Catch:{ IOException -> 0x022e, all -> 0x0236 }
        r0 = r5.a();
        r13.d = r0;
    L_0x022a:
        r13.R();
        return;
    L_0x022e:
        r0 = move-exception;
        r0 = r5.a();
        r13.d = r0;
        goto L_0x022a;
    L_0x0236:
        r0 = move-exception;
        r1 = r5.a();
        r13.d = r1;
        throw r0;
    L_0x023e:
        r0 = move-exception;
    L_0x023f:
        r0 = r0.a(r13);	 Catch:{ all -> 0x0244 }
        throw r0;	 Catch:{ all -> 0x0244 }
    L_0x0244:
        r0 = move-exception;
    L_0x0245:
        r2 = r3 & 1;
        if (r2 != r1) goto L_0x0252;
    L_0x0249:
        r1 = new com.google.tagmanager.a.bg;
        r2 = r13.f;
        r1.<init>(r2);
        r13.f = r1;
    L_0x0252:
        r1 = r3 & 2;
        if (r1 != r9) goto L_0x025e;
    L_0x0256:
        r1 = r13.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.g = r1;
    L_0x025e:
        r1 = r3 & 4;
        if (r1 != r10) goto L_0x026a;
    L_0x0262:
        r1 = r13.h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.h = r1;
    L_0x026a:
        r1 = r3 & 8;
        if (r1 != r11) goto L_0x0276;
    L_0x026e:
        r1 = r13.i;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.i = r1;
    L_0x0276:
        r1 = r3 & 16;
        if (r1 != r8) goto L_0x0282;
    L_0x027a:
        r1 = r13.j;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.j = r1;
    L_0x0282:
        r1 = r3 & 32;
        r2 = 32;
        if (r1 != r2) goto L_0x0290;
    L_0x0288:
        r1 = r13.k;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.k = r1;
    L_0x0290:
        r1 = r3 & 64;
        r2 = 64;
        if (r1 != r2) goto L_0x029e;
    L_0x0296:
        r1 = r13.l;
        r1 = java.util.Collections.unmodifiableList(r1);
        r13.l = r1;
    L_0x029e:
        r1 = r3 & 16384;
        r2 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 != r2) goto L_0x02ad;
    L_0x02a4:
        r1 = new com.google.tagmanager.a.bg;
        r2 = r13.t;
        r1.<init>(r2);
        r13.t = r1;
    L_0x02ad:
        r6.a();	 Catch:{ IOException -> 0x02c9, all -> 0x02d1 }
        r1 = r5.a();
        r13.d = r1;
    L_0x02b6:
        r13.R();
        throw r0;
    L_0x02ba:
        r0 = move-exception;
    L_0x02bb:
        r2 = new com.google.tagmanager.a.af;	 Catch:{ all -> 0x0244 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0244 }
        r2.<init>(r0);	 Catch:{ all -> 0x0244 }
        r0 = r2.a(r13);	 Catch:{ all -> 0x0244 }
        throw r0;	 Catch:{ all -> 0x0244 }
    L_0x02c9:
        r1 = move-exception;
        r1 = r5.a();
        r13.d = r1;
        goto L_0x02b6;
    L_0x02d1:
        r0 = move-exception;
        r1 = r5.a();
        r13.d = r1;
        throw r0;
    L_0x02d9:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x0245;
    L_0x02de:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x02bb;
    L_0x02e2:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        goto L_0x023f;
    L_0x02e7:
        r0 = r3;
        goto L_0x018f;
    L_0x02ea:
        r4 = r0;
        goto L_0x014b;
    L_0x02ed:
        r0 = r3;
        goto L_0x00ed;
    L_0x02f0:
        r0 = r3;
        goto L_0x00ce;
    L_0x02f3:
        r0 = r3;
        goto L_0x00af;
    L_0x02f6:
        r0 = r3;
        goto L_0x0093;
    L_0x02f9:
        r0 = r3;
        goto L_0x0077;
    L_0x02fc:
        r0 = r3;
        goto L_0x005b;
    L_0x02ff:
        r0 = r3;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.q.<init>(com.google.tagmanager.a.k, com.google.tagmanager.a.o):void");
    }

    private q(v vVar) {
        super(vVar);
        this.v = (byte) -1;
        this.w = -1;
        this.d = vVar.r();
    }

    private q(boolean z) {
        this.v = (byte) -1;
        this.w = -1;
        this.d = h.a;
    }

    public static s N() {
        return s.s();
    }

    private void S() {
        this.f = ah.a;
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = "";
        this.n = "";
        this.o = "0";
        this.p = "";
        this.q = c.a();
        this.r = 0.0f;
        this.s = false;
        this.t = ah.a;
        this.u = 0;
    }

    public static q a() {
        return c;
    }

    public static s a(q qVar) {
        return N().a(qVar);
    }

    public String A() {
        Object obj = this.o;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f = hVar.f();
        if (hVar.g()) {
            this.o = f;
        }
        return f;
    }

    public boolean B() {
        return (this.e & 8) == 8;
    }

    public String C() {
        Object obj = this.p;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f = hVar.f();
        if (hVar.g()) {
            this.p = f;
        }
        return f;
    }

    public boolean D() {
        return (this.e & 16) == 16;
    }

    public c E() {
        return this.q;
    }

    public boolean F() {
        return (this.e & 32) == 32;
    }

    public float G() {
        return this.r;
    }

    public boolean H() {
        return (this.e & 64) == 64;
    }

    public boolean I() {
        return this.s;
    }

    public List J() {
        return this.t;
    }

    public int K() {
        return this.t.size();
    }

    public boolean L() {
        return (this.e & 128) == 128;
    }

    public int M() {
        return this.u;
    }

    /* renamed from: O */
    public s o() {
        return N();
    }

    /* renamed from: P */
    public s n() {
        return a(this);
    }

    public c a(int i) {
        return (c) this.g.get(i);
    }

    public m b(int i) {
        return (m) this.h.get(i);
    }

    /* renamed from: b */
    public q p() {
        return c;
    }

    public i c(int i) {
        return (i) this.i.get(i);
    }

    public aq c() {
        return a;
    }

    public i d(int i) {
        return (i) this.j.get(i);
    }

    public List d() {
        return this.f;
    }

    public int e() {
        return this.f.size();
    }

    public i e(int i) {
        return (i) this.k.get(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        boolean z = (d().equals(qVar.d())) && f().equals(qVar.f());
        z = z && h().equals(qVar.h());
        z = z && k().equals(qVar.k());
        z = z && m().equals(qVar.m());
        z = z && r().equals(qVar.r());
        z = z && t().equals(qVar.t());
        z = z && v() == qVar.v();
        if (v()) {
            z = z && w().equals(qVar.w());
        }
        z = z && x() == qVar.x();
        if (x()) {
            z = z && y().equals(qVar.y());
        }
        z = z && z() == qVar.z();
        if (z()) {
            z = z && A().equals(qVar.A());
        }
        z = z && B() == qVar.B();
        if (B()) {
            z = z && C().equals(qVar.C());
        }
        z = z && D() == qVar.D();
        if (D()) {
            z = z && E().equals(qVar.E());
        }
        z = z && F() == qVar.F();
        if (F()) {
            z = z && Float.floatToIntBits(G()) == Float.floatToIntBits(qVar.G());
        }
        z = z && H() == qVar.H();
        if (H()) {
            z = z && I() == qVar.I();
        }
        z = z && J().equals(qVar.J());
        z = z && L() == qVar.L();
        return L() ? z && M() == qVar.M() : z;
    }

    public List f() {
        return this.g;
    }

    public int g() {
        return this.g.size();
    }

    public List h() {
        return this.h;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = q.class.hashCode() + 779;
        if (e() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
        }
        if (g() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        if (i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + k().hashCode();
        }
        if (q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m().hashCode();
        }
        if (s() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + r().hashCode();
        }
        if (u() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + t().hashCode();
        }
        if (v()) {
            hashCode = (((hashCode * 37) + 9) * 53) + w().hashCode();
        }
        if (x()) {
            hashCode = (((hashCode * 37) + 10) * 53) + y().hashCode();
        }
        if (z()) {
            hashCode = (((hashCode * 37) + 12) * 53) + A().hashCode();
        }
        if (B()) {
            hashCode = (((hashCode * 37) + 13) * 53) + C().hashCode();
        }
        if (D()) {
            hashCode = (((hashCode * 37) + 14) * 53) + E().hashCode();
        }
        if (F()) {
            hashCode = (((hashCode * 37) + 15) * 53) + Float.floatToIntBits(G());
        }
        if (H()) {
            hashCode = (((hashCode * 37) + 18) * 53) + ac.a(I());
        }
        if (K() > 0) {
            hashCode = (((hashCode * 37) + 16) * 53) + J().hashCode();
        }
        if (L()) {
            hashCode = (((hashCode * 37) + 17) * 53) + M();
        }
        hashCode = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.h.size();
    }

    public final boolean j() {
        boolean z = true;
        byte b = this.v;
        if (b != (byte) -1) {
            if (b != (byte) 1) {
                z = false;
            }
            return z;
        }
        int i = 0;
        while (i < g()) {
            if (a(i).j()) {
                i++;
            } else {
                this.v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < i()) {
            if (b(i).j()) {
                i++;
            } else {
                this.v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < l()) {
            if (c(i).j()) {
                i++;
            } else {
                this.v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < q()) {
            if (d(i).j()) {
                i++;
            } else {
                this.v = (byte) 0;
                return false;
            }
        }
        i = 0;
        while (i < s()) {
            if (e(i).j()) {
                i++;
            } else {
                this.v = (byte) 0;
                return false;
            }
        }
        this.v = (byte) 1;
        return true;
    }

    public List k() {
        return this.i;
    }

    public int l() {
        return this.i.size();
    }

    public List m() {
        return this.j;
    }

    public int q() {
        return this.j.size();
    }

    public List r() {
        return this.k;
    }

    public int s() {
        return this.k.size();
    }

    public List t() {
        return this.l;
    }

    public int u() {
        return this.l.size();
    }

    public boolean v() {
        return (this.e & 1) == 1;
    }

    public String w() {
        Object obj = this.m;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f = hVar.f();
        if (hVar.g()) {
            this.m = f;
        }
        return f;
    }

    public boolean x() {
        return (this.e & 2) == 2;
    }

    public String y() {
        Object obj = this.n;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f = hVar.f();
        if (hVar.g()) {
            this.n = f;
        }
        return f;
    }

    public boolean z() {
        return (this.e & 4) == 4;
    }
}

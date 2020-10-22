package com.google.android.gms.games.a;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import java.util.HashMap;

public final class b {
    private static final String[] a = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};
    private String b;
    private String c;
    private int d;
    private HashMap e = new HashMap();

    public b(d dVar) {
        int i = 0;
        this.d = dVar.e();
        int g = dVar.g();
        do.b(g == 3);
        while (i < g) {
            int a = dVar.a(i);
            if (i == 0) {
                this.b = dVar.c("leaderboardId", i, a);
                this.c = dVar.c("playerId", i, a);
            }
            if (dVar.d("hasResult", i, a)) {
                a(new c(dVar.a("rawScore", i, a), dVar.c("formattedScore", i, a), dVar.d("newBest", i, a)), dVar.b("timeSpan", i, a));
            }
            i++;
        }
    }

    private void a(c cVar, int i) {
        this.e.put(Integer.valueOf(i), cVar);
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        dn a = dl.a((Object) this).a("PlayerId", this.c).a("StatusCode", Integer.valueOf(this.d));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return a.toString();
            }
            c cVar = (c) this.e.get(Integer.valueOf(i2));
            a.a("TimesSpan", ao.a(i2));
            a.a("Result", cVar == null ? "null" : cVar.toString());
            i = i2 + 1;
        }
    }
}

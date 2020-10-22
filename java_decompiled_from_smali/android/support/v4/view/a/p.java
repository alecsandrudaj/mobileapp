package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class p implements w {
    final /* synthetic */ k a;
    final /* synthetic */ o b;

    p(o oVar, k kVar) {
        this.b = oVar;
        this.a = kVar;
    }

    public Object a(int i) {
        a a = this.a.a(i);
        return a == null ? null : a.a();
    }

    public List a(String str, int i) {
        List a = this.a.a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((a) a.get(i2)).a());
        }
        return arrayList;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }

    public Object b(int i) {
        a b = this.a.b(i);
        return b == null ? null : b.a();
    }
}

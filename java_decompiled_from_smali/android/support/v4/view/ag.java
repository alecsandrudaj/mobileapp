package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

class ag implements OnClickListener {
    final /* synthetic */ PagerTabStrip a;

    ag(PagerTabStrip pagerTabStrip) {
        this.a = pagerTabStrip;
    }

    public void onClick(View view) {
        this.a.a.setCurrentItem(this.a.a.getCurrentItem() + 1);
    }
}

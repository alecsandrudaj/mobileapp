package android.support.v4.widget;

class b implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        this.a.c = false;
        if (!this.a.d) {
            this.a.a = System.currentTimeMillis();
            this.a.setVisibility(0);
        }
    }
}

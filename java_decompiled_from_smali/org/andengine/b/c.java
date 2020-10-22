package org.andengine.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c extends ReentrantLock {
    final Condition a = newCondition();
    final AtomicBoolean b = new AtomicBoolean(false);

    public c(boolean z) {
        super(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        this.b.set(true);
        this.a.signalAll();
    }

    /* Access modifiers changed, original: 0000 */
    public void b() {
        this.b.set(false);
        this.a.signalAll();
    }

    /* Access modifiers changed, original: 0000 */
    public void c() {
        while (!this.b.get()) {
            this.a.await();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
        while (this.b.get()) {
            this.a.await();
        }
    }
}

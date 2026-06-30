package com.topjohnwu.superuser;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import java.util.AbstractList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class CallbackList<E> extends AbstractList<E> {
    protected List<E> mBase;
    protected Executor mExecutor;

    /* JADX INFO: renamed from: onAddElement, reason: merged with bridge method [inline-methods] */
    public abstract void m65lambda$add$0$comtopjohnwusuperuserCallbackList(E e);

    protected CallbackList() {
        this(UiThreadHandler.executor, null);
    }

    protected CallbackList(List<E> base) {
        this(UiThreadHandler.executor, base);
    }

    protected CallbackList(Executor executor) {
        this(executor, null);
    }

    protected CallbackList(Executor executor, List<E> base) {
        this.mExecutor = executor;
        this.mBase = base;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.mBase == null) {
            return null;
        }
        return this.mBase.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E s) {
        if (this.mBase == null) {
            return null;
        }
        return this.mBase.set(i, s);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, final E s) {
        if (this.mBase != null) {
            this.mBase.add(i, s);
        }
        this.mExecutor.execute(new Runnable() { // from class: com.topjohnwu.superuser.CallbackList$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m65lambda$add$0$comtopjohnwusuperuserCallbackList(s);
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        if (this.mBase == null) {
            return null;
        }
        return this.mBase.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (this.mBase == null) {
            return 0;
        }
        return this.mBase.size();
    }
}

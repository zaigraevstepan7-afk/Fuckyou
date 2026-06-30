package p024N;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p000A.C0001b;
import p010F0.AbstractC0090e;

/* JADX INFO: renamed from: N.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0236N {
    /* JADX INFO: renamed from: a */
    public static String[] m766a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0258f m767b(View view, C0258f c0258f) {
        ContentInfo contentInfoMo60y = c0258f.f810a.mo60y();
        Objects.requireNonNull(contentInfoMo60y);
        ContentInfo contentInfoM393g = AbstractC0090e.m393g(contentInfoMo60y);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM393g);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM393g ? c0258f : new C0258f(new C0001b(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m768c(View view, String[] strArr, InterfaceC0284s interfaceC0284s) {
        if (interfaceC0284s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0237O(interfaceC0284s));
        }
    }
}

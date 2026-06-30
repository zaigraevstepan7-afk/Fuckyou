package p024N;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p000A.C0001b;
import p010F0.AbstractC0090e;
import p036T.C0389s;

/* JADX INFO: renamed from: N.O */
/* JADX INFO: loaded from: classes.dex */
public final class OnReceiveContentListenerC0237O implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0284s f772a;

    public OnReceiveContentListenerC0237O(InterfaceC0284s interfaceC0284s) {
        this.f772a = interfaceC0284s;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0258f c0258f = new C0258f(new C0001b(contentInfo));
        C0258f c0258fM1096a = ((C0389s) this.f772a).m1096a(view, c0258f);
        if (c0258fM1096a == null) {
            return null;
        }
        if (c0258fM1096a == c0258f) {
            return contentInfo;
        }
        ContentInfo contentInfoMo60y = c0258fM1096a.f810a.mo60y();
        Objects.requireNonNull(contentInfoMo60y);
        return AbstractC0090e.m393g(contentInfoMo60y);
    }
}

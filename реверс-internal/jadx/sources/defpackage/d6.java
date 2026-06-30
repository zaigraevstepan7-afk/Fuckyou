package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d6(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                e6 e6Var = (e6) this.f;
                Context context = view.getContext();
                if (!e6Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(e6Var.f);
                    e6Var.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                e6 e6Var = (e6) obj;
                Context context = view.getContext();
                if (e6Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(e6Var.f);
                    e6Var.d = false;
                }
                e6.d(e6Var);
                break;
            case 1:
                r rVar = (r) obj;
                ViewParent parent = rVar.getParent();
                for (Object obj2 : parent == null ? i40.a : new m60(new p7(19, parent), k62.l, 1)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                rVar.f();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((jr1) obj).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

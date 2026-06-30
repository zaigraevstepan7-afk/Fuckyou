package p018K;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p026O.InterfaceC0321u;
import p060e.C0661c;
import p060e.C0662d;
import p060e.C0664f;
import p060e.C0665g;
import p060e.DialogInterfaceC0666h;
import p072k.DialogInterfaceOnKeyListenerC0817n;

/* JADX INFO: renamed from: K.j */
/* JADX INFO: loaded from: classes.dex */
public class C0154j implements InterfaceC0321u {

    /* JADX INFO: renamed from: a */
    public final int f484a;

    /* JADX INFO: renamed from: b */
    public final Object f485b;

    public C0154j(Context context) {
        this(context, DialogInterfaceC0666h.m1888g(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0666h mo569a() {
        C0662d c0662d = (C0662d) this.f485b;
        DialogInterfaceC0666h dialogInterfaceC0666h = new DialogInterfaceC0666h(c0662d.f2639a, this.f484a);
        View view = c0662d.f2643e;
        C0665g c0665g = dialogInterfaceC0666h.f2693f;
        if (view != null) {
            c0665g.f2687w = view;
        } else {
            CharSequence charSequence = c0662d.f2642d;
            if (charSequence != null) {
                c0665g.f2668d = charSequence;
                TextView textView = c0665g.f2685u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0662d.f2641c;
            if (drawable != null) {
                c0665g.f2683s = drawable;
                ImageView imageView = c0665g.f2684t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0665g.f2684t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0662d.f2644f;
        if (charSequence2 != null) {
            c0665g.f2669e = charSequence2;
            TextView textView2 = c0665g.f2686v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0662d.f2645g;
        if (charSequence3 != null) {
            c0665g.m1887d(-1, charSequence3, c0662d.f2646h);
        }
        CharSequence charSequence4 = c0662d.f2647i;
        if (charSequence4 != null) {
            c0665g.m1887d(-2, charSequence4, c0662d.f2648j);
        }
        String str = c0662d.f2649k;
        if (str != null) {
            c0665g.m1887d(-3, str, c0662d.f2650l);
        }
        if (c0662d.f2653o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0662d.f2640b.inflate(c0665g.f2659A, (ViewGroup) null);
            int i2 = c0662d.f2656r ? c0665g.f2660B : c0665g.f2661C;
            Object obj = c0662d.f2653o;
            ?? c0664f = obj;
            if (obj == null) {
                c0664f = new C0664f(c0662d.f2639a, i2, R.id.text1, null);
            }
            c0665g.f2688x = c0664f;
            c0665g.f2689y = c0662d.f2657s;
            if (c0662d.f2654p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0661c(c0662d, c0665g));
            }
            if (c0662d.f2656r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0665g.f2670f = alertController$RecycleListView;
        }
        View view2 = c0662d.f2655q;
        if (view2 != null) {
            c0665g.f2671g = view2;
            c0665g.f2672h = false;
        }
        dialogInterfaceC0666h.setCancelable(c0662d.f2651m);
        if (c0662d.f2651m) {
            dialogInterfaceC0666h.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0666h.setOnCancelListener(null);
        dialogInterfaceC0666h.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0817n dialogInterfaceOnKeyListenerC0817n = c0662d.f2652n;
        if (dialogInterfaceOnKeyListenerC0817n != null) {
            dialogInterfaceC0666h.setOnKeyListener(dialogInterfaceOnKeyListenerC0817n);
        }
        return dialogInterfaceC0666h;
    }

    @Override // p026O.InterfaceC0321u
    /* JADX INFO: renamed from: m */
    public boolean mo48m(View view) {
        ((BottomSheetBehavior) this.f485b).m1692B(this.f484a);
        return true;
    }

    public C0154j(Context context, int i2) {
        this.f485b = new C0662d(new ContextThemeWrapper(context, DialogInterfaceC0666h.m1888g(context, i2)));
        this.f484a = i2;
    }

    public C0154j(int i2, C0155k[] c0155kArr) {
        this.f484a = i2;
        this.f485b = c0155kArr;
    }

    public C0154j(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f485b = bottomSheetBehavior;
        this.f484a = i2;
    }
}

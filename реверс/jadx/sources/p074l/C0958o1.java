package p074l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: l.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0958o1 {

    /* JADX INFO: renamed from: a */
    public final Context f3811a;

    /* JADX INFO: renamed from: b */
    public final View f3812b;

    /* JADX INFO: renamed from: c */
    public final TextView f3813c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f3814d;

    /* JADX INFO: renamed from: e */
    public final Rect f3815e;

    /* JADX INFO: renamed from: f */
    public final int[] f3816f;

    /* JADX INFO: renamed from: g */
    public final int[] f3817g;

    public C0958o1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3814d = layoutParams;
        this.f3815e = new Rect();
        this.f3816f = new int[2];
        this.f3817g = new int[2];
        this.f3811a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.resc, (ViewGroup) null);
        this.f3812b = viewInflate;
        this.f3813c = (TextView) viewInflate.findViewById(R.id.resc);
        layoutParams.setTitle(C0958o1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.resc;
        layoutParams.flags = 24;
    }
}

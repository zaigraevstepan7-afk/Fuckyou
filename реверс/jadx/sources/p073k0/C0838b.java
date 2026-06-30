package p073k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import p074l.AbstractC0909X0;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0838b extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0838b(Class cls, String str, int i2) {
        super(cls, str);
        this.f3422a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3422a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC0859w.f3492a.mo462g((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((AbstractC0909X0) obj).f3674z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3422a) {
            case 0:
                C0841e c0841e = (C0841e) obj;
                PointF pointF = (PointF) obj2;
                c0841e.getClass();
                c0841e.f3425a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0841e.f3426b = iRound;
                int i2 = c0841e.f3430f + 1;
                c0841e.f3430f = i2;
                if (i2 == c0841e.f3431g) {
                    AbstractC0859w.m2265a(c0841e.f3429e, c0841e.f3425a, iRound, c0841e.f3427c, c0841e.f3428d);
                    c0841e.f3430f = 0;
                    c0841e.f3431g = 0;
                }
                break;
            case 1:
                C0841e c0841e2 = (C0841e) obj;
                PointF pointF2 = (PointF) obj2;
                c0841e2.getClass();
                c0841e2.f3427c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0841e2.f3428d = iRound2;
                int i3 = c0841e2.f3431g + 1;
                c0841e2.f3431g = i3;
                if (c0841e2.f3430f == i3) {
                    AbstractC0859w.m2265a(c0841e2.f3429e, c0841e2.f3425a, c0841e2.f3426b, c0841e2.f3427c, iRound2);
                    c0841e2.f3430f = 0;
                    c0841e2.f3431g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0859w.m2265a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0859w.m2265a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC0859w.m2265a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC0859w.f3492a.mo466p((View) obj, fFloatValue);
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((AbstractC0909X0) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}

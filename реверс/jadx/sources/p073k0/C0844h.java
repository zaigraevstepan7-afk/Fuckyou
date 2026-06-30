package p073k0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.reddit.frontpage.R;
import java.util.HashMap;
import p015I0.C0109e;

/* JADX INFO: renamed from: k0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0844h extends AbstractC0849m {

    /* JADX INFO: renamed from: B */
    public static final String[] f3440B = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: A */
    public final int f3441A;

    public C0844h(int i2) {
        this();
        this.f3441A = i2;
    }

    /* JADX INFO: renamed from: I */
    public static void m2240I(C0857u c0857u) {
        int visibility = c0857u.f3490b.getVisibility();
        HashMap map = c0857u.f3489a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0857u.f3490b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: K */
    public static float m2241K(C0857u c0857u, float f) {
        Float f2;
        return (c0857u == null || (f2 = (Float) c0857u.f3489a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0836G m2242L(C0857u c0857u, C0857u c0857u2) {
        C0836G c0836g = new C0836G();
        c0836g.f3411a = false;
        c0836g.f3412b = false;
        if (c0857u != null) {
            HashMap map = c0857u.f3489a;
            if (map.containsKey("android:visibility:visibility")) {
                c0836g.f3413c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c0836g.f3415e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c0836g.f3413c = -1;
                c0836g.f3415e = null;
            }
        }
        if (c0857u2 != null) {
            HashMap map2 = c0857u2.f3489a;
            if (map2.containsKey("android:visibility:visibility")) {
                c0836g.f3414d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c0836g.f3416f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c0836g.f3414d = -1;
                c0836g.f3416f = null;
            }
        }
        if (c0857u != null && c0857u2 != null) {
            int i2 = c0836g.f3413c;
            int i3 = c0836g.f3414d;
            if (i2 != i3 || c0836g.f3415e != c0836g.f3416f) {
                if (i2 != i3) {
                    if (i2 == 0) {
                        c0836g.f3412b = false;
                        c0836g.f3411a = true;
                        return c0836g;
                    }
                    if (i3 == 0) {
                        c0836g.f3412b = true;
                        c0836g.f3411a = true;
                        return c0836g;
                    }
                } else {
                    if (c0836g.f3416f == null) {
                        c0836g.f3412b = false;
                        c0836g.f3411a = true;
                        return c0836g;
                    }
                    if (c0836g.f3415e == null) {
                        c0836g.f3412b = true;
                        c0836g.f3411a = true;
                        return c0836g;
                    }
                }
            }
        } else {
            if (c0857u == null && c0836g.f3414d == 0) {
                c0836g.f3412b = true;
                c0836g.f3411a = true;
                return c0836g;
            }
            if (c0857u2 == null && c0836g.f3413c == 0) {
                c0836g.f3412b = false;
                c0836g.f3411a = true;
            }
        }
        return c0836g;
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m2243J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC0859w.f3492a.mo466p(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC0859w.f3493b, f2);
        C0843g c0843g = new C0843g(view);
        objectAnimatorOfFloat.addListener(c0843g);
        m2256o().m2250a(c0843g);
        return objectAnimatorOfFloat;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: d */
    public final void mo2228d(C0857u c0857u) {
        m2240I(c0857u);
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: g */
    public final void mo2230g(C0857u c0857u) {
        m2240I(c0857u);
        View view = c0857u.f3490b;
        Float fValueOf = (Float) view.getTag(R.id.resc);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC0859w.f3492a.mo462g(view)) : Float.valueOf(0.0f);
        }
        c0857u.f3489a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (m2242L(m2255n(r3, false), m2257r(r3, false)).f3411a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo2238k(FrameLayout frameLayout, C0857u c0857u, C0857u c0857u2) {
        View view;
        boolean z2;
        int i2;
        View view2;
        Animator animator;
        char c2;
        char c3;
        View view3;
        boolean z3;
        ViewGroup viewGroup;
        int i3;
        Bitmap bitmapCreateBitmap;
        int i4 = this.f3441A;
        C0836G c0836gM2242L = m2242L(c0857u, c0857u2);
        if (c0836gM2242L.f3411a && (c0836gM2242L.f3415e != null || c0836gM2242L.f3416f != null)) {
            boolean z4 = false;
            if (!c0836gM2242L.f3412b) {
                int i5 = c0836gM2242L.f3414d;
                if ((i4 & 2) == 2 && c0857u != null) {
                    View view4 = c0857u2 != null ? c0857u2.f3490b : null;
                    View view5 = c0857u.f3490b;
                    View view6 = (View) view5.getTag(R.id.resc);
                    if (view6 != null) {
                        i2 = i5;
                        view3 = null;
                        z4 = true;
                        animator = null;
                        c2 = 0;
                        c3 = 1;
                    } else {
                        if (view4 == null || view4.getParent() == null) {
                            if (view4 != null) {
                                view = null;
                                z2 = false;
                            }
                            view4 = null;
                            view = null;
                            z2 = true;
                        } else {
                            if (i5 == 4 || view5 == view4) {
                                view = view4;
                                view4 = null;
                                z2 = false;
                            }
                            view4 = null;
                            view = null;
                            z2 = true;
                        }
                        if (!z2) {
                            i2 = i5;
                            view2 = view;
                            animator = null;
                            c2 = 0;
                            c3 = 1;
                            view6 = view4;
                            view3 = view2;
                            z4 = false;
                        } else if (view5.getParent() == null) {
                            i2 = i5;
                            view3 = view;
                            animator = null;
                            c2 = 0;
                            c3 = 1;
                            view6 = view5;
                        } else {
                            if (view5.getParent() instanceof View) {
                                View view7 = (View) view5.getParent();
                                animator = null;
                                c2 = 0;
                                if (m2242L(m2257r(view7, true), m2255n(view7, true)).f3411a) {
                                    i2 = i5;
                                    view2 = view;
                                    c3 = 1;
                                    int id = view7.getId();
                                    if (view7.getParent() == null && id != -1) {
                                        frameLayout.findViewById(id);
                                    }
                                } else {
                                    boolean z5 = AbstractC0856t.f3488a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                    C0109e c0109e = AbstractC0859w.f3492a;
                                    c0109e.mo468r(view5, matrix);
                                    c0109e.mo469s(frameLayout, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                    matrix.mapRect(rectF);
                                    int iRound = Math.round(rectF.left);
                                    int iRound2 = Math.round(rectF.top);
                                    c3 = 1;
                                    int iRound3 = Math.round(rectF.right);
                                    int iRound4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view5.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    boolean zIsAttachedToWindow = view5.isAttachedToWindow();
                                    boolean z6 = frameLayout != null && frameLayout.isAttachedToWindow();
                                    if (zIsAttachedToWindow) {
                                        z3 = zIsAttachedToWindow;
                                        viewGroup = null;
                                        i3 = 0;
                                    } else if (z6) {
                                        viewGroup = (ViewGroup) view5.getParent();
                                        int iIndexOfChild = viewGroup.indexOfChild(view5);
                                        z3 = zIsAttachedToWindow;
                                        frameLayout.getOverlay().add(view5);
                                        i3 = iIndexOfChild;
                                    } else {
                                        i2 = i5;
                                        view2 = view;
                                        bitmapCreateBitmap = null;
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        view3 = view2;
                                        z4 = false;
                                    }
                                    view2 = view;
                                    int iRound5 = Math.round(rectF.width());
                                    i2 = i5;
                                    int iRound6 = Math.round(rectF.height());
                                    if (iRound5 <= 0 || iRound6 <= 0) {
                                        bitmapCreateBitmap = null;
                                    } else {
                                        float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                        int iRound7 = Math.round(iRound5 * fMin);
                                        int iRound8 = Math.round(iRound6 * fMin);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(fMin, fMin);
                                        if (AbstractC0856t.f3488a) {
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view5.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapCreateBitmap = AbstractC0855s.m2262a(picture);
                                        } else {
                                            bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            canvas.concat(matrix);
                                            view5.draw(canvas);
                                        }
                                    }
                                    if (!z3) {
                                        frameLayout.getOverlay().remove(view5);
                                        viewGroup.addView(view5, i3);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                    imageView.layout(iRound, iRound2, iRound3, iRound4);
                                    view6 = imageView;
                                    view3 = view2;
                                    z4 = false;
                                }
                            }
                            view6 = view4;
                            view3 = view2;
                            z4 = false;
                        }
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        AbstractC0859w.m2266b(view3, 0);
                        C0109e c0109e2 = AbstractC0859w.f3492a;
                        c0109e2.getClass();
                        ObjectAnimator objectAnimatorM2243J = m2243J(view3, m2241K(c0857u, 1.0f), 0.0f);
                        if (objectAnimatorM2243J == null) {
                            c0109e2.mo466p(view3, m2241K(c0857u2, 1.0f));
                        }
                        if (objectAnimatorM2243J == null) {
                            AbstractC0859w.m2266b(view3, visibility);
                            return objectAnimatorM2243J;
                        }
                        C0834E c0834e = new C0834E(view3, i2);
                        objectAnimatorM2243J.addListener(c0834e);
                        m2256o().m2250a(c0834e);
                        return objectAnimatorM2243J;
                    }
                    if (!z4) {
                        int[] iArr = (int[]) c0857u.f3489a.get("android:visibility:screenLocation");
                        int i6 = iArr[c2];
                        int i7 = iArr[c3];
                        int[] iArr2 = new int[2];
                        frameLayout.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i6 - iArr2[c2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i7 - iArr2[c3]) - view6.getTop());
                        frameLayout.getOverlay().add(view6);
                    }
                    C0109e c0109e3 = AbstractC0859w.f3492a;
                    c0109e3.getClass();
                    ObjectAnimator objectAnimatorM2243J2 = m2243J(view6, m2241K(c0857u, 1.0f), 0.0f);
                    if (objectAnimatorM2243J2 == null) {
                        c0109e3.mo466p(view6, m2241K(c0857u2, 1.0f));
                    }
                    if (!z4) {
                        if (objectAnimatorM2243J2 == null) {
                            frameLayout.getOverlay().remove(view6);
                            return objectAnimatorM2243J2;
                        }
                        view5.setTag(R.id.resc, view6);
                        C0835F c0835f = new C0835F(this, frameLayout, view6, view5);
                        objectAnimatorM2243J2.addListener(c0835f);
                        objectAnimatorM2243J2.addPauseListener(c0835f);
                        m2256o().m2250a(c0835f);
                    }
                    return objectAnimatorM2243J2;
                }
            } else if ((i4 & 1) == 1 && c0857u2 != null) {
                View view8 = c0857u2.f3490b;
                if (c0857u == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC0859w.f3492a.getClass();
                return m2243J(view8, m2241K(c0857u, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: q */
    public final String[] mo2239q() {
        return f3440B;
    }

    @Override // p073k0.AbstractC0849m
    /* JADX INFO: renamed from: s */
    public final boolean mo2244s(C0857u c0857u, C0857u c0857u2) {
        if (c0857u == null && c0857u2 == null) {
            return false;
        }
        if (c0857u != null && c0857u2 != null && c0857u2.f3489a.containsKey("android:visibility:visibility") != c0857u.f3489a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0836G c0836gM2242L = m2242L(c0857u, c0857u2);
        if (c0836gM2242L.f3411a) {
            return c0836gM2242L.f3413c == 0 || c0836gM2242L.f3414d == 0;
        }
        return false;
    }

    public C0844h() {
        this.f3441A = 3;
    }
}

package p074l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0496j;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p011G.C0097f;
import p011G.InterfaceC0096e;
import p024N.C0270l;
import p046Y.C0411b;
import p046Y.C0414e;
import p046Y.C0417h;
import p046Y.C0418i;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.E */
/* JADX INFO: loaded from: classes.dex */
public class C0871E {

    /* JADX INFO: renamed from: d */
    public static final int[] f3526d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3527a = 2;

    /* JADX INFO: renamed from: b */
    public View f3528b;

    /* JADX INFO: renamed from: c */
    public Object f3529c;

    public /* synthetic */ C0871E() {
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m2278a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0048n) ((C0001b) this.f3529c).f1b).getClass();
        if (keyListener instanceof C0414e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0414e(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public void mo2279b(AttributeSet attributeSet, int i2) {
        switch (this.f3527a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f3528b;
                C0270l c0270lM838m = C0270l.m838m(absSeekBar.getContext(), attributeSet, f3526d, i2);
                Drawable drawableM846i = c0270lM838m.m846i(0);
                if (drawableM846i != null) {
                    if (drawableM846i instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM846i;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableM2282e = m2282e(animationDrawable.getFrame(i3), true);
                            drawableM2282e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM2282e, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM846i = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM846i);
                }
                Drawable drawableM846i2 = c0270lM838m.m846i(1);
                if (drawableM846i2 != null) {
                    absSeekBar.setProgressDrawable(m2282e(drawableM846i2, false));
                }
                c0270lM838m.m851o();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f3528b).getContext().obtainStyledAttributes(attributeSet, AbstractC0641a.f2488i, i2, 0);
                try {
                    boolean z2 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z2 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m2281d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public C0411b m2280c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0001b c0001b = (C0001b) this.f3529c;
        if (inputConnection == null) {
            c0001b.getClass();
            inputConnection = null;
        } else {
            C0048n c0048n = (C0048n) c0001b.f1b;
            c0048n.getClass();
            if (!(inputConnection instanceof C0411b)) {
                inputConnection = new C0411b((EditText) c0048n.f174b, inputConnection, editorInfo);
            }
        }
        return (C0411b) inputConnection;
    }

    /* JADX INFO: renamed from: d */
    public void m2281d(boolean z2) {
        C0418i c0418i = (C0418i) ((C0048n) ((C0001b) this.f3529c).f1b).f175c;
        if (c0418i.f1132c != z2) {
            if (c0418i.f1131b != null) {
                C0496j c0496jM1303a = C0496j.m1303a();
                C0417h c0417h = c0418i.f1131b;
                c0496jM1303a.getClass();
                AbstractC0016e.m180j(c0417h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0496jM1303a.f1521a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0496jM1303a.f1522b.remove(c0417h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0418i.f1132c = z2;
            if (z2) {
                C0418i.m1134a(c0418i.f1130a, C0496j.m1303a().m1304b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public Drawable m2282e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0096e) {
            C0097f c0097f = (C0097f) ((InterfaceC0096e) drawable);
            Drawable drawable2 = c0097f.f293f;
            if (drawable2 != null) {
                c0097f.m444h(m2282e(drawable2, z2));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m2282e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    if (Build.VERSION.SDK_INT >= 23) {
                        AbstractC0869D.m2277a(layerDrawable, layerDrawable2, i3);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f3529c) == null) {
                    this.f3529c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0871E(AbsSeekBar absSeekBar) {
        this.f3528b = absSeekBar;
    }

    public C0871E(EditText editText) {
        this.f3528b = editText;
        this.f3529c = new C0001b(editText);
    }
}

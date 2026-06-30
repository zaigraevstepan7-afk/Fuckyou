package p001A0;

import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0529T;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p000A.AbstractC0000a;
import p003B0.C0019a;
import p004C.AbstractC0028i;
import p004C.AbstractC0029j;
import p006D.AbstractC0052b;
import p007E.AbstractC0057c;
import p007E.AbstractC0065k;
import p007E.AbstractC0071q;
import p007E.C0061g;
import p007E.C0066l;
import p007E.C0067m;
import p009F.C0079f;
import p011G.AbstractC0092a;
import p011G.AbstractC0093b;
import p011G.C0097f;
import p011G.InterfaceC0095d;
import p011G.InterfaceC0096e;
import p015I0.C0108d;
import p015I0.C0109e;
import p015I0.C0111g;
import p015I0.C0112h;
import p015I0.C0115k;
import p015I0.C0127w;
import p018K.C0155k;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0239Q;
import p024N.C0270l;
import p024N.InterfaceC0251b0;
import p024N.InterfaceC0268k;
import p028P.AbstractC0323a;
import p036T.AbstractC0373c;
import p036T.AbstractC0374d;
import p036T.AbstractC0375e;
import p036T.AbstractC0383m;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0016e implements InterfaceC0251b0 {

    /* JADX INFO: renamed from: a */
    public static Method f28a;

    /* JADX INFO: renamed from: b */
    public static boolean f29b;

    /* JADX INFO: renamed from: c */
    public static Method f30c;

    /* JADX INFO: renamed from: d */
    public static boolean f31d;

    /* JADX INFO: renamed from: e */
    public static boolean f32e;

    /* JADX INFO: renamed from: f */
    public static Method f33f;

    /* JADX INFO: renamed from: g */
    public static boolean f34g;

    /* JADX INFO: renamed from: h */
    public static Field f35h;

    /* JADX INFO: renamed from: i */
    public static Field f36i;

    /* JADX INFO: renamed from: j */
    public static boolean f37j;

    public AbstractC0016e() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static Drawable m152A(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z2) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = m154B0(drawable).mutate();
        if (mode != null) {
            AbstractC0092a.m430i(drawableMutate, mode);
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: B */
    public static C0079f[] m153B(C0079f[] c0079fArr) {
        C0079f[] c0079fArr2 = new C0079f[c0079fArr.length];
        for (int i2 = 0; i2 < c0079fArr.length; i2++) {
            c0079fArr2[i2] = new C0079f(c0079fArr[i2]);
        }
        return c0079fArr2;
    }

    /* JADX INFO: renamed from: B0 */
    public static Drawable m154B0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof InterfaceC0095d)) {
            return drawable;
        }
        C0097f c0097f = new C0097f();
        c0097f.f291d = c0097f.m439c();
        c0097f.m444h(drawable);
        C0097f.m437a();
        return c0097f;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m155C(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0239Q.f773d;
        C0239Q c0239q = (C0239Q) view.getTag(R.id.resc);
        WeakReference weakReference = null;
        if (c0239q == null) {
            c0239q = new C0239Q();
            c0239q.f774a = null;
            c0239q.f775b = null;
            c0239q.f776c = null;
            view.setTag(R.id.resc, c0239q);
        }
        WeakReference weakReference2 = c0239q.f776c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0239q.f776c = new WeakReference(keyEvent);
        if (c0239q.f775b == null) {
            c0239q.f775b = new SparseArray();
        }
        SparseArray sparseArray = c0239q.f775b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.resc)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m156D(InterfaceC0268k interfaceC0268k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0268k != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0268k.mo246e(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f32e) {
                            try {
                                f33f = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f32e = true;
                        }
                        Method method = f33f;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC0240S.m771b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f34g) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f35h = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f34g = true;
                }
                Field field = f35h;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC0240S.m771b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC0240S.m771b(view, keyEvent)) || interfaceC0268k.mo246e(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static Drawable m157F(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0373c.m1007a(compoundButton);
        }
        if (!f37j) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f36i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f37j = true;
        }
        Field field = f36i;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f36i = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static int[] m158G(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 16842912) {
                return iArr;
            }
            if (i3 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i2] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: H */
    public static int m159H(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC0052b.m317a(context, i2) : context.getResources().getColor(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.f210c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m160I(Context context, int i2) {
        ColorStateList colorStateListM339a;
        ColorStateList colorStateList;
        C0066l c0066l;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0067m c0067m = new C0067m(resources, theme);
        synchronized (AbstractC0071q.f221c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0071q.f220b.get(c0067m);
                colorStateListM339a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0066l = (C0066l) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (c0066l.f209b.equals(resources.getConfiguration())) {
                        if (theme != null || c0066l.f210c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c0066l.f208a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0071q.f219a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListM339a = AbstractC0057c.m339a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListM339a == null) {
            return Build.VERSION.SDK_INT >= 23 ? AbstractC0065k.m347b(resources, i2, theme) : resources.getColorStateList(i2);
        }
        AbstractC0071q.m349a(c0067m, i2, colorStateListM339a, theme);
        return colorStateListM339a;
    }

    /* JADX INFO: renamed from: J */
    public static ColorStateList m161J(Context context, C0270l c0270l, int i2) {
        int resourceId;
        ColorStateList colorStateListM160I;
        TypedArray typedArray = (TypedArray) c0270l.f837b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM160I = m160I(context, resourceId)) == null) ? c0270l.m844g(i2) : colorStateListM160I;
    }

    /* JADX INFO: renamed from: K */
    public static ColorStateList m162K(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListM160I;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM160I = m160I(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM160I;
    }

    /* JADX INFO: renamed from: L */
    public static ColorStateList m163L(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0000a.m22s(drawable)) {
            return null;
        }
        return AbstractC0000a.m5b(AbstractC0000a.m7d(drawable));
    }

    /* JADX INFO: renamed from: N */
    public static float m164N(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0375e.m1010b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: O */
    public static Drawable m165O(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableM1057w;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableM1057w = AbstractC0383m.m1057w(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableM1057w;
    }

    /* JADX INFO: renamed from: R */
    public static int m166R(AbstractList abstractList) {
        AbstractC0451c.m1146e(abstractList, "<this>");
        return abstractList.size() - 1;
    }

    /* JADX INFO: renamed from: S */
    public static int m167S(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0093b.m431a(drawable);
        }
        if (!f31d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f30c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f31d = true;
        }
        Method method = f30c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f30c = null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: T */
    public static float m168T(String[] strArr, int i2) {
        float f = Float.parseFloat(strArr[i2]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: Z */
    public static File m169Z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static int m170a0(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0529T.m1416e("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m171b0(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m172d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = m154B0(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0092a.m429h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC0092a.m429h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0092a.m430i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m173d0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m174e0(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m175f0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m176g(C0079f[] c0079fArr, C0079f[] c0079fArr2) {
        if (c0079fArr == null || c0079fArr2 == null || c0079fArr.length != c0079fArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < c0079fArr.length; i2++) {
            C0079f c0079f = c0079fArr[i2];
            char c2 = c0079f.f243a;
            C0079f c0079f2 = c0079fArr2[i2];
            if (c2 != c0079f2.f243a || c0079f.f244b.length != c0079f2.f244b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m177h(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m178i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Typeface m179i0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, m183l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: j */
    public static void m180j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static MappedByteBuffer m181j0(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m182k(Context context, String str) {
        int iM243a;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            int i2 = Build.VERSION.SDK_INT;
            String strM242d = i2 >= 23 ? AbstractC0028i.m242d(str) : null;
            if (strM242d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                int iM241c = 1;
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    if (i2 >= 29) {
                        AppOpsManager appOpsManagerM245c = AbstractC0029j.m245c(context);
                        iM243a = AbstractC0029j.m243a(appOpsManagerM245c, strM242d, Binder.getCallingUid(), packageName);
                        if (iM243a == 0) {
                            iM243a = AbstractC0029j.m243a(appOpsManagerM245c, strM242d, iMyUid, AbstractC0029j.m244b(context));
                        }
                        if (iM243a == 0) {
                            return -2;
                        }
                    } else if (i2 >= 23) {
                        iM241c = AbstractC0028i.m241c((AppOpsManager) AbstractC0028i.m239a(context, AppOpsManager.class), strM242d, packageName);
                    }
                } else if (i2 >= 23) {
                    iM241c = AbstractC0028i.m241c((AppOpsManager) AbstractC0028i.m239a(context, AppOpsManager.class), strM242d, packageName);
                }
                iM243a = iM241c;
                if (iM243a == 0) {
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m183l(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static void m184m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m184m(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC0096e) {
            m184m(((C0097f) ((InterfaceC0096e) drawable)).f293f);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Drawable child = drawableContainerState.getChild(i2);
            if (child != null) {
                m184m(child);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static float m185m0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0375e.m1011c(edgeEffect, f, f2);
        }
        AbstractC0374d.m1008a(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: renamed from: n */
    public static void m186n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m187n0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = m154B0(drawable).mutate();
        AbstractC0092a.m429h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: o */
    public static Drawable m188o(Drawable drawable, Drawable drawable2, int i2, int i3) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        boolean z2 = (i2 == -1 || i3 == -1) ? false : true;
        if (i2 == -1 && (i2 = drawable2.getIntrinsicWidth()) == -1) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == -1 && (i3 = drawable2.getIntrinsicHeight()) == -1) {
            i3 = drawable.getIntrinsicHeight();
        }
        if (i2 > drawable.getIntrinsicWidth() || i3 > drawable.getIntrinsicHeight()) {
            float f = i2 / i3;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i3 = (int) (intrinsicWidth / f);
                i2 = intrinsicWidth;
            } else {
                i3 = drawable.getIntrinsicHeight();
                i2 = (int) (f * i3);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
            layerDrawable.setLayerSize(1, i2, i3);
            layerDrawable.setLayerGravity(1, 17);
            return layerDrawable;
        }
        if (z2) {
            drawable2 = new C0017f(drawable2, i2, i3);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int iMax = Math.max((drawable.getIntrinsicWidth() - i2) / 2, 0);
        int iMax2 = Math.max((drawable.getIntrinsicHeight() - i3) / 2, 0);
        layerDrawable2.setLayerInset(1, iMax, iMax2, iMax, iMax2);
        return layerDrawable2;
    }

    /* JADX INFO: renamed from: o0 */
    public static TypedValue m189o0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static ImageView.ScaleType m190p(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m191p0(Context context, int i2, boolean z2) {
        TypedValue typedValueM189o0 = m189o0(context, i2);
        return (typedValueM189o0 == null || typedValueM189o0.type != 18) ? z2 : typedValueM189o0.data != 0;
    }

    /* JADX INFO: renamed from: q */
    public static float[] m192q(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: q0 */
    public static int m193q0(Context context, int i2, int i3) {
        TypedValue typedValueM189o0 = m189o0(context, i2);
        return (typedValueM189o0 == null || typedValueM189o0.type != 16) ? i3 : typedValueM189o0.data;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m194r(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zM196s = m196s(file, inputStreamOpenRawResource);
                m186n(inputStreamOpenRawResource);
                return zM196s;
            } catch (Throwable th) {
                th = th;
                m186n(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static TimeInterpolator m195r0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m175f0(strValueOf, "cubic-bezier") && !m175f0(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m175f0(strValueOf, "cubic-bezier")) {
            if (m175f0(strValueOf, "path")) {
                return AbstractC0323a.m982c(m204z(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return AbstractC0323a.m981b(m168T(strArrSplit, 0), m168T(strArrSplit, 1), m168T(strArrSplit, 2), m168T(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m196s(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    m186n(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m186n(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m186n(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static TypedValue m197s0(Context context, int i2, String str) {
        TypedValue typedValueM189o0 = m189o0(context, i2);
        if (typedValueM189o0 != null) {
            return typedValueM189o0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC0016e m198t(int i2) {
        return i2 != 0 ? i2 != 1 ? new C0115k() : new C0108d() : new C0115k();
    }

    /* JADX INFO: renamed from: v0 */
    public static void m199v0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m200w0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0093b.m432b(drawable, i2);
        }
        if (!f29b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f28a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f29b = true;
        }
        Method method = f28a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f28a = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m201x0(View view, C0112h c0112h) {
        C0019a c0019a = c0112h.f346a.f329b;
        if (c0019a == null || !c0019a.f46a) {
            return;
        }
        float fM707i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            fM707i += AbstractC0229G.m707i((View) parent);
        }
        C0111g c0111g = c0112h.f346a;
        if (c0111g.f339l != fM707i) {
            c0111g.f339l = fM707i;
            c0112h.m487s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0097 A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0079f[] m202y(String str) {
        int i2;
        String strTrim;
        float[] fArrM192q;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i4++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i5, i4).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i3) == 'z' || strTrim.charAt(i3) == 'Z') {
                            fArrM192q = new float[i3];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i6 = 1;
                                int i7 = 0;
                                while (i6 < length) {
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    for (int i8 = i6; i8 < strTrim.length(); i8++) {
                                        char cCharAt2 = strTrim.charAt(i8);
                                        if (cCharAt2 == ' ') {
                                            z2 = false;
                                            z4 = true;
                                            if (z4) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i8 != i6 && !z2) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        }
                                                        z2 = false;
                                                        break;
                                                    case '.':
                                                        if (z3) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        } else {
                                                            z2 = false;
                                                            z3 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z2 = false;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (z4) {
                                            }
                                        }
                                        if (i6 < i8) {
                                            fArr[i7] = Float.parseFloat(strTrim.substring(i6, i8));
                                            i7++;
                                        }
                                        i6 = !z5 ? i8 : i8 + 1;
                                    }
                                    if (i6 < i8) {
                                    }
                                    if (!z5) {
                                    }
                                }
                                fArrM192q = m192q(fArr, i7);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + strTrim + "\"", e2);
                            }
                        }
                        arrayList.add(new C0079f(strTrim.charAt(i3), fArrM192q));
                    }
                    i5 = i4;
                    i4++;
                    i3 = 0;
                }
            }
            strTrim = str.substring(i5, i4).trim();
            if (!strTrim.isEmpty()) {
            }
            i5 = i4;
            i4++;
            i3 = 0;
        }
        if (i4 - i5 != 1 || i5 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new C0079f(str.charAt(i5), new float[0]));
        }
        return (C0079f[]) arrayList.toArray(new C0079f[i2]);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m203y0(Drawable drawable, int i2) {
        AbstractC0092a.m428g(drawable, i2);
    }

    /* JADX INFO: renamed from: z */
    public static Path m204z(String str) {
        Path path = new Path();
        try {
            C0079f.m364b(m202y(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo205A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    /* JADX INFO: renamed from: E */
    public C0155k mo206E(int i2, C0155k[] c0155kArr) {
        new C0109e(1);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C0155k c0155k = null;
        int i4 = Integer.MAX_VALUE;
        for (C0155k c0155k2 : c0155kArr) {
            int iAbs = (Math.abs(c0155k2.f488c - i3) * 2) + (c0155k2.f489d == z2 ? 0 : 1);
            if (c0155k == null || i4 > iAbs) {
                c0155k = c0155k2;
                i4 = iAbs;
            }
        }
        return c0155k;
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo207M(C0127w c0127w, float f, float f2);

    /* JADX INFO: renamed from: P */
    public abstract int mo208P();

    /* JADX INFO: renamed from: Q */
    public abstract int mo209Q();

    /* JADX INFO: renamed from: U */
    public abstract int mo210U();

    /* JADX INFO: renamed from: V */
    public abstract int mo211V();

    /* JADX INFO: renamed from: W */
    public abstract int mo212W(View view);

    /* JADX INFO: renamed from: X */
    public abstract int mo213X(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: Y */
    public abstract int mo214Y();

    /* JADX INFO: renamed from: c0 */
    public abstract boolean mo217c0(float f);

    /* JADX INFO: renamed from: e */
    public abstract int mo218e(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: f */
    public abstract float mo219f(int i2);

    /* JADX INFO: renamed from: g0 */
    public abstract boolean mo220g0(View view);

    /* JADX INFO: renamed from: h0 */
    public abstract boolean mo221h0(float f, float f2);

    /* JADX INFO: renamed from: k0 */
    public abstract void mo222k0(int i2);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo223l0(Typeface typeface, boolean z2);

    /* JADX INFO: renamed from: u */
    public abstract Typeface mo225u(Context context, C0061g c0061g, Resources resources, int i2);

    /* JADX INFO: renamed from: v */
    public abstract Typeface mo227v(Context context, C0155k[] c0155kArr, int i2);

    /* JADX INFO: renamed from: w */
    public Typeface mo228w(Context context, InputStream inputStream) {
        File fileM169Z = m169Z(context);
        if (fileM169Z == null) {
            return null;
        }
        try {
            if (m196s(fileM169Z, inputStream)) {
                return Typeface.createFromFile(fileM169Z.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM169Z.delete();
        }
    }

    /* JADX INFO: renamed from: x */
    public Typeface mo229x(Context context, Resources resources, int i2, String str, int i3) {
        File fileM169Z = m169Z(context);
        if (fileM169Z == null) {
            return null;
        }
        try {
            if (m194r(fileM169Z, resources, i2)) {
                return Typeface.createFromFile(fileM169Z.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM169Z.delete();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public abstract boolean mo230z0(View view, float f);

    /* JADX INFO: renamed from: t0 */
    public void mo224t0(boolean z2) {
    }

    /* JADX INFO: renamed from: u0 */
    public void mo226u0(boolean z2) {
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: b */
    public void mo215b() {
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: c */
    public void mo216c() {
    }
}

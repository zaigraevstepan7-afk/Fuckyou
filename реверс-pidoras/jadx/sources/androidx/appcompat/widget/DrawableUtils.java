package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.WrappedDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();
    private static final String TAG = "DrawableUtils";
    private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static Class<?> sInsetsClazz;

    static {
        try {
            sInsetsClazz = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    private DrawableUtils() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Rect getOpticalBounds(Drawable drawable) {
        Object insets;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insets2 = drawable.getOpticalInsets();
            Rect result = new Rect();
            result.left = insets2.left;
            result.right = insets2.right;
            result.top = insets2.top;
            result.bottom = insets2.bottom;
            return result;
        }
        if (sInsetsClazz != null) {
            try {
                Drawable drawable2 = DrawableCompat.unwrap(drawable);
                Method getOpticalInsetsMethod = drawable2.getClass().getMethod("getOpticalInsets", new Class[0]);
                insets = getOpticalInsetsMethod.invoke(drawable2, new Object[0]);
            } catch (Exception e) {
                Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
            }
            if (insets != null) {
                Rect result2 = new Rect();
                for (Field field : sInsetsClazz.getFields()) {
                    switch (field.getName()) {
                        case "left":
                            result2.left = field.getInt(insets);
                            continue;
                            break;
                        case "top":
                            result2.top = field.getInt(insets);
                            continue;
                            break;
                        case "right":
                            result2.right = field.getInt(insets);
                            continue;
                            break;
                        case "bottom":
                            result2.bottom = field.getInt(insets);
                            continue;
                            break;
                        default:
                            continue;
                            break;
                    }
                    Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
                }
                return result2;
            }
        }
        return INSETS_NONE;
    }

    static void fixDrawable(Drawable drawable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof WrappedDrawable) {
                return canSafelyMutateDrawable(((WrappedDrawable) drawable).getWrappedDrawable());
            }
            if (drawable instanceof DrawableWrapper) {
                return canSafelyMutateDrawable(((DrawableWrapper) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return canSafelyMutateDrawable(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState state = drawable.getConstantState();
        if (state instanceof DrawableContainer.DrawableContainerState) {
            DrawableContainer.DrawableContainerState containerState = (DrawableContainer.DrawableContainerState) state;
            for (Drawable child : containerState.getChildren()) {
                if (!canSafelyMutateDrawable(child)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private static void fixVectorDrawableTinting(Drawable drawable) {
        int[] originalState = drawable.getState();
        if (originalState == null || originalState.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(originalState);
    }

    public static PorterDuff.Mode parseTintMode(int value, PorterDuff.Mode defaultMode) {
        switch (value) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }
}

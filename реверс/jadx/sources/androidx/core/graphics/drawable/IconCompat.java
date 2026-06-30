package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p011G.AbstractC0094c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1465k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f1467b;

    /* JADX INFO: renamed from: j */
    public String f1475j;

    /* JADX INFO: renamed from: a */
    public int f1466a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f1468c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f1469d = null;

    /* JADX INFO: renamed from: e */
    public int f1470e = 0;

    /* JADX INFO: renamed from: f */
    public int f1471f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1472g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1473h = f1465k;

    /* JADX INFO: renamed from: i */
    public String f1474i = null;

    public final String toString() {
        String str;
        int iIntValue;
        int i2;
        if (this.f1466a == -1) {
            return String.valueOf(this.f1467b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1466a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1466a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1467b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1467b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1475j);
                sb.append(" id=");
                int i3 = this.f1466a;
                if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = this.f1467b;
                    if (i2 >= 28) {
                        iIntValue = AbstractC0094c.m433a(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f1470e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1470e);
                if (this.f1471f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1471f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1467b);
                break;
        }
        if (this.f1472g != null) {
            sb.append(" tint=");
            sb.append(this.f1472g);
        }
        if (this.f1473h != f1465k) {
            sb.append(" mode=");
            sb.append(this.f1473h);
        }
        sb.append(")");
        return sb.toString();
    }
}

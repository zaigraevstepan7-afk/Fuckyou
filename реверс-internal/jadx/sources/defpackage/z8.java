package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z8 {
    public final XmlPullParser a;
    public int b = 0;
    public final l2 c;

    public z8(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        l2 l2Var = new l2();
        l2Var.b = new float[64];
        this.c = l2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qn a(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        qn qnVar;
        if (ef1.n(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    qnVar = qn.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    qnVar = null;
                }
                if (qnVar == null) {
                    qnVar = new qn(0, null);
                }
            } else {
                qnVar = new qn(typedValue.data, null);
            }
        }
        c(typedArray.getChangingConfigurations());
        return qnVar;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (ef1.n(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return xi0.o(this.a, z8Var.a) && this.b == z8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + ")";
    }
}

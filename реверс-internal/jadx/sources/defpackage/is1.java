package defpackage;

import androidx.core.graphics.drawable.C0046;
import androidx.core.widget.C0053;
import androidx.lifecycle.C0060;
import androidx.recyclerview.widget.C0065;
import com.google.android.material.floatingactionbutton.C0117;
import com.reddit.frontpage.C0151;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class is1 implements js1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f173short = {966, 1008, 1016, 997, 1016, 1023, 1014, 963, 1012, 994, 993, 1022, 1023, 994, 1012, 953, 1008, 997, 997, 1012, 1020, 993, 997, 940, 1224};
    public final int a;

    /* JADX INFO: renamed from: ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1920() {
        if (C0151.m1894() >= 0) {
            return f173short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is1) && C0053.m697(this) == C0053.m697((is1) obj);
    }

    public final int hashCode() {
        return C0046.m607(C0053.m697(this));
    }

    public final String toString() {
        return C0065.m848(C0053.m697(this), C0060.m783(m1920(), 0, 24, 913), C0117.m1472(m1920(), 24, 1, 1249));
    }

    public is1(int i) {
        this.a = i;
    }
}

package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: K0.f */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0164f extends View.BaseSavedState {
    public static final Parcelable.Creator<C0164f> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public float f504a;

    /* JADX INFO: renamed from: b */
    public float f505b;

    /* JADX INFO: renamed from: c */
    public ArrayList f506c;

    /* JADX INFO: renamed from: d */
    public float f507d;

    /* JADX INFO: renamed from: e */
    public boolean f508e;

    static {
        ZLoader.registerNativesForClass(17, C0164f.class);
        Hidden0.special_clinit_17_00(C0164f.class);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i2);
}

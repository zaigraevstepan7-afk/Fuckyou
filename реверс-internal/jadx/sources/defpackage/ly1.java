package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ry1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly1(ry1 ry1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = ry1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                long j = ((w01) obj).a;
                return new ly1(this.k, (ks) obj2, 0).q(t32Var);
            case 1:
                return ((ly1) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((ly1) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        ry1 ry1Var = this.k;
        switch (i) {
            case 0:
                return new ly1(ry1Var, ksVar, 0);
            case 1:
                return new ly1(ry1Var, ksVar, 1);
            default:
                return new ly1(ry1Var, ksVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        int i;
        hb hbVarO;
        yk ykVar;
        Object wkVar;
        cd0 cd0Var;
        Object hbVar;
        CharSequence text;
        int i2;
        Spanned spanned;
        Parcel parcel;
        long j;
        hb hbVar2;
        int i3 = this.i;
        cd0 cd0Var2 = cd0.e;
        wt wtVar = wt.e;
        ry1 ry1Var = this.k;
        t32 t32Var = t32.a;
        switch (i3) {
            case 0:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        xc.G(obj);
                    } else if (i4 == 2) {
                        xc.G(obj);
                    } else {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    xc.G(obj);
                    this.j = 1;
                    if (ry1Var.s(this) == wtVar) {
                    }
                }
                j41 j41VarA = ry1.a(ry1Var);
                if (j41VarA != null) {
                    String str = (String) j41VarA.e;
                    long j2 = ((wz1) j41VarA.f).a;
                    s71 s71Var = ry1Var.i;
                    if (s71Var != null) {
                        this.j = 2;
                        Object objP = (str.length() == 0 || wz1.c(j2)) ? t32Var : nu0.P(s71Var.a, new m6(s71Var, new h(j2, null, s71Var, str), (ks) null, 13), this);
                        if (objP != wtVar) {
                            objP = t32Var;
                        }
                        if (objP == wtVar) {
                        }
                    }
                }
                break;
            case 1:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    if (wz1.c(ry1Var.n().b) || !ry1Var.j()) {
                        i = 1;
                        hbVarO = null;
                    } else {
                        hbVarO = kd1.o(ry1Var.n());
                        hb hbVarQ = kd1.q(ry1Var.n(), ry1Var.n().a.f.length());
                        hb hbVarP = kd1.p(ry1Var.n(), ry1Var.n().a.f.length());
                        fb fbVar = new fb(hbVarQ);
                        fbVar.a(hbVarP);
                        hb hbVarB = fbVar.b();
                        int iF = wz1.f(ry1Var.n().b);
                        ry1Var.c.i(ry1.e(hbVarB, af1.g(iF, iF)));
                        ry1Var.q(cd0Var2);
                        i = 1;
                        ry1Var.a.e = true;
                    }
                    if (hbVarO != null && (ykVar = ry1Var.g) != null) {
                        wk wkVarR = al.R(hbVarO);
                        this.j = i;
                        ((p3) ykVar).a(wkVarR);
                        if (t32Var == wtVar) {
                        }
                    }
                }
                break;
            default:
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    yk ykVar2 = ry1Var.g;
                    if (ykVar2 != null) {
                        this.j = 1;
                        ClipData primaryClip = ((p3) ykVar2).a.t().getPrimaryClip();
                        wkVar = primaryClip != null ? new wk(primaryClip) : null;
                        if (wkVar == wtVar) {
                        }
                    }
                } else if (i6 == 1) {
                    xc.G(obj);
                    wkVar = obj;
                } else if (i6 == 2) {
                    xc.G(obj);
                    hbVar = obj;
                    cd0Var = cd0Var2;
                    hbVar2 = (hb) hbVar;
                    if (hbVar2 != null && ry1Var.j()) {
                        fb fbVar2 = new fb(kd1.q(ry1Var.n(), ry1Var.n().a.f.length()));
                        fbVar2.a(hbVar2);
                        hb hbVarB2 = fbVar2.b();
                        hb hbVarP2 = kd1.p(ry1Var.n(), ry1Var.n().a.f.length());
                        fb fbVar3 = new fb(hbVarB2);
                        fbVar3.a(hbVarP2);
                        hb hbVarB3 = fbVar3.b();
                        int length = hbVar2.f.length() + wz1.f(ry1Var.n().b);
                        ry1Var.c.i(ry1.e(hbVarB3, af1.g(length, length)));
                        ry1Var.q(cd0Var);
                        ry1Var.a.e = true;
                    }
                } else {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                }
                wk wkVar2 = (wk) wkVar;
                if (wkVar2 != null) {
                    this.j = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = wkVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        cd0Var = cd0Var2;
                        hbVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                if (xi0.o(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    long j3 = vl.g;
                                    long j4 = j3;
                                    long jY = g02.c;
                                    long jY2 = jY;
                                    aa0 aa0Var = null;
                                    y90 y90Var = null;
                                    z90 z90Var = null;
                                    String string = null;
                                    df dfVar = null;
                                    dz1 dz1Var = null;
                                    ax1 ax1Var = null;
                                    um1 um1Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() <= 1) {
                                            i2 = i7;
                                        } else {
                                            byte b = parcelObtain.readByte();
                                            i2 = i7;
                                            if (b != 1) {
                                                cd0Var = cd0Var2;
                                                if (b == 2) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b2 = parcelObtain.readByte();
                                                        if (b2 == 1) {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 4294967296L;
                                                        } else if (b2 == 2) {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 8589934592L;
                                                        } else {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 0;
                                                        }
                                                        jY = h02.a(j, 0L) ? g02.c : uc1.y(parcel.readFloat(), j);
                                                    }
                                                    break;
                                                } else {
                                                    parcel = parcelObtain;
                                                    spanned = spanned2;
                                                    if (b == 3) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            aa0Var = new aa0(parcel.readInt());
                                                            cd0Var2 = cd0Var;
                                                            parcelObtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (b == 4) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte b3 = parcel.readByte();
                                                            y90 y90Var2 = new y90((b3 != 0 && b3 == 1) ? 1 : i2);
                                                            i7 = i2;
                                                            y90Var = y90Var2;
                                                            cd0Var2 = cd0Var;
                                                            parcelObtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (b == 5) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte b4 = parcel.readByte();
                                                            if (b4 != 0) {
                                                                int i9 = b4 == 1 ? 65535 : b4 == 3 ? 2 : b4 == 2 ? 1 : i2;
                                                                z90 z90Var2 = new z90(i9);
                                                                i7 = i2;
                                                                z90Var = z90Var2;
                                                                cd0Var2 = cd0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        }
                                                    } else if (b == 6) {
                                                        string = parcel.readString();
                                                    } else {
                                                        if (b == 7) {
                                                            if (parcel.dataAvail() >= 5) {
                                                                byte b5 = parcel.readByte();
                                                                long j5 = b5 == 1 ? 4294967296L : b5 == 2 ? 8589934592L : 0L;
                                                                jY2 = h02.a(j5, 0L) ? g02.c : uc1.y(parcel.readFloat(), j5);
                                                            }
                                                        } else if (b == 8) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                i7 = i2;
                                                                dfVar = new df(parcel.readFloat());
                                                                cd0Var2 = cd0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        } else if (b == 9) {
                                                            if (parcel.dataAvail() >= 8) {
                                                                dz1Var = new dz1(parcel.readFloat(), parcel.readFloat());
                                                                cd0Var2 = cd0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        } else if (b == 10) {
                                                            if (parcel.dataAvail() >= 8) {
                                                                int i10 = vl.h;
                                                                long j6 = parcel.readLong();
                                                                long j7 = j6 & 63;
                                                                if (j7 >= 16) {
                                                                    j6 = (j6 & (-64)) | (j7 + 1);
                                                                }
                                                                j4 = j6;
                                                            }
                                                        } else if (b == 11) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                int i11 = parcel.readInt();
                                                                int i12 = (i11 & 2) != 0 ? 1 : i2;
                                                                int i13 = (i11 & 1) != 0 ? 1 : i2;
                                                                ax1 ax1Var2 = ax1.d;
                                                                ax1 ax1Var3 = ax1.c;
                                                                if (i12 == 0 || i13 == 0) {
                                                                    ax1Var = i12 != 0 ? ax1Var2 : i13 != 0 ? ax1Var3 : ax1.b;
                                                                } else {
                                                                    List listH = hk.H(ax1Var2, ax1Var3);
                                                                    Integer numValueOf = Integer.valueOf(i2);
                                                                    int size = listH.size();
                                                                    for (int i14 = i2; i14 < size; i14++) {
                                                                        numValueOf = Integer.valueOf(numValueOf.intValue() | ((ax1) listH.get(i14)).a);
                                                                    }
                                                                    ax1Var = new ax1(numValueOf.intValue());
                                                                }
                                                            }
                                                        } else if (b == 12) {
                                                            if (parcel.dataAvail() >= 20) {
                                                                int i15 = vl.h;
                                                                long j8 = parcel.readLong();
                                                                long j9 = j8 & 63;
                                                                if (j9 >= 16) {
                                                                    j8 = (j8 & (-64)) | (j9 + 1);
                                                                }
                                                                long j10 = j8;
                                                                i7 = i2;
                                                                cd0Var2 = cd0Var;
                                                                parcelObtain = parcel;
                                                                um1Var = new um1(parcel.readFloat(), j10, (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L));
                                                                spanned2 = spanned;
                                                            }
                                                        }
                                                        hbVar2 = (hb) hbVar;
                                                        if (hbVar2 != null) {
                                                            fb fbVar22 = new fb(kd1.q(ry1Var.n(), ry1Var.n().a.f.length()));
                                                            fbVar22.a(hbVar2);
                                                            hb hbVarB22 = fbVar22.b();
                                                            hb hbVarP22 = kd1.p(ry1Var.n(), ry1Var.n().a.f.length());
                                                            fb fbVar32 = new fb(hbVarB22);
                                                            fbVar32.a(hbVarP22);
                                                            hb hbVarB32 = fbVar32.b();
                                                            int length3 = hbVar2.f.length() + wz1.f(ry1Var.n().b);
                                                            ry1Var.c.i(ry1.e(hbVarB32, af1.g(length3, length3)));
                                                            ry1Var.q(cd0Var);
                                                            ry1Var.a.e = true;
                                                        }
                                                    }
                                                }
                                                i7 = i2;
                                                cd0Var2 = cd0Var;
                                                parcelObtain = parcel;
                                                spanned2 = spanned;
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i16 = vl.h;
                                                long j11 = parcelObtain.readLong();
                                                long j12 = j11 & 63;
                                                j3 = j12 < 16 ? j11 : (j11 & (-64)) | (j12 + 1);
                                            }
                                            i7 = i2;
                                        }
                                        break;
                                    }
                                    arrayList.add(new gb(spanStart, spanEnd, new zq1(j3, jY, aa0Var, y90Var, z90Var, null, string, jY2, dfVar, dz1Var, null, j4, ax1Var, um1Var, 49152)));
                                } else {
                                    i2 = i7;
                                    cd0Var = cd0Var2;
                                    spanned = spanned2;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    i7 = i2;
                                    cd0Var2 = cd0Var;
                                    spanned2 = spanned;
                                }
                            }
                        } else {
                            cd0Var = cd0Var2;
                        }
                        String string2 = text.toString();
                        hb hbVar3 = ib.a;
                        hbVar = new hb(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        hbVar = new hb(text.toString());
                        cd0Var = cd0Var2;
                    }
                    if (hbVar == wtVar) {
                    }
                    hbVar2 = (hb) hbVar;
                    if (hbVar2 != null) {
                    }
                }
                break;
        }
        return t32Var;
    }
}

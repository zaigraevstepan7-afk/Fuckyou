package com.google.android.material.sidesheet;

import android.content.Context;
import android.text.C0013;
import android.view.View;
import androidx.appcompat.widget.C0030;
import androidx.core.app.C0037;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0125;
import com.google.android.material.snackbar.C0135;
import defpackage.bm;
import defpackage.eu;
import defpackage.jo;
import defpackage.jt;
import defpackage.ju0;
import defpackage.kt;
import defpackage.lt;
import defpackage.pv;
import defpackage.tq;
import defpackage.uf;
import defpackage.v20;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.ۣۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0133 {

    /* JADX INFO: renamed from: ۡۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int f139 = 767;

    /* JADX INFO: renamed from: ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1671(Object obj) {
        if (C0125.m1584() <= 0) {
            return ((tq) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static jt m1672(Object obj, Object obj2) {
        if (C0037.m496() < 0) {
            return ((lt) obj).l((kt) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1673() {
        if (C0030.m397() > 0) {
            return eu.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static uf m1674() {
        if (C0122.m1542() < 0) {
            return v20.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۡ, reason: not valid java name and contains not printable characters */
    public static jo m1676() {
        if (C0091.m1182() > 0) {
            return pv.l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Float m1677(float f) {
        if (C0101.m1291() < 0) {
            return Float.valueOf(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1678(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Context m1679(Object obj) {
        if (C0013.m174() < 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦ۟, reason: contains not printable characters */
    public static bm m1680(Object obj) {
        if (C0135.m1701() > 0) {
            return ((ju0) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m1681() {
        return 189 ^ C0098.f104;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1682(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1675(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}

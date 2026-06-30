package com.google.android.material.floatingactionbutton;

import android.text.C0013;
import androidx.appcompat.app.C0028;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0120;
import com.google.android.material.sidesheet.C0134;
import defpackage.al;
import defpackage.bm;
import defpackage.ha0;
import defpackage.iq;
import defpackage.jo;
import defpackage.ob0;
import defpackage.pl;
import defpackage.qz;
import defpackage.tc;
import defpackage.tv0;
import defpackage.xm0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.۟ۥۦۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0115 {

    /* JADX INFO: renamed from: ۧۦ, reason: not valid java name and contains not printable characters */
    public static int f121 = 42;

    /* JADX INFO: renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1452(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static xm0 m1453(Object obj) {
        if (C0103.m1322() < 0) {
            return ((xm0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1454(Object obj) {
        if (C0013.m174() < 0) {
            return ((tc) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static int m1456() {
        return (-551) ^ C0134.f140;
    }

    /* JADX INFO: renamed from: ۡۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1457(Object obj) {
        if (C0120.m1522() > 0) {
            return ((qz) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1458(Object obj, Object obj2) {
        if (C0093.m1203() >= 0) {
            return pl.l0((Collection) obj, (List) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۢ, reason: contains not printable characters */
    public static long m1459(Object obj) {
        if (C0079.m1016() <= 0) {
            return ((bm) obj).G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m1460(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m1461(Object obj, int i, int i2, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i3) {
        if (C0028.m368() <= 0) {
            al.a((iq) obj, i, i2, (ha0) obj2, (ha0) obj3, (ha0) obj4, (ha0) obj5, (jo) obj6, (tv0) obj7, (ob0) obj8, i3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1455(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}

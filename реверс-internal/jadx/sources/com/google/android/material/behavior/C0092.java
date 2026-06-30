package com.google.android.material.behavior;

import android.text.C0010;
import android.text.C0013;
import androidx.core.widget.C0051;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0076;
import com.google.android.material.bottomappbar.C0100;
import defpackage.hm;
import defpackage.kq;
import defpackage.lt;
import defpackage.tv0;
import defpackage.v41;
import defpackage.vw0;
import defpackage.wq;
import defpackage.xc;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.material.behavior.۠ۤۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0092 {

    /* JADX INFO: renamed from: ۟۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static int f98 = -180;

    /* JADX INFO: renamed from: ۟۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1191(Object obj) {
        if (C0076.m975() <= 0) {
            return ((kq) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static tv0 m1192(Object obj) {
        if (C0013.m174() <= 0) {
            return ((wq) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1194() {
        return (-616) ^ C0091.f97;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1195(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static hm m1196() {
        if (C0062.m818() <= 0) {
            return hm.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m1197(Object obj, int i) {
        if (C0089.m1150() > 0) {
            return ((vw0) obj).d(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1198(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static v41 m1199(Object obj) {
        if (C0010.m137() < 0) {
            return xc.B(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static lt m1200(Object obj, Object obj2) {
        if (C0100.m1278() >= 0) {
            return ((lt) obj).j((lt) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m1201(Object obj, Object obj2, Object obj3) {
        if (C0051.m670() >= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1193(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}

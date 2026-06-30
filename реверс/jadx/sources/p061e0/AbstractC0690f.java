package p061e0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.AbstractC0529T;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p015I0.C0109e;

/* JADX INFO: renamed from: e0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0690f {

    /* JADX INFO: renamed from: a */
    public static final C0109e f2752a = new C0109e(18);

    /* JADX INFO: renamed from: b */
    public static final byte[] f2753b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f2754c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f2755d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f2756e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f2757f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f2758g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f2759h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f2760i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f2761j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m1922a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1923b(C0687c[] c0687cArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (C0687c c0687c : c0687cArr) {
            length += ((((c0687c.f2749g * 2) + 7) & (-8)) / 8) + (c0687c.f2747e * 2) + m1925d(c0687c.f2743a, c0687c.f2744b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0687c.f2748f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f2757f)) {
            int length2 = c0687cArr.length;
            while (i2 < length2) {
                C0687c c0687c2 = c0687cArr[i2];
                m1938q(byteArrayOutputStream, c0687c2, m1925d(c0687c2.f2743a, c0687c2.f2744b, bArr));
                m1937p(byteArrayOutputStream, c0687c2);
                i2++;
            }
        } else {
            for (C0687c c0687c3 : c0687cArr) {
                m1938q(byteArrayOutputStream, c0687c3, m1925d(c0687c3.f2743a, c0687c3.f2744b, bArr));
            }
            int length3 = c0687cArr.length;
            while (i2 < length3) {
                m1937p(byteArrayOutputStream, c0687cArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1924c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m1924c(file2) && z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: d */
    public static String m1925d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f2759h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2758g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: e */
    public static void m1926e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m1927f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(AbstractC0529T.m1416e("Not enough bytes to read: ", i2));
            }
            i3 += i4;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m1928g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM1934m = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM1934m += (int) m1934m(byteArrayInputStream, 2);
            iArr[i3] = iM1934m;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m1929h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0687c[] m1930i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0687c[] c0687cArr) throws IOException {
        byte[] bArr3 = f2760i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2761j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1934m = (int) m1934m(fileInputStream, 2);
            byte[] bArrM1929h = m1929h(fileInputStream, (int) m1934m(fileInputStream, 4), (int) m1934m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1929h);
            try {
                C0687c[] c0687cArrM1932k = m1932k(byteArrayInputStream, bArr2, iM1934m, c0687cArr);
                byteArrayInputStream.close();
                return c0687cArrM1932k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2755d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1934m2 = (int) m1934m(fileInputStream, 1);
        byte[] bArrM1929h2 = m1929h(fileInputStream, (int) m1934m(fileInputStream, 4), (int) m1934m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1929h2);
        try {
            C0687c[] c0687cArrM1931j = m1931j(byteArrayInputStream2, iM1934m2, c0687cArr);
            byteArrayInputStream2.close();
            return c0687cArrM1931j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C0687c[] m1931j(ByteArrayInputStream byteArrayInputStream, int i2, C0687c[] c0687cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0687c[0];
        }
        if (i2 != c0687cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM1934m = (int) m1934m(byteArrayInputStream, 2);
            iArr[i3] = (int) m1934m(byteArrayInputStream, 2);
            strArr[i3] = new String(m1927f(byteArrayInputStream, iM1934m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0687c c0687c = c0687cArr[i4];
            if (!c0687c.f2744b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0687c.f2747e = i5;
            c0687c.f2750h = m1928g(byteArrayInputStream, i5);
        }
        return c0687cArr;
    }

    /* JADX INFO: renamed from: k */
    public static C0687c[] m1932k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0687c[] c0687cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0687c[0];
        }
        if (i2 != c0687cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m1934m(byteArrayInputStream, 2);
            String str = new String(m1927f(byteArrayInputStream, (int) m1934m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1934m = m1934m(byteArrayInputStream, 4);
            int iM1934m = (int) m1934m(byteArrayInputStream, 2);
            C0687c c0687c = null;
            if (c0687cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0687cArr.length) {
                        break;
                    }
                    if (c0687cArr[i4].f2744b.equals(strSubstring)) {
                        c0687c = c0687cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0687c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0687c.f2746d = jM1934m;
            int[] iArrM1928g = m1928g(byteArrayInputStream, iM1934m);
            if (Arrays.equals(bArr, f2759h)) {
                c0687c.f2747e = iM1934m;
                c0687c.f2750h = iArrM1928g;
            }
        }
        return c0687cArr;
    }

    /* JADX INFO: renamed from: l */
    public static C0687c[] m1933l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f2756e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1934m = (int) m1934m(fileInputStream, 1);
        byte[] bArrM1929h = m1929h(fileInputStream, (int) m1934m(fileInputStream, 4), (int) m1934m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1929h);
        try {
            C0687c[] c0687cArrM1935n = m1935n(byteArrayInputStream, str, iM1934m);
            byteArrayInputStream.close();
            return c0687cArrM1935n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m1934m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrM1927f = m1927f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrM1927f[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    /* JADX INFO: renamed from: n */
    public static C0687c[] m1935n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0687c[0];
        }
        C0687c[] c0687cArr = new C0687c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM1934m = (int) m1934m(byteArrayInputStream, 2);
            int iM1934m2 = (int) m1934m(byteArrayInputStream, 2);
            c0687cArr[i3] = new C0687c(str, new String(m1927f(byteArrayInputStream, iM1934m), StandardCharsets.UTF_8), m1934m(byteArrayInputStream, 4), iM1934m2, (int) m1934m(byteArrayInputStream, 4), (int) m1934m(byteArrayInputStream, 4), new int[iM1934m2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0687c c0687c = c0687cArr[i4];
            int iAvailable = byteArrayInputStream.available() - c0687c.f2748f;
            int iM1934m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0687c.f2751i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM1934m3 += (int) m1934m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1934m3), 1);
                for (int iM1934m4 = (int) m1934m(byteArrayInputStream, 2); iM1934m4 > 0; iM1934m4--) {
                    m1934m(byteArrayInputStream, 2);
                    int iM1934m5 = (int) m1934m(byteArrayInputStream, 1);
                    if (iM1934m5 != 6 && iM1934m5 != 7) {
                        while (iM1934m5 > 0) {
                            m1934m(byteArrayInputStream, 1);
                            for (int iM1934m6 = (int) m1934m(byteArrayInputStream, 1); iM1934m6 > 0; iM1934m6--) {
                                m1934m(byteArrayInputStream, 2);
                            }
                            iM1934m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0687c.f2750h = m1928g(byteArrayInputStream, c0687c.f2747e);
            int i5 = c0687c.f2749g;
            BitSet bitSetValueOf = BitSet.valueOf(m1927f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0687cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public static boolean m1936o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0687c[] c0687cArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2755d;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2756e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM1923b = m1923b(c0687cArr, bArr3);
                m1942u(byteArrayOutputStream, c0687cArr.length, 1);
                m1942u(byteArrayOutputStream, bArrM1923b.length, 4);
                byte[] bArrM1922a = m1922a(bArrM1923b);
                m1942u(byteArrayOutputStream, bArrM1922a.length, 4);
                byteArrayOutputStream.write(bArrM1922a);
                return true;
            }
            byte[] bArr4 = f2758g;
            if (Arrays.equals(bArr, bArr4)) {
                m1942u(byteArrayOutputStream, c0687cArr.length, 1);
                for (C0687c c0687c : c0687cArr) {
                    int size = c0687c.f2751i.size() * 4;
                    String strM1925d = m1925d(c0687c.f2743a, c0687c.f2744b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m1943v(byteArrayOutputStream, strM1925d.getBytes(charset).length);
                    m1943v(byteArrayOutputStream, c0687c.f2750h.length);
                    m1942u(byteArrayOutputStream, size, 4);
                    m1942u(byteArrayOutputStream, c0687c.f2745c, 4);
                    byteArrayOutputStream.write(strM1925d.getBytes(charset));
                    Iterator it = c0687c.f2751i.keySet().iterator();
                    while (it.hasNext()) {
                        m1943v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m1943v(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c0687c.f2750h) {
                        m1943v(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2757f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM1923b2 = m1923b(c0687cArr, bArr5);
                m1942u(byteArrayOutputStream, c0687cArr.length, 1);
                m1942u(byteArrayOutputStream, bArrM1923b2.length, 4);
                byte[] bArrM1922a2 = m1922a(bArrM1923b2);
                m1942u(byteArrayOutputStream, bArrM1922a2.length, 4);
                byteArrayOutputStream.write(bArrM1922a2);
                return true;
            }
            byte[] bArr6 = f2759h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m1943v(byteArrayOutputStream, c0687cArr.length);
            for (C0687c c0687c2 : c0687cArr) {
                String strM1925d2 = m1925d(c0687c2.f2743a, c0687c2.f2744b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m1943v(byteArrayOutputStream, strM1925d2.getBytes(charset2).length);
                TreeMap treeMap = c0687c2.f2751i;
                m1943v(byteArrayOutputStream, treeMap.size());
                m1943v(byteArrayOutputStream, c0687c2.f2750h.length);
                m1942u(byteArrayOutputStream, c0687c2.f2745c, 4);
                byteArrayOutputStream.write(strM1925d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m1943v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c0687c2.f2750h) {
                    m1943v(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m1943v(byteArrayOutputStream2, c0687cArr.length);
            int i4 = 2;
            for (C0687c c0687c3 : c0687cArr) {
                m1942u(byteArrayOutputStream2, c0687c3.f2745c, 4);
                m1942u(byteArrayOutputStream2, c0687c3.f2746d, 4);
                m1942u(byteArrayOutputStream2, c0687c3.f2749g, 4);
                String strM1925d3 = m1925d(c0687c3.f2743a, c0687c3.f2744b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM1925d3.getBytes(charset3).length;
                m1943v(byteArrayOutputStream2, length2);
                i4 = i4 + 14 + length2;
                byteArrayOutputStream2.write(strM1925d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i4 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            }
            C0695k c0695k = new C0695k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0695k);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i5 = 0;
            for (int i6 = 0; i6 < c0687cArr.length; i6++) {
                try {
                    C0687c c0687c4 = c0687cArr[i6];
                    m1943v(byteArrayOutputStream3, i6);
                    m1943v(byteArrayOutputStream3, c0687c4.f2747e);
                    i5 = i5 + 4 + (c0687c4.f2747e * 2);
                    int[] iArr = c0687c4.f2750h;
                    int length3 = iArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length3) {
                        int i9 = iArr[i7];
                        m1943v(byteArrayOutputStream3, i9 - i8);
                        i7++;
                        i8 = i9;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i5 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
            }
            C0695k c0695k2 = new C0695k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0695k2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c0687cArr.length) {
                try {
                    C0687c c0687c5 = c0687cArr[i10];
                    Iterator it3 = c0687c5.f2751i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m1939r(byteArrayOutputStream4, iIntValue, c0687c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m1940s(byteArrayOutputStream4, c0687c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m1943v(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m1942u(byteArrayOutputStream3, length4, 4);
                            m1943v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i12 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            C0695k c0695k3 = new C0695k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0695k3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
            m1942u(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                C0695k c0695k4 = (C0695k) arrayList2.get(i13);
                int i14 = c0695k4.f2771a;
                if (i14 == 1) {
                    j2 = 0;
                } else if (i14 == 2) {
                    j2 = 1;
                } else if (i14 == 3) {
                    j2 = 2;
                } else if (i14 == 4) {
                    j2 = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m1942u(byteArrayOutputStream, j2, 4);
                m1942u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0695k4.f2772b;
                if (c0695k4.f2773c) {
                    long length5 = bArr7.length;
                    byte[] bArrM1922a3 = m1922a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM1922a3);
                    m1942u(byteArrayOutputStream, bArrM1922a3.length, 4);
                    m1942u(byteArrayOutputStream, length5, 4);
                    length = bArrM1922a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m1942u(byteArrayOutputStream, bArr7.length, 4);
                    m1942u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m1937p(ByteArrayOutputStream byteArrayOutputStream, C0687c c0687c) throws IOException {
        m1940s(byteArrayOutputStream, c0687c);
        int[] iArr = c0687c.f2750h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            m1943v(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        int i5 = c0687c.f2749g;
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0687c.f2751i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i5;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: q */
    public static void m1938q(ByteArrayOutputStream byteArrayOutputStream, C0687c c0687c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m1943v(byteArrayOutputStream, str.getBytes(charset).length);
        m1943v(byteArrayOutputStream, c0687c.f2747e);
        m1942u(byteArrayOutputStream, c0687c.f2748f, 4);
        m1942u(byteArrayOutputStream, c0687c.f2745c, 4);
        m1942u(byteArrayOutputStream, c0687c.f2749g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: r */
    public static void m1939r(ByteArrayOutputStream byteArrayOutputStream, int i2, C0687c c0687c) throws IOException {
        int iBitCount = Integer.bitCount(i2 & (-2));
        int i3 = c0687c.f2749g;
        byte[] bArr = new byte[(((iBitCount * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0687c.f2751i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m1940s(ByteArrayOutputStream byteArrayOutputStream, C0687c c0687c) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c0687c.f2751i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m1943v(byteArrayOutputStream, iIntValue - i2);
                m1943v(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1941t(Context context, Executor executor, InterfaceC0689e interfaceC0689e, boolean z2) {
        FileInputStream fileInputStreamM1920a;
        C0687c[] c0687cArrM1933l;
        C0687c[] c0687cArr;
        C0687c[] c0687cArr2;
        byte[] bArr;
        boolean z3;
        Throwable th;
        Throwable th2;
        boolean z4;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C0686b c0686b;
        FileInputStream fileInputStreamM1920a2;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC0689e.mo50o(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC0694j.m1949c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0686b c0686b2 = new C0686b(assets, executor, interfaceC0689e, name, file2);
            byte[] bArr3 = c0686b2.f2737c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c0686b2.m1921b(4, null);
                    }
                    c0686b2.f2740f = true;
                    byte[] bArr4 = f2753b;
                    try {
                        fileInputStreamM1920a = c0686b2.m1920a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0689e.mo50o(6, e2);
                        fileInputStreamM1920a = null;
                    } catch (IOException e3) {
                        interfaceC0689e.mo50o(7, e3);
                        fileInputStreamM1920a = null;
                    }
                    try {
                        try {
                        } catch (IOException e4) {
                            interfaceC0689e.mo50o(7, e4);
                        }
                        if (fileInputStreamM1920a != null) {
                            try {
                                try {
                                } catch (IllegalStateException e5) {
                                    interfaceC0689e.mo50o(8, e5);
                                    fileInputStreamM1920a.close();
                                    c0687cArrM1933l = null;
                                    c0686b2.f2741g = c0687cArrM1933l;
                                    c0687cArr = c0686b2.f2741g;
                                    if (c0687cArr != null) {
                                    }
                                    InterfaceC0689e interfaceC0689e2 = c0686b2.f2736b;
                                    c0687cArr2 = c0686b2.f2741g;
                                    if (c0687cArr2 != null) {
                                    }
                                    bArr = c0686b2.f2742h;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    AbstractC0694j.m1949c(context, !z4 && z2);
                                }
                            } catch (IOException e6) {
                                interfaceC0689e.mo50o(7, e6);
                                fileInputStreamM1920a.close();
                                c0687cArrM1933l = null;
                                c0686b2.f2741g = c0687cArrM1933l;
                                c0687cArr = c0686b2.f2741g;
                                if (c0687cArr != null) {
                                }
                                InterfaceC0689e interfaceC0689e22 = c0686b2.f2736b;
                                c0687cArr2 = c0686b2.f2741g;
                                if (c0687cArr2 != null) {
                                }
                                bArr = c0686b2.f2742h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                AbstractC0694j.m1949c(context, !z4 && z2);
                            }
                            if (!Arrays.equals(bArr4, m1927f(fileInputStreamM1920a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0687cArrM1933l = m1933l(fileInputStreamM1920a, m1927f(fileInputStreamM1920a, 4), c0686b2.f2739e);
                            try {
                                fileInputStreamM1920a.close();
                            } catch (IOException e7) {
                                interfaceC0689e.mo50o(7, e7);
                            }
                            c0686b2.f2741g = c0687cArrM1933l;
                        }
                        c0687cArr = c0686b2.f2741g;
                        if (c0687cArr != null && (i2 = Build.VERSION.SDK_INT) >= 24 && (i2 >= 31 || i2 == 24 || i2 == 25)) {
                            try {
                                fileInputStreamM1920a2 = c0686b2.m1920a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e8) {
                                interfaceC0689e.mo50o(9, e8);
                            } catch (IOException e9) {
                                interfaceC0689e.mo50o(7, e9);
                            } catch (IllegalStateException e10) {
                                c0686b2.f2741g = null;
                                interfaceC0689e.mo50o(8, e10);
                            }
                            if (fileInputStreamM1920a2 == null) {
                                try {
                                    if (!Arrays.equals(f2754c, m1927f(fileInputStreamM1920a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0686b2.f2741g = m1930i(fileInputStreamM1920a2, m1927f(fileInputStreamM1920a2, 4), bArr3, c0687cArr);
                                    fileInputStreamM1920a2.close();
                                    c0686b = c0686b2;
                                    if (c0686b != null) {
                                        c0686b2 = c0686b;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM1920a2 != null) {
                                    fileInputStreamM1920a2.close();
                                }
                                c0686b = null;
                                if (c0686b != null) {
                                }
                            }
                        }
                        InterfaceC0689e interfaceC0689e222 = c0686b2.f2736b;
                        c0687cArr2 = c0686b2.f2741g;
                        if (c0687cArr2 != null && (bArr2 = c0686b2.f2737c) != null) {
                            if (c0686b2.f2740f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e11) {
                                interfaceC0689e222.mo50o(7, e11);
                            } catch (IllegalStateException e12) {
                                interfaceC0689e222.mo50o(8, e12);
                            }
                            if (m1936o(byteArrayOutputStream, bArr2, c0687cArr2)) {
                                c0686b2.f2742h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c0686b2.f2741g = null;
                            } else {
                                interfaceC0689e222.mo50o(5, null);
                                c0686b2.f2741g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c0686b2.f2742h;
                        if (bArr != null) {
                            z3 = false;
                        } else {
                            try {
                                if (!c0686b2.f2740f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c0686b2.f2738d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i3 = byteArrayInputStream.read(bArr5);
                                                                                    if (i3 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i3);
                                                                                    }
                                                                                }
                                                                                c0686b2.m1921b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0686b2.f2742h = null;
                                                                                c0686b2.f2741g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th9) {
                                                                        th2.addSuppressed(th9);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        c0686b2.m1921b(6, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        AbstractC0694j.m1949c(context, !z4 && z2);
                                    } catch (IOException e14) {
                                        e = e14;
                                        c0686b2.m1921b(7, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        AbstractC0694j.m1949c(context, !z4 && z2);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    c0686b2.m1921b(6, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    AbstractC0694j.m1949c(context, !z4 && z2);
                                } catch (IOException e16) {
                                    e = e16;
                                    c0686b2.m1921b(7, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    AbstractC0694j.m1949c(context, !z4 && z2);
                                }
                            } finally {
                                c0686b2.f2742h = null;
                                c0686b2.f2741g = null;
                            }
                        }
                        if (z3) {
                            m1926e(packageInfo, filesDir);
                        }
                        z4 = z3;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c0686b2.m1921b(4, null);
                        }
                        c0686b2.f2740f = true;
                        byte[] bArr42 = f2753b;
                        fileInputStreamM1920a = c0686b2.m1920a(assets, "dexopt/baseline.prof");
                        if (fileInputStreamM1920a != null) {
                        }
                        c0687cArr = c0686b2.f2741g;
                        if (c0687cArr != null) {
                            fileInputStreamM1920a2 = c0686b2.m1920a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM1920a2 == null) {
                            }
                        }
                        InterfaceC0689e interfaceC0689e2222 = c0686b2.f2736b;
                        c0687cArr2 = c0686b2.f2741g;
                        if (c0687cArr2 != null) {
                            if (c0686b2.f2740f) {
                            }
                        }
                        bArr = c0686b2.f2742h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                    } catch (IOException unused2) {
                        c0686b2.m1921b(4, null);
                    }
                }
                AbstractC0694j.m1949c(context, !z4 && z2);
            }
            c0686b2.m1921b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z4 = false;
            AbstractC0694j.m1949c(context, !z4 && z2);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0689e.mo50o(7, e17);
            AbstractC0694j.m1949c(context, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1942u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m1943v(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        m1942u(byteArrayOutputStream, i2, 2);
    }
}

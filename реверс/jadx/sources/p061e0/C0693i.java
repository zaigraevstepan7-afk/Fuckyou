package p061e0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: e0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0693i {

    /* JADX INFO: renamed from: a */
    public final int f2764a;

    /* JADX INFO: renamed from: b */
    public final int f2765b;

    /* JADX INFO: renamed from: c */
    public final long f2766c;

    /* JADX INFO: renamed from: d */
    public final long f2767d;

    public C0693i(int i2, int i3, long j2, long j3) {
        this.f2764a = i2;
        this.f2765b = i3;
        this.f2766c = j2;
        this.f2767d = j3;
    }

    /* JADX INFO: renamed from: a */
    public static C0693i m1945a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0693i c0693i = new C0693i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0693i;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1946b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2764a);
            dataOutputStream.writeInt(this.f2765b);
            dataOutputStream.writeLong(this.f2766c);
            dataOutputStream.writeLong(this.f2767d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0693i)) {
            C0693i c0693i = (C0693i) obj;
            if (this.f2765b == c0693i.f2765b && this.f2766c == c0693i.f2766c && this.f2764a == c0693i.f2764a && this.f2767d == c0693i.f2767d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2765b), Long.valueOf(this.f2766c), Integer.valueOf(this.f2764a), Long.valueOf(this.f2767d));
    }
}

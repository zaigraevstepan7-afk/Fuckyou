package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class fj0 extends IOException {
    public boolean e;

    public static fj0 a() {
        return new fj0("Protocol message had invalid UTF-8.");
    }

    public static ej0 b() {
        return new ej0("Protocol message tag had invalid wire type.");
    }

    public static fj0 c() {
        return new fj0("CodedInputStream encountered a malformed varint.");
    }

    public static fj0 d() {
        return new fj0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static fj0 e() {
        return new fj0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

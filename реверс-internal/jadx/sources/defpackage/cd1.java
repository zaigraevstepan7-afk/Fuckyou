package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cd1 implements Serializable {
    public final Pattern e;

    public cd1(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.e = patternCompile;
    }

    public final String toString() {
        String string = this.e.toString();
        string.getClass();
        return string;
    }
}

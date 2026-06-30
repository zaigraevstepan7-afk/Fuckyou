package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jb {
    public static final jb e;
    public static final jb f;
    public static final jb g;
    public static final jb h;
    public static final jb i;
    public static final jb j;
    public static final jb k;
    public static final /* synthetic */ jb[] l;

    static {
        jb jbVar = new jb("Paragraph", 0);
        e = jbVar;
        jb jbVar2 = new jb("Span", 1);
        f = jbVar2;
        jb jbVar3 = new jb("VerbatimTts", 2);
        g = jbVar3;
        jb jbVar4 = new jb("Url", 3);
        h = jbVar4;
        jb jbVar5 = new jb("Link", 4);
        i = jbVar5;
        jb jbVar6 = new jb("Clickable", 5);
        j = jbVar6;
        jb jbVar7 = new jb("String", 6);
        k = jbVar7;
        l = new jb[]{jbVar, jbVar2, jbVar3, jbVar4, jbVar5, jbVar6, jbVar7};
    }

    public static jb valueOf(String str) {
        return (jb) Enum.valueOf(jb.class, str);
    }

    public static jb[] values() {
        return (jb[]) l.clone();
    }
}

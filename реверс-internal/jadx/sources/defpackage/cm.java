package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public static final cm e;
    public static final cm f;
    public static final cm g;
    public static final cm h;
    public static final cm i;
    public static final cm j;
    public static final cm k;
    public static final cm l;
    public static final cm m;
    public static final cm n;
    public static final cm o;
    public static final cm p;
    public static final cm q;
    public static final cm r;
    public static final /* synthetic */ cm[] s;

    /* JADX INFO: Fake field, exist only in values array */
    cm EF1;

    static {
        cm cmVar = new cm("Background", 0);
        cm cmVar2 = new cm("Error", 1);
        e = cmVar2;
        cm cmVar3 = new cm("ErrorContainer", 2);
        cm cmVar4 = new cm("InverseOnSurface", 3);
        cm cmVar5 = new cm("InversePrimary", 4);
        cm cmVar6 = new cm("InverseSurface", 5);
        cm cmVar7 = new cm("OnBackground", 6);
        cm cmVar8 = new cm("OnError", 7);
        cm cmVar9 = new cm("OnErrorContainer", 8);
        cm cmVar10 = new cm("OnPrimary", 9);
        f = cmVar10;
        cm cmVar11 = new cm("OnPrimaryContainer", 10);
        g = cmVar11;
        cm cmVar12 = new cm("OnPrimaryFixed", 11);
        cm cmVar13 = new cm("OnPrimaryFixedVariant", 12);
        cm cmVar14 = new cm("OnSecondary", 13);
        cm cmVar15 = new cm("OnSecondaryContainer", 14);
        h = cmVar15;
        cm cmVar16 = new cm("OnSecondaryFixed", 15);
        cm cmVar17 = new cm("OnSecondaryFixedVariant", 16);
        cm cmVar18 = new cm("OnSurface", 17);
        i = cmVar18;
        cm cmVar19 = new cm("OnSurfaceVariant", 18);
        j = cmVar19;
        cm cmVar20 = new cm("OnTertiary", 19);
        cm cmVar21 = new cm("OnTertiaryContainer", 20);
        k = cmVar21;
        cm cmVar22 = new cm("OnTertiaryFixed", 21);
        cm cmVar23 = new cm("OnTertiaryFixedVariant", 22);
        cm cmVar24 = new cm("Outline", 23);
        l = cmVar24;
        cm cmVar25 = new cm("OutlineVariant", 24);
        cm cmVar26 = new cm("Primary", 25);
        m = cmVar26;
        cm cmVar27 = new cm("PrimaryContainer", 26);
        n = cmVar27;
        cm cmVar28 = new cm("PrimaryFixed", 27);
        cm cmVar29 = new cm("PrimaryFixedDim", 28);
        cm cmVar30 = new cm("Scrim", 29);
        cm cmVar31 = new cm("Secondary", 30);
        cm cmVar32 = new cm("SecondaryContainer", 31);
        o = cmVar32;
        cm cmVar33 = new cm("SecondaryFixed", 32);
        cm cmVar34 = new cm("SecondaryFixedDim", 33);
        cm cmVar35 = new cm("Surface", 34);
        p = cmVar35;
        cm cmVar36 = new cm("SurfaceBright", 35);
        cm cmVar37 = new cm("SurfaceContainer", 36);
        cm cmVar38 = new cm("SurfaceContainerHigh", 37);
        cm cmVar39 = new cm("SurfaceContainerHighest", 38);
        q = cmVar39;
        cm cmVar40 = new cm("SurfaceContainerLow", 39);
        cm cmVar41 = new cm("SurfaceContainerLowest", 40);
        cm cmVar42 = new cm("SurfaceDim", 41);
        cm cmVar43 = new cm("SurfaceTint", 42);
        cm cmVar44 = new cm("SurfaceVariant", 43);
        cm cmVar45 = new cm("Tertiary", 44);
        cm cmVar46 = new cm("TertiaryContainer", 45);
        r = cmVar46;
        s = new cm[]{cmVar, cmVar2, cmVar3, cmVar4, cmVar5, cmVar6, cmVar7, cmVar8, cmVar9, cmVar10, cmVar11, cmVar12, cmVar13, cmVar14, cmVar15, cmVar16, cmVar17, cmVar18, cmVar19, cmVar20, cmVar21, cmVar22, cmVar23, cmVar24, cmVar25, cmVar26, cmVar27, cmVar28, cmVar29, cmVar30, cmVar31, cmVar32, cmVar33, cmVar34, cmVar35, cmVar36, cmVar37, cmVar38, cmVar39, cmVar40, cmVar41, cmVar42, cmVar43, cmVar44, cmVar45, cmVar46, new cm("TertiaryFixed", 46), new cm("TertiaryFixedDim", 47)};
    }

    public static cm valueOf(String str) {
        return (cm) Enum.valueOf(cm.class, str);
    }

    public static cm[] values() {
        return (cm[]) s.clone();
    }
}

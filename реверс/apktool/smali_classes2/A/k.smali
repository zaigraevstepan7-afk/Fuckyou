.class public final LA/k;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements LJ/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    const-class v1, LA/k;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_10_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eq p1, v0, :cond_0

    new-instance p1, LM/c;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, LM/c;-><init>(I)V

    iput-object p1, p0, LA/k;->a:Ljava/lang/Object;

    new-instance p1, Lq/j;

    invoke-direct {p1, v1}, Lq/j;-><init>(I)V

    iput-object p1, p0, LA/k;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA/k;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LA/k;->d:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Lq/f;

    invoke-direct {p1, v1}, Lq/f;-><init>(I)V

    iput-object p1, p0, LA/k;->a:Ljava/lang/Object;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LA/k;->b:Ljava/lang/Object;

    new-instance p1, Lq/h;

    invoke-direct {p1}, Lq/h;-><init>()V

    iput-object p1, p0, LA/k;->c:Ljava/lang/Object;

    new-instance p1, Lq/f;

    invoke-direct {p1, v1}, Lq/f;-><init>(I)V

    iput-object p1, p0, LA/k;->d:Ljava/lang/Object;

    return-void

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA/k;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LA/k;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LA/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/k;->d:Ljava/lang/Object;

    iput-object p2, p0, LA/k;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA/k;->c:Ljava/lang/Object;

    new-instance p1, Lq/j;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lq/j;-><init>(I)V

    iput-object p1, p0, LA/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;LX/b;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/k;->d:Ljava/lang/Object;

    iput-object p2, p0, LA/k;->a:Ljava/lang/Object;

    new-instance p1, Landroidx/emoji2/text/r;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/r;-><init>(I)V

    iput-object p1, p0, LA/k;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    invoke-static {p2, p1}, LU/۟ۦ۠ۨۨ;->ۢۦۥ۠(Ljava/lang/Object;I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p2}, LI0/۟ۡۤۤ۟;->۟ۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    invoke-static {p2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-static {v2, v0}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {p2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    add-int/2addr v2, v0

    invoke-static {v3, v2}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    iput-object v0, p0, LA/k;->b:Ljava/lang/Object;

    invoke-static {p2, p1}, LU/۟ۦ۠ۨۨ;->ۢۦۥ۠(Ljava/lang/Object;I)I

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p2}, LI0/۟ۡۤۤ۟;->۟ۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr p1, v0

    invoke-static {p2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0, p1}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {p2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/nio/ByteBuffer;

    add-int/2addr v0, p1

    invoke-static {p2, v0}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    const/4 p2, 0x0

    :goto_2
    if-ge p2, p1, :cond_6

    new-instance v0, Landroidx/emoji2/text/u;

    invoke-direct {v0, p0, p2}, Landroidx/emoji2/text/u;-><init>(LA/k;I)V

    invoke-static {v0}, Lw0/ۨ۟ۥۥ;->۟ۡۡ۟ۧ(Ljava/lang/Object;)LX/a;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v2, v3}, LU/۟ۦ۠ۨۨ;->ۢۦۥ۠(Ljava/lang/Object;I)I

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    invoke-static {v2}, LI0/۟ۡۤۤ۟;->۟ۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v3, v2

    invoke-static {v4, v3}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v2

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_3
    invoke-static {p0}, LN/ۨۤۧۢ;->۠ۢۡۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ll0/ۤ۟ۨۧ;->۟ۦ۠۠ۥ(ILjava/lang/Object;I)I

    invoke-static {v0}, Lw0/ۨ۟ۥۥ;->۟ۡۡ۟ۧ(Ljava/lang/Object;)LX/a;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, LU/۟ۦ۠ۨۨ;->ۢۦۥ۠(Ljava/lang/Object;I)I

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v2}, LI0/۟ۡۤۤ۟;->۟ۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-static {v5, v4}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    add-int/2addr v5, v4

    invoke-static {v2, v5}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v2

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_5

    :cond_4
    const/4 v2, 0x0

    :goto_5
    invoke-static {}, LA/k;->ۦۡۧۡ()[S

    move-result-object v5

    const/16 v6, 0x21

    const/16 v7, 0x567

    invoke-static {v5, v1, v6, v7}, Lm0/ۣ۟ۧۦ۠;->۟۟ۤۢۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۡۡۢۡ(ZLjava/lang/Object;)V

    invoke-static {v0}, Lw0/ۨ۟ۥۥ;->۟ۡۡ۟ۧ(Ljava/lang/Object;)LX/a;

    move-result-object v2

    invoke-static {v2, v3}, LU/۟ۦ۠ۨۨ;->ۢۦۥ۠(Ljava/lang/Object;I)I

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v2}, LI0/۟ۡۤۤ۟;->۟ۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v3, v5

    invoke-static {v2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-static {v5, v3}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v2}, LX0/ۤۤ۠ۡ;->۟۟ۤۨۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    add-int/2addr v5, v3

    invoke-static {v2, v5}, LC/ۣ۟ۦۨ;->ۨ۠ۡ(Ljava/lang/Object;I)I

    move-result v2

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    :goto_6
    invoke-static {p0}, LP0/۟ۨۧۡ;->۟ۥۢۧۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/emoji2/text/r;

    sub-int/2addr v2, v4

    invoke-static {v3, v0, v1, v2}, Lk/۟ۢۡۢۨ;->ۥۢۦۨ(Ljava/lang/Object;Ljava/lang/Object;II)V

    add-int/lit8 p2, p2, 0x1

    goto/16 :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/f;Landroidx/fragment/app/S;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/k;->a:Ljava/lang/Object;

    iput-object p2, p0, LA/k;->b:Ljava/lang/Object;

    iput-object p3, p0, LA/k;->c:Ljava/lang/Object;

    iput-object p4, p0, LA/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public static native ۦۡۧۡ()[S
.end method


# virtual methods
.method public native a(Landroidx/fragment/app/r;)V
.end method

.method public native b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
.end method

.method public native c(Ljava/lang/String;)Landroidx/fragment/app/r;
.end method

.method public native d(Ljava/lang/String;)Landroidx/fragment/app/r;
.end method

.method public native e(Lj/a;)Lj/e;
.end method

.method public native f()Ljava/util/ArrayList;
.end method

.method public native g()Ljava/util/ArrayList;
.end method

.method public native h()Ljava/util/List;
.end method

.method public native i(Landroidx/fragment/app/M;)V
.end method

.method public native j(Landroidx/fragment/app/M;)V
.end method

.method public native k(Lj/a;Landroid/view/MenuItem;)Z
.end method

.method public native l(Lj/a;Lk/m;)Z
.end method

.method public native r()V
.end method

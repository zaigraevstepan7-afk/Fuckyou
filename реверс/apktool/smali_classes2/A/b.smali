.class public LA/b;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements LN/r;
.implements LN/c;
.implements LN/e;
.implements LN/h;
.implements Landroidx/emoji2/text/i;
.implements Landroidx/emoji2/text/n;
.implements LJ/a;
.implements Le0/e;
.implements Ll/L0;
.implements Lk/x;
.implements Lk/k;
.implements Ll/b0;
.implements LO/u;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    const-class v1, LA/b;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_1_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LA/b;->a:I

    const/4 v0, 0x7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LO/ۦۢ۠ۢ;->ۧۤۢۡ()I

    move-result p1

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_1

    new-instance p1, LO/m;

    invoke-direct {p1, p0}, LO/m;-><init>(LA/b;)V

    goto :goto_0

    :cond_1
    new-instance p1, LO/l;

    invoke-direct {p1, p0}, LO/l;-><init>(LA/b;)V

    :goto_0
    iput-object p1, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LA/b;->a:I

    iput-object p2, p0, LA/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2}, Lk0/۠ۧۢۥ;->۟۟ۢ۠(Ljava/lang/Object;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La1/۟ۦۡۥۡ;->۟ۤۤۢۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LO/ۦۢ۠ۢ;->ۧۤۢۡ()I

    move-result v0

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    new-instance v0, LS/f;

    invoke-direct {v0, p1, p2, p3}, LS/f;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    new-instance v0, LN/l;

    invoke-direct {v0, p1, p2, p3}, LN/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iput-object v0, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟۟ۥۦۣ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {p1}, La0/ۣ۟ۤۥۦ;->۟۟۠۟۟(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lk0/۠ۧۢۥ;->ۨۤۦۧ(Ljava/lang/Object;)Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LC0/n;

    invoke-direct {v0, p1}, LC0/n;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LA/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LY/g;

    invoke-direct {v0, p1}, LY/g;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LA/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public static native ۟۠ۦ۟()[S
.end method


# virtual methods
.method public native A(I)V
.end method

.method public native B(I)V
.end method

.method public native C(I)LO/k;
.end method

.method public native D(I)LO/k;
.end method

.method public native E()V
.end method

.method public native F(IILandroid/os/Bundle;)Z
.end method

.method public native a(Landroid/os/Bundle;)V
.end method

.method public native b(Lk/m;Z)V
.end method

.method public native c(Ljava/lang/CharSequence;IILandroidx/emoji2/text/u;)Z
.end method

.method public native d(I)V
.end method

.method public native e(Landroid/net/Uri;)V
.end method

.method public native f()I
.end method

.method public native g(Lk/m;Lk/o;)V
.end method

.method public native h(Lk/m;)Z
.end method

.method public native i(F)Z
.end method

.method public native j(LT/m;)V
.end method

.method public native k()Ljava/lang/Object;
.end method

.method public native l()Landroid/content/ClipData;
.end method

.method public native m(Landroid/view/View;)Z
.end method

.method public native n()LN/f;
.end method

.method public native o(ILjava/io/Serializable;)V
.end method

.method public native p(Landroid/view/View;LN/x0;)LN/x0;
.end method

.method public native q()F
.end method

.method public native r()V
.end method

.method public native s()I
.end method

.method public native t(IF)V
.end method

.method public native toString()Ljava/lang/String;
.end method

.method public native u()V
.end method

.method public native v(Lk/m;)V
.end method

.method public native w(Lk/m;Landroid/view/MenuItem;)Z
.end method

.method public native x()V
.end method

.method public native y()Landroid/view/ContentInfo;
.end method

.method public native z(Lk/m;Lk/o;)V
.end method

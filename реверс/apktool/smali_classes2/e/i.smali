.class public final Le/i;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Lh0/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x6a

    const-class v1, Le/i;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_106_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/i;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh0/d;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Le/i;->a:I

    invoke-static {}, Le/i;->ۣۧۢ۠()[S

    move-result-object v0

    const/16 v1, 0x850

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-static {v0, v2, v3, v1}, Lx0/ۣ۟ۥ۟ۧ;->ۣۧۡۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lm0/ۣ۟ۧۦ۠;->۟۟ۤۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Le/i;->b:Ljava/lang/Object;

    invoke-static {}, Le/i;->ۣۧۢ۠()[S

    move-result-object v0

    const/16 v1, 0x1d

    const/16 v2, 0xc61

    invoke-static {v0, v3, v1, v2}, Lq/۟ۢۥۨۡ;->ۥ۟ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0}, Lh0/۟۠ۤۡۦ;->۟ۤۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static native ۣۧۢ۠()[S
.end method


# virtual methods
.method public final native a()Landroid/os/Bundle;
.end method

.class public final Le/z;
.super Landroidx/fragment/app/g;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final c:I

.field public final d:Le/D;

.field public final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x78

    const-class v1, Le/z;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_120_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/D;LN/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le/z;->c:I

    iput-object p1, p0, Le/z;->d:Le/D;

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;-><init>(Le/D;)V

    iput-object p2, p0, Le/z;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le/D;Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Le/z;->c:I

    iput-object p1, p0, Le/z;->d:Le/D;

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;-><init>(Le/D;)V

    invoke-static {p2}, La1/۟ۦۡۥۡ;->۟ۤۤۢۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Le/z;->۠ۥۢ()[S

    move-result-object p2

    const/4 v1, 0x5

    const/16 v2, 0x4c1

    invoke-static {p2, v0, v1, v2}, Lx/۟۟ۦۣ۠;->ۣۧۨ۟([SIII)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, LU/۟ۦ۠ۨۨ;->ۣ۟ۤۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Le/z;->e:Ljava/lang/Object;

    return-void
.end method

.method public static native ۠ۥۢ()[S
.end method


# virtual methods
.method public final native e()Landroid/content/IntentFilter;
.end method

.method public final native f()I
.end method

.method public final native h()V
.end method

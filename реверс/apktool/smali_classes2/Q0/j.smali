.class public final LQ0/j;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x3f

    const-class v1, LQ0/j;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_63_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ0/j;->a:I

    if-eq p3, v0, :cond_1

    if-nez p2, :cond_0

    invoke-static {}, LW/۟ۡۤۡ;->۟ۥۨۦۤ()Ljava/lang/String;

    move-result-object p2

    :cond_0
    iput-object p2, p0, LQ0/j;->b:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p2, p0, LQ0/j;->b:Ljava/lang/String;

    return-void
.end method

.class public final Le/J;
.super Ljava/lang/Object;
.source "Dex2C"


# static fields
.field public static d:Le/J;


# instance fields
.field public a:J

.field public b:J

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x5d

    const-class v1, Le/J;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_93_00(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final native a(JDD)V
.end method

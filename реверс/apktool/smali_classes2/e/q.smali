.class public final Le/q;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x70

    const-class v1, Le/q;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_112_00(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final native execute(Ljava/lang/Runnable;)V
.end method

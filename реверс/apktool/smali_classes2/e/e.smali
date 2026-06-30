.class public final Le/e;
.super Landroid/os/Handler;
.source "Dex2C"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x66

    const-class v1, Le/e;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_102_00(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final native handleMessage(Landroid/os/Message;)V
.end method

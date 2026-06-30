.class public abstract Le/n;
.super Ljava/lang/Object;
.source "Dex2C"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x6d

    const-class v1, Le/n;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_109_00(Ljava/lang/Class;)V

    return-void
.end method

.method public static native a(Ljava/lang/String;)Landroid/os/LocaleList;
.end method

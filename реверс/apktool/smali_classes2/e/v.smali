.class public abstract Le/v;
.super Ljava/lang/Object;
.source "Dex2C"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x74

    const-class v1, Le/v;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_116_00(Ljava/lang/Class;)V

    return-void
.end method

.method public static native a(Landroid/os/PowerManager;)Z
.end method

.method public static native b(Ljava/util/Locale;)Ljava/lang/String;
.end method

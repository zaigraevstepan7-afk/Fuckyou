.class public abstract Le/x;
.super Ljava/lang/Object;
.source "Dex2C"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x76

    const-class v1, Le/x;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_118_00(Ljava/lang/Class;)V

    return-void
.end method

.method public static native a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
.end method

.method public static native b(Ljava/lang/Object;Le/D;)Landroid/window/OnBackInvokedCallback;
.end method

.method public static native c(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

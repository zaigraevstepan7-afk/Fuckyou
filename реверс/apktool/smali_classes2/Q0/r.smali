.class public final synthetic LQ0/r;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x47

    const-class v1, LQ0/r;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_71_00(Ljava/lang/Class;)V

    return-void
.end method

.method public static native ۡۢۡ۠()[S
.end method


# virtual methods
.method public final native verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
.end method

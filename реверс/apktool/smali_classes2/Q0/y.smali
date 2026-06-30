.class public final LQ0/y;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x4e

    const-class v1, LQ0/y;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_78_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0/y;->a:Ljavax/net/ssl/X509TrustManager;

    return-void
.end method

.method public static native ۡ۠۠ۥ()[S
.end method


# virtual methods
.method public final native checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
.end method

.method public final native checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
.end method

.method public final native getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
.end method

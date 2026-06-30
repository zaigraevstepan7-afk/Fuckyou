.class public final synthetic LM0/l;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroidx/activity/result/b;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x27

    const-class v1, LM0/l;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_39_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LM0/l;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۟۟ۨۢ۠()[S
.end method


# virtual methods
.method public native a(Ljava/lang/Object;)V
.end method

.method public native b(LA/b;ILandroid/os/Bundle;)Z
.end method

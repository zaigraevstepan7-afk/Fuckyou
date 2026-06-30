.class public final LM0/h;
.super LI0/h;
.source "Dex2C"


# static fields
.field public static final y:I


# instance fields
.field public x:LM0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x23

    const-class v1, LM0/h;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_35_00(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final native f(Landroid/graphics/Canvas;)V
.end method

.method public final native mutate()Landroid/graphics/drawable/Drawable;
.end method

.method public final native t(FFFF)V
.end method

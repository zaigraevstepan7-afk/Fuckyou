.class public final LK0/d;
.super LW/b;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final q:Lcom/google/android/material/slider/Slider;

.field public final r:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xf

    const-class v1, LK0/d;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_15_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/slider/Slider;)V
    .locals 1

    invoke-direct {p0, p1}, LW/b;-><init>(Landroid/view/View;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LK0/d;->r:Landroid/graphics/Rect;

    iput-object p1, p0, LK0/d;->q:Lcom/google/android/material/slider/Slider;

    return-void
.end method

.method public static native ۟ۢۡ۟ۦ()[S
.end method

.method public static native ۦۡ۠ۦ(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native n(FF)I
.end method

.method public final native o(Ljava/util/ArrayList;)V
.end method

.method public final native s(IILandroid/os/Bundle;)Z
.end method

.method public final native u(ILO/k;)V
.end method

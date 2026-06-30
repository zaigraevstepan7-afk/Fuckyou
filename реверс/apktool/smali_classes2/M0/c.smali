.class public final synthetic LM0/c;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final a:I

.field public final b:LM0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1d

    const-class v1, LM0/c;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_29_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/e;I)V
    .locals 0

    iput p2, p0, LM0/c;->a:I

    iput-object p1, p0, LM0/c;->b:LM0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onAnimationUpdate(Landroid/animation/ValueAnimator;)V
.end method

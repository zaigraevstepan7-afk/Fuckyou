.class public final LM0/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "Dex2C"


# instance fields
.field public final a:I

.field public final b:LM0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1e

    const-class v1, LM0/d;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_30_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/e;I)V
    .locals 0

    iput p2, p0, LM0/d;->a:I

    iput-object p1, p0, LM0/d;->b:LM0/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public native onAnimationEnd(Landroid/animation/Animator;)V
.end method

.method public native onAnimationStart(Landroid/animation/Animator;)V
.end method

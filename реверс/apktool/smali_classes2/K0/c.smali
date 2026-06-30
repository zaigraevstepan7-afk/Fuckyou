.class public final LK0/c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "Dex2C"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe

    const-class v1, LK0/c;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_14_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LK0/c;->a:I

    iput-object p2, p0, LK0/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(LN/b0;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LK0/c;->a:I

    iput-object p1, p0, LK0/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public native onAnimationCancel(Landroid/animation/Animator;)V
.end method

.method public final native onAnimationEnd(Landroid/animation/Animator;)V
.end method

.method public native onAnimationStart(Landroid/animation/Animator;)V
.end method

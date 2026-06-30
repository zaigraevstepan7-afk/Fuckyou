.class public final LM0/t;
.super Landroid/animation/AnimatorListenerAdapter;
.source "Dex2C"


# instance fields
.field public final a:I

.field public final b:Landroid/widget/TextView;

.field public final c:I

.field public final d:Landroid/widget/TextView;

.field public final e:LM0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2e

    const-class v1, LM0/t;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_46_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/v;ILandroid/widget/TextView;ILandroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, LM0/t;->e:LM0/v;

    iput p2, p0, LM0/t;->a:I

    iput-object p3, p0, LM0/t;->b:Landroid/widget/TextView;

    iput p4, p0, LM0/t;->c:I

    iput-object p5, p0, LM0/t;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onAnimationEnd(Landroid/animation/Animator;)V
.end method

.method public final native onAnimationStart(Landroid/animation/Animator;)V
.end method

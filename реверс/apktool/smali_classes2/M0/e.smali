.class public final LM0/e;
.super LM0/s;
.source "Dex2C"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public final h:Landroid/animation/TimeInterpolator;

.field public i:Landroid/widget/EditText;

.field public final j:LM0/a;

.field public final k:LM0/b;

.field public l:Landroid/animation/AnimatorSet;

.field public m:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x20

    const-class v1, LM0/e;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_32_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;)V
    .locals 3

    invoke-direct {p0, p1}, LM0/s;-><init>(LM0/r;)V

    new-instance v0, LM0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LM0/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LM0/e;->j:LM0/a;

    new-instance v0, LM0/b;

    invoke-direct {v0, p0, v1}, LM0/b;-><init>(LM0/s;I)V

    iput-object v0, p0, LM0/e;->k:LM0/b;

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x64

    const v2, 0x7f030336

    invoke-static {v0, v2, v1}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result v0

    iput v0, p0, LM0/e;->e:I

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x96

    invoke-static {v0, v2, v1}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result v0

    iput v0, p0, LM0/e;->f:I

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f03033f

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣۣ۟ۨۧ()Landroid/view/animation/LinearInterpolator;

    move-result-object v2

    invoke-static {v0, v1, v2}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object v0

    iput-object v0, p0, LM0/e;->g:Landroid/animation/TimeInterpolator;

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f03033d

    invoke-static {}, La1/۟ۦۡۥۡ;->ۣۣۨۢ()Lb0/a;

    move-result-object v1

    invoke-static {p1, v0, v1}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LM0/e;->h:Landroid/animation/TimeInterpolator;

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native c()I
.end method

.method public final native d()I
.end method

.method public final native e()Landroid/view/View$OnFocusChangeListener;
.end method

.method public final native f()Landroid/view/View$OnClickListener;
.end method

.method public final native g()Landroid/view/View$OnFocusChangeListener;
.end method

.method public final native m(Landroid/widget/EditText;)V
.end method

.method public final native p(Z)V
.end method

.method public final native r()V
.end method

.method public final native s()V
.end method

.method public final native t(Z)V
.end method

.method public final native u()Z
.end method

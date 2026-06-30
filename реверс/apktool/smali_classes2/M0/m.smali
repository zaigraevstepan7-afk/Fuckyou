.class public final LM0/m;
.super LM0/s;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public h:Landroid/widget/AutoCompleteTextView;

.field public final i:LM0/a;

.field public final j:LM0/b;

.field public final k:LM0/l;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Landroid/view/accessibility/AccessibilityManager;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x28

    const-class v1, LM0/m;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_40_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;)V
    .locals 3

    invoke-direct {p0, p1}, LM0/s;-><init>(LM0/r;)V

    new-instance v0, LM0/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, LM0/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LM0/m;->i:LM0/a;

    new-instance v0, LM0/b;

    invoke-direct {v0, p0, v1}, LM0/b;-><init>(LM0/s;I)V

    iput-object v0, p0, LM0/m;->j:LM0/b;

    new-instance v0, LM0/l;

    invoke-direct {v0, p0}, LM0/l;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LM0/m;->k:LM0/l;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, LM0/m;->o:J

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x43

    const v2, 0x7f030336

    invoke-static {v0, v2, v1}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result v0

    iput v0, p0, LM0/m;->f:I

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x32

    invoke-static {v0, v2, v1}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result v0

    iput v0, p0, LM0/m;->e:I

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f03033f

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣۣ۟ۨۧ()Landroid/view/animation/LinearInterpolator;

    move-result-object v1

    invoke-static {p1, v0, v1}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LM0/m;->g:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public static native ۟ۢۥۡ۟()[S
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

.method public final native h()LM0/l;
.end method

.method public final native i(I)Z
.end method

.method public final native j()Z
.end method

.method public final native l()Z
.end method

.method public final native m(Landroid/widget/EditText;)V
.end method

.method public final native n(LO/k;)V
.end method

.method public final native o(Landroid/view/accessibility/AccessibilityEvent;)V
.end method

.method public final native r()V
.end method

.method public final native s()V
.end method

.method public final native t(Z)V
.end method

.method public final native u()V
.end method

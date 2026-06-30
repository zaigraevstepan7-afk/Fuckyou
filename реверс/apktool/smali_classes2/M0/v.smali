.class public final LM0/v;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public A:Landroid/content/res/ColorStateList;

.field public B:Landroid/graphics/Typeface;

.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Landroid/animation/TimeInterpolator;

.field public final e:Landroid/animation/TimeInterpolator;

.field public final f:Landroid/animation/TimeInterpolator;

.field public final g:Landroid/content/Context;

.field public final h:Lcom/google/android/material/textfield/TextInputLayout;

.field public i:Landroid/widget/LinearLayout;

.field public j:I

.field public k:Landroid/widget/FrameLayout;

.field public l:Landroid/animation/AnimatorSet;

.field public final m:F

.field public n:I

.field public o:I

.field public p:Ljava/lang/CharSequence;

.field public q:Z

.field public r:Ll/e0;

.field public s:Ljava/lang/CharSequence;

.field public t:I

.field public u:I

.field public v:Landroid/content/res/ColorStateList;

.field public w:Ljava/lang/CharSequence;

.field public x:Z

.field public y:Ll/e0;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x30

    const-class v1, LM0/v;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_48_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LM0/v;->g:Landroid/content/Context;

    iput-object p1, p0, LM0/v;->h:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0}, LM0/۟ۧ۠ۢۥ;->۟۟ۡ۠۠(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f060091

    invoke-static {p1, v1}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, LM0/v;->m:F

    const/16 p1, 0xd9

    const v1, 0x7f030337

    invoke-static {v0, v1, p1}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result p1

    iput p1, p0, LM0/v;->a:I

    const p1, 0x7f030333

    const/16 v2, 0xa7

    invoke-static {v0, p1, v2}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result p1

    iput p1, p0, LM0/v;->b:I

    invoke-static {v0, v1, v2}, Lh0/۟۠ۤۡۦ;->ۨ۠ۥۣ(Ljava/lang/Object;II)I

    move-result p1

    iput p1, p0, LM0/v;->c:I

    invoke-static {}, La1/۟ۦۡۥۡ;->ۣۣۨۢ()Lb0/a;

    move-result-object p1

    const v1, 0x7f03033c

    invoke-static {v0, v1, p1}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LM0/v;->d:Landroid/animation/TimeInterpolator;

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣۣ۟ۨۧ()Landroid/view/animation/LinearInterpolator;

    move-result-object p1

    invoke-static {v0, v1, p1}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object v1

    iput-object v1, p0, LM0/v;->e:Landroid/animation/TimeInterpolator;

    const v1, 0x7f03033f

    invoke-static {v0, v1, p1}, LX0/ۤۤ۠ۡ;->۠ۦۤۡ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LM0/v;->f:Landroid/animation/TimeInterpolator;

    return-void
.end method


# virtual methods
.method public final native a(Ll/e0;I)V
.end method

.method public final native b()V
.end method

.method public final native c()V
.end method

.method public final native d(Ljava/util/ArrayList;ZLl/e0;III)V
.end method

.method public final native e(I)Landroid/widget/TextView;
.end method

.method public final native f()V
.end method

.method public final native g(Ll/e0;I)V
.end method

.method public final native h(Ll/e0;Ljava/lang/CharSequence;)Z
.end method

.method public final native i(IIZ)V
.end method

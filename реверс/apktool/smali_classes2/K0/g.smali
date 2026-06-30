.class public abstract LK0/g;
.super Landroid/view/View;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public final M:I

.field public N:F

.field public O:Landroid/view/MotionEvent;

.field public P:Z

.field public Q:F

.field public R:F

.field public S:Ljava/util/ArrayList;

.field public T:I

.field public U:I

.field public V:F

.field public W:[F

.field public final a:Landroid/graphics/Paint;

.field public a0:Z

.field public final b:Landroid/graphics/Paint;

.field public b0:I

.field public final c:Landroid/graphics/Paint;

.field public c0:I

.field public final d:Landroid/graphics/Paint;

.field public d0:I

.field public final e:Landroid/graphics/Paint;

.field public e0:Z

.field public final f:Landroid/graphics/Paint;

.field public f0:Z

.field public final g:Landroid/graphics/Paint;

.field public g0:Landroid/content/res/ColorStateList;

.field public final h:LK0/d;

.field public h0:Landroid/content/res/ColorStateList;

.field public final i:Landroid/view/accessibility/AccessibilityManager;

.field public i0:Landroid/content/res/ColorStateList;

.field public j:LK/a;

.field public j0:Landroid/content/res/ColorStateList;

.field public final k:I

.field public k0:Landroid/content/res/ColorStateList;

.field public final l:Ljava/util/ArrayList;

.field public final l0:Landroid/graphics/Path;

.field public final m:Ljava/util/ArrayList;

.field public final m0:Landroid/graphics/RectF;

.field public final n:Ljava/util/ArrayList;

.field public final n0:Landroid/graphics/RectF;

.field public o:Z

.field public final o0:LI0/h;

.field public p:Landroid/animation/ValueAnimator;

.field public p0:Landroid/graphics/drawable/Drawable;

.field public q:Landroid/animation/ValueAnimator;

.field public q0:Ljava/util/List;

.field public final r:I

.field public r0:F

.field public final s:I

.field public s0:I

.field public final t:I

.field public final t0:LK0/a;

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x12

    const-class v1, LK0/g;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_18_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    const v8, 0x7f0303de

    const v9, 0x7f100448

    move-object/from16 v1, p1

    invoke-static {v1, v7, v8, v9}, Ll0/ۤ۟ۨۧ;->۟ۥۦ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v7, v8}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LK0/g;->l:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LK0/g;->m:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LK0/g;->n:Ljava/util/ArrayList;

    const/4 v10, 0x0

    iput-boolean v10, v0, LK0/g;->o:Z

    const/4 v1, -0x1

    iput v1, v0, LK0/g;->I:I

    iput v1, v0, LK0/g;->J:I

    iput-boolean v10, v0, LK0/g;->P:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, LK0/g;->S:Ljava/util/ArrayList;

    iput v1, v0, LK0/g;->T:I

    iput v1, v0, LK0/g;->U:I

    const/4 v11, 0x0

    iput v11, v0, LK0/g;->V:F

    const/4 v12, 0x1

    iput-boolean v12, v0, LK0/g;->a0:Z

    iput-boolean v10, v0, LK0/g;->e0:Z

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, v0, LK0/g;->l0:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, LK0/g;->m0:Landroid/graphics/RectF;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, LK0/g;->n0:Landroid/graphics/RectF;

    new-instance v13, LI0/h;

    invoke-direct {v13}, LI0/h;-><init>()V

    iput-object v13, v0, LK0/g;->o0:LI0/h;

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟۟ۨۧۡ()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, LK0/g;->q0:Ljava/util/List;

    iput v10, v0, LK0/g;->s0:I

    move-object v14, v0

    check-cast v14, Lcom/google/android/material/slider/Slider;

    new-instance v1, LK0/a;

    invoke-direct {v1, v14}, LK0/a;-><init>(Lcom/google/android/material/slider/Slider;)V

    iput-object v1, v0, LK0/g;->t0:LK0/a;

    invoke-static/range {p0 .. p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v15

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, LK0/g;->a:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, LK0/g;->b:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v12}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, v0, LK0/g;->c:Landroid/graphics/Paint;

    invoke-static {}, Lg/۠۟ۡ;->ۣۣ۟۟ۡ()Landroid/graphics/Paint$Style;

    move-result-object v2

    invoke-static {v1, v2}, LT0/ۣۣ۟ۤ۠;->ۨۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    invoke-static {}, LN/ۨۤۧۢ;->ۡۡۧۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-static {v1, v3}, Lx/۟۟ۦۣ۠;->ۣ۟ۡۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/graphics/Xfermode;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v12}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, v0, LK0/g;->d:Landroid/graphics/Paint;

    invoke-static {v1, v2}, LT0/ۣۣ۟ۤ۠;->ۨۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, LK0/g;->e:Landroid/graphics/Paint;

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۦۧۦ۟()Landroid/graphics/Paint$Style;

    move-result-object v3

    invoke-static {v1, v3}, LT0/ۣۣ۟ۤ۠;->ۨۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, La0/ۣۣ۟ۡ۠;->۠ۡۤۡ()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/startup/ۢۦ۟ۥ;->ۣۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, LK0/g;->f:Landroid/graphics/Paint;

    invoke-static {v1, v3}, LT0/ۣۣ۟ۤ۠;->ۨۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Landroidx/startup/ۢۦ۟ۥ;->ۣۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, LK0/g;->g:Landroid/graphics/Paint;

    invoke-static {v1, v2}, LT0/ۣۣ۟ۤ۠;->ۨۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Landroidx/startup/ۢۦ۟ۥ;->ۣۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15}, LM0/۟ۧ۠ۢۥ;->۟۟ۡ۠۠(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0602f5

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->z:I

    const v2, 0x7f0602f4

    invoke-static {v1, v2}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۡ۟(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->s:I

    iput v2, v0, LK0/g;->D:I

    const v2, 0x7f0602f0

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->t:I

    const v2, 0x7f0602f3

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->u:I

    const v2, 0x7f0602f2

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v3

    iput v3, v0, LK0/g;->v:I

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->w:I

    const v2, 0x7f0602f1

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v2

    iput v2, v0, LK0/g;->x:I

    const v2, 0x7f0602ec

    invoke-static {v1, v2}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v1

    iput v1, v0, LK0/g;->M:I

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۡۥ۟ۢ()[I

    move-result-object v6

    invoke-static {v15, v7, v8, v9}, LC/ۣ۟ۦۨ;->۠ۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;II)V

    const v4, 0x7f0303de

    const v5, 0x7f100448

    new-array v3, v10, [I

    move-object v1, v15

    move-object/from16 v2, p2

    move-object/from16 v16, v3

    move-object v3, v6

    move-object v10, v6

    move-object/from16 v6, v16

    invoke-static/range {v1 .. v6}, Lcom/google/android/material/appbar/ۤۦۦۤ;->ۢۥۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-static {v15, v7, v10, v8, v9}, Lt/ۦۧۤۧ;->ۣ۟ۡۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x8

    const v3, 0x7f10046a

    invoke-static {v1, v2, v3}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result v2

    iput v2, v0, LK0/g;->k:I

    const/4 v2, 0x3

    invoke-static {v1, v2, v11}, LH0/ۦۥۣۥ;->۟۠ۦۤۢ(Ljava/lang/Object;IF)F

    move-result v2

    iput v2, v0, LK0/g;->Q:F

    const/4 v2, 0x4

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v1, v2, v3}, LH0/ۦۥۣۥ;->۟۠ۦۤۢ(Ljava/lang/Object;IF)F

    move-result v2

    iput v2, v0, LK0/g;->R:F

    new-array v2, v12, [Ljava/lang/Float;

    invoke-static/range {p0 .. p0}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۤۡۦ(Ljava/lang/Object;)F

    move-result v3

    invoke-static {v3}, LX0/ۤۤ۠ۡ;->ۤۡۤ۟(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lu0/۟ۤ۠ۨۨ;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-static {v1, v2, v11}, LH0/ۦۥۣۥ;->۟۠ۦۤۢ(Ljava/lang/Object;IF)F

    move-result v3

    iput v3, v0, LK0/g;->V:F

    invoke-static/range {p0 .. p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v4}, LI0/۟ۡۤۤ۟;->۟۟ۡۤۦ(Ljava/lang/Object;I)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Li0/۟۟ۤۦۤ;->ۨۤۡۢ(D)D

    move-result-wide v3

    double-to-float v3, v3

    const/16 v4, 0x9

    invoke-static {v1, v4, v3}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۡۢۡۤ(Ljava/lang/Object;IF)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Li0/۟۟ۤۦۤ;->ۨۤۡۢ(D)D

    move-result-wide v3

    double-to-int v3, v3

    iput v3, v0, LK0/g;->y:I

    const/16 v3, 0x18

    invoke-static {v1, v3}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v5, 0x18

    goto :goto_0

    :cond_0
    const/16 v5, 0x1a

    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x19

    :goto_1
    invoke-static {v15, v1, v5}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const v4, 0x7f0502b7

    invoke-static {v15, v4}, La0/ۣ۟ۤۥۦ;->۟۟ۦۧۦ(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    :goto_2
    invoke-static {v0, v4}, LR/ۣ۟ۤ۟ۧ;->ۦۧ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15, v1, v3}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const v3, 0x7f0502b4

    invoke-static {v15, v3}, La0/ۣ۟ۤۥۦ;->۟۟ۦۧۦ(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_3
    invoke-static {v0, v3}, LN0/ۣۡۧۨ;->۟ۡ۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0xa

    invoke-static {v15, v1, v3}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-static {v13, v3}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟۠۟ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0xe

    invoke-static {v1, v3}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v15, v1, v3}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۥۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    const/16 v3, 0xf

    invoke-static {v1, v3, v11}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۡۢۡۤ(Ljava/lang/Object;IF)F

    move-result v3

    invoke-static {v0, v3}, Lp0/ۣۧۨۥ;->۟ۧۢ۠ۤ(Ljava/lang/Object;F)V

    const/4 v3, 0x5

    invoke-static {v15, v1, v3}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    const v3, 0x7f0502b5

    invoke-static {v15, v3}, La0/ۣ۟ۤۥۦ;->۟۟ۦۧۦ(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_4
    invoke-static {v0, v3}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣ۟۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x17

    invoke-static {v1, v3, v12}, Ll0/ۤ۟ۨۧ;->۟ۦۣ۟ۥ(Ljava/lang/Object;IZ)Z

    move-result v3

    iput-boolean v3, v0, LK0/g;->a0:Z

    const/16 v3, 0x12

    invoke-static {v1, v3}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v5, 0x12

    goto :goto_5

    :cond_6
    const/16 v5, 0x14

    :goto_5
    if-eqz v4, :cond_7

    goto :goto_6

    :cond_7
    const/16 v3, 0x13

    :goto_6
    invoke-static {v15, v1, v5}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_8

    goto :goto_7

    :cond_8
    const v4, 0x7f0502b6

    invoke-static {v15, v4}, La0/ۣ۟ۤۥۦ;->۟۟ۦۧۦ(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    :goto_7
    invoke-static {v0, v4}, LN0/ۣۡۧۨ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15, v1, v3}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_9

    goto :goto_8

    :cond_9
    const v3, 0x7f0502b3

    invoke-static {v15, v3}, La0/ۣ۟ۤۥۦ;->۟۟ۦۧۦ(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_8
    invoke-static {v0, v3}, LN/ۨۤۧۢ;->ۥۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x10

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v3

    invoke-static {v0, v3}, Lm0/ۣ۟ۧۦ۠;->۟ۢۨۧۧ(Ljava/lang/Object;I)V

    const/16 v3, 0x1d

    invoke-static {v1, v3, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v3

    invoke-static {v0, v3}, La1/۟ۦۡۥۡ;->ۧۥ۠(Ljava/lang/Object;I)V

    const/16 v3, 0x1c

    invoke-static {v1, v3, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v3

    invoke-static {v0, v3}, LX/۟ۥۤۢ۟;->ۣ۟۟ۧۧ(Ljava/lang/Object;I)V

    const/16 v3, 0xd

    invoke-static {v1, v3, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    const/16 v6, 0x11

    invoke-static {v1, v6, v5}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v6

    const/16 v7, 0xc

    invoke-static {v1, v7, v5}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v5

    invoke-static {v0, v6}, LW/۟ۡۤۡ;->ۤۤ۠ۧ(Ljava/lang/Object;I)V

    invoke-static {v0, v5}, LP0/۟ۨۧۡ;->ۣ۟۟ۤۤ(Ljava/lang/Object;I)V

    const/4 v5, 0x6

    invoke-static {v1, v5, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v5

    invoke-static {v0, v5}, Lb0/ۣۣ۟۠ۢ;->ۢۥۥۣ(Ljava/lang/Object;I)V

    const/16 v5, 0xb

    invoke-static {v1, v5, v11}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۡۢۡۤ(Ljava/lang/Object;IF)F

    move-result v5

    invoke-static {v0, v5}, LT0/۟ۥ۟ۥۡ;->۟ۢۢ۟ۥ(Ljava/lang/Object;F)V

    const/16 v5, 0x1b

    invoke-static {v1, v5, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v5

    invoke-static {v0, v5}, LV0/ۥۤۥۡ;->ۣۣ۟ۤ۟(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, LU/۟ۦ۠ۨۨ;->۟۟ۡۨۤ(Ljava/lang/Object;)I

    move-result v4

    div-int/2addr v4, v2

    const/16 v5, 0x15

    invoke-static {v1, v5, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v4

    invoke-static {v0, v4}, Lg0/ۧۥۦۡ;->۟ۦۣۨۧ(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, LU/۟ۦ۠ۨۨ;->۟۟ۡۨۤ(Ljava/lang/Object;)I

    move-result v4

    div-int/2addr v4, v2

    const/16 v2, 0x16

    invoke-static {v1, v2, v4}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v2

    invoke-static {v0, v2}, LO/ۦۢ۠ۢ;->ۥ۟ۤۡ(Ljava/lang/Object;I)V

    const/4 v2, 0x7

    const/4 v4, 0x0

    invoke-static {v1, v2, v4}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v2

    invoke-static {v0, v2}, Lx0/ۣ۟ۥ۟ۧ;->۟ۡۨۤۢ(Ljava/lang/Object;I)V

    invoke-static {v1, v4, v12}, Ll0/ۤ۟ۨۧ;->۟ۦۣ۟ۥ(Ljava/lang/Object;IZ)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {v0, v4}, Lx0/ۣ۟ۥ۟ۧ;->۟ۦۦ۠(Ljava/lang/Object;Z)V

    :cond_a
    invoke-static {v1}, Lb0/۟ۡۦۣۤ;->ۡ۠۠ۦ(Ljava/lang/Object;)V

    invoke-static {v0, v12}, LA0/۟ۧ۟ۦۦ;->ۣۤۨۨ(Ljava/lang/Object;Z)V

    invoke-static {v0, v12}, La0/ۣ۟ۤۥۦ;->ۣۢۦۡ(Ljava/lang/Object;Z)V

    invoke-static {v13}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۥۣ۠ۤ(Ljava/lang/Object;)V

    invoke-static {v15}, Lw0/ۨ۟ۥۥ;->۟ۦۦۨۢ(Ljava/lang/Object;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-static {v1}, LH0/ۦۥۣۥ;->ۣ۟ۨۤۡ(Ljava/lang/Object;)I

    move-result v1

    iput v1, v0, LK0/g;->r:I

    new-instance v1, LK0/d;

    invoke-direct {v1, v14}, LK0/d;-><init>(Lcom/google/android/material/slider/Slider;)V

    iput-object v1, v0, LK0/g;->h:LK0/d;

    invoke-static {v0, v1}, LI0/۟ۡۤۤ۟;->ۥۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {}, LK0/g;->ۦۥۡۦ()[S

    move-result-object v2

    const/16 v4, 0x918

    const/4 v5, 0x0

    invoke-static {v2, v5, v3, v4}, La0/ۣۣ۟ۡ۠;->ۧۧ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LU/۟ۦ۠ۨۨ;->ۣ۟ۤۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, v0, LK0/g;->i:Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method public static native ۥ۟ۦۢ(Ljava/lang/Object;)I
.end method

.method public static native ۦۥۡۦ()[S
.end method


# virtual methods
.method public final native A(F)Z
.end method

.method public final native B(F)F
.end method

.method public final native a(Landroid/graphics/drawable/Drawable;)V
.end method

.method public final native b()I
.end method

.method public final native c(Z)Landroid/animation/ValueAnimator;
.end method

.method public final native d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
.end method

.method public final native dispatchHoverEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native drawableStateChanged()V
.end method

.method public final native e()V
.end method

.method public final native f()V
.end method

.method public final native g()[F
.end method

.method public final native getAccessibilityFocusedVirtualViewId()I
.end method

.method public native getMinSeparation()F
.end method

.method public abstract getThumbRadius()I
.end method

.method public native getValues()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method

.method public final native h(Landroid/content/res/ColorStateList;)I
.end method

.method public final native i(D)Z
.end method

.method public final native j(Landroid/view/MotionEvent;)Z
.end method

.method public final native k()Z
.end method

.method public final native l()V
.end method

.method public final native m(I)Z
.end method

.method public final native n(I)V
.end method

.method public final native o(F)F
.end method

.method public final native onAttachedToWindow()V
.end method

.method public final native onDetachedFromWindow()V
.end method

.method public final native onDraw(Landroid/graphics/Canvas;)V
.end method

.method public final native onFocusChanged(ZILandroid/graphics/Rect;)V
.end method

.method public final native onKeyDown(ILandroid/view/KeyEvent;)Z
.end method

.method public final native onKeyUp(ILandroid/view/KeyEvent;)Z
.end method

.method public final native onMeasure(II)V
.end method

.method public final native onRestoreInstanceState(Landroid/os/Parcelable;)V
.end method

.method public final native onSaveInstanceState()Landroid/os/Parcelable;
.end method

.method public final native onSizeChanged(IIII)V
.end method

.method public final native onTouchEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native onVisibilityChanged(Landroid/view/View;I)V
.end method

.method public final native p()V
.end method

.method public final native q(LP0/b;F)V
.end method

.method public final native r(Ljava/util/ArrayList;)V
.end method

.method public final native s(IF)Z
.end method

.method public native setActiveThumbIndex(I)V
.end method

.method public varargs native setCustomThumbDrawablesForValues([I)V
.end method

.method public varargs native setCustomThumbDrawablesForValues([Landroid/graphics/drawable/Drawable;)V
.end method

.method public native setEnabled(Z)V
.end method

.method public abstract setHaloRadius(I)V
.end method

.method public abstract setHaloTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setLabelBehavior(I)V
.end method

.method public native setSeparationUnit(I)V
.end method

.method public abstract setThumbElevation(F)V
.end method

.method public abstract setThumbHeight(I)V
.end method

.method public abstract setThumbStrokeColor(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setThumbStrokeWidth(F)V
.end method

.method public abstract setThumbTrackGapSize(I)V
.end method

.method public abstract setThumbWidth(I)V
.end method

.method public abstract setTickActiveRadius(I)V
.end method

.method public abstract setTickActiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTickInactiveRadius(I)V
.end method

.method public abstract setTickInactiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTrackActiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTrackHeight(I)V
.end method

.method public abstract setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTrackInsideCornerSize(I)V
.end method

.method public abstract setTrackStopIndicatorSize(I)V
.end method

.method public native setValues(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation
.end method

.method public varargs native setValues([Ljava/lang/Float;)V
.end method

.method public final native t()V
.end method

.method public final native u(ILandroid/graphics/Rect;)V
.end method

.method public final native v()V
.end method

.method public final native w()V
.end method

.method public final native x(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/RectF;I)V
.end method

.method public final native y()V
.end method

.method public final native z()V
.end method

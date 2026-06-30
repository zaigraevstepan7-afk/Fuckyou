.class public final LM0/A;
.super Landroid/widget/LinearLayout;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final b:Ll/e0;

.field public c:Ljava/lang/CharSequence;

.field public final d:Lcom/google/android/material/internal/CheckableImageButton;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:I

.field public h:Landroid/widget/ImageView$ScaleType;

.field public i:Landroid/view/View$OnLongClickListener;

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x14

    const-class v1, LM0/A;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_20_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;LN/l;)V
    .locals 10

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, LM0/A;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 p1, 0x8

    invoke-static {p0, p1}, Landroidx/startup/ۢۦ۟ۥ;->ۧۥۥۨ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ld0/ۥۦۤۧ;->ۥۢۧۢ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const v2, 0x800003

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-static {p0, v1}, Landroidx/startup/ۢۦ۟ۥ;->ۥ۠ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb0/ۣۣ۟۠ۢ;->ۢۡ۟(Ljava/lang/Object;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c002f

    invoke-static {v1, v2, p0, v0}, LX/۟ۥۤۢ۟;->ۡ۠۠ۤ(Ljava/lang/Object;ILjava/lang/Object;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    iput-object v1, p0, LM0/A;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {}, LO/ۦۢ۠ۢ;->ۧۤۢۡ()I

    move-result v2

    const/16 v5, 0x16

    if-gt v2, v5, :cond_0

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/4 v6, 0x4

    invoke-static {v5, v6}, LI0/۟ۡۤۤ۟;->۟۟ۡۤۦ(Ljava/lang/Object;I)F

    move-result v5

    float-to-int v5, v5

    invoke-static {}, Lg0/ۢ۠ۧۤ;->ۣۢ()[I

    invoke-static {v2, v5}, LT0/۟ۥ۟ۥۡ;->ۥۡۧۨ(Ljava/lang/Object;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v1, v2}, Lz/۟ۤۥۣۨ;->۟ۡۦۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    new-instance v5, Ll/e0;

    const/4 v6, 0x0

    invoke-direct {v5, v2, v6}, Ll/e0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v5, p0, LM0/A;->b:Ll/e0;

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, LX/۟ۥۤۢ۟;->۟۠ۥۥۦ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lo0/۟ۤ۠۠ۢ;->ۦۡۥۦ(Ljava/lang/Object;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {v2, v0}, Lk/۟ۢۡۢۨ;->ۤۢۦ۠(Ljava/lang/Object;I)V

    :cond_1
    invoke-static {p0}, Li0/۟۟ۤۦۤ;->۟۟ۡۨۢ(Ljava/lang/Object;)Landroid/view/View$OnLongClickListener;

    move-result-object v2

    invoke-static {v1, v6}, LT0/۟ۥ۟ۥۡ;->۟ۤۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۥۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, p0, LM0/A;->i:Landroid/view/View$OnLongClickListener;

    invoke-static {v1, v6}, LP0/۟ۨۧۡ;->ۣ۟ۤۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v6}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۥۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, LG/ۧۡ۠ۡ;->۟ۡۢۨۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/TypedArray;

    const/16 v7, 0x45

    invoke-static {v2, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, p2, v7}, Lg0/ۢ۠ۧۤ;->ۣ۟ۢۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    iput-object v7, p0, LM0/A;->e:Landroid/content/res/ColorStateList;

    :cond_2
    const/16 v7, 0x46

    invoke-static {v2, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v2, v7, v4}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v7

    invoke-static {v7, v6}, La1/۟ۦۡۥۡ;->۟ۦ۠ۢۧ(ILjava/lang/Object;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v7

    iput-object v7, p0, LM0/A;->f:Landroid/graphics/PorterDuff$Mode;

    :cond_3
    const/16 v7, 0x42

    invoke-static {v2, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_5

    invoke-static {p2, v7}, Landroidx/startup/ۢۦ۟ۥ;->ۤ۟ۡۨ(Ljava/lang/Object;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-static {p0, v7}, Lo0/۟ۤ۠۠ۢ;->ۨۡۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v7, 0x41

    invoke-static {v2, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-static {v2, v7}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۨۥۡۡ(Ljava/lang/Object;I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v1}, La0/ۣۣ۟ۡ۠;->ۣۣ۟ۦۢ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v8

    if-eq v8, v7, :cond_4

    invoke-static {v1, v7}, Lm0/ۣ۟ۧۦ۠;->۠ۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    const/16 v7, 0x40

    invoke-static {v2, v7, v9}, Ll0/ۤ۟ۨۧ;->۟ۦۣ۟ۥ(Ljava/lang/Object;IZ)Z

    move-result v7

    invoke-static {v1, v7}, Lk0/۠ۧۢۥ;->۟ۥۣۢۨ(Ljava/lang/Object;Z)V

    :cond_5
    invoke-static {p0}, Lq/ۤۡۨۡ;->۟ۡ۠ۤ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0602c8

    invoke-static {v7, v8}, LA0/۟ۧ۟ۦۦ;->ۨۥۢۥ(Ljava/lang/Object;I)I

    move-result v7

    const/16 v8, 0x43

    invoke-static {v2, v8, v7}, LN/ۨۤۧۢ;->۟ۦۨۦۢ(Ljava/lang/Object;II)I

    move-result v7

    if-ltz v7, :cond_a

    invoke-static {p0}, Lg0/ۧۥۦۡ;->ۡۨ۟ۥ(Ljava/lang/Object;)I

    move-result v8

    if-eq v7, v8, :cond_6

    iput v7, p0, LM0/A;->g:I

    invoke-static {v1, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۦ۠ۥۤ(Ljava/lang/Object;I)V

    invoke-static {v1, v7}, Lb0/ۣۣ۟۠ۢ;->۟ۢ۟ۡۤ(Ljava/lang/Object;I)V

    :cond_6
    const/16 v7, 0x44

    invoke-static {v2, v7}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-static {v2, v7, v4}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v4

    invoke-static {v4}, Lq/ۤۡۨۡ;->۟ۤۨۥۢ(I)Landroid/widget/ImageView$ScaleType;

    move-result-object v4

    iput-object v4, p0, LM0/A;->h:Landroid/widget/ImageView$ScaleType;

    invoke-static {v1, v4}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->۟۟۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    invoke-static {v5, p1}, Landroidx/startup/ۢۦ۟ۥ;->ۧۥۥۨ(Ljava/lang/Object;I)V

    const p1, 0x7f0901ea

    invoke-static {v5, p1}, LM0/۟ۧ۠ۢۥ;->ۣۡ۠ۡ(Ljava/lang/Object;I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v5, p1}, Landroidx/startup/ۢۦ۟ۥ;->ۥ۠ۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->۟ۧۦ۟()Ljava/util/WeakHashMap;

    invoke-static {v5, v9}, LW/۟ۡۤۡ;->ۤۦۦۣ(Ljava/lang/Object;I)V

    const/16 p1, 0x3c

    invoke-static {v2, p1, v0}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result p1

    invoke-static {v5, p1}, Ll0/ۤ۟ۨۧ;->۟ۡۨۢ۟(Ljava/lang/Object;I)V

    const/16 p1, 0x3d

    invoke-static {v2, p1}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p2, p1}, Lg/۠۟ۡ;->۟ۥ۟۠(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v5, p1}, Lg/۠۟ۡ;->ۣۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    const/16 p1, 0x3b

    invoke-static {v2, p1}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۨۥۡۡ(Ljava/lang/Object;I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, LO/ۦۢ۠ۢ;->ۦ۠ۦۢ(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_0

    :cond_9
    move-object v6, p1

    :goto_0
    iput-object v6, p0, LM0/A;->c:Ljava/lang/CharSequence;

    invoke-static {v5, p1}, LM0/۟ۧ۠ۢۥ;->۟ۦۣۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, La0/ۣ۟ۤۥۦ;->۟ۤۢۦۥ(Ljava/lang/Object;)V

    invoke-static {p0, v1}, Li0/۟۟ۤۦۤ;->ۦۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v5}, Li0/۟۟ۤۦۤ;->ۦۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {}, LM0/A;->۟۠ۥ۠()[S

    move-result-object p2

    const/16 v1, 0x23

    const/16 v2, 0x568

    invoke-static {p2, v0, v1, v2}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤۧ۟([SIII)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native ۟۠ۥ۠()[S
.end method


# virtual methods
.method public final native a()I
.end method

.method public final native b(Landroid/graphics/drawable/Drawable;)V
.end method

.method public final native c(Z)V
.end method

.method public final native d()V
.end method

.method public final native e()V
.end method

.method public final native onMeasure(II)V
.end method

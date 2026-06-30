.class public final LM0/y;
.super Ll/o;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final e:Ll/K0;

.field public final f:Landroid/view/accessibility/AccessibilityManager;

.field public final g:Landroid/graphics/Rect;

.field public final h:I

.field public final i:F

.field public j:Landroid/content/res/ColorStateList;

.field public k:I

.field public l:Landroid/content/res/ColorStateList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x33

    const-class v1, LM0/y;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_51_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    const v0, 0x7f03003e

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Ll0/ۤ۟ۨۧ;->۟ۥۦ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LM0/y;->g:Landroid/graphics/Rect;

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    invoke-static {}, LI0/۟ۡۤۤ۟;->ۢۢۨ۠()[I

    move-result-object v4

    const v5, 0x7f03003e

    const v6, 0x7f1002f6

    new-array v7, v1, [I

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v2 .. v7}, Lo0/۟ۤ۠۠ۢ;->ۣۡۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IILjava/lang/Object;)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-static {p2, v1}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v1}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, v2}, Lb0/ۣۣ۟۠ۢ;->۟۠ۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x3

    const v3, 0x7f0c004e

    invoke-static {p2, v0, v3}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result v0

    iput v0, p0, LM0/y;->h:I

    const v0, 0x7f0602a9

    const/4 v3, 0x1

    invoke-static {p2, v3, v0}, LC/ۣ۟ۦۨ;->ۣۢۦۣ(Ljava/lang/Object;II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, LM0/y;->i:F

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {p2, v0, v1}, Lk0/ۨ۟۟ۦ;->ۣ۟ۤۥۦ(Ljava/lang/Object;II)I

    move-result v4

    invoke-static {v4}, Lcom/google/android/material/appbar/ۤۦۦۤ;->ۣ۟ۧۦۡ(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, p0, LM0/y;->j:Landroid/content/res/ColorStateList;

    :cond_1
    const/4 v4, 0x4

    invoke-static {p2, v4, v1}, Lk0/ۨ۟۟ۦ;->ۣ۟ۤۥۦ(Ljava/lang/Object;II)I

    move-result v4

    iput v4, p0, LM0/y;->k:I

    const/4 v4, 0x5

    invoke-static {p1, p2, v4}, LC/ۣ۟ۦۨ;->ۣۥۡۥ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, p0, LM0/y;->l:Landroid/content/res/ColorStateList;

    invoke-static {}, LM0/y;->۟۟۟۠ۥ()[S

    move-result-object v4

    const/16 v5, 0xd

    const/16 v6, 0x6d9

    invoke-static {v4, v1, v5, v6}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥ۟ۢۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, LU/۟ۦ۠ۨۨ;->ۣ۟ۤۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityManager;

    iput-object v4, p0, LM0/y;->f:Landroid/view/accessibility/AccessibilityManager;

    new-instance v4, Ll/K0;

    const v5, 0x7f0302ce

    invoke-direct {v4, p1, v2, v5}, Ll/K0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v4, p0, LM0/y;->e:Ll/K0;

    iput-boolean v3, v4, Ll/K0;->y:Z

    invoke-static {v4}, Lq/ۤۡۨۡ;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Ll/C;

    move-result-object p1

    invoke-static {p1, v3}, Lx/۟۟ۦۣ۠;->۟۟ۡ۟ۧ(Ljava/lang/Object;Z)V

    iput-object p0, v4, Ll/K0;->o:Landroid/view/View;

    invoke-static {v4}, Lq/ۤۡۨۡ;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Ll/C;

    move-result-object p1

    invoke-static {p1, v0}, Lb0/ۣۣ۟۠ۢ;->۟ۡ۠ۦۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lx0/ۣ۟ۥ۟ۧ;->ۣۤۤۤ(Ljava/lang/Object;)Landroid/widget/ListAdapter;

    move-result-object p1

    invoke-static {v4, p1}, Lg/۠۟ۡ;->ۣ۠ۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, LM0/w;

    invoke-direct {p1, v1, p0}, LM0/w;-><init>(ILjava/lang/Object;)V

    iput-object p1, v4, Ll/K0;->p:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 p1, 0x6

    invoke-static {p2, p1}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2, p1, v1}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result p1

    invoke-static {p0, p1}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣ۠ۨۡ(Ljava/lang/Object;I)V

    :cond_2
    invoke-static {p2}, Lb0/۟ۡۦۣۤ;->ۡ۠۠ۦ(Ljava/lang/Object;)V

    return-void
.end method

.method public static native a(LM0/y;Ljava/lang/Object;)V
.end method

.method public static native ۟۟۟۠ۥ()[S
.end method

.method public static native ۟۟ۧۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/CharSequence;
.end method

.method public static native ۣ۟ۧۨۦ(Ljava/lang/Object;II)V
.end method


# virtual methods
.method public final native b()Lcom/google/android/material/textfield/TextInputLayout;
.end method

.method public final native c()Z
.end method

.method public final native dismissDropDown()V
.end method

.method public native getDropDownBackgroundTintList()Landroid/content/res/ColorStateList;
.end method

.method public native getHint()Ljava/lang/CharSequence;
.end method

.method public native getPopupElevation()F
.end method

.method public native getSimpleItemSelectedColor()I
.end method

.method public native getSimpleItemSelectedRippleColor()Landroid/content/res/ColorStateList;
.end method

.method public final native onAttachedToWindow()V
.end method

.method public final native onDetachedFromWindow()V
.end method

.method public final native onMeasure(II)V
.end method

.method public final native onWindowFocusChanged(Z)V
.end method

.method public native setAdapter(Landroid/widget/ListAdapter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/widget/ListAdapter;",
            ":",
            "Landroid/widget/Filterable;",
            ">(TT;)V"
        }
    .end annotation
.end method

.method public native setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
.end method

.method public native setDropDownBackgroundTint(I)V
.end method

.method public native setDropDownBackgroundTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public native setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
.end method

.method public native setRawInputType(I)V
.end method

.method public native setSimpleItemSelectedColor(I)V
.end method

.method public native setSimpleItemSelectedRippleColor(Landroid/content/res/ColorStateList;)V
.end method

.method public native setSimpleItems(I)V
.end method

.method public native setSimpleItems([Ljava/lang/String;)V
.end method

.method public final native showDropDown()V
.end method

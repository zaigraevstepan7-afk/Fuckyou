.class public Lx/۟۟ۦۣ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۡۧۦۦ:I = -0xb3


# direct methods
.method public static ۟۟۟ۤۤ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    check-cast p2, Le/C;

    check-cast p3, Lk/m;

    invoke-virtual {p0, p1, p2, p3}, Le/D;->n(ILe/C;Lk/m;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۡ۟ۧ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۤۡ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/graphics/Xfermode;
    .locals 1

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/graphics/Paint;

    check-cast p1, Landroid/graphics/Xfermode;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->C:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۢۦ(Ljava/lang/Object;)Landroid/content/ComponentName;
    .locals 1

    invoke-static {}, LM/۟ۤۡۦۨ;->۟۠ۥۣۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۦۣ(Ljava/lang/Object;)Lj/c;
    .locals 2

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/C;

    iget-object v1, p0, Le/C;->j:Lj/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۨۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    iget-boolean v1, p0, Le/D;->D:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟(Ljava/lang/Object;)Ll/n0;
    .locals 2

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->r:Ll/n0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Process;
    .locals 1

    invoke-static {}, Lk0/۠ۧۢۥ;->ۢ۠ۧۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/ProcessBuilder;

    invoke-virtual {p0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/app/UiModeManager;

    invoke-virtual {p0}, Landroid/app/UiModeManager;->getNightMode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۥۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/C;

    iget-boolean v1, p0, Le/C;->o:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۢ۟(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/m;

    invoke-virtual {p0, p1}, LM0/m;->t(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۧۥۣ()I
    .locals 2

    const v0, -0x14f

    sget v1, LT0/ۣۣ۟ۤ۠;->ۢ۟ۡۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦ۟ۡۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_2

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v1, v3, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

    :cond_1
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const/16 v6, 0xa

    int-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-int v4, v4

    xor-int/2addr v4, v0

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_3
    aget-byte v5, v0, v1

    rem-int v6, v1, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

.method public static ۟ۦۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/content/Context;

    check-cast p2, [I

    check-cast p3, Landroid/util/AttributeSet;

    check-cast p4, Landroid/content/res/TypedArray;

    invoke-virtual/range {p0 .. p6}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۤۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/r;

    invoke-virtual {p0}, Le/r;->c()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۦۥۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/K;

    iget-wide v2, p0, Le/K;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۨ۟(Ljava/lang/Object;)LI0/m;
    .locals 1

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LI0/l;

    invoke-virtual {p0}, LI0/l;->a()LI0/m;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/activity/result/c;
    .locals 1

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/activity/result/g;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/reddit/frontpage/ConfigsActivity;

    check-cast p3, Landroidx/fragment/app/D;

    check-cast p4, LM0/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/activity/result/g;->c(Ljava/lang/String;Lcom/reddit/frontpage/ConfigsActivity;Landroidx/fragment/app/D;LM0/l;)Landroidx/activity/result/c;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟۟ۧ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۧۤۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, La1/۟ۦۡۥۡ;->ۢۡۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/KeyEvent;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getFlags()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/LayoutInflater;

    check-cast p1, Landroid/view/LayoutInflater$Factory2;

    invoke-virtual {p0, p1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۤۨۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e4\u06e7\u06e0"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۥۤ(Ljava/lang/Object;I)Landroid/view/View;
    .locals 1

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/k;

    invoke-virtual {p0, p1}, Le/k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۨۤ(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟۠(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityManager;
    .locals 2

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    iget-object v1, p0, LK0/g;->i:Landroid/view/accessibility/AccessibilityManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۢۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۡ۠(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lj/j;

    iget-object v1, p0, Lj/j;->a:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۡۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lj/j;

    iget-boolean v1, p0, Lj/j;->e:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۤ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LQ0/s;

    iget-wide v2, p0, LQ0/s;->c:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥۣۤۧ(Ljava/lang/Object;)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 2

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/s;

    iget-object v1, p0, LM0/s;->d:Lcom/google/android/material/internal/CheckableImageButton;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۧۦ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۨۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۟ۤۤ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۣۨ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/N;

    iget-boolean v1, p0, Le/N;->w:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟۟(Ljava/lang/Object;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 2

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroidx/activity/k;

    iget-object v1, p0, Landroidx/activity/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۧۧۥ(Ljava/lang/Object;)Lcom/google/android/material/button/MaterialButton;
    .locals 2

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LQ0/l;

    iget-object v1, p0, LQ0/l;->x:Lcom/google/android/material/button/MaterialButton;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥ۠۟(Ljava/lang/Object;)LM0/l;
    .locals 2

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/r;

    iget-object v1, p0, LM0/r;->u:LM0/l;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۨ۟([SIII)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    new-array v1, p2, [C

    .line 26
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 27
    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۣۨۢ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u06e2\u06e3\u06df"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢۥۣ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->T:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢۦ(Ljava/lang/Object;ZZ)Z
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Ljava/io/File;->setWritable(ZZ)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

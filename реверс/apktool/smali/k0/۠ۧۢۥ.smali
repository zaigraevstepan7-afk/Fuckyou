.class public Lk0/۠ۧۢۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۨۥۣۨ:I = 0x37e


# direct methods
.method public static ۟۟ۢ۠(Ljava/lang/Object;I)Landroid/view/ContentInfo$Builder;
    .locals 1

    invoke-static {}, LM0/۟ۧ۠ۢۥ;->۟ۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/ClipData;

    invoke-static {p0, p1}, LF0/e;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۨۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۤۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/ContentInfo;

    invoke-static {p0}, LF0/e;->b(Landroid/view/ContentInfo;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۤۡ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/C;

    iget-object v1, p0, LM0/C;->b:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۡۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LC0/n;

    iget-object v1, p0, LC0/n;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۤۤۦ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/material/slider/Slider;

    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx0/ۣ۟ۥ۟ۧ;->ۦۧ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    check-cast p1, Landroid/window/OnBackInvokedCallback;

    invoke-static {p0, p1}, LO/d;->f(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۨۡۨ(Ljava/lang/Object;)LM0/b;
    .locals 2

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/e;

    iget-object v1, p0, LM0/e;->k:LM0/b;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۟۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e8\u06e6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LN0/ۣۡۧۨ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lq/j;

    invoke-virtual {p0, p1, p2}, Lq/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۢ۟([SIII)Ljava/lang/String;
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

.method public static ۟ۥۣۢۨ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۦۧۥ(Ljava/lang/Object;)Landroid/graphics/Rect;
    .locals 2

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LP0/b;

    iget-object v1, p0, LP0/b;->C:Landroid/graphics/Rect;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LI0/h;

    check-cast p1, Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, LI0/h;->p(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۢ۟۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/reddit/frontpage/ConfigsActivity;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p1, Landroid/util/Property;

    check-cast p2, [F

    invoke-static {p0, p1, p2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۟ۦۧ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/N;

    iget-object v1, p0, Le/N;->v:Landroid/view/View;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۥۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۡۦۣ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

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

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۡۤۨۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/m;

    iget-object v1, p0, Le/m;->b:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۧۤ()I
    .locals 2

    const v0, -0xd4

    sget v1, La1/ۣۣ۟;->ۧۢۨۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/p;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Le/p;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۨۡۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۟۠۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LT/g;

    invoke-virtual {p0}, LT/g;->e()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۡۤۥ(Ljava/lang/Object;I)Z
    .locals 1

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/s;

    invoke-virtual {p0, p1}, LM0/s;->i(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۡ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e4\u06e3"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥۣۦ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p1, Landroid/os/LocaleList;

    invoke-static {p0, p1}, LJ/h;->w(Ljava/lang/Object;Landroid/os/LocaleList;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۦۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۦۤ۟۟(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/ViewOverlay;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧۡ۠(Ljava/lang/Object;)Lcom/google/android/material/slider/Slider;
    .locals 2

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/MainActivity;->H:Lcom/google/android/material/slider/Slider;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۡ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0, p1}, LK0/g;->n(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۨۢ۟()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_PAGE_RIGHT:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤ۠ۥ(Ljava/lang/Object;FFFFLjava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    check-cast p5, Landroid/graphics/Region$Op;

    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۦۧ(Ljava/lang/Object;)Landroid/view/ViewOverlay;
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.class public LH0/ۦۥۣۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟۠۟:I = 0x13a


# direct methods
.method public static ۟۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lq/j;

    invoke-virtual {p0, p1}, Lq/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۦۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-string v3, ""

    const-string v2, ""

    move v1, v0

    :goto_0
    const/16 v4, 0xf

    if-lt v1, v4, :cond_0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v3, v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v0, v3, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

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

    xor-int/2addr v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    const/4 v5, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_2
    aget-byte v5, v1, v0

    rem-int v6, v0, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public static ۟۠ۦۤۢ(Ljava/lang/Object;IF)F
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u06df\u06e0\u06e1"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/util/Locale;
    .locals 2

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    iget-object v1, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۤۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۥۦ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۧۥ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/D;

    invoke-virtual {p0}, Le/D;->u()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۤۦۧ()Lq/j;
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Le/G;->h:Lq/j;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥ۟ۥ()LJ/e;
    .locals 1

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Le/r;->d:LJ/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۤۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lg/۠۟ۡ;->۟ۧۦۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/ViewConfiguration;

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۥۧ(Ljava/lang/Object;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/A;

    iget-object v1, p0, LM0/A;->a:Lcom/google/android/material/textfield/TextInputLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۦ۠()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۢۧ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lg0/j;

    iget-object v1, p0, Lg0/j;->l:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۣۤ()I
    .locals 2

    const v0, -0x3cd

    sget v1, Lz/۟ۤۥۣۨ;->۟۟ۡۧۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦۣۥۡ(J)Ljava/lang/Long;
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۣ۟(Ljava/lang/Object;II)Ljava/util/List;
    .locals 1

    invoke-static {}, Landroidx/profileinstaller/ۣۤ۟ۨ;->۠۠ۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧ۠ۢ(Ljava/lang/Object;)Lk/d;
    .locals 2

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk/g;

    iget-object v1, p0, Lk/g;->i:Lk/d;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۤ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۡ۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LA/b;

    iget-object v1, p0, LA/b;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧ۠ۡ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lg/۠۟ۡ;->۟ۧۦۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    invoke-static {p0, p1}, LL/f;->d(Landroid/content/res/Configuration;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۨ۠ۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/WindowInsets$Builder;
    .locals 1

    invoke-static {}, Lk0/۠ۧۢۥ;->ۢ۠ۧۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/WindowInsets$Builder;

    check-cast p1, Landroid/graphics/Insets;

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۥۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۡ۟ۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->B:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/o;
    .locals 1

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/G;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Landroid/util/AttributeSet;

    invoke-virtual {p0, p1, p2}, Le/G;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/reddit/frontpage/MainActivity;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۥ۠ۥ([SIII)Ljava/lang/String;
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

.method public static ۡۧ۠۟(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 1

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/SharedPreferences;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/profileinstaller/ۣۤ۟ۨ;->۠۠ۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    check-cast p1, Landroid/graphics/RectF;

    check-cast p2, Landroid/graphics/Region$Op;

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۟ۡ۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/WindowInsets$Builder;
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/WindowInsets$Builder;

    check-cast p1, Landroid/graphics/Insets;

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۤ۠(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, LG/ۧۡ۠ۡ;->ۣ۟ۢۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/f;

    iget-object v1, p0, LK0/f;->c:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۤۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u06e2\u06e2\u06e3"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥ۠ۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    iget v1, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۤۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/fragment/app/g;

    invoke-virtual {p0}, Landroidx/fragment/app/g;->h()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣ۟۟()I
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Le/I;->a:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۡ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, La1/۟ۦۡۥۡ;->ۢۡۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۥۥۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06e4\u06df\u06e3"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۢ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/v;

    invoke-virtual {p0}, LM0/v;->b()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۦ۠ۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

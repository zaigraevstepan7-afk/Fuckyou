.class public LV0/ۥۤۥۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۤۧۢۥ:I = -0x201


# direct methods
.method public static ۣ۟۟ۥ۟(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/ViewPropertyAnimator;

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۢۧ()I
    .locals 2

    const v0, -0x2c0

    sget v1, Landroidx/startup/ۢۦ۟ۥ;->ۦۢ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟۟ۨ۟ۨ(FF)F
    .locals 1

    invoke-static {}, Lx0/ۣ۟ۥ۟ۧ;->ۦۧ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineCount()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠۟(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۨ۠(Ljava/lang/Object;)LI0/g;
    .locals 2

    invoke-static {}, LU/۟ۦ۠ۨۨ;->ۣۤۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LI0/h;

    iget-object v1, p0, LI0/h;->a:LI0/g;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟ۥۣ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    .locals 1

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/e;

    iget-object v1, p0, Le/e;->a:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۤۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/KeyEvent;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۢۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/Window$Callback;

    check-cast p1, Landroid/view/ActionMode;

    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۦۣۢ(Ljava/lang/Object;)LM0/n;
    .locals 2

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LM0/r;

    iget-object v1, p0, LM0/r;->v:LM0/n;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۨۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤ۟(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0, p1}, LK0/g;->setTrackHeight(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۤ۟ۧ()[Ljava/lang/Class;
    .locals 1

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Le/G;->b:[Ljava/lang/Class;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۥۦ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LM0/z;

    iget-object v1, p0, LM0/z;->f:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۨۤ(Ljava/lang/Object;IZ)V
    .locals 1

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/AbsListView;

    invoke-virtual {p0, p1, p2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۦۣ۟(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/PowerManager;

    invoke-static {p0}, Le/v;->a(Landroid/os/PowerManager;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۧۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, LG/ۧۡ۠ۡ;->ۣ۟ۢۤۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/graphics/RectF;

    iget v1, p0, Landroid/graphics/RectF;->left:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۨ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, LG/ۧۡ۠ۡ;->ۣ۟ۢۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢ۟ۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/f;

    iget v1, p0, LM0/f;->e:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧ۟ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۤ(Ljava/lang/Object;)Landroid/content/DialogInterface$OnClickListener;
    .locals 2

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/d;

    iget-object v1, p0, Le/d;->p:Landroid/content/DialogInterface$OnClickListener;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۢ۟ۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟۟(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/N;

    iget-object v1, p0, Le/N;->q:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۡ۟۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۡۦۤۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK0/c;

    iget v1, p0, LK0/c;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/math/BigDecimal;
    .locals 1

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/math/BigDecimal;

    check-cast p1, Ljava/math/BigDecimal;

    check-cast p2, Ljava/math/MathContext;

    invoke-virtual {p0, p1, p2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۦۡ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, LN/S;->j(Landroid/view/View;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۤۤ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_1

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
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

    :cond_1
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

    :cond_2
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method

.method public static ۢۤۤۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lj/d;

    invoke-virtual {p0}, Lj/d;->g()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۢۧ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lg0/j;

    iget-object v1, p0, Lg0/j;->h:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۤۧ(Ljava/lang/Object;)Landroidx/appcompat/widget/Toolbar;
    .locals 2

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ll/k1;

    iget-object v1, p0, Ll/k1;->a:Landroidx/appcompat/widget/Toolbar;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۠ۤ(Ljava/lang/Object;)Lk/m;
    .locals 2

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk/f;

    iget-object v1, p0, Lk/f;->b:Lk/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۦۣۨ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦۧۢ(Ljava/lang/Object;)Ljavax/crypto/Cipher;
    .locals 1

    invoke-static {}, LN0/ۣۡۧۨ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥ۟۟(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk/m;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lk/m;->t(Landroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۥۧۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/animation/AnimatorSet;

    check-cast p1, [Landroid/animation/Animator;

    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣۧ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۧۢۢ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/res/Resources;

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۨۦۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡ۟ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, LO/ۦۢ۠ۢ;->۟ۦۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/LocaleList;

    invoke-static {p0}, LJ/h;->y(Landroid/os/LocaleList;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡۤ۠(Ljava/lang/Object;)Ljava/text/SimpleDateFormat;
    .locals 2

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/ConfigsActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/ConfigsActivity;->z:Ljava/text/SimpleDateFormat;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۤ۠ۨ()I
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll/p1;->a:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥۧۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw0/ۨ۟ۥۥ;->ۦۤ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/reddit/frontpage/ConfigsActivity;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    check-cast p1, Lg0/B;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lg0/B;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨ۠۟۟([SIII)Ljava/lang/String;
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

.method public static ۣۨۢۧ(Ljava/lang/Object;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LM0/E;

    iget-object v1, p0, LM0/E;->d:Lcom/google/android/material/textfield/TextInputLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LN/x0;

    invoke-virtual {p0}, LN/x0;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.class public Lk/۟ۢۡۢۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۢۥ۟۟:I = -0xf8


# direct methods
.method public static ۟۟۠ۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/k;

    invoke-virtual {p0}, Le/k;->q()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟۟۠()I
    .locals 2

    const v0, -0x1ad

    sget v1, Landroidx/startup/ۢۦ۟ۥ;->ۦۢ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟۟ۦۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lw0/ۨ۟ۥۥ;->ۦۤ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/D;

    iget-boolean v1, p0, Le/D;->K:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۨۥ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/MainActivity;->A:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟۠۟()Le/J;
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Le/J;->d:Le/J;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۟ۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/k;

    invoke-virtual {p0}, Le/k;->p()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۢۡۤ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setActivated(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢ۟۠ۦ(Ljava/lang/Object;)Lcom/google/android/material/slider/Slider;
    .locals 2

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/a;

    iget-object v1, p0, LK0/a;->a:Lcom/google/android/material/slider/Slider;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۡۡ(Ljava/lang/Object;)Le/N;
    .locals 2

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->o:Le/N;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/PopupWindow;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤ۠ۡۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LA/k;

    check-cast p1, Lj/a;

    check-cast p2, Lk/m;

    invoke-virtual {p0, p1, p2}, LA/k;->l(Lj/a;Lk/m;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۤۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->end()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/ContentInfo$Builder;

    check-cast p1, Landroid/net/Uri;

    invoke-static {p0, p1}, LF0/e;->j(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥ۟ۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LW/b;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, LW/b;->m(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۨۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/ۣۡۧۨ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lj/j;

    invoke-virtual {p0}, Lj/j;->b()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨ۟۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/r;

    invoke-virtual {p0}, Le/r;->a()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۡ۟ۢ([SIII)Ljava/lang/String;
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

.method public static ۟ۧ۠ۧۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/u;

    iget v1, p0, Le/u;->k:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۨۤۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LQ0/b;

    iget v1, p0, LQ0/b;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤ۠ۨ(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-gtz v3, :cond_2

    :goto_3
    array-length v2, v0

    if-lt v1, v2, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

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
    const/4 v5, -0x1

    aget-byte v6, v0, v5

    rem-int v7, v5, v4

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    goto :goto_2

    :cond_3
    const-string v1, ""

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method public static ۢۡۡۦ(Ljava/lang/Object;)Lcom/google/android/material/button/MaterialButton;
    .locals 2

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/ConfigsActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/ConfigsActivity;->E:Lcom/google/android/material/button/MaterialButton;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LQ0/h;

    iget v1, p0, LQ0/h;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۨ(Ljava/lang/Object;)Lk/x;
    .locals 2

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ll/k;

    iget-object v1, p0, Ll/k;->e:Lk/x;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۦۥۢ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۡ۠ۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La1/۟ۦۡۥۡ;->ۢۡۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/D;

    invoke-virtual {p0}, Le/D;->I()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۢۦ۠(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۤۧۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/ViewTreeObserver;

    check-cast p1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥ۠ۥ۠(Ljava/lang/Object;)Landroid/animation/ValueAnimator;
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/m;

    iget-object v1, p0, LM0/m;->r:Landroid/animation/ValueAnimator;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۦۨ(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/emoji2/text/r;

    check-cast p1, Landroidx/emoji2/text/u;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/emoji2/text/r;->a(Landroidx/emoji2/text/u;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۥۥۤ(Ljava/lang/Object;)Lk/m;
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/M;

    iget-object v1, p0, Le/M;->d:Lk/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۨ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۦۢۢۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۥۣ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06e5\u06e2\u06e4"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۤۤ(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/res/TypedArray;

    check-cast p2, Landroid/util/TypedValue;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥ۠ۦ(Ljava/lang/Object;)Landroid/graphics/Paint;
    .locals 2

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK0/g;

    iget-object v1, p0, LK0/g;->e:Landroid/graphics/Paint;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/WindowInsets$Builder;
    .locals 1

    invoke-static {}, Landroidx/profileinstaller/ۣۤ۟ۨ;->۠۠ۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/WindowInsets$Builder;

    check-cast p1, Landroid/graphics/Insets;

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨ۠ۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;
    .locals 2

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LQ0/w;

    iget-object v1, p0, LQ0/w;->a:Landroid/content/SharedPreferences;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

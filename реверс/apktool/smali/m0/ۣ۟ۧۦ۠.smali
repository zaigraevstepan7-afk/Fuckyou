.class public Lm0/ۣ۟ۧۦ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۢۥۧۤ:I = 0x76


# direct methods
.method public static ۟۟ۤۢۥ([SIII)Ljava/lang/String;
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

.method public static ۟۟ۤۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۦۡ۠(Ljava/lang/Object;)Ll/k;
    .locals 2

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->d:Ll/k;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۨۥ()Landroidx/lifecycle/l;
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/y;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, LM0/y;->setSimpleItems([Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡ۟ۤۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, Landroid/view/View;->transformMatrixToLocal(Landroid/graphics/Matrix;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 1

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljavax/crypto/Cipher;

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۥۡۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/Locale;

    invoke-static {p0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۨۥۢ(Ljava/lang/Object;)Landroid/widget/AdapterView$OnItemSelectedListener;
    .locals 1

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getOnItemSelectedListener()Landroid/widget/AdapterView$OnItemSelectedListener;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۧۧ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0, p1}, LK0/g;->setThumbTrackGapSize(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۢۤ(Ljava/lang/Object;)Lcom/reddit/frontpage/ConfigsActivity;
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LQ0/a;

    iget-object v1, p0, LQ0/a;->b:Lcom/reddit/frontpage/ConfigsActivity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧ۠(Ljava/lang/Object;)Le/r;
    .locals 1

    invoke-static {}, Lg/۠۟ۡ;->۟ۧۦۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/k;

    invoke-virtual {p0}, Le/k;->k()Le/r;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۥۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LQ0/h;

    iget-object v1, p0, LQ0/h;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/r;

    invoke-virtual {p0}, LM0/r;->m()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۨ۟۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LI0/۟ۡۤۤ۟;->۟ۦۤ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/s;

    invoke-virtual {p0}, LM0/s;->l()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۢۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۥۨۤۥ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    check-cast p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۢۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LI0/۟ۡۤۤ۟;->۟ۦۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۥۧ(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;
    .locals 1

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, LO/d;->c(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۧ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/ProgressBar;

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۨۥۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/View$AccessibilityDelegate;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۦۡۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۠۟ۧ(Ljava/lang/Object;)Ljavax/net/ssl/SSLContext;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۦۢ(Ljava/lang/Object;)Lj/j;
    .locals 2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/N;

    iget-object v1, p0, Le/N;->H:Lj/j;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡ۠۠۟()Lq/j;
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Le/D;->h0:Lq/j;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۣ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LU/۟ۦ۠ۨۨ;->ۣۤۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/KeyEvent;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠ۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۢۦۣ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/LocaleList;

    invoke-static {p0}, LJ/h;->s(Landroid/os/LocaleList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۣ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lj/a;

    invoke-virtual {p0}, Lj/a;->a()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۤۤۥ(Ljava/lang/Object;Ljava/lang/Object;IIFLjava/lang/Object;)V
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/g;

    check-cast p1, Landroid/graphics/Canvas;

    check-cast p5, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, LK0/g;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۦۤۡ()[I
    .locals 1

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ln0/a;->H:[I

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewGroup;
    .locals 1

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/view/View;

    invoke-static {p0, p1}, Le/g;->c(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۤ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/profileinstaller/ۣۤ۟ۨ;->۠۠ۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->D:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۧۦ(Ljava/lang/Object;)Le/C;
    .locals 2

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->M:Le/C;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۤۦۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۣۤ۟(Ljava/lang/Object;)Landroid/animation/TimeInterpolator;
    .locals 2

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/e;

    iget-object v1, p0, LM0/e;->h:Landroid/animation/TimeInterpolator;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۨۨ(Ljava/lang/Object;)Landroid/graphics/Insets;
    .locals 1

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/r;
    .locals 1

    invoke-static {}, LM/۟ۤۡۦۨ;->۟۠ۥۣۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/G;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Landroid/util/AttributeSet;

    invoke-virtual {p0, p1, p2}, Le/G;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/r;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤ۟(F)F
    .locals 1

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦۢۢ(Ljava/lang/Object;)Lj/a;
    .locals 2

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lj/e;

    iget-object v1, p0, Lj/e;->b:Lj/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۧۤ()I
    .locals 2

    const v0, 0x6f

    sget v1, Lx0/ۣ۟ۥ۟ۧ;->۟۟ۧۤۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.class public Lp0/ۣۧۨۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۤۨۥ:I = 0x265


# direct methods
.method public static ۟۟ۢۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LU/۟ۦ۠ۨۨ;->ۣۤۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ll/S0;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Ll/S0;->l(Landroid/content/Context;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟۟۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/D;

    invoke-virtual {p0}, Le/D;->t()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۥۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    check-cast p2, Landroid/content/res/ColorStateList;

    check-cast p3, Landroid/graphics/PorterDuff$Mode;

    invoke-static {p0, p1, p2, p3}, LA0/e;->d(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۨۨۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LJ0/e;

    iget v1, p0, LJ0/e;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۥ۠()I
    .locals 2

    const v0, 0x327

    sget v1, LN0/۟ۥ۟ۨ۟;->ۣۣ۟ۤۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟۠۠ۨ(Ljava/lang/Object;)Landroid/text/Editable;
    .locals 1

    invoke-static {}, La0/ۣ۟ۤۥۦ;->ۤۢۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۠ۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/y;

    iget-boolean v1, p0, Le/y;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۥۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/K;

    iget-boolean v1, p0, Le/K;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/IntentFilter;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۢۢ(Ljava/lang/Object;)Lk/h;
    .locals 2

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/i;

    iget-object v1, p0, Lk/i;->f:Lk/h;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۧۢ(Ljava/lang/Object;IIII)Landroid/view/WindowInsets;
    .locals 1

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢ۠ۤ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0, p1}, LK0/g;->setThumbStrokeWidth(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۢۨۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/io/BufferedOutputStream;

    invoke-virtual {p0}, Ljava/io/BufferedOutputStream;->flush()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۥ۟۠(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Lcom/reddit/frontpage/MainActivity;->v(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lx0/ۣ۟ۥ۟ۧ;->ۦۧ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06e4\u06e6\u06e0"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    iget-boolean v1, p0, Le/D;->Q:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/h;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Le/h;->h(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧۦۣ(Ljava/lang/Object;)Landroidx/fragment/app/H;
    .locals 2

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/r;

    iget-object v1, p0, Landroidx/fragment/app/r;->t:Landroidx/fragment/app/H;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۦۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06df\u06e5\u06e6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۤ(Ljava/lang/Object;J)F
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LT/a;

    invoke-virtual {p0, p1, p2}, LT/a;->a(J)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۥۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/J;

    check-cast p1, Landroidx/fragment/app/r;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/J;->d(Landroidx/fragment/app/r;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۣ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/g;

    iget v1, p0, Le/g;->z:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۤۥۥ([SIII)Ljava/lang/String;
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

.method public static ۧۦۨۤ(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/graphics/RectF;->width()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۨۤۢ(Ljava/lang/Object;)Landroid/view/Window;
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۨۦۢ(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/location/Location;

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

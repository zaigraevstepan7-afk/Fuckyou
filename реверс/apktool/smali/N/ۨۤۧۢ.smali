.class public LN/ۨۤۧۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۧۥۦۤ:I = 0x15a


# direct methods
.method public static ۟۟۟۠ۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e2\u06df\u06e8"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۤۡۦ(D)D
    .locals 2

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    check-cast p1, Landroid/view/KeyEvent;

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۤۦ(Ljava/lang/Object;)Landroid/view/MotionEvent;
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/MotionEvent;

    invoke-static {p0}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۤۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/reddit/frontpage/MainActivity;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/activity/k;

    check-cast p1, LM/a;

    invoke-virtual {p0, p1}, Landroidx/activity/k;->g(LM/a;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡ۠ۦ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LA/j;

    iget v1, p0, LA/j;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۧۥ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/DialogInterface$OnClickListener;

    check-cast p1, Landroid/content/DialogInterface;

    invoke-interface {p0, p1, p2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥ۠ۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/ۣۡۧۨ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroidx/emoji2/text/i;

    check-cast p1, LT/m;

    invoke-interface {p0, p1}, Landroidx/emoji2/text/i;->j(LT/m;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۟ۢۨ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤ۟ۢ۟(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/KeyEvent;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۢۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    invoke-virtual {p0}, Lcom/reddit/frontpage/MainActivity;->F()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۣۨ()I
    .locals 2

    const v0, 0x2e2

    sget v1, LC/ۣ۟ۦۨ;->ۣۧۡۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦۤۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lg/۠۟ۡ;->۟ۧۦۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۦۢ(Ljava/lang/Object;II)I
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۢۡۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LA/k;

    iget-object v1, p0, LA/k;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۨۨ۠([SIII)Ljava/lang/String;
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

.method public static ۡ۠ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    check-cast p1, Landroid/graphics/Path;

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۡۧۥ()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۤۤ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/G;

    iget-object v1, p0, Le/G;->a:[Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۨۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۟ۡ۠(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۨۥ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->close()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۢۢ(Ljava/lang/Object;IIII)V
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setLeftTopRightBottom(IIII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۧۤ(Ljava/lang/Object;)Lcom/reddit/frontpage/MainActivity;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LQ0/v;

    iget-object v1, p0, LQ0/v;->a:Lcom/reddit/frontpage/MainActivity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/Locale;

    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤ۟(I)Z
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۦۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۥۣ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget v1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 1

    invoke-static {}, LO/ۦۢ۠ۢ;->۟ۦۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۢۨ۟(Ljava/lang/Object;)Landroid/view/ViewParent;
    .locals 1

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/ViewParent;

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LO/ۦۢ۠ۢ;->۟ۦۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    check-cast p1, Landroidx/activity/p;

    invoke-static {p0, p1}, LO/d;->g(Landroid/window/OnBackInvokedDispatcher;Landroidx/activity/p;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۤۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk/w;

    invoke-virtual {p0}, Lk/w;->b()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lq/g;

    invoke-virtual {p0, p1}, Lq/g;->add(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۢۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۢۡۢ(Ljava/lang/Object;)Landroid/content/res/ColorStateList;
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/y;

    iget-object v1, p0, LM0/y;->j:Landroid/content/res/ColorStateList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۥۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/res/Configuration;

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LK0/g;

    check-cast p1, Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, LK0/g;->setTickActiveTintList(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۣ۠ۥ(Ljava/lang/Object;ZZ)Z
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    invoke-virtual {p0, p1, p2}, Le/D;->k(ZZ)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۡۡ(Ljava/lang/Object;I)Z
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/Window;

    invoke-virtual {p0, p1}, Landroid/view/Window;->hasFeature(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

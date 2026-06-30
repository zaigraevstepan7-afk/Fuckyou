.class public LN0/ۣۡۧۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦۨ۠ۦ:I = -0x1e1


# direct methods
.method public static ۣ۟۟۟۟()Z
    .locals 1

    invoke-static {}, La1/۟ۦۡۥۡ;->ۢۡۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-boolean v0, Le/D;->j0:Z

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LK0/g;

    check-cast p1, Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, LK0/g;->setTrackActiveTintList(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡۨۡ۟(Ljava/lang/Object;)Lcom/reddit/frontpage/ConfigsActivity;
    .locals 2

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LQ0/e;

    iget-object v1, p0, LQ0/e;->a:Lcom/reddit/frontpage/ConfigsActivity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۨۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LQ0/o;

    iget v1, p0, LQ0/o;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۧۡ(Ljava/lang/Object;)Le/G;
    .locals 2

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->e0:Le/G;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۟ۡ()I
    .locals 2

    const v0, 0x67

    sget v1, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۣ۟ۢۨۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۦ۟۠(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۤۡۢ([SIII)Ljava/lang/String;
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

.method public static ۟ۤۤۨ۟(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠۠ۤ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/l;

    iget-object v1, p0, LM0/l;->a:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۡۨ(Ljava/lang/Object;)Landroid/view/ViewParent;
    .locals 1

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx0/ۣ۟ۥ۟ۧ;->ۦۧ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LA/c;

    check-cast p1, LA/f;

    invoke-virtual {p0, p1}, LA/c;->c(LA/f;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧ۠ۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->top:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx0/ۣ۟ۥ۟ۧ;->ۦۧ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/y;

    invoke-static {p0, p1}, LM0/y;->a(LM0/y;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۡ۟ۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->F:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۥۤ(Ljava/lang/Object;)Le/d;
    .locals 2

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/c;

    iget-object v1, p0, Le/c;->b:Le/d;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lp0/ۣۧۨۥ;->۟ۢۢۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۦۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 1

    invoke-static {}, LM0/۟ۧ۠ۢۥ;->۟ۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ll/d1;

    check-cast p1, Lk/m;

    invoke-virtual {p0, p1}, Ll/d1;->v(Lk/m;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    check-cast p1, Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, LK0/g;->setTickInactiveTintList(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۤۦۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤۦۤۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityManager;
    .locals 2

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/r;

    iget-object v1, p0, LM0/r;->t:Landroid/view/accessibility/AccessibilityManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۦۡۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦ۟ۢۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LI0/h;

    invoke-virtual {p0}, LI0/h;->invalidateSelf()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۥۤۡ(Ljava/lang/Object;)Landroidx/appcompat/widget/ActionBarOverlayLayout;
    .locals 2

    invoke-static {}, Lw0/ۨ۟ۥۥ;->ۦۤ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/N;

    iget-object v1, p0, Le/N;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LQ0/q;

    iget-object v1, p0, LQ0/q;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۧۨ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lw0/ۨ۟ۥۥ;->ۦۤ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/m;

    invoke-virtual {p0, p1}, Lk/m;->setQwertyMode(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧۥۣ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/concurrent/ThreadPoolExecutor;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۢ۠(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

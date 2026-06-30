.class public Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟۠۟۟:I = 0xba


# direct methods
.method public static ۟۟ۤۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۣۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/p;

    invoke-virtual {p0}, Le/p;->a()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۦۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/Window$Callback;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠۟ۥۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LG/ۧۡ۠ۡ;->ۣ۟ۢۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/v;

    iget v1, p0, LM0/v;->n:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۥۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۡۢۡۤ(Ljava/lang/Object;IF)F
    .locals 1

    invoke-static {}, Lz/۟ۤۥۣۨ;->ۣ۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۡۢ(Ljava/lang/Object;J)Landroid/animation/ValueAnimator;
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/animation/ValueAnimator;

    invoke-virtual {p0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤۨ(Ljava/lang/Object;)Le/E;
    .locals 2

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/h;

    iget-object v1, p0, Le/h;->e:Le/E;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۠ۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/KeyCharacterMap;

    invoke-virtual {p0}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۢ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LO/ۦۢ۠ۢ;->۟ۦۣۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0}, LK0/g;->z()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    check-cast p1, [Ljava/lang/Class;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۢۨ(Ljava/lang/Object;I)Z
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/Window;

    invoke-virtual {p0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥ۟ۢ(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۦۦ(Ljava/lang/Object;)Landroid/util/SparseArray;
    .locals 2

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LA/i;

    iget-object v1, p0, LA/i;->c:Landroid/util/SparseArray;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/ActionMode$Callback;

    check-cast p1, Landroid/view/ActionMode;

    check-cast p2, Landroid/view/MenuItem;

    invoke-interface {p0, p1, p2}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۢۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥۦۦ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->j:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧۨۨ()I
    .locals 2

    const v0, -0x107

    sget v1, Lcom/google/android/material/datepicker/ۨۨۨۡ;->۟ۡۡ۠ۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦ۟۟۠(Ljava/lang/Object;I)Z
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LW/b;

    invoke-virtual {p0, p1}, LW/b;->j(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۢۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/profileinstaller/ۣۤ۟ۨ;->۠۠ۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/k;

    invoke-virtual {p0}, Le/k;->m()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۢۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/Dialog;

    check-cast p1, Landroid/content/DialogInterface$OnShowListener;

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۠ۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/D;

    check-cast p1, Le/C;

    check-cast p2, Landroid/view/KeyEvent;

    invoke-virtual/range {p0 .. p2}, Le/D;->G(Le/C;Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/D;

    check-cast p1, Le/C;

    check-cast p2, Landroid/view/KeyEvent;

    invoke-virtual {p0, p1, p2}, Le/D;->E(Le/C;Landroid/view/KeyEvent;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡ۠۠ۤ(Ljava/lang/Object;)Le/t;
    .locals 2

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->t:Le/t;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۡۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LQ0/u;

    iget v1, p0, LQ0/u;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۥۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, LT/m;->s(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۤ۟(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LO/ۦۢ۠ۢ;->۟ۦۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Lj/e;
    .locals 1

    invoke-static {}, LI0/۟ۡۤۤ۟;->۟ۦۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/y;

    check-cast p1, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Le/y;->e(Landroid/view/ActionMode$Callback;)Lj/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۣ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۦ۠ۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lq/b;

    invoke-virtual {p0}, Lq/b;->remove()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۢۥ(Ljava/lang/Object;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧۤ(Ljava/lang/Object;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 2

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/MainActivity;->E:Lcom/google/android/material/textfield/TextInputEditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟۠(Ljava/lang/Object;)LA/b;
    .locals 2

    invoke-static {}, Lh0/۟۠ۤۡۦ;->۟ۡۨۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/k;

    iget-object v1, p0, Le/k;->s:LA/b;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥ۟ۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LN/ۨۤۧۢ;->۟ۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/D;

    iget v1, p0, Le/D;->U:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥۦۤ(Ljava/lang/Object;FFLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    check-cast p3, Landroid/graphics/Paint;

    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۧۡۡ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۧۦ۟()Landroid/graphics/Paint$Style;
    .locals 1

    invoke-static {}, LN0/ۣۡۧۨ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۨۡ۟(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LN/a0;

    iget-object v1, p0, LN/a0;->a:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۨۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧ۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧ۠ۡۧ(Ljava/lang/Object;)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥۦ۠(Ljava/lang/Object;)Le/k;
    .locals 2

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/fragment/app/t;

    iget-object v1, p0, Landroidx/fragment/app/t;->t:Le/k;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢۡ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lg0/d;

    invoke-virtual {p0}, Lg0/d;->run()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۦۤۧ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۨۦ(Ljava/lang/Object;)Landroid/view/View$OnFocusChangeListener;
    .locals 1

    invoke-static {}, LU/۟ۦ۠ۨۨ;->ۣۤۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

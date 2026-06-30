.class public Lg/۠۟ۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥ۟۟ۤ:I = 0x186


# direct methods
.method public static ۟۟ۡۦۧ(Ljava/lang/Object;)LI0/h;
    .locals 2

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:LI0/h;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb0/۟ۡۦۣۤ;->۟ۤۡۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ll/y;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Ll/y;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu0/۟ۤ۠ۨۨ;->ۢۢۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡۨۦ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۤۢۤۦ;->ۡ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/v;

    iget-object v1, p0, LM0/v;->g:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۥۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/AbstractCollection;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۟ۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/ConfigsActivity;

    invoke-virtual {p0}, Lcom/reddit/frontpage/ConfigsActivity;->t()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LN/l;

    iget-object v1, p0, LN/l;->a:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;
    .locals 1

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/D;

    check-cast p1, Landroid/view/View;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Landroid/util/AttributeSet;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/D;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢ۟ۥ(Ljava/lang/Object;)LI0/m;
    .locals 2

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, LI0/g;

    iget-object v1, p0, LI0/g;->a:LI0/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۧ۠(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۤۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/Message;

    iget v1, p0, Landroid/os/Message;->what:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۟ۡ()Landroid/graphics/Paint$Style;
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۠ۦ([SIII)Ljava/lang/String;
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

.method public static ۣ۟ۡ۠ۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lk0/۠ۧۢۥ;->ۢ۠ۧۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/fragment/app/r;

    iget-boolean v1, p0, Landroidx/fragment/app/r;->A:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, LU/۟ۦ۠ۨۨ;->ۣۤۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/text/DateFormat;

    check-cast p1, Ljava/util/Date;

    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۨۦ(Ljava/lang/Object;)Landroid/graphics/PorterDuff$Mode;
    .locals 2

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/r;

    iget-object v1, p0, LM0/r;->l:Landroid/graphics/PorterDuff$Mode;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟۠(Ljava/lang/Object;I)Landroid/content/res/ColorStateList;
    .locals 1

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LN/l;

    invoke-virtual {p0, p1}, LN/l;->g(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡ۟ۤ(Ljava/lang/Object;)LC0/c;
    .locals 2

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:LC0/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡ۠۠(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/security/MessageDigest;

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦ۟۠۟(Ljava/lang/Object;)Le/s;
    .locals 2

    invoke-static {}, Li0/۟۟ۤۦۤ;->ۣ۟ۧۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/D;

    iget-object v1, p0, Le/D;->x:Le/s;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۡ۠(Ljava/lang/Object;)Le/D;
    .locals 2

    invoke-static {}, Lx/۟۟ۦۣ۠;->۟ۥۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/s;

    iget-object v1, p0, Le/s;->b:Le/D;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۧۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/DialogInterface;

    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۧۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LI0/۟ۡۤۤ۟;->۟ۦۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۦۦۦ()I
    .locals 2

    const v0, 0x2c8

    sget v1, Lt/ۦۧۤۧ;->ۥ۟ۥۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۠ۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ll/K0;

    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Ll/K0;->n(Landroid/widget/ListAdapter;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۠ۤۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LM0/۟ۧ۠ۢۥ;->۟ۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/r;

    invoke-virtual {p0}, Le/r;->d()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۥۥۢ(Ljava/lang/Object;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/s;

    iget-object v1, p0, LM0/s;->a:Lcom/google/android/material/textfield/TextInputLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤۦۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۨ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۡۢۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/b;

    iget-object v1, p0, LK0/b;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۤۢۤ(Ljava/lang/Object;)LQ0/n;
    .locals 2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LQ0/d;

    iget-object v1, p0, LQ0/d;->d:LQ0/n;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld0/ۥۦۤۧ;->ۥۨۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    check-cast p1, Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۦ۟ۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/v;

    iget v1, p0, LM0/v;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۦ۠ۨ(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, LX/۟ۥۤۢ۟;->ۣۤۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/pm/ServiceInfo;

    iget-object v1, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۥ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06e5\u06e1\u06e6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۤۧ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lg0/j;

    iget-object v1, p0, Lg0/j;->j:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۥۢۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LM/۟ۤۡۦۨ;->۟۠ۥۣۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e2\u06e1"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥۥۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/io/InputStream;

    invoke-static {p0}, Lcom/reddit/frontpage/MainActivity;->E(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۧ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/s;

    invoke-virtual {p0}, Le/s;->run()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۧۧۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۧۡۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۢ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw0/ۨ۟ۥۥ;->ۦۤ۟ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p2, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۦ۟ۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lk0/ۨ۟۟ۦ;->ۢ۟۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/F;

    iget-object v1, p0, Le/F;->d:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۨ۠(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/CompoundButton$OnCheckedChangeListener;

    check-cast p1, Landroid/widget/CompoundButton;

    invoke-interface {p0, p1, p2}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۧۦۨ(Ljava/lang/Object;IJ)LN/a0;
    .locals 1

    invoke-static {}, LN0/۟ۥ۟ۨ۟;->ۣ۟ۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarContextView;->i(IJ)LN/a0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/AdapterView;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۨۨ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;
    .locals 1

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/w;

    check-cast p1, Landroid/view/View;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Landroid/util/AttributeSet;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/w;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

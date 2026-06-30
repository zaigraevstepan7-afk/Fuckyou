.class public La1/ۣۣ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۧۢۨۧ:I = -0x1e6


# direct methods
.method public static ۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK/j;

    iget-object v1, p0, LK/j;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    check-cast p1, [I

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۤۡۧ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۧۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Field;
    .locals 1

    invoke-static {}, Ll0/ۤ۟ۨۧ;->ۧۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۢۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget v1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld0/ۡۨ;->ۥۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/Window;

    check-cast p1, Landroid/view/Window$Callback;

    invoke-virtual {p0, p1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡ۠ۧۡ(Ljava/lang/Object;FFFFLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lq/۟ۢۥۨۡ;->ۣ۟ۡۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    check-cast p5, Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡۤۤۤ(Ljava/lang/Object;)Ljava/security/MessageDigest;
    .locals 1

    invoke-static {}, Lk/۟ۢۡۢۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۢ۠(Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    invoke-static {}, LV0/ۥۤۥۡ;->۟۟ۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/k;

    invoke-static {p0}, LC/h;->a(Le/k;)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۤ(Ljava/lang/Object;)Landroidx/core/widget/NestedScrollView;
    .locals 2

    invoke-static {}, Lq/ۤۡۨۡ;->ۤ۟ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Le/g;

    iget-object v1, p0, Le/g;->r:Landroidx/core/widget/NestedScrollView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۤۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۨۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->ۥۡ۟۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Le/g;

    iget-boolean v1, p0, Le/g;->h:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۤۧ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۨۦۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK0/g;

    iget-object v1, p0, LK0/g;->m:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡ۟ۢ(Ljava/lang/Object;)LM0/a;
    .locals 2

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/z;

    iget-object v1, p0, LM0/z;->g:LM0/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۡۡ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۨۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LM0/v;

    iget-object v1, p0, LM0/v;->i:Landroid/widget/LinearLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۦ(Ljava/lang/Object;IF)Z
    .locals 1

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LK0/g;

    invoke-virtual {p0, p1, p2}, LK0/g;->s(IF)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۤۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۥۥ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LT0/۟ۥ۟ۥۡ;->۠ۦ۟ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨ۟ۨ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, LP0/۟ۨۧۡ;->ۣ۟۠ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/MainActivity;

    iget-object v1, p0, Lcom/reddit/frontpage/MainActivity;->B:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۦۤ(Ljava/lang/Object;)Ljava/security/PublicKey;
    .locals 1

    invoke-static {}, LH0/ۦۥۣۥ;->۟ۥۦۣۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/security/cert/Certificate;

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۥۡ(Ljava/lang/Object;)Landroidx/lifecycle/t;
    .locals 2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Le/k;

    iget-object v1, p0, Le/k;->t:Landroidx/lifecycle/t;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۠ۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LR/ۣ۟ۤ۟ۧ;->ۣ۟ۤ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LM0/r;

    invoke-virtual {p0}, LM0/r;->l()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LN0/۠ۧۢۧ;->ۧۢۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LN/p0;

    check-cast p1, LF/c;

    invoke-virtual {p0, p1}, LN/p0;->g(LF/c;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۧۨۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/reddit/frontpage/ConfigsActivity;

    invoke-virtual {p0}, Lcom/reddit/frontpage/ConfigsActivity;->y()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۤۤۥ(Ljava/lang/Object;)Landroid/content/ComponentName;
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljavax/net/ssl/SSLContext;

    check-cast p1, [Ljavax/net/ssl/KeyManager;

    check-cast p2, [Ljavax/net/ssl/TrustManager;

    check-cast p3, Ljava/security/SecureRandom;

    invoke-virtual {p0, p1, p2, p3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠۠ۢۧ()I
    .locals 2

    const v0, -0x385

    sget v1, LM0/۟ۧ۠ۢۥ;->۠ۡ۟ۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۠ۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LA0/۟ۧ۟ۦۦ;->۟ۥ۟ۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/text/Editable;

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۥۣۤ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, LK0/g;

    iget v1, p0, LK0/g;->N:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۣ۠([SIII)Ljava/lang/String;
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

.method public static ۣ۠ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/animation/Animator;

    check-cast p1, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۡۥ(Ljava/lang/Object;)Landroid/content/res/ColorStateList;
    .locals 2

    invoke-static {}, LW/۟ۡۤۡ;->۟ۧۧ۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/r;

    iget-object v1, p0, LM0/r;->d:Landroid/content/res/ColorStateList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۥۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr/۠ۨۦۢ;->۟ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/activity/k;

    check-cast p1, La/b;

    invoke-virtual {p0, p1}, Landroidx/activity/k;->h(La/b;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۠ۥ(Ljava/lang/Object;)Lcom/reddit/frontpage/ConfigsActivity;
    .locals 2

    invoke-static {}, Li0/ۨۤ۟ۢ;->۟ۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LQ0/d;

    iget-object v1, p0, LQ0/d;->a:Lcom/reddit/frontpage/ConfigsActivity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۥۧ(Ljava/lang/Object;)Landroid/view/View;
    .locals 1

    invoke-static {}, La1/ۣۣ۟;->۠۠ۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۥۡۢ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Lt/ۦۧۤۧ;->ۢ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦۦ۠(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, La0/ۣۣ۟ۡ۠;->ۦۤۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, [B

    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۦۨۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۤۨۦ۟(Ljava/lang/Object;II)I
    .locals 1

    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->۟ۧ۟۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۧ(Ljava/lang/Object;)Ll/o0;
    .locals 2

    invoke-static {}, Lg/۠۟ۡ;->۟ۧۦۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:Ll/o0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۦۨۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۦۡۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/lifecycle/t;

    invoke-virtual {p0}, Landroidx/lifecycle/t;->g()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۧ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lg0/ۧۥۦۡ;->ۤۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u06e8\u06e4"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/ۢ۠ۧۤ;->۟۟۠ۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۤۢۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lo0/۟ۤ۠۠ۢ;->۟۠ۥۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, LA/f;

    iget-boolean v1, p0, LA/f;->m:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۤۡۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lb0/ۣۣ۟۠ۢ;->۟ۦۣۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06e1\u06e5\u06e1"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۡ۠(Ljava/lang/Object;)Landroidx/fragment/app/g;
    .locals 2

    invoke-static {}, LC/ۣ۟ۦۨ;->ۣ۟ۡۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Le/A;

    iget-object v1, p0, Le/A;->a:Landroidx/fragment/app/g;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢ۟ۦ(Ljava/lang/Object;)LM0/b;
    .locals 2

    invoke-static {}, LX0/ۤۤ۠ۡ;->۟ۢ۟ۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, LM0/m;

    iget-object v1, p0, LM0/m;->j:LM0/b;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

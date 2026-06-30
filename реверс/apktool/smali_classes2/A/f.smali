.class public final LA/f;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public a:LA/c;

.field public b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Landroid/view/View;

.field public l:Landroid/view/View;

.field public m:Z

.field public n:Z

.field public final o:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x5

    const-class v1, LA/f;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_5_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, -0x2

    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LA/f;->b:Z

    iput v0, p0, LA/f;->c:I

    iput v0, p0, LA/f;->d:I

    const/4 v1, -0x1

    iput v1, p0, LA/f;->e:I

    iput v1, p0, LA/f;->f:I

    iput v0, p0, LA/f;->g:I

    iput v0, p0, LA/f;->h:I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LA/f;->o:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(LA/f;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LA/f;->b:Z

    iput p1, p0, LA/f;->c:I

    iput p1, p0, LA/f;->d:I

    const/4 v0, -0x1

    iput v0, p0, LA/f;->e:I

    iput v0, p0, LA/f;->f:I

    iput p1, p0, LA/f;->g:I

    iput p1, p0, LA/f;->h:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LA/f;->o:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LA/f;->b:Z

    iput v0, p0, LA/f;->c:I

    iput v0, p0, LA/f;->d:I

    const/4 v1, -0x1

    iput v1, p0, LA/f;->e:I

    iput v1, p0, LA/f;->f:I

    iput v0, p0, LA/f;->g:I

    iput v0, p0, LA/f;->h:I

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, LA/f;->o:Landroid/graphics/Rect;

    invoke-static {}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟ۢ۠ۧۦ()[I

    move-result-object v2

    invoke-static {p1, p2, v2}, LU/۟ۦ۠ۨۨ;->۟ۤۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-static {v2, v0, v0}, La1/ۣۣ۟;->ۤۨۦ۟(Ljava/lang/Object;II)I

    move-result v3

    iput v3, p0, LA/f;->c:I

    const/4 v3, 0x1

    invoke-static {v2, v3, v1}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result v4

    iput v4, p0, LA/f;->f:I

    const/4 v4, 0x2

    invoke-static {v2, v4, v0}, La1/ۣۣ۟;->ۤۨۦ۟(Ljava/lang/Object;II)I

    move-result v5

    iput v5, p0, LA/f;->d:I

    const/4 v5, 0x6

    invoke-static {v2, v5, v1}, La1/ۣۣ۟;->ۤۨۦ۟(Ljava/lang/Object;II)I

    move-result v1

    iput v1, p0, LA/f;->e:I

    const/4 v1, 0x5

    invoke-static {v2, v1, v0}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v1

    iput v1, p0, LA/f;->g:I

    const/4 v1, 0x4

    invoke-static {v2, v1, v0}, LG/ۧۡ۠ۡ;->ۣۣ۟ۤۧ(Ljava/lang/Object;II)I

    move-result v1

    iput v1, p0, LA/f;->h:I

    const/4 v1, 0x3

    invoke-static {v2, v1}, Lcom/google/android/material/datepicker/ۨۨۨۡ;->ۧ۟ۨ۟(Ljava/lang/Object;I)Z

    move-result v5

    iput-boolean v5, p0, LA/f;->b:Z

    if-eqz v5, :cond_6

    invoke-static {v2, v1}, Lr/۠ۨۦۢ;->ۨۤۧ۟(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۦ۟۟()Ljava/lang/String;

    invoke-static {v1}, LO/ۦۢ۠ۢ;->ۦ۠ۦۢ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 p1, 0x0

    goto/16 :goto_1

    :cond_0
    invoke-static {}, LA/f;->۟ۧۡۦۣ()[S

    move-result-object v5

    const/16 v6, 0x8a8

    invoke-static {v5, v0, v3, v6}, Lx/۟۟ۦۣ۠;->ۣۧۨ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lm0/ۣ۟ۧۦ۠;->۟ۦۢۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, LH0/ۦۥۣۥ;->ۧۦ۠ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lz/۟ۤۥۣۨ;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v1}, Lz/۟ۤۥۣۨ;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll0/ۤ۟ۨۧ;->ۡۧۥۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/16 v5, 0x2e

    invoke-static {v1, v5}, Lk0/ۨ۟۟ۦ;->۟۠ۥ۟ۧ(Ljava/lang/Object;I)I

    move-result v6

    if-ltz v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, LT0/ۣۣ۟ۤ۠;->ۦ۟۟()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LO/ۦۢ۠ۢ;->ۦ۠ۦۢ(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7, v6}, Lz/۟ۤۥۣۨ;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v7, v5}, LT0/۟ۥ۟ۥۡ;->ۣ۟ۧۢ۠(Ljava/lang/Object;C)Ljava/lang/StringBuilder;

    invoke-static {v7, v1}, Lz/۟ۤۥۣۨ;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Ll0/ۤ۟ۨۧ;->ۡۧۥۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_0
    :try_start_0
    invoke-static {}, LT0/۟ۥ۟ۥۡ;->ۥۣۧۧ()Ljava/lang/ThreadLocal;

    move-result-object v5

    invoke-static {v5}, La1/۟ۦۡۥۡ;->ۣۧۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    if-nez v6, :cond_4

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-static {v5, v6}, LC/ۣ۟ۦۨ;->۟ۦۨ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    invoke-static {v6, v1}, Lg0/ۢ۠ۧۤ;->ۥ۟ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Constructor;

    if-nez v5, :cond_5

    invoke-static {p1}, Lx0/ۣ۟ۥ۟ۧ;->ۤۨۧۧ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-static {v1, v0, v5}, LU/۟ۦ۠ۨۨ;->۟ۥۣ۟ۢ(Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {}, LM0/۟ۧ۠ۢۥ;->۟ۧۤۤ()[Ljava/lang/Class;

    move-result-object v7

    invoke-static {v5, v7}, LR/ۣ۟ۤ۟ۧ;->۟ۢۤۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-static {v5, v3}, LX/۟ۥۤۢ۟;->ۡۡۥ(Ljava/lang/Object;Z)V

    invoke-static {v6, v1, v5}, Lo0/۟ۤ۠۠ۢ;->ۣ۟ۤ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    aput-object p2, v4, v3

    invoke-static {v5, v4}, Lx0/ۣ۟ۥ۟ۧ;->ۦۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iput-object p1, p0, LA/f;->a:LA/c;

    goto :goto_2

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-static {}, LA/f;->۟ۧۡۦۣ()[S

    move-result-object v0

    const/16 v2, 0x24

    const/16 v4, 0x875

    invoke-static {v0, v3, v2, v4}, LN0/ۣۡۧۨ;->ۣ۟ۤۡۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v1}, Lz/۟ۤۥۣۨ;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {p2}, Ll0/ۤ۟ۨۧ;->ۡۧۥۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    :goto_2
    invoke-static {v2}, Lb0/۟ۡۦۣۤ;->ۡ۠۠ۦ(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/android/material/appbar/ۤۦۦۤ;->۠ۧۤ۠(Ljava/lang/Object;)LA/c;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1, p0}, LN0/ۣۡۧۨ;->۟ۦۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LA/f;->b:Z

    iput p1, p0, LA/f;->c:I

    iput p1, p0, LA/f;->d:I

    const/4 v0, -0x1

    iput v0, p0, LA/f;->e:I

    iput v0, p0, LA/f;->f:I

    iput p1, p0, LA/f;->g:I

    iput p1, p0, LA/f;->h:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LA/f;->o:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LA/f;->b:Z

    iput p1, p0, LA/f;->c:I

    iput p1, p0, LA/f;->d:I

    const/4 v0, -0x1

    iput v0, p0, LA/f;->e:I

    iput v0, p0, LA/f;->f:I

    iput p1, p0, LA/f;->g:I

    iput p1, p0, LA/f;->h:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, LA/f;->o:Landroid/graphics/Rect;

    return-void
.end method

.method public static native ۟ۧۡۦۣ()[S
.end method


# virtual methods
.method public final native a(I)Z
.end method

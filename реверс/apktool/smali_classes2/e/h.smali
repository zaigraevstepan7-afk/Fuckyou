.class public final Le/h;
.super Landroidx/activity/l;
.source "Dex2C"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Le/l;


# instance fields
.field public d:Le/D;

.field public final e:Le/E;

.field public final f:Le/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x69

    const-class v1, Le/h;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_105_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    invoke-static {p1, p2}, LR/ۣ۟ۤ۟ۧ;->ۣۦۤ(Ljava/lang/Object;I)I

    move-result p2

    const/4 v0, 0x1

    const v1, 0x7f03017b

    if-nez p2, :cond_0

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-static {p1}, Lg0/ۢ۠ۧۤ;->۟ۥۡۥۥ(Ljava/lang/Object;)Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-static {v3, v1, v2, v0}, Ld0/ۡۨ;->ۣ۟۟۟ۡ(Ljava/lang/Object;ILjava/lang/Object;Z)Z

    invoke-static {v2}, La0/ۣۣ۟ۡ۠;->ۤۨۤۤ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    invoke-direct {p0, p1, v2}, Landroidx/activity/l;-><init>(Landroid/content/Context;I)V

    new-instance v2, Le/E;

    invoke-direct {v2, p0}, Le/E;-><init>(Le/h;)V

    iput-object v2, p0, Le/h;->e:Le/E;

    invoke-static {p0}, LM/۟ۤۡۦۨ;->۟ۢۧۦۢ(Ljava/lang/Object;)Le/r;

    move-result-object v2

    if-nez p2, :cond_1

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-static {p1}, Lg0/ۢ۠ۧۤ;->۟ۥۡۥۥ(Ljava/lang/Object;)Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1, v1, p2, v0}, Ld0/ۡۨ;->ۣ۟۟۟ۡ(Ljava/lang/Object;ILjava/lang/Object;Z)Z

    invoke-static {p2}, La0/ۣۣ۟ۡ۠;->ۤۨۤۤ(Ljava/lang/Object;)I

    move-result p2

    :cond_1
    move-object p1, v2

    check-cast p1, Le/D;

    iput p2, p1, Le/D;->T:I

    invoke-static {v2}, Lx/۟۟ۦۣ۠;->۟ۧۦ۟(Ljava/lang/Object;)V

    new-instance p1, Le/g;

    invoke-static {p0}, LU/۟ۦ۠ۨۨ;->۟ۥۤ۟ۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p0}, Ld0/ۡۨ;->ۦ۠ۨۧ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, Le/g;-><init>(Landroid/content/Context;Le/h;Landroid/view/Window;)V

    iput-object p1, p0, Le/h;->f:Le/g;

    return-void
.end method

.method public static native g(Landroid/content/Context;I)I
.end method

.method public static native ۟ۥ۠۠ۤ(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public final native dismiss()V
.end method

.method public final native dispatchKeyEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native e()Le/r;
.end method

.method public final native f(Landroid/os/Bundle;)V
.end method

.method public final native findViewById(I)Landroid/view/View;
.end method

.method public final native h(Ljava/lang/CharSequence;)V
.end method

.method public final native i(Landroid/view/KeyEvent;)Z
.end method

.method public final native invalidateOptionsMenu()V
.end method

.method public final native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native onKeyDown(ILandroid/view/KeyEvent;)Z
.end method

.method public final native onKeyUp(ILandroid/view/KeyEvent;)Z
.end method

.method public final native onStop()V
.end method

.method public final native setContentView(I)V
.end method

.method public final native setContentView(Landroid/view/View;)V
.end method

.method public final native setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public final native setTitle(I)V
.end method

.method public final native setTitle(Ljava/lang/CharSequence;)V
.end method

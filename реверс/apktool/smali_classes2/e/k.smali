.class public abstract Le/k;
.super Landroidx/activity/k;
.source "Dex2C"

# interfaces
.implements Le/l;
.implements LC/d;


# static fields
.field private static final short:[S


# instance fields
.field public final s:LA/b;

.field public final t:Landroidx/lifecycle/t;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Le/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x50

    const-class v1, Le/k;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_80_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Landroidx/activity/k;-><init>()V

    new-instance v0, LA/b;

    new-instance v1, Landroidx/fragment/app/t;

    invoke-direct {v1, p0}, Landroidx/fragment/app/t;-><init>(Le/k;)V

    const/16 v2, 0x10

    invoke-direct {v0, v2, v1}, LA/b;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/k;->s:LA/b;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Le/k;->t:Landroidx/lifecycle/t;

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/k;->w:Z

    invoke-static {p0}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣ۟ۢ۟ۧ(Ljava/lang/Object;)Landroidx/activity/m;

    move-result-object v1

    invoke-static {v1}, Lq/۟ۢۥۨۡ;->۟ۥۧۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/d;

    new-instance v2, Landroidx/activity/e;

    invoke-direct {v2, v0, p0}, Landroidx/activity/e;-><init>(ILjava/lang/Object;)V

    invoke-static {}, Le/k;->۟ۦۣۤۧ()[S

    move-result-object v3

    const/16 v4, 0x6e9

    const/4 v5, 0x0

    const/16 v6, 0x19

    invoke-static {v3, v5, v6, v4}, Lr/۠ۨۦۢ;->ۧۢۡ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v2}, Lh0/۟۠ۤۡۦ;->۟ۤۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroidx/fragment/app/s;

    invoke-direct {v1, p0, v5}, Landroidx/fragment/app/s;-><init>(Le/k;I)V

    invoke-static {p0, v1}, LN/ۨۤۧۢ;->۟ۡ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroidx/fragment/app/s;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/s;-><init>(Le/k;I)V

    invoke-static {p0}, Lx/۟۟ۦۣ۠;->ۧ۟۟(Ljava/lang/Object;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v2

    invoke-static {v2, v1}, Lb0/ۣۣ۟۠ۢ;->۟ۡۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v1, Landroidx/activity/f;

    invoke-direct {v1, p0, v0}, Landroidx/activity/f;-><init>(Le/k;I)V

    invoke-static {p0, v1}, La1/ۣۣ۟;->ۢۥۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Landroidx/lifecycle/۟۠ۢۥۦ;->ۣ۟ۢ۟ۧ(Ljava/lang/Object;)Landroidx/activity/m;

    move-result-object v0

    invoke-static {v0}, Lq/۟ۢۥۨۡ;->۟ۥۧۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/d;

    new-instance v1, Le/i;

    invoke-direct {v1, p0}, Le/i;-><init>(Le/k;)V

    invoke-static {}, Le/k;->۟ۦۣۤۧ()[S

    move-result-object v2

    const/16 v3, 0x12

    const/16 v4, 0x255

    invoke-static {v2, v6, v3, v4}, Lk/۟ۢۡۢۨ;->۟ۦۡ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lh0/۟۠ۤۡۦ;->۟ۤۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Le/j;

    invoke-direct {v0, p0}, Le/j;-><init>(Le/k;)V

    invoke-static {p0, v0}, La1/ۣۣ۟;->ۢۥۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static native l(Landroidx/fragment/app/H;)Z
.end method

.method public static native ۟ۦۣۤۧ()[S
.end method


# virtual methods
.method public final native addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public final native attachBaseContext(Landroid/content/Context;)V
.end method

.method public final native closeOptionsMenu()V
.end method

.method public final native dispatchKeyEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method public final native findViewById(I)Landroid/view/View;
.end method

.method public final native getMenuInflater()Landroid/view/MenuInflater;
.end method

.method public final native getResources()Landroid/content/res/Resources;
.end method

.method public final native invalidateOptionsMenu()V
.end method

.method public final native k()Le/r;
.end method

.method public final native m()V
.end method

.method public final native n(ILandroid/view/MenuItem;)Z
.end method

.method public final native o()V
.end method

.method public final native onActivityResult(IILandroid/content/Intent;)V
.end method

.method public final native onConfigurationChanged(Landroid/content/res/Configuration;)V
.end method

.method public final native onContentChanged()V
.end method

.method public native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end method

.method public final native onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end method

.method public final native onDestroy()V
.end method

.method public final native onKeyDown(ILandroid/view/KeyEvent;)Z
.end method

.method public final native onMenuItemSelected(ILandroid/view/MenuItem;)Z
.end method

.method public final native onPause()V
.end method

.method public final native onPostCreate(Landroid/os/Bundle;)V
.end method

.method public final native onPostResume()V
.end method

.method public final native onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end method

.method public native onResume()V
.end method

.method public final native onStart()V
.end method

.method public final native onStateNotSaved()V
.end method

.method public final native onStop()V
.end method

.method public final native onTitleChanged(Ljava/lang/CharSequence;I)V
.end method

.method public final native openOptionsMenu()V
.end method

.method public final native p()V
.end method

.method public final native q()V
.end method

.method public final native setContentView(I)V
.end method

.method public native setContentView(Landroid/view/View;)V
.end method

.method public final native setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public final native setTheme(I)V
.end method

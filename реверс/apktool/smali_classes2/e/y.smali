.class public final Le/y;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/Window$Callback;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Landroid/view/Window$Callback;

.field public b:Z

.field public c:Z

.field public d:Z

.field public final e:Le/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x77

    const-class v1, Le/y;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_119_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/D;Landroid/view/Window$Callback;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/y;->e:Le/D;

    if-eqz p2, :cond_0

    iput-object p2, p0, Le/y;->a:Landroid/view/Window$Callback;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Le/y;->۟ۥۥ۟۟()[S

    move-result-object p2

    const/16 v0, 0x1f

    const/16 v1, 0x7c2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Lk0/ۨ۟۟ۦ;->ۢۧۥۤ([SIII)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native ۟ۥۥ۟۟()[S
.end method

.method public static native ۣۤۢ۠(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native a(Landroid/view/Window$Callback;)V
.end method

.method public final native b(ILandroid/view/Menu;)Z
.end method

.method public final native c(ILandroid/view/Menu;)V
.end method

.method public final native d(Ljava/util/List;Landroid/view/Menu;I)V
.end method

.method public final native dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native dispatchKeyEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
.end method

.method public final native dispatchTouchEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native e(Landroid/view/ActionMode$Callback;)Lj/e;
.end method

.method public final native onActionModeFinished(Landroid/view/ActionMode;)V
.end method

.method public final native onActionModeStarted(Landroid/view/ActionMode;)V
.end method

.method public final native onAttachedToWindow()V
.end method

.method public final native onContentChanged()V
.end method

.method public final native onCreatePanelMenu(ILandroid/view/Menu;)Z
.end method

.method public final native onCreatePanelView(I)Landroid/view/View;
.end method

.method public final native onDetachedFromWindow()V
.end method

.method public final native onMenuItemSelected(ILandroid/view/MenuItem;)Z
.end method

.method public final native onMenuOpened(ILandroid/view/Menu;)Z
.end method

.method public final native onPanelClosed(ILandroid/view/Menu;)V
.end method

.method public final native onPointerCaptureChanged(Z)V
.end method

.method public final native onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
.end method

.method public final native onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
.end method

.method public final native onSearchRequested()Z
.end method

.method public final native onSearchRequested(Landroid/view/SearchEvent;)Z
.end method

.method public final native onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
.end method

.method public final native onWindowFocusChanged(Z)V
.end method

.method public final native onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
.end method

.method public final native onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
.end method

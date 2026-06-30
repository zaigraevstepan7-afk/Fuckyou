.class public final Le/B;
.super Landroidx/appcompat/widget/ContentFrameLayout;
.source "Dex2C"


# instance fields
.field public final i:Le/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x54

    const-class v1, Le/B;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_84_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/D;Lj/c;)V
    .locals 0

    iput-object p1, p0, Le/B;->i:Le/D;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Landroidx/appcompat/widget/ContentFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final native dispatchKeyEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native setBackgroundResource(I)V
.end method

.class public final LM0/u;
.super Landroid/view/View$AccessibilityDelegate;
.source "Dex2C"


# instance fields
.field public final a:LM0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2f

    const-class v1, LM0/u;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_47_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/v;)V
    .locals 0

    iput-object p1, p0, LM0/u;->a:LM0/v;

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
.end method

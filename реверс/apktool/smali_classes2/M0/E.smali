.class public final LM0/E;
.super LN/b;
.source "Dex2C"


# static fields
.field private static final short:[S


# instance fields
.field public final d:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x19

    const-class v1, LM0/E;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_25_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    invoke-direct {p0}, LN/b;-><init>()V

    iput-object p1, p0, LM0/E;->d:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static native ۟ۥۧۨ()[S
.end method


# virtual methods
.method public final native d(Landroid/view/View;LO/k;)V
.end method

.method public final native e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
.end method

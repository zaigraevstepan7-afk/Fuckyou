.class public abstract LM0/s;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final b:LM0/r;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/google/android/material/internal/CheckableImageButton;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1f

    const-class v1, LM0/s;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_31_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LM0/۟ۧ۠ۢۥ;->ۧۧۡۧ(Ljava/lang/Object;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    iput-object v0, p0, LM0/s;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, LM0/s;->b:LM0/r;

    invoke-static {p1}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->ۢۦۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LM0/s;->c:Landroid/content/Context;

    invoke-static {p1}, Lg0/ۢ۠ۧۤ;->۟۟ۧۦۨ(Ljava/lang/Object;)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object p1

    iput-object p1, p0, LM0/s;->d:Lcom/google/android/material/internal/CheckableImageButton;

    return-void
.end method


# virtual methods
.method public native a()V
.end method

.method public native b()V
.end method

.method public native c()I
.end method

.method public native d()I
.end method

.method public native e()Landroid/view/View$OnFocusChangeListener;
.end method

.method public native f()Landroid/view/View$OnClickListener;
.end method

.method public native g()Landroid/view/View$OnFocusChangeListener;
.end method

.method public native h()LM0/l;
.end method

.method public native i(I)Z
.end method

.method public native j()Z
.end method

.method public native k()Z
.end method

.method public native l()Z
.end method

.method public native m(Landroid/widget/EditText;)V
.end method

.method public native n(LO/k;)V
.end method

.method public native o(Landroid/view/accessibility/AccessibilityEvent;)V
.end method

.method public native p(Z)V
.end method

.method public final native q()V
.end method

.method public native r()V
.end method

.method public native s()V
.end method

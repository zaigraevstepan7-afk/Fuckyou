.class public final LM0/C;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public a:I

.field public final b:Landroid/widget/EditText;

.field public final c:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x17

    const-class v1, LM0/C;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_23_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/C;->c:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, LM0/C;->b:Landroid/widget/EditText;

    invoke-static {p2}, LV0/ۥۤۥۡ;->۟۠۠ۢ(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LM0/C;->a:I

    return-void
.end method


# virtual methods
.method public final native afterTextChanged(Landroid/text/Editable;)V
.end method

.method public final native beforeTextChanged(Ljava/lang/CharSequence;III)V
.end method

.method public final native onTextChanged(Ljava/lang/CharSequence;III)V
.end method

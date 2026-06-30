.class public final LM0/n;
.super LC0/l;
.source "Dex2C"


# instance fields
.field public final a:LM0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x29

    const-class v1, LM0/n;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_41_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/n;->a:LM0/r;

    return-void
.end method


# virtual methods
.method public final native afterTextChanged(Landroid/text/Editable;)V
.end method

.method public final native beforeTextChanged(Ljava/lang/CharSequence;III)V
.end method

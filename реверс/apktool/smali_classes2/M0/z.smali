.class public final LM0/z;
.super LM0/s;
.source "Dex2C"


# instance fields
.field public final e:I

.field public f:Landroid/widget/EditText;

.field public final g:LM0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x34

    const-class v1, LM0/z;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_52_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;I)V
    .locals 1

    invoke-direct {p0, p1}, LM0/s;-><init>(LM0/r;)V

    const p1, 0x7f070086

    iput p1, p0, LM0/z;->e:I

    new-instance p1, LM0/a;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, LM0/a;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LM0/z;->g:LM0/a;

    if-eqz p2, :cond_0

    iput p2, p0, LM0/z;->e:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final native b()V
.end method

.method public final native c()I
.end method

.method public final native d()I
.end method

.method public final native f()Landroid/view/View$OnClickListener;
.end method

.method public final native k()Z
.end method

.method public final native l()Z
.end method

.method public final native m(Landroid/widget/EditText;)V
.end method

.method public final native r()V
.end method

.method public final native s()V
.end method

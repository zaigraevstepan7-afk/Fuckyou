.class public final Le/M;
.super Lj/a;
.source "Dex2C"

# interfaces
.implements Lk/k;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lk/m;

.field public e:LC0/n;

.field public f:Ljava/lang/ref/WeakReference;

.field public final g:Le/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x60

    const-class v1, Le/M;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_96_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/N;Landroid/content/Context;LC0/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/M;->g:Le/N;

    iput-object p2, p0, Le/M;->c:Landroid/content/Context;

    iput-object p3, p0, Le/M;->e:LC0/n;

    new-instance p1, Lk/m;

    invoke-direct {p1, p2}, Lk/m;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Lk/m;->l:I

    iput-object p1, p0, Le/M;->d:Lk/m;

    iput-object p0, p1, Lk/m;->e:Lk/k;

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native b()Landroid/view/View;
.end method

.method public final native c()Lk/m;
.end method

.method public final native d()Landroid/view/MenuInflater;
.end method

.method public final native e()Ljava/lang/CharSequence;
.end method

.method public final native f()Ljava/lang/CharSequence;
.end method

.method public final native g()V
.end method

.method public final native h()Z
.end method

.method public final native i(Landroid/view/View;)V
.end method

.method public final native j(I)V
.end method

.method public final native k(Ljava/lang/CharSequence;)V
.end method

.method public final native l(I)V
.end method

.method public final native m(Ljava/lang/CharSequence;)V
.end method

.method public final native n(Z)V
.end method

.method public final native v(Lk/m;)V
.end method

.method public final native w(Lk/m;Landroid/view/MenuItem;)Z
.end method

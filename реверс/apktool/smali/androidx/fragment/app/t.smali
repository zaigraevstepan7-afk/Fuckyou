.class public final Landroidx/fragment/app/t;
.super LT/m;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/L;
.implements Landroidx/lifecycle/r;
.implements Lh0/e;
.implements Landroidx/fragment/app/K;


# instance fields
.field public final p:Le/k;

.field public final q:Le/k;

.field public final r:Landroid/os/Handler;

.field public final s:Landroidx/fragment/app/H;

.field public final synthetic t:Le/k;


# direct methods
.method public constructor <init>(Le/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/fragment/app/H;

    .line 12
    .line 13
    invoke-direct {v1}, Landroidx/fragment/app/H;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/t;->s:Landroidx/fragment/app/H;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/fragment/app/t;->p:Le/k;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/fragment/app/t;->q:Le/k;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/fragment/app/t;->r:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final N(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le/k;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final O()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lh0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/activity/k;->e:Landroidx/activity/m;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/activity/m;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lh0/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/K;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/k;->c()Landroidx/lifecycle/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/t;->t:Le/k;

    .line 2
    .line 3
    iget-object v0, v0, Le/k;->t:Landroidx/lifecycle/t;

    .line 4
    .line 5
    return-object v0
.end method

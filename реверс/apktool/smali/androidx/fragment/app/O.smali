.class public final Landroidx/fragment/app/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;
.implements Lh0/e;
.implements Landroidx/lifecycle/L;


# instance fields
.field public final a:Landroidx/fragment/app/r;

.field public final b:Landroidx/lifecycle/K;

.field public c:Landroidx/lifecycle/t;

.field public d:Landroidx/activity/m;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r;Landroidx/lifecycle/K;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/O;->c:Landroidx/lifecycle/t;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/fragment/app/O;->d:Landroidx/activity/m;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/O;->a:Landroidx/fragment/app/r;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/fragment/app/O;->b:Landroidx/lifecycle/K;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lc0/c;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/O;->a:Landroidx/fragment/app/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/r;->B()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Lc0/c;

    .line 31
    .line 32
    invoke-direct {v2}, Lc0/c;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v2, Lc0/b;->a:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v4, Landroidx/lifecycle/J;->a:Landroidx/lifecycle/J;

    .line 40
    .line 41
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    sget-object v1, Landroidx/lifecycle/F;->a:Landroidx/lifecycle/J;

    .line 45
    .line 46
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object v1, Landroidx/lifecycle/F;->b:Landroidx/lifecycle/J;

    .line 50
    .line 51
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Landroidx/fragment/app/r;->f:Landroid/os/Bundle;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v1, Landroidx/lifecycle/F;->c:Landroidx/lifecycle/J;

    .line 59
    .line 60
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_3
    return-object v2
.end method

.method public final b()Lh0/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/O;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/O;->d:Landroidx/activity/m;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/activity/m;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh0/d;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/K;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/O;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/O;->b:Landroidx/lifecycle/K;

    .line 5
    .line 6
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/O;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/O;->c:Landroidx/lifecycle/t;

    .line 5
    .line 6
    return-object v0
.end method

.method public final e(Landroidx/lifecycle/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/O;->c:Landroidx/lifecycle/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/O;->c:Landroidx/lifecycle/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/t;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/O;->c:Landroidx/lifecycle/t;

    .line 11
    .line 12
    new-instance v0, Landroidx/activity/m;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Landroidx/activity/m;-><init>(Lh0/e;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/O;->d:Landroidx/activity/m;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/activity/m;->a()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/F;->a(Lh0/e;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

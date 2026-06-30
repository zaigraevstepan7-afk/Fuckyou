.class public abstract Landroidx/lifecycle/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/J;

.field public static final b:Landroidx/lifecycle/J;

.field public static final c:Landroidx/lifecycle/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/J;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/F;->a:Landroidx/lifecycle/J;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/J;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/F;->b:Landroidx/lifecycle/J;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/J;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/F;->c:Landroidx/lifecycle/J;

    .line 21
    .line 22
    return-void
.end method

.method public static final a(Lh0/e;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    .line 6
    .line 7
    sget-object v1, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Failed requirement."

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p0}, Lh0/e;->b()Lh0/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lh0/d;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ln/f;

    .line 34
    .line 35
    invoke-virtual {v0}, Ln/f;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_2
    move-object v1, v0

    .line 40
    check-cast v1, Ln/b;

    .line 41
    .line 42
    invoke-virtual {v1}, Ln/b;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const-string v3, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, Ln/b;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/util/Map$Entry;

    .line 55
    .line 56
    const-string v2, "components"

    .line 57
    .line 58
    invoke-static {v1, v2}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lh0/c;

    .line 72
    .line 73
    invoke-static {v2, v3}, La1/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v1, 0x0

    .line 81
    :goto_1
    if-nez v1, :cond_4

    .line 82
    .line 83
    new-instance v0, Landroidx/lifecycle/G;

    .line 84
    .line 85
    invoke-interface {p0}, Lh0/e;->b()Lh0/d;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v2, p0

    .line 90
    check-cast v2, Landroidx/lifecycle/L;

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/G;-><init>(Lh0/d;Landroidx/lifecycle/L;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Lh0/e;->b()Lh0/d;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1, v3, v0}, Lh0/d;->e(Ljava/lang/String;Lh0/c;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 107
    .line 108
    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/G;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    return-void
.end method

.class public final Landroidx/emoji2/text/e;
.super LT/m;
.source "SourceFile"


# instance fields
.field public final synthetic p:Landroidx/emoji2/text/f;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/emoji2/text/e;->p:Landroidx/emoji2/text/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final M(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e;->p:Landroidx/emoji2/text/f;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/j;->d(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final P(LA/k;)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e;->p:Landroidx/emoji2/text/f;

    .line 2
    .line 3
    iput-object p1, v0, Landroidx/emoji2/text/f;->c:LA/k;

    .line 4
    .line 5
    new-instance v1, LN/l;

    .line 6
    .line 7
    iget-object p1, v0, Landroidx/emoji2/text/f;->c:LA/k;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    .line 10
    .line 11
    iget-object v3, v2, Landroidx/emoji2/text/j;->g:LI0/e;

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/emoji2/text/j;->i:Landroidx/emoji2/text/d;

    .line 14
    .line 15
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v5, 0x22

    .line 18
    .line 19
    if-lt v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static {}, Landroidx/emoji2/text/m;->a()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, LT/m;->x()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :goto_0
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v3, v1, LN/l;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, v1, LN/l;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v2, v1, LN/l;->c:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, [I

    .line 61
    .line 62
    move-object v3, v2

    .line 63
    new-instance v2, Ljava/lang/String;

    .line 64
    .line 65
    array-length v4, v3

    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-direct {v2, v3, v5, v4}, Ljava/lang/String;-><init>([III)V

    .line 68
    .line 69
    .line 70
    new-instance v7, LA/b;

    .line 71
    .line 72
    const/16 v3, 0xe

    .line 73
    .line 74
    invoke-direct {v7, v3, v2}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v5, 0x1

    .line 83
    const/4 v6, 0x1

    .line 84
    invoke-virtual/range {v1 .. v7}, LN/l;->n(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/n;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    :goto_2
    iput-object v1, v0, Landroidx/emoji2/text/f;->b:LN/l;

    .line 89
    .line 90
    iget-object p1, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object v1, p1, Landroidx/emoji2/text/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    :try_start_0
    iput v1, p1, Landroidx/emoji2/text/j;->c:I

    .line 111
    .line 112
    iget-object v1, p1, Landroidx/emoji2/text/j;->b:Lq/g;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    .line 117
    iget-object v1, p1, Landroidx/emoji2/text/j;->b:Lq/g;

    .line 118
    .line 119
    invoke-virtual {v1}, Lq/g;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    iget-object v1, p1, Landroidx/emoji2/text/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 129
    .line 130
    .line 131
    iget-object v1, p1, Landroidx/emoji2/text/j;->d:Landroid/os/Handler;

    .line 132
    .line 133
    new-instance v2, LK/a;

    .line 134
    .line 135
    iget p1, p1, Landroidx/emoji2/text/j;->c:I

    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-direct {v2, v0, p1, v3}, LK/a;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    iget-object p1, p1, Landroidx/emoji2/text/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 153
    .line 154
    .line 155
    throw v0
.end method

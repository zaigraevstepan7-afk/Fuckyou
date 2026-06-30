.class public abstract Lg0/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lg0/A;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Lg0/b0;)V
    .locals 2

    .line 1
    iget v0, p0, Lg0/b0;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lg0/b0;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lg0/b0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->J(Lg0/b0;)I

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Lg0/b0;Lg0/b0;LN/q;LN/q;)Z
.end method

.method public final c(Lg0/b0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lg0/G;->a:Lg0/A;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Lg0/b0;->n(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p1, Lg0/b0;->h:Lg0/b0;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p1, Lg0/b0;->i:Lg0/b0;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    iput-object v3, p1, Lg0/b0;->h:Lg0/b0;

    .line 19
    .line 20
    :cond_0
    iput-object v3, p1, Lg0/b0;->i:Lg0/b0;

    .line 21
    .line 22
    iget v2, p1, Lg0/b0;->j:I

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_1
    iget-object v0, v0, Lg0/A;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->j0()V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 36
    .line 37
    iget-object v3, v2, Lg0/c;->b:Lg0/b;

    .line 38
    .line 39
    iget-object v4, v2, Lg0/c;->a:Lg0/A;

    .line 40
    .line 41
    iget v5, v2, Lg0/c;->d:I

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    iget-object v7, p1, Lg0/b0;->a:Landroid/view/View;

    .line 45
    .line 46
    if-ne v5, v1, :cond_3

    .line 47
    .line 48
    iget-object v1, v2, Lg0/c;->e:Landroid/view/View;

    .line 49
    .line 50
    if-ne v1, v7, :cond_2

    .line 51
    .line 52
    :goto_0
    const/4 v1, 0x0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    const/4 v8, 0x2

    .line 63
    if-eq v5, v8, :cond_7

    .line 64
    .line 65
    :try_start_0
    iput v8, v2, Lg0/c;->d:I

    .line 66
    .line 67
    iget-object v5, v4, Lg0/A;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v8, -0x1

    .line 74
    if-ne v5, v8, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2, v7}, Lg0/c;->j(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :goto_1
    iput v6, v2, Lg0/c;->d:I

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :try_start_1
    invoke-virtual {v3, v5}, Lg0/b;->d(I)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_5

    .line 89
    .line 90
    invoke-virtual {v3, v5}, Lg0/b;->f(I)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v7}, Lg0/c;->j(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, Lg0/A;->h(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    iput v6, v2, Lg0/c;->d:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :goto_2
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 110
    .line 111
    invoke-virtual {v3, v2}, Lg0/Q;->l(Lg0/b0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, Lg0/Q;->i(Lg0/b0;)V

    .line 115
    .line 116
    .line 117
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 118
    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    new-instance v2, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v3, "after removing animated view: "

    .line 124
    .line 125
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v3, ", "

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const-string v3, "RecyclerView"

    .line 144
    .line 145
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_6
    xor-int/lit8 v2, v1, 0x1

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->l0(Z)V

    .line 151
    .line 152
    .line 153
    if-nez v1, :cond_8

    .line 154
    .line 155
    invoke-virtual {p1}, Lg0/b0;->j()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    invoke-virtual {v0, v7, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :goto_3
    iput v6, v2, Lg0/c;->d:I

    .line 166
    .line 167
    throw p1

    .line 168
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_8
    :goto_4
    return-void
.end method

.method public abstract d(Lg0/b0;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method

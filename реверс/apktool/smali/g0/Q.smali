.class public final Lg0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lg0/P;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lg0/Q;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lg0/Q;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lg0/Q;->e:I

    .line 31
    .line 32
    iput p1, p0, Lg0/Q;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lg0/b0;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->l(Lg0/b0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:Lg0/d0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object v3, p1, Lg0/b0;->a:Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v1, Lg0/d0;->e:Lg0/c0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v1, Lg0/c0;->e:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LN/b;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v1, v2

    .line 27
    :goto_0
    invoke-static {v3, v1}, LN/S;->p(Landroid/view/View;LN/b;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_4

    .line 31
    .line 32
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-gtz v1, :cond_3

    .line 39
    .line 40
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->g:LC0/n;

    .line 45
    .line 46
    invoke-virtual {p2, p1}, LC0/n;->J(Lg0/b0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "dispatchViewRecycled: "

    .line 56
    .line 57
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const-string v0, "RecyclerView"

    .line 68
    .line 69
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 p1, 0x0

    .line 74
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance p1, Ljava/lang/ClassCastException;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_4
    :goto_1
    iput-object v2, p1, Lg0/b0;->s:Lg0/B;

    .line 88
    .line 89
    iput-object v2, p1, Lg0/b0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    invoke-virtual {p0}, Lg0/Q;->c()Lg0/P;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget v0, p1, Lg0/b0;->f:I

    .line 99
    .line 100
    invoke-virtual {p2, v0}, Lg0/P;->a(I)Lg0/O;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v1, v1, Lg0/O;->a:Ljava/util/ArrayList;

    .line 105
    .line 106
    iget-object p2, p2, Lg0/P;->a:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Lg0/O;

    .line 113
    .line 114
    iget p2, p2, Lg0/O;->b:I

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-gt p2, v0, :cond_5

    .line 121
    .line 122
    invoke-static {v3}, LT/m;->g(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 127
    .line 128
    if-eqz p2, :cond_7

    .line 129
    .line 130
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    const-string p2, "this scrap item already exists"

    .line 140
    .line 141
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_7
    :goto_2
    invoke-virtual {p1}, Lg0/b0;->m()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 6
    .line 7
    invoke-virtual {v1}, Lg0/X;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 14
    .line 15
    iget-boolean v1, v1, Lg0/X;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK/e;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, LK/e;->e(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "invalid position "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, ". State item count is "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 46
    .line 47
    invoke-virtual {p1}, Lg0/X;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1
.end method

.method public final c()Lg0/P;
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/Q;->g:Lg0/P;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg0/P;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lg0/P;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lg0/P;->b:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lg0/P;->c:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Lg0/Q;->g:Lg0/P;

    .line 32
    .line 33
    invoke-virtual {p0}, Lg0/Q;->d()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lg0/Q;->g:Lg0/P;

    .line 37
    .line 38
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/Q;->g:Lg0/P;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lg0/P;->c:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final e(Lg0/B;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/Q;->g:Lg0/P;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg0/P;->c:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 p2, 0x0

    .line 20
    :goto_0
    iget-object v1, v0, Lg0/P;->a:Landroid/util/SparseArray;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge p2, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lg0/O;

    .line 37
    .line 38
    iget-object v1, v1, Lg0/O;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v2, v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lg0/b0;

    .line 52
    .line 53
    iget-object v3, v3, Lg0/b0;->a:Landroid/view/View;

    .line 54
    .line 55
    invoke-static {v3}, LT/m;->g(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lg0/Q;->g(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->E0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 27
    .line 28
    iget-object v1, v0, Lg0/n;->c:[I

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    iput v1, v0, Lg0/n;->d:I

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final g(I)V
    .locals 5

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 2
    .line 3
    const-string v1, "RecyclerView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Recycling cached view at index "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lg0/b0;

    .line 31
    .line 32
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "CachedViewHolder to be recycled: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v2, v1}, Lg0/Q;->a(Lg0/b0;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg0/b0;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lg0/b0;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lg0/b0;->n:Lg0/Q;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lg0/Q;->l(Lg0/b0;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lg0/b0;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Lg0/b0;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Lg0/b0;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lg0/Q;->i(Lg0/b0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->J:Lg0/G;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lg0/b0;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->J:Lg0/G;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lg0/G;->d(Lg0/b0;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final i(Lg0/b0;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Lg0/b0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    iget-object v3, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v4, p1, Lg0/b0;->a:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Lg0/b0;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_11

    .line 26
    .line 27
    invoke-virtual {p1}, Lg0/b0;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_10

    .line 32
    .line 33
    iget v0, p1, Lg0/b0;->j:I

    .line 34
    .line 35
    and-int/lit8 v0, v0, 0x10

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, LN/S;->a:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/View;->hasTransientState()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v0, 0x0

    .line 50
    :goto_0
    iget-object v5, v3, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 51
    .line 52
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 53
    .line 54
    iget-object v6, p0, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "cached view received recycle internal? "

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lg0/b0;->g()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_e

    .line 90
    .line 91
    iget v5, p0, Lg0/Q;->f:I

    .line 92
    .line 93
    if-lez v5, :cond_b

    .line 94
    .line 95
    iget v5, p1, Lg0/b0;->j:I

    .line 96
    .line 97
    and-int/lit16 v5, v5, 0x20e

    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iget v7, p0, Lg0/Q;->f:I

    .line 107
    .line 108
    if-lt v5, v7, :cond_5

    .line 109
    .line 110
    if-lez v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Lg0/Q;->g(I)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v5, v5, -0x1

    .line 116
    .line 117
    :cond_5
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->E0:Z

    .line 118
    .line 119
    if-eqz v7, :cond_a

    .line 120
    .line 121
    if-lez v5, :cond_a

    .line 122
    .line 123
    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 124
    .line 125
    iget v8, p1, Lg0/b0;->c:I

    .line 126
    .line 127
    iget-object v9, v7, Lg0/n;->c:[I

    .line 128
    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    iget v9, v7, Lg0/n;->d:I

    .line 132
    .line 133
    mul-int/lit8 v9, v9, 0x2

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    :goto_2
    if-ge v10, v9, :cond_7

    .line 137
    .line 138
    iget-object v11, v7, Lg0/n;->c:[I

    .line 139
    .line 140
    aget v11, v11, v10

    .line 141
    .line 142
    if-ne v11, v8, :cond_6

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_6
    add-int/lit8 v10, v10, 0x2

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    sub-int/2addr v5, v2

    .line 149
    :goto_3
    if-ltz v5, :cond_9

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lg0/b0;

    .line 156
    .line 157
    iget v7, v7, Lg0/b0;->c:I

    .line 158
    .line 159
    iget-object v8, v3, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 160
    .line 161
    iget-object v9, v8, Lg0/n;->c:[I

    .line 162
    .line 163
    if-eqz v9, :cond_9

    .line 164
    .line 165
    iget v9, v8, Lg0/n;->d:I

    .line 166
    .line 167
    mul-int/lit8 v9, v9, 0x2

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    :goto_4
    if-ge v10, v9, :cond_9

    .line 171
    .line 172
    iget-object v11, v8, Lg0/n;->c:[I

    .line 173
    .line 174
    aget v11, v11, v10

    .line 175
    .line 176
    if-ne v11, v7, :cond_8

    .line 177
    .line 178
    add-int/lit8 v5, v5, -0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    add-int/lit8 v10, v10, 0x2

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_9
    add-int/2addr v5, v2

    .line 185
    :cond_a
    :goto_5
    invoke-virtual {v6, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    const/4 v5, 0x1

    .line 189
    goto :goto_7

    .line 190
    :cond_b
    :goto_6
    const/4 v5, 0x0

    .line 191
    :goto_7
    if-nez v5, :cond_c

    .line 192
    .line 193
    invoke-virtual {p0, p1, v2}, Lg0/Q;->a(Lg0/b0;Z)V

    .line 194
    .line 195
    .line 196
    move v1, v5

    .line 197
    goto :goto_9

    .line 198
    :cond_c
    move v1, v5

    .line 199
    :cond_d
    :goto_8
    const/4 v2, 0x0

    .line 200
    goto :goto_9

    .line 201
    :cond_e
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 202
    .line 203
    if-eqz v2, :cond_d

    .line 204
    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v5, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"

    .line 208
    .line 209
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const-string v5, "RecyclerView"

    .line 224
    .line 225
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :goto_9
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->g:LC0/n;

    .line 230
    .line 231
    invoke-virtual {v3, p1}, LC0/n;->J(Lg0/b0;)V

    .line 232
    .line 233
    .line 234
    if-nez v1, :cond_f

    .line 235
    .line 236
    if-nez v2, :cond_f

    .line 237
    .line 238
    if-eqz v0, :cond_f

    .line 239
    .line 240
    invoke-static {v4}, LT/m;->g(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    iput-object v0, p1, Lg0/b0;->s:Lg0/B;

    .line 245
    .line 246
    iput-object v0, p1, Lg0/b0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 247
    .line 248
    :cond_f
    return-void

    .line 249
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 250
    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 254
    .line 255
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v3, v0}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 267
    .line 268
    new-instance v1, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 271
    .line 272
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-static {v3, v1}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_12
    :goto_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 287
    .line 288
    new-instance v5, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    .line 291
    .line 292
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Lg0/b0;->i()Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string p1, " isAttached:"

    .line 303
    .line 304
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    if-eqz p1, :cond_13

    .line 312
    .line 313
    const/4 v1, 0x1

    .line 314
    :cond_13
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Lg0/b0;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Lg0/b0;->k()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, v3, Landroidx/recyclerview/widget/RecyclerView;->J:Lg0/G;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lg0/b0;->c()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v0, Lg0/j;

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    iget-boolean v0, v0, Lg0/j;->g:Z

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Lg0/b0;->f()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v0, p0, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 63
    .line 64
    :cond_2
    iput-object p0, p1, Lg0/b0;->n:Lg0/Q;

    .line 65
    .line 66
    iput-boolean v2, p1, Lg0/b0;->o:Z

    .line 67
    .line 68
    iget-object v0, p0, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lg0/b0;->f()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p1}, Lg0/b0;->h()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_5

    .line 85
    .line 86
    iget-object v0, v3, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 87
    .line 88
    iget-boolean v0, v0, Lg0/B;->b:Z

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v0}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_5
    :goto_2
    iput-object p0, p1, Lg0/b0;->n:Lg0/Q;

    .line 111
    .line 112
    iput-boolean v1, p1, Lg0/b0;->o:Z

    .line 113
    .line 114
    iget-object v0, p0, Lg0/Q;->a:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final k(IJ)Lg0/b0;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v1, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-ltz v0, :cond_5d

    .line 11
    .line 12
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 13
    .line 14
    invoke-virtual {v6}, Lg0/X;->b()I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-ge v0, v6, :cond_5d

    .line 19
    .line 20
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 21
    .line 22
    iget-boolean v7, v6, Lg0/X;->g:Z

    .line 23
    .line 24
    const/16 v9, 0x20

    .line 25
    .line 26
    if-eqz v7, :cond_6

    .line 27
    .line 28
    iget-object v7, v1, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz v7, :cond_4

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    const/4 v10, 0x0

    .line 40
    :goto_0
    if-ge v10, v7, :cond_2

    .line 41
    .line 42
    iget-object v11, v1, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    check-cast v11, Lg0/b0;

    .line 49
    .line 50
    invoke-virtual {v11}, Lg0/b0;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-nez v12, :cond_1

    .line 55
    .line 56
    invoke-virtual {v11}, Lg0/b0;->b()I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-ne v12, v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v11, v9}, Lg0/b0;->a(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    add-int/2addr v10, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v10, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 69
    .line 70
    iget-boolean v10, v10, Lg0/B;->b:Z

    .line 71
    .line 72
    if-eqz v10, :cond_4

    .line 73
    .line 74
    iget-object v10, v5, Landroidx/recyclerview/widget/RecyclerView;->e:LK/e;

    .line 75
    .line 76
    invoke-virtual {v10, v0, v2}, LK/e;->e(II)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-lez v10, :cond_4

    .line 81
    .line 82
    iget-object v11, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 83
    .line 84
    invoke-virtual {v11}, Lg0/B;->a()I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-ge v10, v11, :cond_4

    .line 89
    .line 90
    iget-object v11, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 91
    .line 92
    invoke-virtual {v11, v10}, Lg0/B;->b(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    const/4 v12, 0x0

    .line 97
    :goto_1
    if-ge v12, v7, :cond_4

    .line 98
    .line 99
    iget-object v13, v1, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    check-cast v13, Lg0/b0;

    .line 106
    .line 107
    invoke-virtual {v13}, Lg0/b0;->p()Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-nez v14, :cond_3

    .line 112
    .line 113
    iget-wide v14, v13, Lg0/b0;->e:J

    .line 114
    .line 115
    cmp-long v16, v14, v10

    .line 116
    .line 117
    if-nez v16, :cond_3

    .line 118
    .line 119
    invoke-virtual {v13, v9}, Lg0/b0;->a(I)V

    .line 120
    .line 121
    .line 122
    move-object v11, v13

    .line 123
    goto :goto_3

    .line 124
    :cond_3
    add-int/2addr v12, v4

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    :goto_2
    const/4 v11, 0x0

    .line 127
    :goto_3
    if-eqz v11, :cond_5

    .line 128
    .line 129
    const/4 v7, 0x1

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    const/4 v7, 0x0

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    const/4 v7, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    :goto_4
    iget-object v10, v1, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 136
    .line 137
    iget-object v12, v1, Lg0/Q;->a:Ljava/util/ArrayList;

    .line 138
    .line 139
    const-string v13, "RecyclerView"

    .line 140
    .line 141
    if-nez v11, :cond_20

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    const/4 v14, 0x0

    .line 148
    :goto_5
    if-ge v14, v11, :cond_a

    .line 149
    .line 150
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    check-cast v15, Lg0/b0;

    .line 155
    .line 156
    invoke-virtual {v15}, Lg0/b0;->p()Z

    .line 157
    .line 158
    .line 159
    move-result v16

    .line 160
    if-nez v16, :cond_8

    .line 161
    .line 162
    const/16 v16, 0x1

    .line 163
    .line 164
    invoke-virtual {v15}, Lg0/b0;->b()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-ne v4, v0, :cond_9

    .line 169
    .line 170
    invoke-virtual {v15}, Lg0/b0;->f()Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-nez v4, :cond_9

    .line 175
    .line 176
    iget-boolean v4, v6, Lg0/X;->g:Z

    .line 177
    .line 178
    if-nez v4, :cond_7

    .line 179
    .line 180
    invoke-virtual {v15}, Lg0/b0;->h()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-nez v4, :cond_9

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v15, v9}, Lg0/b0;->a(I)V

    .line 187
    .line 188
    .line 189
    move-object v11, v15

    .line 190
    goto/16 :goto_b

    .line 191
    .line 192
    :cond_8
    const/16 v16, 0x1

    .line 193
    .line 194
    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 195
    .line 196
    const/4 v4, 0x1

    .line 197
    goto :goto_5

    .line 198
    :cond_a
    const/16 v16, 0x1

    .line 199
    .line 200
    iget-object v4, v5, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 201
    .line 202
    iget-object v4, v4, Lg0/c;->c:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    const/4 v14, 0x0

    .line 209
    :goto_6
    if-ge v14, v11, :cond_c

    .line 210
    .line 211
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Landroid/view/View;

    .line 216
    .line 217
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 218
    .line 219
    .line 220
    move-result-object v17

    .line 221
    invoke-virtual/range {v17 .. v17}, Lg0/b0;->b()I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-ne v8, v0, :cond_b

    .line 226
    .line 227
    invoke-virtual/range {v17 .. v17}, Lg0/b0;->f()Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_b

    .line 232
    .line 233
    invoke-virtual/range {v17 .. v17}, Lg0/b0;->h()Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-nez v8, :cond_b

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_b
    add-int/lit8 v14, v14, 0x1

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_c
    const/4 v15, 0x0

    .line 244
    :goto_7
    if-eqz v15, :cond_12

    .line 245
    .line 246
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 251
    .line 252
    iget-object v11, v8, Lg0/c;->a:Lg0/A;

    .line 253
    .line 254
    iget-object v11, v11, Lg0/A;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 255
    .line 256
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-ltz v11, :cond_11

    .line 261
    .line 262
    iget-object v14, v8, Lg0/c;->b:Lg0/b;

    .line 263
    .line 264
    invoke-virtual {v14, v11}, Lg0/b;->d(I)Z

    .line 265
    .line 266
    .line 267
    move-result v17

    .line 268
    if-eqz v17, :cond_10

    .line 269
    .line 270
    invoke-virtual {v14, v11}, Lg0/b;->a(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8, v15}, Lg0/c;->j(Landroid/view/View;)V

    .line 274
    .line 275
    .line 276
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 277
    .line 278
    iget-object v11, v8, Lg0/c;->a:Lg0/A;

    .line 279
    .line 280
    iget-object v11, v11, Lg0/A;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 281
    .line 282
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-ne v11, v3, :cond_d

    .line 287
    .line 288
    :goto_8
    const/4 v11, -0x1

    .line 289
    goto :goto_9

    .line 290
    :cond_d
    iget-object v8, v8, Lg0/c;->b:Lg0/b;

    .line 291
    .line 292
    invoke-virtual {v8, v11}, Lg0/b;->d(I)Z

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    if-eqz v14, :cond_e

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_e
    invoke-virtual {v8, v11}, Lg0/b;->b(I)I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    sub-int/2addr v11, v8

    .line 304
    :goto_9
    if-eq v11, v3, :cond_f

    .line 305
    .line 306
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 307
    .line 308
    invoke-virtual {v8, v11}, Lg0/c;->c(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v15}, Lg0/Q;->j(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    const/16 v8, 0x2020

    .line 315
    .line 316
    invoke-virtual {v4, v8}, Lg0/b0;->a(I)V

    .line 317
    .line 318
    .line 319
    move-object v11, v4

    .line 320
    goto/16 :goto_b

    .line 321
    .line 322
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    new-instance v2, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v3, "layout index should not be -1 after unhiding a view:"

    .line 327
    .line 328
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-static {v5, v2}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 343
    .line 344
    new-instance v2, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v3, "trying to unhide a view that was not hidden"

    .line 347
    .line 348
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 363
    .line 364
    new-instance v2, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    const-string v3, "view is not a child, cannot hide "

    .line 367
    .line 368
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v0

    .line 382
    :cond_12
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    const/4 v8, 0x0

    .line 387
    :goto_a
    if-ge v8, v4, :cond_14

    .line 388
    .line 389
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    check-cast v11, Lg0/b0;

    .line 394
    .line 395
    invoke-virtual {v11}, Lg0/b0;->f()Z

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    if-nez v14, :cond_13

    .line 400
    .line 401
    invoke-virtual {v11}, Lg0/b0;->b()I

    .line 402
    .line 403
    .line 404
    move-result v14

    .line 405
    if-ne v14, v0, :cond_13

    .line 406
    .line 407
    invoke-virtual {v11}, Lg0/b0;->d()Z

    .line 408
    .line 409
    .line 410
    move-result v14

    .line 411
    if-nez v14, :cond_13

    .line 412
    .line 413
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 417
    .line 418
    if-eqz v4, :cond_15

    .line 419
    .line 420
    new-instance v4, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    const-string v8, "getScrapOrHiddenOrCachedHolderForPosition("

    .line 423
    .line 424
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    const-string v8, ") found match in cache: "

    .line 431
    .line 432
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-static {v13, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_14
    const/4 v11, 0x0

    .line 450
    :cond_15
    :goto_b
    if-eqz v11, :cond_21

    .line 451
    .line 452
    invoke-virtual {v11}, Lg0/b0;->h()Z

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-eqz v4, :cond_18

    .line 457
    .line 458
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 459
    .line 460
    if-eqz v4, :cond_17

    .line 461
    .line 462
    iget-boolean v4, v6, Lg0/X;->g:Z

    .line 463
    .line 464
    if-eqz v4, :cond_16

    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 468
    .line 469
    new-instance v2, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    const-string v3, "should not receive a removed view unless it is pre layout"

    .line 472
    .line 473
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-static {v5, v2}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v0

    .line 484
    :cond_17
    :goto_c
    iget-boolean v4, v6, Lg0/X;->g:Z

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_18
    iget v4, v11, Lg0/b0;->c:I

    .line 488
    .line 489
    if-ltz v4, :cond_1f

    .line 490
    .line 491
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 492
    .line 493
    invoke-virtual {v8}, Lg0/B;->a()I

    .line 494
    .line 495
    .line 496
    move-result v8

    .line 497
    if-ge v4, v8, :cond_1f

    .line 498
    .line 499
    iget-boolean v4, v6, Lg0/X;->g:Z

    .line 500
    .line 501
    if-nez v4, :cond_1a

    .line 502
    .line 503
    iget-object v4, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    iget v4, v11, Lg0/b0;->f:I

    .line 509
    .line 510
    if-eqz v4, :cond_1a

    .line 511
    .line 512
    :cond_19
    const/4 v4, 0x0

    .line 513
    goto :goto_d

    .line 514
    :cond_1a
    iget-object v4, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 515
    .line 516
    iget-boolean v8, v4, Lg0/B;->b:Z

    .line 517
    .line 518
    if-eqz v8, :cond_1b

    .line 519
    .line 520
    iget-wide v14, v11, Lg0/b0;->e:J

    .line 521
    .line 522
    iget v8, v11, Lg0/b0;->c:I

    .line 523
    .line 524
    invoke-virtual {v4, v8}, Lg0/B;->b(I)J

    .line 525
    .line 526
    .line 527
    move-result-wide v19

    .line 528
    cmp-long v4, v14, v19

    .line 529
    .line 530
    if-nez v4, :cond_19

    .line 531
    .line 532
    :cond_1b
    const/4 v4, 0x1

    .line 533
    :goto_d
    if-nez v4, :cond_1e

    .line 534
    .line 535
    const/4 v4, 0x4

    .line 536
    invoke-virtual {v11, v4}, Lg0/b0;->a(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v11}, Lg0/b0;->i()Z

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    if-eqz v4, :cond_1c

    .line 544
    .line 545
    iget-object v4, v11, Lg0/b0;->a:Landroid/view/View;

    .line 546
    .line 547
    invoke-virtual {v5, v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 548
    .line 549
    .line 550
    iget-object v4, v11, Lg0/b0;->n:Lg0/Q;

    .line 551
    .line 552
    invoke-virtual {v4, v11}, Lg0/Q;->l(Lg0/b0;)V

    .line 553
    .line 554
    .line 555
    goto :goto_e

    .line 556
    :cond_1c
    invoke-virtual {v11}, Lg0/b0;->p()Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_1d

    .line 561
    .line 562
    iget v4, v11, Lg0/b0;->j:I

    .line 563
    .line 564
    and-int/lit8 v4, v4, -0x21

    .line 565
    .line 566
    iput v4, v11, Lg0/b0;->j:I

    .line 567
    .line 568
    :cond_1d
    :goto_e
    invoke-virtual {v1, v11}, Lg0/Q;->i(Lg0/b0;)V

    .line 569
    .line 570
    .line 571
    const/4 v11, 0x0

    .line 572
    goto :goto_f

    .line 573
    :cond_1e
    const/4 v7, 0x1

    .line 574
    goto :goto_f

    .line 575
    :cond_1f
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 576
    .line 577
    new-instance v2, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 580
    .line 581
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-static {v5, v2}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    throw v0

    .line 595
    :cond_20
    const/16 v16, 0x1

    .line 596
    .line 597
    :cond_21
    :goto_f
    const-wide/16 v19, 0x4

    .line 598
    .line 599
    const-wide/16 v21, 0x0

    .line 600
    .line 601
    const-wide v23, 0x7fffffffffffffffL

    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    if-nez v11, :cond_38

    .line 607
    .line 608
    iget-object v4, v5, Landroidx/recyclerview/widget/RecyclerView;->e:LK/e;

    .line 609
    .line 610
    invoke-virtual {v4, v0, v2}, LK/e;->e(II)I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    if-ltz v4, :cond_37

    .line 615
    .line 616
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 617
    .line 618
    invoke-virtual {v8}, Lg0/B;->a()I

    .line 619
    .line 620
    .line 621
    move-result v8

    .line 622
    if-ge v4, v8, :cond_37

    .line 623
    .line 624
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 625
    .line 626
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 630
    .line 631
    const/16 v17, -0x1

    .line 632
    .line 633
    iget-boolean v3, v8, Lg0/B;->b:Z

    .line 634
    .line 635
    if-eqz v3, :cond_2a

    .line 636
    .line 637
    invoke-virtual {v8, v4}, Lg0/B;->b(I)J

    .line 638
    .line 639
    .line 640
    move-result-wide v25

    .line 641
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    add-int/lit8 v3, v3, -0x1

    .line 646
    .line 647
    :goto_10
    if-ltz v3, :cond_24

    .line 648
    .line 649
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v8

    .line 653
    check-cast v8, Lg0/b0;

    .line 654
    .line 655
    const-wide/16 v27, 0x3

    .line 656
    .line 657
    iget-wide v14, v8, Lg0/b0;->e:J

    .line 658
    .line 659
    cmp-long v11, v14, v25

    .line 660
    .line 661
    if-nez v11, :cond_23

    .line 662
    .line 663
    invoke-virtual {v8}, Lg0/b0;->p()Z

    .line 664
    .line 665
    .line 666
    move-result v11

    .line 667
    if-nez v11, :cond_23

    .line 668
    .line 669
    iget v11, v8, Lg0/b0;->f:I

    .line 670
    .line 671
    if-nez v11, :cond_22

    .line 672
    .line 673
    invoke-virtual {v8, v9}, Lg0/b0;->a(I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v8}, Lg0/b0;->h()Z

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    if-eqz v3, :cond_28

    .line 681
    .line 682
    iget-boolean v3, v6, Lg0/X;->g:Z

    .line 683
    .line 684
    if-nez v3, :cond_28

    .line 685
    .line 686
    iget v3, v8, Lg0/b0;->j:I

    .line 687
    .line 688
    and-int/lit8 v3, v3, -0xf

    .line 689
    .line 690
    or-int/lit8 v3, v3, 0x2

    .line 691
    .line 692
    iput v3, v8, Lg0/b0;->j:I

    .line 693
    .line 694
    goto :goto_12

    .line 695
    :cond_22
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    iget-object v8, v8, Lg0/b0;->a:Landroid/view/View;

    .line 699
    .line 700
    invoke-virtual {v5, v8, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 701
    .line 702
    .line 703
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 704
    .line 705
    .line 706
    move-result-object v8

    .line 707
    const/4 v11, 0x0

    .line 708
    iput-object v11, v8, Lg0/b0;->n:Lg0/Q;

    .line 709
    .line 710
    iput-boolean v2, v8, Lg0/b0;->o:Z

    .line 711
    .line 712
    iget v11, v8, Lg0/b0;->j:I

    .line 713
    .line 714
    and-int/lit8 v11, v11, -0x21

    .line 715
    .line 716
    iput v11, v8, Lg0/b0;->j:I

    .line 717
    .line 718
    invoke-virtual {v1, v8}, Lg0/Q;->i(Lg0/b0;)V

    .line 719
    .line 720
    .line 721
    :cond_23
    add-int/lit8 v3, v3, -0x1

    .line 722
    .line 723
    goto :goto_10

    .line 724
    :cond_24
    const-wide/16 v27, 0x3

    .line 725
    .line 726
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 727
    .line 728
    .line 729
    move-result v3

    .line 730
    add-int/lit8 v3, v3, -0x1

    .line 731
    .line 732
    :goto_11
    if-ltz v3, :cond_26

    .line 733
    .line 734
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v8

    .line 738
    check-cast v8, Lg0/b0;

    .line 739
    .line 740
    iget-wide v11, v8, Lg0/b0;->e:J

    .line 741
    .line 742
    cmp-long v9, v11, v25

    .line 743
    .line 744
    if-nez v9, :cond_27

    .line 745
    .line 746
    invoke-virtual {v8}, Lg0/b0;->d()Z

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    if-nez v9, :cond_27

    .line 751
    .line 752
    iget v9, v8, Lg0/b0;->f:I

    .line 753
    .line 754
    if-nez v9, :cond_25

    .line 755
    .line 756
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    goto :goto_12

    .line 760
    :cond_25
    invoke-virtual {v1, v3}, Lg0/Q;->g(I)V

    .line 761
    .line 762
    .line 763
    :cond_26
    const/4 v8, 0x0

    .line 764
    goto :goto_12

    .line 765
    :cond_27
    add-int/lit8 v3, v3, -0x1

    .line 766
    .line 767
    goto :goto_11

    .line 768
    :cond_28
    :goto_12
    if-eqz v8, :cond_29

    .line 769
    .line 770
    iput v4, v8, Lg0/b0;->c:I

    .line 771
    .line 772
    move-object v11, v8

    .line 773
    const/4 v7, 0x1

    .line 774
    goto :goto_13

    .line 775
    :cond_29
    move-object v11, v8

    .line 776
    goto :goto_13

    .line 777
    :cond_2a
    const-wide/16 v27, 0x3

    .line 778
    .line 779
    :goto_13
    if-nez v11, :cond_2f

    .line 780
    .line 781
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 782
    .line 783
    if-eqz v3, :cond_2b

    .line 784
    .line 785
    new-instance v3, Ljava/lang/StringBuilder;

    .line 786
    .line 787
    const-string v4, "tryGetViewHolderForPositionByDeadline("

    .line 788
    .line 789
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    const-string v4, ") fetching from shared pool"

    .line 796
    .line 797
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    invoke-static {v13, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 805
    .line 806
    .line 807
    :cond_2b
    invoke-virtual {v1}, Lg0/Q;->c()Lg0/P;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    iget-object v3, v3, Lg0/P;->a:Landroid/util/SparseArray;

    .line 812
    .line 813
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    check-cast v3, Lg0/O;

    .line 818
    .line 819
    if-eqz v3, :cond_2d

    .line 820
    .line 821
    iget-object v3, v3, Lg0/O;->a:Ljava/util/ArrayList;

    .line 822
    .line 823
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 824
    .line 825
    .line 826
    move-result v4

    .line 827
    if-nez v4, :cond_2d

    .line 828
    .line 829
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 830
    .line 831
    .line 832
    move-result v4

    .line 833
    add-int/lit8 v4, v4, -0x1

    .line 834
    .line 835
    :goto_14
    if-ltz v4, :cond_2d

    .line 836
    .line 837
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v8

    .line 841
    check-cast v8, Lg0/b0;

    .line 842
    .line 843
    invoke-virtual {v8}, Lg0/b0;->d()Z

    .line 844
    .line 845
    .line 846
    move-result v8

    .line 847
    if-nez v8, :cond_2c

    .line 848
    .line 849
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    check-cast v3, Lg0/b0;

    .line 854
    .line 855
    goto :goto_15

    .line 856
    :cond_2c
    add-int/lit8 v4, v4, -0x1

    .line 857
    .line 858
    goto :goto_14

    .line 859
    :cond_2d
    const/4 v3, 0x0

    .line 860
    :goto_15
    if-eqz v3, :cond_2e

    .line 861
    .line 862
    invoke-virtual {v3}, Lg0/b0;->m()V

    .line 863
    .line 864
    .line 865
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 866
    .line 867
    :cond_2e
    move-object v11, v3

    .line 868
    :cond_2f
    if-nez v11, :cond_39

    .line 869
    .line 870
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 871
    .line 872
    .line 873
    move-result-wide v3

    .line 874
    cmp-long v8, p2, v23

    .line 875
    .line 876
    if-eqz v8, :cond_32

    .line 877
    .line 878
    iget-object v8, v1, Lg0/Q;->g:Lg0/P;

    .line 879
    .line 880
    invoke-virtual {v8, v2}, Lg0/P;->a(I)Lg0/O;

    .line 881
    .line 882
    .line 883
    move-result-object v8

    .line 884
    iget-wide v8, v8, Lg0/O;->c:J

    .line 885
    .line 886
    cmp-long v10, v8, v21

    .line 887
    .line 888
    if-eqz v10, :cond_31

    .line 889
    .line 890
    add-long/2addr v8, v3

    .line 891
    cmp-long v10, v8, p2

    .line 892
    .line 893
    if-gez v10, :cond_30

    .line 894
    .line 895
    goto :goto_16

    .line 896
    :cond_30
    const/4 v8, 0x0

    .line 897
    goto :goto_17

    .line 898
    :cond_31
    :goto_16
    const/4 v8, 0x1

    .line 899
    :goto_17
    if-nez v8, :cond_32

    .line 900
    .line 901
    const/16 v18, 0x0

    .line 902
    .line 903
    return-object v18

    .line 904
    :cond_32
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 905
    .line 906
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    :try_start_0
    invoke-static {}, LJ/k;->a()Z

    .line 910
    .line 911
    .line 912
    move-result v9

    .line 913
    if-eqz v9, :cond_33

    .line 914
    .line 915
    const-string v9, "RV onCreateViewHolder type=0x%X"

    .line 916
    .line 917
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v10

    .line 921
    const/4 v11, 0x1

    .line 922
    new-array v12, v11, [Ljava/lang/Object;

    .line 923
    .line 924
    aput-object v10, v12, v2

    .line 925
    .line 926
    invoke-static {v9, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    goto :goto_18

    .line 934
    :catchall_0
    move-exception v0

    .line 935
    goto :goto_1a

    .line 936
    :cond_33
    :goto_18
    invoke-virtual {v8, v5}, Lg0/B;->d(Landroid/view/ViewGroup;)Lg0/b0;

    .line 937
    .line 938
    .line 939
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 940
    iget-object v8, v11, Lg0/b0;->a:Landroid/view/View;

    .line 941
    .line 942
    :try_start_1
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 943
    .line 944
    .line 945
    move-result-object v9

    .line 946
    if-nez v9, :cond_36

    .line 947
    .line 948
    iput v2, v11, Lg0/b0;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 949
    .line 950
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 951
    .line 952
    .line 953
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->E0:Z

    .line 954
    .line 955
    if-eqz v9, :cond_34

    .line 956
    .line 957
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->G(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 958
    .line 959
    .line 960
    move-result-object v8

    .line 961
    if-eqz v8, :cond_34

    .line 962
    .line 963
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 964
    .line 965
    invoke-direct {v9, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    iput-object v9, v11, Lg0/b0;->b:Ljava/lang/ref/WeakReference;

    .line 969
    .line 970
    :cond_34
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 971
    .line 972
    .line 973
    move-result-wide v8

    .line 974
    iget-object v10, v1, Lg0/Q;->g:Lg0/P;

    .line 975
    .line 976
    sub-long/2addr v8, v3

    .line 977
    invoke-virtual {v10, v2}, Lg0/P;->a(I)Lg0/O;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    iget-wide v14, v3, Lg0/O;->c:J

    .line 982
    .line 983
    cmp-long v4, v14, v21

    .line 984
    .line 985
    if-nez v4, :cond_35

    .line 986
    .line 987
    goto :goto_19

    .line 988
    :cond_35
    div-long v14, v14, v19

    .line 989
    .line 990
    mul-long v14, v14, v27

    .line 991
    .line 992
    div-long v8, v8, v19

    .line 993
    .line 994
    add-long/2addr v8, v14

    .line 995
    :goto_19
    iput-wide v8, v3, Lg0/O;->c:J

    .line 996
    .line 997
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 998
    .line 999
    if-eqz v3, :cond_39

    .line 1000
    .line 1001
    const-string v3, "tryGetViewHolderForPositionByDeadline created new ViewHolder"

    .line 1002
    .line 1003
    invoke-static {v13, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1004
    .line 1005
    .line 1006
    goto :goto_1b

    .line 1007
    :cond_36
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1008
    .line 1009
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 1010
    .line 1011
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1015
    :goto_1a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1016
    .line 1017
    .line 1018
    throw v0

    .line 1019
    :cond_37
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 1020
    .line 1021
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 1024
    .line 1025
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    const-string v0, "(offset:"

    .line 1032
    .line 1033
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    const-string v0, ").state:"

    .line 1040
    .line 1041
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v6}, Lg0/X;->b()I

    .line 1045
    .line 1046
    .line 1047
    move-result v0

    .line 1048
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    throw v2

    .line 1066
    :cond_38
    const-wide/16 v27, 0x3

    .line 1067
    .line 1068
    :cond_39
    :goto_1b
    if-eqz v7, :cond_3b

    .line 1069
    .line 1070
    iget-boolean v3, v6, Lg0/X;->g:Z

    .line 1071
    .line 1072
    if-nez v3, :cond_3b

    .line 1073
    .line 1074
    iget v3, v11, Lg0/b0;->j:I

    .line 1075
    .line 1076
    and-int/lit16 v4, v3, 0x2000

    .line 1077
    .line 1078
    if-eqz v4, :cond_3a

    .line 1079
    .line 1080
    const/4 v4, 0x1

    .line 1081
    goto :goto_1c

    .line 1082
    :cond_3a
    const/4 v4, 0x0

    .line 1083
    :goto_1c
    if-eqz v4, :cond_3b

    .line 1084
    .line 1085
    and-int/lit16 v3, v3, -0x2001

    .line 1086
    .line 1087
    iput v3, v11, Lg0/b0;->j:I

    .line 1088
    .line 1089
    iget-boolean v3, v6, Lg0/X;->j:Z

    .line 1090
    .line 1091
    if-eqz v3, :cond_3b

    .line 1092
    .line 1093
    invoke-static {v11}, Lg0/G;->b(Lg0/b0;)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v3, v5, Landroidx/recyclerview/widget/RecyclerView;->J:Lg0/G;

    .line 1097
    .line 1098
    invoke-virtual {v11}, Lg0/b0;->c()Ljava/util/List;

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    new-instance v3, LN/q;

    .line 1105
    .line 1106
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v3, v11}, LN/q;->a(Lg0/b0;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v5, v11, v3}, Landroidx/recyclerview/widget/RecyclerView;->Y(Lg0/b0;LN/q;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_3b
    iget-boolean v3, v6, Lg0/X;->g:Z

    .line 1116
    .line 1117
    iget-object v4, v11, Lg0/b0;->a:Landroid/view/View;

    .line 1118
    .line 1119
    if-eqz v3, :cond_3c

    .line 1120
    .line 1121
    invoke-virtual {v11}, Lg0/b0;->e()Z

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    if-eqz v3, :cond_3c

    .line 1126
    .line 1127
    iput v0, v11, Lg0/b0;->g:I

    .line 1128
    .line 1129
    goto :goto_1e

    .line 1130
    :cond_3c
    invoke-virtual {v11}, Lg0/b0;->e()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v3

    .line 1134
    if-eqz v3, :cond_3f

    .line 1135
    .line 1136
    iget v3, v11, Lg0/b0;->j:I

    .line 1137
    .line 1138
    and-int/lit8 v3, v3, 0x2

    .line 1139
    .line 1140
    if-eqz v3, :cond_3d

    .line 1141
    .line 1142
    const/4 v3, 0x1

    .line 1143
    goto :goto_1d

    .line 1144
    :cond_3d
    const/4 v3, 0x0

    .line 1145
    :goto_1d
    if-nez v3, :cond_3f

    .line 1146
    .line 1147
    invoke-virtual {v11}, Lg0/b0;->f()Z

    .line 1148
    .line 1149
    .line 1150
    move-result v3

    .line 1151
    if-eqz v3, :cond_3e

    .line 1152
    .line 1153
    goto :goto_1f

    .line 1154
    :cond_3e
    :goto_1e
    const/4 v0, 0x0

    .line 1155
    const/4 v9, 0x1

    .line 1156
    goto/16 :goto_2b

    .line 1157
    .line 1158
    :cond_3f
    :goto_1f
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 1159
    .line 1160
    if-eqz v3, :cond_41

    .line 1161
    .line 1162
    invoke-virtual {v11}, Lg0/b0;->h()Z

    .line 1163
    .line 1164
    .line 1165
    move-result v3

    .line 1166
    if-nez v3, :cond_40

    .line 1167
    .line 1168
    goto :goto_20

    .line 1169
    :cond_40
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1170
    .line 1171
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    const-string v3, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1174
    .line 1175
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1179
    .line 1180
    .line 1181
    invoke-static {v5, v2}, Landroidx/fragment/app/T;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    throw v0

    .line 1189
    :cond_41
    :goto_20
    iget-object v3, v5, Landroidx/recyclerview/widget/RecyclerView;->e:LK/e;

    .line 1190
    .line 1191
    invoke-virtual {v3, v0, v2}, LK/e;->e(II)I

    .line 1192
    .line 1193
    .line 1194
    move-result v3

    .line 1195
    const/4 v8, 0x0

    .line 1196
    iput-object v8, v11, Lg0/b0;->s:Lg0/B;

    .line 1197
    .line 1198
    iput-object v5, v11, Lg0/b0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1199
    .line 1200
    iget v9, v11, Lg0/b0;->f:I

    .line 1201
    .line 1202
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1203
    .line 1204
    .line 1205
    move-result-wide v12

    .line 1206
    cmp-long v10, p2, v23

    .line 1207
    .line 1208
    if-eqz v10, :cond_42

    .line 1209
    .line 1210
    iget-object v10, v1, Lg0/Q;->g:Lg0/P;

    .line 1211
    .line 1212
    invoke-virtual {v10, v9}, Lg0/P;->a(I)Lg0/O;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v9

    .line 1216
    iget-wide v9, v9, Lg0/O;->d:J

    .line 1217
    .line 1218
    cmp-long v14, v9, v21

    .line 1219
    .line 1220
    if-eqz v14, :cond_42

    .line 1221
    .line 1222
    add-long/2addr v9, v12

    .line 1223
    cmp-long v14, v9, p2

    .line 1224
    .line 1225
    if-gez v14, :cond_3e

    .line 1226
    .line 1227
    :cond_42
    invoke-virtual {v11}, Lg0/b0;->j()Z

    .line 1228
    .line 1229
    .line 1230
    move-result v9

    .line 1231
    if-eqz v9, :cond_43

    .line 1232
    .line 1233
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1234
    .line 1235
    .line 1236
    move-result v9

    .line 1237
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v10

    .line 1241
    invoke-static {v5, v4, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1242
    .line 1243
    .line 1244
    const/4 v9, 0x1

    .line 1245
    goto :goto_21

    .line 1246
    :cond_43
    const/4 v9, 0x0

    .line 1247
    :goto_21
    iget-object v10, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 1248
    .line 1249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    iget-object v14, v11, Lg0/b0;->s:Lg0/B;

    .line 1253
    .line 1254
    if-nez v14, :cond_44

    .line 1255
    .line 1256
    const/4 v14, 0x1

    .line 1257
    goto :goto_22

    .line 1258
    :cond_44
    const/4 v14, 0x0

    .line 1259
    :goto_22
    if-eqz v14, :cond_46

    .line 1260
    .line 1261
    iput v3, v11, Lg0/b0;->c:I

    .line 1262
    .line 1263
    iget-boolean v15, v10, Lg0/B;->b:Z

    .line 1264
    .line 1265
    move/from16 p2, v9

    .line 1266
    .line 1267
    if-eqz v15, :cond_45

    .line 1268
    .line 1269
    invoke-virtual {v10, v3}, Lg0/B;->b(I)J

    .line 1270
    .line 1271
    .line 1272
    move-result-wide v8

    .line 1273
    iput-wide v8, v11, Lg0/b0;->e:J

    .line 1274
    .line 1275
    :cond_45
    iget v8, v11, Lg0/b0;->j:I

    .line 1276
    .line 1277
    and-int/lit16 v8, v8, -0x208

    .line 1278
    .line 1279
    const/4 v9, 0x1

    .line 1280
    or-int/2addr v8, v9

    .line 1281
    iput v8, v11, Lg0/b0;->j:I

    .line 1282
    .line 1283
    invoke-static {}, LJ/k;->a()Z

    .line 1284
    .line 1285
    .line 1286
    move-result v8

    .line 1287
    if-eqz v8, :cond_47

    .line 1288
    .line 1289
    iget v8, v11, Lg0/b0;->f:I

    .line 1290
    .line 1291
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v8

    .line 1295
    new-array v15, v9, [Ljava/lang/Object;

    .line 1296
    .line 1297
    aput-object v8, v15, v2

    .line 1298
    .line 1299
    const-string v8, "RV onBindViewHolder type=0x%X"

    .line 1300
    .line 1301
    invoke-static {v8, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v8

    .line 1305
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_23

    .line 1309
    :cond_46
    move/from16 p2, v9

    .line 1310
    .line 1311
    :cond_47
    :goto_23
    iput-object v10, v11, Lg0/b0;->s:Lg0/B;

    .line 1312
    .line 1313
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 1314
    .line 1315
    if-eqz v8, :cond_4b

    .line 1316
    .line 1317
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v8

    .line 1321
    if-nez v8, :cond_49

    .line 1322
    .line 1323
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v8

    .line 1327
    invoke-virtual {v11}, Lg0/b0;->j()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v9

    .line 1331
    if-ne v8, v9, :cond_48

    .line 1332
    .line 1333
    goto :goto_24

    .line 1334
    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1335
    .line 1336
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    const-string v3, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 1339
    .line 1340
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v11}, Lg0/b0;->j()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v3

    .line 1347
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1348
    .line 1349
    .line 1350
    const-string v3, ", attached to window: "

    .line 1351
    .line 1352
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1356
    .line 1357
    .line 1358
    move-result v3

    .line 1359
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1360
    .line 1361
    .line 1362
    const-string v3, ", holder: "

    .line 1363
    .line 1364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    throw v0

    .line 1378
    :cond_49
    :goto_24
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v8

    .line 1382
    if-nez v8, :cond_4b

    .line 1383
    .line 1384
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v8

    .line 1388
    if-nez v8, :cond_4a

    .line 1389
    .line 1390
    goto :goto_25

    .line 1391
    :cond_4a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1392
    .line 1393
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1394
    .line 1395
    const-string v3, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 1396
    .line 1397
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v2

    .line 1407
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    throw v0

    .line 1411
    :cond_4b
    :goto_25
    invoke-virtual {v11}, Lg0/b0;->c()Ljava/util/List;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v10, v11, v3}, Lg0/B;->c(Lg0/b0;I)V

    .line 1415
    .line 1416
    .line 1417
    if-eqz v14, :cond_4e

    .line 1418
    .line 1419
    iget-object v3, v11, Lg0/b0;->k:Ljava/util/ArrayList;

    .line 1420
    .line 1421
    if-eqz v3, :cond_4c

    .line 1422
    .line 1423
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 1424
    .line 1425
    .line 1426
    :cond_4c
    iget v3, v11, Lg0/b0;->j:I

    .line 1427
    .line 1428
    and-int/lit16 v3, v3, -0x401

    .line 1429
    .line 1430
    iput v3, v11, Lg0/b0;->j:I

    .line 1431
    .line 1432
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v3

    .line 1436
    instance-of v8, v3, Lg0/L;

    .line 1437
    .line 1438
    if-eqz v8, :cond_4d

    .line 1439
    .line 1440
    check-cast v3, Lg0/L;

    .line 1441
    .line 1442
    const/4 v9, 0x1

    .line 1443
    iput-boolean v9, v3, Lg0/L;->c:Z

    .line 1444
    .line 1445
    :cond_4d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1446
    .line 1447
    .line 1448
    :cond_4e
    if-eqz p2, :cond_4f

    .line 1449
    .line 1450
    invoke-static {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 1451
    .line 1452
    .line 1453
    :cond_4f
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1454
    .line 1455
    .line 1456
    move-result-wide v8

    .line 1457
    iget-object v3, v1, Lg0/Q;->g:Lg0/P;

    .line 1458
    .line 1459
    iget v10, v11, Lg0/b0;->f:I

    .line 1460
    .line 1461
    sub-long/2addr v8, v12

    .line 1462
    invoke-virtual {v3, v10}, Lg0/P;->a(I)Lg0/O;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v3

    .line 1466
    iget-wide v12, v3, Lg0/O;->d:J

    .line 1467
    .line 1468
    cmp-long v10, v12, v21

    .line 1469
    .line 1470
    if-nez v10, :cond_50

    .line 1471
    .line 1472
    goto :goto_26

    .line 1473
    :cond_50
    div-long v12, v12, v19

    .line 1474
    .line 1475
    mul-long v12, v12, v27

    .line 1476
    .line 1477
    div-long v8, v8, v19

    .line 1478
    .line 1479
    add-long/2addr v8, v12

    .line 1480
    :goto_26
    iput-wide v8, v3, Lg0/O;->d:J

    .line 1481
    .line 1482
    iget-object v3, v5, Landroidx/recyclerview/widget/RecyclerView;->z:Landroid/view/accessibility/AccessibilityManager;

    .line 1483
    .line 1484
    if-eqz v3, :cond_51

    .line 1485
    .line 1486
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1487
    .line 1488
    .line 1489
    move-result v3

    .line 1490
    if-eqz v3, :cond_51

    .line 1491
    .line 1492
    const/4 v3, 0x1

    .line 1493
    goto :goto_27

    .line 1494
    :cond_51
    const/4 v3, 0x0

    .line 1495
    :goto_27
    if-eqz v3, :cond_58

    .line 1496
    .line 1497
    invoke-virtual {v4}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1498
    .line 1499
    .line 1500
    move-result v3

    .line 1501
    const/4 v9, 0x1

    .line 1502
    if-nez v3, :cond_52

    .line 1503
    .line 1504
    invoke-virtual {v4, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1505
    .line 1506
    .line 1507
    :cond_52
    iget-object v3, v5, Landroidx/recyclerview/widget/RecyclerView;->l0:Lg0/d0;

    .line 1508
    .line 1509
    if-nez v3, :cond_53

    .line 1510
    .line 1511
    goto :goto_2a

    .line 1512
    :cond_53
    iget-object v3, v3, Lg0/d0;->e:Lg0/c0;

    .line 1513
    .line 1514
    if-eqz v3, :cond_54

    .line 1515
    .line 1516
    const/4 v8, 0x1

    .line 1517
    goto :goto_28

    .line 1518
    :cond_54
    const/4 v8, 0x0

    .line 1519
    :goto_28
    if-eqz v8, :cond_57

    .line 1520
    .line 1521
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1522
    .line 1523
    .line 1524
    invoke-static {v4}, LN/S;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v8

    .line 1528
    if-nez v8, :cond_55

    .line 1529
    .line 1530
    const/4 v8, 0x0

    .line 1531
    goto :goto_29

    .line 1532
    :cond_55
    instance-of v10, v8, LN/a;

    .line 1533
    .line 1534
    if-eqz v10, :cond_56

    .line 1535
    .line 1536
    check-cast v8, LN/a;

    .line 1537
    .line 1538
    iget-object v8, v8, LN/a;->a:LN/b;

    .line 1539
    .line 1540
    goto :goto_29

    .line 1541
    :cond_56
    new-instance v10, LN/b;

    .line 1542
    .line 1543
    invoke-direct {v10, v8}, LN/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1544
    .line 1545
    .line 1546
    move-object v8, v10

    .line 1547
    :goto_29
    if-eqz v8, :cond_57

    .line 1548
    .line 1549
    if-eq v8, v3, :cond_57

    .line 1550
    .line 1551
    iget-object v10, v3, Lg0/c0;->e:Ljava/util/WeakHashMap;

    .line 1552
    .line 1553
    invoke-virtual {v10, v4, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    :cond_57
    invoke-static {v4, v3}, LN/S;->p(Landroid/view/View;LN/b;)V

    .line 1557
    .line 1558
    .line 1559
    goto :goto_2a

    .line 1560
    :cond_58
    const/4 v9, 0x1

    .line 1561
    :goto_2a
    iget-boolean v3, v6, Lg0/X;->g:Z

    .line 1562
    .line 1563
    if-eqz v3, :cond_59

    .line 1564
    .line 1565
    iput v0, v11, Lg0/b0;->g:I

    .line 1566
    .line 1567
    :cond_59
    const/4 v0, 0x1

    .line 1568
    :goto_2b
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v3

    .line 1572
    if-nez v3, :cond_5a

    .line 1573
    .line 1574
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v3

    .line 1578
    check-cast v3, Lg0/L;

    .line 1579
    .line 1580
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1581
    .line 1582
    .line 1583
    goto :goto_2c

    .line 1584
    :cond_5a
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v6

    .line 1588
    if-nez v6, :cond_5b

    .line 1589
    .line 1590
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v3

    .line 1594
    check-cast v3, Lg0/L;

    .line 1595
    .line 1596
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1597
    .line 1598
    .line 1599
    goto :goto_2c

    .line 1600
    :cond_5b
    check-cast v3, Lg0/L;

    .line 1601
    .line 1602
    :goto_2c
    iput-object v11, v3, Lg0/L;->a:Lg0/b0;

    .line 1603
    .line 1604
    if-eqz v7, :cond_5c

    .line 1605
    .line 1606
    if-eqz v0, :cond_5c

    .line 1607
    .line 1608
    const/4 v2, 0x1

    .line 1609
    :cond_5c
    iput-boolean v2, v3, Lg0/L;->d:Z

    .line 1610
    .line 1611
    return-object v11

    .line 1612
    :cond_5d
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 1613
    .line 1614
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    const-string v4, "Invalid item position "

    .line 1617
    .line 1618
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1622
    .line 1623
    .line 1624
    const-string v4, "("

    .line 1625
    .line 1626
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1630
    .line 1631
    .line 1632
    const-string v0, "). Item count:"

    .line 1633
    .line 1634
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1635
    .line 1636
    .line 1637
    iget-object v0, v5, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 1638
    .line 1639
    invoke-virtual {v0}, Lg0/X;->b()I

    .line 1640
    .line 1641
    .line 1642
    move-result v0

    .line 1643
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v0

    .line 1657
    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1658
    .line 1659
    .line 1660
    throw v2
.end method

.method public final l(Lg0/b0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lg0/b0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg0/Q;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lg0/Q;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Lg0/b0;->n:Lg0/Q;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lg0/b0;->o:Z

    .line 21
    .line 22
    iget v0, p1, Lg0/b0;->j:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x21

    .line 25
    .line 26
    iput v0, p1, Lg0/b0;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/Q;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->m:Lg0/K;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lg0/K;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lg0/Q;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Lg0/Q;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Lg0/Q;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Lg0/Q;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lg0/Q;->g(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method

.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# static fields
.field public static final P:Ljava/util/Set;


# instance fields
.field public E:Z

.field public F:I

.field public G:[I

.field public H:[Landroid/view/View;

.field public final I:Landroid/util/SparseIntArray;

.field public final J:Landroid/util/SparseIntArray;

.field public final K:LC0/n;

.field public final L:Landroid/graphics/Rect;

.field public M:I

.field public N:I

.field public O:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x42

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x21

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v4, 0x82

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x4

    .line 28
    new-array v5, v5, [Ljava/lang/Integer;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    aput-object v1, v5, v6

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    aput-object v2, v5, v1

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    aput-object v3, v5, v1

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    aput-object v4, v5, v1

    .line 41
    .line 42
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Ljava/util/Set;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 16
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 17
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 18
    new-instance v1, LC0/n;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, LC0/n;-><init>(I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 19
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 20
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:I

    .line 21
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 22
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 23
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->s1(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 4
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 5
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 6
    new-instance v1, LC0/n;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, LC0/n;-><init>(I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 7
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:I

    .line 9
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 11
    invoke-static {p1, p2, p3, p4}, Lg0/K;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Lg0/J;

    move-result-object p1

    .line 12
    iget p1, p1, Lg0/J;->b:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->s1(I)V

    return-void
.end method


# virtual methods
.method public final C0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lg0/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final E0(Lg0/X;Lg0/u;Lg0/n;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 6
    .line 7
    if-ge v2, v3, :cond_0

    .line 8
    .line 9
    iget v3, p2, Lg0/u;->d:I

    .line 10
    .line 11
    if-ltz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lg0/X;->b()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_0

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    iget v3, p2, Lg0/u;->d:I

    .line 22
    .line 23
    iget v4, p2, Lg0/u;->g:I

    .line 24
    .line 25
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {p3, v3, v4}, Lg0/n;->a(II)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    iget v3, p2, Lg0/u;->d:I

    .line 40
    .line 41
    iget v4, p2, Lg0/u;->e:I

    .line 42
    .line 43
    add-int/2addr v3, v4

    .line 44
    iput v3, p2, Lg0/u;->d:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method public final I(Lg0/Q;Lg0/X;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ge v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_1
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/2addr p1, v1

    .line 35
    return p1
.end method

.method public final Q0(Lg0/Q;Lg0/X;ZZ)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lg0/K;->v()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lg0/K;->v()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    sub-int/2addr p3, v0

    .line 13
    const/4 p4, -0x1

    .line 14
    const/4 v0, -0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p4, 0x0

    .line 17
    move p4, p3

    .line 18
    const/4 p3, 0x0

    .line 19
    :goto_0
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/emoji2/text/g;->k()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroidx/emoji2/text/g;->g()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    move-object v5, v4

    .line 40
    :goto_1
    if-eq p3, p4, :cond_6

    .line 41
    .line 42
    invoke-virtual {p0, p3}, Lg0/K;->u(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {v6}, Lg0/K;->G(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-ltz v7, :cond_5

    .line 51
    .line 52
    if-ge v7, v1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0, v7, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Lg0/L;

    .line 66
    .line 67
    iget-object v7, v7, Lg0/L;->a:Lg0/b0;

    .line 68
    .line 69
    invoke-virtual {v7}, Lg0/b0;->h()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    if-nez v5, :cond_5

    .line 76
    .line 77
    move-object v5, v6

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 80
    .line 81
    invoke-virtual {v7, v6}, Landroidx/emoji2/text/g;->e(Landroid/view/View;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-ge v7, v3, :cond_4

    .line 86
    .line 87
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 88
    .line 89
    invoke-virtual {v7, v6}, Landroidx/emoji2/text/g;->b(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-ge v7, v2, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    return-object v6

    .line 97
    :cond_4
    :goto_2
    if-nez v4, :cond_5

    .line 98
    .line 99
    move-object v4, v6

    .line 100
    :cond_5
    :goto_3
    add-int/2addr p3, v0

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    if-eqz v4, :cond_7

    .line 103
    .line 104
    return-object v4

    .line 105
    :cond_7
    return-object v5
.end method

.method public final T(Landroid/view/View;ILg0/Q;Lg0/X;)Landroid/view/View;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v5, p1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v6, v0, Lg0/K;->a:Lg0/c;

    .line 25
    .line 26
    iget-object v6, v6, Lg0/c;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    :goto_0
    move-object v3, v4

    .line 35
    :cond_2
    if-nez v3, :cond_3

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lg0/q;

    .line 43
    .line 44
    iget v7, v6, Lg0/q;->e:I

    .line 45
    .line 46
    iget v6, v6, Lg0/q;->f:I

    .line 47
    .line 48
    add-int/2addr v6, v7

    .line 49
    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(Landroid/view/View;ILg0/Q;Lg0/X;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v5, :cond_4

    .line 54
    .line 55
    :goto_1
    return-object v4

    .line 56
    :cond_4
    move/from16 v5, p2

    .line 57
    .line 58
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/4 v9, 0x1

    .line 63
    if-ne v5, v9, :cond_5

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    goto :goto_2

    .line 67
    :cond_5
    const/4 v5, 0x0

    .line 68
    :goto_2
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 69
    .line 70
    const/4 v11, -0x1

    .line 71
    if-eq v5, v10, :cond_6

    .line 72
    .line 73
    invoke-virtual {v0}, Lg0/K;->v()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    sub-int/2addr v5, v9

    .line 78
    const/4 v10, -0x1

    .line 79
    const/4 v12, -0x1

    .line 80
    goto :goto_3

    .line 81
    :cond_6
    invoke-virtual {v0}, Lg0/K;->v()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    move v10, v5

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v12, 0x1

    .line 88
    :goto_3
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 89
    .line 90
    if-ne v13, v9, :cond_7

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    if-eqz v13, :cond_7

    .line 97
    .line 98
    const/4 v13, 0x1

    .line 99
    goto :goto_4

    .line 100
    :cond_7
    const/4 v13, 0x0

    .line 101
    :goto_4
    invoke-virtual {v0, v5, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    move-object/from16 v16, v4

    .line 106
    .line 107
    move v11, v5

    .line 108
    const/4 v8, -0x1

    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v15, -0x1

    .line 111
    move-object/from16 v5, v16

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    :goto_5
    move-object/from16 v17, v5

    .line 115
    .line 116
    if-eq v11, v10, :cond_18

    .line 117
    .line 118
    invoke-virtual {v0, v11, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v0, v11}, Lg0/K;->u(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-ne v1, v3, :cond_8

    .line 127
    .line 128
    goto/16 :goto_c

    .line 129
    .line 130
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 131
    .line 132
    .line 133
    move-result v18

    .line 134
    if-eqz v18, :cond_a

    .line 135
    .line 136
    if-eq v5, v14, :cond_a

    .line 137
    .line 138
    if-eqz v16, :cond_9

    .line 139
    .line 140
    goto/16 :goto_c

    .line 141
    .line 142
    :cond_9
    move-object/from16 v18, v3

    .line 143
    .line 144
    move/from16 v19, v9

    .line 145
    .line 146
    move/from16 v21, v10

    .line 147
    .line 148
    goto/16 :goto_a

    .line 149
    .line 150
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Lg0/q;

    .line 155
    .line 156
    iget v2, v5, Lg0/q;->e:I

    .line 157
    .line 158
    move-object/from16 v18, v3

    .line 159
    .line 160
    iget v3, v5, Lg0/q;->f:I

    .line 161
    .line 162
    add-int/2addr v3, v2

    .line 163
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 164
    .line 165
    .line 166
    move-result v19

    .line 167
    if-eqz v19, :cond_b

    .line 168
    .line 169
    if-ne v2, v7, :cond_b

    .line 170
    .line 171
    if-ne v3, v6, :cond_b

    .line 172
    .line 173
    return-object v1

    .line 174
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 175
    .line 176
    .line 177
    move-result v19

    .line 178
    if-eqz v19, :cond_c

    .line 179
    .line 180
    if-eqz v16, :cond_d

    .line 181
    .line 182
    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 183
    .line 184
    .line 185
    move-result v19

    .line 186
    if-nez v19, :cond_e

    .line 187
    .line 188
    if-nez v17, :cond_e

    .line 189
    .line 190
    :cond_d
    move/from16 v19, v9

    .line 191
    .line 192
    move/from16 v21, v10

    .line 193
    .line 194
    goto :goto_9

    .line 195
    :cond_e
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 196
    .line 197
    .line 198
    move-result v19

    .line 199
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 200
    .line 201
    .line 202
    move-result v20

    .line 203
    move/from16 v21, v10

    .line 204
    .line 205
    sub-int v10, v20, v19

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 208
    .line 209
    .line 210
    move-result v19

    .line 211
    if-eqz v19, :cond_12

    .line 212
    .line 213
    if-le v10, v9, :cond_f

    .line 214
    .line 215
    :goto_6
    move/from16 v19, v9

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_f
    if-ne v10, v9, :cond_11

    .line 219
    .line 220
    if-le v2, v15, :cond_10

    .line 221
    .line 222
    const/4 v10, 0x1

    .line 223
    goto :goto_7

    .line 224
    :cond_10
    const/4 v10, 0x0

    .line 225
    :goto_7
    if-ne v13, v10, :cond_11

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_11
    move/from16 v19, v9

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_12
    if-nez v16, :cond_11

    .line 232
    .line 233
    move/from16 v19, v9

    .line 234
    .line 235
    iget-object v9, v0, Lg0/K;->c:LC0/n;

    .line 236
    .line 237
    invoke-virtual {v9, v1}, LC0/n;->A(Landroid/view/View;)Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eqz v9, :cond_13

    .line 242
    .line 243
    iget-object v9, v0, Lg0/K;->d:LC0/n;

    .line 244
    .line 245
    invoke-virtual {v9, v1}, LC0/n;->A(Landroid/view/View;)Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_13

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_13
    if-le v10, v4, :cond_14

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_14
    if-ne v10, v4, :cond_17

    .line 256
    .line 257
    if-le v2, v8, :cond_15

    .line 258
    .line 259
    const/4 v9, 0x1

    .line 260
    goto :goto_8

    .line 261
    :cond_15
    const/4 v9, 0x0

    .line 262
    :goto_8
    if-ne v13, v9, :cond_17

    .line 263
    .line 264
    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-eqz v9, :cond_16

    .line 269
    .line 270
    iget v5, v5, Lg0/q;->e:I

    .line 271
    .line 272
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    sub-int v9, v3, v2

    .line 281
    .line 282
    move-object/from16 v16, v1

    .line 283
    .line 284
    move v15, v5

    .line 285
    move-object/from16 v5, v17

    .line 286
    .line 287
    goto :goto_b

    .line 288
    :cond_16
    iget v4, v5, Lg0/q;->e:I

    .line 289
    .line 290
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    sub-int v2, v3, v2

    .line 299
    .line 300
    move-object v5, v1

    .line 301
    move v8, v4

    .line 302
    move/from16 v9, v19

    .line 303
    .line 304
    move v4, v2

    .line 305
    goto :goto_b

    .line 306
    :cond_17
    :goto_a
    move-object/from16 v5, v17

    .line 307
    .line 308
    move/from16 v9, v19

    .line 309
    .line 310
    :goto_b
    add-int/2addr v11, v12

    .line 311
    move-object/from16 v1, p3

    .line 312
    .line 313
    move-object/from16 v2, p4

    .line 314
    .line 315
    move-object/from16 v3, v18

    .line 316
    .line 317
    move/from16 v10, v21

    .line 318
    .line 319
    goto/16 :goto_5

    .line 320
    .line 321
    :cond_18
    :goto_c
    if-eqz v16, :cond_19

    .line 322
    .line 323
    return-object v16

    .line 324
    :cond_19
    return-object v17
.end method

.method public final V(Lg0/Q;Lg0/X;LO/k;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->V(Lg0/Q;Lg0/X;LO/k;)V

    .line 2
    .line 3
    .line 4
    const-class p1, Landroid/widget/GridView;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p3, p1}, LO/k;->i(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lg0/B;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, 0x1

    .line 24
    if-le p1, p2, :cond_0

    .line 25
    .line 26
    sget-object p1, LO/f;->o:LO/f;

    .line 27
    .line 28
    invoke-virtual {p3, p1}, LO/k;->b(LO/f;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final W0(Lg0/Q;Lg0/X;Lg0/u;Lg0/t;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 12
    .line 13
    invoke-virtual {v5}, Landroidx/emoji2/text/g;->j()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 v6, 0x1

    .line 18
    const/high16 v8, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-eq v5, v8, :cond_0

    .line 21
    .line 22
    const/4 v9, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v9, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0}, Lg0/K;->v()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-lez v10, :cond_1

    .line 30
    .line 31
    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 32
    .line 33
    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 34
    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v10, 0x0

    .line 39
    :goto_1
    if-eqz v9, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->t1()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v11, v3, Lg0/u;->e:I

    .line 45
    .line 46
    if-ne v11, v6, :cond_3

    .line 47
    .line 48
    const/4 v11, 0x1

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/4 v11, 0x0

    .line 51
    :goto_2
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 52
    .line 53
    if-nez v11, :cond_4

    .line 54
    .line 55
    iget v12, v3, Lg0/u;->d:I

    .line 56
    .line 57
    invoke-virtual {v0, v12, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    iget v13, v3, Lg0/u;->d:I

    .line 62
    .line 63
    invoke-virtual {v0, v13, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->q1(ILg0/Q;Lg0/X;)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    add-int/2addr v12, v13

    .line 68
    :cond_4
    const/4 v13, 0x0

    .line 69
    :goto_3
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 70
    .line 71
    if-ge v13, v14, :cond_8

    .line 72
    .line 73
    iget v14, v3, Lg0/u;->d:I

    .line 74
    .line 75
    if-ltz v14, :cond_8

    .line 76
    .line 77
    invoke-virtual {v2}, Lg0/X;->b()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    if-ge v14, v15, :cond_8

    .line 82
    .line 83
    if-lez v12, :cond_8

    .line 84
    .line 85
    iget v14, v3, Lg0/u;->d:I

    .line 86
    .line 87
    invoke-virtual {v0, v14, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->q1(ILg0/Q;Lg0/X;)I

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 92
    .line 93
    if-gt v15, v8, :cond_7

    .line 94
    .line 95
    sub-int/2addr v12, v15

    .line 96
    if-gez v12, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-virtual {v3, v1}, Lg0/u;->b(Lg0/Q;)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    if-nez v8, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 107
    .line 108
    aput-object v8, v14, v13

    .line 109
    .line 110
    add-int/lit8 v13, v13, 0x1

    .line 111
    .line 112
    const/high16 v8, 0x40000000    # 2.0f

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v3, "Item at position "

    .line 120
    .line 121
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v3, " requires "

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v3, " spans but GridLayoutManager has only "

    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v3, " spans."

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_8
    :goto_4
    if-nez v13, :cond_9

    .line 159
    .line 160
    iput-boolean v6, v4, Lg0/t;->b:Z

    .line 161
    .line 162
    return-void

    .line 163
    :cond_9
    if-eqz v11, :cond_a

    .line 164
    .line 165
    move v14, v13

    .line 166
    const/4 v12, 0x0

    .line 167
    const/4 v15, 0x1

    .line 168
    goto :goto_5

    .line 169
    :cond_a
    add-int/lit8 v12, v13, -0x1

    .line 170
    .line 171
    const/4 v14, -0x1

    .line 172
    const/4 v15, -0x1

    .line 173
    :goto_5
    const/4 v6, 0x0

    .line 174
    :goto_6
    if-eq v12, v14, :cond_b

    .line 175
    .line 176
    iget-object v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 177
    .line 178
    aget-object v7, v7, v12

    .line 179
    .line 180
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 181
    .line 182
    .line 183
    move-result-object v16

    .line 184
    move-object/from16 v8, v16

    .line 185
    .line 186
    check-cast v8, Lg0/q;

    .line 187
    .line 188
    invoke-static {v7}, Lg0/K;->G(Landroid/view/View;)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v0, v7, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->q1(ILg0/Q;Lg0/X;)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    iput v7, v8, Lg0/q;->f:I

    .line 197
    .line 198
    iput v6, v8, Lg0/q;->e:I

    .line 199
    .line 200
    add-int/2addr v6, v7

    .line 201
    add-int/2addr v12, v15

    .line 202
    goto :goto_6

    .line 203
    :cond_b
    const/4 v1, 0x0

    .line 204
    const/4 v2, 0x0

    .line 205
    const/4 v6, 0x0

    .line 206
    :goto_7
    if-ge v2, v13, :cond_12

    .line 207
    .line 208
    iget-object v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 209
    .line 210
    aget-object v7, v7, v2

    .line 211
    .line 212
    iget-object v8, v3, Lg0/u;->k:Ljava/util/List;

    .line 213
    .line 214
    if-nez v8, :cond_d

    .line 215
    .line 216
    if-eqz v11, :cond_c

    .line 217
    .line 218
    const/4 v8, 0x0

    .line 219
    const/4 v12, -0x1

    .line 220
    invoke-virtual {v0, v7, v12, v8}, Lg0/K;->b(Landroid/view/View;IZ)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_c
    const/4 v8, 0x0

    .line 225
    const/4 v12, -0x1

    .line 226
    invoke-virtual {v0, v7, v8, v8}, Lg0/K;->b(Landroid/view/View;IZ)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_d
    const/4 v8, 0x0

    .line 231
    const/4 v12, -0x1

    .line 232
    if-eqz v11, :cond_e

    .line 233
    .line 234
    const/4 v14, 0x1

    .line 235
    invoke-virtual {v0, v7, v12, v14}, Lg0/K;->b(Landroid/view/View;IZ)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    const/4 v14, 0x1

    .line 240
    invoke-virtual {v0, v7, v8, v14}, Lg0/K;->b(Landroid/view/View;IZ)V

    .line 241
    .line 242
    .line 243
    :goto_8
    iget-object v12, v0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 244
    .line 245
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 246
    .line 247
    if-nez v12, :cond_f

    .line 248
    .line 249
    invoke-virtual {v14, v8, v8, v8, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_f
    invoke-virtual {v12, v7}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroid/graphics/Rect;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-virtual {v14, v12}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 258
    .line 259
    .line 260
    :goto_9
    invoke-virtual {v0, v7, v5, v8}, Landroidx/recyclerview/widget/GridLayoutManager;->r1(Landroid/view/View;IZ)V

    .line 261
    .line 262
    .line 263
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 264
    .line 265
    invoke-virtual {v8, v7}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-le v8, v6, :cond_10

    .line 270
    .line 271
    move v6, v8

    .line 272
    :cond_10
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Lg0/q;

    .line 277
    .line 278
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 279
    .line 280
    invoke-virtual {v12, v7}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    int-to-float v7, v7

    .line 285
    const/high16 v12, 0x3f800000    # 1.0f

    .line 286
    .line 287
    mul-float v7, v7, v12

    .line 288
    .line 289
    iget v8, v8, Lg0/q;->f:I

    .line 290
    .line 291
    int-to-float v8, v8

    .line 292
    div-float/2addr v7, v8

    .line 293
    cmpl-float v8, v7, v1

    .line 294
    .line 295
    if-lez v8, :cond_11

    .line 296
    .line 297
    move v1, v7

    .line 298
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_12
    if-eqz v9, :cond_14

    .line 302
    .line 303
    iget v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 304
    .line 305
    int-to-float v2, v2

    .line 306
    mul-float v1, v1, v2

    .line 307
    .line 308
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(I)V

    .line 317
    .line 318
    .line 319
    const/4 v6, 0x0

    .line 320
    const/4 v8, 0x0

    .line 321
    :goto_a
    if-ge v8, v13, :cond_14

    .line 322
    .line 323
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 324
    .line 325
    aget-object v1, v1, v8

    .line 326
    .line 327
    const/high16 v2, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/4 v14, 0x1

    .line 330
    invoke-virtual {v0, v1, v2, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->r1(Landroid/view/View;IZ)V

    .line 331
    .line 332
    .line 333
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 334
    .line 335
    invoke-virtual {v2, v1}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-le v1, v6, :cond_13

    .line 340
    .line 341
    move v6, v1

    .line 342
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_14
    const/4 v8, 0x0

    .line 346
    :goto_b
    if-ge v8, v13, :cond_18

    .line 347
    .line 348
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 349
    .line 350
    aget-object v1, v1, v8

    .line 351
    .line 352
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 353
    .line 354
    invoke-virtual {v2, v1}, Landroidx/emoji2/text/g;->c(Landroid/view/View;)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eq v2, v6, :cond_16

    .line 359
    .line 360
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Lg0/q;

    .line 365
    .line 366
    iget-object v5, v2, Lg0/L;->b:Landroid/graphics/Rect;

    .line 367
    .line 368
    iget v7, v5, Landroid/graphics/Rect;->top:I

    .line 369
    .line 370
    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    .line 371
    .line 372
    add-int/2addr v7, v9

    .line 373
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 374
    .line 375
    add-int/2addr v7, v9

    .line 376
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 377
    .line 378
    add-int/2addr v7, v9

    .line 379
    iget v9, v5, Landroid/graphics/Rect;->left:I

    .line 380
    .line 381
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 382
    .line 383
    add-int/2addr v9, v5

    .line 384
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 385
    .line 386
    add-int/2addr v9, v5

    .line 387
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 388
    .line 389
    add-int/2addr v9, v5

    .line 390
    iget v5, v2, Lg0/q;->e:I

    .line 391
    .line 392
    iget v10, v2, Lg0/q;->f:I

    .line 393
    .line 394
    invoke-virtual {v0, v5, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->n1(II)I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 399
    .line 400
    const/4 v14, 0x1

    .line 401
    if-ne v10, v14, :cond_15

    .line 402
    .line 403
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 404
    .line 405
    const/4 v10, 0x0

    .line 406
    const/high16 v11, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-static {v10, v5, v11, v9, v2}, Lg0/K;->w(ZIIII)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    sub-int v5, v6, v7

    .line 413
    .line 414
    invoke-static {v5, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    goto :goto_c

    .line 419
    :cond_15
    const/4 v10, 0x0

    .line 420
    const/high16 v11, 0x40000000    # 2.0f

    .line 421
    .line 422
    sub-int v9, v6, v9

    .line 423
    .line 424
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 429
    .line 430
    invoke-static {v10, v5, v11, v7, v2}, Lg0/K;->w(ZIIII)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    move v2, v9

    .line 435
    :goto_c
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    check-cast v7, Lg0/L;

    .line 440
    .line 441
    invoke-virtual {v0, v1, v2, v5, v7}, Lg0/K;->z0(Landroid/view/View;IILg0/L;)Z

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    if-eqz v7, :cond_17

    .line 446
    .line 447
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->measure(II)V

    .line 448
    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_16
    const/4 v10, 0x0

    .line 452
    const/high16 v11, 0x40000000    # 2.0f

    .line 453
    .line 454
    :cond_17
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 455
    .line 456
    goto :goto_b

    .line 457
    :cond_18
    const/4 v10, 0x0

    .line 458
    iput v6, v4, Lg0/t;->a:I

    .line 459
    .line 460
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 461
    .line 462
    const/4 v14, 0x1

    .line 463
    if-ne v1, v14, :cond_1a

    .line 464
    .line 465
    iget v1, v3, Lg0/u;->f:I

    .line 466
    .line 467
    const/4 v12, -0x1

    .line 468
    if-ne v1, v12, :cond_19

    .line 469
    .line 470
    iget v8, v3, Lg0/u;->b:I

    .line 471
    .line 472
    sub-int v1, v8, v6

    .line 473
    .line 474
    move v3, v1

    .line 475
    const/4 v1, 0x0

    .line 476
    const/4 v2, 0x0

    .line 477
    goto :goto_f

    .line 478
    :cond_19
    iget v8, v3, Lg0/u;->b:I

    .line 479
    .line 480
    add-int v1, v8, v6

    .line 481
    .line 482
    move v3, v8

    .line 483
    const/4 v2, 0x0

    .line 484
    move v8, v1

    .line 485
    const/4 v1, 0x0

    .line 486
    goto :goto_f

    .line 487
    :cond_1a
    const/4 v12, -0x1

    .line 488
    iget v1, v3, Lg0/u;->f:I

    .line 489
    .line 490
    if-ne v1, v12, :cond_1b

    .line 491
    .line 492
    iget v8, v3, Lg0/u;->b:I

    .line 493
    .line 494
    sub-int v1, v8, v6

    .line 495
    .line 496
    move v2, v8

    .line 497
    :goto_e
    const/4 v3, 0x0

    .line 498
    const/4 v8, 0x0

    .line 499
    goto :goto_f

    .line 500
    :cond_1b
    iget v8, v3, Lg0/u;->b:I

    .line 501
    .line 502
    add-int v1, v8, v6

    .line 503
    .line 504
    move v2, v1

    .line 505
    move v1, v8

    .line 506
    goto :goto_e

    .line 507
    :goto_f
    const/4 v7, 0x0

    .line 508
    :goto_10
    if-ge v7, v13, :cond_20

    .line 509
    .line 510
    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 511
    .line 512
    aget-object v5, v5, v7

    .line 513
    .line 514
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    check-cast v6, Lg0/q;

    .line 519
    .line 520
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 521
    .line 522
    const/4 v14, 0x1

    .line 523
    if-ne v9, v14, :cond_1d

    .line 524
    .line 525
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_1c

    .line 530
    .line 531
    invoke-virtual {v0}, Lg0/K;->D()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 536
    .line 537
    iget v9, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 538
    .line 539
    iget v10, v6, Lg0/q;->e:I

    .line 540
    .line 541
    sub-int/2addr v9, v10

    .line 542
    aget v2, v2, v9

    .line 543
    .line 544
    add-int/2addr v1, v2

    .line 545
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 546
    .line 547
    invoke-virtual {v2, v5}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    sub-int v2, v1, v2

    .line 552
    .line 553
    move/from16 v17, v2

    .line 554
    .line 555
    move v2, v1

    .line 556
    move/from16 v1, v17

    .line 557
    .line 558
    goto :goto_11

    .line 559
    :cond_1c
    invoke-virtual {v0}, Lg0/K;->D()I

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 564
    .line 565
    iget v9, v6, Lg0/q;->e:I

    .line 566
    .line 567
    aget v2, v2, v9

    .line 568
    .line 569
    add-int/2addr v1, v2

    .line 570
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 571
    .line 572
    invoke-virtual {v2, v5}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    add-int/2addr v2, v1

    .line 577
    goto :goto_11

    .line 578
    :cond_1d
    invoke-virtual {v0}, Lg0/K;->F()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 583
    .line 584
    iget v9, v6, Lg0/q;->e:I

    .line 585
    .line 586
    aget v8, v8, v9

    .line 587
    .line 588
    add-int/2addr v3, v8

    .line 589
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 590
    .line 591
    invoke-virtual {v8, v5}, Landroidx/emoji2/text/g;->d(Landroid/view/View;)I

    .line 592
    .line 593
    .line 594
    move-result v8

    .line 595
    add-int/2addr v8, v3

    .line 596
    :goto_11
    invoke-static {v5, v1, v3, v2, v8}, Lg0/K;->N(Landroid/view/View;IIII)V

    .line 597
    .line 598
    .line 599
    iget-object v9, v6, Lg0/L;->a:Lg0/b0;

    .line 600
    .line 601
    invoke-virtual {v9}, Lg0/b0;->h()Z

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    if-nez v9, :cond_1e

    .line 606
    .line 607
    iget-object v6, v6, Lg0/L;->a:Lg0/b0;

    .line 608
    .line 609
    invoke-virtual {v6}, Lg0/b0;->k()Z

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    if-eqz v6, :cond_1f

    .line 614
    .line 615
    :cond_1e
    const/4 v14, 0x1

    .line 616
    goto :goto_12

    .line 617
    :cond_1f
    const/4 v14, 0x1

    .line 618
    goto :goto_13

    .line 619
    :goto_12
    iput-boolean v14, v4, Lg0/t;->c:Z

    .line 620
    .line 621
    :goto_13
    iget-boolean v6, v4, Lg0/t;->d:Z

    .line 622
    .line 623
    invoke-virtual {v5}, Landroid/view/View;->hasFocusable()Z

    .line 624
    .line 625
    .line 626
    move-result v5

    .line 627
    or-int/2addr v5, v6

    .line 628
    iput-boolean v5, v4, Lg0/t;->d:Z

    .line 629
    .line 630
    add-int/lit8 v7, v7, 0x1

    .line 631
    .line 632
    goto :goto_10

    .line 633
    :cond_20
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 634
    .line 635
    const/4 v2, 0x0

    .line 636
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-void
.end method

.method public final X(Lg0/Q;Lg0/X;Landroid/view/View;LO/k;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lg0/q;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p3, p4}, Lg0/K;->W(Landroid/view/View;LO/k;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    check-cast v0, Lg0/q;

    .line 14
    .line 15
    iget-object p3, v0, Lg0/L;->a:Lg0/b0;

    .line 16
    .line 17
    invoke-virtual {p3}, Lg0/b0;->b()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p0, p3, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    const/4 v1, 0x0

    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    iget p2, v0, Lg0/q;->e:I

    .line 32
    .line 33
    iget v0, v0, Lg0/q;->f:I

    .line 34
    .line 35
    invoke-static {v1, p2, v0, p1, p3}, LO/j;->a(ZIIII)LO/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p4, p1}, LO/k;->j(LO/j;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget p2, v0, Lg0/q;->e:I

    .line 44
    .line 45
    iget v0, v0, Lg0/q;->f:I

    .line 46
    .line 47
    invoke-static {v1, p1, p3, p2, v0}, LO/j;->a(ZIIII)LO/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p4, p1}, LO/k;->j(LO/j;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final X0(Lg0/Q;Lg0/X;Lg0/s;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->t1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p2, Lg0/X;->g:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p4, v0, :cond_0

    .line 16
    .line 17
    const/4 p4, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p4, 0x0

    .line 20
    :goto_0
    iget v1, p3, Lg0/s;->b:I

    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    :goto_1
    if-lez v1, :cond_3

    .line 29
    .line 30
    iget p4, p3, Lg0/s;->b:I

    .line 31
    .line 32
    if-lez p4, :cond_3

    .line 33
    .line 34
    add-int/lit8 p4, p4, -0x1

    .line 35
    .line 36
    iput p4, p3, Lg0/s;->b:I

    .line 37
    .line 38
    invoke-virtual {p0, p4, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    sub-int/2addr p4, v0

    .line 48
    iget v0, p3, Lg0/s;->b:I

    .line 49
    .line 50
    :goto_2
    if-ge v0, p4, :cond_2

    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {p0, v2, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-le v3, v1, :cond_2

    .line 59
    .line 60
    move v0, v2

    .line 61
    move v1, v3

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iput v0, p3, Lg0/s;->b:I

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->i1()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final Y(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/n;->z()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LC0/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LC0/n;->z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LC0/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final a0(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/n;->z()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LC0/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b0(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/n;->z()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LC0/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c0(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/n;->z()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LC0/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d0(Lg0/Q;Lg0/X;)V
    .locals 7

    .line 1
    iget-boolean v0, p2, Lg0/X;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lg0/K;->v()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Lg0/K;->u(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lg0/q;

    .line 25
    .line 26
    iget-object v5, v4, Lg0/L;->a:Lg0/b0;

    .line 27
    .line 28
    invoke-virtual {v5}, Lg0/b0;->b()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget v6, v4, Lg0/q;->f:I

    .line 33
    .line 34
    invoke-virtual {v2, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 35
    .line 36
    .line 37
    iget v4, v4, Lg0/q;->e:I

    .line 38
    .line 39
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->d0(Lg0/Q;Lg0/X;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final d1(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public final e0(Lg0/X;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e0(Lg0/X;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 6
    .line 7
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/high16 v1, 0x4000000

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 21
    .line 22
    .line 23
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:I

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final f(Lg0/L;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lg0/q;

    .line 2
    .line 3
    return p1
.end method

.method public final h1(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v3, v0

    .line 9
    add-int/lit8 v4, v1, 0x1

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    array-length v3, v0

    .line 14
    sub-int/2addr v3, v2

    .line 15
    aget v3, v0, v3

    .line 16
    .line 17
    if-eq v3, p1, :cond_1

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 20
    .line 21
    new-array v0, v0, [I

    .line 22
    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    aput v3, v0, v3

    .line 25
    .line 26
    div-int v4, p1, v1

    .line 27
    .line 28
    rem-int/2addr p1, v1

    .line 29
    const/4 v5, 0x0

    .line 30
    :goto_0
    if-gt v2, v1, :cond_3

    .line 31
    .line 32
    add-int/2addr v3, p1

    .line 33
    if-lez v3, :cond_2

    .line 34
    .line 35
    sub-int v6, v1, v3

    .line 36
    .line 37
    if-ge v6, p1, :cond_2

    .line 38
    .line 39
    add-int/lit8 v6, v4, 0x1

    .line 40
    .line 41
    sub-int/2addr v3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v6, v4

    .line 44
    :goto_1
    add-int/2addr v5, v6

    .line 45
    aput v5, v0, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 51
    .line 52
    return-void
.end method

.method public final i0(ILandroid/os/Bundle;)Z
    .locals 11

    .line 1
    sget-object v0, LO/f;->o:LO/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LO/f;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, -0x1

    .line 10
    if-ne p1, v0, :cond_32

    .line 11
    .line 12
    if-eq p1, v3, :cond_32

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0}, Lg0/K;->v()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lg0/K;->u(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lg0/K;->u(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_1
    if-nez p1, :cond_2

    .line 44
    .line 45
    goto/16 :goto_12

    .line 46
    .line 47
    :cond_2
    if-nez p2, :cond_3

    .line 48
    .line 49
    goto/16 :goto_12

    .line 50
    .line 51
    :cond_3
    const-string v0, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    .line 52
    .line 53
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v4, Landroidx/recyclerview/widget/GridLayoutManager;->P:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto/16 :goto_12

    .line 70
    .line 71
    :cond_4
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lg0/b0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_5

    .line 78
    .line 79
    goto/16 :goto_12

    .line 80
    .line 81
    :cond_5
    iget-object v0, p1, Lg0/b0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    if-nez v0, :cond_6

    .line 84
    .line 85
    const/4 p1, -0x1

    .line 86
    goto :goto_2

    .line 87
    :cond_6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->J(Lg0/b0;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    :goto_2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-ltz v0, :cond_38

    .line 100
    .line 101
    if-gez v4, :cond_7

    .line 102
    .line 103
    goto/16 :goto_12

    .line 104
    .line 105
    :cond_7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 110
    .line 111
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_8

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {p0, v5, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m1(II)Ljava/util/HashSet;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 130
    .line 131
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_9

    .line 140
    .line 141
    :cond_8
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 142
    .line 143
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 144
    .line 145
    :cond_9
    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 146
    .line 147
    if-ne v5, v3, :cond_a

    .line 148
    .line 149
    move v5, v0

    .line 150
    :cond_a
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 151
    .line 152
    if-ne v6, v3, :cond_b

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    move v4, v6

    .line 156
    :goto_3
    const/16 v6, 0x42

    .line 157
    .line 158
    const/16 v7, 0x11

    .line 159
    .line 160
    if-eq p2, v7, :cond_1c

    .line 161
    .line 162
    const/16 v8, 0x21

    .line 163
    .line 164
    if-eq p2, v8, :cond_18

    .line 165
    .line 166
    if-eq p2, v6, :cond_12

    .line 167
    .line 168
    const/16 v8, 0x82

    .line 169
    .line 170
    if-eq p2, v8, :cond_c

    .line 171
    .line 172
    goto/16 :goto_12

    .line 173
    .line 174
    :cond_c
    add-int/2addr p1, v2

    .line 175
    :goto_4
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    if-ge p1, v8, :cond_11

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    if-ltz v8, :cond_11

    .line 190
    .line 191
    if-gez v9, :cond_d

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_d
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 195
    .line 196
    if-ne v10, v2, :cond_f

    .line 197
    .line 198
    if-le v8, v5, :cond_10

    .line 199
    .line 200
    if-eq v9, v4, :cond_e

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m1(II)Ljava/util/HashSet;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-eqz v9, :cond_10

    .line 219
    .line 220
    :cond_e
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 221
    .line 222
    goto/16 :goto_9

    .line 223
    .line 224
    :cond_f
    if-le v8, v5, :cond_10

    .line 225
    .line 226
    if-ne v9, v4, :cond_10

    .line 227
    .line 228
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 233
    .line 234
    goto/16 :goto_9

    .line 235
    .line 236
    :cond_10
    add-int/lit8 p1, p1, 0x1

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_11
    :goto_5
    const/4 p1, -0x1

    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_12
    add-int/2addr p1, v2

    .line 243
    :goto_6
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-ge p1, v8, :cond_11

    .line 248
    .line 249
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-ltz v8, :cond_11

    .line 258
    .line 259
    if-gez v9, :cond_13

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_13
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 263
    .line 264
    if-ne v10, v2, :cond_16

    .line 265
    .line 266
    if-ne v8, v5, :cond_14

    .line 267
    .line 268
    if-gt v9, v4, :cond_15

    .line 269
    .line 270
    :cond_14
    if-le v8, v5, :cond_17

    .line 271
    .line 272
    :cond_15
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 273
    .line 274
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_16
    if-le v9, v4, :cond_17

    .line 279
    .line 280
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-eqz v8, :cond_17

    .line 293
    .line 294
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 295
    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_17
    add-int/lit8 p1, p1, 0x1

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_18
    sub-int/2addr p1, v2

    .line 302
    :goto_7
    if-ltz p1, :cond_11

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-ltz v8, :cond_11

    .line 313
    .line 314
    if-gez v9, :cond_19

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_19
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 318
    .line 319
    if-ne v10, v2, :cond_1a

    .line 320
    .line 321
    if-ge v8, v5, :cond_1b

    .line 322
    .line 323
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 324
    .line 325
    .line 326
    move-result v9

    .line 327
    invoke-virtual {p0, v9, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m1(II)Ljava/util/HashSet;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    if-eqz v9, :cond_1b

    .line 340
    .line 341
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_1a
    if-ge v8, v5, :cond_1b

    .line 345
    .line 346
    if-ne v9, v4, :cond_1b

    .line 347
    .line 348
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    check-cast v4, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_1b
    add-int/lit8 p1, p1, -0x1

    .line 366
    .line 367
    goto :goto_7

    .line 368
    :cond_1c
    sub-int/2addr p1, v2

    .line 369
    :goto_8
    if-ltz p1, :cond_11

    .line 370
    .line 371
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    if-ltz v8, :cond_11

    .line 380
    .line 381
    if-gez v9, :cond_1d

    .line 382
    .line 383
    goto/16 :goto_5

    .line 384
    .line 385
    :cond_1d
    iget v10, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 386
    .line 387
    if-ne v10, v2, :cond_20

    .line 388
    .line 389
    if-ne v8, v5, :cond_1e

    .line 390
    .line 391
    if-lt v9, v4, :cond_1f

    .line 392
    .line 393
    :cond_1e
    if-ge v8, v5, :cond_21

    .line 394
    .line 395
    :cond_1f
    iput v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 396
    .line 397
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 398
    .line 399
    goto :goto_9

    .line 400
    :cond_20
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    if-eqz v8, :cond_21

    .line 413
    .line 414
    if-ge v9, v4, :cond_21

    .line 415
    .line 416
    iput v9, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_21
    add-int/lit8 p1, p1, -0x1

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :goto_9
    if-ne p1, v3, :cond_31

    .line 423
    .line 424
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 425
    .line 426
    if-nez v4, :cond_31

    .line 427
    .line 428
    if-ne p2, v7, :cond_29

    .line 429
    .line 430
    if-gez v0, :cond_23

    .line 431
    .line 432
    :cond_22
    :goto_a
    const/4 p1, -0x1

    .line 433
    goto/16 :goto_f

    .line 434
    .line 435
    :cond_23
    if-ne v4, v2, :cond_24

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_24
    new-instance p1, Ljava/util/TreeMap;

    .line 439
    .line 440
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    .line 441
    .line 442
    .line 443
    move-result-object p2

    .line 444
    invoke-direct {p1, p2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 445
    .line 446
    .line 447
    const/4 p2, 0x0

    .line 448
    :goto_b
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    if-ge p2, v4, :cond_27

    .line 453
    .line 454
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    if-eqz v5, :cond_26

    .line 467
    .line 468
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    check-cast v5, Ljava/lang/Integer;

    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    if-gez v6, :cond_25

    .line 479
    .line 480
    goto :goto_a

    .line 481
    :cond_25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v6

    .line 485
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    goto :goto_c

    .line 489
    :cond_26
    add-int/lit8 p2, p2, 0x1

    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_27
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object p2

    .line 500
    :cond_28
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-eqz v4, :cond_22

    .line 505
    .line 506
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    check-cast v4, Ljava/lang/Integer;

    .line 511
    .line 512
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-ge v5, v0, :cond_28

    .line 517
    .line 518
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    check-cast p1, Ljava/lang/Integer;

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 529
    .line 530
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(I)I

    .line 531
    .line 532
    .line 533
    move-result p2

    .line 534
    iput p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 535
    .line 536
    goto :goto_f

    .line 537
    :cond_29
    if-ne p2, v6, :cond_31

    .line 538
    .line 539
    if-gez v0, :cond_2a

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_2a
    if-ne v4, v2, :cond_2b

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_2b
    new-instance p1, Ljava/util/TreeMap;

    .line 546
    .line 547
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 548
    .line 549
    .line 550
    const/4 p2, 0x0

    .line 551
    :goto_d
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-ge p2, v4, :cond_2f

    .line 556
    .line 557
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->l1(I)Ljava/util/HashSet;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    :cond_2c
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    if-eqz v5, :cond_2e

    .line 570
    .line 571
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, Ljava/lang/Integer;

    .line 576
    .line 577
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 578
    .line 579
    .line 580
    move-result v6

    .line 581
    if-gez v6, :cond_2d

    .line 582
    .line 583
    goto/16 :goto_a

    .line 584
    .line 585
    :cond_2d
    invoke-virtual {p1, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    if-nez v6, :cond_2c

    .line 590
    .line 591
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_2e
    add-int/lit8 p2, p2, 0x1

    .line 600
    .line 601
    goto :goto_d

    .line 602
    :cond_2f
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 603
    .line 604
    .line 605
    move-result-object p2

    .line 606
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 607
    .line 608
    .line 609
    move-result-object p2

    .line 610
    :cond_30
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    if-eqz v4, :cond_22

    .line 615
    .line 616
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    check-cast v4, Ljava/lang/Integer;

    .line 621
    .line 622
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    if-le v5, v0, :cond_30

    .line 627
    .line 628
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    check-cast p1, Ljava/lang/Integer;

    .line 633
    .line 634
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 635
    .line 636
    .line 637
    move-result p1

    .line 638
    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:I

    .line 639
    .line 640
    iput v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:I

    .line 641
    .line 642
    :cond_31
    :goto_f
    if-eq p1, v3, :cond_38

    .line 643
    .line 644
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->q0(I)V

    .line 645
    .line 646
    .line 647
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:I

    .line 648
    .line 649
    return v2

    .line 650
    :cond_32
    const v0, 0x1020037

    .line 651
    .line 652
    .line 653
    if-ne p1, v0, :cond_39

    .line 654
    .line 655
    if-eqz p2, :cond_39

    .line 656
    .line 657
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 658
    .line 659
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 660
    .line 661
    .line 662
    move-result p1

    .line 663
    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 664
    .line 665
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 666
    .line 667
    .line 668
    move-result p2

    .line 669
    if-eq p1, v3, :cond_38

    .line 670
    .line 671
    if-ne p2, v3, :cond_33

    .line 672
    .line 673
    goto :goto_12

    .line 674
    :cond_33
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 675
    .line 676
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 677
    .line 678
    invoke-virtual {v0}, Lg0/B;->a()I

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    const/4 v4, 0x0

    .line 683
    :goto_10
    if-ge v4, v0, :cond_36

    .line 684
    .line 685
    iget-object v5, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 686
    .line 687
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 688
    .line 689
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 690
    .line 691
    invoke-virtual {p0, v4, v6, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    iget-object v6, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 696
    .line 697
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 698
    .line 699
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 700
    .line 701
    invoke-virtual {p0, v4, v7, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 702
    .line 703
    .line 704
    move-result v6

    .line 705
    iget v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 706
    .line 707
    if-ne v7, v2, :cond_34

    .line 708
    .line 709
    if-ne v5, p2, :cond_35

    .line 710
    .line 711
    if-ne v6, p1, :cond_35

    .line 712
    .line 713
    goto :goto_11

    .line 714
    :cond_34
    if-ne v5, p1, :cond_35

    .line 715
    .line 716
    if-ne v6, p2, :cond_35

    .line 717
    .line 718
    goto :goto_11

    .line 719
    :cond_35
    add-int/lit8 v4, v4, 0x1

    .line 720
    .line 721
    goto :goto_10

    .line 722
    :cond_36
    const/4 v4, -0x1

    .line 723
    :goto_11
    if-le v4, v3, :cond_38

    .line 724
    .line 725
    iput v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 726
    .line 727
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 728
    .line 729
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lg0/v;

    .line 730
    .line 731
    if-eqz p1, :cond_37

    .line 732
    .line 733
    iput v3, p1, Lg0/v;->a:I

    .line 734
    .line 735
    :cond_37
    invoke-virtual {p0}, Lg0/K;->o0()V

    .line 736
    .line 737
    .line 738
    return v2

    .line 739
    :cond_38
    :goto_12
    return v1

    .line 740
    :cond_39
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->i0(ILandroid/os/Bundle;)Z

    .line 741
    .line 742
    .line 743
    move-result p1

    .line 744
    return p1
.end method

.method public final i1()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 13
    .line 14
    new-array v0, v0, [Landroid/view/View;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 17
    .line 18
    return-void
.end method

.method public final j1(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 21
    .line 22
    invoke-virtual {p0, p1, v1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final k(Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(Lg0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final k1(I)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->p1(ILg0/Q;Lg0/X;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public final l(Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lg0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final l1(I)Ljava/util/HashSet;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m1(II)Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final m1(II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 11
    .line 12
    invoke-virtual {p0, p2, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->q1(ILg0/Q;Lg0/X;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    move v1, p1

    .line 17
    :goto_0
    add-int v2, p1, p2

    .line 18
    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public final n(Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(Lg0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final n1(II)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 13
    .line 14
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 15
    .line 16
    sub-int v2, v1, p1

    .line 17
    .line 18
    aget v2, v0, v2

    .line 19
    .line 20
    sub-int/2addr v1, p1

    .line 21
    sub-int/2addr v1, p2

    .line 22
    aget p1, v0, v1

    .line 23
    .line 24
    sub-int/2addr v2, p1

    .line 25
    return v2

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 27
    .line 28
    add-int/2addr p2, p1

    .line 29
    aget p2, v0, p2

    .line 30
    .line 31
    aget p1, v0, p1

    .line 32
    .line 33
    sub-int/2addr p2, p1

    .line 34
    return p2
.end method

.method public final o(Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Lg0/X;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final o1(ILg0/Q;Lg0/X;)I
    .locals 1

    .line 1
    iget-boolean p3, p3, Lg0/X;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, LC0/n;->y(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-virtual {p2, p1}, Lg0/Q;->b(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 p3, -0x1

    .line 22
    if-ne p2, p3, :cond_1

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p3, "Cannot find span size for pre layout position. "

    .line 27
    .line 28
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "GridLayoutManager"

    .line 39
    .line 40
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return p1

    .line 45
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p2, p1}, LC0/n;->y(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1
.end method

.method public final p0(ILg0/Q;Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->t1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->i1()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->p0(ILg0/Q;Lg0/X;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final p1(ILg0/Q;Lg0/X;)I
    .locals 2

    .line 1
    iget-boolean p3, p3, Lg0/X;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    rem-int/2addr p1, p2

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p3, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eq p3, v1, :cond_1

    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    invoke-virtual {p2, p1}, Lg0/Q;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ne p2, v1, :cond_2

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "GridLayoutManager"

    .line 45
    .line 46
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    return p1

    .line 51
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    rem-int/2addr p2, p1

    .line 57
    return p2
.end method

.method public final q1(ILg0/Q;Lg0/X;)I
    .locals 3

    .line 1
    iget-boolean p3, p3, Lg0/X;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-virtual {p3, p1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eq p3, v2, :cond_1

    .line 20
    .line 21
    return p3

    .line 22
    :cond_1
    invoke-virtual {p2, p1}, Lg0/Q;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ne p2, v2, :cond_2

    .line 27
    .line 28
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 31
    .line 32
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "GridLayoutManager"

    .line 43
    .line 44
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return v1
.end method

.method public final r()Lg0/L;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lg0/q;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lg0/q;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Lg0/q;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lg0/q;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final r0(ILg0/Q;Lg0/X;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->t1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->i1()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->r0(ILg0/Q;Lg0/X;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final r1(Landroid/view/View;IZ)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg0/q;

    .line 6
    .line 7
    iget-object v1, v0, Lg0/L;->b:Landroid/graphics/Rect;

    .line 8
    .line 9
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 10
    .line 11
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    add-int/2addr v2, v3

    .line 14
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 18
    .line 19
    add-int/2addr v2, v3

    .line 20
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    add-int/2addr v3, v1

    .line 25
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 26
    .line 27
    add-int/2addr v3, v1

    .line 28
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 29
    .line 30
    add-int/2addr v3, v1

    .line 31
    iget v1, v0, Lg0/q;->e:I

    .line 32
    .line 33
    iget v4, v0, Lg0/q;->f:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->n1(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-ne v4, v6, :cond_0

    .line 44
    .line 45
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 46
    .line 47
    invoke-static {v5, v1, p2, v3, v4}, Lg0/K;->w(ZIIII)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->l()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, Lg0/K;->m:I

    .line 58
    .line 59
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 60
    .line 61
    invoke-static {v6, v1, v3, v2, v0}, Lg0/K;->w(ZIIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 67
    .line 68
    invoke-static {v5, v1, p2, v2, v4}, Lg0/K;->w(ZIIII)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Landroidx/emoji2/text/g;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroidx/emoji2/text/g;->l()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p0, Lg0/K;->l:I

    .line 79
    .line 80
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 81
    .line 82
    invoke-static {v6, v1, v2, v3, v0}, Lg0/K;->w(ZIIII)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move v7, v0

    .line 87
    move v0, p2

    .line 88
    move p2, v7

    .line 89
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lg0/L;

    .line 94
    .line 95
    if-eqz p3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, v0, v1}, Lg0/K;->z0(Landroid/view/View;IILg0/L;)Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Lg0/K;->x0(Landroid/view/View;IILg0/L;)Z

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    :goto_1
    if-eqz p3, :cond_2

    .line 107
    .line 108
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method

.method public final s(Landroid/content/Context;Landroid/util/AttributeSet;)Lg0/L;
    .locals 1

    .line 1
    new-instance v0, Lg0/q;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lg0/L;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, v0, Lg0/q;->e:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, v0, Lg0/q;->f:I

    .line 11
    .line 12
    return-object v0
.end method

.method public final s1(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 8
    .line 9
    if-lt p1, v0, :cond_1

    .line 10
    .line 11
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:LC0/n;

    .line 14
    .line 15
    invoke-virtual {p1}, LC0/n;->z()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lg0/K;->o0()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "Span count should be at least 1. Provided "

    .line 25
    .line 26
    invoke-static {v1, p1}, Landroidx/fragment/app/T;->e(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final t(Landroid/view/ViewGroup$LayoutParams;)Lg0/L;
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lg0/q;

    .line 8
    .line 9
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lg0/L;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 12
    .line 13
    .line 14
    iput v2, v0, Lg0/q;->e:I

    .line 15
    .line 16
    iput v1, v0, Lg0/q;->f:I

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Lg0/q;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lg0/L;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    iput v2, v0, Lg0/q;->e:I

    .line 25
    .line 26
    iput v1, v0, Lg0/q;->f:I

    .line 27
    .line 28
    return-object v0
.end method

.method public final t1()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lg0/K;->n:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lg0/K;->E()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-virtual {p0}, Lg0/K;->D()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :goto_0
    sub-int/2addr v0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget v0, p0, Lg0/K;->o:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lg0/K;->C()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr v0, v1

    .line 26
    invoke-virtual {p0}, Lg0/K;->F()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final u0(Landroid/graphics/Rect;II)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3}, Lg0/K;->u0(Landroid/graphics/Rect;II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lg0/K;->D()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lg0/K;->E()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Lg0/K;->F()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lg0/K;->C()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v0

    .line 26
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    add-int/2addr p1, v2

    .line 36
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    sget-object v2, LN/S;->a:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p3, p1, v0}, Lg0/K;->g(III)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 49
    .line 50
    array-length v0, p3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    aget p3, p3, v0

    .line 53
    .line 54
    add-int/2addr p3, v1

    .line 55
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p2, p3, v0}, Lg0/K;->g(III)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/2addr p1, v1

    .line 71
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    sget-object v1, LN/S;->a:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p2, p1, v0}, Lg0/K;->g(III)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 84
    .line 85
    array-length v0, p1

    .line 86
    sub-int/2addr v0, v3

    .line 87
    aget p1, p1, v0

    .line 88
    .line 89
    add-int/2addr p1, v2

    .line 90
    iget-object v0, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p3, p1, v0}, Lg0/K;->g(III)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_0
    iget-object p3, p0, Lg0/K;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final x(Lg0/Q;Lg0/X;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lg0/K;->B()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_1
    invoke-virtual {p2}, Lg0/X;->b()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->o1(ILg0/Q;Lg0/X;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/2addr p1, v1

    .line 35
    return p1
.end method

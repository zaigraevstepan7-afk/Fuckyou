.class public final Lk/g;
.super Lk/u;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Lk/d;

.field public final j:LM0/p;

.field public final k:LA/b;

.field public l:I

.field public m:I

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Lk/x;

.field public x:Landroid/view/ViewTreeObserver;

.field public y:Lk/v;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk/g;->g:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lk/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Lk/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lk/g;->i:Lk/d;

    .line 25
    .line 26
    new-instance v0, LM0/p;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1, p0}, LM0/p;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lk/g;->j:LM0/p;

    .line 33
    .line 34
    new-instance v0, LA/b;

    .line 35
    .line 36
    const/16 v1, 0x17

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lk/g;->k:LA/b;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lk/g;->l:I

    .line 45
    .line 46
    iput v0, p0, Lk/g;->m:I

    .line 47
    .line 48
    iput-object p1, p0, Lk/g;->b:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Lk/g;->n:Landroid/view/View;

    .line 51
    .line 52
    iput p3, p0, Lk/g;->d:I

    .line 53
    .line 54
    iput-boolean p4, p0, Lk/g;->e:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lk/g;->u:Z

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const/4 p3, 0x1

    .line 63
    if-ne p2, p3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x1

    .line 67
    :goto_0
    iput v0, p0, Lk/g;->p:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 78
    .line 79
    div-int/lit8 p2, p2, 0x2

    .line 80
    .line 81
    const p3, 0x7f060017

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Lk/g;->c:I

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lk/g;->f:Landroid/os/Handler;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lk/f;

    .line 15
    .line 16
    iget-object v0, v0, Lk/f;->a:Ll/P0;

    .line 17
    .line 18
    iget-object v0, v0, Ll/K0;->z:Ll/C;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final b(Lk/m;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lk/f;

    .line 16
    .line 17
    iget-object v4, v4, Lk/f;->b:Lk/m;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lk/f;

    .line 43
    .line 44
    iget-object v1, v1, Lk/f;->b:Lk/m;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lk/m;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lk/f;

    .line 54
    .line 55
    iget-object v3, v1, Lk/f;->b:Lk/m;

    .line 56
    .line 57
    invoke-virtual {v3, p0}, Lk/m;->r(Lk/y;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v3, p0, Lk/g;->z:Z

    .line 61
    .line 62
    iget-object v1, v1, Lk/f;->a:Ll/P0;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v5, 0x17

    .line 70
    .line 71
    if-lt v3, v5, :cond_4

    .line 72
    .line 73
    iget-object v3, v1, Ll/K0;->z:Ll/C;

    .line 74
    .line 75
    invoke-static {v3, v4}, Ll/M0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-object v3, v1, Ll/K0;->z:Ll/C;

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-virtual {v1}, Ll/K0;->dismiss()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const/4 v3, 0x1

    .line 91
    if-lez v1, :cond_6

    .line 92
    .line 93
    add-int/lit8 v5, v1, -0x1

    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Lk/f;

    .line 100
    .line 101
    iget v5, v5, Lk/f;->c:I

    .line 102
    .line 103
    iput v5, p0, Lk/g;->p:I

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    iget-object v5, p0, Lk/g;->n:Landroid/view/View;

    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-ne v5, v3, :cond_7

    .line 113
    .line 114
    const/4 v5, 0x0

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    const/4 v5, 0x1

    .line 117
    :goto_2
    iput v5, p0, Lk/g;->p:I

    .line 118
    .line 119
    :goto_3
    if-nez v1, :cond_b

    .line 120
    .line 121
    invoke-virtual {p0}, Lk/g;->dismiss()V

    .line 122
    .line 123
    .line 124
    iget-object p2, p0, Lk/g;->w:Lk/x;

    .line 125
    .line 126
    if-eqz p2, :cond_8

    .line 127
    .line 128
    invoke-interface {p2, p1, v3}, Lk/x;->b(Lk/m;Z)V

    .line 129
    .line 130
    .line 131
    :cond_8
    iget-object p1, p0, Lk/g;->x:Landroid/view/ViewTreeObserver;

    .line 132
    .line 133
    if-eqz p1, :cond_a

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_9

    .line 140
    .line 141
    iget-object p1, p0, Lk/g;->x:Landroid/view/ViewTreeObserver;

    .line 142
    .line 143
    iget-object p2, p0, Lk/g;->i:Lk/d;

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    iput-object v4, p0, Lk/g;->x:Landroid/view/ViewTreeObserver;

    .line 149
    .line 150
    :cond_a
    iget-object p1, p0, Lk/g;->o:Landroid/view/View;

    .line 151
    .line 152
    iget-object p2, p0, Lk/g;->j:LM0/p;

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lk/g;->y:Lk/v;

    .line 158
    .line 159
    invoke-virtual {p1}, Lk/v;->onDismiss()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_b
    if-eqz p2, :cond_c

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lk/f;

    .line 170
    .line 171
    iget-object p1, p1, Lk/f;->b:Lk/m;

    .line 172
    .line 173
    invoke-virtual {p1, v2}, Lk/m;->c(Z)V

    .line 174
    .line 175
    .line 176
    :cond_c
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk/f;

    .line 18
    .line 19
    iget-object v1, v1, Lk/f;->a:Ll/P0;

    .line 20
    .line 21
    iget-object v1, v1, Ll/K0;->c:Ll/x0;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lk/j;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    check-cast v1, Lk/j;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v1}, Lk/j;->notifyDataSetChanged()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Lk/f;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Lk/f;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Lk/f;->a:Ll/P0;

    .line 24
    .line 25
    iget-object v3, v3, Ll/K0;->z:Ll/C;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Lk/f;->a:Ll/P0;

    .line 34
    .line 35
    invoke-virtual {v2}, Ll/K0;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e()Ll/x0;
    .locals 2

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lk/f;

    .line 22
    .line 23
    iget-object v0, v0, Lk/f;->a:Ll/P0;

    .line 24
    .line 25
    iget-object v0, v0, Ll/K0;->c:Ll/x0;

    .line 26
    .line 27
    return-object v0
.end method

.method public final f(Lk/E;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lk/f;

    .line 19
    .line 20
    iget-object v3, v1, Lk/f;->b:Lk/m;

    .line 21
    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    iget-object p1, v1, Lk/f;->a:Ll/P0;

    .line 25
    .line 26
    iget-object p1, p1, Ll/K0;->c:Ll/x0;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, Lk/m;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lk/g;->l(Lk/m;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lk/g;->w:Lk/x;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lk/x;->h(Lk/m;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public final g(Lk/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/g;->w:Lk/x;

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk/g;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, p0, Lk/g;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lk/m;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lk/g;->v(Lk/m;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lk/g;->n:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Lk/g;->o:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lk/g;->x:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lk/g;->x:Landroid/view/ViewTreeObserver;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Lk/g;->i:Lk/d;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Lk/g;->o:Landroid/view/View;

    .line 60
    .line 61
    iget-object v1, p0, Lk/g;->j:LM0/p;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    :goto_2
    return-void
.end method

.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l(Lk/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Lk/m;->b(Lk/y;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk/g;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lk/g;->v(Lk/m;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lk/g;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g;->n:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lk/g;->n:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Lk/g;->l:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lk/g;->m:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk/g;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk/g;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lk/f;

    .line 16
    .line 17
    iget-object v5, v4, Lk/f;->a:Ll/P0;

    .line 18
    .line 19
    iget-object v5, v5, Ll/K0;->z:Ll/C;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Lk/f;->b:Lk/m;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lk/m;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lk/g;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 1

    .line 1
    iget v0, p0, Lk/g;->l:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lk/g;->l:I

    .line 6
    .line 7
    iget-object v0, p0, Lk/g;->n:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lk/g;->m:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk/g;->q:Z

    .line 3
    .line 4
    iput p1, p0, Lk/g;->s:I

    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Lk/v;

    .line 2
    .line 3
    iput-object p1, p0, Lk/g;->y:Lk/v;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk/g;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk/g;->r:Z

    .line 3
    .line 4
    iput p1, p0, Lk/g;->t:I

    .line 5
    .line 6
    return-void
.end method

.method public final v(Lk/m;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lk/g;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Lk/j;

    .line 12
    .line 13
    iget-boolean v6, v0, Lk/g;->e:Z

    .line 14
    .line 15
    const v7, 0x7f0c000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, v1, v4, v6, v7}, Lk/j;-><init>(Lk/m;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lk/g;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    iget-boolean v6, v0, Lk/g;->u:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v5, Lk/j;->c:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Lk/g;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, Lk/u;->u(Lk/m;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iput-boolean v6, v5, Lk/j;->c:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    iget v6, v0, Lk/g;->c:I

    .line 48
    .line 49
    invoke-static {v5, v3, v6}, Lk/u;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-instance v8, Ll/P0;

    .line 54
    .line 55
    iget v9, v0, Lk/g;->d:I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct {v8, v3, v10, v9}, Ll/K0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v8, Ll/K0;->z:Ll/C;

    .line 62
    .line 63
    iget-object v9, v0, Lk/g;->k:LA/b;

    .line 64
    .line 65
    iput-object v9, v8, Ll/P0;->D:LA/b;

    .line 66
    .line 67
    iput-object v0, v8, Ll/K0;->p:Landroid/widget/AdapterView$OnItemClickListener;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 70
    .line 71
    .line 72
    iget-object v9, v0, Lk/g;->n:Landroid/view/View;

    .line 73
    .line 74
    iput-object v9, v8, Ll/K0;->o:Landroid/view/View;

    .line 75
    .line 76
    iget v9, v0, Lk/g;->m:I

    .line 77
    .line 78
    iput v9, v8, Ll/K0;->l:I

    .line 79
    .line 80
    iput-boolean v7, v8, Ll/K0;->y:Z

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    invoke-virtual {v3, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v5}, Ll/K0;->n(Landroid/widget/ListAdapter;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Ll/K0;->q(I)V

    .line 93
    .line 94
    .line 95
    iget v5, v0, Lk/g;->m:I

    .line 96
    .line 97
    iput v5, v8, Ll/K0;->l:I

    .line 98
    .line 99
    iget-object v5, v0, Lk/g;->h:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-lez v11, :cond_b

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    sub-int/2addr v11, v7

    .line 112
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    check-cast v11, Lk/f;

    .line 117
    .line 118
    iget-object v12, v11, Lk/f;->b:Lk/m;

    .line 119
    .line 120
    iget-object v13, v12, Lk/m;->f:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    const/4 v14, 0x0

    .line 127
    :goto_1
    if-ge v14, v13, :cond_3

    .line 128
    .line 129
    invoke-virtual {v12, v14}, Lk/m;->getItem(I)Landroid/view/MenuItem;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-interface {v15}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-eqz v16, :cond_2

    .line 138
    .line 139
    invoke-interface {v15}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-ne v1, v9, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    add-int/2addr v14, v7

    .line 147
    const/4 v9, 0x2

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    move-object v15, v10

    .line 150
    :goto_2
    if-nez v15, :cond_4

    .line 151
    .line 152
    move-object v2, v10

    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const/16 v18, 0x1

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_4
    iget-object v9, v11, Lk/f;->a:Ll/P0;

    .line 159
    .line 160
    iget-object v9, v9, Ll/K0;->c:Ll/x0;

    .line 161
    .line 162
    invoke-virtual {v9}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 167
    .line 168
    if-eqz v13, :cond_5

    .line 169
    .line 170
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 171
    .line 172
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    check-cast v12, Lk/j;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_5
    check-cast v12, Lk/j;

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    :goto_3
    invoke-virtual {v12}, Lk/j;->getCount()I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    const/4 v10, 0x0

    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    :goto_4
    const/4 v2, -0x1

    .line 194
    const/16 v18, 0x1

    .line 195
    .line 196
    if-ge v10, v14, :cond_7

    .line 197
    .line 198
    invoke-virtual {v12, v10}, Lk/j;->b(I)Lk/o;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    if-ne v15, v7, :cond_6

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 206
    .line 207
    const/4 v7, 0x1

    .line 208
    goto :goto_4

    .line 209
    :cond_7
    const/4 v10, -0x1

    .line 210
    :goto_5
    if-ne v10, v2, :cond_9

    .line 211
    .line 212
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 213
    goto :goto_7

    .line 214
    :cond_9
    add-int/2addr v10, v13

    .line 215
    invoke-virtual {v9}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    sub-int/2addr v10, v2

    .line 220
    if-ltz v10, :cond_8

    .line 221
    .line 222
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-lt v10, v2, :cond_a

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_a
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    goto :goto_7

    .line 234
    :cond_b
    const/16 v17, 0x0

    .line 235
    .line 236
    const/16 v18, 0x1

    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    :goto_7
    if-eqz v2, :cond_18

    .line 241
    .line 242
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 243
    .line 244
    const/16 v9, 0x1c

    .line 245
    .line 246
    if-gt v7, v9, :cond_c

    .line 247
    .line 248
    sget-object v7, Ll/P0;->E:Ljava/lang/reflect/Method;

    .line 249
    .line 250
    if-eqz v7, :cond_d

    .line 251
    .line 252
    const/4 v9, 0x1

    .line 253
    :try_start_0
    new-array v10, v9, [Ljava/lang/Object;

    .line 254
    .line 255
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 256
    .line 257
    aput-object v9, v10, v17

    .line 258
    .line 259
    invoke-virtual {v7, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    .line 262
    goto :goto_8

    .line 263
    :catch_0
    const-string v7, "MenuPopupWindow"

    .line 264
    .line 265
    const-string v9, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 266
    .line 267
    invoke-static {v7, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_c
    const/4 v7, 0x0

    .line 272
    invoke-static {v3, v7}, Ll/N0;->a(Landroid/widget/PopupWindow;Z)V

    .line 273
    .line 274
    .line 275
    :cond_d
    :goto_8
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 276
    .line 277
    const/16 v9, 0x17

    .line 278
    .line 279
    if-lt v7, v9, :cond_e

    .line 280
    .line 281
    const/4 v9, 0x0

    .line 282
    invoke-static {v3, v9}, Ll/M0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 283
    .line 284
    .line 285
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    const/16 v18, 0x1

    .line 290
    .line 291
    add-int/lit8 v3, v3, -0x1

    .line 292
    .line 293
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, Lk/f;

    .line 298
    .line 299
    iget-object v3, v3, Lk/f;->a:Ll/P0;

    .line 300
    .line 301
    iget-object v3, v3, Ll/K0;->c:Ll/x0;

    .line 302
    .line 303
    const/4 v9, 0x2

    .line 304
    new-array v10, v9, [I

    .line 305
    .line 306
    invoke-virtual {v3, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 307
    .line 308
    .line 309
    new-instance v9, Landroid/graphics/Rect;

    .line 310
    .line 311
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 312
    .line 313
    .line 314
    iget-object v12, v0, Lk/g;->o:Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual {v12, v9}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 317
    .line 318
    .line 319
    iget v12, v0, Lk/g;->p:I

    .line 320
    .line 321
    const/4 v13, 0x1

    .line 322
    if-ne v12, v13, :cond_11

    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    aget v10, v10, v17

    .line 327
    .line 328
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    add-int/2addr v3, v10

    .line 333
    add-int/2addr v3, v6

    .line 334
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 335
    .line 336
    if-le v3, v9, :cond_10

    .line 337
    .line 338
    :cond_f
    const/4 v3, 0x0

    .line 339
    :goto_9
    const/4 v9, 0x1

    .line 340
    goto :goto_b

    .line 341
    :cond_10
    :goto_a
    const/4 v3, 0x1

    .line 342
    goto :goto_9

    .line 343
    :cond_11
    const/16 v17, 0x0

    .line 344
    .line 345
    aget v3, v10, v17

    .line 346
    .line 347
    sub-int/2addr v3, v6

    .line 348
    if-gez v3, :cond_f

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :goto_b
    if-ne v3, v9, :cond_12

    .line 352
    .line 353
    const/4 v9, 0x1

    .line 354
    goto :goto_c

    .line 355
    :cond_12
    const/4 v9, 0x0

    .line 356
    :goto_c
    iput v3, v0, Lk/g;->p:I

    .line 357
    .line 358
    const/16 v3, 0x1a

    .line 359
    .line 360
    const/4 v10, 0x5

    .line 361
    if-lt v7, v3, :cond_13

    .line 362
    .line 363
    iput-object v2, v8, Ll/K0;->o:Landroid/view/View;

    .line 364
    .line 365
    const/4 v3, 0x0

    .line 366
    const/4 v7, 0x0

    .line 367
    goto :goto_d

    .line 368
    :cond_13
    const/4 v3, 0x2

    .line 369
    new-array v7, v3, [I

    .line 370
    .line 371
    iget-object v12, v0, Lk/g;->n:Landroid/view/View;

    .line 372
    .line 373
    invoke-virtual {v12, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 374
    .line 375
    .line 376
    new-array v3, v3, [I

    .line 377
    .line 378
    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 379
    .line 380
    .line 381
    iget v12, v0, Lk/g;->m:I

    .line 382
    .line 383
    and-int/lit8 v12, v12, 0x7

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    if-ne v12, v10, :cond_14

    .line 388
    .line 389
    aget v12, v7, v17

    .line 390
    .line 391
    iget-object v13, v0, Lk/g;->n:Landroid/view/View;

    .line 392
    .line 393
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    add-int/2addr v13, v12

    .line 398
    aput v13, v7, v17

    .line 399
    .line 400
    aget v12, v3, v17

    .line 401
    .line 402
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 403
    .line 404
    .line 405
    move-result v13

    .line 406
    add-int/2addr v13, v12

    .line 407
    aput v13, v3, v17

    .line 408
    .line 409
    :cond_14
    aget v12, v3, v17

    .line 410
    .line 411
    aget v13, v7, v17

    .line 412
    .line 413
    sub-int/2addr v12, v13

    .line 414
    const/16 v18, 0x1

    .line 415
    .line 416
    aget v3, v3, v18

    .line 417
    .line 418
    aget v7, v7, v18

    .line 419
    .line 420
    sub-int v7, v3, v7

    .line 421
    .line 422
    move v3, v7

    .line 423
    move v7, v12

    .line 424
    :goto_d
    iget v12, v0, Lk/g;->m:I

    .line 425
    .line 426
    and-int/2addr v12, v10

    .line 427
    if-ne v12, v10, :cond_16

    .line 428
    .line 429
    if-eqz v9, :cond_15

    .line 430
    .line 431
    add-int/2addr v7, v6

    .line 432
    goto :goto_e

    .line 433
    :cond_15
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    sub-int/2addr v7, v2

    .line 438
    goto :goto_e

    .line 439
    :cond_16
    if-eqz v9, :cond_17

    .line 440
    .line 441
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    add-int/2addr v7, v2

    .line 446
    goto :goto_e

    .line 447
    :cond_17
    sub-int/2addr v7, v6

    .line 448
    :goto_e
    iput v7, v8, Ll/K0;->f:I

    .line 449
    .line 450
    const/4 v9, 0x1

    .line 451
    iput-boolean v9, v8, Ll/K0;->k:Z

    .line 452
    .line 453
    iput-boolean v9, v8, Ll/K0;->j:Z

    .line 454
    .line 455
    invoke-virtual {v8, v3}, Ll/K0;->l(I)V

    .line 456
    .line 457
    .line 458
    goto :goto_10

    .line 459
    :cond_18
    iget-boolean v2, v0, Lk/g;->q:Z

    .line 460
    .line 461
    if-eqz v2, :cond_19

    .line 462
    .line 463
    iget v2, v0, Lk/g;->s:I

    .line 464
    .line 465
    iput v2, v8, Ll/K0;->f:I

    .line 466
    .line 467
    :cond_19
    iget-boolean v2, v0, Lk/g;->r:Z

    .line 468
    .line 469
    if-eqz v2, :cond_1a

    .line 470
    .line 471
    iget v2, v0, Lk/g;->t:I

    .line 472
    .line 473
    invoke-virtual {v8, v2}, Ll/K0;->l(I)V

    .line 474
    .line 475
    .line 476
    :cond_1a
    iget-object v2, v0, Lk/u;->a:Landroid/graphics/Rect;

    .line 477
    .line 478
    if-eqz v2, :cond_1b

    .line 479
    .line 480
    new-instance v9, Landroid/graphics/Rect;

    .line 481
    .line 482
    invoke-direct {v9, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 483
    .line 484
    .line 485
    goto :goto_f

    .line 486
    :cond_1b
    const/4 v9, 0x0

    .line 487
    :goto_f
    iput-object v9, v8, Ll/K0;->x:Landroid/graphics/Rect;

    .line 488
    .line 489
    :goto_10
    new-instance v2, Lk/f;

    .line 490
    .line 491
    iget v3, v0, Lk/g;->p:I

    .line 492
    .line 493
    invoke-direct {v2, v8, v1, v3}, Lk/f;-><init>(Ll/P0;Lk/m;I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    invoke-virtual {v8}, Ll/K0;->i()V

    .line 500
    .line 501
    .line 502
    iget-object v2, v8, Ll/K0;->c:Ll/x0;

    .line 503
    .line 504
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 505
    .line 506
    .line 507
    if-nez v11, :cond_1c

    .line 508
    .line 509
    iget-boolean v3, v0, Lk/g;->v:Z

    .line 510
    .line 511
    if-eqz v3, :cond_1c

    .line 512
    .line 513
    iget-object v3, v1, Lk/m;->m:Ljava/lang/CharSequence;

    .line 514
    .line 515
    if-eqz v3, :cond_1c

    .line 516
    .line 517
    const v3, 0x7f0c0012

    .line 518
    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    invoke-virtual {v4, v3, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Landroid/widget/FrameLayout;

    .line 526
    .line 527
    const v4, 0x1020016

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    check-cast v4, Landroid/widget/TextView;

    .line 535
    .line 536
    invoke-virtual {v3, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 537
    .line 538
    .line 539
    iget-object v1, v1, Lk/m;->m:Ljava/lang/CharSequence;

    .line 540
    .line 541
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 542
    .line 543
    .line 544
    const/4 v9, 0x0

    .line 545
    invoke-virtual {v2, v3, v9, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v8}, Ll/K0;->i()V

    .line 549
    .line 550
    .line 551
    :cond_1c
    return-void
.end method

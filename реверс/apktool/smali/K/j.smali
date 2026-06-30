.class public LK/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO/u;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[LK/k;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, LK/j;->a:I

    .line 8
    iput-object p2, p0, LK/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Le/h;->g(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LK/j;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Le/d;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    invoke-static {p1, p2}, Le/h;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Le/d;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, LK/j;->b:Ljava/lang/Object;

    .line 5
    iput p2, p0, LK/j;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/j;->b:Ljava/lang/Object;

    iput p2, p0, LK/j;->a:I

    return-void
.end method


# virtual methods
.method public a()Le/h;
    .locals 11

    .line 1
    new-instance v0, Le/h;

    .line 2
    .line 3
    iget-object v1, p0, LK/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Le/d;

    .line 6
    .line 7
    iget-object v2, v1, Le/d;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget v3, p0, LK/j;->a:I

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Le/h;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Le/d;->e:Landroid/view/View;

    .line 15
    .line 16
    iget-object v3, v0, Le/h;->f:Le/g;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput-object v2, v3, Le/g;->w:Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v2, v1, Le/d;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-object v2, v3, Le/g;->d:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v5, v3, Le/g;->u:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, v1, Le/d;->c:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iput-object v2, v3, Le/g;->s:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v5, v3, Le/g;->t:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v5, v3, Le/g;->t:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v2, v1, Le/d;->f:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-object v2, v3, Le/g;->e:Ljava/lang/CharSequence;

    .line 60
    .line 61
    iget-object v5, v3, Le/g;->v:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v2, v1, Le/d;->g:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v5, v1, Le/d;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 74
    .line 75
    const/4 v6, -0x1

    .line 76
    invoke-virtual {v3, v6, v2, v5}, Le/g;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v2, v1, Le/d;->i:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object v5, v1, Le/d;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 85
    .line 86
    const/4 v6, -0x2

    .line 87
    invoke-virtual {v3, v6, v2, v5}, Le/g;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object v2, v1, Le/d;->k:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    iget-object v5, v1, Le/d;->l:LQ0/p;

    .line 96
    .line 97
    const/4 v6, -0x3

    .line 98
    invoke-virtual {v3, v6, v2, v5}, Le/g;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object v2, v1, Le/d;->o:Ljava/lang/Object;

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v6, 0x1

    .line 105
    if-eqz v2, :cond_b

    .line 106
    .line 107
    iget v2, v3, Le/g;->A:I

    .line 108
    .line 109
    iget-object v7, v1, Le/d;->b:Landroid/view/LayoutInflater;

    .line 110
    .line 111
    invoke-virtual {v7, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 116
    .line 117
    iget-boolean v7, v1, Le/d;->r:Z

    .line 118
    .line 119
    if-eqz v7, :cond_7

    .line 120
    .line 121
    iget v7, v3, Le/g;->B:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    iget v7, v3, Le/g;->C:I

    .line 125
    .line 126
    :goto_4
    iget-object v8, v1, Le/d;->o:Ljava/lang/Object;

    .line 127
    .line 128
    if-eqz v8, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    new-instance v8, Le/f;

    .line 132
    .line 133
    iget-object v9, v1, Le/d;->a:Landroid/view/ContextThemeWrapper;

    .line 134
    .line 135
    const v10, 0x1020014

    .line 136
    .line 137
    .line 138
    invoke-direct {v8, v9, v7, v10, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_5
    iput-object v8, v3, Le/g;->x:Landroid/widget/ListAdapter;

    .line 142
    .line 143
    iget v7, v1, Le/d;->s:I

    .line 144
    .line 145
    iput v7, v3, Le/g;->y:I

    .line 146
    .line 147
    iget-object v7, v1, Le/d;->p:Landroid/content/DialogInterface$OnClickListener;

    .line 148
    .line 149
    if-eqz v7, :cond_9

    .line 150
    .line 151
    new-instance v7, Le/c;

    .line 152
    .line 153
    invoke-direct {v7, v1, v3}, Le/c;-><init>(Le/d;Le/g;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    iget-boolean v7, v1, Le/d;->r:Z

    .line 160
    .line 161
    if-eqz v7, :cond_a

    .line 162
    .line 163
    invoke-virtual {v2, v6}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 164
    .line 165
    .line 166
    :cond_a
    iput-object v2, v3, Le/g;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 167
    .line 168
    :cond_b
    iget-object v2, v1, Le/d;->q:Landroid/view/View;

    .line 169
    .line 170
    if-eqz v2, :cond_c

    .line 171
    .line 172
    iput-object v2, v3, Le/g;->g:Landroid/view/View;

    .line 173
    .line 174
    iput-boolean v4, v3, Le/g;->h:Z

    .line 175
    .line 176
    :cond_c
    iget-boolean v2, v1, Le/d;->m:Z

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 179
    .line 180
    .line 181
    iget-boolean v2, v1, Le/d;->m:Z

    .line 182
    .line 183
    if-eqz v2, :cond_d

    .line 184
    .line 185
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 186
    .line 187
    .line 188
    :cond_d
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 192
    .line 193
    .line 194
    iget-object v1, v1, Le/d;->n:Lk/n;

    .line 195
    .line 196
    if-eqz v1, :cond_e

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 199
    .line 200
    .line 201
    :cond_e
    return-object v0
.end method

.method public m(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, LK/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, LK/j;->a:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
.end method

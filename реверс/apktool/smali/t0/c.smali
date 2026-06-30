.class public final Lt0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final u:Z

.field public static final v:Z


# instance fields
.field public final a:Lcom/google/android/material/button/MaterialButton;

.field public b:LI0/m;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/PorterDuff$Mode;

.field public j:Landroid/content/res/ColorStateList;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Landroid/graphics/drawable/LayerDrawable;

.field public t:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sput-boolean v1, Lt0/c;->u:Z

    .line 5
    .line 6
    const/16 v2, 0x16

    .line 7
    .line 8
    if-gt v0, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    sput-boolean v1, Lt0/c;->v:Z

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/button/MaterialButton;LI0/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lt0/c;->n:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lt0/c;->o:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lt0/c;->p:Z

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lt0/c;->r:Z

    .line 13
    .line 14
    iput-object p1, p0, Lt0/c;->a:Lcom/google/android/material/button/MaterialButton;

    .line 15
    .line 16
    iput-object p2, p0, Lt0/c;->b:LI0/m;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()LI0/x;
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x2

    .line 19
    if-le v0, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LI0/x;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LI0/x;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method public final b(Z)LI0/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    sget-boolean v0, Lt0/c;->u:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/drawable/InsetDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 29
    .line 30
    xor-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, LI0/h;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    iget-object v0, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 40
    .line 41
    xor-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LI0/h;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public final c(LI0/m;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lt0/c;->b:LI0/m;

    .line 2
    .line 3
    sget-boolean v0, Lt0/c;->v:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lt0/c;->o:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p1, LN/S;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    iget-object p1, p0, Lt0/c;->a:Lcom/google/android/material/button/MaterialButton;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {p0}, Lt0/c;->e()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, Lt0/c;->b(Z)LI0/h;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lt0/c;->b(Z)LI0/h;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Lt0/c;->b(Z)LI0/h;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lt0/c;->b(Z)LI0/h;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0}, Lt0/c;->a()LI0/x;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Lt0/c;->a()LI0/x;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0, p1}, LI0/x;->setShapeAppearanceModel(LI0/m;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final d(II)V
    .locals 8

    .line 1
    sget-object v0, LN/S;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lt0/c;->a:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget v5, p0, Lt0/c;->e:I

    .line 22
    .line 23
    iget v6, p0, Lt0/c;->f:I

    .line 24
    .line 25
    iput p2, p0, Lt0/c;->f:I

    .line 26
    .line 27
    iput p1, p0, Lt0/c;->e:I

    .line 28
    .line 29
    iget-boolean v7, p0, Lt0/c;->o:Z

    .line 30
    .line 31
    if-nez v7, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lt0/c;->e()V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/2addr v2, p1

    .line 37
    sub-int/2addr v2, v5

    .line 38
    add-int/2addr v4, p2

    .line 39
    sub-int/2addr v4, v6

    .line 40
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final e()V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, LI0/h;

    .line 5
    .line 6
    iget-object v4, p0, Lt0/c;->b:LI0/m;

    .line 7
    .line 8
    invoke-direct {v3, v4}, LI0/h;-><init>(LI0/m;)V

    .line 9
    .line 10
    .line 11
    iget-object v4, p0, Lt0/c;->a:Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v3, v5}, LI0/h;->j(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iget-object v5, p0, Lt0/c;->j:Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    invoke-static {v3, v5}, LG/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Lt0/c;->i:Landroid/graphics/PorterDuff$Mode;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-static {v3, v5}, LG/a;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget v5, p0, Lt0/c;->h:I

    .line 33
    .line 34
    int-to-float v5, v5

    .line 35
    iget-object v6, p0, Lt0/c;->k:Landroid/content/res/ColorStateList;

    .line 36
    .line 37
    iget-object v7, v3, LI0/h;->a:LI0/g;

    .line 38
    .line 39
    iput v5, v7, LI0/g;->j:F

    .line 40
    .line 41
    invoke-virtual {v3}, LI0/h;->invalidateSelf()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v6}, LI0/h;->p(Landroid/content/res/ColorStateList;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, LI0/h;

    .line 48
    .line 49
    iget-object v6, p0, Lt0/c;->b:LI0/m;

    .line 50
    .line 51
    invoke-direct {v5, v6}, LI0/h;-><init>(LI0/m;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v2}, LI0/h;->setTint(I)V

    .line 55
    .line 56
    .line 57
    iget v6, p0, Lt0/c;->h:I

    .line 58
    .line 59
    int-to-float v6, v6

    .line 60
    iget-boolean v7, p0, Lt0/c;->n:Z

    .line 61
    .line 62
    if-eqz v7, :cond_1

    .line 63
    .line 64
    const v7, 0x7f030121

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v7}, LT/m;->v(Landroid/view/View;I)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v7, 0x0

    .line 73
    :goto_0
    iget-object v8, v5, LI0/h;->a:LI0/g;

    .line 74
    .line 75
    iput v6, v8, LI0/g;->j:F

    .line 76
    .line 77
    invoke-virtual {v5}, LI0/h;->invalidateSelf()V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v5, v6}, LI0/h;->p(Landroid/content/res/ColorStateList;)V

    .line 85
    .line 86
    .line 87
    sget-boolean v6, Lt0/c;->u:Z

    .line 88
    .line 89
    if-eqz v6, :cond_2

    .line 90
    .line 91
    new-instance v6, LI0/h;

    .line 92
    .line 93
    iget-object v7, p0, Lt0/c;->b:LI0/m;

    .line 94
    .line 95
    invoke-direct {v6, v7}, LI0/h;-><init>(LI0/m;)V

    .line 96
    .line 97
    .line 98
    iput-object v6, p0, Lt0/c;->m:Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    const/4 v7, -0x1

    .line 101
    invoke-static {v6, v7}, LG/a;->g(Landroid/graphics/drawable/Drawable;I)V

    .line 102
    .line 103
    .line 104
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    .line 105
    .line 106
    iget-object v7, p0, Lt0/c;->l:Landroid/content/res/ColorStateList;

    .line 107
    .line 108
    invoke-static {v7}, LG0/d;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    new-instance v9, Landroid/graphics/drawable/LayerDrawable;

    .line 113
    .line 114
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    aput-object v5, v1, v2

    .line 117
    .line 118
    aput-object v3, v1, v0

    .line 119
    .line 120
    invoke-direct {v9, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    new-instance v8, Landroid/graphics/drawable/InsetDrawable;

    .line 124
    .line 125
    iget v10, p0, Lt0/c;->c:I

    .line 126
    .line 127
    iget v11, p0, Lt0/c;->e:I

    .line 128
    .line 129
    iget v12, p0, Lt0/c;->d:I

    .line 130
    .line 131
    iget v13, p0, Lt0/c;->f:I

    .line 132
    .line 133
    invoke-direct/range {v8 .. v13}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lt0/c;->m:Landroid/graphics/drawable/Drawable;

    .line 137
    .line 138
    invoke-direct {v6, v7, v8, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    iput-object v6, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    new-instance v6, LG0/b;

    .line 145
    .line 146
    iget-object v7, p0, Lt0/c;->b:LI0/m;

    .line 147
    .line 148
    new-instance v8, LG0/a;

    .line 149
    .line 150
    new-instance v9, LI0/h;

    .line 151
    .line 152
    invoke-direct {v9, v7}, LI0/h;-><init>(LI0/m;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v8}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v9, v8, LG0/a;->a:LI0/h;

    .line 159
    .line 160
    iput-boolean v2, v8, LG0/a;->b:Z

    .line 161
    .line 162
    invoke-direct {v6, v8}, LG0/b;-><init>(LG0/a;)V

    .line 163
    .line 164
    .line 165
    iput-object v6, p0, Lt0/c;->m:Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    iget-object v7, p0, Lt0/c;->l:Landroid/content/res/ColorStateList;

    .line 168
    .line 169
    invoke-static {v7}, LG0/d;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-static {v6, v7}, LG/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 174
    .line 175
    .line 176
    new-instance v9, Landroid/graphics/drawable/LayerDrawable;

    .line 177
    .line 178
    iget-object v6, p0, Lt0/c;->m:Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    const/4 v7, 0x3

    .line 181
    new-array v7, v7, [Landroid/graphics/drawable/Drawable;

    .line 182
    .line 183
    aput-object v5, v7, v2

    .line 184
    .line 185
    aput-object v3, v7, v0

    .line 186
    .line 187
    aput-object v6, v7, v1

    .line 188
    .line 189
    invoke-direct {v9, v7}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 190
    .line 191
    .line 192
    iput-object v9, p0, Lt0/c;->s:Landroid/graphics/drawable/LayerDrawable;

    .line 193
    .line 194
    new-instance v8, Landroid/graphics/drawable/InsetDrawable;

    .line 195
    .line 196
    iget v10, p0, Lt0/c;->c:I

    .line 197
    .line 198
    iget v11, p0, Lt0/c;->e:I

    .line 199
    .line 200
    iget v12, p0, Lt0/c;->d:I

    .line 201
    .line 202
    iget v13, p0, Lt0/c;->f:I

    .line 203
    .line 204
    invoke-direct/range {v8 .. v13}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 205
    .line 206
    .line 207
    move-object v6, v8

    .line 208
    :goto_1
    invoke-virtual {v4, v6}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v2}, Lt0/c;->b(Z)LI0/h;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_3

    .line 216
    .line 217
    iget v1, p0, Lt0/c;->t:I

    .line 218
    .line 219
    int-to-float v1, v1

    .line 220
    invoke-virtual {v0, v1}, LI0/h;->k(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4}, Landroid/view/View;->getDrawableState()[I

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 228
    .line 229
    .line 230
    :cond_3
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lt0/c;->b(Z)LI0/h;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Lt0/c;->b(Z)LI0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v3, p0, Lt0/c;->h:I

    .line 14
    .line 15
    int-to-float v3, v3

    .line 16
    iget-object v4, p0, Lt0/c;->k:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    iget-object v5, v1, LI0/h;->a:LI0/g;

    .line 19
    .line 20
    iput v3, v5, LI0/g;->j:F

    .line 21
    .line 22
    invoke-virtual {v1}, LI0/h;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v4}, LI0/h;->p(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lt0/c;->h:I

    .line 31
    .line 32
    int-to-float v1, v1

    .line 33
    iget-boolean v3, p0, Lt0/c;->n:Z

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lt0/c;->a:Lcom/google/android/material/button/MaterialButton;

    .line 38
    .line 39
    const v3, 0x7f030121

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v3}, LT/m;->v(Landroid/view/View;I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :cond_0
    iget-object v3, v2, LI0/h;->a:LI0/g;

    .line 47
    .line 48
    iput v1, v3, LI0/g;->j:F

    .line 49
    .line 50
    invoke-virtual {v2}, LI0/h;->invalidateSelf()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v2, v0}, LI0/h;->p(Landroid/content/res/ColorStateList;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

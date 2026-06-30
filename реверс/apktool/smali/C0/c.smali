.class public final LC0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Ljava/lang/CharSequence;

.field public C:Z

.field public final D:Z

.field public E:Landroid/graphics/Bitmap;

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:F

.field public K:I

.field public L:[I

.field public M:Z

.field public final N:Landroid/text/TextPaint;

.field public final O:Landroid/text/TextPaint;

.field public P:Landroid/view/animation/LinearInterpolator;

.field public Q:Landroid/view/animation/LinearInterpolator;

.field public R:F

.field public S:F

.field public T:F

.field public U:Landroid/content/res/ColorStateList;

.field public V:F

.field public W:F

.field public X:F

.field public Y:Landroid/text/StaticLayout;

.field public Z:F

.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public a0:F

.field public b:F

.field public b0:F

.field public final c:Landroid/graphics/Rect;

.field public c0:Ljava/lang/CharSequence;

.field public final d:Landroid/graphics/Rect;

.field public final d0:I

.field public final e:Landroid/graphics/RectF;

.field public final e0:F

.field public f:I

.field public final f0:I

.field public g:I

.field public h:F

.field public i:F

.field public j:Landroid/content/res/ColorStateList;

.field public k:Landroid/content/res/ColorStateList;

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:Landroid/graphics/Typeface;

.field public s:Landroid/graphics/Typeface;

.field public t:Landroid/graphics/Typeface;

.field public u:Landroid/graphics/Typeface;

.field public v:Landroid/graphics/Typeface;

.field public w:Landroid/graphics/Typeface;

.field public x:Landroid/graphics/Typeface;

.field public y:LF0/a;

.field public final z:Landroid/text/TextUtils$TruncateAt;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    iput v0, p0, LC0/c;->f:I

    .line 7
    .line 8
    iput v0, p0, LC0/c;->g:I

    .line 9
    .line 10
    const/high16 v0, 0x41700000    # 15.0f

    .line 11
    .line 12
    iput v0, p0, LC0/c;->h:F

    .line 13
    .line 14
    iput v0, p0, LC0/c;->i:F

    .line 15
    .line 16
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 17
    .line 18
    iput-object v0, p0, LC0/c;->z:Landroid/text/TextUtils$TruncateAt;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, LC0/c;->D:Z

    .line 22
    .line 23
    iput v0, p0, LC0/c;->d0:I

    .line 24
    .line 25
    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    iput v0, p0, LC0/c;->e0:F

    .line 28
    .line 29
    sget v0, LC0/h;->l:I

    .line 30
    .line 31
    iput v0, p0, LC0/c;->f0:I

    .line 32
    .line 33
    iput-object p1, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 34
    .line 35
    new-instance v0, Landroid/text/TextPaint;

    .line 36
    .line 37
    const/16 v1, 0x81

    .line 38
    .line 39
    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LC0/c;->N:Landroid/text/TextPaint;

    .line 43
    .line 44
    new-instance v1, Landroid/text/TextPaint;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, LC0/c;->O:Landroid/text/TextPaint;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, LC0/c;->d:Landroid/graphics/Rect;

    .line 57
    .line 58
    new-instance v0, Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LC0/c;->c:Landroid/graphics/Rect;

    .line 64
    .line 65
    new-instance v0, Landroid/graphics/RectF;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, LC0/c;->e:Landroid/graphics/RectF;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p0, p1}, LC0/c;->g(Landroid/content/res/Configuration;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public static a(IIF)I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p2

    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-float v1, v1

    .line 9
    mul-float v1, v1, v0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    mul-float v2, v2, p2

    .line 17
    .line 18
    add-float/2addr v2, v1

    .line 19
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    mul-float v1, v1, v0

    .line 25
    .line 26
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    int-to-float v3, v3

    .line 31
    mul-float v3, v3, p2

    .line 32
    .line 33
    add-float/2addr v3, v1

    .line 34
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-float v1, v1

    .line 39
    mul-float v1, v1, v0

    .line 40
    .line 41
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-float v4, v4

    .line 46
    mul-float v4, v4, p2

    .line 47
    .line 48
    add-float/2addr v4, v1

    .line 49
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    int-to-float p0, p0

    .line 54
    mul-float p0, p0, v0

    .line 55
    .line 56
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    int-to-float p1, p1

    .line 61
    mul-float p1, p1, p2

    .line 62
    .line 63
    add-float/2addr p1, p0

    .line 64
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p0, p2, v0, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method public static f(FFFLandroid/animation/TimeInterpolator;)F
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p3, p2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    :cond_0
    invoke-static {p0, p1, p2}, Lo0/a;->a(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 1
    sget-object v0, LN/S;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    iget-object v0, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-boolean v0, p0, LC0/c;->D:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v0, LL/k;->d:LL/j;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, LL/k;->c:LL/j;

    .line 24
    .line 25
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, p1, v1}, LL/j;->b(Ljava/lang/CharSequence;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    return v1
.end method

.method public final c(FZ)V
    .locals 12

    .line 1
    iget-object v0, p0, LC0/c;->A:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_f

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LC0/c;->d:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    iget-object v1, p0, LC0/c;->c:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-float v1, v1

    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    sub-float v3, p1, v2

    .line 24
    .line 25
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    const v5, 0x3727c5ac    # 1.0E-5f

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    cmpg-float v3, v3, v5

    .line 35
    .line 36
    if-gez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x0

    .line 41
    :goto_0
    const/4 v7, 0x0

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    iget p1, p0, LC0/c;->i:F

    .line 45
    .line 46
    iget p2, p0, LC0/c;->V:F

    .line 47
    .line 48
    iput v2, p0, LC0/c;->F:F

    .line 49
    .line 50
    iget-object v1, p0, LC0/c;->r:Landroid/graphics/Typeface;

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    iget v3, p0, LC0/c;->h:F

    .line 54
    .line 55
    iget v8, p0, LC0/c;->W:F

    .line 56
    .line 57
    iget-object v9, p0, LC0/c;->u:Landroid/graphics/Typeface;

    .line 58
    .line 59
    sub-float v10, p1, v7

    .line 60
    .line 61
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    cmpg-float v5, v10, v5

    .line 66
    .line 67
    if-gez v5, :cond_3

    .line 68
    .line 69
    iput v2, p0, LC0/c;->F:F

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget v5, p0, LC0/c;->h:F

    .line 73
    .line 74
    iget v10, p0, LC0/c;->i:F

    .line 75
    .line 76
    iget-object v11, p0, LC0/c;->Q:Landroid/view/animation/LinearInterpolator;

    .line 77
    .line 78
    invoke-static {v5, v10, p1, v11}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v5, p0, LC0/c;->h:F

    .line 83
    .line 84
    div-float/2addr p1, v5

    .line 85
    iput p1, p0, LC0/c;->F:F

    .line 86
    .line 87
    :goto_1
    iget p1, p0, LC0/c;->i:F

    .line 88
    .line 89
    iget v5, p0, LC0/c;->h:F

    .line 90
    .line 91
    div-float/2addr p1, v5

    .line 92
    mul-float v5, v1, p1

    .line 93
    .line 94
    if-nez p2, :cond_4

    .line 95
    .line 96
    cmpl-float p2, v5, v0

    .line 97
    .line 98
    if-lez p2, :cond_4

    .line 99
    .line 100
    div-float/2addr v0, p1

    .line 101
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    move v0, p1

    .line 106
    :goto_2
    move p1, v3

    .line 107
    move p2, v8

    .line 108
    move-object v1, v9

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move v0, v1

    .line 111
    goto :goto_2

    .line 112
    :goto_3
    iget-object v3, p0, LC0/c;->N:Landroid/text/TextPaint;

    .line 113
    .line 114
    cmpl-float v5, v0, v7

    .line 115
    .line 116
    if-lez v5, :cond_c

    .line 117
    .line 118
    iget v5, p0, LC0/c;->G:F

    .line 119
    .line 120
    cmpl-float v5, v5, p1

    .line 121
    .line 122
    if-eqz v5, :cond_5

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    const/4 v5, 0x0

    .line 127
    :goto_4
    iget v7, p0, LC0/c;->X:F

    .line 128
    .line 129
    cmpl-float v7, v7, p2

    .line 130
    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    const/4 v7, 0x1

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    const/4 v7, 0x0

    .line 136
    :goto_5
    iget-object v8, p0, LC0/c;->x:Landroid/graphics/Typeface;

    .line 137
    .line 138
    if-eq v8, v1, :cond_7

    .line 139
    .line 140
    const/4 v8, 0x1

    .line 141
    goto :goto_6

    .line 142
    :cond_7
    const/4 v8, 0x0

    .line 143
    :goto_6
    iget-object v9, p0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 144
    .line 145
    if-eqz v9, :cond_8

    .line 146
    .line 147
    invoke-virtual {v9}, Landroid/text/Layout;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    int-to-float v9, v9

    .line 152
    cmpl-float v9, v0, v9

    .line 153
    .line 154
    if-eqz v9, :cond_8

    .line 155
    .line 156
    const/4 v9, 0x1

    .line 157
    goto :goto_7

    .line 158
    :cond_8
    const/4 v9, 0x0

    .line 159
    :goto_7
    if-nez v5, :cond_a

    .line 160
    .line 161
    if-nez v7, :cond_a

    .line 162
    .line 163
    if-nez v9, :cond_a

    .line 164
    .line 165
    if-nez v8, :cond_a

    .line 166
    .line 167
    iget-boolean v5, p0, LC0/c;->M:Z

    .line 168
    .line 169
    if-eqz v5, :cond_9

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    const/4 v5, 0x0

    .line 173
    goto :goto_9

    .line 174
    :cond_a
    :goto_8
    const/4 v5, 0x1

    .line 175
    :goto_9
    iput p1, p0, LC0/c;->G:F

    .line 176
    .line 177
    iput p2, p0, LC0/c;->X:F

    .line 178
    .line 179
    iput-object v1, p0, LC0/c;->x:Landroid/graphics/Typeface;

    .line 180
    .line 181
    iput-boolean v4, p0, LC0/c;->M:Z

    .line 182
    .line 183
    iget p1, p0, LC0/c;->F:F

    .line 184
    .line 185
    cmpl-float p1, p1, v2

    .line 186
    .line 187
    if-eqz p1, :cond_b

    .line 188
    .line 189
    const/4 p1, 0x1

    .line 190
    goto :goto_a

    .line 191
    :cond_b
    const/4 p1, 0x0

    .line 192
    :goto_a
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_b

    .line 196
    :cond_c
    const/4 v5, 0x0

    .line 197
    :goto_b
    iget-object p1, p0, LC0/c;->B:Ljava/lang/CharSequence;

    .line 198
    .line 199
    if-eqz p1, :cond_d

    .line 200
    .line 201
    if-eqz v5, :cond_15

    .line 202
    .line 203
    :cond_d
    iget p1, p0, LC0/c;->G:F

    .line 204
    .line 205
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, LC0/c;->x:Landroid/graphics/Typeface;

    .line 209
    .line 210
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 211
    .line 212
    .line 213
    iget p1, p0, LC0/c;->X:F

    .line 214
    .line 215
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, LC0/c;->A:Ljava/lang/CharSequence;

    .line 219
    .line 220
    invoke-virtual {p0, p1}, LC0/c;->b(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    iput-boolean p1, p0, LC0/c;->C:Z

    .line 225
    .line 226
    iget p2, p0, LC0/c;->d0:I

    .line 227
    .line 228
    if-le p2, v6, :cond_e

    .line 229
    .line 230
    if-eqz p1, :cond_f

    .line 231
    .line 232
    :cond_e
    const/4 p2, 0x1

    .line 233
    :cond_f
    if-ne p2, v6, :cond_10

    .line 234
    .line 235
    :try_start_0
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 236
    .line 237
    goto :goto_c

    .line 238
    :catch_0
    move-exception p1

    .line 239
    goto :goto_d

    .line 240
    :cond_10
    iget v1, p0, LC0/c;->f:I

    .line 241
    .line 242
    invoke-static {v1, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    and-int/lit8 v1, v1, 0x7

    .line 247
    .line 248
    if-eq v1, v6, :cond_14

    .line 249
    .line 250
    const/4 v2, 0x5

    .line 251
    if-eq v1, v2, :cond_12

    .line 252
    .line 253
    iget-boolean v1, p0, LC0/c;->C:Z

    .line 254
    .line 255
    if-eqz v1, :cond_11

    .line 256
    .line 257
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 258
    .line 259
    goto :goto_c

    .line 260
    :cond_11
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_12
    iget-boolean v1, p0, LC0/c;->C:Z

    .line 264
    .line 265
    if-eqz v1, :cond_13

    .line 266
    .line 267
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 268
    .line 269
    goto :goto_c

    .line 270
    :cond_13
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 271
    .line 272
    goto :goto_c

    .line 273
    :cond_14
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 274
    .line 275
    :goto_c
    iget-object v2, p0, LC0/c;->A:Ljava/lang/CharSequence;

    .line 276
    .line 277
    float-to-int v0, v0

    .line 278
    new-instance v5, LC0/h;

    .line 279
    .line 280
    invoke-direct {v5, v2, v3, v0}, LC0/h;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    .line 281
    .line 282
    .line 283
    iget-object v0, p0, LC0/c;->z:Landroid/text/TextUtils$TruncateAt;

    .line 284
    .line 285
    iput-object v0, v5, LC0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 286
    .line 287
    iput-boolean p1, v5, LC0/h;->j:Z

    .line 288
    .line 289
    iput-object v1, v5, LC0/h;->e:Landroid/text/Layout$Alignment;

    .line 290
    .line 291
    iput-boolean v4, v5, LC0/h;->i:Z

    .line 292
    .line 293
    iput p2, v5, LC0/h;->f:I

    .line 294
    .line 295
    iget p1, p0, LC0/c;->e0:F

    .line 296
    .line 297
    iput p1, v5, LC0/h;->g:F

    .line 298
    .line 299
    iget p1, p0, LC0/c;->f0:I

    .line 300
    .line 301
    iput p1, v5, LC0/h;->h:I

    .line 302
    .line 303
    invoke-virtual {v5}, LC0/h;->a()Landroid/text/StaticLayout;

    .line 304
    .line 305
    .line 306
    move-result-object p1
    :try_end_0
    .catch LC0/g; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    goto :goto_e

    .line 308
    :goto_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    const-string v0, "CollapsingTextHelper"

    .line 317
    .line 318
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 319
    .line 320
    .line 321
    const/4 p1, 0x0

    .line 322
    :goto_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iput-object p1, p0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    iput-object p1, p0, LC0/c;->B:Ljava/lang/CharSequence;

    .line 332
    .line 333
    :cond_15
    :goto_f
    return-void
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-object v0, p0, LC0/c;->O:Landroid/text/TextPaint;

    .line 2
    .line 3
    iget v1, p0, LC0/c;->i:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LC0/c;->r:Landroid/graphics/Typeface;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 11
    .line 12
    .line 13
    iget v1, p0, LC0/c;->V:F

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    neg-float v0, v0

    .line 23
    return v0
.end method

.method public final e(Landroid/content/res/ColorStateList;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LC0/c;->L:[I

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final g(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, LC0/c;->t:Landroid/graphics/Typeface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v0}, LA0/e;->i0(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LC0/c;->s:Landroid/graphics/Typeface;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LC0/c;->w:Landroid/graphics/Typeface;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p1, v0}, LA0/e;->i0(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, LC0/c;->v:Landroid/graphics/Typeface;

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, LC0/c;->s:Landroid/graphics/Typeface;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p1, p0, LC0/c;->t:Landroid/graphics/Typeface;

    .line 33
    .line 34
    :goto_0
    iput-object p1, p0, LC0/c;->r:Landroid/graphics/Typeface;

    .line 35
    .line 36
    iget-object p1, p0, LC0/c;->v:Landroid/graphics/Typeface;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p1, p0, LC0/c;->w:Landroid/graphics/Typeface;

    .line 42
    .line 43
    :goto_1
    iput-object p1, p0, LC0/c;->u:Landroid/graphics/Typeface;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p0, p1}, LC0/c;->h(Z)V

    .line 47
    .line 48
    .line 49
    :cond_4
    return-void
.end method

.method public final h(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-lez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_1

    .line 18
    .line 19
    :cond_0
    if-eqz v1, :cond_13

    .line 20
    .line 21
    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, LC0/c;->c(FZ)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v0, LC0/c;->B:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v5, v0, LC0/c;->N:Landroid/text/TextPaint;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    iget-object v6, v0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 33
    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    invoke-virtual {v6}, Landroid/text/Layout;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-float v6, v6

    .line 41
    iget-object v7, v0, LC0/c;->z:Landroid/text/TextUtils$TruncateAt;

    .line 42
    .line 43
    invoke-static {v4, v5, v6, v7}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iput-object v4, v0, LC0/c;->c0:Ljava/lang/CharSequence;

    .line 48
    .line 49
    :cond_2
    iget-object v4, v0, LC0/c;->c0:Ljava/lang/CharSequence;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-virtual {v5, v4, v7, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    iput v4, v0, LC0/c;->Z:F

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iput v6, v0, LC0/c;->Z:F

    .line 67
    .line 68
    :goto_0
    iget v4, v0, LC0/c;->g:I

    .line 69
    .line 70
    iget-boolean v8, v0, LC0/c;->C:Z

    .line 71
    .line 72
    invoke-static {v4, v8}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    and-int/lit8 v8, v4, 0x70

    .line 77
    .line 78
    iget-object v9, v0, LC0/c;->d:Landroid/graphics/Rect;

    .line 79
    .line 80
    const/16 v10, 0x50

    .line 81
    .line 82
    const/16 v11, 0x30

    .line 83
    .line 84
    const/high16 v12, 0x40000000    # 2.0f

    .line 85
    .line 86
    if-eq v8, v11, :cond_5

    .line 87
    .line 88
    if-eq v8, v10, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-virtual {v5}, Landroid/graphics/Paint;->ascent()F

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    sub-float/2addr v8, v13

    .line 99
    div-float/2addr v8, v12

    .line 100
    invoke-virtual {v9}, Landroid/graphics/Rect;->centerY()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    int-to-float v13, v13

    .line 105
    sub-float/2addr v13, v8

    .line 106
    iput v13, v0, LC0/c;->m:F

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    iget v8, v9, Landroid/graphics/Rect;->bottom:I

    .line 110
    .line 111
    int-to-float v8, v8

    .line 112
    invoke-virtual {v5}, Landroid/graphics/Paint;->ascent()F

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    add-float/2addr v13, v8

    .line 117
    iput v13, v0, LC0/c;->m:F

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    iget v8, v9, Landroid/graphics/Rect;->top:I

    .line 121
    .line 122
    int-to-float v8, v8

    .line 123
    iput v8, v0, LC0/c;->m:F

    .line 124
    .line 125
    :goto_1
    const v8, 0x800007

    .line 126
    .line 127
    .line 128
    and-int/2addr v4, v8

    .line 129
    const/4 v13, 0x5

    .line 130
    const/4 v14, 0x1

    .line 131
    if-eq v4, v14, :cond_7

    .line 132
    .line 133
    if-eq v4, v13, :cond_6

    .line 134
    .line 135
    iget v4, v9, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    int-to-float v4, v4

    .line 138
    iput v4, v0, LC0/c;->o:F

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    iget v4, v9, Landroid/graphics/Rect;->right:I

    .line 142
    .line 143
    int-to-float v4, v4

    .line 144
    iget v15, v0, LC0/c;->Z:F

    .line 145
    .line 146
    sub-float/2addr v4, v15

    .line 147
    iput v4, v0, LC0/c;->o:F

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    invoke-virtual {v9}, Landroid/graphics/Rect;->centerX()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    int-to-float v4, v4

    .line 155
    iget v15, v0, LC0/c;->Z:F

    .line 156
    .line 157
    div-float/2addr v15, v12

    .line 158
    sub-float/2addr v4, v15

    .line 159
    iput v4, v0, LC0/c;->o:F

    .line 160
    .line 161
    :goto_2
    invoke-virtual {v0, v6, v1}, LC0/c;->c(FZ)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 165
    .line 166
    if-eqz v1, :cond_8

    .line 167
    .line 168
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    int-to-float v1, v1

    .line 173
    goto :goto_3

    .line 174
    :cond_8
    const/4 v1, 0x0

    .line 175
    :goto_3
    iget-object v4, v0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 176
    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    iget v15, v0, LC0/c;->d0:I

    .line 180
    .line 181
    if-le v15, v14, :cond_9

    .line 182
    .line 183
    invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    int-to-float v4, v4

    .line 188
    goto :goto_4

    .line 189
    :cond_9
    iget-object v4, v0, LC0/c;->B:Ljava/lang/CharSequence;

    .line 190
    .line 191
    if-eqz v4, :cond_a

    .line 192
    .line 193
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    invoke-virtual {v5, v4, v7, v15}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    goto :goto_4

    .line 202
    :cond_a
    const/4 v4, 0x0

    .line 203
    :goto_4
    iget-object v15, v0, LC0/c;->Y:Landroid/text/StaticLayout;

    .line 204
    .line 205
    if-eqz v15, :cond_b

    .line 206
    .line 207
    invoke-virtual {v15}, Landroid/text/StaticLayout;->getLineCount()I

    .line 208
    .line 209
    .line 210
    :cond_b
    iget v15, v0, LC0/c;->f:I

    .line 211
    .line 212
    const v16, 0x800007

    .line 213
    .line 214
    .line 215
    iget-boolean v8, v0, LC0/c;->C:Z

    .line 216
    .line 217
    invoke-static {v15, v8}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    and-int/lit8 v15, v8, 0x70

    .line 222
    .line 223
    const/high16 v17, 0x40000000    # 2.0f

    .line 224
    .line 225
    iget-object v12, v0, LC0/c;->c:Landroid/graphics/Rect;

    .line 226
    .line 227
    if-eq v15, v11, :cond_d

    .line 228
    .line 229
    if-eq v15, v10, :cond_c

    .line 230
    .line 231
    div-float v1, v1, v17

    .line 232
    .line 233
    invoke-virtual {v12}, Landroid/graphics/Rect;->centerY()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    int-to-float v10, v10

    .line 238
    sub-float/2addr v10, v1

    .line 239
    iput v10, v0, LC0/c;->l:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_c
    iget v10, v12, Landroid/graphics/Rect;->bottom:I

    .line 243
    .line 244
    int-to-float v10, v10

    .line 245
    sub-float/2addr v10, v1

    .line 246
    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    add-float/2addr v1, v10

    .line 251
    iput v1, v0, LC0/c;->l:F

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_d
    iget v1, v12, Landroid/graphics/Rect;->top:I

    .line 255
    .line 256
    int-to-float v1, v1

    .line 257
    iput v1, v0, LC0/c;->l:F

    .line 258
    .line 259
    :goto_5
    and-int v1, v8, v16

    .line 260
    .line 261
    if-eq v1, v14, :cond_f

    .line 262
    .line 263
    if-eq v1, v13, :cond_e

    .line 264
    .line 265
    iget v1, v12, Landroid/graphics/Rect;->left:I

    .line 266
    .line 267
    int-to-float v1, v1

    .line 268
    iput v1, v0, LC0/c;->n:F

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_e
    iget v1, v12, Landroid/graphics/Rect;->right:I

    .line 272
    .line 273
    int-to-float v1, v1

    .line 274
    sub-float/2addr v1, v4

    .line 275
    iput v1, v0, LC0/c;->n:F

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_f
    invoke-virtual {v12}, Landroid/graphics/Rect;->centerX()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    int-to-float v1, v1

    .line 283
    div-float v4, v4, v17

    .line 284
    .line 285
    sub-float/2addr v1, v4

    .line 286
    iput v1, v0, LC0/c;->n:F

    .line 287
    .line 288
    :goto_6
    iget-object v1, v0, LC0/c;->E:Landroid/graphics/Bitmap;

    .line 289
    .line 290
    if-eqz v1, :cond_10

    .line 291
    .line 292
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 293
    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    iput-object v1, v0, LC0/c;->E:Landroid/graphics/Bitmap;

    .line 297
    .line 298
    :cond_10
    iget v1, v0, LC0/c;->b:F

    .line 299
    .line 300
    invoke-virtual {v0, v1}, LC0/c;->l(F)V

    .line 301
    .line 302
    .line 303
    iget v1, v0, LC0/c;->b:F

    .line 304
    .line 305
    iget v4, v12, Landroid/graphics/Rect;->left:I

    .line 306
    .line 307
    int-to-float v4, v4

    .line 308
    iget v8, v9, Landroid/graphics/Rect;->left:I

    .line 309
    .line 310
    int-to-float v8, v8

    .line 311
    iget-object v10, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 312
    .line 313
    invoke-static {v4, v8, v1, v10}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    iget-object v8, v0, LC0/c;->e:Landroid/graphics/RectF;

    .line 318
    .line 319
    iput v4, v8, Landroid/graphics/RectF;->left:F

    .line 320
    .line 321
    iget v4, v0, LC0/c;->l:F

    .line 322
    .line 323
    iget v10, v0, LC0/c;->m:F

    .line 324
    .line 325
    iget-object v11, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 326
    .line 327
    invoke-static {v4, v10, v1, v11}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    iput v4, v8, Landroid/graphics/RectF;->top:F

    .line 332
    .line 333
    iget v4, v12, Landroid/graphics/Rect;->right:I

    .line 334
    .line 335
    int-to-float v4, v4

    .line 336
    iget v10, v9, Landroid/graphics/Rect;->right:I

    .line 337
    .line 338
    int-to-float v10, v10

    .line 339
    iget-object v11, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 340
    .line 341
    invoke-static {v4, v10, v1, v11}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    iput v4, v8, Landroid/graphics/RectF;->right:F

    .line 346
    .line 347
    iget v4, v12, Landroid/graphics/Rect;->bottom:I

    .line 348
    .line 349
    int-to-float v4, v4

    .line 350
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 351
    .line 352
    int-to-float v9, v9

    .line 353
    iget-object v10, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 354
    .line 355
    invoke-static {v4, v9, v1, v10}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    iput v4, v8, Landroid/graphics/RectF;->bottom:F

    .line 360
    .line 361
    iget v4, v0, LC0/c;->n:F

    .line 362
    .line 363
    iget v8, v0, LC0/c;->o:F

    .line 364
    .line 365
    iget-object v9, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 366
    .line 367
    invoke-static {v4, v8, v1, v9}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    iput v4, v0, LC0/c;->p:F

    .line 372
    .line 373
    iget v4, v0, LC0/c;->l:F

    .line 374
    .line 375
    iget v8, v0, LC0/c;->m:F

    .line 376
    .line 377
    iget-object v9, v0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 378
    .line 379
    invoke-static {v4, v8, v1, v9}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    iput v4, v0, LC0/c;->q:F

    .line 384
    .line 385
    invoke-virtual {v0, v1}, LC0/c;->l(F)V

    .line 386
    .line 387
    .line 388
    sub-float v4, v3, v1

    .line 389
    .line 390
    sget-object v8, Lo0/a;->b:Lb0/a;

    .line 391
    .line 392
    invoke-static {v6, v3, v4, v8}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    sub-float v4, v3, v4

    .line 397
    .line 398
    iput v4, v0, LC0/c;->a0:F

    .line 399
    .line 400
    sget-object v4, LN/S;->a:Ljava/util/WeakHashMap;

    .line 401
    .line 402
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 403
    .line 404
    .line 405
    invoke-static {v3, v6, v1, v8}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    iput v3, v0, LC0/c;->b0:F

    .line 410
    .line 411
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 412
    .line 413
    .line 414
    iget-object v3, v0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 415
    .line 416
    iget-object v4, v0, LC0/c;->j:Landroid/content/res/ColorStateList;

    .line 417
    .line 418
    if-eq v3, v4, :cond_11

    .line 419
    .line 420
    invoke-virtual {v0, v4}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    iget-object v4, v0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 425
    .line 426
    invoke-virtual {v0, v4}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    invoke-static {v3, v4, v1}, LC0/c;->a(IIF)I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 435
    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_11
    invoke-virtual {v0, v3}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 443
    .line 444
    .line 445
    :goto_7
    iget v3, v0, LC0/c;->V:F

    .line 446
    .line 447
    iget v4, v0, LC0/c;->W:F

    .line 448
    .line 449
    cmpl-float v9, v3, v4

    .line 450
    .line 451
    if-eqz v9, :cond_12

    .line 452
    .line 453
    invoke-static {v4, v3, v1, v8}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 458
    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_12
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 462
    .line 463
    .line 464
    :goto_8
    iget v3, v0, LC0/c;->R:F

    .line 465
    .line 466
    invoke-static {v6, v3, v1}, Lo0/a;->a(FFF)F

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    iput v3, v0, LC0/c;->H:F

    .line 471
    .line 472
    iget v3, v0, LC0/c;->S:F

    .line 473
    .line 474
    invoke-static {v6, v3, v1}, Lo0/a;->a(FFF)F

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    iput v3, v0, LC0/c;->I:F

    .line 479
    .line 480
    iget v3, v0, LC0/c;->T:F

    .line 481
    .line 482
    invoke-static {v6, v3, v1}, Lo0/a;->a(FFF)F

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    iput v3, v0, LC0/c;->J:F

    .line 487
    .line 488
    iget-object v3, v0, LC0/c;->U:Landroid/content/res/ColorStateList;

    .line 489
    .line 490
    invoke-virtual {v0, v3}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    invoke-static {v7, v3, v1}, LC0/c;->a(IIF)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    iput v1, v0, LC0/c;->K:I

    .line 499
    .line 500
    iget v3, v0, LC0/c;->H:F

    .line 501
    .line 502
    iget v4, v0, LC0/c;->I:F

    .line 503
    .line 504
    iget v6, v0, LC0/c;->J:F

    .line 505
    .line 506
    invoke-virtual {v5, v3, v4, v6, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 510
    .line 511
    .line 512
    :cond_13
    return-void
.end method

.method public final i(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LC0/c;->j:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    iput-object p1, p0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    iput-object p1, p0, LC0/c;->j:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, LC0/c;->h(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final j(Landroid/graphics/Typeface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LC0/c;->y:LF0/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, LF0/a;->m:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LC0/c;->t:Landroid/graphics/Typeface;

    .line 9
    .line 10
    if-eq v0, p1, :cond_2

    .line 11
    .line 12
    iput-object p1, p0, LC0/c;->t:Landroid/graphics/Typeface;

    .line 13
    .line 14
    iget-object v0, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1}, LA0/e;->i0(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, LC0/c;->s:Landroid/graphics/Typeface;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, LC0/c;->t:Landroid/graphics/Typeface;

    .line 37
    .line 38
    :cond_1
    iput-object p1, p0, LC0/c;->r:Landroid/graphics/Typeface;

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final k(F)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    cmpg-float v2, p1, v0

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    cmpl-float v2, p1, v1

    .line 11
    .line 12
    if-lez v2, :cond_1

    .line 13
    .line 14
    const/high16 p1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    :cond_1
    :goto_0
    iget v2, p0, LC0/c;->b:F

    .line 17
    .line 18
    cmpl-float v2, p1, v2

    .line 19
    .line 20
    if-eqz v2, :cond_4

    .line 21
    .line 22
    iput p1, p0, LC0/c;->b:F

    .line 23
    .line 24
    iget-object v2, p0, LC0/c;->c:Landroid/graphics/Rect;

    .line 25
    .line 26
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 27
    .line 28
    int-to-float v3, v3

    .line 29
    iget-object v4, p0, LC0/c;->d:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    int-to-float v5, v5

    .line 34
    iget-object v6, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 35
    .line 36
    invoke-static {v3, v5, p1, v6}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget-object v5, p0, LC0/c;->e:Landroid/graphics/RectF;

    .line 41
    .line 42
    iput v3, v5, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget v3, p0, LC0/c;->l:F

    .line 45
    .line 46
    iget v6, p0, LC0/c;->m:F

    .line 47
    .line 48
    iget-object v7, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 49
    .line 50
    invoke-static {v3, v6, p1, v7}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iput v3, v5, Landroid/graphics/RectF;->top:F

    .line 55
    .line 56
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 57
    .line 58
    int-to-float v3, v3

    .line 59
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    int-to-float v6, v6

    .line 62
    iget-object v7, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 63
    .line 64
    invoke-static {v3, v6, p1, v7}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iput v3, v5, Landroid/graphics/RectF;->right:F

    .line 69
    .line 70
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 71
    .line 72
    int-to-float v2, v2

    .line 73
    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    .line 74
    .line 75
    int-to-float v3, v3

    .line 76
    iget-object v4, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 77
    .line 78
    invoke-static {v2, v3, p1, v4}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iput v2, v5, Landroid/graphics/RectF;->bottom:F

    .line 83
    .line 84
    iget v2, p0, LC0/c;->n:F

    .line 85
    .line 86
    iget v3, p0, LC0/c;->o:F

    .line 87
    .line 88
    iget-object v4, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 89
    .line 90
    invoke-static {v2, v3, p1, v4}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    iput v2, p0, LC0/c;->p:F

    .line 95
    .line 96
    iget v2, p0, LC0/c;->l:F

    .line 97
    .line 98
    iget v3, p0, LC0/c;->m:F

    .line 99
    .line 100
    iget-object v4, p0, LC0/c;->P:Landroid/view/animation/LinearInterpolator;

    .line 101
    .line 102
    invoke-static {v2, v3, p1, v4}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    iput v2, p0, LC0/c;->q:F

    .line 107
    .line 108
    invoke-virtual {p0, p1}, LC0/c;->l(F)V

    .line 109
    .line 110
    .line 111
    sub-float v2, v1, p1

    .line 112
    .line 113
    sget-object v3, Lo0/a;->b:Lb0/a;

    .line 114
    .line 115
    invoke-static {v0, v1, v2, v3}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    sub-float v2, v1, v2

    .line 120
    .line 121
    iput v2, p0, LC0/c;->a0:F

    .line 122
    .line 123
    sget-object v2, LN/S;->a:Ljava/util/WeakHashMap;

    .line 124
    .line 125
    iget-object v2, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v0, p1, v3}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    iput v1, p0, LC0/c;->b0:F

    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 140
    .line 141
    iget-object v4, p0, LC0/c;->j:Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    iget-object v5, p0, LC0/c;->N:Landroid/text/TextPaint;

    .line 144
    .line 145
    if-eq v1, v4, :cond_2

    .line 146
    .line 147
    invoke-virtual {p0, v4}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iget-object v4, p0, LC0/c;->k:Landroid/content/res/ColorStateList;

    .line 152
    .line 153
    invoke-virtual {p0, v4}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-static {v1, v4, p1}, LC0/c;->a(IIF)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    invoke-virtual {p0, v1}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 170
    .line 171
    .line 172
    :goto_1
    iget v1, p0, LC0/c;->V:F

    .line 173
    .line 174
    iget v4, p0, LC0/c;->W:F

    .line 175
    .line 176
    cmpl-float v6, v1, v4

    .line 177
    .line 178
    if-eqz v6, :cond_3

    .line 179
    .line 180
    invoke-static {v4, v1, p1, v3}, LC0/c;->f(FFFLandroid/animation/TimeInterpolator;)F

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 189
    .line 190
    .line 191
    :goto_2
    iget v1, p0, LC0/c;->R:F

    .line 192
    .line 193
    invoke-static {v0, v1, p1}, Lo0/a;->a(FFF)F

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    iput v1, p0, LC0/c;->H:F

    .line 198
    .line 199
    iget v1, p0, LC0/c;->S:F

    .line 200
    .line 201
    invoke-static {v0, v1, p1}, Lo0/a;->a(FFF)F

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    iput v1, p0, LC0/c;->I:F

    .line 206
    .line 207
    iget v1, p0, LC0/c;->T:F

    .line 208
    .line 209
    invoke-static {v0, v1, p1}, Lo0/a;->a(FFF)F

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    iput v0, p0, LC0/c;->J:F

    .line 214
    .line 215
    iget-object v0, p0, LC0/c;->U:Landroid/content/res/ColorStateList;

    .line 216
    .line 217
    invoke-virtual {p0, v0}, LC0/c;->e(Landroid/content/res/ColorStateList;)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-static {v1, v0, p1}, LC0/c;->a(IIF)I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    iput p1, p0, LC0/c;->K:I

    .line 227
    .line 228
    iget v0, p0, LC0/c;->H:F

    .line 229
    .line 230
    iget v1, p0, LC0/c;->I:F

    .line 231
    .line 232
    iget v3, p0, LC0/c;->J:F

    .line 233
    .line 234
    invoke-virtual {v5, v0, v1, v3, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 238
    .line 239
    .line 240
    :cond_4
    return-void
.end method

.method public final l(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LC0/c;->c(FZ)V

    .line 3
    .line 4
    .line 5
    sget-object p1, LN/S;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object p1, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final m(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, LC0/c;->j(Landroid/graphics/Typeface;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LC0/c;->w:Landroid/graphics/Typeface;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v1, p1, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, LC0/c;->w:Landroid/graphics/Typeface;

    .line 11
    .line 12
    iget-object v1, p0, LC0/c;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1, p1}, LA0/e;->i0(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LC0/c;->v:Landroid/graphics/Typeface;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, LC0/c;->w:Landroid/graphics/Typeface;

    .line 35
    .line 36
    :cond_0
    iput-object p1, p0, LC0/c;->u:Landroid/graphics/Typeface;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    if-nez v0, :cond_3

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    return-void

    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0, v2}, LC0/c;->h(Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

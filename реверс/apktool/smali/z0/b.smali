.class public final Lz0/b;
.super LK/j;
.source "SourceFile"


# instance fields
.field public final c:LI0/h;

.field public final d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 14

    .line 1
    const v0, 0x7f0302e0

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, LA0/e;->o0(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 14
    .line 15
    :goto_0
    const/4 v3, 0x0

    .line 16
    const v4, 0x7f03002b

    .line 17
    .line 18
    .line 19
    const v5, 0x7f10012f

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v3, v4, v5}, LO0/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance v7, Lj/c;

    .line 30
    .line 31
    invoke-direct {v7, v6, v1}, Lj/c;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    move-object v6, v7

    .line 35
    :goto_1
    invoke-static {p1, v0}, LA0/e;->o0(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 44
    .line 45
    :goto_2
    invoke-direct {p0, v6, p1}, LK/j;-><init>(Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LK/j;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Le/d;

    .line 51
    .line 52
    iget-object v6, p1, Le/d;->a:Landroid/view/ContextThemeWrapper;

    .line 53
    .line 54
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object v8, Ln0/a;->j:[I

    .line 59
    .line 60
    new-array v11, v2, [I

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const v9, 0x7f03002b

    .line 64
    .line 65
    .line 66
    const v10, 0x7f10012f

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7, v9, v10}, LC0/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 70
    .line 71
    .line 72
    invoke-static/range {v6 .. v11}, LC0/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const v7, 0x7f06024e

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const/4 v7, 0x2

    .line 91
    invoke-virtual {v0, v7, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const v9, 0x7f06024f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    const/4 v9, 0x3

    .line 107
    invoke-virtual {v0, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    const v10, 0x7f06024d

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    const/4 v10, 0x1

    .line 123
    invoke-virtual {v0, v10, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    const v12, 0x7f06024c

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    invoke-virtual {v0, v2, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-ne v0, v10, :cond_3

    .line 158
    .line 159
    move v13, v9

    .line 160
    move v9, v1

    .line 161
    move v1, v13

    .line 162
    :cond_3
    new-instance v0, Landroid/graphics/Rect;

    .line 163
    .line 164
    invoke-direct {v0, v1, v7, v9, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 165
    .line 166
    .line 167
    iput-object v0, p0, Lz0/b;->d:Landroid/graphics/Rect;

    .line 168
    .line 169
    const-class v0, Lz0/b;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const v1, 0x7f030121

    .line 176
    .line 177
    .line 178
    invoke-static {v6, v1, v0}, LT/m;->u(Landroid/content/Context;ILjava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {v6, v3, v8, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const/4 v2, 0x4

    .line 187
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 192
    .line 193
    .line 194
    new-instance v1, LI0/h;

    .line 195
    .line 196
    invoke-direct {v1, v6, v3, v4, v5}, LI0/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v6}, LI0/h;->j(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v1, v0}, LI0/h;->l(Landroid/content/res/ColorStateList;)V

    .line 207
    .line 208
    .line 209
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 210
    .line 211
    const/16 v2, 0x1c

    .line 212
    .line 213
    if-lt v0, v2, :cond_4

    .line 214
    .line 215
    new-instance v0, Landroid/util/TypedValue;

    .line 216
    .line 217
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 218
    .line 219
    .line 220
    const v2, 0x1010571

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v2, v0, v10}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, LK/j;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, Le/d;

    .line 229
    .line 230
    iget-object p1, p1, Le/d;->a:Landroid/view/ContextThemeWrapper;

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    iget v0, v0, Landroid/util/TypedValue;->type:I

    .line 245
    .line 246
    const/4 v2, 0x5

    .line 247
    if-ne v0, v2, :cond_4

    .line 248
    .line 249
    const/4 v0, 0x0

    .line 250
    cmpl-float v0, p1, v0

    .line 251
    .line 252
    if-ltz v0, :cond_4

    .line 253
    .line 254
    iget-object v0, v1, LI0/h;->a:LI0/g;

    .line 255
    .line 256
    iget-object v0, v0, LI0/g;->a:LI0/m;

    .line 257
    .line 258
    invoke-virtual {v0}, LI0/m;->e()LI0/l;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0, p1}, LI0/l;->c(F)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, LI0/l;->a()LI0/m;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-virtual {v1, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 270
    .line 271
    .line 272
    :cond_4
    iput-object v1, p0, Lz0/b;->c:LI0/h;

    .line 273
    .line 274
    return-void
.end method


# virtual methods
.method public final a()Le/h;
    .locals 10

    .line 1
    invoke-super {p0}, LK/j;->a()Le/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, p0, Lz0/b;->c:LI0/h;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sget-object v3, LN/S;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-static {v2}, LN/G;->i(Landroid/view/View;)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v4, v3}, LI0/h;->k(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 27
    .line 28
    iget-object v9, p0, Lz0/b;->d:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget v5, v9, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget v6, v9, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    iget v7, v9, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iget v8, v9, Landroid/graphics/Rect;->bottom:I

    .line 37
    .line 38
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lz0/a;

    .line 45
    .line 46
    invoke-direct {v1, v0, v9}, Lz0/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

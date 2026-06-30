.class public final Lk0/f;
.super Lk0/m;
.source "SourceFile"


# static fields
.field public static final A:[Ljava/lang/String;

.field public static final B:Lk0/b;

.field public static final C:Lk0/b;

.field public static final D:Lk0/b;

.field public static final E:Lk0/b;

.field public static final F:Lk0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:clip"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:parent"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:windowX"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:windowY"

    .line 10
    .line 11
    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lk0/f;->A:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lk0/b;

    .line 18
    .line 19
    const-class v1, Landroid/graphics/PointF;

    .line 20
    .line 21
    const-string v2, "topLeft"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v1, v2, v3}, Lk0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lk0/f;->B:Lk0/b;

    .line 28
    .line 29
    new-instance v0, Lk0/b;

    .line 30
    .line 31
    const-string v3, "bottomRight"

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-direct {v0, v1, v3, v4}, Lk0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lk0/f;->C:Lk0/b;

    .line 38
    .line 39
    new-instance v0, Lk0/b;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-direct {v0, v1, v3, v4}, Lk0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lk0/f;->D:Lk0/b;

    .line 46
    .line 47
    new-instance v0, Lk0/b;

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-direct {v0, v1, v2, v3}, Lk0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lk0/f;->E:Lk0/b;

    .line 54
    .line 55
    new-instance v0, Lk0/b;

    .line 56
    .line 57
    const-string v2, "position"

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    invoke-direct {v0, v1, v2, v3}, Lk0/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lk0/f;->F:Lk0/b;

    .line 64
    .line 65
    return-void
.end method

.method public static I(Lk0/u;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/u;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object v1, p0, Lk0/u;->a:Ljava/util/HashMap;

    .line 24
    .line 25
    new-instance v2, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 44
    .line 45
    .line 46
    const-string v0, "android:changeBounds:bounds"

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lk0/u;->b:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v0, "android:changeBounds:parent"

    .line 58
    .line 59
    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final d(Lk0/u;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk0/f;->I(Lk0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lk0/u;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lk0/f;->I(Lk0/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/widget/FrameLayout;Lk0/u;Lk0/u;)Landroid/animation/Animator;
    .locals 18

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    :cond_0
    :goto_0
    move-object/from16 v1, p0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_1
    iget-object v1, v1, Lk0/u;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    iget-object v6, v2, Lk0/u;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    const-string v7, "android:changeBounds:parent"

    .line 18
    .line 19
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    check-cast v8, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    check-cast v7, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v8, :cond_0

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string v7, "android:changeBounds:bounds"

    .line 37
    .line 38
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    check-cast v8, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroid/graphics/Rect;

    .line 49
    .line 50
    iget v9, v8, Landroid/graphics/Rect;->left:I

    .line 51
    .line 52
    iget v10, v7, Landroid/graphics/Rect;->left:I

    .line 53
    .line 54
    iget v11, v8, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    iget v12, v7, Landroid/graphics/Rect;->top:I

    .line 57
    .line 58
    iget v13, v8, Landroid/graphics/Rect;->right:I

    .line 59
    .line 60
    iget v14, v7, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 65
    .line 66
    sub-int v15, v13, v9

    .line 67
    .line 68
    const/16 p1, 0x0

    .line 69
    .line 70
    sub-int v4, v8, v11

    .line 71
    .line 72
    const/16 v16, 0x1

    .line 73
    .line 74
    sub-int v5, v14, v10

    .line 75
    .line 76
    sub-int v3, v7, v12

    .line 77
    .line 78
    const-string v0, "android:changeBounds:clip"

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/graphics/Rect;

    .line 85
    .line 86
    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Landroid/graphics/Rect;

    .line 91
    .line 92
    if-eqz v15, :cond_3

    .line 93
    .line 94
    if-nez v4, :cond_4

    .line 95
    .line 96
    :cond_3
    if-eqz v5, :cond_8

    .line 97
    .line 98
    if-eqz v3, :cond_8

    .line 99
    .line 100
    :cond_4
    if-ne v9, v10, :cond_6

    .line 101
    .line 102
    if-eq v11, v12, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    const/4 v6, 0x0

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    :goto_1
    const/4 v6, 0x1

    .line 108
    :goto_2
    if-ne v13, v14, :cond_7

    .line 109
    .line 110
    if-eq v8, v7, :cond_9

    .line 111
    .line 112
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    const/4 v6, 0x0

    .line 116
    :cond_9
    :goto_3
    if-eqz v1, :cond_a

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v17

    .line 122
    if-eqz v17, :cond_b

    .line 123
    .line 124
    :cond_a
    if-nez v1, :cond_c

    .line 125
    .line 126
    if-eqz v0, :cond_c

    .line 127
    .line 128
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    :cond_c
    if-lez v6, :cond_0

    .line 131
    .line 132
    iget-object v0, v2, Lk0/u;->b:Landroid/view/View;

    .line 133
    .line 134
    invoke-static {v0, v9, v11, v13, v8}, Lk0/w;->a(Landroid/view/View;IIII)V

    .line 135
    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    if-ne v6, v1, :cond_e

    .line 139
    .line 140
    if-ne v15, v5, :cond_d

    .line 141
    .line 142
    if-ne v4, v3, :cond_d

    .line 143
    .line 144
    move-object/from16 v1, p0

    .line 145
    .line 146
    iget-object v2, v1, Lk0/m;->v:LI0/e;

    .line 147
    .line 148
    int-to-float v3, v9

    .line 149
    int-to-float v4, v11

    .line 150
    int-to-float v5, v10

    .line 151
    int-to-float v6, v12

    .line 152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v3, v4, v5, v6}, LI0/e;->e(FFFF)Landroid/graphics/Path;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    sget-object v3, Lk0/f;->F:Lk0/b;

    .line 160
    .line 161
    invoke-static {v0, v3, v2}, Lk0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    goto/16 :goto_5

    .line 166
    .line 167
    :cond_d
    move-object/from16 v1, p0

    .line 168
    .line 169
    new-instance v2, Lk0/e;

    .line 170
    .line 171
    invoke-direct {v2, v0}, Lk0/e;-><init>(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    iget-object v3, v1, Lk0/m;->v:LI0/e;

    .line 175
    .line 176
    int-to-float v4, v9

    .line 177
    int-to-float v5, v11

    .line 178
    int-to-float v6, v10

    .line 179
    int-to-float v9, v12

    .line 180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v5, v6, v9}, LI0/e;->e(FFFF)Landroid/graphics/Path;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    sget-object v4, Lk0/f;->B:Lk0/b;

    .line 188
    .line 189
    invoke-static {v2, v4, v3}, Lk0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget-object v4, v1, Lk0/m;->v:LI0/e;

    .line 194
    .line 195
    int-to-float v5, v13

    .line 196
    int-to-float v6, v8

    .line 197
    int-to-float v8, v14

    .line 198
    int-to-float v7, v7

    .line 199
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {v5, v6, v8, v7}, LI0/e;->e(FFFF)Landroid/graphics/Path;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    sget-object v5, Lk0/f;->C:Lk0/b;

    .line 207
    .line 208
    invoke-static {v2, v5, v4}, Lk0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    new-instance v5, Landroid/animation/AnimatorSet;

    .line 213
    .line 214
    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 215
    .line 216
    .line 217
    const/4 v6, 0x2

    .line 218
    new-array v6, v6, [Landroid/animation/Animator;

    .line 219
    .line 220
    aput-object v3, v6, p1

    .line 221
    .line 222
    aput-object v4, v6, v16

    .line 223
    .line 224
    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 225
    .line 226
    .line 227
    new-instance v3, Lk0/c;

    .line 228
    .line 229
    invoke-direct {v3, v2}, Lk0/c;-><init>(Lk0/e;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 233
    .line 234
    .line 235
    move-object v2, v5

    .line 236
    goto :goto_5

    .line 237
    :cond_e
    move-object/from16 v1, p0

    .line 238
    .line 239
    if-ne v9, v10, :cond_10

    .line 240
    .line 241
    if-eq v11, v12, :cond_f

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_f
    iget-object v2, v1, Lk0/m;->v:LI0/e;

    .line 245
    .line 246
    int-to-float v3, v13

    .line 247
    int-to-float v4, v8

    .line 248
    int-to-float v5, v14

    .line 249
    int-to-float v6, v7

    .line 250
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v3, v4, v5, v6}, LI0/e;->e(FFFF)Landroid/graphics/Path;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    sget-object v3, Lk0/f;->D:Lk0/b;

    .line 258
    .line 259
    invoke-static {v0, v3, v2}, Lk0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    goto :goto_5

    .line 264
    :cond_10
    :goto_4
    iget-object v2, v1, Lk0/m;->v:LI0/e;

    .line 265
    .line 266
    int-to-float v3, v9

    .line 267
    int-to-float v4, v11

    .line 268
    int-to-float v5, v10

    .line 269
    int-to-float v6, v12

    .line 270
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {v3, v4, v5, v6}, LI0/e;->e(FFFF)Landroid/graphics/Path;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    sget-object v3, Lk0/f;->E:Lk0/b;

    .line 278
    .line 279
    invoke-static {v0, v3, v2}, Lk0/i;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    instance-of v3, v3, Landroid/view/ViewGroup;

    .line 288
    .line 289
    if-eqz v3, :cond_11

    .line 290
    .line 291
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Landroid/view/ViewGroup;

    .line 296
    .line 297
    const/4 v3, 0x1

    .line 298
    invoke-static {v0, v3}, LT/m;->k0(Landroid/view/ViewGroup;Z)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Lk0/m;->o()Lk0/m;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    new-instance v4, Lk0/d;

    .line 306
    .line 307
    invoke-direct {v4, v0}, Lk0/d;-><init>(Landroid/view/ViewGroup;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v4}, Lk0/m;->a(Lk0/k;)V

    .line 311
    .line 312
    .line 313
    :cond_11
    return-object v2

    .line 314
    :goto_6
    const/4 v0, 0x0

    .line 315
    return-object v0
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lk0/f;->A:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

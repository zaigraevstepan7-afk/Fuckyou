.class public final LI0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[LI0/w;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:LI0/w;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [LI0/w;

    .line 6
    .line 7
    iput-object v1, p0, LI0/o;->a:[LI0/w;

    .line 8
    .line 9
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object v1, p0, LI0/o;->b:[Landroid/graphics/Matrix;

    .line 12
    .line 13
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 14
    .line 15
    iput-object v1, p0, LI0/o;->c:[Landroid/graphics/Matrix;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/PointF;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, LI0/o;->d:Landroid/graphics/PointF;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LI0/o;->e:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, LI0/o;->f:Landroid/graphics/Path;

    .line 37
    .line 38
    new-instance v1, LI0/w;

    .line 39
    .line 40
    invoke-direct {v1}, LI0/w;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, LI0/o;->g:LI0/w;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v2, v1, [F

    .line 47
    .line 48
    iput-object v2, p0, LI0/o;->h:[F

    .line 49
    .line 50
    new-array v1, v1, [F

    .line 51
    .line 52
    iput-object v1, p0, LI0/o;->i:[F

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, LI0/o;->j:Landroid/graphics/Path;

    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, LI0/o;->k:Landroid/graphics/Path;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, LI0/o;->l:Z

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_0
    if-ge v1, v0, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, LI0/o;->a:[LI0/w;

    .line 75
    .line 76
    new-instance v3, LI0/w;

    .line 77
    .line 78
    invoke-direct {v3}, LI0/w;-><init>()V

    .line 79
    .line 80
    .line 81
    aput-object v3, v2, v1

    .line 82
    .line 83
    iget-object v2, p0, LI0/o;->b:[Landroid/graphics/Matrix;

    .line 84
    .line 85
    new-instance v3, Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 88
    .line 89
    .line 90
    aput-object v3, v2, v1

    .line 91
    .line 92
    iget-object v2, p0, LI0/o;->c:[Landroid/graphics/Matrix;

    .line 93
    .line 94
    new-instance v3, Landroid/graphics/Matrix;

    .line 95
    .line 96
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v3, v2, v1

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(LI0/m;FLandroid/graphics/RectF;LA/b;Landroid/graphics/Path;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, LI0/o;->e:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 19
    .line 20
    .line 21
    iget-object v7, v0, LI0/o;->f:Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 24
    .line 25
    .line 26
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 27
    .line 28
    invoke-virtual {v7, v3, v8}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    :goto_0
    iget-object v10, v0, LI0/o;->c:[Landroid/graphics/Matrix;

    .line 33
    .line 34
    iget-object v11, v0, LI0/o;->b:[Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget-object v12, v0, LI0/o;->a:[LI0/w;

    .line 37
    .line 38
    const/4 v13, 0x1

    .line 39
    const/4 v14, 0x4

    .line 40
    const/4 v15, 0x2

    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    iget-object v8, v0, LI0/o;->h:[F

    .line 44
    .line 45
    if-ge v9, v14, :cond_9

    .line 46
    .line 47
    if-eq v9, v13, :cond_2

    .line 48
    .line 49
    if-eq v9, v15, :cond_1

    .line 50
    .line 51
    const/4 v14, 0x3

    .line 52
    if-eq v9, v14, :cond_0

    .line 53
    .line 54
    iget-object v14, v1, LI0/m;->f:LI0/c;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iget-object v14, v1, LI0/m;->e:LI0/c;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v14, v1, LI0/m;->h:LI0/c;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-object v14, v1, LI0/m;->g:LI0/c;

    .line 64
    .line 65
    :goto_1
    if-eq v9, v13, :cond_5

    .line 66
    .line 67
    if-eq v9, v15, :cond_4

    .line 68
    .line 69
    const/4 v15, 0x3

    .line 70
    if-eq v9, v15, :cond_3

    .line 71
    .line 72
    iget-object v15, v1, LI0/m;->b:LA0/e;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v15, v1, LI0/m;->a:LA0/e;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget-object v15, v1, LI0/m;->d:LA0/e;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    iget-object v15, v1, LI0/m;->c:LA0/e;

    .line 82
    .line 83
    :goto_2
    aget-object v13, v12, v9

    .line 84
    .line 85
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {v14, v3}, LI0/c;->a(Landroid/graphics/RectF;)F

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    invoke-virtual {v15, v13, v2, v14}, LA0/e;->M(LI0/w;FF)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v13, v9, 0x1

    .line 96
    .line 97
    rem-int/lit8 v14, v13, 0x4

    .line 98
    .line 99
    mul-int/lit8 v14, v14, 0x5a

    .line 100
    .line 101
    int-to-float v14, v14

    .line 102
    aget-object v15, v11, v9

    .line 103
    .line 104
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 105
    .line 106
    .line 107
    iget-object v15, v0, LI0/o;->d:Landroid/graphics/PointF;

    .line 108
    .line 109
    move-object/from16 v19, v10

    .line 110
    .line 111
    const/4 v10, 0x1

    .line 112
    if-eq v9, v10, :cond_8

    .line 113
    .line 114
    const/4 v10, 0x2

    .line 115
    if-eq v9, v10, :cond_7

    .line 116
    .line 117
    const/4 v10, 0x3

    .line 118
    if-eq v9, v10, :cond_6

    .line 119
    .line 120
    iget v10, v3, Landroid/graphics/RectF;->right:F

    .line 121
    .line 122
    move/from16 v17, v9

    .line 123
    .line 124
    iget v9, v3, Landroid/graphics/RectF;->top:F

    .line 125
    .line 126
    invoke-virtual {v15, v10, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move/from16 v17, v9

    .line 131
    .line 132
    iget v9, v3, Landroid/graphics/RectF;->left:F

    .line 133
    .line 134
    iget v10, v3, Landroid/graphics/RectF;->top:F

    .line 135
    .line 136
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    move/from16 v17, v9

    .line 141
    .line 142
    iget v9, v3, Landroid/graphics/RectF;->left:F

    .line 143
    .line 144
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    .line 145
    .line 146
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    move/from16 v17, v9

    .line 151
    .line 152
    iget v9, v3, Landroid/graphics/RectF;->right:F

    .line 153
    .line 154
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    .line 155
    .line 156
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 157
    .line 158
    .line 159
    :goto_3
    aget-object v9, v11, v17

    .line 160
    .line 161
    iget v10, v15, Landroid/graphics/PointF;->x:F

    .line 162
    .line 163
    iget v15, v15, Landroid/graphics/PointF;->y:F

    .line 164
    .line 165
    invoke-virtual {v9, v10, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 166
    .line 167
    .line 168
    aget-object v9, v11, v17

    .line 169
    .line 170
    invoke-virtual {v9, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 171
    .line 172
    .line 173
    aget-object v9, v12, v17

    .line 174
    .line 175
    iget v10, v9, LI0/w;->c:F

    .line 176
    .line 177
    aput v10, v8, v16

    .line 178
    .line 179
    iget v9, v9, LI0/w;->d:F

    .line 180
    .line 181
    const/16 v18, 0x1

    .line 182
    .line 183
    aput v9, v8, v18

    .line 184
    .line 185
    aget-object v9, v11, v17

    .line 186
    .line 187
    invoke-virtual {v9, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 188
    .line 189
    .line 190
    aget-object v9, v19, v17

    .line 191
    .line 192
    invoke-virtual {v9}, Landroid/graphics/Matrix;->reset()V

    .line 193
    .line 194
    .line 195
    aget-object v9, v19, v17

    .line 196
    .line 197
    aget v10, v8, v16

    .line 198
    .line 199
    aget v8, v8, v18

    .line 200
    .line 201
    invoke-virtual {v9, v10, v8}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 202
    .line 203
    .line 204
    aget-object v8, v19, v17

    .line 205
    .line 206
    invoke-virtual {v8, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 207
    .line 208
    .line 209
    move v9, v13

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_9
    move-object/from16 v19, v10

    .line 213
    .line 214
    const/4 v9, 0x0

    .line 215
    :goto_4
    if-ge v9, v14, :cond_13

    .line 216
    .line 217
    aget-object v10, v12, v9

    .line 218
    .line 219
    iget v13, v10, LI0/w;->a:F

    .line 220
    .line 221
    aput v13, v8, v16

    .line 222
    .line 223
    iget v10, v10, LI0/w;->b:F

    .line 224
    .line 225
    const/16 v18, 0x1

    .line 226
    .line 227
    aput v10, v8, v18

    .line 228
    .line 229
    aget-object v10, v11, v9

    .line 230
    .line 231
    invoke-virtual {v10, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 232
    .line 233
    .line 234
    if-nez v9, :cond_a

    .line 235
    .line 236
    aget v10, v8, v16

    .line 237
    .line 238
    aget v13, v8, v18

    .line 239
    .line 240
    invoke-virtual {v5, v10, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    aget v10, v8, v16

    .line 245
    .line 246
    aget v13, v8, v18

    .line 247
    .line 248
    invoke-virtual {v5, v10, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 249
    .line 250
    .line 251
    :goto_5
    aget-object v10, v12, v9

    .line 252
    .line 253
    aget-object v13, v11, v9

    .line 254
    .line 255
    invoke-virtual {v10, v13, v5}, LI0/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 256
    .line 257
    .line 258
    if-eqz v4, :cond_b

    .line 259
    .line 260
    aget-object v10, v12, v9

    .line 261
    .line 262
    aget-object v13, v11, v9

    .line 263
    .line 264
    iget-object v15, v4, LA/b;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v15, LI0/h;

    .line 267
    .line 268
    iget-object v14, v15, LI0/h;->d:Ljava/util/BitSet;

    .line 269
    .line 270
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    const/4 v3, 0x0

    .line 274
    invoke-virtual {v14, v9, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 275
    .line 276
    .line 277
    iget v3, v10, LI0/w;->f:F

    .line 278
    .line 279
    invoke-virtual {v10, v3}, LI0/w;->a(F)V

    .line 280
    .line 281
    .line 282
    new-instance v3, Landroid/graphics/Matrix;

    .line 283
    .line 284
    invoke-direct {v3, v13}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 285
    .line 286
    .line 287
    new-instance v13, Ljava/util/ArrayList;

    .line 288
    .line 289
    iget-object v10, v10, LI0/w;->h:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 292
    .line 293
    .line 294
    new-instance v10, LI0/p;

    .line 295
    .line 296
    invoke-direct {v10, v13, v3}, LI0/p;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 297
    .line 298
    .line 299
    iget-object v3, v15, LI0/h;->b:[LI0/v;

    .line 300
    .line 301
    aput-object v10, v3, v9

    .line 302
    .line 303
    :cond_b
    add-int/lit8 v3, v9, 0x1

    .line 304
    .line 305
    rem-int/lit8 v10, v3, 0x4

    .line 306
    .line 307
    aget-object v13, v12, v9

    .line 308
    .line 309
    iget v14, v13, LI0/w;->c:F

    .line 310
    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    aput v14, v8, v16

    .line 314
    .line 315
    iget v13, v13, LI0/w;->d:F

    .line 316
    .line 317
    const/16 v18, 0x1

    .line 318
    .line 319
    aput v13, v8, v18

    .line 320
    .line 321
    aget-object v13, v11, v9

    .line 322
    .line 323
    invoke-virtual {v13, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 324
    .line 325
    .line 326
    aget-object v13, v12, v10

    .line 327
    .line 328
    iget v14, v13, LI0/w;->a:F

    .line 329
    .line 330
    iget-object v15, v0, LI0/o;->i:[F

    .line 331
    .line 332
    const/16 v16, 0x0

    .line 333
    .line 334
    aput v14, v15, v16

    .line 335
    .line 336
    iget v13, v13, LI0/w;->b:F

    .line 337
    .line 338
    const/16 v18, 0x1

    .line 339
    .line 340
    aput v13, v15, v18

    .line 341
    .line 342
    aget-object v13, v11, v10

    .line 343
    .line 344
    invoke-virtual {v13, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 345
    .line 346
    .line 347
    aget v13, v8, v16

    .line 348
    .line 349
    aget v14, v15, v16

    .line 350
    .line 351
    sub-float/2addr v13, v14

    .line 352
    float-to-double v13, v13

    .line 353
    aget v20, v8, v18

    .line 354
    .line 355
    aget v15, v15, v18

    .line 356
    .line 357
    sub-float v15, v20, v15

    .line 358
    .line 359
    move-object/from16 v21, v11

    .line 360
    .line 361
    move-object/from16 v20, v12

    .line 362
    .line 363
    float-to-double v11, v15

    .line 364
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    .line 365
    .line 366
    .line 367
    move-result-wide v11

    .line 368
    double-to-float v11, v11

    .line 369
    const v12, 0x3a83126f    # 0.001f

    .line 370
    .line 371
    .line 372
    sub-float/2addr v11, v12

    .line 373
    const/4 v12, 0x0

    .line 374
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    aget-object v13, v20, v9

    .line 379
    .line 380
    iget v14, v13, LI0/w;->c:F

    .line 381
    .line 382
    const/16 v16, 0x0

    .line 383
    .line 384
    aput v14, v8, v16

    .line 385
    .line 386
    iget v13, v13, LI0/w;->d:F

    .line 387
    .line 388
    const/4 v14, 0x1

    .line 389
    aput v13, v8, v14

    .line 390
    .line 391
    aget-object v13, v21, v9

    .line 392
    .line 393
    invoke-virtual {v13, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 394
    .line 395
    .line 396
    if-eq v9, v14, :cond_c

    .line 397
    .line 398
    const/4 v15, 0x3

    .line 399
    if-eq v9, v15, :cond_c

    .line 400
    .line 401
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    aget v15, v8, v14

    .line 406
    .line 407
    sub-float/2addr v13, v15

    .line 408
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 409
    .line 410
    .line 411
    move-result v13

    .line 412
    goto :goto_6

    .line 413
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    const/16 v16, 0x0

    .line 418
    .line 419
    aget v14, v8, v16

    .line 420
    .line 421
    sub-float/2addr v13, v14

    .line 422
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 423
    .line 424
    .line 425
    move-result v13

    .line 426
    :goto_6
    const/high16 v14, 0x43870000    # 270.0f

    .line 427
    .line 428
    iget-object v15, v0, LI0/o;->g:LI0/w;

    .line 429
    .line 430
    invoke-virtual {v15, v12, v12, v14, v12}, LI0/w;->d(FFFF)V

    .line 431
    .line 432
    .line 433
    const/4 v14, 0x1

    .line 434
    if-eq v9, v14, :cond_f

    .line 435
    .line 436
    const/4 v12, 0x2

    .line 437
    if-eq v9, v12, :cond_e

    .line 438
    .line 439
    const/4 v14, 0x3

    .line 440
    if-eq v9, v14, :cond_d

    .line 441
    .line 442
    iget-object v12, v1, LI0/m;->j:LI0/e;

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_d
    iget-object v12, v1, LI0/m;->i:LI0/e;

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_e
    const/4 v14, 0x3

    .line 449
    iget-object v12, v1, LI0/m;->l:LI0/e;

    .line 450
    .line 451
    goto :goto_7

    .line 452
    :cond_f
    const/4 v14, 0x3

    .line 453
    iget-object v12, v1, LI0/m;->k:LI0/e;

    .line 454
    .line 455
    :goto_7
    invoke-virtual {v12, v11, v13, v2, v15}, LI0/e;->d(FFFLI0/w;)V

    .line 456
    .line 457
    .line 458
    iget-object v11, v0, LI0/o;->j:Landroid/graphics/Path;

    .line 459
    .line 460
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 461
    .line 462
    .line 463
    aget-object v13, v19, v9

    .line 464
    .line 465
    invoke-virtual {v15, v13, v11}, LI0/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 466
    .line 467
    .line 468
    iget-boolean v13, v0, LI0/o;->l:Z

    .line 469
    .line 470
    if-eqz v13, :cond_10

    .line 471
    .line 472
    invoke-virtual {v12}, LI0/e;->c()Z

    .line 473
    .line 474
    .line 475
    move-result v12

    .line 476
    if-nez v12, :cond_11

    .line 477
    .line 478
    invoke-virtual {v0, v11, v9}, LI0/o;->b(Landroid/graphics/Path;I)Z

    .line 479
    .line 480
    .line 481
    move-result v12

    .line 482
    if-nez v12, :cond_11

    .line 483
    .line 484
    invoke-virtual {v0, v11, v10}, LI0/o;->b(Landroid/graphics/Path;I)Z

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    if-eqz v10, :cond_10

    .line 489
    .line 490
    goto :goto_8

    .line 491
    :cond_10
    const/16 v18, 0x1

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_11
    :goto_8
    sget-object v10, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 495
    .line 496
    invoke-virtual {v11, v11, v7, v10}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 497
    .line 498
    .line 499
    iget v10, v15, LI0/w;->a:F

    .line 500
    .line 501
    const/16 v16, 0x0

    .line 502
    .line 503
    aput v10, v8, v16

    .line 504
    .line 505
    iget v10, v15, LI0/w;->b:F

    .line 506
    .line 507
    const/16 v18, 0x1

    .line 508
    .line 509
    aput v10, v8, v18

    .line 510
    .line 511
    aget-object v10, v19, v9

    .line 512
    .line 513
    invoke-virtual {v10, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 514
    .line 515
    .line 516
    aget v10, v8, v16

    .line 517
    .line 518
    aget v11, v8, v18

    .line 519
    .line 520
    invoke-virtual {v6, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 521
    .line 522
    .line 523
    aget-object v10, v19, v9

    .line 524
    .line 525
    invoke-virtual {v15, v10, v6}, LI0/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 526
    .line 527
    .line 528
    goto :goto_a

    .line 529
    :goto_9
    aget-object v10, v19, v9

    .line 530
    .line 531
    invoke-virtual {v15, v10, v5}, LI0/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 532
    .line 533
    .line 534
    :goto_a
    if-eqz v4, :cond_12

    .line 535
    .line 536
    aget-object v10, v19, v9

    .line 537
    .line 538
    iget-object v11, v4, LA/b;->b:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v11, LI0/h;

    .line 541
    .line 542
    iget-object v12, v11, LI0/h;->d:Ljava/util/BitSet;

    .line 543
    .line 544
    add-int/lit8 v13, v9, 0x4

    .line 545
    .line 546
    const/4 v14, 0x0

    .line 547
    invoke-virtual {v12, v13, v14}, Ljava/util/BitSet;->set(IZ)V

    .line 548
    .line 549
    .line 550
    iget v12, v15, LI0/w;->f:F

    .line 551
    .line 552
    invoke-virtual {v15, v12}, LI0/w;->a(F)V

    .line 553
    .line 554
    .line 555
    new-instance v12, Landroid/graphics/Matrix;

    .line 556
    .line 557
    invoke-direct {v12, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 558
    .line 559
    .line 560
    new-instance v10, Ljava/util/ArrayList;

    .line 561
    .line 562
    iget-object v13, v15, LI0/w;->h:Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 565
    .line 566
    .line 567
    new-instance v13, LI0/p;

    .line 568
    .line 569
    invoke-direct {v13, v10, v12}, LI0/p;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 570
    .line 571
    .line 572
    iget-object v10, v11, LI0/h;->c:[LI0/v;

    .line 573
    .line 574
    aput-object v13, v10, v9

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_12
    const/4 v14, 0x0

    .line 578
    :goto_b
    move v9, v3

    .line 579
    move-object/from16 v12, v20

    .line 580
    .line 581
    move-object/from16 v11, v21

    .line 582
    .line 583
    const/4 v14, 0x4

    .line 584
    const/16 v16, 0x0

    .line 585
    .line 586
    move-object/from16 v3, p3

    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :cond_13
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6}, Landroid/graphics/Path;->isEmpty()Z

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    if-nez v1, :cond_14

    .line 601
    .line 602
    sget-object v1, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 603
    .line 604
    invoke-virtual {v5, v6, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 605
    .line 606
    .line 607
    :cond_14
    return-void
.end method

.method public final b(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LI0/o;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LI0/o;->a:[LI0/w;

    .line 7
    .line 8
    aget-object v1, v1, p2

    .line 9
    .line 10
    iget-object v2, p0, LI0/o;->b:[Landroid/graphics/Matrix;

    .line 11
    .line 12
    aget-object p2, v2, p2

    .line 13
    .line 14
    invoke-virtual {v1, p2, v0}, LI0/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float p1, p1, v0

    .line 50
    .line 51
    if-lez p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    cmpl-float p1, p1, v0

    .line 58
    .line 59
    if-lez p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_1
    :goto_0
    return v1
.end method

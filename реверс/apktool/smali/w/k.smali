.class public final Lw/k;
.super Lw/o;
.source "SourceFile"


# static fields
.field public static final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lw/k;->k:[I

    .line 5
    .line 6
    return-void
.end method

.method public static m([IIIIIFI)V
    .locals 2

    .line 1
    sub-int/2addr p2, p1

    .line 2
    sub-int/2addr p4, p3

    .line 3
    const/4 p1, -0x1

    .line 4
    const/4 p3, 0x0

    .line 5
    const/high16 v0, 0x3f000000    # 0.5f

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p6, p1, :cond_2

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    .line 12
    if-eq p6, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    int-to-float p1, p2

    .line 16
    mul-float p1, p1, p5

    .line 17
    .line 18
    add-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    aput p2, p0, p3

    .line 21
    .line 22
    aput p1, p0, v1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    int-to-float p1, p4

    .line 26
    mul-float p1, p1, p5

    .line 27
    .line 28
    add-float/2addr p1, v0

    .line 29
    float-to-int p1, p1

    .line 30
    aput p1, p0, p3

    .line 31
    .line 32
    aput p4, p0, v1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    int-to-float p1, p4

    .line 36
    mul-float p1, p1, p5

    .line 37
    .line 38
    add-float/2addr p1, v0

    .line 39
    float-to-int p1, p1

    .line 40
    int-to-float p6, p2

    .line 41
    div-float/2addr p6, p5

    .line 42
    add-float/2addr p6, v0

    .line 43
    float-to-int p5, p6

    .line 44
    if-gt p1, p2, :cond_3

    .line 45
    .line 46
    aput p1, p0, p3

    .line 47
    .line 48
    aput p4, p0, v1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    if-gt p5, p4, :cond_4

    .line 52
    .line 53
    aput p2, p0, p3

    .line 54
    .line 55
    aput p5, p0, v1

    .line 56
    .line 57
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lw/d;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/o;->j:I

    .line 4
    .line 5
    invoke-static {v1}, Lt/e;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x3

    .line 11
    if-eq v1, v3, :cond_26

    .line 12
    .line 13
    iget-object v1, v0, Lw/o;->e:Lw/g;

    .line 14
    .line 15
    iget-boolean v4, v1, Lw/f;->j:Z

    .line 16
    .line 17
    iget-object v5, v0, Lw/o;->h:Lw/f;

    .line 18
    .line 19
    iget-object v6, v0, Lw/o;->i:Lw/f;

    .line 20
    .line 21
    const/high16 v7, 0x3f000000    # 0.5f

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget v4, v0, Lw/o;->d:I

    .line 27
    .line 28
    if-ne v4, v3, :cond_0

    .line 29
    .line 30
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 31
    .line 32
    iget v9, v4, Lv/d;->r:I

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v9, v10, :cond_1c

    .line 36
    .line 37
    if-eq v9, v3, :cond_1

    .line 38
    .line 39
    :cond_0
    :goto_0
    const/high16 p1, 0x3f000000    # 0.5f

    .line 40
    .line 41
    goto/16 :goto_a

    .line 42
    .line 43
    :cond_1
    iget v9, v4, Lv/d;->s:I

    .line 44
    .line 45
    const/4 v10, -0x1

    .line 46
    if-eqz v9, :cond_6

    .line 47
    .line 48
    if-ne v9, v3, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    iget v9, v4, Lv/d;->X:I

    .line 52
    .line 53
    if-eq v9, v10, :cond_5

    .line 54
    .line 55
    if-eqz v9, :cond_4

    .line 56
    .line 57
    if-eq v9, v8, :cond_3

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 62
    .line 63
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 64
    .line 65
    iget v9, v9, Lw/f;->g:I

    .line 66
    .line 67
    int-to-float v9, v9

    .line 68
    iget v4, v4, Lv/d;->W:F

    .line 69
    .line 70
    :goto_1
    mul-float v9, v9, v4

    .line 71
    .line 72
    :goto_2
    add-float/2addr v9, v7

    .line 73
    float-to-int v4, v9

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 76
    .line 77
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 78
    .line 79
    iget v9, v9, Lw/f;->g:I

    .line 80
    .line 81
    int-to-float v9, v9

    .line 82
    iget v4, v4, Lv/d;->W:F

    .line 83
    .line 84
    div-float/2addr v9, v4

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 87
    .line 88
    iget-object v9, v9, Lw/o;->e:Lw/g;

    .line 89
    .line 90
    iget v9, v9, Lw/f;->g:I

    .line 91
    .line 92
    int-to-float v9, v9

    .line 93
    iget v4, v4, Lv/d;->W:F

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :goto_3
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    :goto_4
    iget-object v9, v4, Lv/d;->e:Lw/m;

    .line 101
    .line 102
    iget-object v11, v9, Lw/o;->h:Lw/f;

    .line 103
    .line 104
    iget-object v9, v9, Lw/o;->i:Lw/f;

    .line 105
    .line 106
    iget-object v12, v4, Lv/d;->I:Lv/c;

    .line 107
    .line 108
    iget-object v12, v12, Lv/c;->f:Lv/c;

    .line 109
    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    const/4 v12, 0x1

    .line 113
    goto :goto_5

    .line 114
    :cond_7
    const/4 v12, 0x0

    .line 115
    :goto_5
    iget-object v13, v4, Lv/d;->J:Lv/c;

    .line 116
    .line 117
    iget-object v13, v13, Lv/c;->f:Lv/c;

    .line 118
    .line 119
    if-eqz v13, :cond_8

    .line 120
    .line 121
    const/4 v13, 0x1

    .line 122
    goto :goto_6

    .line 123
    :cond_8
    const/4 v13, 0x0

    .line 124
    :goto_6
    iget-object v14, v4, Lv/d;->K:Lv/c;

    .line 125
    .line 126
    iget-object v14, v14, Lv/c;->f:Lv/c;

    .line 127
    .line 128
    if-eqz v14, :cond_9

    .line 129
    .line 130
    const/4 v14, 0x1

    .line 131
    goto :goto_7

    .line 132
    :cond_9
    const/4 v14, 0x0

    .line 133
    :goto_7
    iget-object v15, v4, Lv/d;->L:Lv/c;

    .line 134
    .line 135
    iget-object v15, v15, Lv/c;->f:Lv/c;

    .line 136
    .line 137
    if-eqz v15, :cond_a

    .line 138
    .line 139
    const/4 v15, 0x1

    .line 140
    :goto_8
    const/high16 p1, 0x3f000000    # 0.5f

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_a
    const/4 v15, 0x0

    .line 144
    goto :goto_8

    .line 145
    :goto_9
    iget v7, v4, Lv/d;->X:I

    .line 146
    .line 147
    if-eqz v12, :cond_10

    .line 148
    .line 149
    if-eqz v13, :cond_10

    .line 150
    .line 151
    if-eqz v14, :cond_10

    .line 152
    .line 153
    if-eqz v15, :cond_10

    .line 154
    .line 155
    iget v4, v4, Lv/d;->W:F

    .line 156
    .line 157
    iget-boolean v10, v11, Lw/f;->j:Z

    .line 158
    .line 159
    sget-object v16, Lw/k;->k:[I

    .line 160
    .line 161
    if-eqz v10, :cond_c

    .line 162
    .line 163
    iget-boolean v10, v9, Lw/f;->j:Z

    .line 164
    .line 165
    if-eqz v10, :cond_c

    .line 166
    .line 167
    iget-boolean v3, v5, Lw/f;->c:Z

    .line 168
    .line 169
    if-eqz v3, :cond_25

    .line 170
    .line 171
    iget-boolean v3, v6, Lw/f;->c:Z

    .line 172
    .line 173
    if-nez v3, :cond_b

    .line 174
    .line 175
    goto/16 :goto_c

    .line 176
    .line 177
    :cond_b
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Lw/f;

    .line 184
    .line 185
    iget v3, v3, Lw/f;->g:I

    .line 186
    .line 187
    iget v5, v5, Lw/f;->f:I

    .line 188
    .line 189
    add-int v17, v3, v5

    .line 190
    .line 191
    iget-object v3, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Lw/f;

    .line 198
    .line 199
    iget v3, v3, Lw/f;->g:I

    .line 200
    .line 201
    iget v5, v6, Lw/f;->f:I

    .line 202
    .line 203
    sub-int v18, v3, v5

    .line 204
    .line 205
    iget v3, v11, Lw/f;->g:I

    .line 206
    .line 207
    iget v5, v11, Lw/f;->f:I

    .line 208
    .line 209
    add-int v19, v3, v5

    .line 210
    .line 211
    iget v3, v9, Lw/f;->g:I

    .line 212
    .line 213
    iget v5, v9, Lw/f;->f:I

    .line 214
    .line 215
    sub-int v20, v3, v5

    .line 216
    .line 217
    move/from16 v21, v4

    .line 218
    .line 219
    move/from16 v22, v7

    .line 220
    .line 221
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 222
    .line 223
    .line 224
    aget v2, v16, v2

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 227
    .line 228
    .line 229
    iget-object v1, v0, Lw/o;->b:Lv/d;

    .line 230
    .line 231
    iget-object v1, v1, Lv/d;->e:Lw/m;

    .line 232
    .line 233
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 234
    .line 235
    aget v2, v16, v8

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_c
    move/from16 v21, v4

    .line 242
    .line 243
    move/from16 v22, v7

    .line 244
    .line 245
    iget-boolean v4, v5, Lw/f;->j:Z

    .line 246
    .line 247
    iget-object v7, v11, Lw/f;->l:Ljava/util/ArrayList;

    .line 248
    .line 249
    if-eqz v4, :cond_e

    .line 250
    .line 251
    iget-boolean v4, v6, Lw/f;->j:Z

    .line 252
    .line 253
    if-eqz v4, :cond_e

    .line 254
    .line 255
    iget-boolean v4, v11, Lw/f;->c:Z

    .line 256
    .line 257
    if-eqz v4, :cond_25

    .line 258
    .line 259
    iget-boolean v4, v9, Lw/f;->c:Z

    .line 260
    .line 261
    if-nez v4, :cond_d

    .line 262
    .line 263
    goto/16 :goto_c

    .line 264
    .line 265
    :cond_d
    iget v4, v5, Lw/f;->g:I

    .line 266
    .line 267
    iget v10, v5, Lw/f;->f:I

    .line 268
    .line 269
    add-int v17, v4, v10

    .line 270
    .line 271
    iget v4, v6, Lw/f;->g:I

    .line 272
    .line 273
    iget v10, v6, Lw/f;->f:I

    .line 274
    .line 275
    sub-int v18, v4, v10

    .line 276
    .line 277
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Lw/f;

    .line 282
    .line 283
    iget v4, v4, Lw/f;->g:I

    .line 284
    .line 285
    iget v10, v11, Lw/f;->f:I

    .line 286
    .line 287
    add-int v19, v4, v10

    .line 288
    .line 289
    iget-object v4, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Lw/f;

    .line 296
    .line 297
    iget v4, v4, Lw/f;->g:I

    .line 298
    .line 299
    iget v10, v9, Lw/f;->f:I

    .line 300
    .line 301
    sub-int v20, v4, v10

    .line 302
    .line 303
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 304
    .line 305
    .line 306
    aget v4, v16, v2

    .line 307
    .line 308
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 312
    .line 313
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 314
    .line 315
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 316
    .line 317
    aget v10, v16, v8

    .line 318
    .line 319
    invoke-virtual {v4, v10}, Lw/g;->d(I)V

    .line 320
    .line 321
    .line 322
    :cond_e
    iget-boolean v4, v5, Lw/f;->c:Z

    .line 323
    .line 324
    if-eqz v4, :cond_25

    .line 325
    .line 326
    iget-boolean v4, v6, Lw/f;->c:Z

    .line 327
    .line 328
    if-eqz v4, :cond_25

    .line 329
    .line 330
    iget-boolean v4, v11, Lw/f;->c:Z

    .line 331
    .line 332
    if-eqz v4, :cond_25

    .line 333
    .line 334
    iget-boolean v4, v9, Lw/f;->c:Z

    .line 335
    .line 336
    if-nez v4, :cond_f

    .line 337
    .line 338
    goto/16 :goto_c

    .line 339
    .line 340
    :cond_f
    iget-object v4, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    check-cast v4, Lw/f;

    .line 347
    .line 348
    iget v4, v4, Lw/f;->g:I

    .line 349
    .line 350
    iget v10, v5, Lw/f;->f:I

    .line 351
    .line 352
    add-int v17, v4, v10

    .line 353
    .line 354
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Lw/f;

    .line 361
    .line 362
    iget v4, v4, Lw/f;->g:I

    .line 363
    .line 364
    iget v10, v6, Lw/f;->f:I

    .line 365
    .line 366
    sub-int v18, v4, v10

    .line 367
    .line 368
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, Lw/f;

    .line 373
    .line 374
    iget v4, v4, Lw/f;->g:I

    .line 375
    .line 376
    iget v7, v11, Lw/f;->f:I

    .line 377
    .line 378
    add-int v19, v4, v7

    .line 379
    .line 380
    iget-object v4, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    check-cast v4, Lw/f;

    .line 387
    .line 388
    iget v4, v4, Lw/f;->g:I

    .line 389
    .line 390
    iget v7, v9, Lw/f;->f:I

    .line 391
    .line 392
    sub-int v20, v4, v7

    .line 393
    .line 394
    invoke-static/range {v16 .. v22}, Lw/k;->m([IIIIIFI)V

    .line 395
    .line 396
    .line 397
    aget v4, v16, v2

    .line 398
    .line 399
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 400
    .line 401
    .line 402
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 403
    .line 404
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 405
    .line 406
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 407
    .line 408
    aget v7, v16, v8

    .line 409
    .line 410
    invoke-virtual {v4, v7}, Lw/g;->d(I)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_a

    .line 414
    .line 415
    :cond_10
    if-eqz v12, :cond_16

    .line 416
    .line 417
    if-eqz v14, :cond_16

    .line 418
    .line 419
    iget-boolean v9, v5, Lw/f;->c:Z

    .line 420
    .line 421
    if-eqz v9, :cond_25

    .line 422
    .line 423
    iget-boolean v9, v6, Lw/f;->c:Z

    .line 424
    .line 425
    if-nez v9, :cond_11

    .line 426
    .line 427
    goto/16 :goto_c

    .line 428
    .line 429
    :cond_11
    iget v4, v4, Lv/d;->W:F

    .line 430
    .line 431
    iget-object v9, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    check-cast v9, Lw/f;

    .line 438
    .line 439
    iget v9, v9, Lw/f;->g:I

    .line 440
    .line 441
    iget v11, v5, Lw/f;->f:I

    .line 442
    .line 443
    add-int/2addr v9, v11

    .line 444
    iget-object v11, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    check-cast v11, Lw/f;

    .line 451
    .line 452
    iget v11, v11, Lw/f;->g:I

    .line 453
    .line 454
    iget v12, v6, Lw/f;->f:I

    .line 455
    .line 456
    sub-int/2addr v11, v12

    .line 457
    if-eq v7, v10, :cond_14

    .line 458
    .line 459
    if-eqz v7, :cond_14

    .line 460
    .line 461
    if-eq v7, v8, :cond_12

    .line 462
    .line 463
    goto/16 :goto_a

    .line 464
    .line 465
    :cond_12
    sub-int/2addr v11, v9

    .line 466
    invoke-virtual {v0, v11, v2}, Lw/o;->g(II)I

    .line 467
    .line 468
    .line 469
    move-result v7

    .line 470
    int-to-float v9, v7

    .line 471
    div-float/2addr v9, v4

    .line 472
    add-float v9, v9, p1

    .line 473
    .line 474
    float-to-int v9, v9

    .line 475
    invoke-virtual {v0, v9, v8}, Lw/o;->g(II)I

    .line 476
    .line 477
    .line 478
    move-result v10

    .line 479
    if-eq v9, v10, :cond_13

    .line 480
    .line 481
    int-to-float v7, v10

    .line 482
    mul-float v7, v7, v4

    .line 483
    .line 484
    add-float v7, v7, p1

    .line 485
    .line 486
    float-to-int v7, v7

    .line 487
    :cond_13
    invoke-virtual {v1, v7}, Lw/g;->d(I)V

    .line 488
    .line 489
    .line 490
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 491
    .line 492
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 493
    .line 494
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 495
    .line 496
    invoke-virtual {v4, v10}, Lw/g;->d(I)V

    .line 497
    .line 498
    .line 499
    goto/16 :goto_a

    .line 500
    .line 501
    :cond_14
    sub-int/2addr v11, v9

    .line 502
    invoke-virtual {v0, v11, v2}, Lw/o;->g(II)I

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    int-to-float v9, v7

    .line 507
    mul-float v9, v9, v4

    .line 508
    .line 509
    add-float v9, v9, p1

    .line 510
    .line 511
    float-to-int v9, v9

    .line 512
    invoke-virtual {v0, v9, v8}, Lw/o;->g(II)I

    .line 513
    .line 514
    .line 515
    move-result v10

    .line 516
    if-eq v9, v10, :cond_15

    .line 517
    .line 518
    int-to-float v7, v10

    .line 519
    div-float/2addr v7, v4

    .line 520
    add-float v7, v7, p1

    .line 521
    .line 522
    float-to-int v7, v7

    .line 523
    :cond_15
    invoke-virtual {v1, v7}, Lw/g;->d(I)V

    .line 524
    .line 525
    .line 526
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 527
    .line 528
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 529
    .line 530
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 531
    .line 532
    invoke-virtual {v4, v10}, Lw/g;->d(I)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_a

    .line 536
    .line 537
    :cond_16
    if-eqz v13, :cond_1d

    .line 538
    .line 539
    if-eqz v15, :cond_1d

    .line 540
    .line 541
    iget-boolean v12, v11, Lw/f;->c:Z

    .line 542
    .line 543
    if-eqz v12, :cond_25

    .line 544
    .line 545
    iget-boolean v12, v9, Lw/f;->c:Z

    .line 546
    .line 547
    if-nez v12, :cond_17

    .line 548
    .line 549
    goto/16 :goto_c

    .line 550
    .line 551
    :cond_17
    iget v4, v4, Lv/d;->W:F

    .line 552
    .line 553
    iget-object v12, v11, Lw/f;->l:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v12

    .line 559
    check-cast v12, Lw/f;

    .line 560
    .line 561
    iget v12, v12, Lw/f;->g:I

    .line 562
    .line 563
    iget v11, v11, Lw/f;->f:I

    .line 564
    .line 565
    add-int/2addr v12, v11

    .line 566
    iget-object v11, v9, Lw/f;->l:Ljava/util/ArrayList;

    .line 567
    .line 568
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v11

    .line 572
    check-cast v11, Lw/f;

    .line 573
    .line 574
    iget v11, v11, Lw/f;->g:I

    .line 575
    .line 576
    iget v9, v9, Lw/f;->f:I

    .line 577
    .line 578
    sub-int/2addr v11, v9

    .line 579
    if-eq v7, v10, :cond_1a

    .line 580
    .line 581
    if-eqz v7, :cond_18

    .line 582
    .line 583
    if-eq v7, v8, :cond_1a

    .line 584
    .line 585
    goto :goto_a

    .line 586
    :cond_18
    sub-int/2addr v11, v12

    .line 587
    invoke-virtual {v0, v11, v8}, Lw/o;->g(II)I

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    int-to-float v9, v7

    .line 592
    mul-float v9, v9, v4

    .line 593
    .line 594
    add-float v9, v9, p1

    .line 595
    .line 596
    float-to-int v9, v9

    .line 597
    invoke-virtual {v0, v9, v2}, Lw/o;->g(II)I

    .line 598
    .line 599
    .line 600
    move-result v10

    .line 601
    if-eq v9, v10, :cond_19

    .line 602
    .line 603
    int-to-float v7, v10

    .line 604
    div-float/2addr v7, v4

    .line 605
    add-float v7, v7, p1

    .line 606
    .line 607
    float-to-int v7, v7

    .line 608
    :cond_19
    invoke-virtual {v1, v10}, Lw/g;->d(I)V

    .line 609
    .line 610
    .line 611
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 612
    .line 613
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 614
    .line 615
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 616
    .line 617
    invoke-virtual {v4, v7}, Lw/g;->d(I)V

    .line 618
    .line 619
    .line 620
    goto :goto_a

    .line 621
    :cond_1a
    sub-int/2addr v11, v12

    .line 622
    invoke-virtual {v0, v11, v8}, Lw/o;->g(II)I

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    int-to-float v9, v7

    .line 627
    div-float/2addr v9, v4

    .line 628
    add-float v9, v9, p1

    .line 629
    .line 630
    float-to-int v9, v9

    .line 631
    invoke-virtual {v0, v9, v2}, Lw/o;->g(II)I

    .line 632
    .line 633
    .line 634
    move-result v10

    .line 635
    if-eq v9, v10, :cond_1b

    .line 636
    .line 637
    int-to-float v7, v10

    .line 638
    mul-float v7, v7, v4

    .line 639
    .line 640
    add-float v7, v7, p1

    .line 641
    .line 642
    float-to-int v7, v7

    .line 643
    :cond_1b
    invoke-virtual {v1, v10}, Lw/g;->d(I)V

    .line 644
    .line 645
    .line 646
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 647
    .line 648
    iget-object v4, v4, Lv/d;->e:Lw/m;

    .line 649
    .line 650
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 651
    .line 652
    invoke-virtual {v4, v7}, Lw/g;->d(I)V

    .line 653
    .line 654
    .line 655
    goto :goto_a

    .line 656
    :cond_1c
    const/high16 p1, 0x3f000000    # 0.5f

    .line 657
    .line 658
    iget-object v7, v4, Lv/d;->T:Lv/d;

    .line 659
    .line 660
    if-eqz v7, :cond_1d

    .line 661
    .line 662
    iget-object v7, v7, Lv/d;->d:Lw/k;

    .line 663
    .line 664
    iget-object v7, v7, Lw/o;->e:Lw/g;

    .line 665
    .line 666
    iget-boolean v9, v7, Lw/f;->j:Z

    .line 667
    .line 668
    if-eqz v9, :cond_1d

    .line 669
    .line 670
    iget v4, v4, Lv/d;->w:F

    .line 671
    .line 672
    iget v7, v7, Lw/f;->g:I

    .line 673
    .line 674
    int-to-float v7, v7

    .line 675
    mul-float v7, v7, v4

    .line 676
    .line 677
    add-float v7, v7, p1

    .line 678
    .line 679
    float-to-int v4, v7

    .line 680
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 681
    .line 682
    .line 683
    :cond_1d
    :goto_a
    iget-boolean v4, v5, Lw/f;->c:Z

    .line 684
    .line 685
    if-eqz v4, :cond_25

    .line 686
    .line 687
    iget-boolean v4, v6, Lw/f;->c:Z

    .line 688
    .line 689
    if-nez v4, :cond_1e

    .line 690
    .line 691
    goto/16 :goto_c

    .line 692
    .line 693
    :cond_1e
    iget-boolean v4, v5, Lw/f;->j:Z

    .line 694
    .line 695
    if-eqz v4, :cond_1f

    .line 696
    .line 697
    iget-boolean v4, v6, Lw/f;->j:Z

    .line 698
    .line 699
    if-eqz v4, :cond_1f

    .line 700
    .line 701
    iget-boolean v4, v1, Lw/f;->j:Z

    .line 702
    .line 703
    if-eqz v4, :cond_1f

    .line 704
    .line 705
    goto/16 :goto_c

    .line 706
    .line 707
    :cond_1f
    iget-boolean v4, v1, Lw/f;->j:Z

    .line 708
    .line 709
    if-nez v4, :cond_20

    .line 710
    .line 711
    iget v4, v0, Lw/o;->d:I

    .line 712
    .line 713
    if-ne v4, v3, :cond_20

    .line 714
    .line 715
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 716
    .line 717
    iget v7, v4, Lv/d;->r:I

    .line 718
    .line 719
    if-nez v7, :cond_20

    .line 720
    .line 721
    invoke-virtual {v4}, Lv/d;->x()Z

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    if-nez v4, :cond_20

    .line 726
    .line 727
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    check-cast v3, Lw/f;

    .line 734
    .line 735
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 736
    .line 737
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    check-cast v2, Lw/f;

    .line 742
    .line 743
    iget v3, v3, Lw/f;->g:I

    .line 744
    .line 745
    iget v4, v5, Lw/f;->f:I

    .line 746
    .line 747
    add-int/2addr v3, v4

    .line 748
    iget v2, v2, Lw/f;->g:I

    .line 749
    .line 750
    iget v4, v6, Lw/f;->f:I

    .line 751
    .line 752
    add-int/2addr v2, v4

    .line 753
    sub-int v4, v2, v3

    .line 754
    .line 755
    invoke-virtual {v5, v3}, Lw/f;->d(I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v4}, Lw/g;->d(I)V

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :cond_20
    iget-boolean v4, v1, Lw/f;->j:Z

    .line 766
    .line 767
    if-nez v4, :cond_22

    .line 768
    .line 769
    iget v4, v0, Lw/o;->d:I

    .line 770
    .line 771
    if-ne v4, v3, :cond_22

    .line 772
    .line 773
    iget v3, v0, Lw/o;->a:I

    .line 774
    .line 775
    if-ne v3, v8, :cond_22

    .line 776
    .line 777
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 778
    .line 779
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 780
    .line 781
    .line 782
    move-result v3

    .line 783
    if-lez v3, :cond_22

    .line 784
    .line 785
    iget-object v3, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    if-lez v3, :cond_22

    .line 792
    .line 793
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    check-cast v3, Lw/f;

    .line 800
    .line 801
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v4

    .line 807
    check-cast v4, Lw/f;

    .line 808
    .line 809
    iget v3, v3, Lw/f;->g:I

    .line 810
    .line 811
    iget v7, v5, Lw/f;->f:I

    .line 812
    .line 813
    add-int/2addr v3, v7

    .line 814
    iget v4, v4, Lw/f;->g:I

    .line 815
    .line 816
    iget v7, v6, Lw/f;->f:I

    .line 817
    .line 818
    add-int/2addr v4, v7

    .line 819
    sub-int/2addr v4, v3

    .line 820
    iget v3, v1, Lw/g;->m:I

    .line 821
    .line 822
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    iget-object v4, v0, Lw/o;->b:Lv/d;

    .line 827
    .line 828
    iget v7, v4, Lv/d;->v:I

    .line 829
    .line 830
    iget v4, v4, Lv/d;->u:I

    .line 831
    .line 832
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 833
    .line 834
    .line 835
    move-result v3

    .line 836
    if-lez v7, :cond_21

    .line 837
    .line 838
    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    :cond_21
    invoke-virtual {v1, v3}, Lw/g;->d(I)V

    .line 843
    .line 844
    .line 845
    :cond_22
    iget-boolean v3, v1, Lw/f;->j:Z

    .line 846
    .line 847
    if-nez v3, :cond_23

    .line 848
    .line 849
    goto :goto_c

    .line 850
    :cond_23
    iget-object v3, v5, Lw/f;->l:Ljava/util/ArrayList;

    .line 851
    .line 852
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    check-cast v3, Lw/f;

    .line 857
    .line 858
    iget-object v4, v6, Lw/f;->l:Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    check-cast v2, Lw/f;

    .line 865
    .line 866
    iget v4, v3, Lw/f;->g:I

    .line 867
    .line 868
    iget v7, v5, Lw/f;->f:I

    .line 869
    .line 870
    add-int/2addr v7, v4

    .line 871
    iget v8, v2, Lw/f;->g:I

    .line 872
    .line 873
    iget v9, v6, Lw/f;->f:I

    .line 874
    .line 875
    add-int/2addr v9, v8

    .line 876
    iget-object v10, v0, Lw/o;->b:Lv/d;

    .line 877
    .line 878
    iget v10, v10, Lv/d;->d0:F

    .line 879
    .line 880
    if-ne v3, v2, :cond_24

    .line 881
    .line 882
    const/high16 v10, 0x3f000000    # 0.5f

    .line 883
    .line 884
    goto :goto_b

    .line 885
    :cond_24
    move v4, v7

    .line 886
    move v8, v9

    .line 887
    :goto_b
    sub-int/2addr v8, v4

    .line 888
    iget v2, v1, Lw/f;->g:I

    .line 889
    .line 890
    sub-int/2addr v8, v2

    .line 891
    int-to-float v2, v4

    .line 892
    add-float v2, v2, p1

    .line 893
    .line 894
    int-to-float v3, v8

    .line 895
    mul-float v3, v3, v10

    .line 896
    .line 897
    add-float/2addr v3, v2

    .line 898
    float-to-int v2, v3

    .line 899
    invoke-virtual {v5, v2}, Lw/f;->d(I)V

    .line 900
    .line 901
    .line 902
    iget v2, v5, Lw/f;->g:I

    .line 903
    .line 904
    iget v1, v1, Lw/f;->g:I

    .line 905
    .line 906
    add-int/2addr v2, v1

    .line 907
    invoke-virtual {v6, v2}, Lw/f;->d(I)V

    .line 908
    .line 909
    .line 910
    :cond_25
    :goto_c
    return-void

    .line 911
    :cond_26
    iget-object v1, v0, Lw/o;->b:Lv/d;

    .line 912
    .line 913
    iget-object v3, v1, Lv/d;->I:Lv/c;

    .line 914
    .line 915
    iget-object v1, v1, Lv/d;->K:Lv/c;

    .line 916
    .line 917
    invoke-virtual {v0, v3, v1, v2}, Lw/o;->l(Lv/c;Lv/c;I)V

    .line 918
    .line 919
    .line 920
    return-void
.end method

.method public final d()V
    .locals 11

    .line 1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 2
    .line 3
    iget-boolean v1, v0, Lv/d;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Lw/o;->e:Lw/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lv/d;->q()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 19
    .line 20
    iget-object v3, p0, Lw/o;->h:Lw/f;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 29
    .line 30
    iget-object v8, v0, Lv/d;->p0:[I

    .line 31
    .line 32
    aget v8, v8, v7

    .line 33
    .line 34
    iput v8, p0, Lw/o;->d:I

    .line 35
    .line 36
    if-eq v8, v5, :cond_5

    .line 37
    .line 38
    if-ne v8, v6, :cond_2

    .line 39
    .line 40
    iget-object v9, v0, Lv/d;->T:Lv/d;

    .line 41
    .line 42
    if-eqz v9, :cond_2

    .line 43
    .line 44
    iget-object v10, v9, Lv/d;->p0:[I

    .line 45
    .line 46
    aget v10, v10, v7

    .line 47
    .line 48
    if-eq v10, v4, :cond_1

    .line 49
    .line 50
    if-ne v10, v6, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v9}, Lv/d;->q()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 57
    .line 58
    iget-object v4, v4, Lv/d;->I:Lv/c;

    .line 59
    .line 60
    invoke-virtual {v4}, Lv/c;->e()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-int/2addr v0, v4

    .line 65
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 66
    .line 67
    iget-object v4, v4, Lv/d;->K:Lv/c;

    .line 68
    .line 69
    invoke-virtual {v4}, Lv/c;->e()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    sub-int/2addr v0, v4

    .line 74
    iget-object v4, v9, Lv/d;->d:Lw/k;

    .line 75
    .line 76
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 77
    .line 78
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 79
    .line 80
    iget-object v5, v5, Lv/d;->I:Lv/c;

    .line 81
    .line 82
    invoke-virtual {v5}, Lv/c;->e()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v3, v4, v5}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 87
    .line 88
    .line 89
    iget-object v3, v9, Lv/d;->d:Lw/k;

    .line 90
    .line 91
    iget-object v3, v3, Lw/o;->i:Lw/f;

    .line 92
    .line 93
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 94
    .line 95
    iget-object v4, v4, Lv/d;->K:Lv/c;

    .line 96
    .line 97
    invoke-virtual {v4}, Lv/c;->e()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    neg-int v4, v4

    .line 102
    invoke-static {v1, v3, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    if-ne v8, v4, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0}, Lv/d;->q()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v2, v0}, Lw/g;->d(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    iget v0, p0, Lw/o;->d:I

    .line 120
    .line 121
    if-ne v0, v6, :cond_5

    .line 122
    .line 123
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 124
    .line 125
    iget-object v8, v0, Lv/d;->T:Lv/d;

    .line 126
    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    iget-object v9, v8, Lv/d;->p0:[I

    .line 130
    .line 131
    aget v9, v9, v7

    .line 132
    .line 133
    if-eq v9, v4, :cond_4

    .line 134
    .line 135
    if-ne v9, v6, :cond_5

    .line 136
    .line 137
    :cond_4
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 138
    .line 139
    iget-object v2, v2, Lw/o;->h:Lw/f;

    .line 140
    .line 141
    iget-object v0, v0, Lv/d;->I:Lv/c;

    .line 142
    .line 143
    invoke-virtual {v0}, Lv/c;->e()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-static {v3, v2, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v8, Lv/d;->d:Lw/k;

    .line 151
    .line 152
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 153
    .line 154
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 155
    .line 156
    iget-object v2, v2, Lv/d;->K:Lv/c;

    .line 157
    .line 158
    invoke-virtual {v2}, Lv/c;->e()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    neg-int v2, v2

    .line 163
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_5
    :goto_0
    iget-boolean v0, v2, Lw/f;->j:Z

    .line 168
    .line 169
    if-eqz v0, :cond_c

    .line 170
    .line 171
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 172
    .line 173
    iget-boolean v8, v0, Lv/d;->a:Z

    .line 174
    .line 175
    if-eqz v8, :cond_c

    .line 176
    .line 177
    iget-object v5, v0, Lv/d;->Q:[Lv/c;

    .line 178
    .line 179
    aget-object v6, v5, v7

    .line 180
    .line 181
    iget-object v8, v6, Lv/c;->f:Lv/c;

    .line 182
    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    aget-object v9, v5, v4

    .line 186
    .line 187
    iget-object v9, v9, Lv/c;->f:Lv/c;

    .line 188
    .line 189
    if-eqz v9, :cond_9

    .line 190
    .line 191
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 198
    .line 199
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 200
    .line 201
    aget-object v0, v0, v7

    .line 202
    .line 203
    invoke-virtual {v0}, Lv/c;->e()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    iput v0, v3, Lw/f;->f:I

    .line 208
    .line 209
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 210
    .line 211
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 212
    .line 213
    aget-object v0, v0, v4

    .line 214
    .line 215
    invoke-virtual {v0}, Lv/c;->e()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    neg-int v0, v0

    .line 220
    iput v0, v1, Lw/f;->f:I

    .line 221
    .line 222
    return-void

    .line 223
    :cond_6
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 224
    .line 225
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 226
    .line 227
    aget-object v0, v0, v7

    .line 228
    .line 229
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v0, :cond_7

    .line 234
    .line 235
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 236
    .line 237
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 238
    .line 239
    aget-object v2, v2, v7

    .line 240
    .line 241
    invoke-virtual {v2}, Lv/c;->e()I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-static {v3, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 246
    .line 247
    .line 248
    :cond_7
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 249
    .line 250
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 251
    .line 252
    aget-object v0, v0, v4

    .line 253
    .line 254
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-eqz v0, :cond_8

    .line 259
    .line 260
    iget-object v2, p0, Lw/o;->b:Lv/d;

    .line 261
    .line 262
    iget-object v2, v2, Lv/d;->Q:[Lv/c;

    .line 263
    .line 264
    aget-object v2, v2, v4

    .line 265
    .line 266
    invoke-virtual {v2}, Lv/c;->e()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    neg-int v2, v2

    .line 271
    invoke-static {v1, v0, v2}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 272
    .line 273
    .line 274
    :cond_8
    iput-boolean v4, v3, Lw/f;->b:Z

    .line 275
    .line 276
    iput-boolean v4, v1, Lw/f;->b:Z

    .line 277
    .line 278
    return-void

    .line 279
    :cond_9
    if-eqz v8, :cond_a

    .line 280
    .line 281
    invoke-static {v6}, Lw/o;->h(Lv/c;)Lw/f;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_1a

    .line 286
    .line 287
    iget-object v4, p0, Lw/o;->b:Lv/d;

    .line 288
    .line 289
    iget-object v4, v4, Lv/d;->Q:[Lv/c;

    .line 290
    .line 291
    aget-object v4, v4, v7

    .line 292
    .line 293
    invoke-virtual {v4}, Lv/c;->e()I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-static {v3, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 298
    .line 299
    .line 300
    iget v0, v2, Lw/f;->g:I

    .line 301
    .line 302
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_a
    aget-object v5, v5, v4

    .line 307
    .line 308
    iget-object v6, v5, Lv/c;->f:Lv/c;

    .line 309
    .line 310
    if-eqz v6, :cond_b

    .line 311
    .line 312
    invoke-static {v5}, Lw/o;->h(Lv/c;)Lw/f;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-eqz v0, :cond_1a

    .line 317
    .line 318
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 319
    .line 320
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 321
    .line 322
    aget-object v4, v5, v4

    .line 323
    .line 324
    invoke-virtual {v4}, Lv/c;->e()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    neg-int v4, v4

    .line 329
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 330
    .line 331
    .line 332
    iget v0, v2, Lw/f;->g:I

    .line 333
    .line 334
    neg-int v0, v0

    .line 335
    invoke-static {v3, v1, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :cond_b
    instance-of v4, v0, Lv/i;

    .line 340
    .line 341
    if-nez v4, :cond_1a

    .line 342
    .line 343
    iget-object v4, v0, Lv/d;->T:Lv/d;

    .line 344
    .line 345
    if-eqz v4, :cond_1a

    .line 346
    .line 347
    const/4 v4, 0x7

    .line 348
    invoke-virtual {v0, v4}, Lv/d;->i(I)Lv/c;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iget-object v0, v0, Lv/c;->f:Lv/c;

    .line 353
    .line 354
    if-nez v0, :cond_1a

    .line 355
    .line 356
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 357
    .line 358
    iget-object v4, v0, Lv/d;->T:Lv/d;

    .line 359
    .line 360
    iget-object v4, v4, Lv/d;->d:Lw/k;

    .line 361
    .line 362
    iget-object v4, v4, Lw/o;->h:Lw/f;

    .line 363
    .line 364
    invoke-virtual {v0}, Lv/d;->r()I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    invoke-static {v3, v4, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 369
    .line 370
    .line 371
    iget v0, v2, Lw/f;->g:I

    .line 372
    .line 373
    invoke-static {v1, v3, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :cond_c
    iget v0, p0, Lw/o;->d:I

    .line 378
    .line 379
    if-ne v0, v5, :cond_13

    .line 380
    .line 381
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 382
    .line 383
    iget v8, v0, Lv/d;->r:I

    .line 384
    .line 385
    const/4 v9, 0x2

    .line 386
    if-eq v8, v9, :cond_11

    .line 387
    .line 388
    if-eq v8, v5, :cond_d

    .line 389
    .line 390
    goto/16 :goto_1

    .line 391
    .line 392
    :cond_d
    iget v8, v0, Lv/d;->s:I

    .line 393
    .line 394
    if-ne v8, v5, :cond_10

    .line 395
    .line 396
    iput-object p0, v3, Lw/f;->a:Lw/o;

    .line 397
    .line 398
    iput-object p0, v1, Lw/f;->a:Lw/o;

    .line 399
    .line 400
    iget-object v5, v0, Lv/d;->e:Lw/m;

    .line 401
    .line 402
    iget-object v8, v5, Lw/o;->h:Lw/f;

    .line 403
    .line 404
    iput-object p0, v8, Lw/f;->a:Lw/o;

    .line 405
    .line 406
    iget-object v5, v5, Lw/o;->i:Lw/f;

    .line 407
    .line 408
    iput-object p0, v5, Lw/f;->a:Lw/o;

    .line 409
    .line 410
    iput-object p0, v2, Lw/f;->a:Lw/o;

    .line 411
    .line 412
    invoke-virtual {v0}, Lv/d;->y()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_e

    .line 417
    .line 418
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 419
    .line 420
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 421
    .line 422
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 423
    .line 424
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 425
    .line 426
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 430
    .line 431
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 432
    .line 433
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 434
    .line 435
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 441
    .line 442
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 443
    .line 444
    iget-object v5, v0, Lw/o;->e:Lw/g;

    .line 445
    .line 446
    iput-object p0, v5, Lw/f;->a:Lw/o;

    .line 447
    .line 448
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 449
    .line 450
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 451
    .line 452
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    iget-object v0, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 456
    .line 457
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 458
    .line 459
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 460
    .line 461
    iget-object v5, v5, Lw/o;->i:Lw/f;

    .line 462
    .line 463
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 467
    .line 468
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 469
    .line 470
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 471
    .line 472
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 478
    .line 479
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 480
    .line 481
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 482
    .line 483
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto/16 :goto_1

    .line 489
    .line 490
    :cond_e
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 491
    .line 492
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_f

    .line 497
    .line 498
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 499
    .line 500
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 501
    .line 502
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 503
    .line 504
    iget-object v0, v0, Lw/f;->l:Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 510
    .line 511
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 512
    .line 513
    iget-object v5, v5, Lv/d;->e:Lw/m;

    .line 514
    .line 515
    iget-object v5, v5, Lw/o;->e:Lw/g;

    .line 516
    .line 517
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    goto :goto_1

    .line 521
    :cond_f
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 522
    .line 523
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 524
    .line 525
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 526
    .line 527
    iget-object v0, v0, Lw/f;->l:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    goto :goto_1

    .line 533
    :cond_10
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 534
    .line 535
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 536
    .line 537
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 543
    .line 544
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 548
    .line 549
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 550
    .line 551
    iget-object v0, v0, Lw/o;->h:Lw/f;

    .line 552
    .line 553
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 559
    .line 560
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 561
    .line 562
    iget-object v0, v0, Lw/o;->i:Lw/f;

    .line 563
    .line 564
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 565
    .line 566
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    iput-boolean v4, v2, Lw/f;->b:Z

    .line 570
    .line 571
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 572
    .line 573
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    iget-object v0, v3, Lw/f;->l:Ljava/util/ArrayList;

    .line 582
    .line 583
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    iget-object v0, v1, Lw/f;->l:Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    goto :goto_1

    .line 592
    :cond_11
    iget-object v0, v0, Lv/d;->T:Lv/d;

    .line 593
    .line 594
    if-nez v0, :cond_12

    .line 595
    .line 596
    goto :goto_1

    .line 597
    :cond_12
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 598
    .line 599
    iget-object v0, v0, Lw/o;->e:Lw/g;

    .line 600
    .line 601
    iget-object v5, v2, Lw/f;->l:Ljava/util/ArrayList;

    .line 602
    .line 603
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 607
    .line 608
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    iput-boolean v4, v2, Lw/f;->b:Z

    .line 612
    .line 613
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 614
    .line 615
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 619
    .line 620
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    :cond_13
    :goto_1
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 624
    .line 625
    iget-object v5, v0, Lv/d;->Q:[Lv/c;

    .line 626
    .line 627
    aget-object v8, v5, v7

    .line 628
    .line 629
    iget-object v9, v8, Lv/c;->f:Lv/c;

    .line 630
    .line 631
    if-eqz v9, :cond_17

    .line 632
    .line 633
    aget-object v10, v5, v4

    .line 634
    .line 635
    iget-object v10, v10, Lv/c;->f:Lv/c;

    .line 636
    .line 637
    if-eqz v10, :cond_17

    .line 638
    .line 639
    invoke-virtual {v0}, Lv/d;->x()Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_14

    .line 644
    .line 645
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 646
    .line 647
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 648
    .line 649
    aget-object v0, v0, v7

    .line 650
    .line 651
    invoke-virtual {v0}, Lv/c;->e()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    iput v0, v3, Lw/f;->f:I

    .line 656
    .line 657
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 658
    .line 659
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 660
    .line 661
    aget-object v0, v0, v4

    .line 662
    .line 663
    invoke-virtual {v0}, Lv/c;->e()I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    neg-int v0, v0

    .line 668
    iput v0, v1, Lw/f;->f:I

    .line 669
    .line 670
    return-void

    .line 671
    :cond_14
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 672
    .line 673
    iget-object v0, v0, Lv/d;->Q:[Lv/c;

    .line 674
    .line 675
    aget-object v0, v0, v7

    .line 676
    .line 677
    invoke-static {v0}, Lw/o;->h(Lv/c;)Lw/f;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 682
    .line 683
    iget-object v1, v1, Lv/d;->Q:[Lv/c;

    .line 684
    .line 685
    aget-object v1, v1, v4

    .line 686
    .line 687
    invoke-static {v1}, Lw/o;->h(Lv/c;)Lw/f;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    if-eqz v0, :cond_15

    .line 692
    .line 693
    invoke-virtual {v0, p0}, Lw/f;->b(Lw/o;)V

    .line 694
    .line 695
    .line 696
    :cond_15
    if-eqz v1, :cond_16

    .line 697
    .line 698
    invoke-virtual {v1, p0}, Lw/f;->b(Lw/o;)V

    .line 699
    .line 700
    .line 701
    :cond_16
    iput v6, p0, Lw/o;->j:I

    .line 702
    .line 703
    return-void

    .line 704
    :cond_17
    if-eqz v9, :cond_18

    .line 705
    .line 706
    invoke-static {v8}, Lw/o;->h(Lv/c;)Lw/f;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    if-eqz v0, :cond_1a

    .line 711
    .line 712
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 713
    .line 714
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 715
    .line 716
    aget-object v5, v5, v7

    .line 717
    .line 718
    invoke-virtual {v5}, Lv/c;->e()I

    .line 719
    .line 720
    .line 721
    move-result v5

    .line 722
    invoke-static {v3, v0, v5}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {p0, v1, v3, v4, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :cond_18
    aget-object v5, v5, v4

    .line 730
    .line 731
    iget-object v6, v5, Lv/c;->f:Lv/c;

    .line 732
    .line 733
    if-eqz v6, :cond_19

    .line 734
    .line 735
    invoke-static {v5}, Lw/o;->h(Lv/c;)Lw/f;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    if-eqz v0, :cond_1a

    .line 740
    .line 741
    iget-object v5, p0, Lw/o;->b:Lv/d;

    .line 742
    .line 743
    iget-object v5, v5, Lv/d;->Q:[Lv/c;

    .line 744
    .line 745
    aget-object v4, v5, v4

    .line 746
    .line 747
    invoke-virtual {v4}, Lv/c;->e()I

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    neg-int v4, v4

    .line 752
    invoke-static {v1, v0, v4}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 753
    .line 754
    .line 755
    const/4 v0, -0x1

    .line 756
    invoke-virtual {p0, v3, v1, v0, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :cond_19
    instance-of v5, v0, Lv/i;

    .line 761
    .line 762
    if-nez v5, :cond_1a

    .line 763
    .line 764
    iget-object v5, v0, Lv/d;->T:Lv/d;

    .line 765
    .line 766
    if-eqz v5, :cond_1a

    .line 767
    .line 768
    iget-object v5, v5, Lv/d;->d:Lw/k;

    .line 769
    .line 770
    iget-object v5, v5, Lw/o;->h:Lw/f;

    .line 771
    .line 772
    invoke-virtual {v0}, Lv/d;->r()I

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    invoke-static {v3, v5, v0}, Lw/o;->b(Lw/f;Lw/f;I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {p0, v1, v3, v4, v2}, Lw/o;->c(Lw/f;Lw/f;ILw/g;)V

    .line 780
    .line 781
    .line 782
    :cond_1a
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/f;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lw/f;->g:I

    .line 10
    .line 11
    iput v0, v1, Lv/d;->Y:I

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/o;->c:Lw/l;

    .line 3
    .line 4
    iget-object v0, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lw/o;->i:Lw/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw/f;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw/o;->e:Lw/g;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw/f;->c()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 21
    .line 22
    return-void
.end method

.method public final k()Z
    .locals 2

    .line 1
    iget v0, p0, Lw/o;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lw/o;->b:Lv/d;

    .line 7
    .line 8
    iget v0, v0, Lv/d;->r:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public final n()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/o;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Lw/o;->h:Lw/f;

    .line 5
    .line 6
    invoke-virtual {v1}, Lw/f;->c()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lw/o;->i:Lw/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw/f;->c()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/o;->e:Lw/g;

    .line 19
    .line 20
    iput-boolean v0, v1, Lw/f;->j:Z

    .line 21
    .line 22
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HorizontalRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw/o;->b:Lv/d;

    .line 9
    .line 10
    iget-object v1, v1, Lv/d;->h0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.class public final Ll0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Ll0/k;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lq/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll0/n;->p:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll0/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Ll0/n;->h:F

    .line 4
    iput v0, p0, Ll0/n;->i:F

    .line 5
    iput v0, p0, Ll0/n;->j:F

    .line 6
    iput v0, p0, Ll0/n;->k:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, Ll0/n;->l:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ll0/n;->m:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Ll0/n;->n:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Lq/f;

    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lq/j;-><init>(I)V

    .line 12
    iput-object v0, p0, Ll0/n;->o:Lq/f;

    .line 13
    new-instance v0, Ll0/k;

    invoke-direct {v0}, Ll0/k;-><init>()V

    iput-object v0, p0, Ll0/n;->g:Ll0/k;

    .line 14
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll0/n;->a:Landroid/graphics/Path;

    .line 15
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll0/n;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Ll0/n;)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll0/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Ll0/n;->h:F

    .line 19
    iput v0, p0, Ll0/n;->i:F

    .line 20
    iput v0, p0, Ll0/n;->j:F

    .line 21
    iput v0, p0, Ll0/n;->k:F

    const/16 v0, 0xff

    .line 22
    iput v0, p0, Ll0/n;->l:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Ll0/n;->m:Ljava/lang/String;

    .line 24
    iput-object v0, p0, Ll0/n;->n:Ljava/lang/Boolean;

    .line 25
    new-instance v0, Lq/f;

    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Lq/j;-><init>(I)V

    .line 27
    iput-object v0, p0, Ll0/n;->o:Lq/f;

    .line 28
    new-instance v1, Ll0/k;

    iget-object v2, p1, Ll0/n;->g:Ll0/k;

    invoke-direct {v1, v2, v0}, Ll0/k;-><init>(Ll0/k;Lq/f;)V

    iput-object v1, p0, Ll0/n;->g:Ll0/k;

    .line 29
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll0/n;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll0/n;->a:Landroid/graphics/Path;

    .line 30
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll0/n;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll0/n;->b:Landroid/graphics/Path;

    .line 31
    iget v1, p1, Ll0/n;->h:F

    iput v1, p0, Ll0/n;->h:F

    .line 32
    iget v1, p1, Ll0/n;->i:F

    iput v1, p0, Ll0/n;->i:F

    .line 33
    iget v1, p1, Ll0/n;->j:F

    iput v1, p0, Ll0/n;->j:F

    .line 34
    iget v1, p1, Ll0/n;->k:F

    iput v1, p0, Ll0/n;->k:F

    .line 35
    iget v1, p1, Ll0/n;->l:I

    iput v1, p0, Ll0/n;->l:I

    .line 36
    iget-object v1, p1, Ll0/n;->m:Ljava/lang/String;

    iput-object v1, p0, Ll0/n;->m:Ljava/lang/String;

    .line 37
    iget-object v1, p1, Ll0/n;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v0, v1, p0}, Lq/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_0
    iget-object p1, p1, Ll0/n;->n:Ljava/lang/Boolean;

    iput-object p1, p0, Ll0/n;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Ll0/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 21

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    const/4 v7, 0x1

    .line 4
    iget-object v0, v6, Ll0/k;->a:Landroid/graphics/Matrix;

    .line 5
    .line 6
    move-object/from16 v1, p2

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v6, Ll0/k;->a:Landroid/graphics/Matrix;

    .line 12
    .line 13
    iget-object v0, v6, Ll0/k;->j:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 19
    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    :goto_0
    iget-object v0, v6, Ll0/k;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v9, v1, :cond_17

    .line 30
    .line 31
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ll0/l;

    .line 36
    .line 37
    instance-of v1, v0, Ll0/k;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Ll0/k;

    .line 43
    .line 44
    move-object/from16 v0, p0

    .line 45
    .line 46
    move-object/from16 v3, p3

    .line 47
    .line 48
    move/from16 v4, p4

    .line 49
    .line 50
    move/from16 v5, p5

    .line 51
    .line 52
    invoke-virtual/range {v0 .. v5}, Ll0/n;->a(Ll0/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 53
    .line 54
    .line 55
    move-object v1, v0

    .line 56
    :goto_1
    move/from16 v10, p5

    .line 57
    .line 58
    :cond_0
    :goto_2
    const/16 v19, 0x1

    .line 59
    .line 60
    goto/16 :goto_e

    .line 61
    .line 62
    :cond_1
    move-object/from16 v1, p0

    .line 63
    .line 64
    move-object/from16 v3, p3

    .line 65
    .line 66
    instance-of v4, v0, Ll0/m;

    .line 67
    .line 68
    if-eqz v4, :cond_16

    .line 69
    .line 70
    check-cast v0, Ll0/m;

    .line 71
    .line 72
    move/from16 v4, p4

    .line 73
    .line 74
    int-to-float v5, v4

    .line 75
    iget v10, v1, Ll0/n;->j:F

    .line 76
    .line 77
    div-float/2addr v5, v10

    .line 78
    move/from16 v10, p5

    .line 79
    .line 80
    int-to-float v11, v10

    .line 81
    iget v12, v1, Ll0/n;->k:F

    .line 82
    .line 83
    div-float/2addr v11, v12

    .line 84
    invoke-static {v5, v11}, Ljava/lang/Math;->min(FF)F

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    iget-object v13, v1, Ll0/n;->c:Landroid/graphics/Matrix;

    .line 89
    .line 90
    invoke-virtual {v13, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v5, v11}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 94
    .line 95
    .line 96
    const/4 v14, 0x4

    .line 97
    new-array v14, v14, [F

    .line 98
    .line 99
    fill-array-data v14, :array_0

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v14}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 103
    .line 104
    .line 105
    aget v15, v14, v8

    .line 106
    .line 107
    move/from16 p2, v12

    .line 108
    .line 109
    const/high16 v16, 0x3f800000    # 1.0f

    .line 110
    .line 111
    float-to-double v11, v15

    .line 112
    aget v15, v14, v7

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    float-to-double v5, v15

    .line 117
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    double-to-float v5, v5

    .line 122
    const/4 v6, 0x2

    .line 123
    aget v11, v14, v6

    .line 124
    .line 125
    float-to-double v11, v11

    .line 126
    const/4 v15, 0x3

    .line 127
    const/16 v18, 0x2

    .line 128
    .line 129
    aget v6, v14, v15

    .line 130
    .line 131
    const/16 v19, 0x1

    .line 132
    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    float-to-double v7, v6

    .line 136
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    double-to-float v6, v6

    .line 141
    aget v7, v14, v20

    .line 142
    .line 143
    aget v8, v14, v19

    .line 144
    .line 145
    aget v11, v14, v18

    .line 146
    .line 147
    aget v12, v14, v15

    .line 148
    .line 149
    mul-float v7, v7, v12

    .line 150
    .line 151
    mul-float v8, v8, v11

    .line 152
    .line 153
    sub-float/2addr v7, v8

    .line 154
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    cmpl-float v6, v5, v17

    .line 159
    .line 160
    if-lez v6, :cond_2

    .line 161
    .line 162
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    div-float/2addr v6, v5

    .line 167
    goto :goto_3

    .line 168
    :cond_2
    const/4 v6, 0x0

    .line 169
    :goto_3
    cmpl-float v5, v6, v17

    .line 170
    .line 171
    if-nez v5, :cond_3

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v5, v1, Ll0/n;->a:Landroid/graphics/Path;

    .line 178
    .line 179
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 180
    .line 181
    .line 182
    iget-object v7, v0, Ll0/m;->a:[LF/f;

    .line 183
    .line 184
    if-eqz v7, :cond_4

    .line 185
    .line 186
    invoke-static {v7, v5}, LF/f;->b([LF/f;Landroid/graphics/Path;)V

    .line 187
    .line 188
    .line 189
    :cond_4
    iget-object v7, v1, Ll0/n;->b:Landroid/graphics/Path;

    .line 190
    .line 191
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 192
    .line 193
    .line 194
    instance-of v8, v0, Ll0/i;

    .line 195
    .line 196
    if-eqz v8, :cond_6

    .line 197
    .line 198
    iget v0, v0, Ll0/m;->c:I

    .line 199
    .line 200
    if-nez v0, :cond_5

    .line 201
    .line 202
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_5
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 206
    .line 207
    :goto_4
    invoke-virtual {v7, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v5, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v7}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 214
    .line 215
    .line 216
    goto/16 :goto_2

    .line 217
    .line 218
    :cond_6
    check-cast v0, Ll0/j;

    .line 219
    .line 220
    iget v8, v0, Ll0/j;->i:F

    .line 221
    .line 222
    cmpl-float v11, v8, v17

    .line 223
    .line 224
    if-nez v11, :cond_7

    .line 225
    .line 226
    iget v11, v0, Ll0/j;->j:F

    .line 227
    .line 228
    cmpl-float v11, v11, v16

    .line 229
    .line 230
    if-eqz v11, :cond_a

    .line 231
    .line 232
    :cond_7
    iget v11, v0, Ll0/j;->k:F

    .line 233
    .line 234
    add-float/2addr v8, v11

    .line 235
    rem-float v8, v8, v16

    .line 236
    .line 237
    iget v12, v0, Ll0/j;->j:F

    .line 238
    .line 239
    add-float/2addr v12, v11

    .line 240
    rem-float v12, v12, v16

    .line 241
    .line 242
    iget-object v11, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 243
    .line 244
    if-nez v11, :cond_8

    .line 245
    .line 246
    new-instance v11, Landroid/graphics/PathMeasure;

    .line 247
    .line 248
    invoke-direct {v11}, Landroid/graphics/PathMeasure;-><init>()V

    .line 249
    .line 250
    .line 251
    iput-object v11, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 252
    .line 253
    :cond_8
    iget-object v11, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    invoke-virtual {v11, v5, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 257
    .line 258
    .line 259
    iget-object v11, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 260
    .line 261
    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->getLength()F

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    mul-float v8, v8, v11

    .line 266
    .line 267
    mul-float v12, v12, v11

    .line 268
    .line 269
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 270
    .line 271
    .line 272
    cmpl-float v15, v8, v12

    .line 273
    .line 274
    if-lez v15, :cond_9

    .line 275
    .line 276
    iget-object v15, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 277
    .line 278
    const/4 v14, 0x1

    .line 279
    invoke-virtual {v15, v8, v11, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 280
    .line 281
    .line 282
    iget-object v8, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 283
    .line 284
    const/4 v11, 0x0

    .line 285
    invoke-virtual {v8, v11, v12, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 286
    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_9
    const/4 v11, 0x0

    .line 290
    const/4 v14, 0x1

    .line 291
    iget-object v15, v1, Ll0/n;->f:Landroid/graphics/PathMeasure;

    .line 292
    .line 293
    invoke-virtual {v15, v8, v12, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 294
    .line 295
    .line 296
    :goto_5
    invoke-virtual {v5, v11, v11}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 297
    .line 298
    .line 299
    :cond_a
    invoke-virtual {v7, v5, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 300
    .line 301
    .line 302
    iget-object v5, v0, Ll0/j;->f:LE/d;

    .line 303
    .line 304
    iget-object v8, v5, LE/d;->a:Landroid/graphics/Shader;

    .line 305
    .line 306
    if-eqz v8, :cond_b

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_b
    iget v8, v5, LE/d;->c:I

    .line 310
    .line 311
    if-eqz v8, :cond_c

    .line 312
    .line 313
    :goto_6
    const/4 v8, 0x1

    .line 314
    goto :goto_7

    .line 315
    :cond_c
    const/4 v8, 0x0

    .line 316
    :goto_7
    const/4 v12, 0x0

    .line 317
    const/16 v14, 0xff

    .line 318
    .line 319
    const/high16 v15, 0x437f0000    # 255.0f

    .line 320
    .line 321
    if-eqz v8, :cond_10

    .line 322
    .line 323
    iget-object v8, v1, Ll0/n;->e:Landroid/graphics/Paint;

    .line 324
    .line 325
    if-nez v8, :cond_d

    .line 326
    .line 327
    new-instance v8, Landroid/graphics/Paint;

    .line 328
    .line 329
    const/4 v11, 0x1

    .line 330
    const v16, 0xffffff

    .line 331
    .line 332
    .line 333
    invoke-direct {v8, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 334
    .line 335
    .line 336
    iput-object v8, v1, Ll0/n;->e:Landroid/graphics/Paint;

    .line 337
    .line 338
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 339
    .line 340
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_d
    const v16, 0xffffff

    .line 345
    .line 346
    .line 347
    :goto_8
    iget-object v8, v1, Ll0/n;->e:Landroid/graphics/Paint;

    .line 348
    .line 349
    iget-object v11, v5, LE/d;->a:Landroid/graphics/Shader;

    .line 350
    .line 351
    if-eqz v11, :cond_e

    .line 352
    .line 353
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 357
    .line 358
    .line 359
    iget v5, v0, Ll0/j;->h:F

    .line 360
    .line 361
    mul-float v5, v5, v15

    .line 362
    .line 363
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x437f0000    # 255.0f

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_e
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 377
    .line 378
    .line 379
    iget v5, v5, LE/d;->c:I

    .line 380
    .line 381
    iget v11, v0, Ll0/j;->h:F

    .line 382
    .line 383
    sget-object v17, Ll0/q;->j:Landroid/graphics/PorterDuff$Mode;

    .line 384
    .line 385
    const/high16 v17, 0x437f0000    # 255.0f

    .line 386
    .line 387
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 388
    .line 389
    .line 390
    move-result v15

    .line 391
    and-int v5, v5, v16

    .line 392
    .line 393
    int-to-float v15, v15

    .line 394
    mul-float v15, v15, v11

    .line 395
    .line 396
    float-to-int v11, v15

    .line 397
    shl-int/lit8 v11, v11, 0x18

    .line 398
    .line 399
    or-int/2addr v5, v11

    .line 400
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 401
    .line 402
    .line 403
    :goto_9
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 404
    .line 405
    .line 406
    iget v5, v0, Ll0/m;->c:I

    .line 407
    .line 408
    if-nez v5, :cond_f

    .line 409
    .line 410
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_f
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 414
    .line 415
    :goto_a
    invoke-virtual {v7, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v7, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 419
    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_10
    const v16, 0xffffff

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x437f0000    # 255.0f

    .line 426
    .line 427
    :goto_b
    iget-object v5, v0, Ll0/j;->d:LE/d;

    .line 428
    .line 429
    iget-object v8, v5, LE/d;->a:Landroid/graphics/Shader;

    .line 430
    .line 431
    if-eqz v8, :cond_11

    .line 432
    .line 433
    goto :goto_c

    .line 434
    :cond_11
    iget v8, v5, LE/d;->c:I

    .line 435
    .line 436
    if-eqz v8, :cond_0

    .line 437
    .line 438
    :goto_c
    iget-object v8, v1, Ll0/n;->d:Landroid/graphics/Paint;

    .line 439
    .line 440
    if-nez v8, :cond_12

    .line 441
    .line 442
    new-instance v8, Landroid/graphics/Paint;

    .line 443
    .line 444
    const/4 v11, 0x1

    .line 445
    invoke-direct {v8, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 446
    .line 447
    .line 448
    iput-object v8, v1, Ll0/n;->d:Landroid/graphics/Paint;

    .line 449
    .line 450
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 451
    .line 452
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 453
    .line 454
    .line 455
    :cond_12
    iget-object v8, v1, Ll0/n;->d:Landroid/graphics/Paint;

    .line 456
    .line 457
    iget-object v11, v0, Ll0/j;->m:Landroid/graphics/Paint$Join;

    .line 458
    .line 459
    if-eqz v11, :cond_13

    .line 460
    .line 461
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 462
    .line 463
    .line 464
    :cond_13
    iget-object v11, v0, Ll0/j;->l:Landroid/graphics/Paint$Cap;

    .line 465
    .line 466
    if-eqz v11, :cond_14

    .line 467
    .line 468
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 469
    .line 470
    .line 471
    :cond_14
    iget v11, v0, Ll0/j;->n:F

    .line 472
    .line 473
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 474
    .line 475
    .line 476
    iget-object v11, v5, LE/d;->a:Landroid/graphics/Shader;

    .line 477
    .line 478
    if-eqz v11, :cond_15

    .line 479
    .line 480
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 484
    .line 485
    .line 486
    iget v5, v0, Ll0/j;->g:F

    .line 487
    .line 488
    mul-float v5, v5, v17

    .line 489
    .line 490
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 495
    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_15
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v8, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 502
    .line 503
    .line 504
    iget v5, v5, LE/d;->c:I

    .line 505
    .line 506
    iget v11, v0, Ll0/j;->g:F

    .line 507
    .line 508
    sget-object v13, Ll0/q;->j:Landroid/graphics/PorterDuff$Mode;

    .line 509
    .line 510
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 511
    .line 512
    .line 513
    move-result v13

    .line 514
    and-int v5, v5, v16

    .line 515
    .line 516
    int-to-float v13, v13

    .line 517
    mul-float v13, v13, v11

    .line 518
    .line 519
    float-to-int v11, v13

    .line 520
    shl-int/lit8 v11, v11, 0x18

    .line 521
    .line 522
    or-int/2addr v5, v11

    .line 523
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 524
    .line 525
    .line 526
    :goto_d
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 527
    .line 528
    .line 529
    mul-float v12, p2, v6

    .line 530
    .line 531
    iget v0, v0, Ll0/j;->e:F

    .line 532
    .line 533
    mul-float v0, v0, v12

    .line 534
    .line 535
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3, v7, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_2

    .line 542
    .line 543
    :cond_16
    move/from16 v4, p4

    .line 544
    .line 545
    goto/16 :goto_1

    .line 546
    .line 547
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 548
    .line 549
    move-object/from16 v6, p1

    .line 550
    .line 551
    const/4 v7, 0x1

    .line 552
    const/4 v8, 0x0

    .line 553
    goto/16 :goto_0

    .line 554
    .line 555
    :cond_17
    move-object/from16 v1, p0

    .line 556
    .line 557
    move-object/from16 v3, p3

    .line 558
    .line 559
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll0/n;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Ll0/n;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float p1, p1, v0

    .line 4
    .line 5
    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, p1}, Ll0/n;->setRootAlpha(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/n;->l:I

    .line 2
    .line 3
    return-void
.end method

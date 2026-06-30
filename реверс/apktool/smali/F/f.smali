.class public final LF/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:C

.field public final b:[F


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-char p1, p0, LF/f;->a:C

    .line 3
    iput-object p2, p0, LF/f;->b:[F

    return-void
.end method

.method public constructor <init>(LF/f;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-char v0, p1, LF/f;->a:C

    iput-char v0, p0, LF/f;->a:C

    .line 6
    iget-object p1, p1, LF/f;->b:[F

    array-length v0, p1

    invoke-static {p1, v0}, LA0/e;->q([FI)[F

    move-result-object p1

    iput-object p1, p0, LF/f;->b:[F

    return-void
.end method

.method public static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 53

    move/from16 v1, p1

    move/from16 v3, p3

    move/from16 v0, p5

    move/from16 v2, p6

    move/from16 v7, p7

    float-to-double v4, v7

    .line 1
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 2
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    .line 3
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    float-to-double v12, v1

    mul-double v14, v12, v8

    move/from16 v6, p2

    move-wide/from16 v16, v4

    float-to-double v4, v6

    mul-double v18, v4, v10

    add-double v18, v18, v14

    float-to-double v14, v0

    div-double v18, v18, v14

    neg-float v0, v1

    float-to-double v0, v0

    mul-double v0, v0, v10

    mul-double v20, v4, v8

    add-double v20, v20, v0

    float-to-double v0, v2

    div-double v20, v20, v0

    move-wide/from16 v22, v0

    float-to-double v0, v3

    mul-double v0, v0, v8

    move-wide/from16 v24, v0

    move/from16 v0, p4

    float-to-double v1, v0

    mul-double v26, v1, v10

    add-double v26, v26, v24

    div-double v26, v26, v14

    neg-float v0, v3

    move-wide/from16 v24, v1

    float-to-double v0, v0

    mul-double v0, v0, v10

    mul-double v24, v24, v8

    add-double v24, v24, v0

    div-double v24, v24, v22

    sub-double v0, v18, v26

    sub-double v28, v20, v24

    add-double v30, v18, v26

    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    div-double v30, v30, v32

    add-double v34, v20, v24

    div-double v34, v34, v32

    mul-double v36, v0, v0

    mul-double v38, v28, v28

    move-wide/from16 v40, v0

    add-double v0, v38, v36

    .line 4
    const-string v2, "PathParser"

    const-wide/16 v36, 0x0

    cmpl-double v38, v0, v36

    if-nez v38, :cond_0

    .line 5
    const-string v0, " Points are coincident"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-wide/high16 v38, 0x3ff0000000000000L    # 1.0

    div-double v42, v38, v0

    const-wide/high16 v44, 0x3fd0000000000000L    # 0.25

    sub-double v42, v42, v44

    cmpg-double v44, v42, v36

    if-gez v44, :cond_1

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Points are too far apart "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v4, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v0, v4

    double-to-float v0, v0

    mul-float v5, p5, v0

    mul-float v0, v0, p6

    move/from16 v1, p1

    move/from16 v4, p4

    move/from16 v8, p8

    move/from16 v9, p9

    move v2, v6

    move v6, v0

    move-object/from16 v0, p0

    .line 8
    invoke-static/range {v0 .. v9}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    return-void

    :cond_1
    move/from16 v0, p9

    .line 9
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    mul-double v6, v1, v40

    mul-double v1, v1, v28

    move/from16 v3, p8

    if-ne v3, v0, :cond_2

    sub-double v30, v30, v1

    add-double v34, v34, v6

    goto :goto_0

    :cond_2
    add-double v30, v30, v1

    sub-double v34, v34, v6

    :goto_0
    sub-double v1, v20, v34

    sub-double v6, v18, v30

    .line 10
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    sub-double v6, v24, v34

    move-wide/from16 p1, v1

    sub-double v1, v26, v30

    .line 11
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    sub-double v1, v1, p1

    cmpl-double v6, v1, v36

    if-ltz v6, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-eq v0, v7, :cond_5

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    if-lez v6, :cond_4

    sub-double v1, v1, v18

    goto :goto_2

    :cond_4
    add-double v1, v1, v18

    :cond_5
    :goto_2
    mul-double v30, v30, v14

    mul-double v34, v34, v22

    mul-double v6, v30, v8

    mul-double v18, v34, v10

    sub-double v6, v6, v18

    mul-double v30, v30, v10

    mul-double v34, v34, v8

    add-double v34, v34, v30

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    mul-double v10, v1, v8

    const-wide v18, 0x400921fb54442d18L    # Math.PI

    div-double v10, v10, v18

    .line 12
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v0, v10

    .line 13
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    .line 14
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    move-result-wide v16

    .line 15
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    .line 16
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v20

    move-wide/from16 v24, v4

    neg-double v3, v14

    mul-double v26, v3, v10

    mul-double v28, v26, v20

    mul-double v30, v22, v16

    mul-double v36, v30, v18

    sub-double v28, v28, v36

    mul-double v3, v3, v16

    mul-double v20, v20, v3

    mul-double v22, v22, v10

    mul-double v18, v18, v22

    add-double v18, v18, v20

    move-wide/from16 p8, v8

    int-to-double v8, v0

    div-double/2addr v1, v8

    move-wide/from16 v8, p1

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v0, :cond_6

    add-double v20, v8, v1

    .line 17
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sin(D)D

    move-result-wide v36

    .line 18
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->cos(D)D

    move-result-wide v40

    mul-double v42, v14, v10

    mul-double v42, v42, v40

    add-double v42, v42, v6

    mul-double v44, v30, v36

    move/from16 v46, v0

    move-wide/from16 v47, v1

    sub-double v0, v42, v44

    mul-double v42, v14, v16

    mul-double v42, v42, v40

    add-double v42, v42, v34

    mul-double v44, v22, v36

    move-wide/from16 v49, v3

    add-double v2, v44, v42

    mul-double v42, v26, v36

    mul-double v44, v30, v40

    sub-double v42, v42, v44

    mul-double v36, v36, v49

    mul-double v40, v40, v22

    add-double v36, v40, v36

    sub-double v8, v20, v8

    div-double v40, v8, v32

    .line 19
    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->tan(D)D

    move-result-wide v40

    .line 20
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    const-wide/high16 v44, 0x4008000000000000L    # 3.0

    mul-double v51, v40, v44

    mul-double v51, v51, v40

    add-double v51, v51, p8

    invoke-static/range {v51 .. v52}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v40

    sub-double v40, v40, v38

    mul-double v40, v40, v8

    div-double v40, v40, v44

    mul-double v28, v28, v40

    add-double v8, v28, v12

    mul-double v18, v18, v40

    add-double v12, v18, v24

    mul-double v18, v40, v42

    move/from16 v24, v5

    sub-double v4, v0, v18

    mul-double v40, v40, v36

    move-wide/from16 v18, v6

    sub-double v6, v2, v40

    move-wide/from16 v28, v10

    const/4 v10, 0x0

    move-object/from16 v11, p0

    .line 21
    invoke-virtual {v11, v10, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    double-to-float v8, v8

    double-to-float v9, v12

    double-to-float v4, v4

    double-to-float v5, v6

    double-to-float v6, v0

    double-to-float v7, v2

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p2, v8

    move/from16 p3, v9

    move-object/from16 p1, v11

    .line 22
    invoke-virtual/range {p1 .. p7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v5, v24, 0x1

    move-wide v12, v0

    move-wide/from16 v24, v2

    move-wide/from16 v6, v18

    move-wide/from16 v8, v20

    move-wide/from16 v10, v28

    move-wide/from16 v18, v36

    move-wide/from16 v28, v42

    move/from16 v0, v46

    move-wide/from16 v1, v47

    move-wide/from16 v3, v49

    goto/16 :goto_3

    :cond_6
    return-void
.end method

.method public static b([LF/f;Landroid/graphics/Path;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v11, 0x6

    .line 6
    new-array v12, v11, [F

    .line 7
    .line 8
    array-length v13, v0

    .line 9
    const/16 v14, 0x6d

    .line 10
    .line 11
    const/4 v15, 0x0

    .line 12
    const/16 v2, 0x6d

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    :goto_0
    if-ge v8, v13, :cond_21

    .line 16
    .line 17
    aget-object v9, v0, v8

    .line 18
    .line 19
    iget-char v10, v9, LF/f;->a:C

    .line 20
    .line 21
    aget v3, v12, v15

    .line 22
    .line 23
    const/16 v16, 0x1

    .line 24
    .line 25
    aget v4, v12, v16

    .line 26
    .line 27
    const/16 v17, 0x2

    .line 28
    .line 29
    aget v5, v12, v17

    .line 30
    .line 31
    const/16 v18, 0x3

    .line 32
    .line 33
    aget v6, v12, v18

    .line 34
    .line 35
    const/16 v19, 0x4

    .line 36
    .line 37
    aget v7, v12, v19

    .line 38
    .line 39
    const/16 v20, 0x5

    .line 40
    .line 41
    aget v11, v12, v20

    .line 42
    .line 43
    sparse-switch v10, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    :goto_1
    const/16 v21, 0x2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :sswitch_0
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v7, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 53
    .line 54
    .line 55
    move v3, v7

    .line 56
    move v5, v3

    .line 57
    move v4, v11

    .line 58
    move v6, v4

    .line 59
    goto :goto_1

    .line 60
    :sswitch_1
    const/16 v21, 0x4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :sswitch_2
    const/16 v21, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :sswitch_3
    const/16 v21, 0x6

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :sswitch_4
    const/16 v21, 0x7

    .line 70
    .line 71
    :goto_2
    move/from16 v22, v4

    .line 72
    .line 73
    move/from16 v23, v7

    .line 74
    .line 75
    move/from16 v24, v11

    .line 76
    .line 77
    move v11, v3

    .line 78
    const/4 v3, 0x0

    .line 79
    :goto_3
    iget-object v4, v9, LF/f;->b:[F

    .line 80
    .line 81
    array-length v7, v4

    .line 82
    if-ge v3, v7, :cond_20

    .line 83
    .line 84
    const/16 v7, 0x41

    .line 85
    .line 86
    const/16 v25, 0x0

    .line 87
    .line 88
    if-eq v10, v7, :cond_1d

    .line 89
    .line 90
    const/16 v7, 0x43

    .line 91
    .line 92
    if-eq v10, v7, :cond_1c

    .line 93
    .line 94
    const/16 v15, 0x48

    .line 95
    .line 96
    if-eq v10, v15, :cond_1b

    .line 97
    .line 98
    const/16 v15, 0x51

    .line 99
    .line 100
    if-eq v10, v15, :cond_1a

    .line 101
    .line 102
    const/16 v7, 0x56

    .line 103
    .line 104
    if-eq v10, v7, :cond_19

    .line 105
    .line 106
    const/16 v7, 0x61

    .line 107
    .line 108
    if-eq v10, v7, :cond_16

    .line 109
    .line 110
    const/16 v7, 0x63

    .line 111
    .line 112
    if-eq v10, v7, :cond_15

    .line 113
    .line 114
    const/16 v7, 0x68

    .line 115
    .line 116
    if-eq v10, v7, :cond_14

    .line 117
    .line 118
    const/16 v7, 0x71

    .line 119
    .line 120
    if-eq v10, v7, :cond_13

    .line 121
    .line 122
    const/16 v15, 0x76

    .line 123
    .line 124
    if-eq v10, v15, :cond_12

    .line 125
    .line 126
    const/16 v15, 0x4c

    .line 127
    .line 128
    if-eq v10, v15, :cond_11

    .line 129
    .line 130
    const/16 v15, 0x4d

    .line 131
    .line 132
    if-eq v10, v15, :cond_f

    .line 133
    .line 134
    const/16 v15, 0x73

    .line 135
    .line 136
    const/16 v7, 0x53

    .line 137
    .line 138
    const/high16 v31, 0x40000000    # 2.0f

    .line 139
    .line 140
    if-eq v10, v7, :cond_c

    .line 141
    .line 142
    const/16 v7, 0x54

    .line 143
    .line 144
    if-eq v10, v7, :cond_9

    .line 145
    .line 146
    const/16 v7, 0x6c

    .line 147
    .line 148
    if-eq v10, v7, :cond_8

    .line 149
    .line 150
    if-eq v10, v14, :cond_6

    .line 151
    .line 152
    if-eq v10, v15, :cond_3

    .line 153
    .line 154
    const/16 v7, 0x74

    .line 155
    .line 156
    if-eq v10, v7, :cond_0

    .line 157
    .line 158
    move/from16 v30, v3

    .line 159
    .line 160
    :goto_4
    move-object v14, v9

    .line 161
    move v2, v11

    .line 162
    :goto_5
    move/from16 v3, v22

    .line 163
    .line 164
    :goto_6
    move/from16 v22, v8

    .line 165
    .line 166
    :goto_7
    move v11, v10

    .line 167
    goto/16 :goto_1d

    .line 168
    .line 169
    :cond_0
    const/16 v15, 0x71

    .line 170
    .line 171
    if-eq v2, v15, :cond_2

    .line 172
    .line 173
    if-eq v2, v7, :cond_2

    .line 174
    .line 175
    const/16 v7, 0x51

    .line 176
    .line 177
    if-eq v2, v7, :cond_2

    .line 178
    .line 179
    const/16 v7, 0x54

    .line 180
    .line 181
    if-ne v2, v7, :cond_1

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_1
    const/4 v2, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    goto :goto_9

    .line 187
    :cond_2
    :goto_8
    sub-float v15, v11, v5

    .line 188
    .line 189
    sub-float v2, v22, v6

    .line 190
    .line 191
    :goto_9
    aget v5, v4, v3

    .line 192
    .line 193
    add-int/lit8 v6, v3, 0x1

    .line 194
    .line 195
    aget v7, v4, v6

    .line 196
    .line 197
    invoke-virtual {v1, v15, v2, v5, v7}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 198
    .line 199
    .line 200
    add-float/2addr v15, v11

    .line 201
    add-float v2, v22, v2

    .line 202
    .line 203
    aget v5, v4, v3

    .line 204
    .line 205
    add-float/2addr v11, v5

    .line 206
    aget v4, v4, v6

    .line 207
    .line 208
    add-float v22, v22, v4

    .line 209
    .line 210
    move v6, v2

    .line 211
    move/from16 v30, v3

    .line 212
    .line 213
    move-object v14, v9

    .line 214
    move v2, v11

    .line 215
    move v5, v15

    .line 216
    goto :goto_5

    .line 217
    :cond_3
    const/16 v7, 0x63

    .line 218
    .line 219
    if-eq v2, v7, :cond_5

    .line 220
    .line 221
    if-eq v2, v15, :cond_5

    .line 222
    .line 223
    const/16 v7, 0x43

    .line 224
    .line 225
    if-eq v2, v7, :cond_5

    .line 226
    .line 227
    const/16 v7, 0x53

    .line 228
    .line 229
    if-ne v2, v7, :cond_4

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_4
    const/4 v2, 0x0

    .line 233
    const/4 v15, 0x0

    .line 234
    :goto_a
    move-object v5, v4

    .line 235
    goto :goto_c

    .line 236
    :cond_5
    :goto_b
    sub-float v15, v11, v5

    .line 237
    .line 238
    sub-float v2, v22, v6

    .line 239
    .line 240
    move v5, v15

    .line 241
    move v15, v2

    .line 242
    move v2, v5

    .line 243
    goto :goto_a

    .line 244
    :goto_c
    aget v4, v5, v3

    .line 245
    .line 246
    add-int/lit8 v26, v3, 0x1

    .line 247
    .line 248
    move-object v6, v5

    .line 249
    aget v5, v6, v26

    .line 250
    .line 251
    add-int/lit8 v27, v3, 0x2

    .line 252
    .line 253
    move-object v7, v6

    .line 254
    aget v6, v7, v27

    .line 255
    .line 256
    add-int/lit8 v28, v3, 0x3

    .line 257
    .line 258
    move-object/from16 v29, v7

    .line 259
    .line 260
    aget v7, v29, v28

    .line 261
    .line 262
    move/from16 v30, v3

    .line 263
    .line 264
    move v3, v15

    .line 265
    move-object/from16 v32, v29

    .line 266
    .line 267
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 268
    .line 269
    .line 270
    aget v2, v32, v30

    .line 271
    .line 272
    add-float/2addr v2, v11

    .line 273
    aget v3, v32, v26

    .line 274
    .line 275
    add-float v3, v22, v3

    .line 276
    .line 277
    aget v4, v32, v27

    .line 278
    .line 279
    add-float/2addr v11, v4

    .line 280
    aget v4, v32, v28

    .line 281
    .line 282
    :goto_d
    add-float v22, v22, v4

    .line 283
    .line 284
    move v5, v2

    .line 285
    move v6, v3

    .line 286
    goto :goto_4

    .line 287
    :cond_6
    move/from16 v30, v3

    .line 288
    .line 289
    move-object/from16 v32, v4

    .line 290
    .line 291
    aget v2, v32, v30

    .line 292
    .line 293
    add-float/2addr v11, v2

    .line 294
    add-int/lit8 v3, v30, 0x1

    .line 295
    .line 296
    aget v3, v32, v3

    .line 297
    .line 298
    add-float v22, v22, v3

    .line 299
    .line 300
    if-lez v30, :cond_7

    .line 301
    .line 302
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_4

    .line 306
    .line 307
    :cond_7
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 308
    .line 309
    .line 310
    move-object v14, v9

    .line 311
    move v2, v11

    .line 312
    move/from16 v23, v2

    .line 313
    .line 314
    move/from16 v3, v22

    .line 315
    .line 316
    move/from16 v24, v3

    .line 317
    .line 318
    goto/16 :goto_6

    .line 319
    .line 320
    :cond_8
    move/from16 v30, v3

    .line 321
    .line 322
    move-object/from16 v32, v4

    .line 323
    .line 324
    aget v2, v32, v30

    .line 325
    .line 326
    add-int/lit8 v3, v30, 0x1

    .line 327
    .line 328
    aget v4, v32, v3

    .line 329
    .line 330
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 331
    .line 332
    .line 333
    aget v2, v32, v30

    .line 334
    .line 335
    add-float/2addr v11, v2

    .line 336
    aget v2, v32, v3

    .line 337
    .line 338
    :goto_e
    add-float v22, v22, v2

    .line 339
    .line 340
    goto/16 :goto_4

    .line 341
    .line 342
    :cond_9
    move/from16 v30, v3

    .line 343
    .line 344
    move-object/from16 v32, v4

    .line 345
    .line 346
    const/16 v15, 0x71

    .line 347
    .line 348
    if-eq v2, v15, :cond_b

    .line 349
    .line 350
    const/16 v7, 0x74

    .line 351
    .line 352
    if-eq v2, v7, :cond_b

    .line 353
    .line 354
    const/16 v7, 0x51

    .line 355
    .line 356
    if-eq v2, v7, :cond_b

    .line 357
    .line 358
    const/16 v7, 0x54

    .line 359
    .line 360
    if-ne v2, v7, :cond_a

    .line 361
    .line 362
    goto :goto_10

    .line 363
    :cond_a
    :goto_f
    move/from16 v2, v22

    .line 364
    .line 365
    goto :goto_11

    .line 366
    :cond_b
    :goto_10
    mul-float v11, v11, v31

    .line 367
    .line 368
    sub-float/2addr v11, v5

    .line 369
    mul-float v22, v22, v31

    .line 370
    .line 371
    sub-float v22, v22, v6

    .line 372
    .line 373
    goto :goto_f

    .line 374
    :goto_11
    aget v3, v32, v30

    .line 375
    .line 376
    add-int/lit8 v4, v30, 0x1

    .line 377
    .line 378
    aget v5, v32, v4

    .line 379
    .line 380
    invoke-virtual {v1, v11, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 381
    .line 382
    .line 383
    aget v3, v32, v30

    .line 384
    .line 385
    aget v4, v32, v4

    .line 386
    .line 387
    move v6, v2

    .line 388
    move v2, v3

    .line 389
    move v3, v4

    .line 390
    move/from16 v22, v8

    .line 391
    .line 392
    move-object v14, v9

    .line 393
    move v5, v11

    .line 394
    goto/16 :goto_7

    .line 395
    .line 396
    :cond_c
    move/from16 v30, v3

    .line 397
    .line 398
    move-object/from16 v32, v4

    .line 399
    .line 400
    const/16 v7, 0x63

    .line 401
    .line 402
    if-eq v2, v7, :cond_e

    .line 403
    .line 404
    if-eq v2, v15, :cond_e

    .line 405
    .line 406
    const/16 v7, 0x43

    .line 407
    .line 408
    if-eq v2, v7, :cond_e

    .line 409
    .line 410
    const/16 v7, 0x53

    .line 411
    .line 412
    if-ne v2, v7, :cond_d

    .line 413
    .line 414
    goto :goto_13

    .line 415
    :cond_d
    :goto_12
    move v2, v11

    .line 416
    move/from16 v3, v22

    .line 417
    .line 418
    goto :goto_14

    .line 419
    :cond_e
    :goto_13
    mul-float v11, v11, v31

    .line 420
    .line 421
    sub-float/2addr v11, v5

    .line 422
    mul-float v22, v22, v31

    .line 423
    .line 424
    sub-float v22, v22, v6

    .line 425
    .line 426
    goto :goto_12

    .line 427
    :goto_14
    aget v4, v32, v30

    .line 428
    .line 429
    add-int/lit8 v11, v30, 0x1

    .line 430
    .line 431
    aget v5, v32, v11

    .line 432
    .line 433
    add-int/lit8 v15, v30, 0x2

    .line 434
    .line 435
    aget v6, v32, v15

    .line 436
    .line 437
    add-int/lit8 v22, v30, 0x3

    .line 438
    .line 439
    aget v7, v32, v22

    .line 440
    .line 441
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 442
    .line 443
    .line 444
    aget v2, v32, v30

    .line 445
    .line 446
    aget v3, v32, v11

    .line 447
    .line 448
    aget v4, v32, v15

    .line 449
    .line 450
    aget v5, v32, v22

    .line 451
    .line 452
    move v6, v3

    .line 453
    move v3, v5

    .line 454
    move/from16 v22, v8

    .line 455
    .line 456
    move-object v14, v9

    .line 457
    move v11, v10

    .line 458
    :goto_15
    move v5, v2

    .line 459
    move v2, v4

    .line 460
    goto/16 :goto_1d

    .line 461
    .line 462
    :cond_f
    move/from16 v30, v3

    .line 463
    .line 464
    move-object/from16 v32, v4

    .line 465
    .line 466
    aget v2, v32, v30

    .line 467
    .line 468
    add-int/lit8 v3, v30, 0x1

    .line 469
    .line 470
    aget v3, v32, v3

    .line 471
    .line 472
    if-lez v30, :cond_10

    .line 473
    .line 474
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 475
    .line 476
    .line 477
    :goto_16
    move/from16 v22, v8

    .line 478
    .line 479
    move-object v14, v9

    .line 480
    goto/16 :goto_7

    .line 481
    .line 482
    :cond_10
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 483
    .line 484
    .line 485
    move/from16 v23, v2

    .line 486
    .line 487
    move/from16 v24, v3

    .line 488
    .line 489
    goto :goto_16

    .line 490
    :cond_11
    move/from16 v30, v3

    .line 491
    .line 492
    move-object/from16 v32, v4

    .line 493
    .line 494
    aget v2, v32, v30

    .line 495
    .line 496
    add-int/lit8 v3, v30, 0x1

    .line 497
    .line 498
    aget v4, v32, v3

    .line 499
    .line 500
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 501
    .line 502
    .line 503
    aget v2, v32, v30

    .line 504
    .line 505
    aget v3, v32, v3

    .line 506
    .line 507
    goto :goto_16

    .line 508
    :cond_12
    move/from16 v30, v3

    .line 509
    .line 510
    move-object/from16 v32, v4

    .line 511
    .line 512
    aget v2, v32, v30

    .line 513
    .line 514
    const/4 v3, 0x0

    .line 515
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 516
    .line 517
    .line 518
    aget v2, v32, v30

    .line 519
    .line 520
    goto/16 :goto_e

    .line 521
    .line 522
    :cond_13
    move/from16 v30, v3

    .line 523
    .line 524
    move-object/from16 v32, v4

    .line 525
    .line 526
    aget v2, v32, v30

    .line 527
    .line 528
    add-int/lit8 v3, v30, 0x1

    .line 529
    .line 530
    aget v4, v32, v3

    .line 531
    .line 532
    add-int/lit8 v5, v30, 0x2

    .line 533
    .line 534
    aget v6, v32, v5

    .line 535
    .line 536
    add-int/lit8 v7, v30, 0x3

    .line 537
    .line 538
    aget v15, v32, v7

    .line 539
    .line 540
    invoke-virtual {v1, v2, v4, v6, v15}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 541
    .line 542
    .line 543
    aget v2, v32, v30

    .line 544
    .line 545
    add-float/2addr v2, v11

    .line 546
    aget v3, v32, v3

    .line 547
    .line 548
    add-float v3, v22, v3

    .line 549
    .line 550
    aget v4, v32, v5

    .line 551
    .line 552
    add-float/2addr v11, v4

    .line 553
    aget v4, v32, v7

    .line 554
    .line 555
    goto/16 :goto_d

    .line 556
    .line 557
    :cond_14
    move/from16 v30, v3

    .line 558
    .line 559
    move-object/from16 v32, v4

    .line 560
    .line 561
    aget v2, v32, v30

    .line 562
    .line 563
    const/4 v3, 0x0

    .line 564
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 565
    .line 566
    .line 567
    aget v2, v32, v30

    .line 568
    .line 569
    add-float/2addr v11, v2

    .line 570
    goto/16 :goto_4

    .line 571
    .line 572
    :cond_15
    move/from16 v30, v3

    .line 573
    .line 574
    move-object/from16 v32, v4

    .line 575
    .line 576
    aget v2, v32, v30

    .line 577
    .line 578
    add-int/lit8 v3, v30, 0x1

    .line 579
    .line 580
    aget v3, v32, v3

    .line 581
    .line 582
    add-int/lit8 v15, v30, 0x2

    .line 583
    .line 584
    aget v4, v32, v15

    .line 585
    .line 586
    add-int/lit8 v26, v30, 0x3

    .line 587
    .line 588
    aget v5, v32, v26

    .line 589
    .line 590
    add-int/lit8 v27, v30, 0x4

    .line 591
    .line 592
    aget v6, v32, v27

    .line 593
    .line 594
    add-int/lit8 v28, v30, 0x5

    .line 595
    .line 596
    aget v7, v32, v28

    .line 597
    .line 598
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 599
    .line 600
    .line 601
    aget v1, v32, v15

    .line 602
    .line 603
    add-float/2addr v1, v11

    .line 604
    aget v2, v32, v26

    .line 605
    .line 606
    add-float v2, v22, v2

    .line 607
    .line 608
    aget v3, v32, v27

    .line 609
    .line 610
    add-float/2addr v11, v3

    .line 611
    aget v3, v32, v28

    .line 612
    .line 613
    add-float v22, v22, v3

    .line 614
    .line 615
    move v5, v1

    .line 616
    move v6, v2

    .line 617
    goto/16 :goto_4

    .line 618
    .line 619
    :cond_16
    move/from16 v30, v3

    .line 620
    .line 621
    move-object/from16 v32, v4

    .line 622
    .line 623
    add-int/lit8 v15, v30, 0x5

    .line 624
    .line 625
    aget v1, v32, v15

    .line 626
    .line 627
    add-float v4, v1, v11

    .line 628
    .line 629
    add-int/lit8 v27, v30, 0x6

    .line 630
    .line 631
    aget v1, v32, v27

    .line 632
    .line 633
    add-float v5, v1, v22

    .line 634
    .line 635
    aget v6, v32, v30

    .line 636
    .line 637
    add-int/lit8 v3, v30, 0x1

    .line 638
    .line 639
    aget v7, v32, v3

    .line 640
    .line 641
    add-int/lit8 v3, v30, 0x2

    .line 642
    .line 643
    aget v1, v32, v3

    .line 644
    .line 645
    add-int/lit8 v3, v30, 0x3

    .line 646
    .line 647
    aget v2, v32, v3

    .line 648
    .line 649
    const/16 v26, 0x0

    .line 650
    .line 651
    cmpl-float v2, v2, v26

    .line 652
    .line 653
    if-eqz v2, :cond_17

    .line 654
    .line 655
    move-object v2, v9

    .line 656
    const/4 v9, 0x1

    .line 657
    goto :goto_17

    .line 658
    :cond_17
    move-object v2, v9

    .line 659
    const/4 v9, 0x0

    .line 660
    :goto_17
    add-int/lit8 v3, v30, 0x4

    .line 661
    .line 662
    aget v3, v32, v3

    .line 663
    .line 664
    cmpl-float v3, v3, v26

    .line 665
    .line 666
    move-object v14, v2

    .line 667
    move v2, v11

    .line 668
    move v11, v10

    .line 669
    if-eqz v3, :cond_18

    .line 670
    .line 671
    const/4 v10, 0x1

    .line 672
    :goto_18
    move/from16 v3, v22

    .line 673
    .line 674
    move/from16 v22, v8

    .line 675
    .line 676
    move v8, v1

    .line 677
    move-object/from16 v1, p1

    .line 678
    .line 679
    goto :goto_19

    .line 680
    :cond_18
    const/4 v10, 0x0

    .line 681
    goto :goto_18

    .line 682
    :goto_19
    invoke-static/range {v1 .. v10}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 683
    .line 684
    .line 685
    aget v4, v32, v15

    .line 686
    .line 687
    add-float/2addr v2, v4

    .line 688
    aget v4, v32, v27

    .line 689
    .line 690
    add-float/2addr v3, v4

    .line 691
    move v5, v2

    .line 692
    move v6, v3

    .line 693
    goto/16 :goto_1d

    .line 694
    .line 695
    :cond_19
    move/from16 v30, v3

    .line 696
    .line 697
    move-object/from16 v32, v4

    .line 698
    .line 699
    move/from16 v22, v8

    .line 700
    .line 701
    move-object v14, v9

    .line 702
    move v2, v11

    .line 703
    move v11, v10

    .line 704
    aget v3, v32, v30

    .line 705
    .line 706
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 707
    .line 708
    .line 709
    aget v3, v32, v30

    .line 710
    .line 711
    goto/16 :goto_1d

    .line 712
    .line 713
    :cond_1a
    move/from16 v30, v3

    .line 714
    .line 715
    move-object/from16 v32, v4

    .line 716
    .line 717
    move/from16 v22, v8

    .line 718
    .line 719
    move-object v14, v9

    .line 720
    move v11, v10

    .line 721
    aget v2, v32, v30

    .line 722
    .line 723
    add-int/lit8 v3, v30, 0x1

    .line 724
    .line 725
    aget v4, v32, v3

    .line 726
    .line 727
    add-int/lit8 v5, v30, 0x2

    .line 728
    .line 729
    aget v6, v32, v5

    .line 730
    .line 731
    add-int/lit8 v7, v30, 0x3

    .line 732
    .line 733
    aget v8, v32, v7

    .line 734
    .line 735
    invoke-virtual {v1, v2, v4, v6, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 736
    .line 737
    .line 738
    aget v2, v32, v30

    .line 739
    .line 740
    aget v3, v32, v3

    .line 741
    .line 742
    aget v4, v32, v5

    .line 743
    .line 744
    aget v5, v32, v7

    .line 745
    .line 746
    move v6, v3

    .line 747
    move v3, v5

    .line 748
    goto/16 :goto_15

    .line 749
    .line 750
    :cond_1b
    move/from16 v30, v3

    .line 751
    .line 752
    move-object/from16 v32, v4

    .line 753
    .line 754
    move-object v14, v9

    .line 755
    move v11, v10

    .line 756
    move/from16 v3, v22

    .line 757
    .line 758
    move/from16 v22, v8

    .line 759
    .line 760
    aget v2, v32, v30

    .line 761
    .line 762
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 763
    .line 764
    .line 765
    aget v2, v32, v30

    .line 766
    .line 767
    goto/16 :goto_1d

    .line 768
    .line 769
    :cond_1c
    move/from16 v30, v3

    .line 770
    .line 771
    move-object/from16 v32, v4

    .line 772
    .line 773
    move/from16 v22, v8

    .line 774
    .line 775
    move-object v14, v9

    .line 776
    move v11, v10

    .line 777
    aget v2, v32, v30

    .line 778
    .line 779
    add-int/lit8 v3, v30, 0x1

    .line 780
    .line 781
    aget v3, v32, v3

    .line 782
    .line 783
    add-int/lit8 v8, v30, 0x2

    .line 784
    .line 785
    aget v4, v32, v8

    .line 786
    .line 787
    add-int/lit8 v9, v30, 0x3

    .line 788
    .line 789
    aget v5, v32, v9

    .line 790
    .line 791
    add-int/lit8 v10, v30, 0x4

    .line 792
    .line 793
    aget v6, v32, v10

    .line 794
    .line 795
    add-int/lit8 v15, v30, 0x5

    .line 796
    .line 797
    aget v7, v32, v15

    .line 798
    .line 799
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 800
    .line 801
    .line 802
    aget v1, v32, v10

    .line 803
    .line 804
    aget v2, v32, v15

    .line 805
    .line 806
    aget v3, v32, v8

    .line 807
    .line 808
    aget v4, v32, v9

    .line 809
    .line 810
    move v5, v3

    .line 811
    move v6, v4

    .line 812
    move v3, v2

    .line 813
    move v2, v1

    .line 814
    goto :goto_1d

    .line 815
    :cond_1d
    move/from16 v30, v3

    .line 816
    .line 817
    move-object/from16 v32, v4

    .line 818
    .line 819
    move-object v14, v9

    .line 820
    move v2, v11

    .line 821
    move/from16 v3, v22

    .line 822
    .line 823
    move/from16 v22, v8

    .line 824
    .line 825
    move v11, v10

    .line 826
    add-int/lit8 v15, v30, 0x5

    .line 827
    .line 828
    aget v4, v32, v15

    .line 829
    .line 830
    add-int/lit8 v27, v30, 0x6

    .line 831
    .line 832
    aget v5, v32, v27

    .line 833
    .line 834
    aget v6, v32, v30

    .line 835
    .line 836
    add-int/lit8 v1, v30, 0x1

    .line 837
    .line 838
    aget v7, v32, v1

    .line 839
    .line 840
    add-int/lit8 v1, v30, 0x2

    .line 841
    .line 842
    aget v8, v32, v1

    .line 843
    .line 844
    add-int/lit8 v1, v30, 0x3

    .line 845
    .line 846
    aget v1, v32, v1

    .line 847
    .line 848
    const/16 v26, 0x0

    .line 849
    .line 850
    cmpl-float v1, v1, v26

    .line 851
    .line 852
    if-eqz v1, :cond_1e

    .line 853
    .line 854
    const/4 v9, 0x1

    .line 855
    goto :goto_1a

    .line 856
    :cond_1e
    const/4 v9, 0x0

    .line 857
    :goto_1a
    add-int/lit8 v1, v30, 0x4

    .line 858
    .line 859
    aget v1, v32, v1

    .line 860
    .line 861
    cmpl-float v1, v1, v26

    .line 862
    .line 863
    if-eqz v1, :cond_1f

    .line 864
    .line 865
    const/4 v10, 0x1

    .line 866
    :goto_1b
    move-object/from16 v1, p1

    .line 867
    .line 868
    goto :goto_1c

    .line 869
    :cond_1f
    const/4 v10, 0x0

    .line 870
    goto :goto_1b

    .line 871
    :goto_1c
    invoke-static/range {v1 .. v10}, LF/f;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 872
    .line 873
    .line 874
    aget v1, v32, v15

    .line 875
    .line 876
    aget v2, v32, v27

    .line 877
    .line 878
    move v5, v1

    .line 879
    move v3, v2

    .line 880
    move v6, v3

    .line 881
    move v2, v5

    .line 882
    :goto_1d
    add-int v1, v30, v21

    .line 883
    .line 884
    move v10, v11

    .line 885
    move-object v9, v14

    .line 886
    move/from16 v8, v22

    .line 887
    .line 888
    const/16 v14, 0x6d

    .line 889
    .line 890
    const/4 v15, 0x0

    .line 891
    move v11, v2

    .line 892
    move/from16 v22, v3

    .line 893
    .line 894
    move v2, v10

    .line 895
    move v3, v1

    .line 896
    move-object/from16 v1, p1

    .line 897
    .line 898
    goto/16 :goto_3

    .line 899
    .line 900
    :cond_20
    move-object v14, v9

    .line 901
    move v2, v11

    .line 902
    move/from16 v3, v22

    .line 903
    .line 904
    const/16 v25, 0x0

    .line 905
    .line 906
    move/from16 v22, v8

    .line 907
    .line 908
    aput v2, v12, v25

    .line 909
    .line 910
    aput v3, v12, v16

    .line 911
    .line 912
    aput v5, v12, v17

    .line 913
    .line 914
    aput v6, v12, v18

    .line 915
    .line 916
    aput v23, v12, v19

    .line 917
    .line 918
    aput v24, v12, v20

    .line 919
    .line 920
    iget-char v2, v14, LF/f;->a:C

    .line 921
    .line 922
    add-int/lit8 v8, v22, 0x1

    .line 923
    .line 924
    move-object/from16 v1, p1

    .line 925
    .line 926
    const/4 v11, 0x6

    .line 927
    const/16 v14, 0x6d

    .line 928
    .line 929
    const/4 v15, 0x0

    .line 930
    goto/16 :goto_0

    .line 931
    .line 932
    :cond_21
    return-void

    .line 933
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

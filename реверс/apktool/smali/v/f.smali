.class public final Lv/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lv/d;

.field public c:I

.field public d:Lv/c;

.field public e:Lv/c;

.field public f:Lv/c;

.field public g:Lv/c;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public final synthetic r:Lv/g;


# direct methods
.method public constructor <init>(Lv/g;ILv/c;Lv/c;Lv/c;Lv/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/f;->r:Lv/g;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lv/f;->b:Lv/d;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lv/f;->c:I

    .line 11
    .line 12
    iput v0, p0, Lv/f;->l:I

    .line 13
    .line 14
    iput v0, p0, Lv/f;->m:I

    .line 15
    .line 16
    iput v0, p0, Lv/f;->n:I

    .line 17
    .line 18
    iput v0, p0, Lv/f;->o:I

    .line 19
    .line 20
    iput v0, p0, Lv/f;->p:I

    .line 21
    .line 22
    iput p2, p0, Lv/f;->a:I

    .line 23
    .line 24
    iput-object p3, p0, Lv/f;->d:Lv/c;

    .line 25
    .line 26
    iput-object p4, p0, Lv/f;->e:Lv/c;

    .line 27
    .line 28
    iput-object p5, p0, Lv/f;->f:Lv/c;

    .line 29
    .line 30
    iput-object p6, p0, Lv/f;->g:Lv/c;

    .line 31
    .line 32
    iget p2, p1, Lv/g;->w0:I

    .line 33
    .line 34
    iput p2, p0, Lv/f;->h:I

    .line 35
    .line 36
    iget p2, p1, Lv/g;->s0:I

    .line 37
    .line 38
    iput p2, p0, Lv/f;->i:I

    .line 39
    .line 40
    iget p2, p1, Lv/g;->x0:I

    .line 41
    .line 42
    iput p2, p0, Lv/f;->j:I

    .line 43
    .line 44
    iget p1, p1, Lv/g;->t0:I

    .line 45
    .line 46
    iput p1, p0, Lv/f;->k:I

    .line 47
    .line 48
    iput p7, p0, Lv/f;->q:I

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Lv/d;)V
    .locals 8

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lv/f;->r:Lv/g;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget v0, p0, Lv/f;->q:I

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Lv/g;->U(Lv/d;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v6, p1, Lv/d;->p0:[I

    .line 19
    .line 20
    aget v6, v6, v5

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lv/f;->p:I

    .line 25
    .line 26
    add-int/2addr v0, v4

    .line 27
    iput v0, p0, Lv/f;->p:I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :cond_0
    iget v3, v1, Lv/g;->P0:I

    .line 31
    .line 32
    iget v6, p1, Lv/d;->g0:I

    .line 33
    .line 34
    if-ne v6, v2, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v5, v3

    .line 38
    :goto_0
    iget v2, p0, Lv/f;->l:I

    .line 39
    .line 40
    add-int/2addr v0, v5

    .line 41
    add-int/2addr v0, v2

    .line 42
    iput v0, p0, Lv/f;->l:I

    .line 43
    .line 44
    iget v0, p0, Lv/f;->q:I

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lv/g;->T(Lv/d;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lv/f;->b:Lv/d;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget v1, p0, Lv/f;->c:I

    .line 55
    .line 56
    if-ge v1, v0, :cond_7

    .line 57
    .line 58
    :cond_2
    iput-object p1, p0, Lv/f;->b:Lv/d;

    .line 59
    .line 60
    iput v0, p0, Lv/f;->c:I

    .line 61
    .line 62
    iput v0, p0, Lv/f;->m:I

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget v0, p0, Lv/f;->q:I

    .line 66
    .line 67
    invoke-virtual {v1, p1, v0}, Lv/g;->U(Lv/d;I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v6, p0, Lv/f;->q:I

    .line 72
    .line 73
    invoke-virtual {v1, p1, v6}, Lv/g;->T(Lv/d;I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    iget-object v7, p1, Lv/d;->p0:[I

    .line 78
    .line 79
    aget v7, v7, v4

    .line 80
    .line 81
    if-ne v7, v3, :cond_4

    .line 82
    .line 83
    iget v3, p0, Lv/f;->p:I

    .line 84
    .line 85
    add-int/2addr v3, v4

    .line 86
    iput v3, p0, Lv/f;->p:I

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    :cond_4
    iget v1, v1, Lv/g;->Q0:I

    .line 90
    .line 91
    iget v3, p1, Lv/d;->g0:I

    .line 92
    .line 93
    if-ne v3, v2, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move v5, v1

    .line 97
    :goto_1
    iget v1, p0, Lv/f;->m:I

    .line 98
    .line 99
    add-int/2addr v6, v5

    .line 100
    add-int/2addr v6, v1

    .line 101
    iput v6, p0, Lv/f;->m:I

    .line 102
    .line 103
    iget-object v1, p0, Lv/f;->b:Lv/d;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iget v1, p0, Lv/f;->c:I

    .line 108
    .line 109
    if-ge v1, v0, :cond_7

    .line 110
    .line 111
    :cond_6
    iput-object p1, p0, Lv/f;->b:Lv/d;

    .line 112
    .line 113
    iput v0, p0, Lv/f;->c:I

    .line 114
    .line 115
    iput v0, p0, Lv/f;->l:I

    .line 116
    .line 117
    :cond_7
    :goto_2
    iget p1, p0, Lv/f;->o:I

    .line 118
    .line 119
    add-int/2addr p1, v4

    .line 120
    iput p1, p0, Lv/f;->o:I

    .line 121
    .line 122
    return-void
.end method

.method public final b(IZZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv/f;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    iget-object v4, v0, Lv/f;->r:Lv/g;

    .line 8
    .line 9
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    iget v5, v0, Lv/f;->n:I

    .line 12
    .line 13
    add-int/2addr v5, v3

    .line 14
    iget v6, v4, Lv/g;->b1:I

    .line 15
    .line 16
    if-lt v5, v6, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v4, v4, Lv/g;->a1:[Lv/d;

    .line 20
    .line 21
    aget-object v4, v4, v5

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Lv/d;->D()V

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    if-eqz v1, :cond_3c

    .line 32
    .line 33
    iget-object v3, v0, Lv/f;->b:Lv/d;

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    goto/16 :goto_1e

    .line 38
    .line 39
    :cond_3
    if-eqz p3, :cond_4

    .line 40
    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const/4 v5, 0x0

    .line 46
    :goto_2
    const/4 v6, -0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, -0x1

    .line 49
    const/4 v9, -0x1

    .line 50
    :goto_3
    if-ge v7, v1, :cond_9

    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    add-int/lit8 v10, v1, -0x1

    .line 55
    .line 56
    sub-int/2addr v10, v7

    .line 57
    goto :goto_4

    .line 58
    :cond_5
    move v10, v7

    .line 59
    :goto_4
    iget v11, v0, Lv/f;->n:I

    .line 60
    .line 61
    add-int/2addr v11, v10

    .line 62
    iget v10, v4, Lv/g;->b1:I

    .line 63
    .line 64
    if-lt v11, v10, :cond_6

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_6
    iget-object v10, v4, Lv/g;->a1:[Lv/d;

    .line 68
    .line 69
    aget-object v10, v10, v11

    .line 70
    .line 71
    if-eqz v10, :cond_8

    .line 72
    .line 73
    iget v10, v10, Lv/d;->g0:I

    .line 74
    .line 75
    if-nez v10, :cond_8

    .line 76
    .line 77
    if-ne v8, v6, :cond_7

    .line 78
    .line 79
    move v8, v7

    .line 80
    :cond_7
    move v9, v7

    .line 81
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_9
    :goto_5
    iget v7, v0, Lv/f;->a:I

    .line 85
    .line 86
    if-nez v7, :cond_24

    .line 87
    .line 88
    iget-object v7, v0, Lv/f;->b:Lv/d;

    .line 89
    .line 90
    iget v11, v4, Lv/g;->E0:I

    .line 91
    .line 92
    iput v11, v7, Lv/d;->j0:I

    .line 93
    .line 94
    iget v11, v0, Lv/f;->i:I

    .line 95
    .line 96
    if-lez p1, :cond_a

    .line 97
    .line 98
    iget v12, v4, Lv/g;->Q0:I

    .line 99
    .line 100
    add-int/2addr v11, v12

    .line 101
    :cond_a
    iget-object v12, v0, Lv/f;->e:Lv/c;

    .line 102
    .line 103
    iget-object v13, v7, Lv/d;->J:Lv/c;

    .line 104
    .line 105
    invoke-virtual {v13, v12, v11}, Lv/c;->a(Lv/c;I)V

    .line 106
    .line 107
    .line 108
    iget-object v11, v7, Lv/d;->L:Lv/c;

    .line 109
    .line 110
    if-eqz p3, :cond_b

    .line 111
    .line 112
    iget-object v12, v0, Lv/f;->g:Lv/c;

    .line 113
    .line 114
    iget v14, v0, Lv/f;->k:I

    .line 115
    .line 116
    invoke-virtual {v11, v12, v14}, Lv/c;->a(Lv/c;I)V

    .line 117
    .line 118
    .line 119
    :cond_b
    if-lez p1, :cond_c

    .line 120
    .line 121
    iget-object v12, v0, Lv/f;->e:Lv/c;

    .line 122
    .line 123
    iget-object v12, v12, Lv/c;->d:Lv/d;

    .line 124
    .line 125
    iget-object v12, v12, Lv/d;->L:Lv/c;

    .line 126
    .line 127
    invoke-virtual {v12, v13, v2}, Lv/c;->a(Lv/c;I)V

    .line 128
    .line 129
    .line 130
    :cond_c
    iget v12, v4, Lv/g;->S0:I

    .line 131
    .line 132
    const/4 v14, 0x3

    .line 133
    if-ne v12, v14, :cond_10

    .line 134
    .line 135
    iget-boolean v12, v7, Lv/d;->E:Z

    .line 136
    .line 137
    if-nez v12, :cond_10

    .line 138
    .line 139
    const/4 v12, 0x0

    .line 140
    :goto_6
    if-ge v12, v1, :cond_10

    .line 141
    .line 142
    if-eqz p2, :cond_d

    .line 143
    .line 144
    add-int/lit8 v15, v1, -0x1

    .line 145
    .line 146
    sub-int/2addr v15, v12

    .line 147
    goto :goto_7

    .line 148
    :cond_d
    move v15, v12

    .line 149
    :goto_7
    iget v10, v0, Lv/f;->n:I

    .line 150
    .line 151
    add-int/2addr v10, v15

    .line 152
    iget v15, v4, Lv/g;->b1:I

    .line 153
    .line 154
    if-lt v10, v15, :cond_e

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_e
    iget-object v15, v4, Lv/g;->a1:[Lv/d;

    .line 158
    .line 159
    aget-object v10, v15, v10

    .line 160
    .line 161
    iget-boolean v15, v10, Lv/d;->E:Z

    .line 162
    .line 163
    if-eqz v15, :cond_f

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_10
    :goto_8
    move-object v10, v7

    .line 170
    :goto_9
    const/4 v12, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    :goto_a
    if-ge v15, v1, :cond_3c

    .line 173
    .line 174
    if-eqz p2, :cond_11

    .line 175
    .line 176
    add-int/lit8 v16, v1, -0x1

    .line 177
    .line 178
    sub-int v16, v16, v15

    .line 179
    .line 180
    :goto_b
    const/16 v17, 0x1

    .line 181
    .line 182
    goto :goto_c

    .line 183
    :cond_11
    move/from16 v16, v15

    .line 184
    .line 185
    goto :goto_b

    .line 186
    :goto_c
    iget v3, v0, Lv/f;->n:I

    .line 187
    .line 188
    add-int v3, v3, v16

    .line 189
    .line 190
    iget v14, v4, Lv/g;->b1:I

    .line 191
    .line 192
    if-lt v3, v14, :cond_12

    .line 193
    .line 194
    goto/16 :goto_1e

    .line 195
    .line 196
    :cond_12
    iget-object v14, v4, Lv/g;->a1:[Lv/d;

    .line 197
    .line 198
    aget-object v3, v14, v3

    .line 199
    .line 200
    if-nez v3, :cond_13

    .line 201
    .line 202
    move/from16 v19, v5

    .line 203
    .line 204
    const/4 v5, 0x3

    .line 205
    goto/16 :goto_14

    .line 206
    .line 207
    :cond_13
    iget-object v14, v3, Lv/d;->I:Lv/c;

    .line 208
    .line 209
    if-nez v15, :cond_14

    .line 210
    .line 211
    iget-object v2, v0, Lv/f;->d:Lv/c;

    .line 212
    .line 213
    iget v6, v0, Lv/f;->h:I

    .line 214
    .line 215
    invoke-virtual {v3, v14, v2, v6}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 216
    .line 217
    .line 218
    :cond_14
    if-nez v16, :cond_1b

    .line 219
    .line 220
    iget v2, v4, Lv/g;->D0:I

    .line 221
    .line 222
    if-eqz p2, :cond_15

    .line 223
    .line 224
    const/high16 v16, 0x3f800000    # 1.0f

    .line 225
    .line 226
    iget v6, v4, Lv/g;->J0:F

    .line 227
    .line 228
    sub-float v6, v16, v6

    .line 229
    .line 230
    :goto_d
    move/from16 v18, v2

    .line 231
    .line 232
    goto :goto_e

    .line 233
    :cond_15
    const/high16 v16, 0x3f800000    # 1.0f

    .line 234
    .line 235
    iget v6, v4, Lv/g;->J0:F

    .line 236
    .line 237
    goto :goto_d

    .line 238
    :goto_e
    iget v2, v0, Lv/f;->n:I

    .line 239
    .line 240
    if-nez v2, :cond_17

    .line 241
    .line 242
    iget v2, v4, Lv/g;->F0:I

    .line 243
    .line 244
    move/from16 v19, v5

    .line 245
    .line 246
    const/4 v5, -0x1

    .line 247
    if-eq v2, v5, :cond_18

    .line 248
    .line 249
    if-eqz p2, :cond_16

    .line 250
    .line 251
    iget v5, v4, Lv/g;->L0:F

    .line 252
    .line 253
    :goto_f
    sub-float v6, v16, v5

    .line 254
    .line 255
    goto :goto_11

    .line 256
    :cond_16
    iget v5, v4, Lv/g;->L0:F

    .line 257
    .line 258
    :goto_10
    move v6, v5

    .line 259
    goto :goto_11

    .line 260
    :cond_17
    move/from16 v19, v5

    .line 261
    .line 262
    :cond_18
    if-eqz p3, :cond_1a

    .line 263
    .line 264
    iget v2, v4, Lv/g;->H0:I

    .line 265
    .line 266
    const/4 v5, -0x1

    .line 267
    if-eq v2, v5, :cond_1a

    .line 268
    .line 269
    if-eqz p2, :cond_19

    .line 270
    .line 271
    iget v5, v4, Lv/g;->N0:F

    .line 272
    .line 273
    goto :goto_f

    .line 274
    :cond_19
    iget v5, v4, Lv/g;->N0:F

    .line 275
    .line 276
    goto :goto_10

    .line 277
    :cond_1a
    move/from16 v2, v18

    .line 278
    .line 279
    :goto_11
    iput v2, v3, Lv/d;->i0:I

    .line 280
    .line 281
    iput v6, v3, Lv/d;->d0:F

    .line 282
    .line 283
    goto :goto_12

    .line 284
    :cond_1b
    move/from16 v19, v5

    .line 285
    .line 286
    :goto_12
    add-int/lit8 v2, v1, -0x1

    .line 287
    .line 288
    if-ne v15, v2, :cond_1c

    .line 289
    .line 290
    iget-object v2, v0, Lv/f;->f:Lv/c;

    .line 291
    .line 292
    iget v5, v0, Lv/f;->j:I

    .line 293
    .line 294
    iget-object v6, v3, Lv/d;->K:Lv/c;

    .line 295
    .line 296
    invoke-virtual {v3, v6, v2, v5}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 297
    .line 298
    .line 299
    :cond_1c
    if-eqz v12, :cond_1e

    .line 300
    .line 301
    iget v2, v4, Lv/g;->P0:I

    .line 302
    .line 303
    iget-object v5, v12, Lv/d;->K:Lv/c;

    .line 304
    .line 305
    invoke-virtual {v14, v5, v2}, Lv/c;->a(Lv/c;I)V

    .line 306
    .line 307
    .line 308
    if-ne v15, v8, :cond_1d

    .line 309
    .line 310
    iget v2, v0, Lv/f;->h:I

    .line 311
    .line 312
    invoke-virtual {v14}, Lv/c;->h()Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-eqz v6, :cond_1d

    .line 317
    .line 318
    iput v2, v14, Lv/c;->h:I

    .line 319
    .line 320
    :cond_1d
    const/4 v2, 0x0

    .line 321
    invoke-virtual {v5, v14, v2}, Lv/c;->a(Lv/c;I)V

    .line 322
    .line 323
    .line 324
    add-int/lit8 v2, v9, 0x1

    .line 325
    .line 326
    if-ne v15, v2, :cond_1e

    .line 327
    .line 328
    iget v2, v0, Lv/f;->j:I

    .line 329
    .line 330
    invoke-virtual {v5}, Lv/c;->h()Z

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-eqz v6, :cond_1e

    .line 335
    .line 336
    iput v2, v5, Lv/c;->h:I

    .line 337
    .line 338
    :cond_1e
    if-eq v3, v7, :cond_23

    .line 339
    .line 340
    iget v2, v4, Lv/g;->S0:I

    .line 341
    .line 342
    const/4 v5, 0x3

    .line 343
    if-ne v2, v5, :cond_1f

    .line 344
    .line 345
    iget-boolean v6, v10, Lv/d;->E:Z

    .line 346
    .line 347
    if-eqz v6, :cond_1f

    .line 348
    .line 349
    if-eq v3, v10, :cond_1f

    .line 350
    .line 351
    iget-boolean v6, v3, Lv/d;->E:Z

    .line 352
    .line 353
    if-eqz v6, :cond_1f

    .line 354
    .line 355
    iget-object v2, v3, Lv/d;->M:Lv/c;

    .line 356
    .line 357
    iget-object v6, v10, Lv/d;->M:Lv/c;

    .line 358
    .line 359
    const/4 v12, 0x0

    .line 360
    invoke-virtual {v2, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 361
    .line 362
    .line 363
    goto :goto_13

    .line 364
    :cond_1f
    iget-object v6, v3, Lv/d;->J:Lv/c;

    .line 365
    .line 366
    if-eqz v2, :cond_22

    .line 367
    .line 368
    iget-object v12, v3, Lv/d;->L:Lv/c;

    .line 369
    .line 370
    const/4 v14, 0x1

    .line 371
    if-eq v2, v14, :cond_21

    .line 372
    .line 373
    if-eqz v19, :cond_20

    .line 374
    .line 375
    iget-object v2, v0, Lv/f;->e:Lv/c;

    .line 376
    .line 377
    iget v14, v0, Lv/f;->i:I

    .line 378
    .line 379
    invoke-virtual {v6, v2, v14}, Lv/c;->a(Lv/c;I)V

    .line 380
    .line 381
    .line 382
    iget-object v2, v0, Lv/f;->g:Lv/c;

    .line 383
    .line 384
    iget v6, v0, Lv/f;->k:I

    .line 385
    .line 386
    invoke-virtual {v12, v2, v6}, Lv/c;->a(Lv/c;I)V

    .line 387
    .line 388
    .line 389
    goto :goto_13

    .line 390
    :cond_20
    const/4 v2, 0x0

    .line 391
    invoke-virtual {v6, v13, v2}, Lv/c;->a(Lv/c;I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v11, v2}, Lv/c;->a(Lv/c;I)V

    .line 395
    .line 396
    .line 397
    goto :goto_13

    .line 398
    :cond_21
    const/4 v2, 0x0

    .line 399
    invoke-virtual {v12, v11, v2}, Lv/c;->a(Lv/c;I)V

    .line 400
    .line 401
    .line 402
    goto :goto_13

    .line 403
    :cond_22
    const/4 v2, 0x0

    .line 404
    invoke-virtual {v6, v13, v2}, Lv/c;->a(Lv/c;I)V

    .line 405
    .line 406
    .line 407
    goto :goto_13

    .line 408
    :cond_23
    const/4 v5, 0x3

    .line 409
    :goto_13
    move-object v12, v3

    .line 410
    :goto_14
    add-int/lit8 v15, v15, 0x1

    .line 411
    .line 412
    move/from16 v5, v19

    .line 413
    .line 414
    const/4 v2, 0x0

    .line 415
    const/4 v6, -0x1

    .line 416
    const/4 v14, 0x3

    .line 417
    goto/16 :goto_a

    .line 418
    .line 419
    :cond_24
    move/from16 v19, v5

    .line 420
    .line 421
    iget-object v2, v0, Lv/f;->b:Lv/d;

    .line 422
    .line 423
    iget v3, v4, Lv/g;->D0:I

    .line 424
    .line 425
    iput v3, v2, Lv/d;->i0:I

    .line 426
    .line 427
    iget v3, v0, Lv/f;->h:I

    .line 428
    .line 429
    if-lez p1, :cond_25

    .line 430
    .line 431
    iget v5, v4, Lv/g;->P0:I

    .line 432
    .line 433
    add-int/2addr v3, v5

    .line 434
    :cond_25
    iget-object v5, v2, Lv/d;->I:Lv/c;

    .line 435
    .line 436
    iget-object v6, v2, Lv/d;->K:Lv/c;

    .line 437
    .line 438
    if-eqz p2, :cond_27

    .line 439
    .line 440
    iget-object v7, v0, Lv/f;->f:Lv/c;

    .line 441
    .line 442
    invoke-virtual {v6, v7, v3}, Lv/c;->a(Lv/c;I)V

    .line 443
    .line 444
    .line 445
    if-eqz p3, :cond_26

    .line 446
    .line 447
    iget-object v3, v0, Lv/f;->d:Lv/c;

    .line 448
    .line 449
    iget v7, v0, Lv/f;->j:I

    .line 450
    .line 451
    invoke-virtual {v5, v3, v7}, Lv/c;->a(Lv/c;I)V

    .line 452
    .line 453
    .line 454
    :cond_26
    if-lez p1, :cond_29

    .line 455
    .line 456
    iget-object v3, v0, Lv/f;->f:Lv/c;

    .line 457
    .line 458
    iget-object v3, v3, Lv/c;->d:Lv/d;

    .line 459
    .line 460
    iget-object v3, v3, Lv/d;->I:Lv/c;

    .line 461
    .line 462
    const/4 v12, 0x0

    .line 463
    invoke-virtual {v3, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 464
    .line 465
    .line 466
    goto :goto_15

    .line 467
    :cond_27
    iget-object v7, v0, Lv/f;->d:Lv/c;

    .line 468
    .line 469
    invoke-virtual {v5, v7, v3}, Lv/c;->a(Lv/c;I)V

    .line 470
    .line 471
    .line 472
    if-eqz p3, :cond_28

    .line 473
    .line 474
    iget-object v3, v0, Lv/f;->f:Lv/c;

    .line 475
    .line 476
    iget v7, v0, Lv/f;->j:I

    .line 477
    .line 478
    invoke-virtual {v6, v3, v7}, Lv/c;->a(Lv/c;I)V

    .line 479
    .line 480
    .line 481
    :cond_28
    if-lez p1, :cond_29

    .line 482
    .line 483
    iget-object v3, v0, Lv/f;->d:Lv/c;

    .line 484
    .line 485
    iget-object v3, v3, Lv/c;->d:Lv/d;

    .line 486
    .line 487
    iget-object v3, v3, Lv/d;->K:Lv/c;

    .line 488
    .line 489
    const/4 v12, 0x0

    .line 490
    invoke-virtual {v3, v5, v12}, Lv/c;->a(Lv/c;I)V

    .line 491
    .line 492
    .line 493
    :cond_29
    :goto_15
    const/4 v3, 0x0

    .line 494
    const/4 v10, 0x0

    .line 495
    :goto_16
    if-ge v3, v1, :cond_3c

    .line 496
    .line 497
    iget v7, v0, Lv/f;->n:I

    .line 498
    .line 499
    add-int/2addr v7, v3

    .line 500
    iget v11, v4, Lv/g;->b1:I

    .line 501
    .line 502
    if-lt v7, v11, :cond_2a

    .line 503
    .line 504
    goto/16 :goto_1e

    .line 505
    .line 506
    :cond_2a
    iget-object v11, v4, Lv/g;->a1:[Lv/d;

    .line 507
    .line 508
    aget-object v7, v11, v7

    .line 509
    .line 510
    if-nez v7, :cond_2b

    .line 511
    .line 512
    const/4 v12, 0x0

    .line 513
    const/4 v14, 0x1

    .line 514
    const/4 v15, -0x1

    .line 515
    goto/16 :goto_1d

    .line 516
    .line 517
    :cond_2b
    iget-object v11, v7, Lv/d;->J:Lv/c;

    .line 518
    .line 519
    if-nez v3, :cond_2f

    .line 520
    .line 521
    iget-object v12, v0, Lv/f;->e:Lv/c;

    .line 522
    .line 523
    iget v13, v0, Lv/f;->i:I

    .line 524
    .line 525
    invoke-virtual {v7, v11, v12, v13}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 526
    .line 527
    .line 528
    iget v12, v4, Lv/g;->E0:I

    .line 529
    .line 530
    iget v13, v4, Lv/g;->K0:F

    .line 531
    .line 532
    iget v14, v0, Lv/f;->n:I

    .line 533
    .line 534
    if-nez v14, :cond_2c

    .line 535
    .line 536
    iget v14, v4, Lv/g;->G0:I

    .line 537
    .line 538
    const/4 v15, -0x1

    .line 539
    if-eq v14, v15, :cond_2d

    .line 540
    .line 541
    iget v13, v4, Lv/g;->M0:F

    .line 542
    .line 543
    :goto_17
    move v12, v14

    .line 544
    goto :goto_18

    .line 545
    :cond_2c
    const/4 v15, -0x1

    .line 546
    :cond_2d
    if-eqz p3, :cond_2e

    .line 547
    .line 548
    iget v14, v4, Lv/g;->I0:I

    .line 549
    .line 550
    if-eq v14, v15, :cond_2e

    .line 551
    .line 552
    iget v13, v4, Lv/g;->O0:F

    .line 553
    .line 554
    goto :goto_17

    .line 555
    :cond_2e
    :goto_18
    iput v12, v7, Lv/d;->j0:I

    .line 556
    .line 557
    iput v13, v7, Lv/d;->e0:F

    .line 558
    .line 559
    goto :goto_19

    .line 560
    :cond_2f
    const/4 v15, -0x1

    .line 561
    :goto_19
    add-int/lit8 v12, v1, -0x1

    .line 562
    .line 563
    if-ne v3, v12, :cond_30

    .line 564
    .line 565
    iget-object v12, v0, Lv/f;->g:Lv/c;

    .line 566
    .line 567
    iget v13, v0, Lv/f;->k:I

    .line 568
    .line 569
    iget-object v14, v7, Lv/d;->L:Lv/c;

    .line 570
    .line 571
    invoke-virtual {v7, v14, v12, v13}, Lv/d;->f(Lv/c;Lv/c;I)V

    .line 572
    .line 573
    .line 574
    :cond_30
    if-eqz v10, :cond_32

    .line 575
    .line 576
    iget v12, v4, Lv/g;->Q0:I

    .line 577
    .line 578
    iget-object v10, v10, Lv/d;->L:Lv/c;

    .line 579
    .line 580
    invoke-virtual {v11, v10, v12}, Lv/c;->a(Lv/c;I)V

    .line 581
    .line 582
    .line 583
    if-ne v3, v8, :cond_31

    .line 584
    .line 585
    iget v12, v0, Lv/f;->i:I

    .line 586
    .line 587
    invoke-virtual {v11}, Lv/c;->h()Z

    .line 588
    .line 589
    .line 590
    move-result v13

    .line 591
    if-eqz v13, :cond_31

    .line 592
    .line 593
    iput v12, v11, Lv/c;->h:I

    .line 594
    .line 595
    :cond_31
    const/4 v12, 0x0

    .line 596
    invoke-virtual {v10, v11, v12}, Lv/c;->a(Lv/c;I)V

    .line 597
    .line 598
    .line 599
    const/16 v17, 0x1

    .line 600
    .line 601
    add-int/lit8 v11, v9, 0x1

    .line 602
    .line 603
    if-ne v3, v11, :cond_32

    .line 604
    .line 605
    iget v11, v0, Lv/f;->k:I

    .line 606
    .line 607
    invoke-virtual {v10}, Lv/c;->h()Z

    .line 608
    .line 609
    .line 610
    move-result v12

    .line 611
    if-eqz v12, :cond_32

    .line 612
    .line 613
    iput v11, v10, Lv/c;->h:I

    .line 614
    .line 615
    :cond_32
    if-eq v7, v2, :cond_36

    .line 616
    .line 617
    iget-object v10, v7, Lv/d;->K:Lv/c;

    .line 618
    .line 619
    iget-object v11, v7, Lv/d;->I:Lv/c;

    .line 620
    .line 621
    const/4 v12, 0x2

    .line 622
    if-eqz p2, :cond_37

    .line 623
    .line 624
    iget v13, v4, Lv/g;->R0:I

    .line 625
    .line 626
    if-eqz v13, :cond_35

    .line 627
    .line 628
    const/4 v14, 0x1

    .line 629
    if-eq v13, v14, :cond_34

    .line 630
    .line 631
    if-eq v13, v12, :cond_33

    .line 632
    .line 633
    goto :goto_1a

    .line 634
    :cond_33
    const/4 v12, 0x0

    .line 635
    invoke-virtual {v11, v5, v12}, Lv/c;->a(Lv/c;I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v10, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 639
    .line 640
    .line 641
    goto :goto_1a

    .line 642
    :cond_34
    const/4 v12, 0x0

    .line 643
    invoke-virtual {v11, v5, v12}, Lv/c;->a(Lv/c;I)V

    .line 644
    .line 645
    .line 646
    goto :goto_1a

    .line 647
    :cond_35
    const/4 v12, 0x0

    .line 648
    invoke-virtual {v10, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 649
    .line 650
    .line 651
    :cond_36
    :goto_1a
    const/4 v12, 0x0

    .line 652
    const/4 v14, 0x1

    .line 653
    goto :goto_1c

    .line 654
    :cond_37
    iget v13, v4, Lv/g;->R0:I

    .line 655
    .line 656
    if-eqz v13, :cond_3b

    .line 657
    .line 658
    const/4 v14, 0x1

    .line 659
    if-eq v13, v14, :cond_3a

    .line 660
    .line 661
    if-eq v13, v12, :cond_38

    .line 662
    .line 663
    :goto_1b
    const/4 v12, 0x0

    .line 664
    goto :goto_1c

    .line 665
    :cond_38
    if-eqz v19, :cond_39

    .line 666
    .line 667
    iget-object v12, v0, Lv/f;->d:Lv/c;

    .line 668
    .line 669
    iget v13, v0, Lv/f;->h:I

    .line 670
    .line 671
    invoke-virtual {v11, v12, v13}, Lv/c;->a(Lv/c;I)V

    .line 672
    .line 673
    .line 674
    iget-object v11, v0, Lv/f;->f:Lv/c;

    .line 675
    .line 676
    iget v12, v0, Lv/f;->j:I

    .line 677
    .line 678
    invoke-virtual {v10, v11, v12}, Lv/c;->a(Lv/c;I)V

    .line 679
    .line 680
    .line 681
    goto :goto_1b

    .line 682
    :cond_39
    const/4 v12, 0x0

    .line 683
    invoke-virtual {v11, v5, v12}, Lv/c;->a(Lv/c;I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v10, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 687
    .line 688
    .line 689
    goto :goto_1c

    .line 690
    :cond_3a
    const/4 v12, 0x0

    .line 691
    invoke-virtual {v10, v6, v12}, Lv/c;->a(Lv/c;I)V

    .line 692
    .line 693
    .line 694
    goto :goto_1c

    .line 695
    :cond_3b
    const/4 v12, 0x0

    .line 696
    const/4 v14, 0x1

    .line 697
    invoke-virtual {v11, v5, v12}, Lv/c;->a(Lv/c;I)V

    .line 698
    .line 699
    .line 700
    :goto_1c
    move-object v10, v7

    .line 701
    :goto_1d
    add-int/lit8 v3, v3, 0x1

    .line 702
    .line 703
    goto/16 :goto_16

    .line 704
    .line 705
    :cond_3c
    :goto_1e
    return-void
.end method

.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lv/f;->m:I

    .line 7
    .line 8
    iget-object v1, p0, Lv/f;->r:Lv/g;

    .line 9
    .line 10
    iget v1, v1, Lv/g;->Q0:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    iget v0, p0, Lv/f;->m:I

    .line 15
    .line 16
    return v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget v0, p0, Lv/f;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lv/f;->l:I

    .line 6
    .line 7
    iget-object v1, p0, Lv/f;->r:Lv/g;

    .line 8
    .line 9
    iget v1, v1, Lv/g;->P0:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, p0, Lv/f;->l:I

    .line 14
    .line 15
    return v0
.end method

.method public final e(I)V
    .locals 10

    .line 1
    iget v0, p0, Lv/f;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget v1, p0, Lv/f;->o:I

    .line 8
    .line 9
    div-int v4, p1, v0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v2, p0, Lv/f;->r:Lv/g;

    .line 14
    .line 15
    if-ge v0, v1, :cond_4

    .line 16
    .line 17
    iget v3, p0, Lv/f;->n:I

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    iget v5, v2, Lv/g;->b1:I

    .line 21
    .line 22
    if-lt v3, v5, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    iget-object v5, v2, Lv/g;->a1:[Lv/d;

    .line 26
    .line 27
    aget-object v7, v5, v3

    .line 28
    .line 29
    iget v3, p0, Lv/f;->a:I

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    move v6, v3

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v8, 0x3

    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    if-eqz v7, :cond_3

    .line 38
    .line 39
    iget-object v6, v7, Lv/d;->p0:[I

    .line 40
    .line 41
    aget v9, v6, p1

    .line 42
    .line 43
    if-ne v9, v8, :cond_3

    .line 44
    .line 45
    iget v8, v7, Lv/d;->r:I

    .line 46
    .line 47
    if-nez v8, :cond_3

    .line 48
    .line 49
    aget v5, v6, v5

    .line 50
    .line 51
    invoke-virtual {v7}, Lv/d;->k()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual/range {v2 .. v7}, Lv/g;->V(IIIILv/d;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-eqz v7, :cond_3

    .line 60
    .line 61
    iget-object v6, v7, Lv/d;->p0:[I

    .line 62
    .line 63
    aget v5, v6, v5

    .line 64
    .line 65
    if-ne v5, v8, :cond_3

    .line 66
    .line 67
    iget v5, v7, Lv/d;->s:I

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    aget v5, v6, p1

    .line 72
    .line 73
    move v6, v4

    .line 74
    invoke-virtual {v7}, Lv/d;->q()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    move v3, v5

    .line 79
    const/4 v5, 0x1

    .line 80
    invoke-virtual/range {v2 .. v7}, Lv/g;->V(IIIILv/d;)V

    .line 81
    .line 82
    .line 83
    move v4, v6

    .line 84
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    :goto_2
    iput p1, p0, Lv/f;->l:I

    .line 88
    .line 89
    iput p1, p0, Lv/f;->m:I

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lv/f;->b:Lv/d;

    .line 93
    .line 94
    iput p1, p0, Lv/f;->c:I

    .line 95
    .line 96
    iget v0, p0, Lv/f;->o:I

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    :goto_3
    if-ge v1, v0, :cond_c

    .line 100
    .line 101
    iget v3, p0, Lv/f;->n:I

    .line 102
    .line 103
    add-int/2addr v3, v1

    .line 104
    iget v4, v2, Lv/g;->b1:I

    .line 105
    .line 106
    if-lt v3, v4, :cond_5

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_5
    iget-object v4, v2, Lv/g;->a1:[Lv/d;

    .line 110
    .line 111
    aget-object v3, v4, v3

    .line 112
    .line 113
    iget v4, p0, Lv/f;->a:I

    .line 114
    .line 115
    const/16 v5, 0x8

    .line 116
    .line 117
    if-nez v4, :cond_8

    .line 118
    .line 119
    invoke-virtual {v3}, Lv/d;->q()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    iget v6, v2, Lv/g;->P0:I

    .line 124
    .line 125
    iget v7, v3, Lv/d;->g0:I

    .line 126
    .line 127
    if-ne v7, v5, :cond_6

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    :cond_6
    iget v5, p0, Lv/f;->l:I

    .line 131
    .line 132
    add-int/2addr v4, v6

    .line 133
    add-int/2addr v4, v5

    .line 134
    iput v4, p0, Lv/f;->l:I

    .line 135
    .line 136
    iget v4, p0, Lv/f;->q:I

    .line 137
    .line 138
    invoke-virtual {v2, v3, v4}, Lv/g;->T(Lv/d;I)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object v5, p0, Lv/f;->b:Lv/d;

    .line 143
    .line 144
    if-eqz v5, :cond_7

    .line 145
    .line 146
    iget v5, p0, Lv/f;->c:I

    .line 147
    .line 148
    if-ge v5, v4, :cond_b

    .line 149
    .line 150
    :cond_7
    iput-object v3, p0, Lv/f;->b:Lv/d;

    .line 151
    .line 152
    iput v4, p0, Lv/f;->c:I

    .line 153
    .line 154
    iput v4, p0, Lv/f;->m:I

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    iget v4, p0, Lv/f;->q:I

    .line 158
    .line 159
    invoke-virtual {v2, v3, v4}, Lv/g;->U(Lv/d;I)I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    iget v6, p0, Lv/f;->q:I

    .line 164
    .line 165
    invoke-virtual {v2, v3, v6}, Lv/g;->T(Lv/d;I)I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    iget v7, v2, Lv/g;->Q0:I

    .line 170
    .line 171
    iget v8, v3, Lv/d;->g0:I

    .line 172
    .line 173
    if-ne v8, v5, :cond_9

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    :cond_9
    iget v5, p0, Lv/f;->m:I

    .line 177
    .line 178
    add-int/2addr v6, v7

    .line 179
    add-int/2addr v6, v5

    .line 180
    iput v6, p0, Lv/f;->m:I

    .line 181
    .line 182
    iget-object v5, p0, Lv/f;->b:Lv/d;

    .line 183
    .line 184
    if-eqz v5, :cond_a

    .line 185
    .line 186
    iget v5, p0, Lv/f;->c:I

    .line 187
    .line 188
    if-ge v5, v4, :cond_b

    .line 189
    .line 190
    :cond_a
    iput-object v3, p0, Lv/f;->b:Lv/d;

    .line 191
    .line 192
    iput v4, p0, Lv/f;->c:I

    .line 193
    .line 194
    iput v4, p0, Lv/f;->l:I

    .line 195
    .line 196
    :cond_b
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_c
    :goto_5
    return-void
.end method

.method public final f(ILv/c;Lv/c;Lv/c;Lv/c;IIIII)V
    .locals 0

    .line 1
    iput p1, p0, Lv/f;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lv/f;->d:Lv/c;

    .line 4
    .line 5
    iput-object p3, p0, Lv/f;->e:Lv/c;

    .line 6
    .line 7
    iput-object p4, p0, Lv/f;->f:Lv/c;

    .line 8
    .line 9
    iput-object p5, p0, Lv/f;->g:Lv/c;

    .line 10
    .line 11
    iput p6, p0, Lv/f;->h:I

    .line 12
    .line 13
    iput p7, p0, Lv/f;->i:I

    .line 14
    .line 15
    iput p8, p0, Lv/f;->j:I

    .line 16
    .line 17
    iput p9, p0, Lv/f;->k:I

    .line 18
    .line 19
    iput p10, p0, Lv/f;->q:I

    .line 20
    .line 21
    return-void
.end method

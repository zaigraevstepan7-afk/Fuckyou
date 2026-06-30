.class public final LC0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:I

.field public static m:Z

.field public static n:Ljava/lang/reflect/Constructor;

.field public static o:Landroid/text/TextDirectionHeuristic;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/TextPaint;

.field public final c:I

.field public d:I

.field public e:Landroid/text/Layout$Alignment;

.field public f:I

.field public g:F

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/text/TextUtils$TruncateAt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    sput v0, LC0/h;->l:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/h;->a:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput-object p2, p0, LC0/h;->b:Landroid/text/TextPaint;

    .line 7
    .line 8
    iput p3, p0, LC0/h;->c:I

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, LC0/h;->d:I

    .line 15
    .line 16
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 17
    .line 18
    iput-object p1, p0, LC0/h;->e:Landroid/text/Layout$Alignment;

    .line 19
    .line 20
    const p1, 0x7fffffff

    .line 21
    .line 22
    .line 23
    iput p1, p0, LC0/h;->f:I

    .line 24
    .line 25
    const/high16 p1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    iput p1, p0, LC0/h;->g:F

    .line 28
    .line 29
    sget p1, LC0/h;->l:I

    .line 30
    .line 31
    iput p1, p0, LC0/h;->h:I

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LC0/h;->i:Z

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, LC0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Landroid/text/StaticLayout;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v6, 0x7

    .line 4
    const/4 v7, 0x6

    .line 5
    const/4 v8, 0x5

    .line 6
    const/4 v9, 0x4

    .line 7
    const/4 v10, 0x3

    .line 8
    const/4 v11, 0x2

    .line 9
    const/16 v12, 0xd

    .line 10
    .line 11
    const/4 v13, 0x1

    .line 12
    const/4 v14, 0x0

    .line 13
    iget-object v15, v1, LC0/h;->a:Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v15, :cond_0

    .line 16
    .line 17
    const-string v15, ""

    .line 18
    .line 19
    iput-object v15, v1, LC0/h;->a:Ljava/lang/CharSequence;

    .line 20
    .line 21
    :cond_0
    iget v15, v1, LC0/h;->c:I

    .line 22
    .line 23
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v15

    .line 27
    const/16 v16, 0xc

    .line 28
    .line 29
    iget-object v0, v1, LC0/h;->a:Ljava/lang/CharSequence;

    .line 30
    .line 31
    const/16 v17, 0xb

    .line 32
    .line 33
    iget v2, v1, LC0/h;->f:I

    .line 34
    .line 35
    const/16 v18, 0xa

    .line 36
    .line 37
    iget-object v3, v1, LC0/h;->b:Landroid/text/TextPaint;

    .line 38
    .line 39
    if-ne v2, v13, :cond_1

    .line 40
    .line 41
    int-to-float v2, v15

    .line 42
    const/16 v19, 0x9

    .line 43
    .line 44
    iget-object v4, v1, LC0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 45
    .line 46
    invoke-static {v0, v3, v2, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/16 v19, 0x9

    .line 52
    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget v4, v1, LC0/h;->d:I

    .line 58
    .line 59
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iput v2, v1, LC0/h;->d:I

    .line 64
    .line 65
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    const/high16 v20, 0x3f800000    # 1.0f

    .line 68
    .line 69
    const/16 v21, 0x8

    .line 70
    .line 71
    const/16 v5, 0x17

    .line 72
    .line 73
    if-lt v4, v5, :cond_7

    .line 74
    .line 75
    iget-boolean v4, v1, LC0/h;->j:Z

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    iget v4, v1, LC0/h;->f:I

    .line 80
    .line 81
    if-ne v4, v13, :cond_2

    .line 82
    .line 83
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 84
    .line 85
    iput-object v4, v1, LC0/h;->e:Landroid/text/Layout$Alignment;

    .line 86
    .line 87
    :cond_2
    invoke-static {v0, v2, v3, v15}, LA0/a;->b(Ljava/lang/CharSequence;ILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v2, v1, LC0/h;->e:Landroid/text/Layout$Alignment;

    .line 92
    .line 93
    invoke-static {v0, v2}, LA0/a;->n(Landroid/text/StaticLayout$Builder;Landroid/text/Layout$Alignment;)V

    .line 94
    .line 95
    .line 96
    iget-boolean v2, v1, LC0/h;->i:Z

    .line 97
    .line 98
    invoke-static {v0, v2}, LA0/a;->q(Landroid/text/StaticLayout$Builder;Z)V

    .line 99
    .line 100
    .line 101
    iget-boolean v2, v1, LC0/h;->j:Z

    .line 102
    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 109
    .line 110
    :goto_1
    invoke-static {v0, v2}, LA0/a;->o(Landroid/text/StaticLayout$Builder;Landroid/text/TextDirectionHeuristic;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v1, LC0/h;->k:Landroid/text/TextUtils$TruncateAt;

    .line 114
    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    invoke-static {v0, v2}, LA0/a;->p(Landroid/text/StaticLayout$Builder;Landroid/text/TextUtils$TruncateAt;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    iget v2, v1, LC0/h;->f:I

    .line 121
    .line 122
    invoke-static {v0, v2}, LA0/a;->m(Landroid/text/StaticLayout$Builder;I)V

    .line 123
    .line 124
    .line 125
    iget v2, v1, LC0/h;->g:F

    .line 126
    .line 127
    cmpl-float v3, v2, v20

    .line 128
    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    invoke-static {v0, v2}, LA0/a;->l(Landroid/text/StaticLayout$Builder;F)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget v2, v1, LC0/h;->f:I

    .line 135
    .line 136
    if-le v2, v13, :cond_6

    .line 137
    .line 138
    iget v2, v1, LC0/h;->h:I

    .line 139
    .line 140
    invoke-static {v0, v2}, LA0/a;->w(Landroid/text/StaticLayout$Builder;I)V

    .line 141
    .line 142
    .line 143
    :cond_6
    invoke-static {v0}, LA0/a;->c(Landroid/text/StaticLayout$Builder;)Landroid/text/StaticLayout;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :cond_7
    sget-boolean v2, LC0/h;->m:Z

    .line 149
    .line 150
    if-eqz v2, :cond_8

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    :try_start_0
    iget-boolean v2, v1, LC0/h;->j:Z

    .line 154
    .line 155
    if-eqz v2, :cond_9

    .line 156
    .line 157
    if-lt v4, v5, :cond_9

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    goto :goto_2

    .line 161
    :cond_9
    const/4 v2, 0x0

    .line 162
    :goto_2
    if-eqz v2, :cond_a

    .line 163
    .line 164
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :catch_0
    move-exception v0

    .line 168
    goto/16 :goto_5

    .line 169
    .line 170
    :cond_a
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 171
    .line 172
    :goto_3
    sput-object v2, LC0/h;->o:Landroid/text/TextDirectionHeuristic;

    .line 173
    .line 174
    new-array v2, v12, [Ljava/lang/Class;

    .line 175
    .line 176
    const-class v4, Ljava/lang/CharSequence;

    .line 177
    .line 178
    aput-object v4, v2, v14

    .line 179
    .line 180
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 181
    .line 182
    aput-object v4, v2, v13

    .line 183
    .line 184
    aput-object v4, v2, v11

    .line 185
    .line 186
    const-class v5, Landroid/text/TextPaint;

    .line 187
    .line 188
    aput-object v5, v2, v10

    .line 189
    .line 190
    aput-object v4, v2, v9

    .line 191
    .line 192
    const-class v5, Landroid/text/Layout$Alignment;

    .line 193
    .line 194
    aput-object v5, v2, v8

    .line 195
    .line 196
    const-class v5, Landroid/text/TextDirectionHeuristic;

    .line 197
    .line 198
    aput-object v5, v2, v7

    .line 199
    .line 200
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 201
    .line 202
    aput-object v5, v2, v6

    .line 203
    .line 204
    aput-object v5, v2, v21

    .line 205
    .line 206
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 207
    .line 208
    aput-object v5, v2, v19

    .line 209
    .line 210
    const-class v5, Landroid/text/TextUtils$TruncateAt;

    .line 211
    .line 212
    aput-object v5, v2, v18

    .line 213
    .line 214
    aput-object v4, v2, v17

    .line 215
    .line 216
    aput-object v4, v2, v16

    .line 217
    .line 218
    const-class v4, Landroid/text/StaticLayout;

    .line 219
    .line 220
    invoke-virtual {v4, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    sput-object v2, LC0/h;->n:Ljava/lang/reflect/Constructor;

    .line 225
    .line 226
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 227
    .line 228
    .line 229
    sput-boolean v13, LC0/h;->m:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    .line 231
    :goto_4
    :try_start_1
    sget-object v2, LC0/h;->n:Ljava/lang/reflect/Constructor;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget v5, v1, LC0/h;->d:I

    .line 241
    .line 242
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v22

    .line 250
    const/16 v23, 0x7

    .line 251
    .line 252
    iget-object v6, v1, LC0/h;->e:Landroid/text/Layout$Alignment;

    .line 253
    .line 254
    sget-object v24, LC0/h;->o:Landroid/text/TextDirectionHeuristic;

    .line 255
    .line 256
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 260
    .line 261
    .line 262
    move-result-object v20

    .line 263
    const/16 v25, 0x0

    .line 264
    .line 265
    invoke-static/range {v25 .. v25}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 266
    .line 267
    .line 268
    move-result-object v25

    .line 269
    const/16 v26, 0x6

    .line 270
    .line 271
    iget-boolean v7, v1, LC0/h;->i:Z

    .line 272
    .line 273
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v15

    .line 281
    const/16 v27, 0x5

    .line 282
    .line 283
    iget v8, v1, LC0/h;->f:I

    .line 284
    .line 285
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    new-array v12, v12, [Ljava/lang/Object;

    .line 290
    .line 291
    aput-object v0, v12, v14

    .line 292
    .line 293
    aput-object v4, v12, v13

    .line 294
    .line 295
    aput-object v5, v12, v11

    .line 296
    .line 297
    aput-object v3, v12, v10

    .line 298
    .line 299
    aput-object v22, v12, v9

    .line 300
    .line 301
    aput-object v6, v12, v27

    .line 302
    .line 303
    aput-object v24, v12, v26

    .line 304
    .line 305
    aput-object v20, v12, v23

    .line 306
    .line 307
    aput-object v25, v12, v21

    .line 308
    .line 309
    aput-object v7, v12, v19

    .line 310
    .line 311
    const/4 v0, 0x0

    .line 312
    aput-object v0, v12, v18

    .line 313
    .line 314
    aput-object v15, v12, v17

    .line 315
    .line 316
    aput-object v8, v12, v16

    .line 317
    .line 318
    invoke-virtual {v2, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Landroid/text/StaticLayout;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 323
    .line 324
    return-object v0

    .line 325
    :catch_1
    move-exception v0

    .line 326
    new-instance v2, LC0/g;

    .line 327
    .line 328
    invoke-direct {v2, v0}, LC0/g;-><init>(Ljava/lang/Exception;)V

    .line 329
    .line 330
    .line 331
    throw v2

    .line 332
    :goto_5
    new-instance v2, LC0/g;

    .line 333
    .line 334
    invoke-direct {v2, v0}, LC0/g;-><init>(Ljava/lang/Exception;)V

    .line 335
    .line 336
    .line 337
    throw v2
.end method

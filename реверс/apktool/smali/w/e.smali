.class public final Lw/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lv/e;

.field public b:Z

.field public c:Z

.field public d:Lv/e;

.field public e:Ljava/util/ArrayList;

.field public f:Ly/f;

.field public g:Lw/b;

.field public h:Ljava/util/ArrayList;


# virtual methods
.method public final a(Lw/f;ILjava/util/ArrayList;Lw/l;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lw/f;->d:Lw/o;

    .line 2
    .line 3
    iget-object v0, p1, Lw/o;->c:Lw/l;

    .line 4
    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    iget-object v0, p0, Lw/e;->a:Lv/e;

    .line 8
    .line 9
    iget-object v1, v0, Lv/d;->d:Lw/k;

    .line 10
    .line 11
    if-eq p1, v1, :cond_a

    .line 12
    .line 13
    iget-object v0, v0, Lv/d;->e:Lw/m;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    if-nez p4, :cond_1

    .line 20
    .line 21
    new-instance p4, Lw/l;

    .line 22
    .line 23
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p4, Lw/l;->a:Lw/o;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p4, Lw/l;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    iput-object p1, p4, Lw/l;->a:Lw/o;

    .line 37
    .line 38
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    iput-object p4, p1, Lw/o;->c:Lw/l;

    .line 42
    .line 43
    iget-object v0, p4, Lw/l;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, Lw/o;->h:Lw/f;

    .line 49
    .line 50
    iget-object v1, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lw/d;

    .line 67
    .line 68
    instance-of v3, v2, Lw/f;

    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    check-cast v2, Lw/f;

    .line 73
    .line 74
    invoke-virtual {p0, v2, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object v1, p1, Lw/o;->i:Lw/f;

    .line 79
    .line 80
    iget-object v2, v1, Lw/f;->k:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lw/d;

    .line 97
    .line 98
    instance-of v4, v3, Lw/f;

    .line 99
    .line 100
    if-eqz v4, :cond_4

    .line 101
    .line 102
    check-cast v3, Lw/f;

    .line 103
    .line 104
    invoke-virtual {p0, v3, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    const/4 v2, 0x1

    .line 109
    if-ne p2, v2, :cond_7

    .line 110
    .line 111
    instance-of v3, p1, Lw/m;

    .line 112
    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    move-object v3, p1

    .line 116
    check-cast v3, Lw/m;

    .line 117
    .line 118
    iget-object v3, v3, Lw/m;->k:Lw/f;

    .line 119
    .line 120
    iget-object v3, v3, Lw/f;->k:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Lw/d;

    .line 137
    .line 138
    instance-of v5, v4, Lw/f;

    .line 139
    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    check-cast v4, Lw/f;

    .line 143
    .line 144
    invoke-virtual {p0, v4, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    iget-object v0, v0, Lw/f;->l:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_8

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Lw/f;

    .line 165
    .line 166
    invoke-virtual {p0, v3, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    iget-object v0, v1, Lw/f;->l:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_9

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lw/f;

    .line 187
    .line 188
    invoke-virtual {p0, v1, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    if-ne p2, v2, :cond_a

    .line 193
    .line 194
    instance-of v0, p1, Lw/m;

    .line 195
    .line 196
    if-eqz v0, :cond_a

    .line 197
    .line 198
    check-cast p1, Lw/m;

    .line 199
    .line 200
    iget-object p1, p1, Lw/m;->k:Lw/f;

    .line 201
    .line 202
    iget-object p1, p1, Lw/f;->l:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_a

    .line 213
    .line 214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Lw/f;

    .line 219
    .line 220
    :try_start_0
    invoke-virtual {p0, v0, p2, p3, p4}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :catchall_0
    move-exception p1

    .line 225
    throw p1

    .line 226
    :cond_a
    :goto_6
    return-void
.end method

.method public final b(Lv/e;)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lv/e;->q0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2a

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    move-object v8, v2

    .line 20
    check-cast v8, Lv/d;

    .line 21
    .line 22
    iget-object v2, v8, Lv/d;->p0:[I

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aget v4, v2, v3

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    aget v2, v2, v9

    .line 29
    .line 30
    iget v5, v8, Lv/d;->g0:I

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    if-ne v5, v6, :cond_1

    .line 35
    .line 36
    iput-boolean v9, v8, Lv/d;->a:Z

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget v5, v8, Lv/d;->w:F

    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    const/high16 v10, 0x3f800000    # 1.0f

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    cmpg-float v11, v5, v10

    .line 46
    .line 47
    if-gez v11, :cond_2

    .line 48
    .line 49
    if-ne v4, v6, :cond_2

    .line 50
    .line 51
    iput v7, v8, Lv/d;->r:I

    .line 52
    .line 53
    :cond_2
    iget v11, v8, Lv/d;->z:F

    .line 54
    .line 55
    cmpg-float v12, v11, v10

    .line 56
    .line 57
    if-gez v12, :cond_3

    .line 58
    .line 59
    if-ne v2, v6, :cond_3

    .line 60
    .line 61
    iput v7, v8, Lv/d;->s:I

    .line 62
    .line 63
    :cond_3
    iget v12, v8, Lv/d;->W:F

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x2

    .line 67
    const/4 v15, 0x1

    .line 68
    cmpl-float v12, v12, v13

    .line 69
    .line 70
    if-lez v12, :cond_9

    .line 71
    .line 72
    if-ne v4, v6, :cond_5

    .line 73
    .line 74
    if-eq v2, v14, :cond_4

    .line 75
    .line 76
    if-ne v2, v15, :cond_5

    .line 77
    .line 78
    :cond_4
    iput v6, v8, Lv/d;->r:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    if-ne v2, v6, :cond_7

    .line 82
    .line 83
    if-eq v4, v14, :cond_6

    .line 84
    .line 85
    if-ne v4, v15, :cond_7

    .line 86
    .line 87
    :cond_6
    iput v6, v8, Lv/d;->s:I

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    if-ne v4, v6, :cond_9

    .line 91
    .line 92
    if-ne v2, v6, :cond_9

    .line 93
    .line 94
    iget v12, v8, Lv/d;->r:I

    .line 95
    .line 96
    if-nez v12, :cond_8

    .line 97
    .line 98
    iput v6, v8, Lv/d;->r:I

    .line 99
    .line 100
    :cond_8
    iget v12, v8, Lv/d;->s:I

    .line 101
    .line 102
    if-nez v12, :cond_9

    .line 103
    .line 104
    iput v6, v8, Lv/d;->s:I

    .line 105
    .line 106
    :cond_9
    :goto_1
    iget-object v12, v8, Lv/d;->K:Lv/c;

    .line 107
    .line 108
    iget-object v13, v8, Lv/d;->I:Lv/c;

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    if-ne v4, v6, :cond_b

    .line 113
    .line 114
    iget v3, v8, Lv/d;->r:I

    .line 115
    .line 116
    if-ne v3, v9, :cond_b

    .line 117
    .line 118
    iget-object v3, v13, Lv/c;->f:Lv/c;

    .line 119
    .line 120
    if-eqz v3, :cond_a

    .line 121
    .line 122
    iget-object v3, v12, Lv/c;->f:Lv/c;

    .line 123
    .line 124
    if-nez v3, :cond_b

    .line 125
    .line 126
    :cond_a
    const/4 v4, 0x2

    .line 127
    :cond_b
    iget-object v3, v8, Lv/d;->L:Lv/c;

    .line 128
    .line 129
    const/high16 v17, 0x3f800000    # 1.0f

    .line 130
    .line 131
    iget-object v10, v8, Lv/d;->J:Lv/c;

    .line 132
    .line 133
    if-ne v2, v6, :cond_d

    .line 134
    .line 135
    iget v7, v8, Lv/d;->s:I

    .line 136
    .line 137
    if-ne v7, v9, :cond_d

    .line 138
    .line 139
    iget-object v7, v10, Lv/c;->f:Lv/c;

    .line 140
    .line 141
    if-eqz v7, :cond_c

    .line 142
    .line 143
    iget-object v7, v3, Lv/c;->f:Lv/c;

    .line 144
    .line 145
    if-nez v7, :cond_d

    .line 146
    .line 147
    :cond_c
    const/4 v2, 0x2

    .line 148
    :cond_d
    iget-object v7, v8, Lv/d;->d:Lw/k;

    .line 149
    .line 150
    iput v4, v7, Lw/o;->d:I

    .line 151
    .line 152
    iget v9, v8, Lv/d;->r:I

    .line 153
    .line 154
    iput v9, v7, Lw/o;->a:I

    .line 155
    .line 156
    iget-object v7, v8, Lv/d;->e:Lw/m;

    .line 157
    .line 158
    iput v2, v7, Lw/o;->d:I

    .line 159
    .line 160
    iget v6, v8, Lv/d;->s:I

    .line 161
    .line 162
    iput v6, v7, Lw/o;->a:I

    .line 163
    .line 164
    const/4 v7, 0x4

    .line 165
    if-eq v4, v7, :cond_e

    .line 166
    .line 167
    if-eq v4, v15, :cond_e

    .line 168
    .line 169
    if-ne v4, v14, :cond_10

    .line 170
    .line 171
    :cond_e
    if-eq v2, v7, :cond_f

    .line 172
    .line 173
    if-eq v2, v15, :cond_f

    .line 174
    .line 175
    if-ne v2, v14, :cond_10

    .line 176
    .line 177
    :cond_f
    move v6, v2

    .line 178
    const/4 v14, 0x1

    .line 179
    goto/16 :goto_9

    .line 180
    .line 181
    :cond_10
    iget-object v3, v0, Lv/d;->p0:[I

    .line 182
    .line 183
    iget-object v10, v8, Lv/d;->Q:[Lv/c;

    .line 184
    .line 185
    const/high16 v12, 0x3f000000    # 0.5f

    .line 186
    .line 187
    const/4 v13, 0x3

    .line 188
    if-ne v4, v13, :cond_11

    .line 189
    .line 190
    if-eq v2, v14, :cond_13

    .line 191
    .line 192
    if-ne v2, v15, :cond_11

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_11
    move v15, v4

    .line 196
    move v13, v6

    .line 197
    const/4 v4, 0x2

    .line 198
    const/4 v14, 0x1

    .line 199
    move v6, v2

    .line 200
    :cond_12
    const/4 v2, 0x3

    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :cond_13
    :goto_2
    if-ne v9, v13, :cond_15

    .line 204
    .line 205
    if-ne v2, v14, :cond_14

    .line 206
    .line 207
    const/4 v7, 0x0

    .line 208
    const/4 v5, 0x0

    .line 209
    move v6, v14

    .line 210
    const/4 v4, 0x2

    .line 211
    move-object/from16 v3, p0

    .line 212
    .line 213
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 214
    .line 215
    .line 216
    :cond_14
    invoke-virtual {v8}, Lv/d;->k()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    int-to-float v2, v7

    .line 221
    iget v3, v8, Lv/d;->W:F

    .line 222
    .line 223
    mul-float v2, v2, v3

    .line 224
    .line 225
    add-float/2addr v2, v12

    .line 226
    float-to-int v5, v2

    .line 227
    move v6, v15

    .line 228
    const/4 v4, 0x1

    .line 229
    move-object/from16 v3, p0

    .line 230
    .line 231
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 232
    .line 233
    .line 234
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 235
    .line 236
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 237
    .line 238
    invoke-virtual {v8}, Lv/d;->q()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 243
    .line 244
    .line 245
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 246
    .line 247
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 248
    .line 249
    invoke-virtual {v8}, Lv/d;->k()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x1

    .line 257
    iput-boolean v13, v8, Lv/d;->a:Z

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_15
    move v15, v4

    .line 262
    const/4 v4, 0x2

    .line 263
    const/4 v13, 0x1

    .line 264
    const/4 v14, 0x1

    .line 265
    if-ne v9, v13, :cond_16

    .line 266
    .line 267
    const/4 v5, 0x0

    .line 268
    const/4 v7, 0x0

    .line 269
    move-object/from16 v3, p0

    .line 270
    .line 271
    move v6, v2

    .line 272
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 273
    .line 274
    .line 275
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 276
    .line 277
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 278
    .line 279
    invoke-virtual {v8}, Lv/d;->q()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    iput v3, v2, Lw/g;->m:I

    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_16
    move v13, v6

    .line 288
    move v6, v2

    .line 289
    const/4 v2, 0x2

    .line 290
    if-ne v9, v2, :cond_18

    .line 291
    .line 292
    aget v2, v3, v16

    .line 293
    .line 294
    if-eq v2, v14, :cond_17

    .line 295
    .line 296
    if-ne v2, v7, :cond_12

    .line 297
    .line 298
    :cond_17
    invoke-virtual {v0}, Lv/d;->q()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    int-to-float v2, v2

    .line 303
    mul-float v5, v5, v2

    .line 304
    .line 305
    add-float/2addr v5, v12

    .line 306
    float-to-int v5, v5

    .line 307
    invoke-virtual {v8}, Lv/d;->k()I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    const/4 v4, 0x1

    .line 312
    move-object/from16 v3, p0

    .line 313
    .line 314
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 315
    .line 316
    .line 317
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 318
    .line 319
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 320
    .line 321
    invoke-virtual {v8}, Lv/d;->q()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 326
    .line 327
    .line 328
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 329
    .line 330
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 331
    .line 332
    invoke-virtual {v8}, Lv/d;->k()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 337
    .line 338
    .line 339
    const/4 v2, 0x1

    .line 340
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_18
    const/16 v19, 0x1

    .line 345
    .line 346
    aget-object v2, v10, v16

    .line 347
    .line 348
    iget-object v2, v2, Lv/c;->f:Lv/c;

    .line 349
    .line 350
    if-eqz v2, :cond_19

    .line 351
    .line 352
    aget-object v2, v10, v19

    .line 353
    .line 354
    iget-object v2, v2, Lv/c;->f:Lv/c;

    .line 355
    .line 356
    if-nez v2, :cond_12

    .line 357
    .line 358
    :cond_19
    const/4 v5, 0x0

    .line 359
    const/4 v7, 0x0

    .line 360
    move-object/from16 v3, p0

    .line 361
    .line 362
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 366
    .line 367
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 368
    .line 369
    invoke-virtual {v8}, Lv/d;->q()I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 374
    .line 375
    .line 376
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 377
    .line 378
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 379
    .line 380
    invoke-virtual {v8}, Lv/d;->k()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 385
    .line 386
    .line 387
    const/4 v2, 0x1

    .line 388
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 389
    .line 390
    goto/16 :goto_0

    .line 391
    .line 392
    :goto_3
    if-ne v6, v2, :cond_25

    .line 393
    .line 394
    if-eq v15, v4, :cond_1b

    .line 395
    .line 396
    if-ne v15, v14, :cond_1a

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_1a
    move v4, v15

    .line 400
    const/4 v2, 0x1

    .line 401
    const/4 v7, 0x3

    .line 402
    const/4 v15, 0x2

    .line 403
    goto/16 :goto_7

    .line 404
    .line 405
    :cond_1b
    :goto_4
    if-ne v13, v2, :cond_1e

    .line 406
    .line 407
    if-ne v15, v4, :cond_1c

    .line 408
    .line 409
    const/4 v7, 0x0

    .line 410
    const/4 v5, 0x0

    .line 411
    move v6, v4

    .line 412
    move-object/from16 v3, p0

    .line 413
    .line 414
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 415
    .line 416
    .line 417
    :cond_1c
    invoke-virtual {v8}, Lv/d;->q()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    iget v2, v8, Lv/d;->W:F

    .line 422
    .line 423
    iget v3, v8, Lv/d;->X:I

    .line 424
    .line 425
    const/4 v4, -0x1

    .line 426
    if-ne v3, v4, :cond_1d

    .line 427
    .line 428
    div-float v2, v17, v2

    .line 429
    .line 430
    :cond_1d
    int-to-float v3, v5

    .line 431
    mul-float v3, v3, v2

    .line 432
    .line 433
    add-float/2addr v3, v12

    .line 434
    float-to-int v7, v3

    .line 435
    move v6, v14

    .line 436
    const/4 v4, 0x1

    .line 437
    move-object/from16 v3, p0

    .line 438
    .line 439
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 440
    .line 441
    .line 442
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 443
    .line 444
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 445
    .line 446
    invoke-virtual {v8}, Lv/d;->q()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 451
    .line 452
    .line 453
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 454
    .line 455
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 456
    .line 457
    invoke-virtual {v8}, Lv/d;->k()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 462
    .line 463
    .line 464
    const/4 v2, 0x1

    .line 465
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_1e
    const/4 v2, 0x1

    .line 470
    if-ne v13, v2, :cond_1f

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    const/4 v5, 0x0

    .line 474
    const/4 v6, 0x2

    .line 475
    move-object/from16 v3, p0

    .line 476
    .line 477
    move v4, v15

    .line 478
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 479
    .line 480
    .line 481
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 482
    .line 483
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 484
    .line 485
    invoke-virtual {v8}, Lv/d;->k()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    iput v3, v2, Lw/g;->m:I

    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    .line 493
    :cond_1f
    move/from16 v17, v15

    .line 494
    .line 495
    const/4 v4, 0x2

    .line 496
    const/4 v15, 0x2

    .line 497
    if-ne v13, v4, :cond_23

    .line 498
    .line 499
    aget v4, v3, v2

    .line 500
    .line 501
    if-eq v4, v14, :cond_22

    .line 502
    .line 503
    if-ne v4, v7, :cond_20

    .line 504
    .line 505
    goto :goto_6

    .line 506
    :cond_20
    move/from16 v4, v17

    .line 507
    .line 508
    :cond_21
    const/4 v2, 0x1

    .line 509
    :goto_5
    const/4 v7, 0x3

    .line 510
    goto :goto_7

    .line 511
    :cond_22
    :goto_6
    invoke-virtual {v8}, Lv/d;->q()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    invoke-virtual {v0}, Lv/d;->k()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    int-to-float v2, v2

    .line 520
    mul-float v11, v11, v2

    .line 521
    .line 522
    add-float/2addr v11, v12

    .line 523
    float-to-int v7, v11

    .line 524
    const/4 v6, 0x1

    .line 525
    move-object/from16 v3, p0

    .line 526
    .line 527
    move/from16 v4, v17

    .line 528
    .line 529
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 530
    .line 531
    .line 532
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 533
    .line 534
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 535
    .line 536
    invoke-virtual {v8}, Lv/d;->q()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 541
    .line 542
    .line 543
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 544
    .line 545
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 546
    .line 547
    invoke-virtual {v8}, Lv/d;->k()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 552
    .line 553
    .line 554
    const/4 v2, 0x1

    .line 555
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 556
    .line 557
    goto/16 :goto_0

    .line 558
    .line 559
    :cond_23
    move/from16 v4, v17

    .line 560
    .line 561
    const/16 v18, 0x2

    .line 562
    .line 563
    aget-object v2, v10, v18

    .line 564
    .line 565
    iget-object v2, v2, Lv/c;->f:Lv/c;

    .line 566
    .line 567
    if-eqz v2, :cond_24

    .line 568
    .line 569
    const/16 v20, 0x3

    .line 570
    .line 571
    aget-object v2, v10, v20

    .line 572
    .line 573
    iget-object v2, v2, Lv/c;->f:Lv/c;

    .line 574
    .line 575
    if-nez v2, :cond_21

    .line 576
    .line 577
    :cond_24
    const/4 v5, 0x0

    .line 578
    const/4 v7, 0x0

    .line 579
    const/4 v4, 0x2

    .line 580
    move-object/from16 v3, p0

    .line 581
    .line 582
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 583
    .line 584
    .line 585
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 586
    .line 587
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 588
    .line 589
    invoke-virtual {v8}, Lv/d;->q()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 594
    .line 595
    .line 596
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 597
    .line 598
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 599
    .line 600
    invoke-virtual {v8}, Lv/d;->k()I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 605
    .line 606
    .line 607
    const/4 v2, 0x1

    .line 608
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 609
    .line 610
    goto/16 :goto_0

    .line 611
    .line 612
    :cond_25
    move v4, v15

    .line 613
    const/4 v2, 0x1

    .line 614
    const/4 v15, 0x2

    .line 615
    goto :goto_5

    .line 616
    :goto_7
    if-ne v4, v7, :cond_0

    .line 617
    .line 618
    if-ne v6, v7, :cond_0

    .line 619
    .line 620
    if-eq v9, v2, :cond_27

    .line 621
    .line 622
    if-ne v13, v2, :cond_26

    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_26
    const/4 v4, 0x2

    .line 626
    if-ne v13, v4, :cond_0

    .line 627
    .line 628
    if-ne v9, v4, :cond_0

    .line 629
    .line 630
    aget v4, v3, v16

    .line 631
    .line 632
    if-ne v4, v14, :cond_0

    .line 633
    .line 634
    aget v3, v3, v2

    .line 635
    .line 636
    if-ne v3, v14, :cond_0

    .line 637
    .line 638
    invoke-virtual {v0}, Lv/d;->q()I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    int-to-float v2, v2

    .line 643
    mul-float v5, v5, v2

    .line 644
    .line 645
    add-float/2addr v5, v12

    .line 646
    float-to-int v5, v5

    .line 647
    invoke-virtual {v0}, Lv/d;->k()I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    int-to-float v2, v2

    .line 652
    mul-float v11, v11, v2

    .line 653
    .line 654
    add-float/2addr v11, v12

    .line 655
    float-to-int v7, v11

    .line 656
    move v6, v14

    .line 657
    const/4 v4, 0x1

    .line 658
    move-object/from16 v3, p0

    .line 659
    .line 660
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 661
    .line 662
    .line 663
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 664
    .line 665
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 666
    .line 667
    invoke-virtual {v8}, Lv/d;->q()I

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 672
    .line 673
    .line 674
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 675
    .line 676
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 677
    .line 678
    invoke-virtual {v8}, Lv/d;->k()I

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 683
    .line 684
    .line 685
    const/4 v2, 0x1

    .line 686
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 687
    .line 688
    goto/16 :goto_0

    .line 689
    .line 690
    :cond_27
    :goto_8
    const/4 v7, 0x0

    .line 691
    const/4 v5, 0x0

    .line 692
    move v6, v15

    .line 693
    const/4 v4, 0x2

    .line 694
    move-object/from16 v3, p0

    .line 695
    .line 696
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 697
    .line 698
    .line 699
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 700
    .line 701
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 702
    .line 703
    invoke-virtual {v8}, Lv/d;->q()I

    .line 704
    .line 705
    .line 706
    move-result v3

    .line 707
    iput v3, v2, Lw/g;->m:I

    .line 708
    .line 709
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 710
    .line 711
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 712
    .line 713
    invoke-virtual {v8}, Lv/d;->k()I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    iput v3, v2, Lw/g;->m:I

    .line 718
    .line 719
    goto/16 :goto_0

    .line 720
    .line 721
    :goto_9
    invoke-virtual {v8}, Lv/d;->q()I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-ne v4, v7, :cond_28

    .line 726
    .line 727
    invoke-virtual {v0}, Lv/d;->q()I

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    iget v4, v13, Lv/c;->g:I

    .line 732
    .line 733
    sub-int/2addr v2, v4

    .line 734
    iget v4, v12, Lv/c;->g:I

    .line 735
    .line 736
    sub-int/2addr v2, v4

    .line 737
    const/4 v4, 0x1

    .line 738
    :cond_28
    move v5, v2

    .line 739
    invoke-virtual {v8}, Lv/d;->k()I

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    if-ne v6, v7, :cond_29

    .line 744
    .line 745
    invoke-virtual {v0}, Lv/d;->k()I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    iget v6, v10, Lv/c;->g:I

    .line 750
    .line 751
    sub-int/2addr v2, v6

    .line 752
    iget v3, v3, Lv/c;->g:I

    .line 753
    .line 754
    sub-int/2addr v2, v3

    .line 755
    const/4 v6, 0x1

    .line 756
    :cond_29
    move-object/from16 v3, p0

    .line 757
    .line 758
    move v7, v2

    .line 759
    invoke-virtual/range {v3 .. v8}, Lw/e;->f(IIIILv/d;)V

    .line 760
    .line 761
    .line 762
    iget-object v2, v8, Lv/d;->d:Lw/k;

    .line 763
    .line 764
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 765
    .line 766
    invoke-virtual {v8}, Lv/d;->q()I

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 771
    .line 772
    .line 773
    iget-object v2, v8, Lv/d;->e:Lw/m;

    .line 774
    .line 775
    iget-object v2, v2, Lw/o;->e:Lw/g;

    .line 776
    .line 777
    invoke-virtual {v8}, Lv/d;->k()I

    .line 778
    .line 779
    .line 780
    move-result v3

    .line 781
    invoke-virtual {v2, v3}, Lw/g;->d(I)V

    .line 782
    .line 783
    .line 784
    const/4 v2, 0x1

    .line 785
    iput-boolean v2, v8, Lv/d;->a:Z

    .line 786
    .line 787
    goto/16 :goto_0

    .line 788
    .line 789
    :cond_2a
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, Lw/e;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw/e;->d:Lv/e;

    .line 7
    .line 8
    iget-object v2, v1, Lv/d;->d:Lw/k;

    .line 9
    .line 10
    invoke-virtual {v2}, Lw/k;->f()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v1, Lv/d;->e:Lw/m;

    .line 14
    .line 15
    invoke-virtual {v2}, Lw/m;->f()V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lv/d;->d:Lw/k;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v2, v1, Lv/d;->e:Lw/m;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lv/e;->q0:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/4 v5, 0x1

    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v4, :cond_8

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lv/d;

    .line 48
    .line 49
    instance-of v7, v4, Lv/h;

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    new-instance v5, Lw/i;

    .line 54
    .line 55
    invoke-direct {v5, v4}, Lw/o;-><init>(Lv/d;)V

    .line 56
    .line 57
    .line 58
    iget-object v6, v4, Lv/d;->d:Lw/k;

    .line 59
    .line 60
    invoke-virtual {v6}, Lw/k;->f()V

    .line 61
    .line 62
    .line 63
    iget-object v6, v4, Lv/d;->e:Lw/m;

    .line 64
    .line 65
    invoke-virtual {v6}, Lw/m;->f()V

    .line 66
    .line 67
    .line 68
    check-cast v4, Lv/h;

    .line 69
    .line 70
    iget v4, v4, Lv/h;->u0:I

    .line 71
    .line 72
    iput v4, v5, Lw/o;->f:I

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v4}, Lv/d;->x()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    iget-object v7, v4, Lv/d;->b:Lw/c;

    .line 85
    .line 86
    if-nez v7, :cond_2

    .line 87
    .line 88
    new-instance v7, Lw/c;

    .line 89
    .line 90
    invoke-direct {v7, v4, v6}, Lw/c;-><init>(Lv/d;I)V

    .line 91
    .line 92
    .line 93
    iput-object v7, v4, Lv/d;->b:Lw/c;

    .line 94
    .line 95
    :cond_2
    if-nez v3, :cond_3

    .line 96
    .line 97
    new-instance v3, Ljava/util/HashSet;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 100
    .line 101
    .line 102
    :cond_3
    iget-object v6, v4, Lv/d;->b:Lw/c;

    .line 103
    .line 104
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    iget-object v6, v4, Lv/d;->d:Lw/k;

    .line 109
    .line 110
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :goto_1
    invoke-virtual {v4}, Lv/d;->y()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_7

    .line 118
    .line 119
    iget-object v6, v4, Lv/d;->c:Lw/c;

    .line 120
    .line 121
    if-nez v6, :cond_5

    .line 122
    .line 123
    new-instance v6, Lw/c;

    .line 124
    .line 125
    invoke-direct {v6, v4, v5}, Lw/c;-><init>(Lv/d;I)V

    .line 126
    .line 127
    .line 128
    iput-object v6, v4, Lv/d;->c:Lw/c;

    .line 129
    .line 130
    :cond_5
    if-nez v3, :cond_6

    .line 131
    .line 132
    new-instance v3, Ljava/util/HashSet;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 135
    .line 136
    .line 137
    :cond_6
    iget-object v5, v4, Lv/d;->c:Lw/c;

    .line 138
    .line 139
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iget-object v5, v4, Lv/d;->e:Lw/m;

    .line 144
    .line 145
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :goto_2
    instance-of v5, v4, Lv/i;

    .line 149
    .line 150
    if-eqz v5, :cond_0

    .line 151
    .line 152
    new-instance v5, Lw/j;

    .line 153
    .line 154
    invoke-direct {v5, v4}, Lw/o;-><init>(Lv/d;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    if-eqz v3, :cond_9

    .line 162
    .line 163
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Lw/o;

    .line 181
    .line 182
    invoke-virtual {v3}, Lw/o;->f()V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_c

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lw/o;

    .line 201
    .line 202
    iget-object v3, v2, Lw/o;->b:Lv/d;

    .line 203
    .line 204
    if-ne v3, v1, :cond_b

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_b
    invoke-virtual {v2}, Lw/o;->d()V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_c
    iget-object v0, p0, Lw/e;->h:Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 214
    .line 215
    .line 216
    iget-object v1, p0, Lw/e;->a:Lv/e;

    .line 217
    .line 218
    iget-object v2, v1, Lv/d;->d:Lw/k;

    .line 219
    .line 220
    invoke-virtual {p0, v2, v6, v0}, Lw/e;->e(Lw/o;ILjava/util/ArrayList;)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v1, Lv/d;->e:Lw/m;

    .line 224
    .line 225
    invoke-virtual {p0, v1, v5, v0}, Lw/e;->e(Lw/o;ILjava/util/ArrayList;)V

    .line 226
    .line 227
    .line 228
    iput-boolean v6, p0, Lw/e;->b:Z

    .line 229
    .line 230
    return-void
.end method

.method public final d(Lv/e;I)I
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Lw/e;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v7, 0x0

    .line 14
    const-wide/16 v8, 0x0

    .line 15
    .line 16
    :goto_0
    if-ge v7, v4, :cond_d

    .line 17
    .line 18
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v10

    .line 22
    check-cast v10, Lw/l;

    .line 23
    .line 24
    iget-object v10, v10, Lw/l;->a:Lw/o;

    .line 25
    .line 26
    instance-of v11, v10, Lw/c;

    .line 27
    .line 28
    if-eqz v11, :cond_0

    .line 29
    .line 30
    move-object v11, v10

    .line 31
    check-cast v11, Lw/c;

    .line 32
    .line 33
    iget v11, v11, Lw/o;->f:I

    .line 34
    .line 35
    if-eq v11, v2, :cond_2

    .line 36
    .line 37
    :goto_1
    move-object/from16 v18, v3

    .line 38
    .line 39
    move/from16 v16, v4

    .line 40
    .line 41
    move/from16 v17, v7

    .line 42
    .line 43
    const-wide/16 v0, 0x0

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_0
    if-nez v2, :cond_1

    .line 48
    .line 49
    instance-of v11, v10, Lw/k;

    .line 50
    .line 51
    if-nez v11, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v11, v10, Lw/m;

    .line 55
    .line 56
    if-nez v11, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget-object v11, v0, Lv/d;->d:Lw/k;

    .line 62
    .line 63
    :goto_2
    iget-object v11, v11, Lw/o;->h:Lw/f;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v11, v0, Lv/d;->e:Lw/m;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    if-nez v2, :cond_4

    .line 70
    .line 71
    iget-object v12, v0, Lv/d;->d:Lw/k;

    .line 72
    .line 73
    :goto_4
    iget-object v12, v12, Lw/o;->i:Lw/f;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    iget-object v12, v0, Lv/d;->e:Lw/m;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_5
    iget-object v13, v10, Lw/o;->h:Lw/f;

    .line 80
    .line 81
    iget-object v13, v13, Lw/f;->l:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    iget-object v13, v10, Lw/o;->i:Lw/f;

    .line 88
    .line 89
    iget-object v14, v13, Lw/f;->l:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    invoke-virtual {v10}, Lw/o;->j()J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    iget-object v5, v10, Lw/o;->h:Lw/f;

    .line 100
    .line 101
    if-eqz v11, :cond_a

    .line 102
    .line 103
    if-eqz v12, :cond_a

    .line 104
    .line 105
    const-wide/16 v0, 0x0

    .line 106
    .line 107
    invoke-static {v5, v0, v1}, Lw/l;->b(Lw/f;J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    move-object v6, v3

    .line 112
    move/from16 v16, v4

    .line 113
    .line 114
    invoke-static {v13, v0, v1}, Lw/l;->a(Lw/f;J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    sub-long/2addr v11, v14

    .line 119
    iget v0, v13, Lw/f;->f:I

    .line 120
    .line 121
    neg-int v1, v0

    .line 122
    move-object/from16 v18, v6

    .line 123
    .line 124
    move/from16 v17, v7

    .line 125
    .line 126
    int-to-long v6, v1

    .line 127
    cmp-long v1, v11, v6

    .line 128
    .line 129
    if-ltz v1, :cond_5

    .line 130
    .line 131
    int-to-long v0, v0

    .line 132
    add-long/2addr v11, v0

    .line 133
    :cond_5
    neg-long v0, v3

    .line 134
    sub-long/2addr v0, v14

    .line 135
    iget v3, v5, Lw/f;->f:I

    .line 136
    .line 137
    int-to-long v3, v3

    .line 138
    sub-long/2addr v0, v3

    .line 139
    cmp-long v6, v0, v3

    .line 140
    .line 141
    if-ltz v6, :cond_6

    .line 142
    .line 143
    sub-long/2addr v0, v3

    .line 144
    :cond_6
    iget-object v3, v10, Lw/o;->b:Lv/d;

    .line 145
    .line 146
    if-nez v2, :cond_7

    .line 147
    .line 148
    iget v3, v3, Lv/d;->d0:F

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_7
    const/4 v4, 0x1

    .line 152
    if-ne v2, v4, :cond_8

    .line 153
    .line 154
    iget v3, v3, Lv/d;->e0:F

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const/high16 v3, -0x40800000    # -1.0f

    .line 161
    .line 162
    :goto_6
    const/4 v4, 0x0

    .line 163
    const/high16 v6, 0x3f800000    # 1.0f

    .line 164
    .line 165
    cmpl-float v4, v3, v4

    .line 166
    .line 167
    if-lez v4, :cond_9

    .line 168
    .line 169
    long-to-float v0, v0

    .line 170
    div-float/2addr v0, v3

    .line 171
    long-to-float v1, v11

    .line 172
    sub-float v4, v6, v3

    .line 173
    .line 174
    div-float/2addr v1, v4

    .line 175
    add-float/2addr v1, v0

    .line 176
    float-to-long v0, v1

    .line 177
    goto :goto_7

    .line 178
    :cond_9
    const-wide/16 v0, 0x0

    .line 179
    .line 180
    :goto_7
    long-to-float v0, v0

    .line 181
    mul-float v1, v0, v3

    .line 182
    .line 183
    const/high16 v4, 0x3f000000    # 0.5f

    .line 184
    .line 185
    add-float/2addr v1, v4

    .line 186
    float-to-long v10, v1

    .line 187
    sub-float/2addr v6, v3

    .line 188
    mul-float v6, v6, v0

    .line 189
    .line 190
    add-float/2addr v6, v4

    .line 191
    float-to-long v0, v6

    .line 192
    add-long/2addr v10, v14

    .line 193
    add-long/2addr v10, v0

    .line 194
    iget v0, v5, Lw/f;->f:I

    .line 195
    .line 196
    int-to-long v0, v0

    .line 197
    add-long/2addr v0, v10

    .line 198
    iget v3, v13, Lw/f;->f:I

    .line 199
    .line 200
    int-to-long v3, v3

    .line 201
    sub-long/2addr v0, v3

    .line 202
    goto :goto_8

    .line 203
    :cond_a
    move-object/from16 v18, v3

    .line 204
    .line 205
    move/from16 v16, v4

    .line 206
    .line 207
    move/from16 v17, v7

    .line 208
    .line 209
    if-eqz v11, :cond_b

    .line 210
    .line 211
    iget v0, v5, Lw/f;->f:I

    .line 212
    .line 213
    int-to-long v0, v0

    .line 214
    invoke-static {v5, v0, v1}, Lw/l;->b(Lw/f;J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    iget v3, v5, Lw/f;->f:I

    .line 219
    .line 220
    int-to-long v3, v3

    .line 221
    add-long/2addr v3, v14

    .line 222
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 223
    .line 224
    .line 225
    move-result-wide v0

    .line 226
    goto :goto_8

    .line 227
    :cond_b
    if-eqz v12, :cond_c

    .line 228
    .line 229
    iget v0, v13, Lw/f;->f:I

    .line 230
    .line 231
    int-to-long v0, v0

    .line 232
    invoke-static {v13, v0, v1}, Lw/l;->a(Lw/f;J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    iget v3, v13, Lw/f;->f:I

    .line 237
    .line 238
    neg-int v3, v3

    .line 239
    int-to-long v3, v3

    .line 240
    add-long/2addr v3, v14

    .line 241
    neg-long v0, v0

    .line 242
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 243
    .line 244
    .line 245
    move-result-wide v0

    .line 246
    goto :goto_8

    .line 247
    :cond_c
    iget v0, v5, Lw/f;->f:I

    .line 248
    .line 249
    int-to-long v0, v0

    .line 250
    invoke-virtual {v10}, Lw/o;->j()J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    add-long/2addr v3, v0

    .line 255
    iget v0, v13, Lw/f;->f:I

    .line 256
    .line 257
    int-to-long v0, v0

    .line 258
    sub-long v0, v3, v0

    .line 259
    .line 260
    :goto_8
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v8

    .line 264
    add-int/lit8 v7, v17, 0x1

    .line 265
    .line 266
    move-object/from16 v1, p0

    .line 267
    .line 268
    move-object/from16 v0, p1

    .line 269
    .line 270
    move/from16 v4, v16

    .line 271
    .line 272
    move-object/from16 v3, v18

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_d
    long-to-int v0, v8

    .line 277
    return v0
.end method

.method public final e(Lw/o;ILjava/util/ArrayList;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lw/o;->h:Lw/f;

    .line 2
    .line 3
    iget-object v0, v0, Lw/f;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p1, Lw/o;->i:Lw/f;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lw/d;

    .line 23
    .line 24
    instance-of v2, v1, Lw/f;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v1, Lw/f;

    .line 29
    .line 30
    invoke-virtual {p0, v1, p2, p3, v3}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v2, v1, Lw/o;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    check-cast v1, Lw/o;

    .line 39
    .line 40
    iget-object v1, v1, Lw/o;->h:Lw/f;

    .line 41
    .line 42
    invoke-virtual {p0, v1, p2, p3, v3}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, v2, Lw/f;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lw/d;

    .line 63
    .line 64
    instance-of v2, v1, Lw/f;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, Lw/f;

    .line 69
    .line 70
    invoke-virtual {p0, v1, p2, p3, v3}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    instance-of v2, v1, Lw/o;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, Lw/o;

    .line 79
    .line 80
    iget-object v1, v1, Lw/o;->i:Lw/f;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p2, p3, v3}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const/4 v0, 0x1

    .line 87
    if-ne p2, v0, :cond_7

    .line 88
    .line 89
    check-cast p1, Lw/m;

    .line 90
    .line 91
    iget-object p1, p1, Lw/m;->k:Lw/f;

    .line 92
    .line 93
    iget-object p1, p1, Lw/f;->k:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lw/d;

    .line 110
    .line 111
    instance-of v1, v0, Lw/f;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, Lw/f;

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2, p3, v3}, Lw/e;->a(Lw/f;ILjava/util/ArrayList;Lw/l;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    return-void
.end method

.method public final f(IIIILv/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/e;->g:Lw/b;

    .line 2
    .line 3
    iput p1, v0, Lw/b;->a:I

    .line 4
    .line 5
    iput p3, v0, Lw/b;->b:I

    .line 6
    .line 7
    iput p2, v0, Lw/b;->c:I

    .line 8
    .line 9
    iput p4, v0, Lw/b;->d:I

    .line 10
    .line 11
    iget-object p1, p0, Lw/e;->f:Ly/f;

    .line 12
    .line 13
    invoke-virtual {p1, p5, v0}, Ly/f;->b(Lv/d;Lw/b;)V

    .line 14
    .line 15
    .line 16
    iget p1, v0, Lw/b;->e:I

    .line 17
    .line 18
    invoke-virtual {p5, p1}, Lv/d;->O(I)V

    .line 19
    .line 20
    .line 21
    iget p1, v0, Lw/b;->f:I

    .line 22
    .line 23
    invoke-virtual {p5, p1}, Lv/d;->L(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p1, v0, Lw/b;->h:Z

    .line 27
    .line 28
    iput-boolean p1, p5, Lv/d;->E:Z

    .line 29
    .line 30
    iget p1, v0, Lw/b;->g:I

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Lv/d;->I(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final g()V
    .locals 14

    .line 1
    iget-object v0, p0, Lw/e;->a:Lv/e;

    .line 2
    .line 3
    iget-object v0, v0, Lv/e;->q0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_b

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v7, v1

    .line 20
    check-cast v7, Lv/d;

    .line 21
    .line 22
    iget-boolean v1, v7, Lv/d;->a:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v1, v7, Lv/d;->p0:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    aget v8, v1, v2

    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    aget v1, v1, v9

    .line 34
    .line 35
    iget v3, v7, Lv/d;->r:I

    .line 36
    .line 37
    iget v4, v7, Lv/d;->s:I

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v10, 0x3

    .line 41
    if-eq v8, v5, :cond_3

    .line 42
    .line 43
    if-ne v8, v10, :cond_2

    .line 44
    .line 45
    if-ne v3, v9, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v3, 0x0

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 51
    :goto_2
    if-eq v1, v5, :cond_4

    .line 52
    .line 53
    if-ne v1, v10, :cond_5

    .line 54
    .line 55
    if-ne v4, v9, :cond_5

    .line 56
    .line 57
    :cond_4
    const/4 v2, 0x1

    .line 58
    :cond_5
    iget-object v4, v7, Lv/d;->d:Lw/k;

    .line 59
    .line 60
    iget-object v4, v4, Lw/o;->e:Lw/g;

    .line 61
    .line 62
    iget-boolean v6, v4, Lw/f;->j:Z

    .line 63
    .line 64
    iget-object v11, v7, Lv/d;->e:Lw/m;

    .line 65
    .line 66
    iget-object v11, v11, Lw/o;->e:Lw/g;

    .line 67
    .line 68
    iget-boolean v12, v11, Lw/f;->j:Z

    .line 69
    .line 70
    move v13, v3

    .line 71
    const/4 v3, 0x1

    .line 72
    if-eqz v6, :cond_6

    .line 73
    .line 74
    if-eqz v12, :cond_6

    .line 75
    .line 76
    iget v4, v4, Lw/f;->g:I

    .line 77
    .line 78
    iget v6, v11, Lw/f;->g:I

    .line 79
    .line 80
    move v5, v3

    .line 81
    move-object v2, p0

    .line 82
    invoke-virtual/range {v2 .. v7}, Lw/e;->f(IIIILv/d;)V

    .line 83
    .line 84
    .line 85
    iput-boolean v9, v7, Lv/d;->a:Z

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    if-eqz v6, :cond_8

    .line 89
    .line 90
    if-eqz v2, :cond_8

    .line 91
    .line 92
    iget v4, v4, Lw/f;->g:I

    .line 93
    .line 94
    iget v6, v11, Lw/f;->g:I

    .line 95
    .line 96
    move-object v2, p0

    .line 97
    invoke-virtual/range {v2 .. v7}, Lw/e;->f(IIIILv/d;)V

    .line 98
    .line 99
    .line 100
    if-ne v1, v10, :cond_7

    .line 101
    .line 102
    iget-object v1, v7, Lv/d;->e:Lw/m;

    .line 103
    .line 104
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 105
    .line 106
    invoke-virtual {v7}, Lv/d;->k()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    iput v2, v1, Lw/g;->m:I

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    iget-object v1, v7, Lv/d;->e:Lw/m;

    .line 114
    .line 115
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 116
    .line 117
    invoke-virtual {v7}, Lv/d;->k()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 122
    .line 123
    .line 124
    iput-boolean v9, v7, Lv/d;->a:Z

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_8
    const/4 v3, 0x2

    .line 128
    const/4 v5, 0x1

    .line 129
    if-eqz v12, :cond_a

    .line 130
    .line 131
    if-eqz v13, :cond_a

    .line 132
    .line 133
    iget v4, v4, Lw/f;->g:I

    .line 134
    .line 135
    iget v6, v11, Lw/f;->g:I

    .line 136
    .line 137
    move-object v2, p0

    .line 138
    invoke-virtual/range {v2 .. v7}, Lw/e;->f(IIIILv/d;)V

    .line 139
    .line 140
    .line 141
    if-ne v8, v10, :cond_9

    .line 142
    .line 143
    iget-object v1, v7, Lv/d;->d:Lw/k;

    .line 144
    .line 145
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 146
    .line 147
    invoke-virtual {v7}, Lv/d;->q()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    iput v2, v1, Lw/g;->m:I

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_9
    iget-object v1, v7, Lv/d;->d:Lw/k;

    .line 155
    .line 156
    iget-object v1, v1, Lw/o;->e:Lw/g;

    .line 157
    .line 158
    invoke-virtual {v7}, Lv/d;->q()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 163
    .line 164
    .line 165
    iput-boolean v9, v7, Lv/d;->a:Z

    .line 166
    .line 167
    :cond_a
    :goto_3
    iget-boolean v1, v7, Lv/d;->a:Z

    .line 168
    .line 169
    if-eqz v1, :cond_0

    .line 170
    .line 171
    iget-object v1, v7, Lv/d;->e:Lw/m;

    .line 172
    .line 173
    iget-object v1, v1, Lw/m;->l:Lw/a;

    .line 174
    .line 175
    if-eqz v1, :cond_0

    .line 176
    .line 177
    iget v2, v7, Lv/d;->a0:I

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Lw/g;->d(I)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    return-void
.end method

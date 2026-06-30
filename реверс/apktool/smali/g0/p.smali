.class public final Lg0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/ThreadLocal;

.field public static final f:LA/j;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:J

.field public c:J

.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg0/p;->e:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, LA/j;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, LA/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lg0/p;->f:LA/j;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg0/p;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg0/p;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method

.method public static c(Landroidx/recyclerview/widget/RecyclerView;IJ)Lg0/b0;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/c;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lg0/c;->g(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lg0/b0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget v4, v3, Lg0/b0;->c:I

    .line 22
    .line 23
    if-ne v4, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Lg0/b0;->f()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 37
    .line 38
    const-wide v2, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v4, p2, v2

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    :try_start_0
    invoke-static {}, LJ/k;->a()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const-string v2, "RV Prefetch forced - needed next frame"

    .line 54
    .line 55
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->T()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, p2, p3}, Lg0/Q;->k(IJ)Lg0/b0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lg0/b0;->e()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    invoke-virtual {p1}, Lg0/b0;->f()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_3

    .line 81
    .line 82
    iget-object p2, p1, Lg0/b0;->a:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v0, p2}, Lg0/Q;->h(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {v0, p1, v1}, Lg0/Q;->a(Lg0/b0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->U(Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :goto_3
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->U(Z)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    throw p1
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lg0/p;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string p2, "attempting to post unregistered view!"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    iget-wide v0, p0, Lg0/p;->b:J

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p0, Lg0/p;->b:J

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 44
    .line 45
    iput p2, p1, Lg0/n;->a:I

    .line 46
    .line 47
    iput p3, p1, Lg0/n;->b:I

    .line 48
    .line 49
    return-void
.end method

.method public final b(J)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Lg0/p;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    :goto_0
    if-ge v6, v4, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    if-nez v9, :cond_0

    .line 27
    .line 28
    iget-object v9, v8, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 29
    .line 30
    invoke-virtual {v9, v8, v5}, Lg0/n;->b(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 31
    .line 32
    .line 33
    iget v8, v9, Lg0/n;->d:I

    .line 34
    .line 35
    add-int/2addr v7, v8

    .line 36
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v6, v1, Lg0/p;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 42
    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    :goto_1
    if-ge v7, v4, :cond_6

    .line 47
    .line 48
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    invoke-virtual {v10}, Landroid/view/View;->getWindowVisibility()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_2

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_2
    iget-object v11, v10, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 62
    .line 63
    iget v12, v11, Lg0/n;->a:I

    .line 64
    .line 65
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    iget v13, v11, Lg0/n;->b:I

    .line 70
    .line 71
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    add-int/2addr v13, v12

    .line 76
    const/4 v12, 0x0

    .line 77
    :goto_2
    iget v14, v11, Lg0/n;->d:I

    .line 78
    .line 79
    mul-int/lit8 v14, v14, 0x2

    .line 80
    .line 81
    if-ge v12, v14, :cond_5

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-lt v8, v14, :cond_3

    .line 88
    .line 89
    new-instance v14, Lg0/o;

    .line 90
    .line 91
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    check-cast v14, Lg0/o;

    .line 103
    .line 104
    :goto_3
    iget-object v15, v11, Lg0/n;->c:[I

    .line 105
    .line 106
    add-int/lit8 v16, v12, 0x1

    .line 107
    .line 108
    aget v5, v15, v16

    .line 109
    .line 110
    if-gt v5, v13, :cond_4

    .line 111
    .line 112
    const/4 v9, 0x1

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    const/4 v9, 0x0

    .line 115
    :goto_4
    iput-boolean v9, v14, Lg0/o;->a:Z

    .line 116
    .line 117
    iput v13, v14, Lg0/o;->b:I

    .line 118
    .line 119
    iput v5, v14, Lg0/o;->c:I

    .line 120
    .line 121
    iput-object v10, v14, Lg0/o;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    aget v5, v15, v12

    .line 124
    .line 125
    iput v5, v14, Lg0/o;->e:I

    .line 126
    .line 127
    add-int/lit8 v8, v8, 0x1

    .line 128
    .line 129
    add-int/lit8 v12, v12, 0x2

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    goto :goto_1

    .line 137
    :cond_6
    sget-object v0, Lg0/p;->f:LA/j;

    .line 138
    .line 139
    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-ge v0, v4, :cond_10

    .line 148
    .line 149
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Lg0/o;

    .line 154
    .line 155
    iget-object v5, v4, Lg0/o;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 156
    .line 157
    if-nez v5, :cond_7

    .line 158
    .line 159
    goto/16 :goto_d

    .line 160
    .line 161
    :cond_7
    iget-boolean v7, v4, Lg0/o;->a:Z

    .line 162
    .line 163
    const-wide v8, 0x7fffffffffffffffL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    move-wide v10, v8

    .line 171
    goto :goto_7

    .line 172
    :cond_8
    move-wide v10, v2

    .line 173
    :goto_7
    iget v7, v4, Lg0/o;->e:I

    .line 174
    .line 175
    invoke-static {v5, v7, v10, v11}, Lg0/p;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)Lg0/b0;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-eqz v5, :cond_9

    .line 180
    .line 181
    iget-object v7, v5, Lg0/b0;->b:Ljava/lang/ref/WeakReference;

    .line 182
    .line 183
    if-eqz v7, :cond_9

    .line 184
    .line 185
    invoke-virtual {v5}, Lg0/b0;->e()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_9

    .line 190
    .line 191
    invoke-virtual {v5}, Lg0/b0;->f()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-nez v7, :cond_9

    .line 196
    .line 197
    iget-object v5, v5, Lg0/b0;->b:Ljava/lang/ref/WeakReference;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 204
    .line 205
    if-nez v5, :cond_a

    .line 206
    .line 207
    :cond_9
    const/4 v10, 0x1

    .line 208
    goto :goto_a

    .line 209
    :cond_a
    iget-boolean v7, v5, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    .line 210
    .line 211
    if-eqz v7, :cond_d

    .line 212
    .line 213
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->f:Lg0/c;

    .line 214
    .line 215
    invoke-virtual {v7}, Lg0/c;->h()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_d

    .line 220
    .line 221
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->J:Lg0/G;

    .line 222
    .line 223
    if-eqz v7, :cond_b

    .line 224
    .line 225
    invoke-virtual {v7}, Lg0/G;->e()V

    .line 226
    .line 227
    .line 228
    :cond_b
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->m:Lg0/K;

    .line 229
    .line 230
    iget-object v10, v5, Landroidx/recyclerview/widget/RecyclerView;->c:Lg0/Q;

    .line 231
    .line 232
    if-eqz v7, :cond_c

    .line 233
    .line 234
    invoke-virtual {v7, v10}, Lg0/K;->j0(Lg0/Q;)V

    .line 235
    .line 236
    .line 237
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->m:Lg0/K;

    .line 238
    .line 239
    invoke-virtual {v7, v10}, Lg0/K;->k0(Lg0/Q;)V

    .line 240
    .line 241
    .line 242
    :cond_c
    iget-object v7, v10, Lg0/Q;->a:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v10}, Lg0/Q;->f()V

    .line 248
    .line 249
    .line 250
    :cond_d
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->d0:Lg0/n;

    .line 251
    .line 252
    const/4 v10, 0x1

    .line 253
    invoke-virtual {v7, v5, v10}, Lg0/n;->b(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 254
    .line 255
    .line 256
    iget v10, v7, Lg0/n;->d:I

    .line 257
    .line 258
    if-eqz v10, :cond_9

    .line 259
    .line 260
    cmp-long v10, v2, v8

    .line 261
    .line 262
    if-nez v10, :cond_e

    .line 263
    .line 264
    :try_start_0
    const-string v8, "RV Nested Prefetch"

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :catchall_0
    move-exception v0

    .line 268
    goto :goto_b

    .line 269
    :cond_e
    const-string v8, "RV Nested Prefetch forced - needed next frame"

    .line 270
    .line 271
    :goto_8
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->e0:Lg0/X;

    .line 275
    .line 276
    iget-object v9, v5, Landroidx/recyclerview/widget/RecyclerView;->l:Lg0/B;

    .line 277
    .line 278
    const/4 v10, 0x1

    .line 279
    iput v10, v8, Lg0/X;->d:I

    .line 280
    .line 281
    invoke-virtual {v9}, Lg0/B;->a()I

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    iput v9, v8, Lg0/X;->e:I

    .line 286
    .line 287
    const/4 v9, 0x0

    .line 288
    iput-boolean v9, v8, Lg0/X;->g:Z

    .line 289
    .line 290
    iput-boolean v9, v8, Lg0/X;->h:Z

    .line 291
    .line 292
    iput-boolean v9, v8, Lg0/X;->i:Z

    .line 293
    .line 294
    const/4 v9, 0x0

    .line 295
    :goto_9
    iget v8, v7, Lg0/n;->d:I

    .line 296
    .line 297
    mul-int/lit8 v8, v8, 0x2

    .line 298
    .line 299
    if-ge v9, v8, :cond_f

    .line 300
    .line 301
    iget-object v8, v7, Lg0/n;->c:[I

    .line 302
    .line 303
    aget v8, v8, v9

    .line 304
    .line 305
    invoke-static {v5, v8, v2, v3}, Lg0/p;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)Lg0/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    .line 307
    .line 308
    add-int/lit8 v9, v9, 0x2

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 312
    .line 313
    .line 314
    :goto_a
    const/4 v9, 0x0

    .line 315
    goto :goto_c

    .line 316
    :goto_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :goto_c
    iput-boolean v9, v4, Lg0/o;->a:Z

    .line 321
    .line 322
    iput v9, v4, Lg0/o;->b:I

    .line 323
    .line 324
    iput v9, v4, Lg0/o;->c:I

    .line 325
    .line 326
    const/4 v5, 0x0

    .line 327
    iput-object v5, v4, Lg0/o;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 328
    .line 329
    iput v9, v4, Lg0/o;->e:I

    .line 330
    .line 331
    add-int/lit8 v0, v0, 0x1

    .line 332
    .line 333
    goto/16 :goto_6

    .line 334
    .line 335
    :cond_10
    :goto_d
    return-void
.end method

.method public final run()V
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v2, "RV Prefetch"

    .line 4
    .line 5
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lg0/p;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :goto_0
    iput-wide v0, p0, Lg0/p;->b:J

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    move-wide v5, v0

    .line 28
    :goto_1
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v2

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    cmp-long v2, v5, v0

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    iget-wide v4, p0, Lg0/p;->c:J

    .line 68
    .line 69
    add-long/2addr v2, v4

    .line 70
    invoke-virtual {p0, v2, v3}, Lg0/p;->b(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_3
    iput-wide v0, p0, Lg0/p;->b:J

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    throw v2
.end method

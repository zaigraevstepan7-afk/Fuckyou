.class public abstract LK/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK/d;->a:LK/b;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/content/Context;LK/e;)LK/j;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v1, LK/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    if-eqz v6, :cond_13

    .line 23
    .line 24
    iget-object v7, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v8, v1, LK/e;->c:Ljava/io/Serializable;

    .line 27
    .line 28
    check-cast v8, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_12

    .line 35
    .line 36
    iget-object v4, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 37
    .line 38
    const/16 v7, 0x40

    .line 39
    .line 40
    invoke-virtual {v2, v4, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 45
    .line 46
    new-instance v4, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    array-length v7, v2

    .line 52
    const/4 v8, 0x0

    .line 53
    :goto_0
    if-ge v8, v7, :cond_0

    .line 54
    .line 55
    aget-object v9, v2, v8

    .line 56
    .line 57
    invoke-virtual {v9}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    sget-object v2, LK/d;->a:LK/b;

    .line 68
    .line 69
    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 70
    .line 71
    .line 72
    iget-object v7, v1, LK/e;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Ljava/util/List;

    .line 75
    .line 76
    if-eqz v7, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-static {v3, v5}, LE/b;->k(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    :goto_1
    const/4 v3, 0x0

    .line 84
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const/4 v9, 0x0

    .line 89
    if-ge v3, v8, :cond_4

    .line 90
    .line 91
    new-instance v8, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    check-cast v10, Ljava/util/Collection;

    .line 98
    .line 99
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v8, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-eq v10, v11, :cond_2

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_2
    const/4 v10, 0x0

    .line 117
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-ge v10, v11, :cond_5

    .line 122
    .line 123
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    check-cast v11, [B

    .line 128
    .line 129
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    check-cast v12, [B

    .line 134
    .line 135
    invoke-static {v11, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-nez v11, :cond_3

    .line 140
    .line 141
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    move-object v6, v9

    .line 148
    :cond_5
    const/4 v2, 0x1

    .line 149
    if-nez v6, :cond_6

    .line 150
    .line 151
    new-instance v0, LK/j;

    .line 152
    .line 153
    invoke-direct {v0, v2, v9}, LK/j;-><init>(I[LK/k;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_6
    iget-object v3, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 158
    .line 159
    new-instance v4, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    new-instance v6, Landroid/net/Uri$Builder;

    .line 165
    .line 166
    invoke-direct {v6}, Landroid/net/Uri$Builder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v7, "content"

    .line 170
    .line 171
    invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v6, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v6}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    new-instance v6, Landroid/net/Uri$Builder;

    .line 184
    .line 185
    invoke-direct {v6}, Landroid/net/Uri$Builder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v6, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    const-string v6, "file"

    .line 197
    .line 198
    invoke-virtual {v3, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 207
    .line 208
    const/16 v7, 0x18

    .line 209
    .line 210
    if-ge v6, v7, :cond_7

    .line 211
    .line 212
    new-instance v6, LK/c;

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    invoke-direct {v6, v0, v11, v7}, LK/c;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    new-instance v6, LK/c;

    .line 220
    .line 221
    const/4 v7, 0x1

    .line 222
    invoke-direct {v6, v0, v11, v7}, LK/c;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 223
    .line 224
    .line 225
    :goto_5
    :try_start_0
    const-string v12, "_id"

    .line 226
    .line 227
    const-string v13, "file_id"

    .line 228
    .line 229
    const-string v14, "font_ttc_index"

    .line 230
    .line 231
    const-string v15, "font_variation_settings"

    .line 232
    .line 233
    const-string v16, "font_weight"

    .line 234
    .line 235
    const-string v17, "font_italic"

    .line 236
    .line 237
    const-string v18, "result_code"

    .line 238
    .line 239
    filled-new-array/range {v12 .. v18}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    iget-object v0, v1, LK/e;->d:Ljava/io/Serializable;

    .line 244
    .line 245
    check-cast v0, Ljava/lang/String;

    .line 246
    .line 247
    filled-new-array {v0}, [Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v14

    .line 251
    iget v0, v6, LK/c;->a:I

    .line 252
    .line 253
    packed-switch v0, :pswitch_data_0

    .line 254
    .line 255
    .line 256
    const-string v13, "query = ?"

    .line 257
    .line 258
    const/4 v1, 0x0

    .line 259
    iget-object v10, v6, LK/c;->b:Landroid/content/ContentProviderClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    .line 261
    if-nez v10, :cond_8

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_8
    const/4 v15, 0x0

    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    :try_start_1
    invoke-virtual/range {v10 .. v16}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 268
    .line 269
    .line 270
    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    goto :goto_6

    .line 272
    :catch_0
    move-exception v0

    .line 273
    :try_start_2
    const-string v7, "FontsProvider"

    .line 274
    .line 275
    const-string v8, "Unable to query the content provider"

    .line 276
    .line 277
    invoke-static {v7, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 278
    .line 279
    .line 280
    :goto_6
    move-object v9, v1

    .line 281
    goto :goto_7

    .line 282
    :pswitch_0
    const-string v13, "query = ?"

    .line 283
    .line 284
    const/4 v1, 0x0

    .line 285
    iget-object v10, v6, LK/c;->b:Landroid/content/ContentProviderClient;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 286
    .line 287
    if-nez v10, :cond_9

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_9
    const/4 v15, 0x0

    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    :try_start_3
    invoke-virtual/range {v10 .. v16}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 294
    .line 295
    .line 296
    move-result-object v1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 297
    goto :goto_6

    .line 298
    :catch_1
    move-exception v0

    .line 299
    :try_start_4
    const-string v7, "FontsProvider"

    .line 300
    .line 301
    const-string v8, "Unable to query the content provider"

    .line 302
    .line 303
    invoke-static {v7, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :goto_7
    if-eqz v9, :cond_f

    .line 308
    .line 309
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-lez v0, :cond_f

    .line 314
    .line 315
    const-string v0, "result_code"

    .line 316
    .line 317
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    new-instance v4, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v1, "_id"

    .line 327
    .line 328
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    const-string v7, "file_id"

    .line 333
    .line 334
    invoke-interface {v9, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    const-string v8, "font_ttc_index"

    .line 339
    .line 340
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    const-string v10, "font_weight"

    .line 345
    .line 346
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    const-string v12, "font_italic"

    .line 351
    .line 352
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    :goto_8
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-eqz v13, :cond_f

    .line 361
    .line 362
    const/4 v13, -0x1

    .line 363
    if-eq v0, v13, :cond_a

    .line 364
    .line 365
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 366
    .line 367
    .line 368
    move-result v14

    .line 369
    move/from16 v18, v14

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :catchall_0
    move-exception v0

    .line 373
    move-object/from16 p0, v6

    .line 374
    .line 375
    goto/16 :goto_f

    .line 376
    .line 377
    :cond_a
    const/16 v18, 0x0

    .line 378
    .line 379
    :goto_9
    if-eq v8, v13, :cond_b

    .line 380
    .line 381
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 382
    .line 383
    .line 384
    move-result v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 385
    move v15, v14

    .line 386
    goto :goto_a

    .line 387
    :cond_b
    const/4 v15, 0x0

    .line 388
    :goto_a
    if-ne v7, v13, :cond_c

    .line 389
    .line 390
    move-object/from16 p0, v6

    .line 391
    .line 392
    :try_start_5
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 393
    .line 394
    .line 395
    move-result-wide v5

    .line 396
    invoke-static {v11, v5, v6}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    :goto_b
    move-object v14, v5

    .line 401
    goto :goto_c

    .line 402
    :catchall_1
    move-exception v0

    .line 403
    goto :goto_f

    .line 404
    :cond_c
    move-object/from16 p0, v6

    .line 405
    .line 406
    invoke-interface {v9, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 407
    .line 408
    .line 409
    move-result-wide v5

    .line 410
    invoke-static {v3, v5, v6}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    goto :goto_b

    .line 415
    :goto_c
    if-eq v10, v13, :cond_d

    .line 416
    .line 417
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    move/from16 v16, v5

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_d
    const/16 v5, 0x190

    .line 425
    .line 426
    const/16 v16, 0x190

    .line 427
    .line 428
    :goto_d
    if-eq v12, v13, :cond_e

    .line 429
    .line 430
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-ne v5, v2, :cond_e

    .line 435
    .line 436
    const/16 v17, 0x1

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_e
    const/16 v17, 0x0

    .line 440
    .line 441
    :goto_e
    new-instance v13, LK/k;

    .line 442
    .line 443
    invoke-direct/range {v13 .. v18}, LK/k;-><init>(Landroid/net/Uri;IIZI)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 447
    .line 448
    .line 449
    const/4 v5, 0x0

    .line 450
    move-object/from16 v6, p0

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_f
    move-object/from16 p0, v6

    .line 454
    .line 455
    if-eqz v9, :cond_10

    .line 456
    .line 457
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 458
    .line 459
    .line 460
    :cond_10
    invoke-virtual/range {p0 .. p0}, LK/c;->a()V

    .line 461
    .line 462
    .line 463
    const/4 v1, 0x0

    .line 464
    new-array v0, v1, [LK/k;

    .line 465
    .line 466
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, [LK/k;

    .line 471
    .line 472
    new-instance v2, LK/j;

    .line 473
    .line 474
    invoke-direct {v2, v1, v0}, LK/j;-><init>(I[LK/k;)V

    .line 475
    .line 476
    .line 477
    return-object v2

    .line 478
    :goto_f
    if-eqz v9, :cond_11

    .line 479
    .line 480
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 481
    .line 482
    .line 483
    :cond_11
    invoke-virtual/range {p0 .. p0}, LK/c;->a()V

    .line 484
    .line 485
    .line 486
    throw v0

    .line 487
    :cond_12
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 488
    .line 489
    new-instance v1, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    const-string v2, "Found content provider "

    .line 492
    .line 493
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    const-string v2, ", but package was not "

    .line 500
    .line 501
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0

    .line 515
    :cond_13
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 516
    .line 517
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v2, "No package found for authority: "

    .line 520
    .line 521
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v0

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

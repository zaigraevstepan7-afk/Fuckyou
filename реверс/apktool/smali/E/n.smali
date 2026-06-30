.class public final synthetic LE/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LE/n;->a:I

    iput-object p1, p0, LE/n;->b:Ljava/lang/Object;

    iput-object p3, p0, LE/n;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LE/n;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, LE/n;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, LE/n;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/lang/Runnable;

    .line 13
    .line 14
    check-cast v2, Le/p;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Le/p;->a()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-virtual {v2}, Le/p;->a()V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :pswitch_0
    sget-object v0, Lcom/reddit/frontpage/MainActivity;->L:Ljavax/net/ssl/SSLSocketFactory;

    .line 32
    .line 33
    check-cast v2, Lcom/reddit/frontpage/MainActivity;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v3, Ljava/lang/Exception;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    const-string v1, "Error"

    .line 56
    .line 57
    invoke-virtual {v2, v1, v0}, Lcom/reddit/frontpage/MainActivity;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/reddit/frontpage/MainActivity;->F()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    move-object v4, v3

    .line 65
    check-cast v4, Landroid/net/Uri;

    .line 66
    .line 67
    sget v3, Lcom/reddit/frontpage/ConfigsActivity;->H:I

    .line 68
    .line 69
    check-cast v2, Lcom/reddit/frontpage/ConfigsActivity;

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 81
    .line 82
    .line 83
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    const-string v5, "_display_name"

    .line 93
    .line 94
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-ltz v5, :cond_1

    .line 99
    .line 100
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    move-object v9, v3

    .line 110
    goto :goto_2

    .line 111
    :catch_0
    nop

    .line 112
    goto :goto_3

    .line 113
    :cond_1
    if-eqz v3, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_2
    move-exception v0

    .line 117
    goto :goto_2

    .line 118
    :catch_1
    nop

    .line 119
    move-object v3, v9

    .line 120
    goto :goto_3

    .line 121
    :goto_2
    if-eqz v9, :cond_2

    .line 122
    .line 123
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 124
    .line 125
    .line 126
    :cond_2
    throw v0

    .line 127
    :goto_3
    if-eqz v3, :cond_3

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    :goto_4
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const-string v5, ".cfg"

    .line 135
    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v6, "config_"

    .line 141
    .line 142
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    :cond_4
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 160
    .line 161
    invoke-virtual {v9, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v6, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-nez v6, :cond_5

    .line 170
    .line 171
    new-instance v1, LQ0/i;

    .line 172
    .line 173
    invoke-direct {v1, v2, v0}, LQ0/i;-><init>(Lcom/reddit/frontpage/ConfigsActivity;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_5
    invoke-static {v9}, Lcom/reddit/frontpage/ConfigsActivity;->C(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_6

    .line 194
    .line 195
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :cond_6
    new-instance v3, Ljava/io/File;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    new-instance v6, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v7, "cfg_import_"

    .line 208
    .line 209
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v7, ".tmp"

    .line 220
    .line 221
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :try_start_3
    invoke-virtual {v2, v4, v3}, Lcom/reddit/frontpage/ConfigsActivity;->s(Landroid/net/Uri;Ljava/io/File;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_a

    .line 236
    .line 237
    invoke-virtual {v2}, Lcom/reddit/frontpage/ConfigsActivity;->t()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_9

    .line 242
    .line 243
    invoke-static {v0}, Lcom/reddit/frontpage/ConfigsActivity;->r(Ljava/lang/String;)Ljava/io/File;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    invoke-virtual {v2, v3, v0}, Lcom/reddit/frontpage/ConfigsActivity;->x(Ljava/io/File;Ljava/io/File;)Z

    .line 250
    .line 251
    .line 252
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 253
    if-eqz v0, :cond_7

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_d

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 262
    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_7
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    .line 266
    .line 267
    const-string v4, "Move operation failed."

    .line 268
    .line 269
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :catchall_3
    move-exception v0

    .line 274
    goto :goto_5

    .line 275
    :catch_2
    nop

    .line 276
    goto :goto_6

    .line 277
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 278
    .line 279
    const-string v4, "Invalid destination path."

    .line 280
    .line 281
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 286
    .line 287
    const-string v4, "Unable to access configs directory."

    .line 288
    .line 289
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_a
    new-instance v0, Ljava/io/IOException;

    .line 294
    .line 295
    const-string v4, "Copy from picker uri failed."

    .line 296
    .line 297
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 301
    :goto_5
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_b

    .line 306
    .line 307
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 308
    .line 309
    .line 310
    :cond_b
    throw v0

    .line 311
    :goto_6
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_c

    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 318
    .line 319
    .line 320
    :cond_c
    const/4 v0, 0x0

    .line 321
    :cond_d
    :goto_7
    new-instance v3, LQ0/b;

    .line 322
    .line 323
    invoke-direct {v3, v2, v0, v1}, LQ0/b;-><init>(Le/k;ZI)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 327
    .line 328
    .line 329
    :goto_8
    return-void

    .line 330
    :pswitch_2
    check-cast v2, Lcom/reddit/frontpage/ConfigsActivity;

    .line 331
    .line 332
    iget-object v4, v2, Lcom/reddit/frontpage/ConfigsActivity;->y:Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 335
    .line 336
    .line 337
    check-cast v3, Ljava/util/ArrayList;

    .line 338
    .line 339
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 340
    .line 341
    .line 342
    iget-object v3, v2, Lcom/reddit/frontpage/ConfigsActivity;->F:LQ0/m;

    .line 343
    .line 344
    iget-object v3, v3, Lg0/B;->a:Lg0/C;

    .line 345
    .line 346
    invoke-virtual {v3}, Lg0/C;->b()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    iget-object v5, v2, Lcom/reddit/frontpage/ConfigsActivity;->C:Landroid/widget/TextView;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    new-array v0, v0, [Ljava/lang/Object;

    .line 364
    .line 365
    aput-object v4, v0, v1

    .line 366
    .line 367
    const v4, 0x7f0f0040

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    iget-object v0, v2, Lcom/reddit/frontpage/ConfigsActivity;->B:Landroid/view/View;

    .line 378
    .line 379
    if-eqz v3, :cond_e

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_e
    const/16 v1, 0x8

    .line 383
    .line 384
    :goto_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :pswitch_3
    sget v4, Lcom/reddit/frontpage/ConfigsActivity;->H:I

    .line 389
    .line 390
    check-cast v2, Lcom/reddit/frontpage/ConfigsActivity;

    .line 391
    .line 392
    new-instance v4, Ljava/io/File;

    .line 393
    .line 394
    check-cast v3, LQ0/n;

    .line 395
    .line 396
    iget-object v3, v3, LQ0/n;->b:Ljava/lang/String;

    .line 397
    .line 398
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-nez v3, :cond_10

    .line 406
    .line 407
    new-instance v3, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    const-string v5, "rm -f "

    .line 410
    .line 411
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-static {v4}, Lcom/reddit/frontpage/ConfigsActivity;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {v2, v3}, Lcom/reddit/frontpage/ConfigsActivity;->u(Ljava/lang/String;)LQ0/j;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    iget v3, v3, LQ0/j;->a:I

    .line 434
    .line 435
    if-nez v3, :cond_f

    .line 436
    .line 437
    const/4 v1, 0x1

    .line 438
    :cond_f
    move v3, v1

    .line 439
    :cond_10
    new-instance v1, LQ0/b;

    .line 440
    .line 441
    invoke-direct {v1, v2, v3, v0}, LQ0/b;-><init>(Le/k;ZI)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :pswitch_4
    check-cast v2, LE/b;

    .line 449
    .line 450
    check-cast v3, Landroid/graphics/Typeface;

    .line 451
    .line 452
    invoke-virtual {v2, v3}, LE/b;->i(Landroid/graphics/Typeface;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    nop

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

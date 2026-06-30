.class public final synthetic LC/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC/a;->a:I

    iput-object p2, p0, LC/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget v4, p0, LC/a;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg0/K;->o0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/android/material/timepicker/e;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->m()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroidx/lifecycle/B;

    .line 29
    .line 30
    const-string v1, "this$0"

    .line 31
    .line 32
    invoke-static {v0, v1}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget v1, v0, Landroidx/lifecycle/B;->b:I

    .line 36
    .line 37
    iget-object v2, v0, Landroidx/lifecycle/B;->f:Landroidx/lifecycle/t;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iput-boolean v3, v0, Landroidx/lifecycle/B;->c:Z

    .line 42
    .line 43
    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget v1, v0, Landroidx/lifecycle/B;->a:I

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, v0, Landroidx/lifecycle/B;->c:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    .line 59
    .line 60
    .line 61
    iput-boolean v3, v0, Landroidx/lifecycle/B;->d:Z

    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_2
    iget-object v1, p0, LC/a;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Landroidx/emoji2/text/p;

    .line 67
    .line 68
    const-string v4, "fetchFonts result is not OK. ("

    .line 69
    .line 70
    iget-object v5, v1, Landroidx/emoji2/text/p;->d:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v5

    .line 73
    :try_start_0
    iget-object v6, v1, Landroidx/emoji2/text/p;->h:LT/m;

    .line 74
    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    monitor-exit v5

    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :try_start_1
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->c()LK/k;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget v6, v5, LK/k;->e:I

    .line 89
    .line 90
    if-ne v6, v0, :cond_3

    .line 91
    .line 92
    iget-object v0, v1, Landroidx/emoji2/text/p;->d:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 95
    :try_start_2
    monitor-exit v0

    .line 96
    goto :goto_0

    .line 97
    :catchall_1
    move-exception v2

    .line 98
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 100
    :catchall_2
    move-exception v0

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_3
    :goto_0
    if-nez v6, :cond_6

    .line 104
    .line 105
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 106
    .line 107
    sget-object v4, LJ/k;->b:Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v1, Landroidx/emoji2/text/p;->c:LI0/e;

    .line 113
    .line 114
    iget-object v4, v1, Landroidx/emoji2/text/p;->a:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-array v0, v3, [LK/k;

    .line 120
    .line 121
    aput-object v5, v0, v2

    .line 122
    .line 123
    sget-object v3, LF/g;->a:LA0/e;

    .line 124
    .line 125
    invoke-virtual {v3, v4, v0, v2}, LA0/e;->v(Landroid/content/Context;[LK/k;I)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v2, v1, Landroidx/emoji2/text/p;->a:Landroid/content/Context;

    .line 130
    .line 131
    iget-object v3, v5, LK/k;->a:Landroid/net/Uri;

    .line 132
    .line 133
    invoke-static {v2, v3}, LA0/e;->j0(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    :try_start_5
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 142
    .line 143
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v3, LA/k;

    .line 147
    .line 148
    invoke-static {v2}, LT/m;->X(Ljava/nio/MappedByteBuffer;)LX/b;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-direct {v3, v0, v2}, LA/k;-><init>(Landroid/graphics/Typeface;LX/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 153
    .line 154
    .line 155
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 156
    .line 157
    .line 158
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 159
    .line 160
    .line 161
    iget-object v0, v1, Landroidx/emoji2/text/p;->d:Ljava/lang/Object;

    .line 162
    .line 163
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 164
    :try_start_8
    iget-object v2, v1, Landroidx/emoji2/text/p;->h:LT/m;

    .line 165
    .line 166
    if-eqz v2, :cond_4

    .line 167
    .line 168
    invoke-virtual {v2, v3}, LT/m;->P(LA/k;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catchall_3
    move-exception v2

    .line 173
    goto :goto_2

    .line 174
    :cond_4
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 175
    :try_start_9
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 180
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 181
    :catchall_4
    move-exception v0

    .line 182
    :try_start_c
    sget-object v2, LJ/k;->b:Ljava/lang/reflect/Method;

    .line 183
    .line 184
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 189
    .line 190
    const-string v2, "Unable to open file."

    .line 191
    .line 192
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 196
    :catchall_5
    move-exception v0

    .line 197
    :try_start_d
    sget-object v2, LJ/k;->b:Ljava/lang/reflect/Method;

    .line 198
    .line 199
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 204
    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v3, ")"

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 226
    :goto_3
    iget-object v2, v1, Landroidx/emoji2/text/p;->d:Ljava/lang/Object;

    .line 227
    .line 228
    monitor-enter v2

    .line 229
    :try_start_e
    iget-object v3, v1, Landroidx/emoji2/text/p;->h:LT/m;

    .line 230
    .line 231
    if-eqz v3, :cond_7

    .line 232
    .line 233
    invoke-virtual {v3, v0}, LT/m;->M(Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :catchall_6
    move-exception v0

    .line 238
    goto :goto_6

    .line 239
    :cond_7
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 240
    invoke-virtual {v1}, Landroidx/emoji2/text/p;->a()V

    .line 241
    .line 242
    .line 243
    :goto_5
    return-void

    .line 244
    :goto_6
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 245
    throw v0

    .line 246
    :goto_7
    :try_start_10
    monitor-exit v5
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 247
    throw v0

    .line 248
    :pswitch_3
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Landroidx/activity/l;

    .line 251
    .line 252
    invoke-static {v0}, Landroidx/activity/l;->a(Landroidx/activity/l;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_4
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Landroidx/activity/j;

    .line 259
    .line 260
    iget-object v2, v0, Landroidx/activity/j;->b:Ljava/lang/Runnable;

    .line 261
    .line 262
    if-eqz v2, :cond_8

    .line 263
    .line 264
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 265
    .line 266
    .line 267
    iput-object v1, v0, Landroidx/activity/j;->b:Ljava/lang/Runnable;

    .line 268
    .line 269
    :cond_8
    return-void

    .line 270
    :pswitch_5
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Le/k;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_6
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 281
    .line 282
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_7
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, LM0/m;

    .line 291
    .line 292
    iget-object v1, v0, LM0/m;->h:Landroid/widget/AutoCompleteTextView;

    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    invoke-virtual {v0, v1}, LM0/m;->t(Z)V

    .line 299
    .line 300
    .line 301
    iput-boolean v1, v0, LM0/m;->m:Z

    .line 302
    .line 303
    return-void

    .line 304
    :pswitch_8
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, LM0/e;

    .line 307
    .line 308
    invoke-virtual {v0, v3}, LM0/e;->t(Z)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_9
    iget-object v1, p0, LC/a;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v1, LJ0/e;

    .line 315
    .line 316
    iput-boolean v2, v1, LJ0/e;->c:Z

    .line 317
    .line 318
    iget-object v2, v1, LJ0/e;->e:LA/c;

    .line 319
    .line 320
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 321
    .line 322
    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LW/e;

    .line 323
    .line 324
    if-eqz v3, :cond_9

    .line 325
    .line 326
    invoke-virtual {v3}, LW/e;->f()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_9

    .line 331
    .line 332
    iget v0, v1, LJ0/e;->b:I

    .line 333
    .line 334
    invoke-virtual {v1, v0}, LJ0/e;->a(I)V

    .line 335
    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_9
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 339
    .line 340
    if-ne v3, v0, :cond_a

    .line 341
    .line 342
    iget v0, v1, LJ0/e;->b:I

    .line 343
    .line 344
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 345
    .line 346
    .line 347
    :cond_a
    :goto_8
    return-void

    .line 348
    :pswitch_a
    iget-object v0, p0, LC/a;->b:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, Landroid/view/View;

    .line 351
    .line 352
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 357
    .line 358
    const-class v5, Landroid/view/inputmethod/InputMethodManager;

    .line 359
    .line 360
    const/16 v6, 0x17

    .line 361
    .line 362
    if-lt v4, v6, :cond_b

    .line 363
    .line 364
    invoke-static {v2, v5}, LD/b;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    goto :goto_a

    .line 369
    :cond_b
    if-lt v4, v6, :cond_c

    .line 370
    .line 371
    invoke-static {v2, v5}, LD/b;->c(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    goto :goto_9

    .line 376
    :cond_c
    sget-object v4, LD/d;->a:Ljava/util/HashMap;

    .line 377
    .line 378
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    check-cast v4, Ljava/lang/String;

    .line 383
    .line 384
    :goto_9
    if-eqz v4, :cond_d

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    :cond_d
    :goto_a
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 391
    .line 392
    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :pswitch_b
    iget-object v4, p0, LC/a;->b:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v4, Landroid/app/Activity;

    .line 399
    .line 400
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    if-nez v5, :cond_18

    .line 405
    .line 406
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 407
    .line 408
    const/16 v6, 0x1c

    .line 409
    .line 410
    if-lt v5, v6, :cond_e

    .line 411
    .line 412
    sget-object v0, LC/g;->a:Ljava/lang/Class;

    .line 413
    .line 414
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_12

    .line 418
    .line 419
    :cond_e
    sget-object v6, LC/g;->a:Ljava/lang/Class;

    .line 420
    .line 421
    const/16 v6, 0x1b

    .line 422
    .line 423
    const/16 v7, 0x1a

    .line 424
    .line 425
    if-eq v5, v7, :cond_10

    .line 426
    .line 427
    if-ne v5, v6, :cond_f

    .line 428
    .line 429
    goto :goto_b

    .line 430
    :cond_f
    const/4 v8, 0x0

    .line 431
    goto :goto_c

    .line 432
    :cond_10
    :goto_b
    const/4 v8, 0x1

    .line 433
    :goto_c
    sget-object v9, LC/g;->f:Ljava/lang/reflect/Method;

    .line 434
    .line 435
    if-eqz v8, :cond_11

    .line 436
    .line 437
    if-nez v9, :cond_11

    .line 438
    .line 439
    goto/16 :goto_11

    .line 440
    .line 441
    :cond_11
    sget-object v8, LC/g;->e:Ljava/lang/reflect/Method;

    .line 442
    .line 443
    if-nez v8, :cond_12

    .line 444
    .line 445
    sget-object v8, LC/g;->d:Ljava/lang/reflect/Method;

    .line 446
    .line 447
    if-nez v8, :cond_12

    .line 448
    .line 449
    goto/16 :goto_11

    .line 450
    .line 451
    :cond_12
    :try_start_11
    sget-object v8, LC/g;->c:Ljava/lang/reflect/Field;

    .line 452
    .line 453
    invoke-virtual {v8, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v8

    .line 457
    if-nez v8, :cond_13

    .line 458
    .line 459
    goto :goto_11

    .line 460
    :cond_13
    sget-object v10, LC/g;->b:Ljava/lang/reflect/Field;

    .line 461
    .line 462
    invoke-virtual {v10, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    if-nez v10, :cond_14

    .line 467
    .line 468
    goto :goto_11

    .line 469
    :cond_14
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 470
    .line 471
    .line 472
    move-result-object v11

    .line 473
    new-instance v12, LC/f;

    .line 474
    .line 475
    invoke-direct {v12, v4}, LC/f;-><init>(Landroid/app/Activity;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 479
    .line 480
    .line 481
    sget-object v13, LC/g;->g:Landroid/os/Handler;

    .line 482
    .line 483
    :try_start_12
    new-instance v14, LC/e;

    .line 484
    .line 485
    invoke-direct {v14, v12, v2, v8}, LC/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 489
    .line 490
    .line 491
    if-eq v5, v7, :cond_16

    .line 492
    .line 493
    if-ne v5, v6, :cond_15

    .line 494
    .line 495
    goto :goto_d

    .line 496
    :cond_15
    const/4 v5, 0x0

    .line 497
    goto :goto_e

    .line 498
    :cond_16
    :goto_d
    const/4 v5, 0x1

    .line 499
    :goto_e
    if-eqz v5, :cond_17

    .line 500
    .line 501
    :try_start_13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    const/16 v6, 0x9

    .line 506
    .line 507
    new-array v6, v6, [Ljava/lang/Object;

    .line 508
    .line 509
    aput-object v8, v6, v2

    .line 510
    .line 511
    aput-object v1, v6, v3

    .line 512
    .line 513
    aput-object v1, v6, v0

    .line 514
    .line 515
    const/4 v0, 0x3

    .line 516
    aput-object v5, v6, v0

    .line 517
    .line 518
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 519
    .line 520
    const/4 v5, 0x4

    .line 521
    aput-object v0, v6, v5

    .line 522
    .line 523
    const/4 v5, 0x5

    .line 524
    aput-object v1, v6, v5

    .line 525
    .line 526
    const/4 v5, 0x6

    .line 527
    aput-object v1, v6, v5

    .line 528
    .line 529
    const/4 v1, 0x7

    .line 530
    aput-object v0, v6, v1

    .line 531
    .line 532
    const/16 v1, 0x8

    .line 533
    .line 534
    aput-object v0, v6, v1

    .line 535
    .line 536
    invoke-virtual {v9, v10, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    goto :goto_f

    .line 540
    :catchall_7
    move-exception v0

    .line 541
    goto :goto_10

    .line 542
    :cond_17
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 543
    .line 544
    .line 545
    :goto_f
    :try_start_14
    new-instance v0, LC/e;

    .line 546
    .line 547
    invoke-direct {v0, v11, v12, v3, v2}, LC/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v13, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 551
    .line 552
    .line 553
    goto :goto_12

    .line 554
    :goto_10
    new-instance v1, LC/e;

    .line 555
    .line 556
    invoke-direct {v1, v11, v12, v3, v2}, LC/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v13, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 560
    .line 561
    .line 562
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 563
    :catchall_8
    :goto_11
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 564
    .line 565
    .line 566
    :cond_18
    :goto_12
    return-void

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final a:Lh0/e;


# direct methods
.method public constructor <init>(Lh0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/savedstate/Recreator;->a:Lh0/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 10

    .line 1
    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 2
    .line 3
    if-ne p2, v0, :cond_b

    .line 4
    .line 5
    invoke-interface {p1}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/savedstate/Recreator;->a:Lh0/e;

    .line 13
    .line 14
    invoke-interface {p1}, Lh0/e;->b()Lh0/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "androidx.savedstate.Restarter"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lh0/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    const-string p2, "classes_to_restore"

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_a

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_9

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/lang/String;

    .line 51
    .line 52
    :try_start_0
    const-class v0, Landroidx/savedstate/Recreator;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-class v2, Lh0/b;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v2, "{\n                Class.\u2026class.java)\n            }"

    .line 70
    .line 71
    invoke-static {v0, v2}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 72
    .line 73
    .line 74
    :try_start_1
    new-array v2, v1, [Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2

    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    :try_start_2
    new-array v3, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v3, "{\n                constr\u2026wInstance()\n            }"

    .line 91
    .line 92
    invoke-static {v0, v3}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    check-cast v0, Lh0/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 96
    .line 97
    iget-object p2, p0, Landroidx/savedstate/Recreator;->a:Lh0/e;

    .line 98
    .line 99
    instance-of v0, p2, Landroidx/lifecycle/L;

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    move-object v0, p2

    .line 104
    check-cast v0, Landroidx/lifecycle/L;

    .line 105
    .line 106
    invoke-interface {v0}, Landroidx/lifecycle/L;->c()Landroidx/lifecycle/K;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {p2}, Lh0/e;->b()Lh0/d;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v4, Ljava/util/HashSet;

    .line 118
    .line 119
    iget-object v5, v0, Landroidx/lifecycle/K;->a:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_5

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    check-cast v5, Ljava/lang/String;

    .line 143
    .line 144
    const-string v6, "key"

    .line 145
    .line 146
    invoke-static {v5, v6}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v6, v0, Landroidx/lifecycle/K;->a:Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Landroidx/lifecycle/I;

    .line 156
    .line 157
    invoke-static {v5}, La1/c;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p2}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    const-string v7, "registry"

    .line 165
    .line 166
    invoke-static {v3, v7}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v7, "lifecycle"

    .line 170
    .line 171
    invoke-static {v6, v7}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v7, "androidx.lifecycle.savedstate.vm.tag"

    .line 175
    .line 176
    iget-object v8, v5, Landroidx/lifecycle/I;->a:Ljava/util/HashMap;

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    if-nez v8, :cond_3

    .line 180
    .line 181
    move-object v5, v9

    .line 182
    goto :goto_1

    .line 183
    :cond_3
    monitor-enter v8

    .line 184
    :try_start_3
    iget-object v5, v5, Landroidx/lifecycle/I;->a:Ljava/util/HashMap;

    .line 185
    .line 186
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    :goto_1
    check-cast v5, Landroidx/lifecycle/SavedStateHandleController;

    .line 192
    .line 193
    if-eqz v5, :cond_2

    .line 194
    .line 195
    iget-boolean v7, v5, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 196
    .line 197
    if-nez v7, :cond_2

    .line 198
    .line 199
    if-eqz v7, :cond_4

    .line 200
    .line 201
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string p2, "Already attached to lifecycleOwner"

    .line 204
    .line 205
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1

    .line 209
    :cond_4
    iput-boolean v2, v5, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 210
    .line 211
    invoke-virtual {v6, v5}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    .line 212
    .line 213
    .line 214
    throw v9

    .line 215
    :catchall_0
    move-exception p1

    .line 216
    :try_start_4
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 217
    throw p1

    .line 218
    :cond_5
    new-instance p2, Ljava/util/HashSet;

    .line 219
    .line 220
    iget-object v0, v0, Landroidx/lifecycle/K;->a:Ljava/util/LinkedHashMap;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result p2

    .line 233
    if-nez p2, :cond_1

    .line 234
    .line 235
    const-class p2, Landroidx/lifecycle/i;

    .line 236
    .line 237
    iget-boolean v0, v3, Lh0/d;->c:Z

    .line 238
    .line 239
    if-eqz v0, :cond_7

    .line 240
    .line 241
    iget-object v0, v3, Lh0/d;->f:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Le/i;

    .line 244
    .line 245
    if-nez v0, :cond_6

    .line 246
    .line 247
    new-instance v0, Le/i;

    .line 248
    .line 249
    invoke-direct {v0, v3}, Le/i;-><init>(Lh0/d;)V

    .line 250
    .line 251
    .line 252
    :cond_6
    iput-object v0, v3, Lh0/d;->f:Ljava/lang/Object;

    .line 253
    .line 254
    :try_start_5
    new-array v0, v1, [Ljava/lang/Class;

    .line 255
    .line 256
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_0

    .line 257
    .line 258
    .line 259
    iget-object v0, v3, Lh0/d;->f:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Le/i;

    .line 262
    .line 263
    if-eqz v0, :cond_1

    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    iget-object v0, v0, Le/i;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 272
    .line 273
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :catch_0
    move-exception p1

    .line 279
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 280
    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v2, "Class "

    .line 284
    .line 285
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 296
    .line 297
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    throw v0

    .line 308
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 311
    .line 312
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw p1

    .line 316
    :cond_8
    const-string p1, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 317
    .line 318
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 319
    .line 320
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw p2

    .line 324
    :catch_1
    move-exception p1

    .line 325
    new-instance v0, Ljava/lang/RuntimeException;

    .line 326
    .line 327
    new-instance v1, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v2, "Failed to instantiate "

    .line 330
    .line 331
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :catch_2
    move-exception p1

    .line 346
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    new-instance v1, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    const-string v2, "Class "

    .line 351
    .line 352
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v0, " must have default constructor in order to be automatically recreated"

    .line 363
    .line 364
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    throw p2

    .line 375
    :catch_3
    move-exception p1

    .line 376
    new-instance v0, Ljava/lang/RuntimeException;

    .line 377
    .line 378
    new-instance v1, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v2, "Class "

    .line 381
    .line 382
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string p2, " wasn\'t found"

    .line 389
    .line 390
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :cond_9
    :goto_2
    return-void

    .line 402
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 405
    .line 406
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw p1

    .line 410
    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    .line 411
    .line 412
    const-string p2, "Next event must be ON_CREATE"

    .line 413
    .line 414
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    throw p1
.end method

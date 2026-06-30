.class public final LN/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:Le1/a;

.field public b:I

.field public synthetic c:Le1/a;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Le1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/Y;->d:Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LN/Y;->a:Le1/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, LT0/a;->a:LT0/a;

    .line 2
    .line 3
    iget v1, p0, LN/Y;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LN/Y;->d:Landroid/view/View;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    sget-object v4, LR0/d;->c:LR0/d;

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    if-eq v1, v3, :cond_2

    .line 14
    .line 15
    if-ne v1, v5, :cond_1

    .line 16
    .line 17
    instance-of v0, p1, LR0/b;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    check-cast p1, LR0/b;

    .line 23
    .line 24
    iget-object p1, p1, LR0/b;->a:Ljava/lang/Throwable;

    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    iget-object v1, p0, LN/Y;->c:Le1/a;

    .line 36
    .line 37
    instance-of v3, p1, LR0/b;

    .line 38
    .line 39
    if-nez v3, :cond_6

    .line 40
    .line 41
    instance-of p1, v2, Landroid/view/ViewGroup;

    .line 42
    .line 43
    if-eqz p1, :cond_5

    .line 44
    .line 45
    check-cast v2, Landroid/view/ViewGroup;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, LN/Y;->c:Le1/a;

    .line 49
    .line 50
    iput v5, p0, LN/Y;->b:I

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance p1, LN/w;

    .line 56
    .line 57
    new-instance v3, LN/X;

    .line 58
    .line 59
    invoke-direct {v3, v2}, LN/X;-><init>(Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v3}, LN/w;-><init>(LN/X;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p1, LN/w;->b:Ljava/util/Iterator;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    move-object p1, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iput-object p1, v1, Le1/a;->c:Ljava/util/Iterator;

    .line 76
    .line 77
    iput v5, v1, Le1/a;->a:I

    .line 78
    .line 79
    iput-object p0, v1, Le1/a;->d:LN/Y;

    .line 80
    .line 81
    move-object p1, v0

    .line 82
    :goto_0
    if-ne p1, v0, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move-object p1, v4

    .line 86
    :goto_1
    if-ne p1, v0, :cond_5

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_5
    :goto_2
    return-object v4

    .line 90
    :cond_6
    check-cast p1, LR0/b;

    .line 91
    .line 92
    iget-object p1, p1, LR0/b;->a:Ljava/lang/Throwable;

    .line 93
    .line 94
    throw p1

    .line 95
    :cond_7
    instance-of v1, p1, LR0/b;

    .line 96
    .line 97
    if-nez v1, :cond_8

    .line 98
    .line 99
    iget-object p1, p0, LN/Y;->c:Le1/a;

    .line 100
    .line 101
    iput-object p1, p0, LN/Y;->c:Le1/a;

    .line 102
    .line 103
    iput v3, p0, LN/Y;->b:I

    .line 104
    .line 105
    iput-object v2, p1, Le1/a;->b:Ljava/lang/Object;

    .line 106
    .line 107
    const/4 v1, 0x3

    .line 108
    iput v1, p1, Le1/a;->a:I

    .line 109
    .line 110
    iput-object p0, p1, Le1/a;->d:LN/Y;

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_8
    check-cast p1, LR0/b;

    .line 114
    .line 115
    iget-object p1, p1, LR0/b;->a:Ljava/lang/Throwable;

    .line 116
    .line 117
    throw p1
.end method

.method public final b()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Continuation at "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, LU0/a;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LU0/a;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_b

    .line 24
    .line 25
    :cond_0
    invoke-interface {v1}, LU0/a;->v()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-gt v3, v4, :cond_e

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const-string v7, "label"

    .line 39
    .line 40
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    instance-of v7, v6, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    check-cast v6, Ljava/lang/Integer;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    nop

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move-object v6, v2

    .line 61
    :goto_0
    if-eqz v6, :cond_2

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v6, 0x0

    .line 69
    :goto_1
    sub-int/2addr v6, v4

    .line 70
    goto :goto_3

    .line 71
    :goto_2
    const/4 v6, -0x1

    .line 72
    :goto_3
    if-gez v6, :cond_3

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_3
    invoke-interface {v1}, LU0/a;->l()[I

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    aget v3, v3, v6

    .line 80
    .line 81
    :goto_4
    sget-object v4, LU0/b;->b:LN/l;

    .line 82
    .line 83
    sget-object v6, LU0/b;->a:LN/l;

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    :try_start_1
    const-class v4, Ljava/lang/Class;

    .line 88
    .line 89
    const-string v7, "getModule"

    .line 90
    .line 91
    new-array v8, v5, [Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    const-string v8, "java.lang.Module"

    .line 106
    .line 107
    invoke-virtual {v7, v8}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const-string v8, "getDescriptor"

    .line 112
    .line 113
    new-array v9, v5, [Ljava/lang/Class;

    .line 114
    .line 115
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    const-string v9, "java.lang.module.ModuleDescriptor"

    .line 128
    .line 129
    invoke-virtual {v8, v9}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    const-string v9, "name"

    .line 134
    .line 135
    new-array v10, v5, [Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    new-instance v9, LN/l;

    .line 142
    .line 143
    invoke-direct {v9, v4, v7, v8}, LN/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sput-object v9, LU0/b;->b:LN/l;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    .line 148
    move-object v4, v9

    .line 149
    goto :goto_5

    .line 150
    :catch_1
    sput-object v6, LU0/b;->b:LN/l;

    .line 151
    .line 152
    move-object v4, v6

    .line 153
    :cond_4
    :goto_5
    if-ne v4, v6, :cond_5

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_5
    iget-object v6, v4, LN/l;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v6, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    new-array v8, v5, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    goto :goto_6

    .line 173
    :cond_6
    move-object v6, v2

    .line 174
    :goto_6
    if-nez v6, :cond_7

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_7
    iget-object v7, v4, LN/l;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v7, Ljava/lang/reflect/Method;

    .line 180
    .line 181
    if-eqz v7, :cond_8

    .line 182
    .line 183
    new-array v8, v5, [Ljava/lang/Object;

    .line 184
    .line 185
    invoke-virtual {v7, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    goto :goto_7

    .line 190
    :cond_8
    move-object v6, v2

    .line 191
    :goto_7
    if-nez v6, :cond_9

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_9
    iget-object v4, v4, LN/l;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, Ljava/lang/reflect/Method;

    .line 197
    .line 198
    if-eqz v4, :cond_a

    .line 199
    .line 200
    new-array v5, v5, [Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v4, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    goto :goto_8

    .line 207
    :cond_a
    move-object v4, v2

    .line 208
    :goto_8
    instance-of v5, v4, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v5, :cond_b

    .line 211
    .line 212
    move-object v2, v4

    .line 213
    check-cast v2, Ljava/lang/String;

    .line 214
    .line 215
    :cond_b
    :goto_9
    if-nez v2, :cond_c

    .line 216
    .line 217
    invoke-interface {v1}, LU0/a;->c()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_a

    .line 222
    :cond_c
    new-instance v4, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const/16 v2, 0x2f

    .line 231
    .line 232
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-interface {v1}, LU0/a;->c()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    :goto_a
    new-instance v4, Ljava/lang/StackTraceElement;

    .line 247
    .line 248
    invoke-interface {v1}, LU0/a;->m()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-interface {v1}, LU0/a;->f()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v4, v2, v5, v1, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    move-object v2, v4

    .line 260
    :goto_b
    if-eqz v2, :cond_d

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    :goto_c
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v2, "Debug metadata version mismatch. Expected: 1, got "

    .line 284
    .line 285
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v2, ". Please update the Kotlin standard library."

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LN/Y;->a:Le1/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, La1/f;->a:La1/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-class v0, LN/Y;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "kotlin.jvm.functions."

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/16 v1, 0x15

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    const-string v1, "renderLambdaToString(this)"

    .line 38
    .line 39
    invoke-static {v0, v1}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    invoke-virtual {p0}, LN/Y;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

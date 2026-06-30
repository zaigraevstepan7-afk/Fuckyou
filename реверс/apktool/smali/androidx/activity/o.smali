.class public final Landroidx/activity/o;
.super La1/d;
.source "SourceFile"

# interfaces
.implements LZ0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/o;->a:I

    iput-object p2, p0, Landroidx/activity/o;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La1/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Landroidx/activity/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/o;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/lifecycle/L;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v2, La1/f;->a:La1/g;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, La1/b;

    .line 21
    .line 22
    const-class v3, Landroidx/lifecycle/H;

    .line 23
    .line 24
    invoke-direct {v2, v3}, La1/b;-><init>(Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lc0/d;

    .line 28
    .line 29
    invoke-interface {v2}, La1/a;->a()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v5, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 34
    .line 35
    invoke-static {v2, v5}, La1/c;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v2}, Lc0/d;-><init>(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    new-array v4, v2, [Lc0/d;

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, [Lc0/d;

    .line 52
    .line 53
    array-length v4, v1

    .line 54
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, [Lc0/d;

    .line 59
    .line 60
    const-string v4, "initializers"

    .line 61
    .line 62
    invoke-static {v1, v4}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Landroidx/lifecycle/L;->c()Landroidx/lifecycle/K;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    instance-of v5, v0, Landroidx/lifecycle/h;

    .line 70
    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    check-cast v0, Landroidx/lifecycle/h;

    .line 74
    .line 75
    invoke-interface {v0}, Landroidx/lifecycle/h;->a()Lc0/c;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    sget-object v0, Lc0/a;->b:Lc0/a;

    .line 81
    .line 82
    :goto_0
    const-string v5, "store"

    .line 83
    .line 84
    invoke-static {v4, v5}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v5, "defaultCreationExtras"

    .line 88
    .line 89
    invoke-static {v0, v5}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v4, v4, Landroidx/lifecycle/K;->a:Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    const-string v5, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Landroidx/lifecycle/I;

    .line 101
    .line 102
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_1

    .line 107
    .line 108
    const-string v0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 109
    .line 110
    invoke-static {v6, v0}, La1/c;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, Lc0/b;->a:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-interface {v6, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Landroidx/lifecycle/J;->b:Landroidx/lifecycle/J;

    .line 125
    .line 126
    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :try_start_0
    array-length v0, v1

    .line 130
    const/4 v6, 0x0

    .line 131
    :goto_1
    if-ge v2, v0, :cond_3

    .line 132
    .line 133
    aget-object v7, v1, v2

    .line 134
    .line 135
    iget-object v7, v7, Lc0/d;->a:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_2

    .line 142
    .line 143
    new-instance v6, Landroidx/lifecycle/H;

    .line 144
    .line 145
    invoke-direct {v6}, Landroidx/lifecycle/H;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    if-eqz v6, :cond_5

    .line 152
    .line 153
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroidx/lifecycle/I;

    .line 158
    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0}, Landroidx/lifecycle/I;->a()V

    .line 162
    .line 163
    .line 164
    :cond_4
    :goto_2
    check-cast v6, Landroidx/lifecycle/H;

    .line 165
    .line 166
    return-object v6

    .line 167
    :cond_5
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "No initializer set for given class "

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    .line 183
    :catch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 184
    .line 185
    const-string v1, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    .line 186
    .line 187
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/o;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Landroidx/activity/v;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroidx/activity/v;->b()V

    .line 196
    .line 197
    .line 198
    sget-object v0, LR0/d;->c:LR0/d;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/o;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Landroidx/activity/v;

    .line 204
    .line 205
    iget-object v1, v0, Landroidx/activity/v;->b:LS0/a;

    .line 206
    .line 207
    invoke-virtual {v1}, LS0/a;->size()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :cond_6
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    const/4 v3, 0x0

    .line 220
    if-eqz v2, :cond_7

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    move-object v4, v2

    .line 227
    check-cast v4, Landroidx/fragment/app/z;

    .line 228
    .line 229
    iget-boolean v4, v4, Landroidx/fragment/app/z;->a:Z

    .line 230
    .line 231
    if-eqz v4, :cond_6

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_7
    move-object v2, v3

    .line 235
    :goto_3
    check-cast v2, Landroidx/fragment/app/z;

    .line 236
    .line 237
    iput-object v3, v0, Landroidx/activity/v;->c:Landroidx/fragment/app/z;

    .line 238
    .line 239
    sget-object v0, LR0/d;->c:LR0/d;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/o;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Landroidx/activity/v;

    .line 245
    .line 246
    invoke-virtual {v0}, Landroidx/activity/v;->b()V

    .line 247
    .line 248
    .line 249
    sget-object v0, LR0/d;->c:LR0/d;

    .line 250
    .line 251
    return-object v0

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

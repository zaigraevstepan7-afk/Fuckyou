.class public final Landroidx/fragment/app/D;
.super LT/m;
.source "SourceFile"


# instance fields
.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/fragment/app/D;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Le/k;Ljava/lang/Object;)LL0/f;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    move-object/from16 v6, p0

    .line 9
    .line 10
    iget v7, v6, Landroidx/fragment/app/D;->p:I

    .line 11
    .line 12
    packed-switch v7, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super/range {p0 .. p2}, LT/m;->A(Le/k;Ljava/lang/Object;)LL0/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object/from16 v7, p2

    .line 21
    .line 22
    check-cast v7, [Ljava/lang/String;

    .line 23
    .line 24
    array-length v8, v7

    .line 25
    if-nez v8, :cond_0

    .line 26
    .line 27
    new-instance v1, LL0/f;

    .line 28
    .line 29
    sget-object v0, LS0/e;->a:LS0/e;

    .line 30
    .line 31
    invoke-direct {v1, v0}, LL0/f;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_0
    array-length v8, v7

    .line 37
    const/4 v9, 0x0

    .line 38
    :goto_0
    if-ge v9, v8, :cond_6

    .line 39
    .line 40
    aget-object v10, v7, v9

    .line 41
    .line 42
    if-eqz v10, :cond_5

    .line 43
    .line 44
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v12, 0x21

    .line 47
    .line 48
    if-ge v11, v12, :cond_4

    .line 49
    .line 50
    const-string v12, "android.permission.POST_NOTIFICATIONS"

    .line 51
    .line 52
    invoke-static {v12, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    if-eqz v12, :cond_4

    .line 57
    .line 58
    new-instance v10, LC/n;

    .line 59
    .line 60
    invoke-direct {v10, v0}, LC/n;-><init>(Le/k;)V

    .line 61
    .line 62
    .line 63
    const/16 v12, 0x18

    .line 64
    .line 65
    if-lt v11, v12, :cond_1

    .line 66
    .line 67
    iget-object v10, v10, LC/n;->a:Landroid/app/NotificationManager;

    .line 68
    .line 69
    invoke-static {v10}, LC/m;->a(Landroid/app/NotificationManager;)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    const-string v10, "appops"

    .line 75
    .line 76
    invoke-virtual {v0, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    check-cast v10, Landroid/app/AppOpsManager;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    iget v11, v11, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 95
    .line 96
    :try_start_0
    const-class v13, Landroid/app/AppOpsManager;

    .line 97
    .line 98
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    const-string v14, "checkOpNoThrow"

    .line 107
    .line 108
    new-array v15, v3, [Ljava/lang/Class;

    .line 109
    .line 110
    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 111
    .line 112
    aput-object v16, v15, v4

    .line 113
    .line 114
    aput-object v16, v15, v5

    .line 115
    .line 116
    const-class v16, Ljava/lang/String;

    .line 117
    .line 118
    aput-object v16, v15, v2

    .line 119
    .line 120
    invoke-virtual {v13, v14, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    const-string v15, "OP_POST_NOTIFICATION"

    .line 125
    .line 126
    invoke-virtual {v13, v15}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    const-class v15, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v13, v15}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    check-cast v13, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    new-array v15, v3, [Ljava/lang/Object;

    .line 146
    .line 147
    aput-object v13, v15, v4

    .line 148
    .line 149
    aput-object v11, v15, v5

    .line 150
    .line 151
    aput-object v12, v15, v2

    .line 152
    .line 153
    invoke-virtual {v14, v10, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    check-cast v10, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v10
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    if-nez v10, :cond_2

    .line 164
    .line 165
    :goto_1
    const/4 v10, 0x1

    .line 166
    goto :goto_2

    .line 167
    :cond_2
    const/4 v10, 0x0

    .line 168
    goto :goto_2

    .line 169
    :catch_0
    nop

    .line 170
    goto :goto_1

    .line 171
    :goto_2
    if-eqz v10, :cond_3

    .line 172
    .line 173
    const/4 v10, 0x0

    .line 174
    goto :goto_3

    .line 175
    :cond_3
    const/4 v10, -0x1

    .line 176
    goto :goto_3

    .line 177
    :cond_4
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    invoke-virtual {v0, v10, v11, v12}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    :goto_3
    if-nez v10, :cond_9

    .line 190
    .line 191
    add-int/2addr v9, v5

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    .line 195
    .line 196
    const-string v1, "permission must be non-null"

    .line 197
    .line 198
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_6
    array-length v0, v7

    .line 203
    invoke-static {v0}, LS0/g;->C0(I)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    const/16 v1, 0x10

    .line 208
    .line 209
    if-ge v0, v1, :cond_7

    .line 210
    .line 211
    const/16 v0, 0x10

    .line 212
    .line 213
    :cond_7
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 216
    .line 217
    .line 218
    array-length v0, v7

    .line 219
    :goto_4
    if-ge v4, v0, :cond_8

    .line 220
    .line 221
    aget-object v2, v7, v4

    .line 222
    .line 223
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    add-int/2addr v4, v5

    .line 229
    goto :goto_4

    .line 230
    :cond_8
    new-instance v0, LL0/f;

    .line 231
    .line 232
    invoke-direct {v0, v1}, LL0/f;-><init>(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move-object v1, v0

    .line 236
    :cond_9
    :goto_5
    :pswitch_1
    return-object v1

    .line 237
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final U(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/D;->p:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/activity/result/a;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Landroidx/activity/result/a;-><init>(ILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    sget-object v0, LS0/e;->a:LS0/e;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    if-eq p1, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_1
    const-string p1, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_8

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    array-length v1, p2

    .line 43
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    array-length v1, p2

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_0
    if-ge v3, v1, :cond_4

    .line 50
    .line 51
    aget v4, p2, v3

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 v4, 0x0

    .line 58
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    array-length v1, p1

    .line 74
    :goto_2
    if-ge v2, v1, :cond_6

    .line 75
    .line 76
    aget-object v3, p1, v2

    .line 77
    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_7

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v3, LR0/a;

    .line 132
    .line 133
    invoke-direct {v3, p2, v0}, LR0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    invoke-static {v2}, LS0/g;->D0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :cond_8
    :goto_4
    return-object v0

    .line 145
    :pswitch_1
    const/4 v0, -0x1

    .line 146
    const/4 v1, 0x0

    .line 147
    if-ne p1, v0, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_9
    move-object p2, v1

    .line 151
    :goto_5
    if-eqz p2, :cond_a

    .line 152
    .line 153
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_a
    return-object v1

    .line 158
    :pswitch_2
    new-instance v0, Landroidx/activity/result/a;

    .line 159
    .line 160
    invoke-direct {v0, p1, p2}, Landroidx/activity/result/a;-><init>(ILandroid/content/Intent;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Le/k;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 4

    .line 1
    iget p1, p0, Landroidx/fragment/app/D;->p:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Landroid/content/Intent;

    .line 7
    .line 8
    return-object p2

    .line 9
    :pswitch_0
    check-cast p2, [Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v0, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)"

    .line 25
    .line 26
    invoke-static {p1, p2}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    check-cast p2, [Ljava/lang/String;

    .line 31
    .line 32
    new-instance p1, Landroid/content/Intent;

    .line 33
    .line 34
    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "android.intent.extra.MIME_TYPES"

    .line 40
    .line 41
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "*/*"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "Intent(Intent.ACTION_OPE\u2026          .setType(\"*/*\")"

    .line 52
    .line 53
    invoke-static {p1, p2}, La1/c;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p2, Landroidx/activity/result/h;

    .line 58
    .line 59
    new-instance p1, Landroid/content/Intent;

    .line 60
    .line 61
    const-string v0, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 62
    .line 63
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p2, Landroidx/activity/result/h;->b:Landroid/content/Intent;

    .line 67
    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    const-string v1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    iget-object v0, p2, Landroidx/activity/result/h;->a:Landroid/content/IntentSender;

    .line 94
    .line 95
    new-instance v1, Landroidx/activity/result/h;

    .line 96
    .line 97
    iget v2, p2, Landroidx/activity/result/h;->d:I

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    iget p2, p2, Landroidx/activity/result/h;->c:I

    .line 101
    .line 102
    invoke-direct {v1, v0, v3, p2, v2}, Landroidx/activity/result/h;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 103
    .line 104
    .line 105
    move-object p2, v1

    .line 106
    :cond_0
    const-string v0, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 107
    .line 108
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    const/4 p2, 0x2

    .line 112
    invoke-static {p2}, Landroidx/fragment/app/H;->F(I)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_1

    .line 117
    .line 118
    new-instance p2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v0, "CreateIntent created the following intent: "

    .line 121
    .line 122
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    const-string v0, "FragmentManager"

    .line 133
    .line 134
    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    :cond_1
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

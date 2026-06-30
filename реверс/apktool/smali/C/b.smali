.class public final LC/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/g;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LC/b;->a:I

    iput-object p1, p0, LC/b;->d:Ljava/lang/Object;

    iput p2, p0, LC/b;->b:I

    iput-object p3, p0, LC/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LC/b;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LC/b;->c:Ljava/lang/Object;

    iput p3, p0, LC/b;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LC/b;->a:I

    iput-object p1, p0, LC/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LC/b;->d:Ljava/lang/Object;

    iput p3, p0, LC/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LC/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    iget-object v1, p0, LC/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    iget v2, p0, LC/b;->b:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, LC/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/graphics/Typeface;

    .line 24
    .line 25
    iget v1, p0, LC/b;->b:I

    .line 26
    .line 27
    iget-object v2, p0, LC/b;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 47
    .line 48
    iget-object v2, p0, LC/b;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, LC/b;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroidx/activity/g;

    .line 59
    .line 60
    iget v2, p0, LC/b;->b:I

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-virtual {v1, v2, v3, v0}, Landroidx/activity/result/g;->a(IILandroid/content/Intent;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    iget-object v0, p0, LC/b;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LL0/f;

    .line 70
    .line 71
    iget-object v0, v0, LL0/f;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v1, p0, LC/b;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Landroidx/activity/g;

    .line 76
    .line 77
    iget-object v2, v1, Landroidx/activity/result/g;->a:Ljava/util/HashMap;

    .line 78
    .line 79
    iget v3, p0, LC/b;->b:I

    .line 80
    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    if-nez v2, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    iget-object v3, v1, Landroidx/activity/result/g;->e:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroidx/activity/result/e;

    .line 101
    .line 102
    if-eqz v3, :cond_1

    .line 103
    .line 104
    iget-object v3, v3, Landroidx/activity/result/e;->a:Landroidx/activity/result/b;

    .line 105
    .line 106
    iget-object v1, v1, Landroidx/activity/result/g;->d:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    invoke-interface {v3, v0}, Landroidx/activity/result/b;->a(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    iget-object v3, v1, Landroidx/activity/result/g;->g:Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, v1, Landroidx/activity/result/g;->f:Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    :cond_2
    :goto_0
    return-void

    .line 129
    :pswitch_3
    iget-object v0, p0, LC/b;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, [Ljava/lang/String;

    .line 132
    .line 133
    array-length v1, v0

    .line 134
    new-array v1, v1, [I

    .line 135
    .line 136
    iget-object v2, p0, LC/b;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Le/k;

    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    array-length v5, v0

    .line 149
    const/4 v6, 0x0

    .line 150
    :goto_1
    if-ge v6, v5, :cond_3

    .line 151
    .line 152
    aget-object v7, v0, v6

    .line 153
    .line 154
    invoke-virtual {v3, v7, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    aput v7, v1, v6

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    iget v3, p0, LC/b;->b:I

    .line 164
    .line 165
    invoke-interface {v2, v3, v0, v1}, LC/d;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

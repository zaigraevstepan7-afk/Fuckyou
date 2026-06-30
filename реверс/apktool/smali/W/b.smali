.class public abstract LW/b;
.super LN/b;
.source "SourceFile"


# static fields
.field public static final n:Landroid/graphics/Rect;

.field public static final o:LI0/e;

.field public static final p:LI0/e;


# instance fields
.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Rect;

.field public final g:[I

.field public final h:Landroid/view/accessibility/AccessibilityManager;

.field public final i:Landroid/view/View;

.field public j:LW/a;

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/high16 v2, -0x80000000

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LW/b;->n:Landroid/graphics/Rect;

    .line 12
    .line 13
    new-instance v0, LI0/e;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LW/b;->o:LI0/e;

    .line 20
    .line 21
    new-instance v0, LI0/e;

    .line 22
    .line 23
    const/4 v1, 0x6

    .line 24
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LW/b;->p:LI0/e;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LN/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LW/b;->d:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LW/b;->e:Landroid/graphics/Rect;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LW/b;->f:Landroid/graphics/Rect;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, LW/b;->g:[I

    .line 29
    .line 30
    const/high16 v0, -0x80000000

    .line 31
    .line 32
    iput v0, p0, LW/b;->k:I

    .line 33
    .line 34
    iput v0, p0, LW/b;->l:I

    .line 35
    .line 36
    iput v0, p0, LW/b;->m:I

    .line 37
    .line 38
    iput-object p1, p0, LW/b;->i:Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "accessibility"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 51
    .line 52
    iput-object v0, p0, LW/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 56
    .line 57
    .line 58
    sget-object v1, LN/S;->a:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)LA/b;
    .locals 0

    .line 1
    iget-object p1, p0, LW/b;->j:LW/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, LW/a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, LW/a;-><init>(LW/b;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LW/b;->j:LW/a;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, LW/b;->j:LW/a;

    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Landroid/view/View;LO/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object v1, p2, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, LW/b;->t(LO/k;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j(I)Z
    .locals 2

    .line 1
    iget v0, p0, LW/b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, LW/b;->l:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1}, LW/b;->v(IZ)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, LW/b;->x(II)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public final k(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iget-object v1, p0, LW/b;->i:Landroid/view/View;

    .line 3
    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p1}, LW/b;->r(I)LO/k;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0}, LO/k;->g()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 80
    .line 81
    const-string p2, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v1, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_2
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v1, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 114
    .line 115
    .line 116
    return-object p1
.end method

.method public final l(I)LO/k;
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LO/k;

    .line 6
    .line 7
    invoke-direct {v1, v0}, LO/k;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 15
    .line 16
    .line 17
    const-string v3, "android.view.View"

    .line 18
    .line 19
    invoke-virtual {v1, v3}, LO/k;->i(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, LW/b;->n:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, LW/b;->i:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v1}, LW/b;->u(ILO/k;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, LO/k;->g()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    const-string v0, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    :goto_0
    iget-object v5, p0, LW/b;->e:Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-virtual {v1, v5}, LO/k;->f(Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_e

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    and-int/lit8 v6, v5, 0x40

    .line 75
    .line 76
    if-nez v6, :cond_d

    .line 77
    .line 78
    const/16 v6, 0x80

    .line 79
    .line 80
    and-int/2addr v5, v6

    .line 81
    if-nez v5, :cond_c

    .line 82
    .line 83
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iput p1, v1, LO/k;->b:I

    .line 95
    .line 96
    invoke-virtual {v0, v4, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 97
    .line 98
    .line 99
    iget v5, p0, LW/b;->k:I

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    if-ne v5, p1, :cond_2

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v6}, LO/k;->a(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v0, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 112
    .line 113
    .line 114
    const/16 v5, 0x40

    .line 115
    .line 116
    invoke-virtual {v1, v5}, LO/k;->a(I)V

    .line 117
    .line 118
    .line 119
    :goto_1
    iget v5, p0, LW/b;->l:I

    .line 120
    .line 121
    if-ne v5, p1, :cond_3

    .line 122
    .line 123
    const/4 p1, 0x1

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    const/4 p1, 0x0

    .line 126
    :goto_2
    if-eqz p1, :cond_4

    .line 127
    .line 128
    const/4 v5, 0x2

    .line 129
    invoke-virtual {v1, v5}, LO/k;->a(I)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    invoke-virtual {v1, v2}, LO/k;->a(I)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_3
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, LW/b;->g:[I

    .line 146
    .line 147
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 148
    .line 149
    .line 150
    iget-object v5, p0, LW/b;->d:Landroid/graphics/Rect;

    .line 151
    .line 152
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_6

    .line 160
    .line 161
    invoke-virtual {v1, v5}, LO/k;->f(Landroid/graphics/Rect;)V

    .line 162
    .line 163
    .line 164
    aget v3, p1, v7

    .line 165
    .line 166
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    sub-int/2addr v3, v6

    .line 171
    aget v6, p1, v2

    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    sub-int/2addr v6, v8

    .line 178
    invoke-virtual {v5, v3, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget-object v3, p0, LW/b;->f:Landroid/graphics/Rect;

    .line 182
    .line 183
    invoke-virtual {v4, v3}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_b

    .line 188
    .line 189
    aget v6, p1, v7

    .line 190
    .line 191
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    sub-int/2addr v6, v7

    .line 196
    aget p1, p1, v2

    .line 197
    .line 198
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    sub-int/2addr p1, v7

    .line 203
    invoke-virtual {v3, v6, p1}, Landroid/graphics/Rect;->offset(II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5}, Landroid/graphics/Rect;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_7

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_8

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_8
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    :goto_4
    instance-of v3, p1, Landroid/view/View;

    .line 234
    .line 235
    if-eqz v3, :cond_a

    .line 236
    .line 237
    check-cast p1, Landroid/view/View;

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    const/4 v4, 0x0

    .line 244
    cmpg-float v3, v3, v4

    .line 245
    .line 246
    if-lez v3, :cond_b

    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_9

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    goto :goto_4

    .line 260
    :cond_a
    if-eqz p1, :cond_b

    .line 261
    .line 262
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 263
    .line 264
    .line 265
    :cond_b
    :goto_5
    return-object v1

    .line 266
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    .line 267
    .line 268
    const-string v0, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 269
    .line 270
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw p1

    .line 274
    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    .line 275
    .line 276
    const-string v0, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 277
    .line 278
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :cond_e
    new-instance p1, Ljava/lang/RuntimeException;

    .line 283
    .line 284
    const-string v0, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"

    .line 285
    .line 286
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw p1
.end method

.method public final m(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LW/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x100

    .line 21
    .line 22
    const/4 v2, 0x7

    .line 23
    const/4 v3, 0x1

    .line 24
    const/high16 v4, -0x80000000

    .line 25
    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    const/16 v2, 0x9

    .line 29
    .line 30
    if-eq v0, v2, :cond_3

    .line 31
    .line 32
    const/16 p1, 0xa

    .line 33
    .line 34
    if-eq v0, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget p1, p0, LW/b;->m:I

    .line 38
    .line 39
    if-eq p1, v4, :cond_5

    .line 40
    .line 41
    if-ne p1, v4, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iput v4, p0, LW/b;->m:I

    .line 45
    .line 46
    invoke-virtual {p0, p1, v1}, LW/b;->x(II)V

    .line 47
    .line 48
    .line 49
    return v3

    .line 50
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p0, v0, p1}, LW/b;->n(FF)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget v0, p0, LW/b;->m:I

    .line 63
    .line 64
    if-ne v0, p1, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    iput p1, p0, LW/b;->m:I

    .line 68
    .line 69
    const/16 v2, 0x80

    .line 70
    .line 71
    invoke-virtual {p0, p1, v2}, LW/b;->x(II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0, v1}, LW/b;->x(II)V

    .line 75
    .line 76
    .line 77
    :goto_0
    if-eq p1, v4, :cond_5

    .line 78
    .line 79
    :goto_1
    return v3

    .line 80
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 81
    return p1
.end method

.method public abstract n(FF)I
.end method

.method public abstract o(Ljava/util/ArrayList;)V
.end method

.method public final p(I)V
    .locals 3

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LW/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LW/b;->i:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x800

    .line 22
    .line 23
    invoke-virtual {p0, p1, v2}, LW/b;->k(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final q(ILandroid/graphics/Rect;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    new-instance v4, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v4}, LW/b;->o(Ljava/util/ArrayList;)V

    .line 14
    .line 15
    .line 16
    new-instance v5, Lq/k;

    .line 17
    .line 18
    invoke-direct {v5}, Lq/k;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    if-ge v7, v8, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    invoke-virtual {v0, v8}, LW/b;->l(I)LO/k;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {v5, v9, v8}, Lq/k;->d(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/2addr v7, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v4, v0, LW/b;->l:I

    .line 58
    .line 59
    const/high16 v8, -0x80000000

    .line 60
    .line 61
    if-ne v4, v8, :cond_1

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v5, v4}, Lq/k;->c(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, LO/k;

    .line 70
    .line 71
    :goto_1
    sget-object v9, LW/b;->o:LI0/e;

    .line 72
    .line 73
    sget-object v10, LW/b;->p:LI0/e;

    .line 74
    .line 75
    iget-object v11, v0, LW/b;->i:Landroid/view/View;

    .line 76
    .line 77
    const/4 v12, 0x2

    .line 78
    if-eq v1, v3, :cond_15

    .line 79
    .line 80
    if-eq v1, v12, :cond_15

    .line 81
    .line 82
    const/16 v12, 0x82

    .line 83
    .line 84
    const/16 v14, 0x42

    .line 85
    .line 86
    const/16 v15, 0x21

    .line 87
    .line 88
    const/16 v7, 0x11

    .line 89
    .line 90
    if-eq v1, v7, :cond_2

    .line 91
    .line 92
    if-eq v1, v15, :cond_2

    .line 93
    .line 94
    if-eq v1, v14, :cond_2

    .line 95
    .line 96
    if-ne v1, v12, :cond_3

    .line 97
    .line 98
    :cond_2
    const/16 v17, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :goto_2
    new-instance v3, Landroid/graphics/Rect;

    .line 110
    .line 111
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 112
    .line 113
    .line 114
    iget v6, v0, LW/b;->l:I

    .line 115
    .line 116
    const-string v13, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 117
    .line 118
    if-eq v6, v8, :cond_4

    .line 119
    .line 120
    invoke-virtual {v0, v6}, LW/b;->r(I)LO/k;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2, v3}, LO/k;->f(Landroid/graphics/Rect;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    const/16 v19, -0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    if-eqz v2, :cond_5

    .line 131
    .line 132
    invoke-virtual {v3, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eq v1, v7, :cond_9

    .line 145
    .line 146
    if-eq v1, v15, :cond_8

    .line 147
    .line 148
    if-eq v1, v14, :cond_7

    .line 149
    .line 150
    if-ne v1, v12, :cond_6

    .line 151
    .line 152
    const/4 v6, -0x1

    .line 153
    const/4 v11, 0x0

    .line 154
    invoke-virtual {v3, v11, v6, v2, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-direct {v1, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :cond_7
    const/4 v2, -0x1

    .line 165
    const/4 v11, 0x0

    .line 166
    invoke-virtual {v3, v2, v11, v2, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    const/4 v11, 0x0

    .line 171
    const/16 v19, -0x1

    .line 172
    .line 173
    invoke-virtual {v3, v11, v6, v2, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    const/4 v11, 0x0

    .line 178
    const/16 v19, -0x1

    .line 179
    .line 180
    invoke-virtual {v3, v2, v11, v2, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 181
    .line 182
    .line 183
    :goto_4
    new-instance v2, Landroid/graphics/Rect;

    .line 184
    .line 185
    invoke-direct {v2, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 186
    .line 187
    .line 188
    if-eq v1, v7, :cond_d

    .line 189
    .line 190
    if-eq v1, v15, :cond_c

    .line 191
    .line 192
    if-eq v1, v14, :cond_b

    .line 193
    .line 194
    if-ne v1, v12, :cond_a

    .line 195
    .line 196
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    add-int/lit8 v6, v6, 0x1

    .line 201
    .line 202
    neg-int v6, v6

    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-virtual {v2, v7, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-direct {v1, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v1

    .line 214
    :cond_b
    const/4 v7, 0x0

    .line 215
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    add-int/lit8 v6, v6, 0x1

    .line 220
    .line 221
    neg-int v6, v6

    .line 222
    invoke-virtual {v2, v6, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_c
    const/4 v7, 0x0

    .line 227
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    add-int/lit8 v6, v6, 0x1

    .line 232
    .line 233
    invoke-virtual {v2, v7, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_d
    const/4 v7, 0x0

    .line 238
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    invoke-virtual {v2, v6, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 245
    .line 246
    .line 247
    :goto_5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget v6, v5, Lq/k;->c:I

    .line 251
    .line 252
    new-instance v10, Landroid/graphics/Rect;

    .line 253
    .line 254
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 255
    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    :goto_6
    if-ge v11, v6, :cond_14

    .line 261
    .line 262
    iget-object v12, v5, Lq/k;->b:[Ljava/lang/Object;

    .line 263
    .line 264
    aget-object v12, v12, v11

    .line 265
    .line 266
    check-cast v12, LO/k;

    .line 267
    .line 268
    if-ne v12, v4, :cond_e

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_e
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v10}, LO/k;->f(Landroid/graphics/Rect;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v3, v10}, LT/m;->E(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-nez v13, :cond_f

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_f
    invoke-static {v1, v3, v2}, LT/m;->E(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    if-nez v13, :cond_10

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_10
    invoke-static {v1, v3, v10, v2}, LT/m;->e(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    if-eqz v13, :cond_11

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_11
    invoke-static {v1, v3, v2, v10}, LT/m;->e(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    if-eqz v13, :cond_12

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_12
    invoke-static {v1, v3, v10}, LT/m;->J(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    invoke-static {v1, v3, v10}, LT/m;->K(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    mul-int/lit8 v15, v13, 0xd

    .line 314
    .line 315
    mul-int v15, v15, v13

    .line 316
    .line 317
    mul-int v14, v14, v14

    .line 318
    .line 319
    add-int/2addr v14, v15

    .line 320
    invoke-static {v1, v3, v2}, LT/m;->J(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 321
    .line 322
    .line 323
    move-result v13

    .line 324
    invoke-static {v1, v3, v2}, LT/m;->K(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    mul-int/lit8 v18, v13, 0xd

    .line 329
    .line 330
    mul-int v18, v18, v13

    .line 331
    .line 332
    mul-int v15, v15, v15

    .line 333
    .line 334
    add-int v15, v15, v18

    .line 335
    .line 336
    if-ge v14, v15, :cond_13

    .line 337
    .line 338
    :goto_7
    invoke-virtual {v2, v10}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v16, v12

    .line 342
    .line 343
    :cond_13
    :goto_8
    add-int/lit8 v11, v11, 0x1

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_14
    :goto_9
    move-object/from16 v1, v16

    .line 347
    .line 348
    goto/16 :goto_11

    .line 349
    .line 350
    :cond_15
    const/4 v7, 0x0

    .line 351
    const/16 v17, 0x1

    .line 352
    .line 353
    const/16 v19, -0x1

    .line 354
    .line 355
    sget-object v2, LN/S;->a:Ljava/util/WeakHashMap;

    .line 356
    .line 357
    invoke-virtual {v11}, Landroid/view/View;->getLayoutDirection()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    const/4 v3, 0x1

    .line 362
    if-ne v2, v3, :cond_16

    .line 363
    .line 364
    const/4 v2, 0x1

    .line 365
    goto :goto_a

    .line 366
    :cond_16
    const/4 v2, 0x0

    .line 367
    :goto_a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget v3, v5, Lq/k;->c:I

    .line 371
    .line 372
    new-instance v6, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    .line 376
    .line 377
    const/4 v11, 0x0

    .line 378
    :goto_b
    if-ge v11, v3, :cond_17

    .line 379
    .line 380
    iget-object v10, v5, Lq/k;->b:[Ljava/lang/Object;

    .line 381
    .line 382
    aget-object v10, v10, v11

    .line 383
    .line 384
    check-cast v10, LO/k;

    .line 385
    .line 386
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    const/4 v10, 0x1

    .line 390
    add-int/2addr v11, v10

    .line 391
    goto :goto_b

    .line 392
    :cond_17
    const/4 v10, 0x1

    .line 393
    new-instance v3, LW/c;

    .line 394
    .line 395
    invoke-direct {v3, v2, v9}, LW/c;-><init>(ZLI0/e;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v6, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 399
    .line 400
    .line 401
    if-eq v1, v10, :cond_1b

    .line 402
    .line 403
    if-ne v1, v12, :cond_1a

    .line 404
    .line 405
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-nez v4, :cond_18

    .line 410
    .line 411
    const/4 v2, -0x1

    .line 412
    goto :goto_c

    .line 413
    :cond_18
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    :goto_c
    add-int/2addr v2, v10

    .line 418
    if-ge v2, v1, :cond_19

    .line 419
    .line 420
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    :goto_d
    move-object/from16 v16, v1

    .line 425
    .line 426
    goto :goto_10

    .line 427
    :cond_19
    const/16 v16, 0x0

    .line 428
    .line 429
    goto :goto_10

    .line 430
    :cond_1a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 431
    .line 432
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."

    .line 433
    .line 434
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw v1

    .line 438
    :cond_1b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-nez v4, :cond_1c

    .line 443
    .line 444
    :goto_e
    const/16 v17, 0x1

    .line 445
    .line 446
    goto :goto_f

    .line 447
    :cond_1c
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    goto :goto_e

    .line 452
    :goto_f
    add-int/lit8 v1, v1, -0x1

    .line 453
    .line 454
    if-ltz v1, :cond_19

    .line 455
    .line 456
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    goto :goto_d

    .line 461
    :goto_10
    check-cast v16, LO/k;

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :goto_11
    if-nez v1, :cond_1d

    .line 465
    .line 466
    goto :goto_14

    .line 467
    :cond_1d
    iget v2, v5, Lq/k;->c:I

    .line 468
    .line 469
    const/4 v6, 0x0

    .line 470
    :goto_12
    if-ge v6, v2, :cond_1f

    .line 471
    .line 472
    iget-object v3, v5, Lq/k;->b:[Ljava/lang/Object;

    .line 473
    .line 474
    aget-object v3, v3, v6

    .line 475
    .line 476
    if-ne v3, v1, :cond_1e

    .line 477
    .line 478
    move v13, v6

    .line 479
    goto :goto_13

    .line 480
    :cond_1e
    const/16 v17, 0x1

    .line 481
    .line 482
    add-int/lit8 v6, v6, 0x1

    .line 483
    .line 484
    goto :goto_12

    .line 485
    :cond_1f
    const/4 v13, -0x1

    .line 486
    :goto_13
    iget-object v1, v5, Lq/k;->a:[I

    .line 487
    .line 488
    aget v8, v1, v13

    .line 489
    .line 490
    :goto_14
    invoke-virtual {v0, v8}, LW/b;->w(I)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    return v1
.end method

.method public final r(I)LO/k;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, LW/b;->i:Landroid/view/View;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LO/k;

    .line 11
    .line 12
    invoke-direct {v1, v0}, LO/k;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, LN/S;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, LW/b;->o(Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Views cannot have both real and virtual children"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    if-ge v3, v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, v1, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    return-object v1

    .line 75
    :cond_3
    invoke-virtual {p0, p1}, LW/b;->l(I)LO/k;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public abstract s(IILandroid/os/Bundle;)Z
.end method

.method public t(LO/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract u(ILO/k;)V
.end method

.method public v(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final w(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LW/b;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, LW/b;->l:I

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v1, -0x80000000

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, LW/b;->j(I)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    if-ne p1, v1, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_3
    iput p1, p0, LW/b;->l:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, p1, v0}, LW/b;->v(IZ)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, LW/b;->x(II)V

    .line 41
    .line 42
    .line 43
    return v0
.end method

.method public final x(II)V
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LW/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LW/b;->i:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, p1, p2}, LW/b;->k(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    return-void
.end method

.class public final LW/a;
.super LA/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:LW/b;


# direct methods
.method public constructor <init>(LW/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/a;->c:LW/b;

    .line 2
    .line 3
    const/4 p1, 0x7

    .line 4
    invoke-direct {p0, p1}, LA/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final C(I)LO/k;
    .locals 1

    .line 1
    iget-object v0, p0, LW/a;->c:LW/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LW/b;->r(I)LO/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, LO/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, LO/k;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LO/k;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final D(I)LO/k;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LW/a;->c:LW/b;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget p1, v1, LW/b;->k:I

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p1, v1, LW/b;->l:I

    .line 10
    .line 11
    :goto_0
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-virtual {p0, p1}, LW/a;->C(I)LO/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final F(IILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LW/a;->c:LW/b;

    .line 2
    .line 3
    iget-object v1, v0, LW/b;->i:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq p1, v2, :cond_8

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq p2, v2, :cond_7

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq p2, v3, :cond_6

    .line 13
    .line 14
    const/16 v3, 0x40

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/high16 v5, 0x10000

    .line 18
    .line 19
    const/high16 v6, -0x80000000

    .line 20
    .line 21
    if-eq p2, v3, :cond_2

    .line 22
    .line 23
    const/16 v3, 0x80

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, LW/b;->s(IILandroid/os/Bundle;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_0
    iget p2, v0, LW/b;->k:I

    .line 33
    .line 34
    if-ne p2, p1, :cond_1

    .line 35
    .line 36
    iput v6, v0, LW/b;->k:I

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v5}, LW/b;->x(II)V

    .line 42
    .line 43
    .line 44
    return v2

    .line 45
    :cond_1
    return v4

    .line 46
    :cond_2
    iget-object p2, v0, LW/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eqz p3, :cond_5

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget p2, v0, LW/b;->k:I

    .line 62
    .line 63
    if-eq p2, p1, :cond_5

    .line 64
    .line 65
    if-eq p2, v6, :cond_4

    .line 66
    .line 67
    iput v6, v0, LW/b;->k:I

    .line 68
    .line 69
    iget-object p3, v0, LW/b;->i:Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {p3}, Landroid/view/View;->invalidate()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p2, v5}, LW/b;->x(II)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iput p1, v0, LW/b;->k:I

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 80
    .line 81
    .line 82
    const p2, 0x8000

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, LW/b;->x(II)V

    .line 86
    .line 87
    .line 88
    return v2

    .line 89
    :cond_5
    :goto_0
    return v4

    .line 90
    :cond_6
    invoke-virtual {v0, p1}, LW/b;->j(I)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1

    .line 95
    :cond_7
    invoke-virtual {v0, p1}, LW/b;->w(I)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_8
    sget-object p1, LN/S;->a:Ljava/util/WeakHashMap;

    .line 101
    .line 102
    invoke-virtual {v1, p2, p3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    return p1
.end method

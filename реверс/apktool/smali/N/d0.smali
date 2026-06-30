.class public final LN/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LN/k0;

.field public final synthetic b:LN/x0;

.field public final synthetic c:LN/x0;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(LN/k0;LN/x0;LN/x0;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/d0;->a:LN/k0;

    .line 5
    .line 6
    iput-object p2, p0, LN/d0;->b:LN/x0;

    .line 7
    .line 8
    iput-object p3, p0, LN/d0;->c:LN/x0;

    .line 9
    .line 10
    iput p4, p0, LN/d0;->d:I

    .line 11
    .line 12
    iput-object p5, p0, LN/d0;->e:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v3, v0, LN/d0;->a:LN/k0;

    .line 8
    .line 9
    iget-object v4, v3, LN/k0;->a:LN/j0;

    .line 10
    .line 11
    invoke-virtual {v4, v2}, LN/j0;->d(F)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v3, LN/k0;->a:LN/j0;

    .line 15
    .line 16
    invoke-virtual {v2}, LN/j0;->b()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sget-object v4, LN/g0;->e:Landroid/view/animation/PathInterpolator;

    .line 21
    .line 22
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    iget-object v5, v0, LN/d0;->b:LN/x0;

    .line 25
    .line 26
    const/16 v6, 0x1e

    .line 27
    .line 28
    if-lt v4, v6, :cond_0

    .line 29
    .line 30
    new-instance v4, LN/o0;

    .line 31
    .line 32
    invoke-direct {v4, v5}, LN/o0;-><init>(LN/x0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 v6, 0x1d

    .line 37
    .line 38
    if-lt v4, v6, :cond_1

    .line 39
    .line 40
    new-instance v4, LN/n0;

    .line 41
    .line 42
    invoke-direct {v4, v5}, LN/n0;-><init>(LN/x0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v4, LN/m0;

    .line 47
    .line 48
    invoke-direct {v4, v5}, LN/m0;-><init>(LN/x0;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    const/4 v6, 0x1

    .line 52
    :goto_1
    const/16 v7, 0x100

    .line 53
    .line 54
    if-gt v6, v7, :cond_3

    .line 55
    .line 56
    iget v7, v0, LN/d0;->d:I

    .line 57
    .line 58
    and-int/2addr v7, v6

    .line 59
    iget-object v8, v5, LN/x0;->a:LN/v0;

    .line 60
    .line 61
    if-nez v7, :cond_2

    .line 62
    .line 63
    invoke-virtual {v8, v6}, LN/v0;->f(I)LF/c;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v4, v6, v7}, LN/p0;->c(ILF/c;)V

    .line 68
    .line 69
    .line 70
    move/from16 p1, v2

    .line 71
    .line 72
    const/4 v15, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v8, v6}, LN/v0;->f(I)LF/c;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-object v8, v0, LN/d0;->c:LN/x0;

    .line 79
    .line 80
    iget-object v8, v8, LN/x0;->a:LN/v0;

    .line 81
    .line 82
    invoke-virtual {v8, v6}, LN/v0;->f(I)LF/c;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget v9, v7, LF/c;->a:I

    .line 87
    .line 88
    iget v10, v8, LF/c;->a:I

    .line 89
    .line 90
    sub-int/2addr v9, v10

    .line 91
    int-to-float v9, v9

    .line 92
    const/high16 v10, 0x3f800000    # 1.0f

    .line 93
    .line 94
    sub-float/2addr v10, v2

    .line 95
    mul-float v9, v9, v10

    .line 96
    .line 97
    float-to-double v11, v9

    .line 98
    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    .line 99
    .line 100
    add-double/2addr v11, v13

    .line 101
    double-to-int v9, v11

    .line 102
    iget v11, v7, LF/c;->b:I

    .line 103
    .line 104
    iget v12, v8, LF/c;->b:I

    .line 105
    .line 106
    sub-int/2addr v11, v12

    .line 107
    int-to-float v11, v11

    .line 108
    mul-float v11, v11, v10

    .line 109
    .line 110
    float-to-double v11, v11

    .line 111
    add-double/2addr v11, v13

    .line 112
    double-to-int v11, v11

    .line 113
    iget v12, v7, LF/c;->c:I

    .line 114
    .line 115
    iget v15, v8, LF/c;->c:I

    .line 116
    .line 117
    sub-int/2addr v12, v15

    .line 118
    int-to-float v12, v12

    .line 119
    mul-float v12, v12, v10

    .line 120
    .line 121
    move/from16 p1, v2

    .line 122
    .line 123
    const/4 v15, 0x1

    .line 124
    float-to-double v1, v12

    .line 125
    add-double/2addr v1, v13

    .line 126
    double-to-int v1, v1

    .line 127
    iget v2, v7, LF/c;->d:I

    .line 128
    .line 129
    iget v8, v8, LF/c;->d:I

    .line 130
    .line 131
    sub-int/2addr v2, v8

    .line 132
    int-to-float v2, v2

    .line 133
    mul-float v2, v2, v10

    .line 134
    .line 135
    move-wide/from16 v16, v13

    .line 136
    .line 137
    float-to-double v13, v2

    .line 138
    add-double v13, v13, v16

    .line 139
    .line 140
    double-to-int v2, v13

    .line 141
    invoke-static {v7, v9, v11, v1, v2}, LN/x0;->e(LF/c;IIII)LF/c;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v4, v6, v1}, LN/p0;->c(ILF/c;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    shl-int/2addr v6, v15

    .line 149
    move/from16 v2, p1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-virtual {v4}, LN/p0;->b()LN/x0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v3, v0, LN/d0;->e:Landroid/view/View;

    .line 161
    .line 162
    invoke-static {v3, v1, v2}, LN/g0;->g(Landroid/view/View;LN/x0;Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

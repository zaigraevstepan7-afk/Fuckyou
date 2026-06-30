.class public final Lu0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final y:D

.field public static final z:Landroid/graphics/drawable/ColorDrawable;


# instance fields
.field public final a:Lcom/google/android/material/card/MaterialCardView;

.field public final b:Landroid/graphics/Rect;

.field public final c:LI0/h;

.field public final d:LI0/h;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:LI0/m;

.field public n:Landroid/content/res/ColorStateList;

.field public o:Landroid/graphics/drawable/RippleDrawable;

.field public p:Landroid/graphics/drawable/LayerDrawable;

.field public q:LI0/h;

.field public r:Z

.field public s:Z

.field public t:Landroid/animation/ValueAnimator;

.field public final u:Landroid/animation/TimeInterpolator;

.field public final v:I

.field public final w:I

.field public x:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lu0/c;->y:D

    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1c

    .line 19
    .line 20
    if-gt v0, v1, :cond_0

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    sput-object v0, Lu0/c;->z:Landroid/graphics/drawable/ColorDrawable;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/card/MaterialCardView;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lu0/c;->b:Landroid/graphics/Rect;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lu0/c;->r:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lu0/c;->x:F

    .line 16
    .line 17
    iput-object p1, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 18
    .line 19
    new-instance v1, LI0/h;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const v3, 0x7f0302f9

    .line 26
    .line 27
    .line 28
    const v4, 0x7f10040e

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, p2, v3, v4}, LI0/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lu0/c;->c:LI0/h;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, LI0/h;->j(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, LI0/h;->n()V

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, LI0/h;->a:LI0/g;

    .line 47
    .line 48
    iget-object v1, v1, LI0/g;->a:LI0/m;

    .line 49
    .line 50
    invoke-virtual {v1}, LI0/m;->e()LI0/l;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v4, Ln0/a;->b:[I

    .line 59
    .line 60
    const v5, 0x7f10011f

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p2, v4, v3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const/4 v2, 0x3

    .line 68
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {v1, v0}, LI0/l;->c(F)V

    .line 79
    .line 80
    .line 81
    :cond_0
    new-instance v0, LI0/h;

    .line 82
    .line 83
    invoke-direct {v0}, LI0/h;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lu0/c;->d:LI0/h;

    .line 87
    .line 88
    invoke-virtual {v1}, LI0/l;->a()LI0/m;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0, v0}, Lu0/c;->h(LI0/m;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget-object v1, Lo0/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 100
    .line 101
    const v2, 0x7f03033f

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2, v1}, LA0/e;->r0(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, Lu0/c;->u:Landroid/animation/TimeInterpolator;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const v1, 0x7f030335

    .line 115
    .line 116
    .line 117
    const/16 v2, 0x12c

    .line 118
    .line 119
    invoke-static {v0, v1, v2}, LA0/e;->q0(Landroid/content/Context;II)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iput v0, p0, Lu0/c;->v:I

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const v0, 0x7f030334

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v0, v2}, LA0/e;->q0(Landroid/content/Context;II)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    iput p1, p0, Lu0/c;->w:I

    .line 137
    .line 138
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public static b(LA0/e;F)F
    .locals 4

    .line 1
    instance-of v0, p0, LI0/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    sget-wide v2, Lu0/c;->y:D

    .line 8
    .line 9
    sub-double/2addr v0, v2

    .line 10
    float-to-double p0, p1

    .line 11
    mul-double v0, v0, p0

    .line 12
    .line 13
    double-to-float p0, v0

    .line 14
    return p0

    .line 15
    :cond_0
    instance-of p0, p0, LI0/d;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/high16 p0, 0x40000000    # 2.0f

    .line 20
    .line 21
    div-float/2addr p1, p0

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method


# virtual methods
.method public final a()F
    .locals 5

    .line 1
    iget-object v0, p0, Lu0/c;->m:LI0/m;

    .line 2
    .line 3
    iget-object v0, v0, LI0/m;->a:LA0/e;

    .line 4
    .line 5
    iget-object v1, p0, Lu0/c;->c:LI0/h;

    .line 6
    .line 7
    invoke-virtual {v1}, LI0/h;->h()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v2}, Lu0/c;->b(LA0/e;F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, Lu0/c;->m:LI0/m;

    .line 16
    .line 17
    iget-object v2, v2, LI0/m;->b:LA0/e;

    .line 18
    .line 19
    iget-object v3, v1, LI0/h;->a:LI0/g;

    .line 20
    .line 21
    iget-object v3, v3, LI0/g;->a:LI0/m;

    .line 22
    .line 23
    iget-object v3, v3, LI0/m;->f:LI0/c;

    .line 24
    .line 25
    invoke-virtual {v1}, LI0/h;->g()Landroid/graphics/RectF;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v3, v4}, LI0/c;->a(Landroid/graphics/RectF;)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v2, v3}, Lu0/c;->b(LA0/e;F)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, p0, Lu0/c;->m:LI0/m;

    .line 42
    .line 43
    iget-object v2, v2, LI0/m;->c:LA0/e;

    .line 44
    .line 45
    iget-object v3, v1, LI0/h;->a:LI0/g;

    .line 46
    .line 47
    iget-object v3, v3, LI0/g;->a:LI0/m;

    .line 48
    .line 49
    iget-object v3, v3, LI0/m;->g:LI0/c;

    .line 50
    .line 51
    invoke-virtual {v1}, LI0/h;->g()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v3, v4}, LI0/c;->a(Landroid/graphics/RectF;)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v2, v3}, Lu0/c;->b(LA0/e;F)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget-object v3, p0, Lu0/c;->m:LI0/m;

    .line 64
    .line 65
    iget-object v3, v3, LI0/m;->d:LA0/e;

    .line 66
    .line 67
    iget-object v4, v1, LI0/h;->a:LI0/g;

    .line 68
    .line 69
    iget-object v4, v4, LI0/g;->a:LI0/m;

    .line 70
    .line 71
    iget-object v4, v4, LI0/m;->h:LI0/c;

    .line 72
    .line 73
    invoke-virtual {v1}, LI0/h;->g()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v4, v1}, LI0/c;->a(Landroid/graphics/RectF;)F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v3, v1}, Lu0/c;->b(LA0/e;F)F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    return v0
.end method

.method public final c()Landroid/graphics/drawable/LayerDrawable;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lu0/c;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    sget-object v1, LG0/d;->a:[I

    .line 7
    .line 8
    new-instance v1, LI0/h;

    .line 9
    .line 10
    iget-object v2, p0, Lu0/c;->m:LI0/m;

    .line 11
    .line 12
    invoke-direct {v1, v2}, LI0/h;-><init>(LI0/m;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lu0/c;->q:LI0/h;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 18
    .line 19
    iget-object v2, p0, Lu0/c;->k:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    iget-object v3, p0, Lu0/c;->q:LI0/h;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v1, v2, v4, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lu0/c;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 28
    .line 29
    :cond_0
    iget-object v1, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    .line 34
    .line 35
    iget-object v2, p0, Lu0/c;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 36
    .line 37
    iget-object v3, p0, Lu0/c;->d:LI0/h;

    .line 38
    .line 39
    iget-object v4, p0, Lu0/c;->j:Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    aput-object v2, v5, v6

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    aput-object v3, v5, v2

    .line 49
    .line 50
    aput-object v4, v5, v0

    .line 51
    .line 52
    invoke-direct {v1, v5}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 56
    .line 57
    const v2, 0x7f090133

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v0, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 64
    .line 65
    return-object v0
.end method

.method public final d(Landroid/graphics/drawable/Drawable;)Lu0/b;
    .locals 8

    .line 1
    iget-object v0, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp/a;->getUseCompatPadding()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lp/a;->getMaxCardElevation()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 14
    .line 15
    mul-float v1, v1, v2

    .line 16
    .line 17
    invoke-virtual {p0}, Lu0/c;->i()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lu0/c;->a()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    :goto_0
    add-float/2addr v1, v2

    .line 31
    float-to-double v1, v1

    .line 32
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    double-to-int v1, v1

    .line 37
    invoke-virtual {v0}, Lp/a;->getMaxCardElevation()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0}, Lu0/c;->i()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lu0/c;->a()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :cond_1
    add-float/2addr v0, v3

    .line 52
    float-to-double v2, v0

    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    double-to-int v0, v2

    .line 58
    move v4, v0

    .line 59
    move v5, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v1, 0x0

    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    :goto_1
    new-instance v2, Lu0/b;

    .line 65
    .line 66
    move v6, v4

    .line 67
    move v7, v5

    .line 68
    move-object v3, p1

    .line 69
    invoke-direct/range {v2 .. v7}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 70
    .line 71
    .line 72
    return-object v2
.end method

.method public final e(II)V
    .locals 14

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    iget-object v1, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 4
    .line 5
    if-eqz v1, :cond_8

    .line 6
    .line 7
    iget-object v1, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 8
    .line 9
    invoke-virtual {v1}, Lp/a;->getUseCompatPadding()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1}, Lp/a;->getMaxCardElevation()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 20
    .line 21
    mul-float v2, v2, v3

    .line 22
    .line 23
    invoke-virtual {p0}, Lu0/c;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lu0/c;->a()F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x0

    .line 36
    :goto_0
    add-float/2addr v2, v3

    .line 37
    const/high16 v3, 0x40000000    # 2.0f

    .line 38
    .line 39
    mul-float v2, v2, v3

    .line 40
    .line 41
    float-to-double v5, v2

    .line 42
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    double-to-int v2, v5

    .line 47
    invoke-virtual {v1}, Lp/a;->getMaxCardElevation()F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {p0}, Lu0/c;->i()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0}, Lu0/c;->a()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    :cond_1
    add-float/2addr v5, v4

    .line 62
    mul-float v5, v5, v3

    .line 63
    .line 64
    float-to-double v3, v5

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    double-to-int v3, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    const/4 v3, 0x0

    .line 73
    :goto_1
    iget v4, p0, Lu0/c;->g:I

    .line 74
    .line 75
    const v5, 0x800005

    .line 76
    .line 77
    .line 78
    and-int v6, v4, v5

    .line 79
    .line 80
    if-ne v6, v5, :cond_3

    .line 81
    .line 82
    iget v6, p0, Lu0/c;->e:I

    .line 83
    .line 84
    sub-int v6, p1, v6

    .line 85
    .line 86
    iget v7, p0, Lu0/c;->f:I

    .line 87
    .line 88
    sub-int/2addr v6, v7

    .line 89
    sub-int/2addr v6, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    iget v6, p0, Lu0/c;->e:I

    .line 92
    .line 93
    :goto_2
    and-int/lit8 v7, v4, 0x50

    .line 94
    .line 95
    if-ne v7, v0, :cond_4

    .line 96
    .line 97
    iget v7, p0, Lu0/c;->e:I

    .line 98
    .line 99
    :goto_3
    move v13, v7

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    iget v7, p0, Lu0/c;->e:I

    .line 102
    .line 103
    sub-int v7, p2, v7

    .line 104
    .line 105
    iget v8, p0, Lu0/c;->f:I

    .line 106
    .line 107
    sub-int/2addr v7, v8

    .line 108
    sub-int/2addr v7, v2

    .line 109
    goto :goto_3

    .line 110
    :goto_4
    and-int v7, v4, v5

    .line 111
    .line 112
    if-ne v7, v5, :cond_5

    .line 113
    .line 114
    iget p1, p0, Lu0/c;->e:I

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    iget v5, p0, Lu0/c;->e:I

    .line 118
    .line 119
    sub-int/2addr p1, v5

    .line 120
    iget v5, p0, Lu0/c;->f:I

    .line 121
    .line 122
    sub-int/2addr p1, v5

    .line 123
    sub-int/2addr p1, v3

    .line 124
    :goto_5
    and-int/lit8 v3, v4, 0x50

    .line 125
    .line 126
    if-ne v3, v0, :cond_6

    .line 127
    .line 128
    iget v0, p0, Lu0/c;->e:I

    .line 129
    .line 130
    sub-int v0, p2, v0

    .line 131
    .line 132
    iget v3, p0, Lu0/c;->f:I

    .line 133
    .line 134
    sub-int/2addr v0, v3

    .line 135
    sub-int/2addr v0, v2

    .line 136
    :goto_6
    move v11, v0

    .line 137
    goto :goto_7

    .line 138
    :cond_6
    iget v0, p0, Lu0/c;->e:I

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :goto_7
    sget-object v0, LN/S;->a:Ljava/util/WeakHashMap;

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v1, 0x1

    .line 148
    if-ne v0, v1, :cond_7

    .line 149
    .line 150
    move v10, p1

    .line 151
    move v12, v6

    .line 152
    goto :goto_8

    .line 153
    :cond_7
    move v12, p1

    .line 154
    move v10, v6

    .line 155
    :goto_8
    iget-object v8, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 156
    .line 157
    const/4 v9, 0x2

    .line 158
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 159
    .line 160
    .line 161
    :cond_8
    return-void
.end method

.method public final f(ZZ)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-object v2, p0, Lu0/c;->j:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-eqz v2, :cond_7

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-eqz p2, :cond_4

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/high16 v3, 0x3f800000    # 1.0f

    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget p2, p0, Lu0/c;->x:F

    .line 19
    .line 20
    sub-float/2addr v4, p2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget v4, p0, Lu0/c;->x:F

    .line 23
    .line 24
    :goto_0
    iget-object p2, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    iput-object p2, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    :cond_2
    iget p2, p0, Lu0/c;->x:F

    .line 35
    .line 36
    new-array v2, v1, [F

    .line 37
    .line 38
    aput p2, v2, v0

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    aput v3, v2, p2

    .line 42
    .line 43
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    new-instance v0, LM0/i;

    .line 50
    .line 51
    invoke-direct {v0, v1, p0}, LM0/i;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    iget-object v0, p0, Lu0/c;->u:Landroid/animation/TimeInterpolator;

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget p1, p0, Lu0/c;->v:I

    .line 69
    .line 70
    :goto_1
    int-to-float p1, p1

    .line 71
    mul-float p1, p1, v4

    .line 72
    .line 73
    float-to-long v0, p1

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget p1, p0, Lu0/c;->w:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_2
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lu0/c;->t:Landroid/animation/ValueAnimator;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    if-eqz p1, :cond_5

    .line 88
    .line 89
    const/16 v0, 0xff

    .line 90
    .line 91
    :cond_5
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 92
    .line 93
    .line 94
    if-eqz p1, :cond_6

    .line 95
    .line 96
    const/high16 v3, 0x3f800000    # 1.0f

    .line 97
    .line 98
    :cond_6
    iput v3, p0, Lu0/c;->x:F

    .line 99
    .line 100
    :cond_7
    return-void
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LA0/e;->B0(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lu0/c;->j:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    iget-object v0, p0, Lu0/c;->l:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-static {p1, v0}, LG/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 19
    .line 20
    iget-boolean p1, p1, Lcom/google/android/material/card/MaterialCardView;->j:Z

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, p1, v0}, Lu0/c;->f(ZZ)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object p1, Lu0/c;->z:Landroid/graphics/drawable/ColorDrawable;

    .line 28
    .line 29
    iput-object p1, p0, Lu0/c;->j:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Lu0/c;->p:Landroid/graphics/drawable/LayerDrawable;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const v0, 0x7f090133

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lu0/c;->j:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/LayerDrawable;->setDrawableByLayerId(ILandroid/graphics/drawable/Drawable;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final h(LI0/m;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lu0/c;->m:LI0/m;

    .line 2
    .line 3
    iget-object v0, p0, Lu0/c;->c:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LI0/h;->a:LI0/g;

    .line 9
    .line 10
    iget-object v1, v1, LI0/g;->a:LI0/m;

    .line 11
    .line 12
    invoke-virtual {v0}, LI0/h;->g()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, LI0/m;->d(Landroid/graphics/RectF;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    xor-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    iput-boolean v1, v0, LI0/h;->v:Z

    .line 23
    .line 24
    iget-object v0, p0, Lu0/c;->d:LI0/h;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lu0/c;->q:LI0/h;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp/a;->getPreventCornerOverlap()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lu0/c;->c:LI0/h;

    .line 10
    .line 11
    iget-object v2, v1, LI0/h;->a:LI0/g;

    .line 12
    .line 13
    iget-object v2, v2, LI0/g;->a:LI0/m;

    .line 14
    .line 15
    invoke-virtual {v1}, LI0/h;->g()Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v2, v1}, LI0/m;->d(Landroid/graphics/RectF;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lp/a;->getUseCompatPadding()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->isDuplicateParentStateEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v1, v1, Landroid/view/View;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/View;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    return v0
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu0/c;->i:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu0/c;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lu0/c;->c()Landroid/graphics/drawable/LayerDrawable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lu0/c;->d:LI0/h;

    .line 15
    .line 16
    :goto_0
    iput-object v1, p0, Lu0/c;->i:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x17

    .line 23
    .line 24
    iget-object v3, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 25
    .line 26
    if-lt v0, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v0, v0, Landroid/graphics/drawable/InsetDrawable;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    .line 41
    .line 42
    invoke-static {v0, v1}, LA0/a;->h(Landroid/graphics/drawable/InsetDrawable;Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0, v1}, Lu0/c;->d(Landroid/graphics/drawable/Drawable;)Lu0/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v3, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final l()V
    .locals 7

    .line 1
    iget-object v0, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp/a;->getPreventCornerOverlap()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lu0/c;->c:LI0/h;

    .line 11
    .line 12
    iget-object v3, v1, LI0/h;->a:LI0/g;

    .line 13
    .line 14
    iget-object v3, v3, LI0/g;->a:LI0/m;

    .line 15
    .line 16
    invoke-virtual {v1}, LI0/h;->g()Landroid/graphics/RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v3, v1}, LI0/m;->d(Landroid/graphics/RectF;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    const/4 v3, 0x0

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Lu0/c;->i()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lu0/c;->a()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_2
    invoke-virtual {v0}, Lp/a;->getPreventCornerOverlap()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Lp/a;->getUseCompatPadding()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 58
    .line 59
    sget-wide v5, Lu0/c;->y:D

    .line 60
    .line 61
    sub-double/2addr v3, v5

    .line 62
    invoke-virtual {v0}, Lcom/google/android/material/card/MaterialCardView;->getCardViewRadius()F

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    float-to-double v5, v5

    .line 67
    mul-double v3, v3, v5

    .line 68
    .line 69
    double-to-float v3, v3

    .line 70
    :cond_3
    sub-float/2addr v1, v3

    .line 71
    float-to-int v1, v1

    .line 72
    iget-object v3, p0, Lu0/c;->b:Landroid/graphics/Rect;

    .line 73
    .line 74
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 75
    .line 76
    add-int/2addr v4, v1

    .line 77
    iget v5, v3, Landroid/graphics/Rect;->top:I

    .line 78
    .line 79
    add-int/2addr v5, v1

    .line 80
    iget v6, v3, Landroid/graphics/Rect;->right:I

    .line 81
    .line 82
    add-int/2addr v6, v1

    .line 83
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    add-int/2addr v3, v1

    .line 86
    iget-object v1, v0, Lp/a;->c:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-virtual {v1, v4, v5, v6, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v0, Lp/a;->e:LC0/n;

    .line 92
    .line 93
    iget-object v1, v0, LC0/n;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lp/a;

    .line 96
    .line 97
    invoke-virtual {v1}, Lp/a;->getUseCompatPadding()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0, v2, v2, v2, v2}, LC0/n;->K(IIII)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_4
    iget-object v1, v0, LC0/n;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    check-cast v1, Lp/b;

    .line 112
    .line 113
    iget v2, v1, Lp/b;->e:F

    .line 114
    .line 115
    iget v1, v1, Lp/b;->a:F

    .line 116
    .line 117
    iget-object v3, v0, LC0/n;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v3, Lp/a;

    .line 120
    .line 121
    invoke-virtual {v3}, Lp/a;->getPreventCornerOverlap()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-static {v2, v1, v4}, Lp/c;->a(FFZ)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    float-to-double v4, v4

    .line 130
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    double-to-int v4, v4

    .line 135
    invoke-virtual {v3}, Lp/a;->getPreventCornerOverlap()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-static {v2, v1, v3}, Lp/c;->b(FFZ)F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    float-to-double v1, v1

    .line 144
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    double-to-int v1, v1

    .line 149
    invoke-virtual {v0, v4, v1, v4, v1}, LC0/n;->K(IIII)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lu0/c;->r:Z

    .line 2
    .line 3
    iget-object v1, p0, Lu0/c;->a:Lcom/google/android/material/card/MaterialCardView;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu0/c;->c:LI0/h;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lu0/c;->d(Landroid/graphics/drawable/Drawable;)Lu0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1, v0}, Lcom/google/android/material/card/MaterialCardView;->setBackgroundInternal(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lu0/c;->i:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lu0/c;->d(Landroid/graphics/drawable/Drawable;)Lu0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

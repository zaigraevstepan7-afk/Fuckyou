.class public abstract Lp0/a;
.super LA/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/material/datepicker/l;


# virtual methods
.method public g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lp0/a;->r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lp0/a;->a:Lcom/google/android/material/datepicker/l;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/google/android/material/datepicker/l;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lcom/google/android/material/datepicker/l;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lp0/a;->a:Lcom/google/android/material/datepicker/l;

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lp0/a;->a:Lcom/google/android/material/datepicker/l;

    .line 16
    .line 17
    iget-object p2, p1, Lcom/google/android/material/datepicker/l;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    iput p3, p1, Lcom/google/android/material/datepicker/l;->b:I

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iput p2, p1, Lcom/google/android/material/datepicker/l;->c:I

    .line 32
    .line 33
    iget-object p1, p0, Lp0/a;->a:Lcom/google/android/material/datepicker/l;

    .line 34
    .line 35
    iget-object p2, p1, Lcom/google/android/material/datepicker/l;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    iget v0, p1, Lcom/google/android/material/datepicker/l;->b:I

    .line 44
    .line 45
    sub-int/2addr p3, v0

    .line 46
    rsub-int/lit8 p3, p3, 0x0

    .line 47
    .line 48
    invoke-static {p2, p3}, LN/S;->k(Landroid/view/View;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    iget p1, p1, Lcom/google/android/material/datepicker/l;->c:I

    .line 56
    .line 57
    sub-int/2addr p3, p1

    .line 58
    rsub-int/lit8 p1, p3, 0x0

    .line 59
    .line 60
    invoke-static {p2, p1}, LN/S;->j(Landroid/view/View;I)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1
.end method

.method public r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

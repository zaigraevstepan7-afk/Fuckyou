.class public final LG0/b;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements LI0/x;
.implements LG/d;


# instance fields
.field public a:LG0/a;


# direct methods
.method public constructor <init>(LG0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG0/b;->a:LG0/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-boolean v1, v0, LG0/a;->b:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LI0/h;->draw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x3

    .line 9
    return v0
.end method

.method public final isStateful()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, LG0/a;

    .line 2
    .line 3
    iget-object v1, p0, LG0/b;->a:LG0/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LG0/a;-><init>(LG0/a;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LG0/b;->a:LG0/a;

    .line 9
    .line 10
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 5
    .line 6
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LG0/b;->a:LG0/a;

    .line 6
    .line 7
    iget-object v1, v1, LG0/a;->a:LI0/h;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :cond_0
    invoke-static {p1}, LG0/d;->b([I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v1, p0, LG0/b;->a:LG0/a;

    .line 22
    .line 23
    iget-boolean v3, v1, LG0/a;->b:Z

    .line 24
    .line 25
    if-eq v3, p1, :cond_1

    .line 26
    .line 27
    iput-boolean p1, v1, LG0/a;->b:Z

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setAlpha(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setShapeAppearanceModel(LI0/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setShapeAppearanceModel(LI0/m;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTint(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setTint(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, LG0/b;->a:LG0/a;

    .line 2
    .line 3
    iget-object v0, v0, LG0/a;->a:LI0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LI0/h;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.class public final LG0/a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public a:LI0/h;

.field public b:Z


# direct methods
.method public constructor <init>(LG0/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LG0/a;->a:LI0/h;

    .line 5
    .line 6
    iget-object v0, v0, LI0/h;->a:LI0/g;

    .line 7
    .line 8
    invoke-virtual {v0}, LI0/g;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LI0/h;

    .line 13
    .line 14
    iput-object v0, p0, LG0/a;->a:LI0/h;

    .line 15
    .line 16
    iget-boolean p1, p1, LG0/a;->b:Z

    .line 17
    .line 18
    iput-boolean p1, p0, LG0/a;->b:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, LG0/b;

    .line 2
    .line 3
    new-instance v1, LG0/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LG0/a;-><init>(LG0/a;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, LG0/b;-><init>(LG0/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

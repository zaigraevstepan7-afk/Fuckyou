.class public final Ll/K;
.super Ll/A0;
.source "SourceFile"


# instance fields
.field public final synthetic j:Ll/P;

.field public final synthetic k:Ll/T;


# direct methods
.method public constructor <init>(Ll/T;Ll/T;Ll/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/K;->k:Ll/T;

    .line 2
    .line 3
    iput-object p3, p0, Ll/K;->j:Ll/P;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ll/A0;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()Lk/C;
    .locals 1

    .line 1
    iget-object v0, p0, Ll/K;->j:Ll/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll/K;->k:Ll/T;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll/T;->getInternalPopup()Ll/S;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ll/S;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v0, v0, Ll/T;->f:Ll/S;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Ll/S;->f(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

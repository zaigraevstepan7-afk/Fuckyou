.class public final Landroidx/activity/n;
.super La1/d;
.source "SourceFile"

# interfaces
.implements LZ0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/v;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/v;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/n;->a:I

    iput-object p1, p0, Landroidx/activity/n;->b:Landroidx/activity/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La1/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/activity/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/activity/b;

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/activity/n;->b:Landroidx/activity/v;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/activity/v;->b:LS0/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v0, p1, LS0/a;->c:I

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v1, v0

    .line 32
    check-cast v1, Landroidx/fragment/app/z;

    .line 33
    .line 34
    iget-boolean v1, v1, Landroidx/fragment/app/z;->a:Z

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    :goto_0
    check-cast v0, Landroidx/fragment/app/z;

    .line 41
    .line 42
    sget-object p1, LR0/d;->c:LR0/d;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    check-cast p1, Landroidx/activity/b;

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/activity/n;->b:Landroidx/activity/v;

    .line 48
    .line 49
    iget-object v0, p1, Landroidx/activity/v;->b:LS0/a;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget v1, v0, LS0/a;->c:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v2, v1

    .line 71
    check-cast v2, Landroidx/fragment/app/z;

    .line 72
    .line 73
    iget-boolean v2, v2, Landroidx/fragment/app/z;->a:Z

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v1, 0x0

    .line 79
    :goto_1
    check-cast v1, Landroidx/fragment/app/z;

    .line 80
    .line 81
    iput-object v1, p1, Landroidx/activity/v;->c:Landroidx/fragment/app/z;

    .line 82
    .line 83
    sget-object p1, LR0/d;->c:LR0/d;

    .line 84
    .line 85
    return-object p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

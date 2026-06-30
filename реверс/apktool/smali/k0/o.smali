.class public final Lk0/o;
.super Lk0/n;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lq/f;

.field public final synthetic b:Lk0/p;


# direct methods
.method public constructor <init>(Lk0/p;Lq/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/o;->b:Lk0/p;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/o;->a:Lq/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lk0/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/o;->b:Lk0/p;

    .line 2
    .line 3
    iget-object v0, v0, Lk0/p;->b:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iget-object v1, p0, Lk0/o;->a:Lq/f;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lq/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lk0/m;->x(Lk0/k;)Lk0/m;

    .line 17
    .line 18
    .line 19
    return-void
.end method

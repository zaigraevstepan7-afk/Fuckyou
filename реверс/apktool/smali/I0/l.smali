.class public final LI0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LA0/e;

.field public b:LA0/e;

.field public c:LA0/e;

.field public d:LA0/e;

.field public e:LI0/c;

.field public f:LI0/c;

.field public g:LI0/c;

.field public h:LI0/c;

.field public i:LI0/e;

.field public j:LI0/e;

.field public k:LI0/e;

.field public l:LI0/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LI0/k;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LI0/l;->a:LA0/e;

    .line 10
    .line 11
    new-instance v0, LI0/k;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LI0/l;->b:LA0/e;

    .line 17
    .line 18
    new-instance v0, LI0/k;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LI0/l;->c:LA0/e;

    .line 24
    .line 25
    new-instance v0, LI0/k;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LI0/l;->d:LA0/e;

    .line 31
    .line 32
    new-instance v0, LI0/a;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, v1}, LI0/a;-><init>(F)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LI0/l;->e:LI0/c;

    .line 39
    .line 40
    new-instance v0, LI0/a;

    .line 41
    .line 42
    invoke-direct {v0, v1}, LI0/a;-><init>(F)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, LI0/l;->f:LI0/c;

    .line 46
    .line 47
    new-instance v0, LI0/a;

    .line 48
    .line 49
    invoke-direct {v0, v1}, LI0/a;-><init>(F)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, LI0/l;->g:LI0/c;

    .line 53
    .line 54
    new-instance v0, LI0/a;

    .line 55
    .line 56
    invoke-direct {v0, v1}, LI0/a;-><init>(F)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, LI0/l;->h:LI0/c;

    .line 60
    .line 61
    new-instance v0, LI0/e;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, LI0/l;->i:LI0/e;

    .line 68
    .line 69
    new-instance v0, LI0/e;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, LI0/l;->j:LI0/e;

    .line 76
    .line 77
    new-instance v0, LI0/e;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, LI0/l;->k:LI0/e;

    .line 84
    .line 85
    new-instance v0, LI0/e;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v0, v1}, LI0/e;-><init>(I)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, LI0/l;->l:LI0/e;

    .line 92
    .line 93
    return-void
.end method

.method public static b(LA0/e;)V
    .locals 1

    .line 1
    instance-of v0, p0, LI0/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LI0/k;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, LI0/d;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, LI0/d;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()LI0/m;
    .locals 2

    .line 1
    new-instance v0, LI0/m;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LI0/l;->a:LA0/e;

    .line 7
    .line 8
    iput-object v1, v0, LI0/m;->a:LA0/e;

    .line 9
    .line 10
    iget-object v1, p0, LI0/l;->b:LA0/e;

    .line 11
    .line 12
    iput-object v1, v0, LI0/m;->b:LA0/e;

    .line 13
    .line 14
    iget-object v1, p0, LI0/l;->c:LA0/e;

    .line 15
    .line 16
    iput-object v1, v0, LI0/m;->c:LA0/e;

    .line 17
    .line 18
    iget-object v1, p0, LI0/l;->d:LA0/e;

    .line 19
    .line 20
    iput-object v1, v0, LI0/m;->d:LA0/e;

    .line 21
    .line 22
    iget-object v1, p0, LI0/l;->e:LI0/c;

    .line 23
    .line 24
    iput-object v1, v0, LI0/m;->e:LI0/c;

    .line 25
    .line 26
    iget-object v1, p0, LI0/l;->f:LI0/c;

    .line 27
    .line 28
    iput-object v1, v0, LI0/m;->f:LI0/c;

    .line 29
    .line 30
    iget-object v1, p0, LI0/l;->g:LI0/c;

    .line 31
    .line 32
    iput-object v1, v0, LI0/m;->g:LI0/c;

    .line 33
    .line 34
    iget-object v1, p0, LI0/l;->h:LI0/c;

    .line 35
    .line 36
    iput-object v1, v0, LI0/m;->h:LI0/c;

    .line 37
    .line 38
    iget-object v1, p0, LI0/l;->i:LI0/e;

    .line 39
    .line 40
    iput-object v1, v0, LI0/m;->i:LI0/e;

    .line 41
    .line 42
    iget-object v1, p0, LI0/l;->j:LI0/e;

    .line 43
    .line 44
    iput-object v1, v0, LI0/m;->j:LI0/e;

    .line 45
    .line 46
    iget-object v1, p0, LI0/l;->k:LI0/e;

    .line 47
    .line 48
    iput-object v1, v0, LI0/m;->k:LI0/e;

    .line 49
    .line 50
    iget-object v1, p0, LI0/l;->l:LI0/e;

    .line 51
    .line 52
    iput-object v1, v0, LI0/m;->l:LI0/e;

    .line 53
    .line 54
    return-object v0
.end method

.method public final c(F)V
    .locals 1

    .line 1
    new-instance v0, LI0/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LI0/a;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LI0/l;->e:LI0/c;

    .line 7
    .line 8
    new-instance v0, LI0/a;

    .line 9
    .line 10
    invoke-direct {v0, p1}, LI0/a;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LI0/l;->f:LI0/c;

    .line 14
    .line 15
    new-instance v0, LI0/a;

    .line 16
    .line 17
    invoke-direct {v0, p1}, LI0/a;-><init>(F)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LI0/l;->g:LI0/c;

    .line 21
    .line 22
    new-instance v0, LI0/a;

    .line 23
    .line 24
    invoke-direct {v0, p1}, LI0/a;-><init>(F)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LI0/l;->h:LI0/c;

    .line 28
    .line 29
    return-void
.end method

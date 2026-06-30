.class public final synthetic Le0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le0/b;

.field public final synthetic b:I

.field public final synthetic c:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Le0/b;ILjava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/a;->a:Le0/b;

    iput p2, p0, Le0/a;->b:I

    iput-object p3, p0, Le0/a;->c:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le0/a;->a:Le0/b;

    .line 2
    .line 3
    iget-object v0, v0, Le0/b;->b:Le0/e;

    .line 4
    .line 5
    iget v1, p0, Le0/a;->b:I

    .line 6
    .line 7
    iget-object v2, p0, Le0/a;->c:Ljava/io/Serializable;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Le0/e;->o(ILjava/io/Serializable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

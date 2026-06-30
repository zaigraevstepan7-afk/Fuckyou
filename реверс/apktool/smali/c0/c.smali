.class public final Lc0/c;
.super Lc0/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lc0/a;->b:Lc0/a;

    .line 2
    .line 3
    const-string v1, "initialExtras"

    .line 4
    .line 5
    invoke-static {v0, v1}, La1/c;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lc0/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lc0/b;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    iget-object v0, v0, Lc0/b;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.class public final synthetic LK/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LK/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, LK/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LQ0/n;

    .line 7
    .line 8
    check-cast p2, LQ0/n;

    .line 9
    .line 10
    sget v0, Lcom/reddit/frontpage/ConfigsActivity;->H:I

    .line 11
    .line 12
    iget-wide v0, p2, LQ0/n;->c:J

    .line 13
    .line 14
    iget-wide p1, p1, LQ0/n;->c:J

    .line 15
    .line 16
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :pswitch_0
    check-cast p1, [B

    .line 22
    .line 23
    check-cast p2, [B

    .line 24
    .line 25
    array-length v0, p1

    .line 26
    array-length v1, p2

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    array-length p1, p1

    .line 30
    array-length p2, p2

    .line 31
    sub-int/2addr p1, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    array-length v2, p1

    .line 36
    if-ge v1, v2, :cond_2

    .line 37
    .line 38
    aget-byte v2, p1, v1

    .line 39
    .line 40
    aget-byte v3, p2, v1

    .line 41
    .line 42
    if-eq v2, v3, :cond_1

    .line 43
    .line 44
    sub-int p1, v2, v3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x0

    .line 51
    :goto_1
    return p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

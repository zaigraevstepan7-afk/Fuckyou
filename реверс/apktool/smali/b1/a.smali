.class public abstract Lb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LV0/b;->a:LV0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LV0/a;->a()Lb1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lb1/a;->a:Lb1/a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Random;
.end method

.method public final b()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb1/a;->a()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x7fff0000

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

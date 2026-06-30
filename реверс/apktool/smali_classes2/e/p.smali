.class public final Le/p;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/ArrayDeque;

.field public final c:Le/q;

.field public d:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x6f

    const-class v1, Le/p;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_111_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/p;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Le/p;->b:Ljava/util/ArrayDeque;

    iput-object p1, p0, Le/p;->c:Le/q;

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native execute(Ljava/lang/Runnable;)V
.end method

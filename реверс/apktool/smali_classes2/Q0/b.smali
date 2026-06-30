.class public final synthetic LQ0/b;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Le/k;

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x37

    const-class v1, LQ0/b;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_55_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Le/k;ZI)V
    .locals 0

    iput p3, p0, LQ0/b;->a:I

    iput-object p1, p0, LQ0/b;->b:Le/k;

    iput-boolean p2, p0, LQ0/b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native run()V
.end method

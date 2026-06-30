.class public final synthetic LQ0/v;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public final a:Lcom/reddit/frontpage/MainActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x4b

    const-class v1, LQ0/v;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_75_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0/v;->a:Lcom/reddit/frontpage/MainActivity;

    return-void
.end method

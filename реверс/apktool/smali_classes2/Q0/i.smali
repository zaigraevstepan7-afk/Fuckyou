.class public final synthetic LQ0/i;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lcom/reddit/frontpage/ConfigsActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x3e

    const-class v1, LQ0/i;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_62_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/ConfigsActivity;I)V
    .locals 0

    iput p2, p0, LQ0/i;->a:I

    iput-object p1, p0, LQ0/i;->b:Lcom/reddit/frontpage/ConfigsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۠ۤ۟ۥ()[S
.end method


# virtual methods
.method public final native run()V
.end method

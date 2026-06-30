.class public final synthetic LQ0/o;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lcom/reddit/frontpage/MainActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x44

    const-class v1, LQ0/o;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_68_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/MainActivity;I)V
    .locals 0

    iput p2, p0, LQ0/o;->a:I

    iput-object p1, p0, LQ0/o;->b:Lcom/reddit/frontpage/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۟ۡۤۢۨ()[S
.end method

.method public static native ۣۣ۟ۤۨ(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native run()V
.end method

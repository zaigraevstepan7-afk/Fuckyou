.class public final synthetic LQ0/q;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lcom/reddit/frontpage/MainActivity;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x46

    const-class v1, LQ0/q;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_70_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/MainActivity;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, LQ0/q;->a:I

    iput-object p1, p0, LQ0/q;->b:Lcom/reddit/frontpage/MainActivity;

    iput-object p2, p0, LQ0/q;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۟ۡ۟ۧۦ()[S
.end method


# virtual methods
.method public final native run()V
.end method

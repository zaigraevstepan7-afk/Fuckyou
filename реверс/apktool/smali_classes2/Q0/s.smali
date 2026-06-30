.class public final synthetic LQ0/s;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/reddit/frontpage/MainActivity;

.field public final b:J

.field public final c:J

.field public final d:D

.field public final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x48

    const-class v1, LQ0/s;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_72_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/MainActivity;JJDJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0/s;->a:Lcom/reddit/frontpage/MainActivity;

    iput-wide p2, p0, LQ0/s;->b:J

    iput-wide p4, p0, LQ0/s;->c:J

    iput-wide p6, p0, LQ0/s;->d:D

    iput-wide p8, p0, LQ0/s;->e:J

    return-void
.end method

.method public static native ۢ۟ۨۦ()[S
.end method


# virtual methods
.method public final native run()V
.end method

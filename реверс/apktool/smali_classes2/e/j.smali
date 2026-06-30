.class public final Le/j;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements La/b;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Le/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x6b

    const-class v1, Le/j;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_107_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/j;->a:Le/k;

    return-void
.end method

.method public static native ۣۣۤۧ()[S
.end method


# virtual methods
.method public final native a()V
.end method

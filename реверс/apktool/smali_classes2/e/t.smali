.class public final Le/t;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements LN/r;
.implements Ll/m0;
.implements Lk/x;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Le/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x72

    const-class v1, Le/t;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_114_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Le/D;I)V
    .locals 0

    iput p2, p0, Le/t;->a:I

    iput-object p1, p0, Le/t;->b:Le/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۟۟ۥ۠۠()[S
.end method


# virtual methods
.method public native b(Lk/m;Z)V
.end method

.method public native h(Lk/m;)Z
.end method

.method public native p(Landroid/view/View;LN/x0;)LN/x0;
.end method

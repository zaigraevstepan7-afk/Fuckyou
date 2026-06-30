.class public final synthetic LM0/B;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements LM0/F;
.implements Lk0/l;


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x16

    const-class v1, LM0/B;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_22_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LM0/B;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native a(Lk0/k;Lk0/m;)V
.end method

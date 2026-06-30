.class public final LM0/f;
.super LM0/s;
.source "Dex2C"


# instance fields
.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x21

    const-class v1, LM0/f;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_33_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/r;I)V
    .locals 0

    iput p2, p0, LM0/f;->e:I

    invoke-direct {p0, p1}, LM0/s;-><init>(LM0/r;)V

    return-void
.end method


# virtual methods
.method public native r()V
.end method

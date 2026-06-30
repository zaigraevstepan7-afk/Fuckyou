.class public final Le/L;
.super LA0/e;
.source "Dex2C"


# instance fields
.field public final k:I

.field public final l:Le/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x5f

    const-class v1, Le/L;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_95_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Le/N;I)V
    .locals 0

    iput p2, p0, Le/L;->k:I

    iput-object p1, p0, Le/L;->l:Le/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

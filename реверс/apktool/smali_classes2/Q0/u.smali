.class public final synthetic LQ0/u;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Lcom/reddit/frontpage/MainActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x4a

    const-class v1, LQ0/u;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_74_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/MainActivity;I)V
    .locals 0

    iput p2, p0, LQ0/u;->a:I

    iput-object p1, p0, LQ0/u;->b:Lcom/reddit/frontpage/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method

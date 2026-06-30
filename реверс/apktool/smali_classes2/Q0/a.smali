.class public final synthetic LQ0/a;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Lcom/reddit/frontpage/ConfigsActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x36

    const-class v1, LQ0/a;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_54_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/reddit/frontpage/ConfigsActivity;I)V
    .locals 0

    iput p2, p0, LQ0/a;->a:I

    iput-object p1, p0, LQ0/a;->b:Lcom/reddit/frontpage/ConfigsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method

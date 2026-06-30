.class public final Le/a;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/View;

.field public final d:Le/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x62

    const-class v1, Le/a;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_98_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Le/g;Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    iput p4, p0, Le/a;->a:I

    iput-object p1, p0, Le/a;->d:Le/g;

    iput-object p2, p0, Le/a;->b:Landroid/view/View;

    iput-object p3, p0, Le/a;->c:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native run()V
.end method

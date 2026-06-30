.class public final Le/b;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x63

    const-class v1, Le/b;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_99_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/b;->a:Landroid/view/View;

    iput-object p2, p0, Le/b;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final native onScroll(Landroid/widget/AbsListView;III)V
.end method

.method public final native onScrollStateChanged(Landroid/widget/AbsListView;I)V
.end method

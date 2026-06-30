.class public final Le/c;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final a:Le/g;

.field public final b:Le/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x64

    const-class v1, Le/c;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_100_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Le/d;Le/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/c;->b:Le/d;

    iput-object p2, p0, Le/c;->a:Le/g;

    return-void
.end method


# virtual methods
.method public final native onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end method

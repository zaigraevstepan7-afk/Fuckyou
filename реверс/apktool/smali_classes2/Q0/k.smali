.class public final synthetic LQ0/k;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:LQ0/m;

.field public final c:LQ0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x40

    const-class v1, LQ0/k;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_64_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/m;LQ0/n;I)V
    .locals 0

    iput p3, p0, LQ0/k;->a:I

    iput-object p1, p0, LQ0/k;->b:LQ0/m;

    iput-object p2, p0, LQ0/k;->c:LQ0/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ۡۦۣ۟(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method

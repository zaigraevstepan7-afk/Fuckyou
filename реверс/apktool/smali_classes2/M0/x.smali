.class public final LM0/x;
.super Landroid/widget/ArrayAdapter;
.source "Dex2C"


# instance fields
.field public a:Landroid/content/res/ColorStateList;

.field public b:Landroid/content/res/ColorStateList;

.field public final c:LM0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x32

    const-class v1, LM0/x;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_50_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/y;Landroid/content/Context;I[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LM0/x;->c:LM0/y;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-static {p0}, LA0/۟ۧ۟ۦۦ;->ۢۢ۟۟(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.class public final Le/A;
.super Landroid/content/BroadcastReceiver;
.source "Dex2C"


# instance fields
.field public final a:Landroidx/fragment/app/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x53

    const-class v1, Le/A;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_83_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    iput-object p1, p0, Le/A;->a:Landroidx/fragment/app/g;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end method

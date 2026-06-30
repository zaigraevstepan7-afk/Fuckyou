.class public final synthetic Le/E;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements LN/k;


# instance fields
.field public final a:Le/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x58

    const-class v1, Le/E;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_88_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Le/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/E;->a:Le/h;

    return-void
.end method


# virtual methods
.method public final native e(Landroid/view/KeyEvent;)Z
.end method

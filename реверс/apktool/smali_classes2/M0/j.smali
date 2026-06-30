.class public final synthetic LM0/j;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:LM0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x25

    const-class v1, LM0/j;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_37_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/j;->a:LM0/m;

    return-void
.end method


# virtual methods
.method public final native onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end method

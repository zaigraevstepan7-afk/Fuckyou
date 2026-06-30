.class public final synthetic LM0/b;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final a:I

.field public final b:LM0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1c

    const-class v1, LM0/b;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_28_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/s;I)V
    .locals 0

    iput p2, p0, LM0/b;->a:I

    iput-object p1, p0, LM0/b;->b:LM0/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onFocusChange(Landroid/view/View;Z)V
.end method

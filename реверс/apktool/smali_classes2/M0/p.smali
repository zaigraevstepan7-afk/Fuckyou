.class public final LM0/p;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2b

    const-class v1, LM0/p;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_43_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LM0/p;->a:I

    iput-object p2, p0, LM0/p;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final native a(Landroid/view/View;)V
.end method

.method private final native b(Landroid/view/View;)V
.end method

.method private final native c(Landroid/view/View;)V
.end method


# virtual methods
.method public final native onViewAttachedToWindow(Landroid/view/View;)V
.end method

.method public final native onViewDetachedFromWindow(Landroid/view/View;)V
.end method

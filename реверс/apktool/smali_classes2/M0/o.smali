.class public final LM0/o;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public final a:LM0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2a

    const-class v1, LM0/o;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_42_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/o;->a:LM0/r;

    return-void
.end method


# virtual methods
.method public final native a(Lcom/google/android/material/textfield/TextInputLayout;)V
.end method

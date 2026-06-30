.class public final LQ0/w;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x4c

    const-class v1, LQ0/w;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_76_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0/w;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static native ۢۦۥۣ()[S
.end method


# virtual methods
.method public final native afterTextChanged(Landroid/text/Editable;)V
.end method

.method public final native beforeTextChanged(Ljava/lang/CharSequence;III)V
.end method

.method public final native onTextChanged(Ljava/lang/CharSequence;III)V
.end method

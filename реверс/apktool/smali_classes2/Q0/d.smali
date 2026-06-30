.class public final synthetic LQ0/d;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Lcom/reddit/frontpage/ConfigsActivity;

.field public final b:Le/h;

.field public final c:Lcom/google/android/material/textfield/TextInputEditText;

.field public final d:LQ0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x39

    const-class v1, LQ0/d;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_57_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/n;Lcom/google/android/material/textfield/TextInputEditText;Lcom/reddit/frontpage/ConfigsActivity;Le/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LQ0/d;->a:Lcom/reddit/frontpage/ConfigsActivity;

    iput-object p4, p0, LQ0/d;->b:Le/h;

    iput-object p2, p0, LQ0/d;->c:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, LQ0/d;->d:LQ0/n;

    return-void
.end method


# virtual methods
.method public final native onShow(Landroid/content/DialogInterface;)V
.end method

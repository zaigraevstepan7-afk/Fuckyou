.class public final synthetic LQ0/g;
.super Ljava/lang/Object;
.source "Dex2C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/reddit/frontpage/ConfigsActivity;

.field public final b:Lcom/google/android/material/textfield/TextInputEditText;

.field public final c:LQ0/n;

.field public final d:Le/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x3c

    const-class v1, LQ0/g;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_60_00(Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/n;Lcom/google/android/material/textfield/TextInputEditText;Lcom/reddit/frontpage/ConfigsActivity;Le/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LQ0/g;->a:Lcom/reddit/frontpage/ConfigsActivity;

    iput-object p2, p0, LQ0/g;->b:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, LQ0/g;->c:LQ0/n;

    iput-object p4, p0, LQ0/g;->d:Le/h;

    return-void
.end method

.method public static native ۟ۦۣۢۨ(Ljava/lang/Object;)I
.end method

.method public static native ۠ۧۡ()[S
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method

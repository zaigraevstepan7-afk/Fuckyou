.class public Lcom/reddit/frontpage/ConfigsActivity;
.super Le/k;
.source "Dex2C"


# static fields
.field public static final H:I

.field private static final short:[S


# instance fields
.field public A:Landroidx/recyclerview/widget/RecyclerView;

.field public B:Landroid/view/View;

.field public C:Landroid/widget/TextView;

.field public D:Lcom/google/android/material/button/MaterialButton;

.field public E:Lcom/google/android/material/button/MaterialButton;

.field public F:LQ0/m;

.field public final G:Landroidx/activity/result/c;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x51

    const-class v1, Lcom/reddit/frontpage/ConfigsActivity;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_81_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Le/k;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/reddit/frontpage/ConfigsActivity;->y:Ljava/util/ArrayList;

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Lcom/reddit/frontpage/ConfigsActivity;->۟ۢۡ۟()[S

    move-result-object v1

    const/16 v2, 0x6c3

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v1, v3, v4, v2}, LC/ۣ۟ۦۨ;->ۨۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LN0/۠ۧۢۧ;->ۣ۠ۢۡ()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/reddit/frontpage/ConfigsActivity;->z:Ljava/text/SimpleDateFormat;

    new-instance v0, Landroidx/fragment/app/D;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/fragment/app/D;-><init>(I)V

    new-instance v1, LM0/l;

    invoke-direct {v1, p0}, LM0/l;-><init>(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/reddit/frontpage/ConfigsActivity;->۟ۢۡ۟()[S

    move-result-object v3

    const/16 v5, 0xc

    const/16 v6, 0x896

    invoke-static {v3, v4, v5, v6}, LV0/ۥۤۥۡ;->ۨ۠۟۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->۟ۥۣ۟ۢ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-static {v3}, LN0/۟ۥ۟ۨ۟;->ۣ۟۟۟ۥ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v2, v3}, Lr/۠ۨۦۢ;->ۣ۟۟۠۠(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll0/ۤ۟ۨۧ;->ۡۧۥۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Li0/۟۟ۤۦۤ;->ۣ۟ۤۧ(Ljava/lang/Object;)Landroidx/activity/g;

    move-result-object v3

    invoke-static {v3, v2, p0, v0, v1}, Lx/۟۟ۦۣ۠;->۠ۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/activity/result/c;

    move-result-object v0

    iput-object v0, p0, Lcom/reddit/frontpage/ConfigsActivity;->G:Landroidx/activity/result/c;

    return-void
.end method

.method public static native B(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native C(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native E(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native r(Ljava/lang/String;)Ljava/io/File;
.end method

.method public static native v()Ljava/lang/String;
.end method

.method public static native z(Ljava/io/File;)Ljava/util/ArrayList;
.end method

.method public static native ۟ۢۡ۟()[S
.end method

.method public static native ۣ۟ۦۨ(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native A(Ljava/lang/String;)Ljava/util/ArrayList;
.end method

.method public final native D(Z)V
.end method

.method public final native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native onResume()V
.end method

.method public final native s(Landroid/net/Uri;Ljava/io/File;)Z
.end method

.method public final native t()Z
.end method

.method public final native u(Ljava/lang/String;)LQ0/j;
.end method

.method public final native w()V
.end method

.method public final native x(Ljava/io/File;Ljava/io/File;)Z
.end method

.method public final native y()V
.end method

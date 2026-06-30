.class public final LQ0/m;
.super Lg0/B;
.source "Dex2C"


# instance fields
.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/text/SimpleDateFormat;

.field public final f:LA/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x42

    const-class v1, LQ0/m;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_66_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/text/SimpleDateFormat;LA/b;)V
    .locals 0

    invoke-direct {p0}, Lg0/B;-><init>()V

    iput-object p1, p0, LQ0/m;->d:Ljava/util/ArrayList;

    iput-object p2, p0, LQ0/m;->e:Ljava/text/SimpleDateFormat;

    iput-object p3, p0, LQ0/m;->f:LA/b;

    return-void
.end method

.method public static native ۟۠ۧۢ۠(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native a()I
.end method

.method public final native c(Lg0/b0;I)V
.end method

.method public final native d(Landroid/view/ViewGroup;)Lg0/b0;
.end method

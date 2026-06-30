.class public Lcom/reddit/frontpage/MainActivity;
.super Le/k;
.source "Dex2C"


# static fields
.field public static L:Ljavax/net/ssl/SSLSocketFactory;

.field public static M:LQ0/r;

.field private static final short:[S


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/TextView;

.field public E:Lcom/google/android/material/textfield/TextInputEditText;

.field public F:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public G:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public H:Lcom/google/android/material/slider/Slider;

.field public I:Landroid/widget/TextView;

.field public J:Lcom/google/android/material/button/MaterialButton;

.field public volatile K:Z

.field public y:Le/h;

.field public z:Landroid/widget/ProgressBar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x52

    const-class v1, Lcom/reddit/frontpage/MainActivity;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_82_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le/k;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/reddit/frontpage/MainActivity;->K:Z

    return-void
.end method

.method public static native A(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native B(Ljava/net/URL;)Ljava/net/HttpURLConnection;
.end method

.method public static native C(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native E(Ljava/io/InputStream;)Ljava/lang/String;
.end method

.method public static native I(Ljava/lang/String;)Z
.end method

.method public static native r(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native t(Ljava/io/File;)Ljava/lang/String;
.end method

.method public static native v(J)Ljava/lang/String;
.end method

.method public static native w(D)Ljava/lang/String;
.end method

.method public static native z()V
.end method

.method public static native ۟۠ۡۤ۠()[S
.end method

.method public static native ۠ۧۧ۟(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native D(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public final native F()V
.end method

.method public final varargs native G([Ljava/lang/String;)I
.end method

.method public final native H(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public final native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native s()Ljava/lang/String;
.end method

.method public final native u(Ljava/lang/String;Ljava/io/File;)LQ0/j;
.end method

.method public final native x()Ljava/lang/String;
.end method

.method public final native y()V
.end method

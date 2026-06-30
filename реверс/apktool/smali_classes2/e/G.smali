.class public Le/G;
.super Ljava/lang/Object;
.source "Dex2C"


# static fields
.field public static final b:[Ljava/lang/Class;

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[Ljava/lang/String;

.field public static final h:Lq/j;

.field private static final short:[S


# instance fields
.field public final a:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x5a

    const-class v1, Le/G;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_90_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Le/G;->a:[Ljava/lang/Object;

    return-void
.end method

.method public static native ۟۠ۢۥۡ()[S
.end method


# virtual methods
.method public native a(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/o;
.end method

.method public native b(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/q;
.end method

.method public native c(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/r;
.end method

.method public native d(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/F;
.end method

.method public native e(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/e0;
.end method

.method public final native f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
.end method

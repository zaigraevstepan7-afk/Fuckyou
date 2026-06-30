.class public final LM0/q;
.super Ljava/lang/Object;
.source "Dex2C"


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:LM0/r;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2c

    const-class v1, LM0/q;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_44_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LM0/r;LN/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LM0/q;->a:Landroid/util/SparseArray;

    iput-object p1, p0, LM0/q;->b:LM0/r;

    invoke-static {p2}, LG/ۧۡ۠ۡ;->۟ۡۢۨۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result p2

    iput p2, p0, LM0/q;->c:I

    const/16 p2, 0x34

    invoke-static {p1, p2, v0}, Lr/۠ۨۦۢ;->ۢۧ۠ۥ(Ljava/lang/Object;II)I

    move-result p1

    iput p1, p0, LM0/q;->d:I

    return-void
.end method

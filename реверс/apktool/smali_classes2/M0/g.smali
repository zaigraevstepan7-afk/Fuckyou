.class public final LM0/g;
.super LI0/g;
.source "Dex2C"


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x22

    const-class v1, LM0/g;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_34_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(LI0/m;Landroid/graphics/RectF;)V
    .locals 0

    invoke-direct {p0, p1}, LI0/g;-><init>(LI0/m;)V

    iput-object p2, p0, LM0/g;->r:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(LM0/g;)V
    .locals 0

    invoke-direct {p0, p1}, LI0/g;-><init>(LI0/g;)V

    invoke-static {p1}, LU/۟ۦ۠ۨۨ;->۠ۡۥ۟(Ljava/lang/Object;)Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, LM0/g;->r:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final native newDrawable()Landroid/graphics/drawable/Drawable;
.end method

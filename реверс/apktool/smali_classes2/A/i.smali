.class public final LA/i;
.super LV/b;
.source "Dex2C"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LA/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:Landroid/util/SparseArray;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    const-class v1, LA/i;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_8_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 5

    invoke-direct {p0, p1, p2}, LV/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    invoke-static {p1}, Ll0/ۤ۟ۨۧ;->ۣۡۦ۠(Ljava/lang/Object;)I

    move-result v0

    new-array v1, v0, [I

    invoke-static {p1, v1}, LM0/۟ۧ۠ۢۥ;->ۣۣۥۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ld0/ۡۨ;->ۣۨۤۢ(Ljava/lang/Object;Ljava/lang/Object;)[Landroid/os/Parcelable;

    move-result-object p1

    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2, v0}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p2, p0, LA/i;->c:Landroid/util/SparseArray;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v0, :cond_0

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۤۦۦۦ(Ljava/lang/Object;)Landroid/util/SparseArray;

    move-result-object v2

    aget v3, v1, p2

    aget-object v4, p1, p2

    invoke-static {v2, v3, v4}, LC/ۣ۟ۦۨ;->۟ۦۡۤۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final native writeToParcel(Landroid/os/Parcel;I)V
.end method

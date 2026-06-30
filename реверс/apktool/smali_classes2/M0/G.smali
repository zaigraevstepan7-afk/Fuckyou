.class public final LM0/G;
.super LV/b;
.source "Dex2C"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LM0/G;",
            ">;"
        }
    .end annotation
.end field

.field private static final short:[S


# instance fields
.field public c:Ljava/lang/CharSequence;

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1a

    const-class v1, LM0/G;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_26_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LV/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    invoke-static {}, Lcom/google/android/material/internal/ۤ۟ۦۦ;->ۣۧۤۧ()Landroid/os/Parcelable$Creator;

    move-result-object p2

    invoke-static {p2, p1}, Lh0/۟۠ۤۡۦ;->ۧۢۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    iput-object p2, p0, LM0/G;->c:Ljava/lang/CharSequence;

    invoke-static {p1}, Ll0/ۤ۟ۨۧ;->ۣۡۦ۠(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, LM0/G;->d:Z

    return-void
.end method

.method public static native ۣۣۨۤ()[S
.end method


# virtual methods
.method public final native toString()Ljava/lang/String;
.end method

.method public final native writeToParcel(Landroid/os/Parcel;I)V
.end method

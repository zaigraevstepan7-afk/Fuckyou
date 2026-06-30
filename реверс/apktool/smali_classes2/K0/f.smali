.class public final LK0/f;
.super Landroid/view/View$BaseSavedState;
.source "Dex2C"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LK0/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:F

.field public b:F

.field public c:Ljava/util/ArrayList;

.field public d:F

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x11

    const-class v1, LK0/f;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_17_00(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final native writeToParcel(Landroid/os/Parcel;I)V
.end method

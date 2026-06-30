.class public final Le/N;
.super LT/m;
.source "Dex2C"

# interfaces
.implements Ll/d;


# static fields
.field public static final N:Landroid/view/animation/AccelerateInterpolator;

.field public static final O:Landroid/view/animation/DecelerateInterpolator;

.field private static final short:[S


# instance fields
.field public A:Z

.field public final B:Ljava/util/ArrayList;

.field public C:I

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Lj/j;

.field public I:Z

.field public J:Z

.field public final K:Le/L;

.field public final L:Le/L;

.field public final M:LA/b;

.field public p:Landroid/content/Context;

.field public q:Landroid/content/Context;

.field public r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public s:Landroidx/appcompat/widget/ActionBarContainer;

.field public t:Ll/o0;

.field public u:Landroidx/appcompat/widget/ActionBarContextView;

.field public final v:Landroid/view/View;

.field public w:Z

.field public x:Le/M;

.field public y:Le/M;

.field public z:LC0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x61

    const-class v1, Le/N;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_97_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/N;->B:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Le/N;->C:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/N;->D:Z

    iput-boolean v1, p0, Le/N;->G:Z

    new-instance v2, Le/L;

    invoke-direct {v2, p0, v0}, Le/L;-><init>(Le/N;I)V

    iput-object v2, p0, Le/N;->K:Le/L;

    new-instance v0, Le/L;

    invoke-direct {v0, p0, v1}, Le/L;-><init>(Le/N;I)V

    iput-object v0, p0, Le/N;->L:Le/L;

    new-instance v0, LA/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/N;->M:LA/b;

    invoke-static {p1}, Lp0/ۣۧۨۥ;->ۧۨۤۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, LW/۟ۡۤۡ;->۟۟ۢ۟۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-static {p0, p1}, Li0/۟۟ۤۦۤ;->ۣ۟ۤۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    invoke-static {p1, p2}, Lcom/google/android/material/snackbar/ۥۤ۟ۢ;->۟ۢۥۤۧ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Le/N;->v:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/N;->B:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Le/N;->C:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/N;->D:Z

    iput-boolean v1, p0, Le/N;->G:Z

    new-instance v2, Le/L;

    invoke-direct {v2, p0, v0}, Le/L;-><init>(Le/N;I)V

    iput-object v2, p0, Le/N;->K:Le/L;

    new-instance v0, Le/L;

    invoke-direct {v0, p0, v1}, Le/L;-><init>(Le/N;I)V

    iput-object v0, p0, Le/N;->L:Le/L;

    new-instance v0, LA/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p0}, LA/b;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Le/N;->M:LA/b;

    invoke-static {p1}, Ld0/ۡۨ;->ۦ۠ۨۧ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, LW/۟ۡۤۡ;->۟۟ۢ۟۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-static {p0, p1}, Li0/۟۟ۤۦۤ;->ۣ۟ۤۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static native ۟ۦۡۨۡ()[S
.end method

.method public static native ۥۣۧۨ(Ljava/lang/Object;)I
.end method


# virtual methods
.method public final native q0(Z)V
.end method

.method public final native r0()Landroid/content/Context;
.end method

.method public final native s0(Landroid/view/View;)V
.end method

.method public final native t0(Z)V
.end method

.method public final native u0(Z)V
.end method

.method public final native v0(Z)V
.end method

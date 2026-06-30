.class public final Le/D;
.super Le/r;
.source "Dex2C"

# interfaces
.implements Lk/k;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final h0:Lq/j;

.field public static final i0:[I

.field public static final j0:Z

.field private static final short:[S


# instance fields
.field public A:Landroid/view/ViewGroup;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/view/View;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:[Le/C;

.field public M:Le/C;

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Landroid/content/res/Configuration;

.field public final S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:Le/z;

.field public X:Le/z;

.field public Y:Z

.field public Z:I

.field public final a0:Le/s;

.field public b0:Z

.field public c0:Landroid/graphics/Rect;

.field public d0:Landroid/graphics/Rect;

.field public e0:Le/G;

.field public f0:Landroid/window/OnBackInvokedDispatcher;

.field public g0:Landroid/window/OnBackInvokedCallback;

.field public final j:Ljava/lang/Object;

.field public final k:Landroid/content/Context;

.field public l:Landroid/view/Window;

.field public m:Le/y;

.field public final n:Ljava/lang/Object;

.field public o:Le/N;

.field public p:Lj/h;

.field public q:Ljava/lang/CharSequence;

.field public r:Ll/n0;

.field public s:Le/t;

.field public t:Le/t;

.field public u:Lj/a;

.field public v:Landroidx/appcompat/widget/ActionBarContextView;

.field public w:Landroid/widget/PopupWindow;

.field public x:Le/s;

.field public y:LN/a0;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x57

    const-class v1, Le/D;

    invoke-static {v0, v1}, LZeninCPP0/ZLoader;->registerNativesForClass(ILjava/lang/Class;)V

    invoke-static {v1}, LZeninCPP0/hidden/Hidden0;->special_clinit_87_00(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Le/l;Ljava/lang/Object;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le/D;->y:LN/a0;

    const/16 v1, -0x64

    iput v1, p0, Le/D;->S:I

    new-instance v2, Le/s;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Le/s;-><init>(Le/D;I)V

    iput-object v2, p0, Le/D;->a0:Le/s;

    iput-object p1, p0, Le/D;->k:Landroid/content/Context;

    iput-object p3, p0, Le/D;->n:Ljava/lang/Object;

    iput-object p4, p0, Le/D;->j:Ljava/lang/Object;

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    instance-of p3, p1, Le/k;

    if-eqz p3, :cond_0

    move-object v0, p1

    check-cast v0, Le/k;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-static {p1}, LT0/ۣۣ۟ۤ۠;->ۧ۟ۤ۟(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Lm0/ۣ۟ۧۦ۠;->ۣ۟ۡۧ۠(Ljava/lang/Object;)Le/r;

    move-result-object p1

    check-cast p1, Le/D;

    invoke-static {p1}, LT0/۟ۥ۟ۥۡ;->۟ۢۨۨ۟(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Le/D;->S:I

    :cond_2
    invoke-static {p0}, LT0/۟ۥ۟ۥۡ;->۟ۢۨۨ۟(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_3

    invoke-static {}, Lm0/ۣ۟ۧۦ۠;->ۡ۠۠۟()Lq/j;

    move-result-object p1

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۦۦ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟۟ۥۦۣ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p3

    invoke-static {p3}, LR/ۣ۟ۤ۟ۧ;->۟۠ۡۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, La0/ۣۣ۟ۡ۠;->۟ۡۢۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_3

    invoke-static {p3}, Lz/۟ۤۥۣۨ;->ۢۨ۠ۢ(Ljava/lang/Object;)I

    move-result p3

    iput p3, p0, Le/D;->S:I

    invoke-static {p0}, Landroidx/constraintlayout/helper/widget/ۡ۟ۧۧ;->۟ۥۦۦ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Landroidx/versionedparcelable/۟۟ۥۧۦ;->۟۟ۥۦۣ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p3

    invoke-static {p3}, LR/ۣ۟ۤ۟ۧ;->۟۠ۡۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, LH0/ۦۥۣۥ;->۟۟ۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {p0, p2}, Lk0/ۨ۟۟ۦ;->ۣ۟ۤۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    invoke-static {}, Landroidx/startup/ۢۦ۟ۥ;->ۤۨۦۢ()V

    return-void
.end method

.method public static native m(Landroid/content/Context;)LJ/e;
.end method

.method public static native q(Landroid/content/Context;ILJ/e;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
.end method

.method public static native y(Landroid/content/res/Configuration;)LJ/e;
.end method

.method public static native ۟ۡۥۢۡ(Ljava/lang/Object;)I
.end method

.method public static native ۟ۤ۟ۡ۠()[S
.end method


# virtual methods
.method public final native A()V
.end method

.method public final native B(I)V
.end method

.method public final native C(Landroid/content/Context;I)I
.end method

.method public final native D()Z
.end method

.method public final native E(Le/C;Landroid/view/KeyEvent;)V
.end method

.method public final native F(Le/C;ILandroid/view/KeyEvent;)Z
.end method

.method public final native G(Le/C;Landroid/view/KeyEvent;)Z
.end method

.method public final native H()V
.end method

.method public final native I()V
.end method

.method public final native a()V
.end method

.method public final native c()V
.end method

.method public final native d()V
.end method

.method public final native f(I)Z
.end method

.method public final native g(I)V
.end method

.method public final native h(Landroid/view/View;)V
.end method

.method public final native i(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public final native j(Ljava/lang/CharSequence;)V
.end method

.method public final native k(ZZ)Z
.end method

.method public final native l(Landroid/view/Window;)V
.end method

.method public final native n(ILe/C;Lk/m;)V
.end method

.method public final native o(Lk/m;)V
.end method

.method public final native onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end method

.method public final native onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end method

.method public final native p(Le/C;Z)V
.end method

.method public final native r(Landroid/view/KeyEvent;)Z
.end method

.method public final native s(I)V
.end method

.method public final native t()V
.end method

.method public final native u()V
.end method

.method public final native v(Lk/m;)V
.end method

.method public final native w(Lk/m;Landroid/view/MenuItem;)Z
.end method

.method public final native x(Landroid/content/Context;)Landroidx/fragment/app/g;
.end method

.method public final native z(I)Le/C;
.end method

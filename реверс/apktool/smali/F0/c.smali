.class public final LF0/c;
.super LA0/e;
.source "SourceFile"


# instance fields
.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Landroid/text/TextPaint;

.field public final synthetic m:LA0/e;

.field public final synthetic n:LF0/d;


# direct methods
.method public constructor <init>(LF0/d;Landroid/content/Context;Landroid/text/TextPaint;LA0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF0/c;->n:LF0/d;

    .line 5
    .line 6
    iput-object p2, p0, LF0/c;->k:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, LF0/c;->l:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, LF0/c;->m:LA0/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final k0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF0/c;->m:LA0/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LA0/e;->k0(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l0(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LF0/c;->l:Landroid/text/TextPaint;

    .line 2
    .line 3
    iget-object v1, p0, LF0/c;->n:LF0/d;

    .line 4
    .line 5
    iget-object v2, p0, LF0/c;->k:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1, v2, v0, p1}, LF0/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LF0/c;->m:LA0/e;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, LA0/e;->l0(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

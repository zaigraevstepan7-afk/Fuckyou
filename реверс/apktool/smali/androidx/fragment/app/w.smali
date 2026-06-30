.class public final Landroidx/fragment/app/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Landroidx/fragment/app/H;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/w;->a:Landroidx/fragment/app/H;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/4 v4, -0x1

    .line 2
    const-class v5, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v0, Landroidx/fragment/app/w;->a:Landroidx/fragment/app/H;

    if-eqz v5, :cond_0

    .line 3
    new-instance v1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {v1, v2, v3, v6}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/H;)V

    return-object v1

    .line 4
    :cond_0
    const-string v5, "fragment"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x0

    if-nez v1, :cond_2

    :cond_1
    :goto_0
    move-object/from16 p2, v5

    goto/16 :goto_a

    .line 5
    :cond_2
    const-string v1, "class"

    invoke-interface {v3, v5, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    sget-object v7, LZ/a;->a:[I

    invoke-virtual {v2, v3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v1, :cond_3

    .line 7
    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_3
    const/4 v9, 0x1

    .line 8
    invoke-virtual {v7, v9, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    const/4 v11, 0x2

    .line 9
    invoke-virtual {v7, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 10
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    .line 12
    :try_start_0
    invoke-static {v7, v1}, Landroidx/fragment/app/B;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 13
    const-class v13, Landroidx/fragment/app/r;

    invoke-virtual {v13, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v8

    :cond_5
    if-ne v8, v4, :cond_7

    if-ne v10, v4, :cond_7

    if-eqz v12, :cond_6

    goto :goto_2

    .line 15
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    :goto_2
    if-eq v10, v4, :cond_8

    .line 16
    invoke-virtual {v6, v10}, Landroidx/fragment/app/H;->A(I)Landroidx/fragment/app/r;

    move-result-object v7

    goto :goto_3

    :cond_8
    move-object v7, v5

    :goto_3
    if-nez v7, :cond_d

    if-eqz v12, :cond_d

    .line 17
    iget-object v7, v6, Landroidx/fragment/app/H;->c:LA/k;

    .line 18
    iget-object v13, v7, LA/k;->c:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    sub-int/2addr v14, v9

    :goto_4
    if-ltz v14, :cond_a

    .line 20
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/fragment/app/r;

    move-object/from16 p2, v5

    if-eqz v15, :cond_9

    .line 21
    iget-object v5, v15, Landroidx/fragment/app/r;->x:Ljava/lang/String;

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    move-object v7, v15

    goto :goto_5

    :cond_9
    add-int/2addr v14, v4

    move-object/from16 v5, p2

    goto :goto_4

    :cond_a
    move-object/from16 p2, v5

    .line 22
    iget-object v5, v7, LA/k;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    .line 23
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/M;

    if-eqz v7, :cond_b

    .line 24
    iget-object v7, v7, Landroidx/fragment/app/M;->c:Landroidx/fragment/app/r;

    iget-object v13, v7, Landroidx/fragment/app/r;->x:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_5

    :cond_c
    move-object/from16 v7, p2

    goto :goto_5

    :cond_d
    move-object/from16 p2, v5

    :goto_5
    if-nez v7, :cond_e

    if-eq v8, v4, :cond_e

    .line 25
    invoke-virtual {v6, v8}, Landroidx/fragment/app/H;->A(I)Landroidx/fragment/app/r;

    move-result-object v7

    .line 26
    :cond_e
    const-string v4, "Fragment "

    const-string v5, "FragmentManager"

    if-nez v7, :cond_12

    .line 27
    invoke-virtual {v6}, Landroidx/fragment/app/H;->C()Landroidx/fragment/app/B;

    move-result-object v3

    .line 28
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    invoke-virtual {v3, v1}, Landroidx/fragment/app/B;->a(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v7

    .line 30
    iput-boolean v9, v7, Landroidx/fragment/app/r;->m:Z

    if-eqz v10, :cond_f

    move v2, v10

    goto :goto_6

    :cond_f
    move v2, v8

    .line 31
    :goto_6
    iput v2, v7, Landroidx/fragment/app/r;->v:I

    .line 32
    iput v8, v7, Landroidx/fragment/app/r;->w:I

    .line 33
    iput-object v12, v7, Landroidx/fragment/app/r;->x:Ljava/lang/String;

    .line 34
    iput-boolean v9, v7, Landroidx/fragment/app/r;->n:Z

    .line 35
    iput-object v6, v7, Landroidx/fragment/app/r;->r:Landroidx/fragment/app/H;

    .line 36
    iget-object v2, v6, Landroidx/fragment/app/H;->t:Landroidx/fragment/app/t;

    .line 37
    iput-object v2, v7, Landroidx/fragment/app/r;->s:Landroidx/fragment/app/t;

    .line 38
    iget-object v3, v2, Landroidx/fragment/app/t;->q:Le/k;

    .line 39
    iput-boolean v9, v7, Landroidx/fragment/app/r;->C:Z

    if-nez v2, :cond_10

    move-object/from16 v2, p2

    goto :goto_7

    .line 40
    :cond_10
    iget-object v2, v2, Landroidx/fragment/app/t;->p:Le/k;

    :goto_7
    if-eqz v2, :cond_11

    .line 41
    iput-boolean v9, v7, Landroidx/fragment/app/r;->C:Z

    .line 42
    :cond_11
    invoke-virtual {v6, v7}, Landroidx/fragment/app/H;->a(Landroidx/fragment/app/r;)Landroidx/fragment/app/M;

    move-result-object v2

    .line 43
    invoke-static {v11}, Landroidx/fragment/app/H;->F(I)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 46
    invoke-static {v5, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    .line 47
    :cond_12
    iget-boolean v2, v7, Landroidx/fragment/app/r;->n:Z

    if-nez v2, :cond_19

    .line 48
    iput-boolean v9, v7, Landroidx/fragment/app/r;->n:Z

    .line 49
    iput-object v6, v7, Landroidx/fragment/app/r;->r:Landroidx/fragment/app/H;

    .line 50
    iget-object v2, v6, Landroidx/fragment/app/H;->t:Landroidx/fragment/app/t;

    .line 51
    iput-object v2, v7, Landroidx/fragment/app/r;->s:Landroidx/fragment/app/t;

    .line 52
    iget-object v3, v2, Landroidx/fragment/app/t;->q:Le/k;

    .line 53
    iput-boolean v9, v7, Landroidx/fragment/app/r;->C:Z

    if-nez v2, :cond_13

    move-object/from16 v2, p2

    goto :goto_8

    .line 54
    :cond_13
    iget-object v2, v2, Landroidx/fragment/app/t;->p:Le/k;

    :goto_8
    if-eqz v2, :cond_14

    .line 55
    iput-boolean v9, v7, Landroidx/fragment/app/r;->C:Z

    .line 56
    :cond_14
    invoke-virtual {v6, v7}, Landroidx/fragment/app/H;->f(Landroidx/fragment/app/r;)Landroidx/fragment/app/M;

    move-result-object v2

    .line 57
    invoke-static {v11}, Landroidx/fragment/app/H;->F(I)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Retained Fragment "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-static {v5, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    :cond_15
    :goto_9
    move-object/from16 v3, p1

    check-cast v3, Landroid/view/ViewGroup;

    sget-object v5, La0/d;->a:La0/c;

    .line 62
    new-instance v5, La0/a;

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " to container "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 64
    invoke-direct {v5, v7, v6}, La0/a;-><init>(Landroidx/fragment/app/r;Ljava/lang/String;)V

    .line 65
    invoke-static {v5}, La0/d;->b(La0/a;)V

    .line 66
    invoke-static {v7}, La0/d;->a(Landroidx/fragment/app/r;)La0/c;

    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    iput-object v3, v7, Landroidx/fragment/app/r;->D:Landroid/view/ViewGroup;

    .line 69
    invoke-virtual {v2}, Landroidx/fragment/app/M;->k()V

    .line 70
    invoke-virtual {v2}, Landroidx/fragment/app/M;->j()V

    .line 71
    iget-object v3, v7, Landroidx/fragment/app/r;->E:Landroid/view/View;

    if-eqz v3, :cond_18

    if-eqz v10, :cond_16

    .line 72
    invoke-virtual {v3, v10}, Landroid/view/View;->setId(I)V

    .line 73
    :cond_16
    iget-object v1, v7, Landroidx/fragment/app/r;->E:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_17

    .line 74
    iget-object v1, v7, Landroidx/fragment/app/r;->E:Landroid/view/View;

    invoke-virtual {v1, v12}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 75
    :cond_17
    iget-object v1, v7, Landroidx/fragment/app/r;->E:Landroid/view/View;

    new-instance v3, Landroidx/fragment/app/v;

    invoke-direct {v3, v0, v2}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/w;Landroidx/fragment/app/M;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 76
    iget-object v1, v7, Landroidx/fragment/app/r;->E:Landroid/view/View;

    return-object v1

    .line 77
    :cond_18
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " did not create a view."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 78
    :cond_19
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Duplicate id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tag "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", or parent id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with another fragment for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_a
    return-object p2
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/w;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

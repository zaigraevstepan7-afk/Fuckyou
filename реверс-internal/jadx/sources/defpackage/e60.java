package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements cl {
    public final File a;
    public final fo1 b;
    public final p7 c;
    public final AtomicBoolean d;
    public final uy0 e;

    public e60(File file, fo1 fo1Var, p7 p7Var) {
        fo1Var.getClass();
        this.a = file;
        this.b = fo1Var;
        this.c = p7Var;
        this.d = new AtomicBoolean(false);
        this.e = new uy0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:34:0x006f, B:43:0x0080, B:42:0x007d, B:39:0x0078), top: B:50:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [e60] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [yu] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yu yuVar, ls lsVar) throws Throwable {
        c60 c60Var;
        ?? F;
        Throwable th;
        a60 a60Var;
        ?? r5;
        if (lsVar instanceof c60) {
            c60Var = (c60) lsVar;
            int i = c60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c60Var.l = i - Integer.MIN_VALUE;
            } else {
                c60Var = new c60(this, lsVar);
            }
        }
        Object obj = c60Var.j;
        int i2 = c60Var.l;
        uy0 uy0Var = this.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = c60Var.h;
                a60Var = c60Var.i;
                try {
                    xc.G(obj);
                    r5 = this;
                    try {
                        a60Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r5 != 0) {
                        uy0Var.h(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        a60Var.close();
                    } catch (Throwable th4) {
                        al.h(th, th4);
                    }
                    throw th;
                }
            }
            xc.G(obj);
            if (this.d.get()) {
                yc.l("StorageConnection has already been disposed.");
                return null;
            }
            F = uy0Var.f();
            try {
                a60 a60Var2 = new a60(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) F);
                    c60Var.i = a60Var2;
                    c60Var.h = F;
                    c60Var.l = 1;
                    Object objF = yuVar.f(a60Var2, boolValueOf, c60Var);
                    wt wtVar = wt.e;
                    if (objF == wtVar) {
                        return wtVar;
                    }
                    obj = objF;
                    r5 = F == true ? 1 : 0;
                    a60Var = a60Var2;
                    a60Var.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    this = F == true ? 1 : 0;
                    a60Var = a60Var2;
                    a60Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (F != 0) {
                    uy0Var.h(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            F = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[Catch: all -> 0x0102, IOException -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:42:0x00ca, B:44:0x00d0, B:46:0x00e3, B:47:0x0101, B:54:0x010f, B:66:0x0126, B:68:0x012c, B:69:0x012f, B:61:0x011e, B:60:0x011b), top: B:76:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: all -> 0x0102, IOException -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:42:0x00ca, B:44:0x00d0, B:46:0x00e3, B:47:0x0101, B:54:0x010f, B:66:0x0126, B:68:0x012c, B:69:0x012f, B:61:0x011e, B:60:0x011b), top: B:76:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4, types: [wa0] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [d60, java.lang.Object, ls] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, uy0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lv lvVar, ls lsVar) throws Throwable {
        ?? d60Var;
        ?? r11;
        ?? r10;
        ?? r9;
        File file;
        g60 g60Var;
        Throwable th;
        g60 g60Var2;
        ?? r1;
        File file2;
        if (lsVar instanceof d60) {
            d60 d60Var2 = (d60) lsVar;
            int i = d60Var2.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                d60Var2.m = i - Integer.MIN_VALUE;
                d60Var = d60Var2;
            } else {
                d60Var = new d60(this, lsVar);
            }
        }
        Object obj = d60Var.k;
        int i2 = d60Var.m;
        File file3 = this.a;
        wt wtVar = wt.e;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    try {
                        if (i2 == 0) {
                            xc.G(obj);
                            if (this.d.get()) {
                                yc.l("StorageConnection has already been disposed.");
                                return null;
                            }
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            d60Var.h = lvVar;
                            ?? r92 = this.e;
                            d60Var.i = r92;
                            d60Var.m = 1;
                            Object objE = r92.e(d60Var);
                            r9 = r92;
                            r10 = lvVar;
                            if (objE != wtVar) {
                            }
                            return wtVar;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g60Var2 = d60Var.j;
                            File file4 = (File) d60Var.i;
                            sy0 sy0Var = (sy0) d60Var.h;
                            try {
                                xc.G(obj);
                                r1 = sy0Var;
                                file2 = file4;
                                try {
                                    g60Var2.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ((uy0) r1).h(null);
                                return t32.a;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    g60Var2.close();
                                } catch (Throwable th5) {
                                    al.h(th, th5);
                                }
                                throw th;
                            }
                        }
                        sy0 sy0Var2 = (sy0) d60Var.i;
                        wa0 wa0Var = (wa0) d60Var.h;
                        xc.G(obj);
                        r9 = sy0Var2;
                        r10 = wa0Var;
                        d60Var.h = r9;
                        d60Var.i = file;
                        d60Var.j = g60Var;
                        d60Var.m = 2;
                        if (r10.h(g60Var, d60Var) != wtVar) {
                            r1 = r9;
                            file2 = file;
                            g60Var2 = g60Var;
                            g60Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                        return wtVar;
                    } catch (Throwable th6) {
                        th = th6;
                        g60Var2 = g60Var;
                        g60Var2.close();
                        throw th;
                    }
                    g60Var = new g60(file);
                } catch (IOException e) {
                    e = e;
                    r11 = file;
                    if (!r11.exists()) {
                        throw e;
                    }
                    r11.delete();
                    throw e;
                }
                file = new File(file3.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                d60Var = r9;
                th = th7;
                ((uy0) d60Var).h(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r11 = lvVar;
        }
    }

    @Override // defpackage.cl
    public final void close() throws Throwable {
        this.d.set(true);
        this.c.a();
    }
}

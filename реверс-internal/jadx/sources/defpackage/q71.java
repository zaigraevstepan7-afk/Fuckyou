package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q71 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q71(Object obj, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((q71) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new q71((s71) obj2, ksVar, 0);
            default:
                return new q71((String[]) obj2, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws IOException {
        String str;
        switch (this.i) {
            case 0:
                xc.G(obj);
                s71 s71Var = (s71) this.j;
                Context context = s71Var.b;
                uk1 uk1Var = s71Var.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = uk1Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        ez1.a();
                        return null;
                    }
                    str = "textview";
                }
                c81.n();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(c81.j(context.getPackageName(), str).build());
                s71Var.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            default:
                xc.G(obj);
                Process processExec = Runtime.getRuntime().exec(l91.h);
                OutputStream outputStream = processExec.getOutputStream();
                for (String str2 : (String[]) this.j) {
                    byte[] bytes = (str2 + "\n").getBytes(ak.a);
                    bytes.getClass();
                    outputStream.write(bytes);
                }
                byte[] bytes2 = "exit\n".getBytes(ak.a);
                bytes2.getClass();
                outputStream.write(bytes2);
                outputStream.flush();
                outputStream.close();
                return new Integer(processExec.waitFor());
        }
    }
}

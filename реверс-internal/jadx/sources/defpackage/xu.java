package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xu extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu(int i, ks ksVar, int i2) {
        super(i, ksVar);
        this.i = i2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((xu) o((ks) obj2, (ms1) obj)).q(t32Var);
            case 1:
                return ((xu) o((ks) obj2, (gc1) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((xu) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((xu) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((xu) o((ks) obj2, (wn1) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                xu xuVar = new xu(2, ksVar, 0);
                xuVar.j = obj;
                return xuVar;
            case 1:
                xu xuVar2 = new xu(2, ksVar, 1);
                xuVar2.j = obj;
                return xuVar2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xu xuVar3 = new xu(2, ksVar, 2);
                xuVar3.j = obj;
                return xuVar3;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                xu xuVar4 = new xu(2, ksVar, 3);
                xuVar4.j = obj;
                return xuVar4;
            default:
                xu xuVar5 = new xu(2, ksVar, 4);
                xuVar5.j = obj;
                return xuVar5;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Object oe1Var;
        Object oe1Var2;
        switch (this.i) {
            case 0:
                xc.G(obj);
                return Boolean.valueOf(!(((ms1) this.j) instanceof n60));
            case 1:
                xc.G(obj);
                return Boolean.valueOf(((gc1) this.j) == gc1.e);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xc.G(obj);
                try {
                    Process processExec = Runtime.getRuntime().exec(l91.h);
                    OutputStream outputStream = processExec.getOutputStream();
                    Charset charset = ak.a;
                    byte[] bytes = "echo ok\n".getBytes(charset);
                    bytes.getClass();
                    outputStream.write(bytes);
                    byte[] bytes2 = "exit\n".getBytes(charset);
                    bytes2.getClass();
                    outputStream.write(bytes2);
                    outputStream.flush();
                    outputStream.close();
                    oe1Var = Boolean.valueOf(processExec.waitFor() == 0);
                    break;
                } catch (Throwable th) {
                    oe1Var = new oe1(th);
                }
                return oe1Var instanceof oe1 ? Boolean.FALSE : oe1Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                xc.G(obj);
                try {
                    Process processStart = new ProcessBuilder(l91.h, "-c", "pidof com.axlebolt.standoff2").start();
                    InputStream inputStream = processStart.getInputStream();
                    inputStream.getClass();
                    String line = new BufferedReader(new InputStreamReader(inputStream, ak.a), 8192).readLine();
                    processStart.waitFor();
                    oe1Var2 = Boolean.valueOf(!(line == null || line.length() == 0));
                    break;
                } catch (Throwable th2) {
                    oe1Var2 = new oe1(th2);
                }
                return oe1Var2 instanceof oe1 ? Boolean.FALSE : oe1Var2;
            default:
                wn1 wn1Var = (wn1) this.j;
                xc.G(obj);
                return Boolean.valueOf(wn1Var != wn1.e);
        }
    }
}

package defpackage;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.reddit.frontpage.MainActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y4(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, ly, InvocationTargetException {
        switch (this.e) {
            case 0:
                wi0.w((a5) this.f, (LongSparseArray) this.g);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f;
                mainActivity.e.a(new sn((n11) this.g, mainActivity));
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((xi) this.f).H((ed0) this.g);
                return;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((zb) this.f).k((Typeface) this.g);
                return;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                InputStream inputStream = (InputStream) this.f;
                StringBuilder sb = (StringBuilder) this.g;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    try {
                        for (String str : new jr(new up0(0, bufferedReader))) {
                            synchronized (sb) {
                                try {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(str);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            el.p(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                v92 v92Var = (v92) this.f;
                zo0 zo0Var = (zo0) this.g;
                if (v92Var.g) {
                    return;
                }
                v92Var.h = zo0Var;
                zo0Var.a(v92Var);
                return;
        }
    }
}

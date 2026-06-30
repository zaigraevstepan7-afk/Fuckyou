package defpackage;

import android.support.v4.graphics.drawable.C0008;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0045;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0057;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.sidesheet.C0134;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq implements FileFilter {
    public final /* synthetic */ List a;

    public /* synthetic */ jq(List list) {
        this.a = list;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (C0055.m715(file)) {
            List listM513 = C0039.m513(this);
            if (!C0057.m753(listM513)) {
                Iterator itM1688 = C0134.m1688(listM513);
                while (C0090.m1167(itM1688)) {
                    String str = (String) C0008.m110(itM1688);
                    String strM1311 = C0102.m1311(file);
                    C0090.m1170(strM1311);
                    if (C0045.m600(strM1311, str, true)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}

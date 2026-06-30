package p007E;

import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import com.reddit.frontpage.ConfigsActivity;
import com.reddit.frontpage.MainActivity;
import com.reddit.frontpage.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.SSLSocketFactory;
import p031Q0.C0340n;
import p031Q0.RunnableC0328b;
import p031Q0.RunnableC0335i;
import p060e.ExecutorC0674p;

/* JADX INFO: renamed from: E.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0068n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f215c;

    public /* synthetic */ RunnableC0068n(Object obj, int i2, Object obj2) {
        this.f213a = i2;
        this.f214b = obj;
        this.f215c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Cursor cursorQuery;
        boolean zM1809x;
        int columnIndex;
        Object obj = this.f214b;
        Object obj2 = this.f215c;
        switch (this.f213a) {
            case 0:
                ((AbstractC0056b) obj).mo338i((Typeface) obj2);
                return;
            case 1:
                int i2 = ConfigsActivity.f2454H;
                ConfigsActivity configsActivity = (ConfigsActivity) obj;
                File file = new File(((C0340n) obj2).f970b);
                boolean zDelete = file.delete();
                boolean z2 = zDelete;
                if (!zDelete) {
                    StringBuilder sb = new StringBuilder("rm -f ");
                    sb.append(ConfigsActivity.m1799E(file.getAbsolutePath()));
                    z2 = configsActivity.m1807u(sb.toString()).f957a == 0 ? 1 : 0;
                }
                configsActivity.runOnUiThread(new RunnableC0328b(configsActivity, z2, 1));
                return;
            case 2:
                ConfigsActivity configsActivity2 = (ConfigsActivity) obj;
                ArrayList arrayList = configsActivity2.f2462y;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj2);
                configsActivity2.f2460F.f2846a.m1975b();
                boolean zIsEmpty = arrayList.isEmpty();
                configsActivity2.f2457C.setText(configsActivity2.getString(R.string.resc, Integer.valueOf(arrayList.size())));
                configsActivity2.f2456B.setVisibility(zIsEmpty ? 0 : 8);
                return;
            case 3:
                Uri uri = (Uri) obj2;
                int i3 = ConfigsActivity.f2454H;
                ConfigsActivity configsActivity3 = (ConfigsActivity) obj;
                Cursor cursor = null;
                string = null;
                string = null;
                string = null;
                String string = null;
                try {
                    cursorQuery = configsActivity3.getContentResolver().query(uri, null, null, null, null);
                    break;
                } catch (Exception unused) {
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                            string = cursorQuery.getString(columnIndex);
                            break;
                        } else if (cursorQuery != null) {
                        }
                    } catch (Exception unused2) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    cursorQuery.close();
                }
                if (TextUtils.isEmpty(string)) {
                    string = "config_" + System.currentTimeMillis() + ".cfg";
                }
                Locale locale = Locale.US;
                if (!string.toLowerCase(locale).endsWith(".cfg")) {
                    configsActivity3.runOnUiThread(new RunnableC0335i(configsActivity3, 1));
                    return;
                }
                String strM1798C = ConfigsActivity.m1798C(string);
                if (!strM1798C.toLowerCase(locale).endsWith(".cfg")) {
                    strM1798C = strM1798C.concat(".cfg");
                }
                File file2 = new File(configsActivity3.getCacheDir(), "cfg_import_" + System.currentTimeMillis() + ".tmp");
                try {
                } catch (Exception unused3) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    zM1809x = false;
                } catch (Throwable th3) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw th3;
                }
                if (!configsActivity3.m1805s(uri, file2)) {
                    throw new IOException("Copy from picker uri failed.");
                }
                if (!configsActivity3.m1806t()) {
                    throw new IOException("Unable to access configs directory.");
                }
                File fileM1800r = ConfigsActivity.m1800r(strM1798C);
                if (fileM1800r == null) {
                    throw new IOException("Invalid destination path.");
                }
                zM1809x = configsActivity3.m1809x(file2, fileM1800r);
                if (!zM1809x) {
                    throw new IOException("Move operation failed.");
                }
                if (file2.exists()) {
                    file2.delete();
                }
                configsActivity3.runOnUiThread(new RunnableC0328b(configsActivity3, zM1809x, 0));
                return;
            case 4:
                SSLSocketFactory sSLSocketFactory = MainActivity.f2464L;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                Exception exc = (Exception) obj2;
                mainActivity.m1824H("Error", exc.getMessage() == null ? exc.toString() : exc.getMessage());
                mainActivity.m1822F();
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                ExecutorC0674p executorC0674p = (ExecutorC0674p) obj;
                executorC0674p.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0674p.m1903a();
                }
        }
    }
}

package p018K;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.reddit.frontpage.ConfigsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p007E.AbstractC0056b;
import p031Q0.C0340n;

/* JADX INFO: renamed from: K.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0148d {

    /* JADX INFO: renamed from: a */
    public static final C0146b f464a;

    /* JADX WARN: Type inference failed for: r0v0, types: [K.b] */
    static {
        final int i2 = 0;
        f464a = new Comparator() { // from class: K.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        byte[] bArr = (byte[]) obj;
                        byte[] bArr2 = (byte[]) obj2;
                        if (bArr.length != bArr2.length) {
                            return bArr.length - bArr2.length;
                        }
                        for (int i3 = 0; i3 < bArr.length; i3++) {
                            byte b = bArr[i3];
                            byte b2 = bArr2[i3];
                            if (b != b2) {
                                return b - b2;
                            }
                        }
                        return 0;
                    default:
                        int i4 = ConfigsActivity.f2454H;
                        return Long.compare(((C0340n) obj2).f971c, ((C0340n) obj).f971c);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0154j m556a(Context context, C0149e c0149e) throws Throwable {
        Cursor cursor;
        C0147c c0147c;
        Cursor cursorQuery;
        Uri uriWithAppendedId;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c0149e.f466b;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) c0149e.f467c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0146b c0146b = f464a;
        Collections.sort(arrayList, c0146b);
        List listM332k = (List) c0149e.f470f;
        if (listM332k == null) {
            listM332k = AbstractC0056b.m332k(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursor = null;
            if (i2 >= listM332k.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM332k.get(i2));
            Collections.sort(arrayList2, c0146b);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C0154j(1, (C0155k[]) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        C0147c c0147c2 = Build.VERSION.SDK_INT < 24 ? new C0147c(context, uriBuild, 0) : new C0147c(context, uriBuild, 1);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) c0149e.f468d};
            switch (c0147c2.f462a) {
                case 0:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient = c0147c2.f463b;
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                c0147c = c0147c2;
                                try {
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    c0147c.m555a();
                                    throw th;
                                }
                            } else {
                                c0147c = c0147c2;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                            }
                            arrayList3.add(new C0155k(uriWithAppendedId, i5, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                            c0147c2 = c0147c;
                            break;
                        }
                    }
                    C0147c c0147c3 = c0147c2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    c0147c3.m555a();
                    return new C0154j(0, (C0155k[]) arrayList3.toArray(new C0155k[0]));
                default:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient2 = c0147c2.f463b;
                    if (contentProviderClient2 != null) {
                        try {
                            cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null) {
                        int columnIndex7 = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex22 = cursor.getColumnIndex("_id");
                        int columnIndex32 = cursor.getColumnIndex("file_id");
                        int columnIndex42 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex52 = cursor.getColumnIndex("font_weight");
                        int columnIndex62 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            break;
                        }
                    }
                    C0147c c0147c32 = c0147c2;
                    if (cursor != null) {
                    }
                    c0147c32.m555a();
                    return new C0154j(0, (C0155k[]) arrayList3.toArray(new C0155k[0]));
            }
        } catch (Throwable th2) {
            th = th2;
            c0147c = c0147c2;
        }
    }
}

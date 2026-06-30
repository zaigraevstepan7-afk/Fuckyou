package p024N;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p081o0.AbstractC1015a;

/* JADX INFO: renamed from: N.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0254d implements InterfaceC0252c, InterfaceC0256e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f796a;

    /* JADX INFO: renamed from: b */
    public Object f797b;

    /* JADX INFO: renamed from: c */
    public int f798c;

    /* JADX INFO: renamed from: d */
    public int f799d;

    /* JADX INFO: renamed from: e */
    public Object f800e;

    /* JADX INFO: renamed from: f */
    public Cloneable f801f;

    public /* synthetic */ C0254d() {
        this.f796a = 0;
    }

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: B */
    public void mo31B(int i2) {
        this.f799d = i2;
    }

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: a */
    public void mo36a(Bundle bundle) {
        this.f801f = bundle;
    }

    /* JADX INFO: renamed from: b */
    public void m818b(C0295x0 c0295x0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0269k0) it.next()).f834a.mo835c() & 8) != 0) {
                ((View) this.f800e).setTranslationY(AbstractC1015a.m2463c(this.f799d, 0, r3.f834a.mo834b()));
                return;
            }
        }
    }

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: e */
    public void mo40e(Uri uri) {
        this.f800e = uri;
    }

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: f */
    public int mo41f() {
        return this.f798c;
    }

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: l */
    public ClipData mo47l() {
        return (ClipData) this.f797b;
    }

    @Override // p024N.InterfaceC0252c
    /* JADX INFO: renamed from: n */
    public C0258f mo49n() {
        return new C0258f(new C0254d(this));
    }

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: s */
    public int mo54s() {
        return this.f799d;
    }

    public String toString() {
        String str;
        switch (this.f796a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f797b).getDescription());
                sb.append(", source=");
                int i2 = this.f798c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f799d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = (Uri) this.f800e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f801f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p024N.InterfaceC0256e
    /* JADX INFO: renamed from: y */
    public ContentInfo mo60y() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0254d(View view) {
        this.f796a = 2;
        this.f801f = new int[2];
        this.f800e = view;
    }

    public C0254d(C0254d c0254d) {
        this.f796a = 1;
        ClipData clipData = (ClipData) c0254d.f797b;
        clipData.getClass();
        this.f797b = clipData;
        int i2 = c0254d.f798c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.f798c = i2;
            int i3 = c0254d.f799d;
            if ((i3 & 1) == i3) {
                this.f799d = i3;
                this.f800e = (Uri) c0254d.f800e;
                this.f801f = (Bundle) c0254d.f801f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}

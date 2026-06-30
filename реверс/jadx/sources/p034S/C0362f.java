package p034S;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: S.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0362f implements InterfaceC0363g {

    /* JADX INFO: renamed from: a */
    public final InputContentInfo f1004a;

    public C0362f(Object obj) {
        this.f1004a = (InputContentInfo) obj;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: a */
    public final ClipDescription mo839a() {
        return this.f1004a.getDescription();
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: b */
    public final void mo840b() {
        this.f1004a.requestPermission();
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: c */
    public final Uri mo841c() {
        return this.f1004a.getLinkUri();
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: d */
    public final Object mo842d() {
        return this.f1004a;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: e */
    public final Uri mo843e() {
        return this.f1004a.getContentUri();
    }

    public C0362f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1004a = new InputContentInfo(uri, clipDescription, uri2);
    }
}

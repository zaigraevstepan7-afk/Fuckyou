package p016J;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: J.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0137i implements InterfaceC0135g {

    /* JADX INFO: renamed from: a */
    public final LocaleList f443a;

    public C0137i(Object obj) {
        this.f443a = AbstractC0136h.m523i(obj);
    }

    @Override // p016J.InterfaceC0135g
    /* JADX INFO: renamed from: a */
    public final Object mo513a() {
        return this.f443a;
    }

    @Override // p016J.InterfaceC0135g
    /* JADX INFO: renamed from: b */
    public final String mo514b() {
        return this.f443a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f443a.equals(((InterfaceC0135g) obj).mo513a());
    }

    @Override // p016J.InterfaceC0135g
    public final Locale get(int i2) {
        return this.f443a.get(i2);
    }

    public final int hashCode() {
        return this.f443a.hashCode();
    }

    @Override // p016J.InterfaceC0135g
    public final boolean isEmpty() {
        return this.f443a.isEmpty();
    }

    @Override // p016J.InterfaceC0135g
    public final int size() {
        return this.f443a.size();
    }

    public final String toString() {
        return this.f443a.toString();
    }
}

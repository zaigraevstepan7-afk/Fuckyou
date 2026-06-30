package p007E;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: E.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0066l {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f208a;

    /* JADX INFO: renamed from: b */
    public final Configuration f209b;

    /* JADX INFO: renamed from: c */
    public final int f210c;

    public C0066l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f208a = colorStateList;
        this.f209b = configuration;
        this.f210c = theme == null ? 0 : theme.hashCode();
    }
}

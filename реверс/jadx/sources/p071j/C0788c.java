package p071j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0788c extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f3166f;

    /* JADX INFO: renamed from: a */
    public int f3167a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f3168b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f3169c;

    /* JADX INFO: renamed from: d */
    public Configuration f3170d;

    /* JADX INFO: renamed from: e */
    public Resources f3171e;

    public C0788c(Context context, int i2) {
        super(context);
        this.f3167a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2136a(Configuration configuration) {
        if (this.f3171e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3170d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3170d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2137b() {
        if (this.f3168b == null) {
            this.f3168b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3168b.setTo(theme);
            }
        }
        this.f3168b.applyStyle(this.f3167a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f3171e == null) {
            Configuration configuration = this.f3170d;
            if (configuration == null) {
                this.f3171e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f3166f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f3166f = configuration2;
                    }
                    if (configuration.equals(f3166f)) {
                    }
                }
                this.f3171e = createConfigurationContext(this.f3170d).getResources();
            }
        }
        return this.f3171e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3169c == null) {
            this.f3169c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3169c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3168b;
        if (theme != null) {
            return theme;
        }
        if (this.f3167a == 0) {
            this.f3167a = R.style.resc;
        }
        m2137b();
        return this.f3168b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f3167a != i2) {
            this.f3167a = i2;
            m2137b();
        }
    }
}

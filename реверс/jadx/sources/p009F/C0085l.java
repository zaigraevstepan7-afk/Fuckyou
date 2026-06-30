package p009F;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p001A0.AbstractC0016e;
import p007E.C0061g;
import p007E.C0062h;
import p018K.C0155k;

/* JADX INFO: renamed from: F.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0085l extends AbstractC0016e {
    /* JADX INFO: renamed from: C0 */
    public static Font m378C0(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM379D0 = m379D0(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iM379D02 = m379D0(fontStyle, font2.getStyle());
            if (iM379D02 < iM379D0) {
                font = font2;
                iM379D0 = iM379D02;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m379D0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: E */
    public final C0155k mo206E(int i2, C0155k[] c0155kArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u */
    public final Typeface mo225u(Context context, C0061g c0061g, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0062h c0062h : c0061g.f197a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0062h.f203f).setWeight(c0062h.f199b).setSlant(c0062h.f200c ? 1 : 0).setTtcIndex(c0062h.f202e).setFontVariationSettings(c0062h.f201d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m378C0(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: v */
    public final Typeface mo227v(Context context, C0155k[] c0155kArr, int i2) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0155k c0155k : c0155kArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0155k.f486a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0155k.f488c).setSlant(c0155k.f489d ? 1 : 0).setTtcIndex(c0155k.f487b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m378C0(fontFamilyBuild, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: w */
    public final Typeface mo228w(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: x */
    public final Typeface mo229x(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}

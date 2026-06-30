package p005C0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p001A0.AbstractC0016e;
import p098x0.C1097d;

/* JADX INFO: renamed from: C0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0043i extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f162k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f163l;

    public /* synthetic */ C0043i(int i2, Object obj) {
        this.f162k = i2;
        this.f163l = obj;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: k0 */
    public final void mo222k0(int i2) {
        switch (this.f162k) {
            case 0:
                C0045k c0045k = (C0045k) this.f163l;
                c0045k.f167d = true;
                InterfaceC0044j interfaceC0044j = (InterfaceC0044j) c0045k.f168e.get();
                if (interfaceC0044j != null) {
                    interfaceC0044j.mo269a();
                }
                break;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: l0 */
    public final void mo223l0(Typeface typeface, boolean z2) {
        switch (this.f162k) {
            case 0:
                if (!z2) {
                    C0045k c0045k = (C0045k) this.f163l;
                    c0045k.f167d = true;
                    InterfaceC0044j interfaceC0044j = (InterfaceC0044j) c0045k.f168e.get();
                    if (interfaceC0044j != null) {
                        interfaceC0044j.mo269a();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) this.f163l;
                C1097d c1097d = chip.f2166e;
                chip.setText(c1097d.f4526C0 ? c1097d.f4529E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m268C0(int i2) {
    }
}

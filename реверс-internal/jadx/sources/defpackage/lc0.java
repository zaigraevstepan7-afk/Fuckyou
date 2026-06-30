package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 extends lk {
    public final BreakIterator b;

    public lc0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.lk
    public final int X(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.lk
    public final int b0(int i) {
        return this.b.preceding(i);
    }
}

package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zj implements CharacterIterator {
    public final CharSequence e;
    public final int f;
    public int g = 0;

    public zj(CharSequence charSequence, int i) {
        this.e = charSequence;
        this.f = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.g;
        if (i == this.f) {
            return (char) 65535;
        }
        return this.e.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.g = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.g;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f;
        if (i == 0) {
            this.g = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.g = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.g + 1;
        this.g = i;
        int i2 = this.f;
        if (i < i2) {
            return this.e.charAt(i);
        }
        this.g = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.g;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.g = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f || i < 0) {
            yc.p("invalid position");
            return (char) 0;
        }
        this.g = i;
        return current();
    }
}

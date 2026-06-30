package p094v0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1072c {

    /* JADX INFO: renamed from: a */
    public final int f4429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f4431c;

    public C1072c(int i2) {
        this.f4429a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2649a() {
        switch (this.f4430b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4431c;
                if (carouselLayoutManager.m1718E0()) {
                    return carouselLayoutManager.f2874n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1072c(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f4430b = i2;
        switch (i2) {
            case 1:
                this.f4431c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4431c = carouselLayoutManager;
                break;
        }
    }
}

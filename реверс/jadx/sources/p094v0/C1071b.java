package p094v0;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p009F.AbstractC0074a;
import p066g0.AbstractC0720H;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1071b extends AbstractC0720H {

    /* JADX INFO: renamed from: a */
    public final Paint f4427a;

    /* JADX INFO: renamed from: b */
    public final List f4428b;

    public C1071b() {
        Paint paint = new Paint();
        this.f4427a = paint;
        this.f4428b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p066g0.AbstractC0720H
    /* JADX INFO: renamed from: b */
    public final void mo1983b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iM1999D;
        int iM2000E;
        int iM2001F;
        int iM1998C;
        Paint paint = this.f4427a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.resc));
        Iterator it = this.f4428b.iterator();
        while (it.hasNext()) {
            ((AbstractC1073d) it.next()).getClass();
            paint.setColor(AbstractC0074a.m353b(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1717D0()) {
                C1072c c1072c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2161q;
                switch (c1072c.f4430b) {
                    case 0:
                        iM2001F = 0;
                        break;
                    default:
                        iM2001F = c1072c.f4431c.m2001F();
                        break;
                }
                float f = iM2001F;
                C1072c c1072c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2161q;
                switch (c1072c2.f4430b) {
                    case 0:
                        iM1998C = c1072c2.f4431c.f2875o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c1072c2.f4431c;
                        iM1998C = carouselLayoutManager.f2875o - carouselLayoutManager.m1998C();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f, 0.0f, iM1998C, paint);
            } else {
                canvas2 = canvas;
                C1072c c1072c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2161q;
                switch (c1072c3.f4430b) {
                    case 0:
                        iM1999D = c1072c3.f4431c.m1999D();
                        break;
                    default:
                        iM1999D = 0;
                        break;
                }
                float f2 = iM1999D;
                C1072c c1072c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2161q;
                switch (c1072c4.f4430b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c1072c4.f4431c;
                        iM2000E = carouselLayoutManager2.f2874n - carouselLayoutManager2.m2000E();
                        break;
                    default:
                        iM2000E = c1072c4.f4431c.f2874n;
                        break;
                }
                canvas2.drawLine(f2, 0.0f, iM2000E, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}

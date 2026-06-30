package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1104g {

    /* JADX INFO: renamed from: a */
    public final float f4675a;

    /* JADX INFO: renamed from: b */
    public final float f4676b;

    /* JADX INFO: renamed from: c */
    public final float f4677c;

    /* JADX INFO: renamed from: d */
    public final float f4678d;

    /* JADX INFO: renamed from: e */
    public final int f4679e;

    public C1104g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4675a = Float.NaN;
        this.f4676b = Float.NaN;
        this.f4677c = Float.NaN;
        this.f4678d = Float.NaN;
        this.f4679e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1115r.f4810j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4679e);
                this.f4679e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1111n().m2757b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4678d = typedArrayObtainStyledAttributes.getDimension(index, this.f4678d);
            } else if (index == 2) {
                this.f4676b = typedArrayObtainStyledAttributes.getDimension(index, this.f4676b);
            } else if (index == 3) {
                this.f4677c = typedArrayObtainStyledAttributes.getDimension(index, this.f4677c);
            } else if (index == 4) {
                this.f4675a = typedArrayObtainStyledAttributes.getDimension(index, this.f4675a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

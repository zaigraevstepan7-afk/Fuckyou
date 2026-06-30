package p036T;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p024N.C0250b;
import p026O.C0306f;
import p026O.C0311k;

/* JADX INFO: renamed from: T.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0378h extends C0250b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1040d;

    public /* synthetic */ C0378h(int i2) {
        this.f1040d = i2;
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: c */
    public void mo250c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1040d) {
            case 0:
                super.mo250c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo250c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        int scrollRange;
        switch (this.f1040d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f794a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c0311k.m975i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0311k.m969b(C0306f.f896g);
                        c0311k.m969b(C0306f.f901l);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0311k.m969b(C0306f.f895f);
                        c0311k.m969b(C0306f.f902m);
                    }
                    break;
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f794a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0311k.f911a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f794a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0311k.f911a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f794a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0311k.f911a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // p024N.C0250b
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo813g(View view, int i2, Bundle bundle) {
        switch (this.f1040d) {
            case 0:
                if (super.mo813g(view, i2, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i2 == 4096) {
                        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m1280u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i2 == 8192 || i2 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m1280u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i2 == 16908346) {
                    }
                }
                return false;
            default:
                return super.mo813g(view, i2, bundle);
        }
    }
}

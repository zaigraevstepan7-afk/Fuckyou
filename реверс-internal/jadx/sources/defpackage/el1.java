package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class el1 {
    public static final yc a = l91.m;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(e81 e81Var) {
        MotionEvent motionEventA;
        List list = e81Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((l81) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent motionEventA2 = e81Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = e81Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }
}

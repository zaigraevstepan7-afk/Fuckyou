package p024N;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: N.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0260g {

    /* JADX INFO: renamed from: a */
    public final Context f813a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0262h f814b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f815c;

    /* JADX INFO: renamed from: d */
    public float f816d;

    /* JADX INFO: renamed from: e */
    public int f817e = -1;

    /* JADX INFO: renamed from: f */
    public int f818f = -1;

    /* JADX INFO: renamed from: g */
    public int f819g = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f820h = {Integer.MAX_VALUE, 0};

    public C0260g(Context context, InterfaceC0262h interfaceC0262h) {
        this.f813a = context;
        this.f814b = interfaceC0262h;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m819a(MotionEvent motionEvent, int i2) {
        char c2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        float f;
        float yVelocity;
        long j2;
        float f2;
        float fSqrt;
        int i3;
        float f3;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i4 = this.f818f;
        int[] iArr = this.f820h;
        if (i4 == source && this.f819g == deviceId && this.f817e == i2) {
            z2 = false;
            c2 = 0;
        } else {
            Context context = this.f813a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i5 = Build.VERSION.SDK_INT;
            c2 = 0;
            if (i5 >= 34) {
                Method method = AbstractC0244W.f784a;
                scaledMinimumFlingVelocity = AbstractC0243V.m794b(viewConfiguration, deviceId2, i2, source2);
            } else {
                Method method2 = AbstractC0244W.f784a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i5 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0243V.m793a(viewConfiguration, deviceId3, i2, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f818f = source;
            this.f819g = deviceId;
            this.f817e = i2;
            z2 = true;
        }
        if (iArr[c2] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f815c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f815c = null;
                return;
            }
            return;
        }
        if (this.f815c == null) {
            this.f815c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f815c;
        Map map = AbstractC0296y.f883a;
        velocityTracker2.addMovement(motionEvent);
        float f4 = 0.0f;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0296y.f883a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C0298z());
            }
            C0298z c0298z = (C0298z) map2.get(velocityTracker2);
            c0298z.getClass();
            long eventTime = motionEvent.getEventTime();
            int i6 = c0298z.f888d;
            long[] jArr = c0298z.f886b;
            if (i6 != 0 && eventTime - jArr[c0298z.f889e] > 40) {
                c0298z.f888d = 0;
                c0298z.f887c = 0.0f;
            }
            int i7 = (c0298z.f889e + 1) % 20;
            c0298z.f889e = i7;
            int i8 = c0298z.f888d;
            if (i8 != 20) {
                c0298z.f888d = i8 + 1;
            }
            c0298z.f885a[i7] = motionEvent.getAxisValue(26);
            jArr[c0298z.f889e] = eventTime;
        }
        int i9 = 1000;
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0298z c0298z2 = (C0298z) AbstractC0296y.f883a.get(velocityTracker2);
        if (c0298z2 != null) {
            int i10 = c0298z2.f888d;
            if (i10 < 2) {
                f2 = Float.MAX_VALUE;
                fSqrt = 0.0f;
                f = 0.0f;
                f3 = fSqrt * i9;
                c0298z2.f887c = f3;
                if (f3 < (-Math.abs(f2))) {
                    c0298z2.f887c = -Math.abs(f2);
                } else if (c0298z2.f887c > Math.abs(f2)) {
                    c0298z2.f887c = Math.abs(f2);
                }
            } else {
                int i11 = c0298z2.f889e;
                int i12 = ((i11 + 20) - (i10 - 1)) % 20;
                long[] jArr2 = c0298z2.f886b;
                long j3 = jArr2[i11];
                while (true) {
                    j2 = jArr2[i12];
                    if (j3 - j2 <= 100) {
                        break;
                    }
                    c0298z2.f888d--;
                    i12 = (i12 + 1) % 20;
                }
                int i13 = c0298z2.f888d;
                if (i13 >= 2) {
                    float[] fArr = c0298z2.f885a;
                    if (i13 == 2) {
                        int i14 = (i12 + 1) % 20;
                        if (j2 != jArr2[i14]) {
                            fSqrt = fArr[i14] / (r22 - j2);
                            f2 = Float.MAX_VALUE;
                        }
                        f = 0.0f;
                        f3 = fSqrt * i9;
                        c0298z2.f887c = f3;
                        if (f3 < (-Math.abs(f2))) {
                        }
                    } else {
                        f2 = Float.MAX_VALUE;
                        int i15 = 0;
                        int i16 = 0;
                        float fAbs = 0.0f;
                        while (true) {
                            if (i15 >= c0298z2.f888d - 1) {
                                break;
                            }
                            int i17 = i15 + i12;
                            long j4 = jArr2[i17 % 20];
                            int i18 = (i17 + 1) % 20;
                            if (jArr2[i18] == j4) {
                                i3 = 1;
                            } else {
                                i16++;
                                float fSqrt2 = (fAbs < f4 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f5 = fArr[i18] / (jArr2[i18] - j4);
                                fAbs += Math.abs(f5) * (f5 - fSqrt2);
                                i3 = 1;
                                if (i16 == 1) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i15 += i3;
                            f4 = 0.0f;
                        }
                        f = 0.0f;
                        fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                        i9 = 1000;
                        f3 = fSqrt * i9;
                        c0298z2.f887c = f3;
                        if (f3 < (-Math.abs(f2))) {
                        }
                    }
                }
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0294x.m916a(velocityTracker2, i2);
        } else if (i2 == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i2 == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            C0298z c0298z3 = (C0298z) AbstractC0296y.f883a.get(velocityTracker2);
            yVelocity = (c0298z3 == null || i2 != 26) ? 0.0f : c0298z3.f887c;
        }
        InterfaceC0262h interfaceC0262h = this.f814b;
        float fMo52q = interfaceC0262h.mo52q() * yVelocity;
        float fSignum = Math.signum(fMo52q);
        if (z2 || (fSignum != Math.signum(this.f816d) && fSignum != f)) {
            interfaceC0262h.mo59x();
        }
        if (Math.abs(fMo52q) < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r1, Math.min(fMo52q, iArr[1]));
        this.f816d = interfaceC0262h.mo44i(fMax) ? fMax : 0.0f;
    }
}

package p071j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p057d.AbstractC0641a;
import p072k.ActionProviderVisibilityListenerC0819p;
import p072k.MenuC0816m;
import p074l.AbstractC0966r0;

/* JADX INFO: renamed from: j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0793h extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f3214e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f3215f;

    /* JADX INFO: renamed from: a */
    public final Object[] f3216a;

    /* JADX INFO: renamed from: b */
    public final Object[] f3217b;

    /* JADX INFO: renamed from: c */
    public final Context f3218c;

    /* JADX INFO: renamed from: d */
    public Object f3219d;

    static {
        Class[] clsArr = {Context.class};
        f3214e = clsArr;
        f3215f = clsArr;
    }

    public C0793h(Context context) {
        super(context);
        this.f3218c = context;
        Object[] objArr = {context};
        this.f3216a = objArr;
        this.f3217b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2140a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2140a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX INFO: renamed from: b */
    public final void m2141b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i2;
        XmlResourceParser xmlResourceParser2;
        ColorStateList colorStateList;
        int resourceId;
        C0792g c0792g = new C0792g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c0792g.f3189b = 0;
                        c0792g.f3190c = 0;
                        c0792g.f3191d = 0;
                        c0792g.f3192e = 0;
                        c0792g.f3193f = r4;
                        c0792g.f3194g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0792g.f3195h) {
                            ActionProviderVisibilityListenerC0819p actionProviderVisibilityListenerC0819p = c0792g.f3213z;
                            if (actionProviderVisibilityListenerC0819p == null || !actionProviderVisibilityListenerC0819p.f3376b.hasSubMenu()) {
                                c0792g.f3195h = r4;
                                c0792g.m2139b(c0792g.f3188a.add(c0792g.f3189b, c0792g.f3196i, c0792g.f3197j, c0792g.f3198k));
                            } else {
                                c0792g.f3195h = r4;
                                c0792g.m2139b(c0792g.f3188a.addSubMenu(c0792g.f3189b, c0792g.f3196i, c0792g.f3197j, c0792g.f3198k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = true;
                    }
                    eventType = xmlResourceParser2.next();
                    r4 = 1;
                    i2 = 2;
                }
                xmlResourceParser2 = xmlResourceParser;
            } else {
                if (z3) {
                    xmlResourceParser2 = xmlResourceParser;
                } else {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0793h c0793h = c0792g.f3187E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c0793h.f3218c.obtainStyledAttributes(attributeSet, AbstractC0641a.f2495p);
                        c0792g.f3189b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c0792g.f3190c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c0792g.f3191d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c0792g.f3192e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c0792g.f3193f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c0792g.f3194g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                        xmlResourceParser2 = xmlResourceParser;
                    } else if (name3.equals("item")) {
                        Context context = c0793h.f3218c;
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2496q);
                        c0792g.f3196i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c0792g.f3197j = (typedArrayObtainStyledAttributes2.getInt(5, c0792g.f3190c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c0792g.f3191d) & 65535);
                        c0792g.f3198k = typedArrayObtainStyledAttributes2.getText(7);
                        c0792g.f3199l = typedArrayObtainStyledAttributes2.getText(8);
                        c0792g.f3200m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c0792g.f3201n = string == null ? (char) 0 : string.charAt(0);
                        c0792g.f3202o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c0792g.f3203p = string2 == null ? (char) 0 : string2.charAt(0);
                        c0792g.f3204q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c0792g.f3205r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c0792g.f3205r = c0792g.f3192e;
                        }
                        c0792g.f3206s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c0792g.f3207t = typedArrayObtainStyledAttributes2.getBoolean(4, c0792g.f3193f);
                        c0792g.f3208u = typedArrayObtainStyledAttributes2.getBoolean(1, c0792g.f3194g);
                        c0792g.f3209v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c0792g.f3212y = typedArrayObtainStyledAttributes2.getString(12);
                        c0792g.f3210w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c0792g.f3211x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z4 = string3 != null;
                        if (z4 && c0792g.f3210w == 0 && c0792g.f3211x == null) {
                            c0792g.f3213z = (ActionProviderVisibilityListenerC0819p) c0792g.m2138a(string3, f3215f, c0793h.f3217b);
                        } else {
                            if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0792g.f3213z = null;
                        }
                        c0792g.f3183A = typedArrayObtainStyledAttributes2.getText(17);
                        c0792g.f3184B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c0792g.f3186D = AbstractC0966r0.m2415c(typedArrayObtainStyledAttributes2.getInt(19, -1), c0792g.f3186D);
                        } else {
                            c0792g.f3186D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0016e.m160I(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c0792g.f3185C = colorStateList;
                        } else {
                            c0792g.f3185C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c0792g.f3195h = false;
                        xmlResourceParser2 = xmlResourceParser;
                    } else if (name3.equals("menu")) {
                        c0792g.f3195h = true;
                        SubMenu subMenuAddSubMenu = c0792g.f3188a.addSubMenu(c0792g.f3189b, c0792g.f3196i, c0792g.f3197j, c0792g.f3198k);
                        c0792g.m2139b(subMenuAddSubMenu.getItem());
                        xmlResourceParser2 = xmlResourceParser;
                        m2141b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser2 = xmlResourceParser;
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser2.next();
                r4 = 1;
                i2 = 2;
            }
            eventType = xmlResourceParser2.next();
            r4 = 1;
            i2 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0816m)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f3218c.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC0816m) {
                    MenuC0816m menuC0816m = (MenuC0816m) menu;
                    if (!menuC0816m.f3334p) {
                        menuC0816m.m2198w();
                        z2 = true;
                    }
                }
                m2141b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((MenuC0816m) menu).m2197v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0816m) menu).m2197v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

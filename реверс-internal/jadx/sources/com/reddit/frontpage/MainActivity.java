package com.reddit.frontpage;

import android.R;
import android.app.C0001;
import android.os.Bundle;
import android.text.C0012;
import android.view.C0023;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0037;
import androidx.core.app.C0039;
import androidx.core.app.C0041;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0056;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0075;
import androidx.versionedparcelable.C0076;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.focus.C0118;
import com.google.android.material.focus.C0119;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0145;
import defpackage.bo;
import defpackage.fi1;
import defpackage.fp;
import defpackage.jo;
import defpackage.kv1;
import defpackage.o20;
import defpackage.of;
import defpackage.p20;
import defpackage.q20;
import defpackage.r20;
import defpackage.s20;
import defpackage.t20;
import defpackage.u20;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends bo {
    @Override // defpackage.bo, defpackage.ao, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 13;
        kv1 kv1Var = new kv1(0, 0, new fi1(i));
        kv1 kv1Var2 = new kv1(C0012.m160(), C0118.m1485(), new fi1(i));
        View viewM1510 = C0119.m1510(C0105.m1342(this));
        C0090.m1170(viewM1510);
        q20 q20VarM21 = C0001.m21();
        if (q20VarM21 == null) {
            int iM497 = C0037.m497();
            q20VarM21 = iM497 >= 35 ? new u20() : iM497 >= 30 ? new t20() : iM497 >= 29 ? new s20() : iM497 >= 28 ? new r20() : new q20();
            p20.c = q20VarM21;
        }
        q20 q20Var = q20VarM21;
        of ofVar = new of(q20Var, kv1Var, kv1Var2, this, viewM1510);
        ViewGroup viewGroup = (ViewGroup) viewM1510;
        int i2 = 0;
        while (true) {
            if (i2 >= C0039.m524(viewGroup)) {
                o20 o20Var = new o20(ofVar, C0133.m1679(viewGroup));
                C0129.m1626(o20Var, q20Var);
                C0138.m1735(o20Var, 8);
                C0131.m1654(o20Var, true);
                C0090.m1166(viewGroup, o20Var);
                break;
            }
            int i3 = i2 + 1;
            View viewM1300 = C0102.m1300(viewGroup, i2);
            if (viewM1300 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (C0041.m552(viewM1300) instanceof q20) {
                break;
            } else {
                i2 = i3;
            }
        }
        C0029.m379(ofVar);
        Window windowM1342 = C0105.m1342(this);
        C0090.m1170(windowM1342);
        C0127.m1594(q20Var, windowM1342);
        super.onCreate(bundle);
        jo joVarM1676 = C0133.m1676();
        C0023.m314();
        View viewM13002 = C0102.m1300((ViewGroup) C0120.m1519(C0119.m1510(C0105.m1342(this)), R.id.content), 0);
        fp fpVar = viewM13002 instanceof fp ? (fp) viewM13002 : null;
        if (fpVar != null) {
            C0076.m978(fpVar, null);
            C0145.m1815(fpVar, joVarM1676);
            return;
        }
        fp fpVar2 = new fp(this);
        C0076.m978(fpVar2, null);
        C0145.m1815(fpVar2, joVarM1676);
        View viewM15102 = C0119.m1510(C0105.m1342(this));
        if (C0075.m965(viewM15102) == null) {
            C0055.m716(viewM15102, com.reddit.secondpage.R.id.view_tree_lifecycle_owner, this);
        }
        if (C0086.m1114(viewM15102) == null) {
            C0055.m716(viewM15102, com.reddit.secondpage.R.id.view_tree_view_model_store_owner, this);
        }
        if (C0056.m739(viewM15102) == null) {
            C0055.m716(viewM15102, com.reddit.secondpage.R.id.view_tree_saved_state_registry_owner, this);
        }
        C0072.m930(this, fpVar2, C0023.m314());
    }
}

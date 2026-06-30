package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h8 {
    public final i8 a;
    public final e8 b;
    public final e8 c;
    public final View d;

    public h8(i8 i8Var, e8 e8Var, e8 e8Var2, View view) {
        this.a = i8Var;
        this.b = e8Var;
        this.c = e8Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        kw1 kw1Var = (kw1) this.b.a();
        final int i2 = 0;
        if (xi0.o(kw1Var, null)) {
            return false;
        }
        menu.clear();
        List list = kw1Var.a;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            jw1 jw1Var = (jw1) list.get(i4);
            if (jw1Var instanceof rw1) {
                i = i5 + 1;
                Object obj = jw1Var.a;
                final rw1 rw1Var = (rw1) jw1Var;
                MenuItem menuItemAdd = menu.add(i6, xi0.o(obj, c2.K) ? R.id.cut : xi0.o(obj, c2.L) ? R.id.copy : xi0.o(obj, c2.M) ? R.id.paste : xi0.o(obj, c2.N) ? R.id.selectAll : xi0.o(obj, c2.O) ? R.id.autofill : i5, i5, rw1Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g8
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i7 = i2;
                        Object obj2 = this;
                        Object obj3 = rw1Var;
                        switch (i7) {
                            case 0:
                                ((rw1) obj3).d.i(((h8) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                af1.A(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (jw1Var instanceof xw1) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.d.getContext();
                        xw1 xw1Var = (xw1) jw1Var;
                        final TextClassification textClassification = xw1Var.b;
                        int i7 = xw1Var.c;
                        Drawable drawable = xw1Var.d;
                        if (i7 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i5, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g8
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i72 = i3;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i72) {
                                        case 0:
                                            ((rw1) obj3).d.i(((h8) obj2).a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            af1.A(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i8 != 0 ? 16908353 : i2, i5, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: f02
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    af1.A(remoteAction.getActionIntent());
                                    return true;
                                }
                            });
                        }
                    }
                } else if (jw1Var instanceof vw1) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}

package com.android.danilapaster;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.topjohnwu.superuser.Shell;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015J\b\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/android/danilapaster/danila_pasterila;", "Landroid/app/Activity;", "()V", "alert", "Landroid/app/AlertDialog;", "isSubscribed", "", "startButton", "Landroid/widget/Button;", "cmd", "", "command", "", "copyFile", "assetName", "destinationPath", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showSubscriptionDialog", "app_debug"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class danila_pasterila extends Activity {
    private AlertDialog alert;
    private boolean isSubscribed;
    private Button startButton;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Shell.enableVerboseLogging = true;
        Shell.setDefaultBuilder(Shell.Builder.create().setFlags(8).setTimeout(20L));
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setGravity(17);
        layout.setBackgroundColor(Color.parseColor("#121212"));
        layout.setPadding(64, 64, 64, 64);
        layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout contentBox = new LinearLayout(this);
        contentBox.setOrientation(1);
        contentBox.setPadding(64, 64, 64, 64);
        GradientDrawable $this$onCreate_u24lambda_u242_u24lambda_u241 = new GradientDrawable();
        $this$onCreate_u24lambda_u242_u24lambda_u241.setCornerRadius(48.0f);
        $this$onCreate_u24lambda_u242_u24lambda_u241.setColor(Color.parseColor("#1E1E1E"));
        $this$onCreate_u24lambda_u242_u24lambda_u241.setStroke(2, Color.parseColor("#2A2A2A"));
        contentBox.setBackground($this$onCreate_u24lambda_u242_u24lambda_u241);
        contentBox.setElevation(32.0f);
        contentBox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView $this$onCreate_u24lambda_u243 = new TextView(this);
        $this$onCreate_u24lambda_u243.setText("Free Version t.me/melrele");
        $this$onCreate_u24lambda_u243.setTextSize(28.0f);
        $this$onCreate_u24lambda_u243.setTextColor(Color.parseColor("#FFB300"));
        $this$onCreate_u24lambda_u243.setTypeface(Typeface.DEFAULT_BOLD);
        $this$onCreate_u24lambda_u243.setGravity(17);
        LinearLayout.LayoutParams $this$onCreate_u24lambda_u244 = new LinearLayout.LayoutParams(-1, -2);
        $this$onCreate_u24lambda_u244.bottomMargin = 60;
        Unit unit = Unit.INSTANCE;
        contentBox.addView($this$onCreate_u24lambda_u243, $this$onCreate_u24lambda_u244);
        Button $this$onCreate_u24lambda_u246 = new Button(this);
        $this$onCreate_u24lambda_u246.setText("Start");
        $this$onCreate_u24lambda_u246.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        GradientDrawable $this$onCreate_u24lambda_u246_u24lambda_u245 = new GradientDrawable();
        $this$onCreate_u24lambda_u246_u24lambda_u245.setCornerRadius(32.0f);
        $this$onCreate_u24lambda_u246_u24lambda_u245.setColor(Color.parseColor("#FFB300"));
        $this$onCreate_u24lambda_u246.setBackground($this$onCreate_u24lambda_u246_u24lambda_u245);
        $this$onCreate_u24lambda_u246.setTextSize(18.0f);
        $this$onCreate_u24lambda_u246.setEnabled(false);
        $this$onCreate_u24lambda_u246.setAlpha(0.5f);
        this.startButton = $this$onCreate_u24lambda_u246;
        Button button = this.startButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startButton");
            button = null;
        }
        contentBox.addView(button, new LinearLayout.LayoutParams(-1, -2));
        layout.addView(contentBox);
        setContentView(layout);
        showSubscriptionDialog();
        Shell.getShell(new Shell.GetShellCallback() { // from class: com.android.danilapaster.danila_pasterila$$ExternalSyntheticLambda0
            @Override // com.topjohnwu.superuser.Shell.GetShellCallback
            public final void onShell(Shell shell) {
                danila_pasterila.onCreate$lambda$7(this.f$0, shell);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(danila_pasterila this$0, Shell it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.init();
    }

    private final void showSubscriptionDialog() {
        LinearLayout dialog = new LinearLayout(this);
        dialog.setOrientation(1);
        dialog.setPadding(64, 64, 64, 64);
        GradientDrawable $this$showSubscriptionDialog_u24lambda_u249_u24lambda_u248 = new GradientDrawable();
        $this$showSubscriptionDialog_u24lambda_u249_u24lambda_u248.setCornerRadius(48.0f);
        $this$showSubscriptionDialog_u24lambda_u249_u24lambda_u248.setColor(Color.parseColor("#1E1E1E"));
        dialog.setBackground($this$showSubscriptionDialog_u24lambda_u249_u24lambda_u248);
        TextView $this$showSubscriptionDialog_u24lambda_u2410 = new TextView(this);
        $this$showSubscriptionDialog_u24lambda_u2410.setText("Подпишись чтобы поиграть");
        $this$showSubscriptionDialog_u24lambda_u2410.setTextColor(-1);
        $this$showSubscriptionDialog_u24lambda_u2410.setTextSize(18.0f);
        $this$showSubscriptionDialog_u24lambda_u2410.setGravity(17);
        dialog.addView($this$showSubscriptionDialog_u24lambda_u2410);
        Button $this$showSubscriptionDialog_u24lambda_u2413 = new Button(this);
        $this$showSubscriptionDialog_u24lambda_u2413.setText("Подписаться");
        $this$showSubscriptionDialog_u24lambda_u2413.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        GradientDrawable $this$showSubscriptionDialog_u24lambda_u2413_u24lambda_u2411 = new GradientDrawable();
        $this$showSubscriptionDialog_u24lambda_u2413_u24lambda_u2411.setCornerRadius(32.0f);
        $this$showSubscriptionDialog_u24lambda_u2413_u24lambda_u2411.setColor(Color.parseColor("#FFB300"));
        $this$showSubscriptionDialog_u24lambda_u2413.setBackground($this$showSubscriptionDialog_u24lambda_u2413_u24lambda_u2411);
        $this$showSubscriptionDialog_u24lambda_u2413.setTextSize(16.0f);
        $this$showSubscriptionDialog_u24lambda_u2413.setOnClickListener(new View.OnClickListener() { // from class: com.android.danilapaster.danila_pasterila$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                danila_pasterila.showSubscriptionDialog$lambda$13$lambda$12(this.f$0, view);
            }
        });
        LinearLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2414 = new LinearLayout.LayoutParams(-1, -2);
        $this$showSubscriptionDialog_u24lambda_u2414.topMargin = 40;
        Unit unit = Unit.INSTANCE;
        dialog.addView($this$showSubscriptionDialog_u24lambda_u2413, $this$showSubscriptionDialog_u24lambda_u2414);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.Theme.Material.Dialog.Alert).setView(dialog).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        this.alert = alertDialogCreate;
        AlertDialog alertDialog = this.alert;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alert");
            alertDialog = null;
        }
        alertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionDialog$lambda$13$lambda$12(danila_pasterila this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isSubscribed = true;
        Button button = this$0.startButton;
        AlertDialog alertDialog = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startButton");
            button = null;
        }
        button.setEnabled(true);
        Button button2 = this$0.startButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startButton");
            button2 = null;
        }
        button2.setAlpha(1.0f);
        AlertDialog alertDialog2 = this$0.alert;
        if (alertDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alert");
        } else {
            alertDialog = alertDialog2;
        }
        alertDialog.dismiss();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/melrele"));
        this$0.startActivity(intent);
    }

    private final void init() {
        String localPath = getFilesDir().getPath() + "/tenmi";
        copyFile("tenmi", localPath);
        cmd("mv " + localPath + " /data/local/tmp/delaem");
        cmd("chmod 777 /data/local/tmp/delaem");
        Button button = this.startButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.danilapaster.danila_pasterila$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                danila_pasterila.init$lambda$16(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$16(final danila_pasterila this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isSubscribed) {
            this$0.cmd("am start -n com.axlebolt.standoff2/com.google.firebase.MessagingUnityPlayerActivity");
            new Handler().postDelayed(new Runnable() { // from class: com.android.danilapaster.danila_pasterila$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    danila_pasterila.init$lambda$16$lambda$15(this.f$0);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$16$lambda$15(danila_pasterila this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            File file = new File("/data/local/tmp/delaem");
            if (file.exists()) {
                this$0.cmd("/data/local/tmp/delaem");
            } else {
                this$0.init();
            }
        } catch (Exception e) {
            this$0.init();
        }
    }

    private final void cmd(String command) {
        try {
            Runtime.getRuntime().exec("su -c " + command).waitFor();
        } catch (Exception e) {
        }
    }

    private final void copyFile(String assetName, String destinationPath) {
        InputStream input;
        try {
            FileOutputStream fileOutputStreamOpen = getAssets().open(assetName);
            try {
                input = fileOutputStreamOpen;
                fileOutputStreamOpen = new FileOutputStream(destinationPath);
            } finally {
            }
            try {
                FileOutputStream output = fileOutputStreamOpen;
                byte[] buffer = new byte[2048];
                while (true) {
                    int it = input.read(buffer);
                    if (it == -1) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStreamOpen, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStreamOpen, null);
                        return;
                    }
                    output.write(buffer, 0, it);
                }
            } finally {
            }
        } catch (Exception e) {
        }
    }
}

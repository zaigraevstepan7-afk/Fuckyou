package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public BaseTransientBottomBar$Behavior() {
        Math.min(Math.max(0.0f, 0.1f), 1.0f);
        Math.min(Math.max(0.0f, 0.6f), 1.0f);
    }
}

package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdoq implements View.OnTouchListener {
    public final /* synthetic */ zzdov zza;

    public /* synthetic */ zzdoq(zzdov zzdov) {
        this.zza = zzdov;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}

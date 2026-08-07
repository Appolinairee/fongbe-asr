package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdjx implements zzbjp {
    public final /* synthetic */ zzdkb zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdjx(zzdkb zzdkb, View view, WindowManager windowManager) {
        this.zza = zzdkb;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zzd(this.zzb, this.zzc, (zzcex) obj, map);
    }
}

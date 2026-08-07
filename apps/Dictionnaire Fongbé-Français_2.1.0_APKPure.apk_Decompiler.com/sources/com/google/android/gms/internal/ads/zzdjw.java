package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdjw implements zzbjp {
    public final /* synthetic */ zzdkb zza;
    public final /* synthetic */ WindowManager zzb;
    public final /* synthetic */ View zzc;

    public /* synthetic */ zzdjw(zzdkb zzdkb, WindowManager windowManager, View view) {
        this.zza = zzdkb;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zzc(this.zzb, this.zzc, (zzcex) obj, map);
    }
}

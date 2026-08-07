package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdka implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzcex zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ WindowManager.LayoutParams zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdka(View view, zzcex zzcex, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzcex;
        this.zzc = str;
        this.zzd = layoutParams;
        this.zze = i;
        this.zzf = windowManager;
    }

    public final void onScrollChanged() {
        Rect rect = new Rect();
        if (this.zza.getGlobalVisibleRect(rect)) {
            zzcex zzcex = this.zzb;
            if (zzcex.zzF().getWindowToken() != null) {
                int i = this.zze;
                WindowManager.LayoutParams layoutParams = this.zzd;
                String str = this.zzc;
                if ("1".equals(str) || "2".equals(str)) {
                    layoutParams.y = rect.bottom - i;
                } else {
                    layoutParams.y = rect.top - i;
                }
                this.zzf.updateViewLayout(zzcex.zzF(), layoutParams);
            }
        }
    }
}

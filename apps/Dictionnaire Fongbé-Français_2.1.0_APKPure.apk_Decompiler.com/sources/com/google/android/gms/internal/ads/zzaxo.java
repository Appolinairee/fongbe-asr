package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxo extends zzaxr {
    private final View zzh;

    public zzaxo(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, View view) {
        super(zzawd, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", zzasc, i, 57);
        this.zzh = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) zzbe.zzc().zza(zzbcl.zzdy);
            Boolean bool2 = (Boolean) zzbe.zzc().zza(zzbcl.zzkP);
            DisplayMetrics displayMetrics = this.zza.zzb().getResources().getDisplayMetrics();
            zzawh zzawh = new zzawh((String) this.zze.invoke((Object) null, new Object[]{this.zzh, displayMetrics, bool, bool2}));
            zzasw zza = zzasx.zza();
            zza.zzb(zzawh.zza.longValue());
            zza.zzd(zzawh.zzb.longValue());
            zza.zze(zzawh.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzawh.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzawh.zzd.longValue());
            }
            this.zzd.zzY((zzasx) zza.zzbr());
        }
    }
}

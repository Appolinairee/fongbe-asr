package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcyc extends zzdbj implements zzcwn, zzcxs {
    private final zzfbo zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcyc(Set set, zzfbo zzfbo) {
        super(set);
        this.zzb = zzfbo;
    }

    private final void zza() {
        zzu zzu;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhI)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzu = this.zzb.zzae) != null && zzu.zza == 3) {
            zzq(new zzcyb(zzu));
        }
    }

    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zza();
        }
    }

    public final void zzr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zza();
        }
    }
}

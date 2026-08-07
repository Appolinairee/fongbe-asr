package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzejs implements zzelc {
    final /* synthetic */ zzejt zza;

    zzejs(zzejt zzejt) {
        this.zza = zzejt;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcom zzcom = (zzcom) obj;
        synchronized (this.zza) {
            zzejt zzejt = this.zza;
            if (zzejt.zzi != null) {
                zzejt.zzi.zzb();
            }
            this.zza.zzi = zzcom;
            this.zza.zzi.zzk();
        }
    }
}

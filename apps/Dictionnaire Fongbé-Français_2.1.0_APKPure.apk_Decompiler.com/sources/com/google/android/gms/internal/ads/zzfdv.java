package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfdv {
    private final LinkedList zza = new LinkedList();
    private final int zzb;
    private final int zzc;
    private final zzfeu zzd;

    public zzfdv(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = new zzfeu();
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && zzv.zzC().currentTimeMillis() - ((zzfef) this.zza.getFirst()).zzd >= ((long) this.zzc)) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfef zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfef zzfef = (zzfef) this.zza.remove();
        if (zzfef != null) {
            this.zzd.zzh();
        }
        return zzfef;
    }

    public final zzfet zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfef zzfef) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfef);
        return true;
    }
}

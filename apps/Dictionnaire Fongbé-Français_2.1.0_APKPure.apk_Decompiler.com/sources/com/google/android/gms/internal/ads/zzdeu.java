package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzdeu {
    private final zzdgc zza;
    private final zzcex zzb;

    public zzdeu(zzdgc zzdgc, zzcex zzcex) {
        this.zza = zzdgc;
        this.zzb = zzcex;
    }

    public final View zza() {
        zzcex zzcex = this.zzb;
        if (zzcex == null) {
            return null;
        }
        return zzcex.zzG();
    }

    public final View zzb() {
        zzcex zzcex = this.zzb;
        if (zzcex != null) {
            return zzcex.zzG();
        }
        return null;
    }

    public final zzcex zzc() {
        return this.zzb;
    }

    public final zzddk zzd(Executor executor) {
        return new zzddk(new zzdet(this.zzb), executor);
    }

    public final zzdgc zze() {
        return this.zza;
    }

    public Set zzf(zzcuo zzcuo) {
        return Collections.singleton(new zzddk(zzcuo, zzbzw.zzg));
    }

    public Set zzg(zzcuo zzcuo) {
        return Collections.singleton(new zzddk(zzcuo, zzbzw.zzg));
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeih implements zzcxc {
    boolean zza = false;
    final /* synthetic */ zzecz zzb;
    final /* synthetic */ zzcab zzc;

    zzeih(zzeii zzeii, zzecz zzecz, zzcab zzcab) {
        this.zzb = zzecz;
        this.zzc = zzcab;
    }

    private final synchronized void zze(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzbe.zzc().zza(zzbcl.zzfu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeda(i, zze));
    }

    public final synchronized void zza(int i) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i, zzeii.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzeii.zze(this.zzb.zza, i);
            }
            zze(new zze(i, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzc((Object) null);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgx implements zzfy {
    private final zzfy zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzgx(zzfy zzfy) {
        zzfy zzfy2 = zzfy;
        this.zza = zzfy;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza2 = this.zza.zza(bArr, i, i2);
        if (zza2 != -1) {
            this.zzb += (long) zza2;
        }
        return zza2;
    }

    public final long zzb(zzgd zzgd) throws IOException {
        this.zzc = zzgd.zza;
        this.zzd = Collections.emptyMap();
        try {
            long zzb2 = this.zza.zzb(zzgd);
            Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zze();
            return zzb2;
        } catch (Throwable th) {
            Uri zzc3 = zzc();
            if (zzc3 != null) {
                this.zzc = zzc3;
            }
            this.zzd = zze();
            throw th;
        }
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    public final void zzf(zzgy zzgy) {
        zzgy.getClass();
        this.zza.zzf(zzgy);
    }
}

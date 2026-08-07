package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzkh {
    /* access modifiers changed from: private */
    public long zza;
    /* access modifiers changed from: private */
    public float zzb;
    /* access modifiers changed from: private */
    public long zzc;

    public zzkh() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzkh(zzkj zzkj, zzki zzki) {
        this.zza = zzkj.zza;
        this.zzb = zzkj.zzb;
        this.zzc = zzkj.zzc;
    }

    public final zzkh zzd(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzcw.zzd(z);
        this.zzc = j;
        return this;
    }

    public final zzkh zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzkh zzf(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzb = f;
        return this;
    }

    public final zzkj zzg() {
        return new zzkj(this, (zzki) null);
    }
}

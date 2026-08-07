package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzani {
    private final zzamj zza;
    private final zzef zzb;
    private final zzdx zzc = new zzdx(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzani(zzamj zzamj, zzef zzef) {
        this.zza = zzamj;
        this.zzb = zzef;
    }

    public final void zza(zzdy zzdy) throws zzbc {
        long j;
        long j2;
        zzdy zzdy2 = zzdy;
        zzdy2.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        zzdx zzdx = this.zzc;
        zzdy2.zzH(zzdx.zza, 0, zzdx.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long zzd2 = (long) this.zzc.zzd(3);
            this.zzc.zzn(1);
            int zzd3 = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long zzd4 = (long) this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (this.zzf || !this.zze) {
                j2 = zzd2;
            } else {
                this.zzc.zzn(4);
                this.zzc.zzn(1);
                this.zzc.zzn(1);
                j2 = zzd2;
                this.zzc.zzn(1);
                this.zzb.zzb(((long) (this.zzc.zzd(15) << 15)) | (((long) this.zzc.zzd(3)) << 30) | ((long) this.zzc.zzd(15)));
                this.zzf = true;
            }
            j = this.zzb.zzb((j2 << 30) | ((long) zzd3) | zzd4);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzdy2);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}

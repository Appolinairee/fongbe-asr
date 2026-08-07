package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaey extends zzaex {
    private final zzdy zzb = new zzdy(zzfk.zza);
    private final zzdy zzc = new zzdy(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaey(zzadt zzadt) {
        super(zzadt);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzdy zzdy) throws zzaew {
        int zzm = zzdy.zzm();
        int i = zzm >> 4;
        int i2 = zzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaew("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzdy zzdy, long j) throws zzbc {
        int i;
        zzdy zzdy2 = zzdy;
        int zzm = zzdy.zzm();
        long zzh = (long) zzdy.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzdy zzdy3 = new zzdy(new byte[zzdy.zzb()]);
                zzdy2.zzH(zzdy3.zzN(), 0, zzdy.zzb());
                zzabr zza = zzabr.zza(zzdy3);
                this.zzd = zza.zzb;
                zzz zzz = new zzz();
                zzz.zzaa("video/avc");
                zzz.zzA(zza.zzl);
                zzz.zzaf(zza.zzc);
                zzz.zzK(zza.zzd);
                zzz.zzW(zza.zzk);
                zzz.zzN(zza.zza);
                this.zza.zzm(zzz.zzag());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] zzN = this.zzc.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzdy.zzb() > 0) {
                zzdy2.zzH(this.zzc.zzN(), i3, this.zzd);
                this.zzc.zzL(0);
                zzdy zzdy4 = this.zzc;
                zzdy zzdy5 = this.zzb;
                int zzp = zzdy4.zzp();
                zzdy5.zzL(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzdy2, zzp);
                i4 = i4 + 4 + zzp;
            }
            this.zza.zzt(j + (zzh * 1000), i, i4, 0, (zzads) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}

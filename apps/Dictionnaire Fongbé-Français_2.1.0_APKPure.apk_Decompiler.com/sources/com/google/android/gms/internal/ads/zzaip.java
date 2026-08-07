package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaip {
    public final zzadt zza;
    public final zzajd zzb = new zzajd();
    public final zzdy zzc = new zzdy();
    public zzaje zzd;
    public zzail zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();
    /* access modifiers changed from: private */
    public boolean zzl;

    public zzaip(zzadt zzadt, zzaje zzaje, zzail zzail) {
        this.zza = zzadt;
        this.zzd = zzaje;
        this.zze = zzail;
        zzh(zzaje, zzail);
    }

    public final int zza() {
        int i;
        if (!this.zzl) {
            i = this.zzd.zzg[this.zzf];
        } else {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzdy zzdy;
        zzajc zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i3 = zzf2.zzd;
        if (i3 != 0) {
            zzdy = this.zzb.zzn;
        } else {
            byte[] bArr = zzf2.zze;
            int i4 = zzei.zza;
            zzdy zzdy2 = this.zzk;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzdy2.zzJ(bArr2, length);
            zzdy = this.zzk;
            i3 = length;
        }
        boolean zzb2 = this.zzb.zzb(this.zzf);
        boolean z = zzb2 || i2 != 0;
        zzdy zzdy3 = this.zzj;
        zzdy3.zzN()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzdy3.zzL(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzdy, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb2) {
            this.zzc.zzI(8);
            zzdy zzdy4 = this.zzc;
            byte[] zzN = zzdy4.zzN();
            zzN[0] = 0;
            zzN[1] = 1;
            zzN[2] = 0;
            zzN[3] = (byte) i2;
            zzN[4] = (byte) ((i >> 24) & 255);
            zzN[5] = (byte) ((i >> 16) & 255);
            zzN[6] = (byte) ((i >> 8) & 255);
            zzN[7] = (byte) (i & 255);
            this.zza.zzs(zzdy4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzdy zzdy5 = this.zzb.zzn;
        int zzq = zzdy5.zzq();
        zzdy5.zzM(-2);
        int i6 = (zzq * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzI(i6);
            byte[] zzN2 = this.zzc.zzN();
            zzdy5.zzH(zzN2, 0, i6);
            int i7 = (((zzN2[2] & 255) << 8) | (zzN2[3] & 255)) + i2;
            zzN2[2] = (byte) ((i7 >> 8) & 255);
            zzN2[3] = (byte) (i7 & 255);
            zzdy5 = this.zzc;
        }
        this.zza.zzs(zzdy5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzajd zzajd = this.zzb;
        return zzajd.zzi[this.zzf];
    }

    public final zzajc zzf() {
        if (!this.zzl) {
            return null;
        }
        zzail zzail = this.zzb.zza;
        int i = zzei.zza;
        zzail zzail2 = zzail;
        int i2 = zzail.zza;
        zzajc zzajc = this.zzb.zzm;
        if (zzajc == null) {
            zzajc = this.zzd.zza.zzb(i2);
        }
        if (zzajc == null || !zzajc.zza) {
            return null;
        }
        return zzajc;
    }

    public final void zzh(zzaje zzaje, zzail zzail) {
        this.zzd = zzaje;
        this.zze = zzail;
        this.zza.zzm(zzaje.zza.zzg);
        zzi();
    }

    public final void zzi() {
        zzajd zzajd = this.zzb;
        zzajd.zzd = 0;
        zzajd.zzp = 0;
        zzajd.zzq = false;
        zzajd.zzk = false;
        zzajd.zzo = false;
        zzajd.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}

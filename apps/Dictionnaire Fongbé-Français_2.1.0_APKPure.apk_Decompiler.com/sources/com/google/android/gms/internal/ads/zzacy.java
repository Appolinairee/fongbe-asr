package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzacy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzacx zzk;
    private final zzay zzl;

    private zzacy(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzacx zzacx, zzay zzay) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzacx;
        this.zzl = zzay;
    }

    public zzacy(byte[] bArr, int i) {
        zzdx zzdx = new zzdx(bArr, bArr.length);
        zzdx.zzl(i * 8);
        this.zza = zzdx.zzd(16);
        this.zzb = zzdx.zzd(16);
        this.zzc = zzdx.zzd(24);
        this.zzd = zzdx.zzd(24);
        int zzd2 = zzdx.zzd(20);
        this.zze = zzd2;
        this.zzf = zzi(zzd2);
        this.zzg = zzdx.zzd(3) + 1;
        int zzd3 = zzdx.zzd(5) + 1;
        this.zzh = zzd3;
        this.zzi = zzh(zzd3);
        this.zzj = zzdx.zze(36);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        return Math.max(0, Math.min((j * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final zzab zzc(byte[] bArr, zzay zzay) {
        bArr[4] = Byte.MIN_VALUE;
        zzay zzd2 = zzd(zzay);
        zzz zzz = new zzz();
        zzz.zzaa("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzz.zzR(i);
        zzz.zzz(this.zzg);
        zzz.zzab(this.zze);
        zzz.zzU(zzei.zzn(this.zzh));
        zzz.zzN(Collections.singletonList(bArr));
        zzz.zzT(zzd2);
        return zzz.zzag();
    }

    public final zzay zzd(zzay zzay) {
        zzay zzay2 = this.zzl;
        return zzay2 == null ? zzay : zzay2.zzd(zzay);
    }

    public final zzacy zze(List list) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzay(list)));
    }

    public final zzacy zzf(zzacx zzacx) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzacx, this.zzl);
    }

    public final zzacy zzg(List list) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzadz.zzb(list)));
    }
}

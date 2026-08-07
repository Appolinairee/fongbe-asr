package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaep implements zzabx {
    private final zzacy zza;
    private final int zzb;
    private final zzact zzc = new zzact();

    /* synthetic */ zzaep(zzacy zzacy, int i, zzaeq zzaeq) {
        this.zza = zzacy;
        this.zzb = i;
    }

    private final long zzc(zzaco zzaco) throws IOException {
        while (zzaco.zze() < zzaco.zzd() - 6) {
            zzacy zzacy = this.zza;
            int i = this.zzb;
            zzact zzact = this.zzc;
            long zze = zzaco.zze();
            byte[] bArr = new byte[2];
            zzaco.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzaco.zzj();
                zzaco.zzg((int) (zze - zzaco.zzf()));
            } else {
                zzdy zzdy = new zzdy(16);
                System.arraycopy(bArr, 0, zzdy.zzN(), 0, 2);
                zzdy.zzK(zzacr.zza(zzaco, zzdy.zzN(), 2, 14));
                zzaco.zzj();
                zzaco.zzg((int) (zze - zzaco.zzf()));
                if (zzacu.zzc(zzdy, zzacy, i, zzact)) {
                    break;
                }
            }
            zzaco.zzg(1);
        }
        if (zzaco.zze() < zzaco.zzd() - 6) {
            return this.zzc.zza;
        }
        zzaco.zzg((int) (zzaco.zzd() - zzaco.zze()));
        return this.zza.zzj;
    }

    public final zzabw zza(zzaco zzaco, long j) throws IOException {
        long zzf = zzaco.zzf();
        long zzc2 = zzc(zzaco);
        long zze = zzaco.zze();
        zzaco.zzg(Math.max(6, this.zza.zzc));
        int i = (zzc2 > j ? 1 : (zzc2 == j ? 0 : -1));
        long zzc3 = zzc(zzaco);
        long zze2 = zzaco.zze();
        if (i > 0 || zzc3 <= j) {
            return zzc3 <= j ? zzabw.zzf(zzc3, zze2) : zzabw.zzd(zzc2, zzf);
        }
        return zzabw.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}

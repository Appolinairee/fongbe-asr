package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajk extends zzajt {
    private zzacy zza;
    private zzajj zzb;

    zzajk() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzdy zzdy) {
        if (!zzd(zzdy.zzN())) {
            return -1;
        }
        int i = (zzdy.zzN()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza2 = zzacu.zza(zzdy, i);
            zzdy.zzL(0);
            return (long) zza2;
        }
        zzdy.zzM(4);
        zzdy.zzx();
        int zza22 = zzacu.zza(zzdy, i);
        zzdy.zzL(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdy, long j, zzajq zzajq) {
        byte[] zzN = zzdy.zzN();
        zzacy zzacy = this.zza;
        if (zzacy == null) {
            zzacy zzacy2 = new zzacy(zzN, 17);
            this.zza = zzacy2;
            zzajq.zza = zzacy2.zzc(Arrays.copyOfRange(zzN, 9, zzdy.zze()), (zzay) null);
            return true;
        } else if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzacx zzb2 = zzacv.zzb(zzdy);
            zzacy zzf = zzacy.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzajj(zzf, zzb2);
            return true;
        } else if (!zzd(zzN)) {
            return true;
        } else {
            zzajj zzajj = this.zzb;
            if (zzajj != null) {
                zzajj.zza(j);
                zzajq.zzb = this.zzb;
            }
            zzajq.zza.getClass();
            return false;
        }
    }
}

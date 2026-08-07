package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajp extends zzajt {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzajp() {
    }

    public static boolean zzd(zzdy zzdy) {
        return zzk(zzdy, zza);
    }

    private static boolean zzk(zzdy zzdy, byte[] bArr) {
        if (zzdy.zzb() < 8) {
            return false;
        }
        int zzd = zzdy.zzd();
        byte[] bArr2 = new byte[8];
        zzdy.zzH(bArr2, 0, 8);
        zzdy.zzL(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzdy zzdy) {
        return zzg(zzadi.zzd(zzdy.zzN()));
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdy, long j, zzajq zzajq) throws zzbc {
        if (zzk(zzdy, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdy.zzN(), zzdy.zze());
            byte b = copyOf[9] & 255;
            List zze = zzadi.zze(copyOf);
            if (zzajq.zza == null) {
                zzz zzz = new zzz();
                zzz.zzaa("audio/opus");
                zzz.zzz(b);
                zzz.zzab(48000);
                zzz.zzN(zze);
                zzajq.zza = zzz.zzag();
                return true;
            }
        } else if (zzk(zzdy, zzb)) {
            zzcw.zzb(zzajq.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzdy.zzM(8);
                zzay zzb2 = zzadz.zzb(zzfxn.zzm(zzadz.zzc(zzdy, false, false).zza));
                if (zzb2 != null) {
                    zzz zzb3 = zzajq.zza.zzb();
                    zzb3.zzT(zzb2.zzd(zzajq.zza.zzl));
                    zzajq.zza = zzb3.zzag();
                }
            }
        } else {
            zzcw.zzb(zzajq.zza);
            return false;
        }
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaet extends zzaex {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaet(zzadt zzadt) {
        super(zzadt);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzdy zzdy) throws zzaew {
        String str;
        if (!this.zzc) {
            int zzm = zzdy.zzm();
            int i = zzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzm >> 2) & 3];
                zzz zzz = new zzz();
                zzz.zzaa("audio/mpeg");
                zzz.zzz(1);
                zzz.zzab(i2);
                this.zza.zzm(zzz.zzag());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzz zzz2 = new zzz();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzz2.zzaa(str);
                zzz2.zzz(1);
                zzz2.zzab(8000);
                this.zza.zzm(zzz2.zzag());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaew("Audio format not supported: " + i);
            }
            this.zzc = true;
        } else {
            zzdy.zzM(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzdy zzdy, long j) throws zzbc {
        if (this.zze == 2) {
            int zzb2 = zzdy.zzb();
            this.zza.zzr(zzdy, zzb2);
            this.zza.zzt(j, 1, zzb2, 0, (zzads) null);
            return true;
        }
        int zzm = zzdy.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzdy.zzb();
            byte[] bArr = new byte[zzb3];
            zzdy.zzH(bArr, 0, zzb3);
            zzabi zza = zzabk.zza(bArr);
            zzz zzz = new zzz();
            zzz.zzaa("audio/mp4a-latm");
            zzz.zzA(zza.zzc);
            zzz.zzz(zza.zzb);
            zzz.zzab(zza.zza);
            zzz.zzN(Collections.singletonList(bArr));
            this.zza.zzm(zzz.zzag());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzm != 1) {
            return false;
        } else {
            int zzb4 = zzdy.zzb();
            this.zza.zzr(zzdy, zzb4);
            this.zza.zzt(j, 1, zzb4, 0, (zzads) null);
            return true;
        }
    }
}

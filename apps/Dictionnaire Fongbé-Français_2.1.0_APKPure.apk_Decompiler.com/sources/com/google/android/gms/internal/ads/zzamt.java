package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamt implements zzamj {
    private final zzdy zza = new zzdy(10);
    private zzadt zzb;
    private boolean zzc;
    private long zzd = -9223372036854775807L;
    private int zze;
    private int zzf;

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zzb);
        if (this.zzc) {
            int zzb2 = zzdy.zzb();
            int i = this.zzf;
            if (i < 10) {
                int min = Math.min(zzb2, 10 - i);
                System.arraycopy(zzdy.zzN(), zzdy.zzd(), this.zza.zzN(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzL(0);
                    if (this.zza.zzm() == 73 && this.zza.zzm() == 68 && this.zza.zzm() == 51) {
                        this.zza.zzM(3);
                        this.zze = this.zza.zzl() + 10;
                    } else {
                        zzdo.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zzb2, this.zze - this.zzf);
            this.zzb.zzr(zzdy, min2);
            this.zzf += min2;
        }
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        zzadt zzw = zzacq.zzw(zzanx.zza(), 5);
        this.zzb = zzw;
        zzz zzz = new zzz();
        zzz.zzM(zzanx.zzb());
        zzz.zzaa("application/id3");
        zzw.zzm(zzz.zzag());
    }

    public final void zzc(boolean z) {
        int i;
        zzcw.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            zzcw.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzt(this.zzd, 1, this.zze, 0, (zzads) null);
            this.zzc = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzc = true;
            this.zzd = j;
            this.zze = 0;
            this.zzf = 0;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zztq implements zzwa {
    private final zzfxn zza;
    private long zzb;

    public zztq(List list, List list2) {
        zzfxk zzfxk = new zzfxk();
        zzcw.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfxk.zzf(new zztp((zzwa) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfxk.zzi();
        this.zzb = -9223372036854775807L;
    }

    public final long zzb() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zztp zztp = (zztp) this.zza.get(i);
            long zzb2 = zztp.zzb();
            if ((zztp.zza().contains(1) || zztp.zza().contains(2) || zztp.zza().contains(4)) && zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
            if (zzb2 != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb2);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.zzb;
            return j3 != -9223372036854775807L ? j3 : j2;
        }
    }

    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long zzc = ((zztp) this.zza.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zztp) this.zza.get(i)).zzm(j);
        }
    }

    public final boolean zzo(zzkj zzkj) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long zzc2 = ((zztp) this.zza.get(i)).zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzkj.zza;
                if (zzc2 == zzc || z3) {
                    z |= ((zztp) this.zza.get(i)).zzo(zzkj);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zztp) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}

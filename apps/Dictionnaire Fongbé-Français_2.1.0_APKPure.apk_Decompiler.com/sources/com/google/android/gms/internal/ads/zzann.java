package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzann {
    private final List zza;
    private final zzadt[] zzb;
    private final zzfo zzc = new zzfo(new zzanm(this));

    public zzann(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    public final void zza(long j, zzdy zzdy) {
        this.zzc.zzb(j, zzdy);
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanx.zzc();
            zzadt zzw = zzacq.zzw(zzanx.zza(), 3);
            zzab zzab = (zzab) this.zza.get(i);
            String str = zzab.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String str2 = zzab.zza;
            if (str2 == null) {
                str2 = zzanx.zzb();
            }
            zzz zzz = new zzz();
            zzz.zzM(str2);
            zzz.zzaa(str);
            zzz.zzac(zzab.zze);
            zzz.zzQ(zzab.zzd);
            zzz.zzx(zzab.zzI);
            zzz.zzN(zzab.zzr);
            zzw.zzm(zzz.zzag());
            this.zzb[i] = zzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(long j, zzdy zzdy) {
        zzabz.zza(j, zzdy, this.zzb);
    }

    public final void zze(int i) {
        this.zzc.zzd(i);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxc extends zzaxr {
    private final zzavg zzh;
    private final long zzi;
    private final long zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaxc(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, zzavg zzavg, long j, long j2) {
        super(zzawd, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", zzasc, i, 11);
        this.zzh = zzavg;
        this.zzi = j;
        this.zzj = j2;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavg zzavg = this.zzh;
        if (zzavg != null) {
            zzave zzave = new zzave((String) this.zze.invoke((Object) null, new Object[]{zzavg.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)}));
            synchronized (this.zzd) {
                this.zzd.zzz(zzave.zza.longValue());
                if (zzave.zzb.longValue() >= 0) {
                    this.zzd.zzQ(zzave.zzb.longValue());
                }
                if (zzave.zzc.longValue() >= 0) {
                    this.zzd.zzf(zzave.zzc.longValue());
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzzx {
    final /* synthetic */ zzaah zza;
    private zzab zzb;

    /* synthetic */ zzzx(zzaah zzaah, zzaag zzaag) {
        this.zza = zzaah;
    }

    public final void zza(zzcd zzcd) {
        zzz zzz = new zzz();
        zzz.zzaf(zzcd.zzb);
        zzz.zzK(zzcd.zzc);
        zzz.zzaa("video/raw");
        this.zzb = zzz.zzag();
        Iterator it = this.zza.zzj.iterator();
        while (it.hasNext()) {
            ((zzaac) it.next()).zzA(this.zza, zzcd);
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Throwable, com.google.android.gms.internal.ads.zzbm, java.lang.Object] */
    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzaah zzaah = this.zza;
            if (zzaah.zzm != null) {
                Iterator it = zzaah.zzj.iterator();
                while (it.hasNext()) {
                    ((zzaac) it.next()).zzy(this.zza);
                }
            }
        }
        if (this.zza.zzk != null) {
            zzab zzab = this.zzb;
            if (zzab == null) {
                zzab = new zzz().zzag();
            }
            zzab zzab2 = zzab;
            zzaah zzaah2 = this.zza;
            zzaah2.zzk.zza(j2, zzaah2.zzi.zzc(), zzab2, (MediaFormat) null);
        }
        ? r8 = 0;
        zzcw.zzb(r8);
        zzbm zzbm = r8;
        r8.zza();
        throw r8;
    }
}

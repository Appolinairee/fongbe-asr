package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrz implements zzfgo {
    private final Map zza = new HashMap();
    private final zzdrq zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdrz(zzdrq zzdrq, Set set, Clock clock) {
        this.zzb = zzdrq;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdry zzdry = (zzdry) it.next();
            this.zzd.put(zzdry.zzc, zzdry);
        }
        this.zzc = clock;
    }

    private final void zze(zzfgh zzfgh, boolean z) {
        String str;
        zzdry zzdry = (zzdry) this.zzd.get(zzfgh);
        if (zzdry != null) {
            if (true != z) {
                str = "f.";
            } else {
                str = "s.";
            }
            Map map = this.zza;
            zzfgh zzb2 = zzdry.zzb;
            if (map.containsKey(zzb2)) {
                long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzb2)).longValue();
                Map zzb3 = this.zzb.zzb();
                String zzc2 = zzdry.zza;
                zzb3.put("label.".concat(zzc2), str + elapsedRealtime);
            }
        }
    }

    public final void zzd(zzfgh zzfgh, String str) {
        if (this.zza.containsKey(zzfgh)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfgh)).longValue();
            zzdrq zzdrq = this.zzb;
            String valueOf = String.valueOf(str);
            zzdrq.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfgh)) {
            zze(zzfgh, true);
        }
    }

    public final void zzdA(zzfgh zzfgh, String str) {
    }

    public final void zzdB(zzfgh zzfgh, String str, Throwable th) {
        if (this.zza.containsKey(zzfgh)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            zzdrq zzdrq = this.zzb;
            String valueOf = String.valueOf(str);
            zzdrq.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(clock.elapsedRealtime() - ((Long) map.get(zzfgh)).longValue()))));
        }
        if (this.zzd.containsKey(zzfgh)) {
            zze(zzfgh, false);
        }
    }

    public final void zzdC(zzfgh zzfgh, String str) {
        this.zza.put(zzfgh, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}

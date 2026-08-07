package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzavx implements zzfph {
    private final zzfnk zza;
    private final zzfob zzb;
    private final zzawk zzc;
    private final zzavw zzd;
    private final zzavg zze;
    private final zzawm zzf;
    private final zzawe zzg;
    private final zzavv zzh;

    zzavx(zzfnk zzfnk, zzfob zzfob, zzawk zzawk, zzavw zzavw, zzavg zzavg, zzawm zzawm, zzawe zzawe, zzavv zzavv) {
        this.zza = zzfnk;
        this.zzb = zzfob;
        this.zzc = zzawk;
        this.zzd = zzavw;
        this.zze = zzavg;
        this.zzf = zzawm;
        this.zzg = zzawe;
        this.zzh = zzavv;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfnk zzfnk = this.zza;
        zzasy zzb2 = this.zzb.zzb();
        hashMap.put("v", zzfnk.zzd());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzg()));
        hashMap.put("int", zzb2.zzh());
        hashMap.put("attts", Long.valueOf(zzb2.zzf().zza()));
        hashMap.put("att", zzb2.zzf().zzd());
        hashMap.put("attkid", zzb2.zzf().zzf());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzawe zzawe = this.zzg;
        if (zzawe != null) {
            hashMap.put("tcq", Long.valueOf(zzawe.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
            zzavg zzavg = this.zze;
            if (zzavg != null) {
                hashMap.put("nt", Long.valueOf(zzavg.zza()));
            }
            zzawm zzawm = this.zzf;
            if (zzawm != null) {
                hashMap.put("vs", Long.valueOf(zzawm.zzc()));
                hashMap.put("vf", Long.valueOf(this.zzf.zzb()));
            }
        }
        return hashMap;
    }

    public final Map zza() {
        zzawk zzawk = this.zzc;
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(zzawk.zza()));
        return zze2;
    }

    public final Map zzb() {
        Map zze2 = zze();
        zzasy zza2 = this.zzb.zza();
        zze2.put("gai", Boolean.valueOf(this.zza.zzh()));
        zze2.put("did", zza2.zzg());
        zze2.put("dst", Integer.valueOf(zza2.zzal() - 1));
        zze2.put("doo", Boolean.valueOf(zza2.zzai()));
        return zze2;
    }

    public final Map zzc() {
        zzavv zzavv = this.zzh;
        Map zze2 = zze();
        if (zzavv != null) {
            zze2.put("vst", zzavv.zza());
        }
        return zze2;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}

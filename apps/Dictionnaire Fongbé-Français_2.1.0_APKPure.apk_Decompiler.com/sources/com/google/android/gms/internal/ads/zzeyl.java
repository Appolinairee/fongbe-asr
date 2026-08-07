package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyl implements zzezf {
    private final zzezf zza;
    private final zzezf zzb;
    private final zzfes zzc;
    private final String zzd;
    private zzcuz zze;
    private final Executor zzf;

    public zzeyl(zzezf zzezf, zzezf zzezf2, zzfes zzfes, String str, Executor executor) {
        this.zza = zzezf;
        this.zzb = zzezf2;
        this.zzc = zzfes;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfef zzfef, zzezg zzezg) {
        zzcuz zzcuz = zzfef.zza;
        this.zze = zzcuz;
        if (zzfef.zzc != null) {
            if (zzcuz.zzf() != null) {
                zzfef.zzc.zzp().zzl(zzfef.zza.zzf());
            }
            return zzgch.zzh(zzfef.zzc);
        }
        zzcuz.zzb().zzk(zzfef.zzb);
        zzezf zzezf = this.zza;
        zzcuz zzcuz2 = zzfef.zza;
        zzcuz zzcuz3 = zzcuz2;
        return ((zzeyv) zzezf).zzb(zzezg, (zzeze) null, zzcuz2);
    }

    /* renamed from: zza */
    public final synchronized zzcuz zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzezg zzezg, zzeyk zzeyk, zzeze zzeze, zzcuz zzcuz, zzeyq zzeyq) throws Exception {
        if (zzeyq != null) {
            zzeyk zzeyk2 = new zzeyk(zzeyk.zza, zzeyk.zzb, zzeyk.zzc, zzeyk.zzd, zzeyk.zze, zzeyk.zzf, zzeyq.zza);
            if (zzeyq.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyk2);
                return zzg(zzeyq.zzc, zzezg);
            }
            ListenableFuture zza2 = this.zzc.zza(zzeyk2);
            if (zza2 != null) {
                this.zze = null;
                return zzgch.zzn(zza2, new zzeyh(this), this.zzf);
            }
            this.zzc.zze(zzeyk2);
            zzezg = new zzezg(zzezg.zzb, zzeyq.zzb);
        }
        zzcuz zzcuz2 = zzcuz;
        ListenableFuture zzb2 = ((zzeyv) this.zza).zzb(zzezg, zzeze, zzcuz);
        this.zze = zzcuz;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezg, zzeze zzeze, Object obj) {
        zzcuz zzcuz = null;
        return zzf(zzezg, zzeze, (zzcuz) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(zzfep zzfep) throws Exception {
        zzfer zzfer;
        if (zzfep == null || zzfep.zza == null || (zzfer = zzfep.zzb) == null) {
            throw new zzdvy(1, "Empty prefetch");
        }
        zzbbq.zzb.zzc zzd2 = zzbbq.zzb.zzd();
        zzbbq.zzb.zza.C0003zza zza2 = zzbbq.zzb.zza.zza();
        zza2.zzf(zzbbq.zzb.zzd.IN_MEMORY);
        zza2.zzh(zzbbq.zzb.zze.zzi());
        zzd2.zzd(zza2);
        zzfep.zza.zza.zzb().zzc().zzm((zzbbq.zzb) zzd2.zzbr());
        return zzg(zzfep.zza, ((zzeyk) zzfer).zzb);
    }

    public final synchronized ListenableFuture zzf(zzezg zzezg, zzeze zzeze, zzcuz zzcuz) {
        zzezg zzezg2 = zzezg;
        zzeze zzeze2 = zzeze;
        synchronized (this) {
            zzcuy zza2 = zzeze2.zza(zzezg2.zzb);
            zza2.zza(new zzeym(this.zzd));
            zzcuz zzcuz2 = (zzcuz) zza2.zzh();
            zzcuz2.zzg();
            zzcuz2.zzg();
            zzm zzm = zzcuz2.zzg().zzd;
            if (zzm.zzs == null) {
                if (zzm.zzx == null) {
                    zzfcj zzg = zzcuz2.zzg();
                    zzeze zzeze3 = zzeze;
                    zzezg zzezg3 = zzezg;
                    zzcuz zzcuz3 = zzcuz2;
                    zzgby zzgby = (zzgby) zzgch.zzn(zzgby.zzu(((zzeyr) this.zzb).zzb(zzezg2, zzeze2, zzcuz2)), new zzeyi(this, zzezg, new zzeyk(zzeze3, zzezg3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzfeg) null), zzeze, zzcuz2), this.zzf);
                    return zzgby;
                }
            }
            this.zze = zzcuz2;
            zzcuz zzcuz4 = zzcuz2;
            ListenableFuture zzb2 = ((zzeyv) this.zza).zzb(zzezg2, zzeze2, zzcuz2);
            return zzb2;
        }
    }
}

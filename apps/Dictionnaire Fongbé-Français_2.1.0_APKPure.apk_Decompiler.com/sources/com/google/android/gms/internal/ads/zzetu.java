package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzetu {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhh zzd;
    private final zzdrw zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetu(Context context, Executor executor, Set set, zzfhh zzfhh, zzdrw zzdrw) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhh;
        this.zze = zzdrw;
    }

    public final ListenableFuture zza(Object obj, Bundle bundle, boolean z) {
        Bundle bundle2 = bundle;
        zzfgw zza2 = zzfgv.zza(this.zza, 8);
        zza2.zzi();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) zzbe.zzc().zza(zzbcl.zzlC)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzlC)).split(","));
        }
        List list = arrayList2;
        this.zzf = zzv.zzC().elapsedRealtime();
        Bundle bundle3 = new Bundle();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue() || bundle2 == null) {
            Object obj2 = obj;
        } else {
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            if (obj instanceof zzcuv) {
                bundle2.putLong(zzdre.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle2.putLong(zzdre.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (zzetr zzetr : this.zzb) {
            if (!list.contains(String.valueOf(zzetr.zza()))) {
                long elapsedRealtime = zzv.zzC().elapsedRealtime();
                ListenableFuture zzb2 = zzetr.zzb();
                zzb2.addListener(new zzets(this, elapsedRealtime, zzetr, bundle3), zzbzw.zzg);
                arrayList.add(zzb2);
            }
        }
        ListenableFuture zza3 = zzgch.zzb(arrayList).zza(new zzett(arrayList, obj, z, bundle, bundle3), this.zzc);
        if (zzfhk.zza()) {
            zzfhg.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    public final void zzb(long j, zzetr zzetr, Bundle bundle) {
        long elapsedRealtime = zzv.zzC().elapsedRealtime() - j;
        if (((Boolean) zzben.zza.zze()).booleanValue()) {
            zze.zza("Signal runtime (ms) : " + zzfve.zzc(zzetr.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzco)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzetr.zza(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzci)).booleanValue()) {
            zzdrv zza2 = this.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzetr.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzcj)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzb("seq_num", zzv.zzp().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(zzv.zzC().elapsedRealtime() - this.zzf);
                        if (zzetr.zza() <= 39 || zzetr.zza() >= 52) {
                            zza2.zzb("lat_clsg", valueOf);
                        } else {
                            zza2.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza2.zzh();
        }
    }
}

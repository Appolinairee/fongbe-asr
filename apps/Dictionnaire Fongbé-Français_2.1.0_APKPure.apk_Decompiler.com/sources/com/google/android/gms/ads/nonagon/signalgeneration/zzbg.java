package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfgh;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhez;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzbg(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj7;
        this.zzh = zzhfj8;
        this.zzi = zzhfj9;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ListenableFuture listenableFuture;
        zzau zzau = (zzau) this.zza.zzb();
        zzfgn zzfgn = (zzfgn) this.zzb.zzb();
        zzbi zza2 = ((zzbj) this.zzc).zzb();
        zzbi zzbi = zza2;
        zzcuw zza3 = ((zzcux) this.zzd).zzb();
        zzcuw zzcuw = zza3;
        zzdeh zzdeh = (zzdeh) this.zze.zzb();
        zzb zzb2 = (zzb) this.zzf.zzb();
        zzbyy zzbyy = (zzbyy) this.zzg.zzb();
        int intValue = ((Integer) this.zzh.zzb()).intValue();
        zzfcj zza4 = ((zzcvk) this.zzi).zza();
        zzfcj zzfcj = zza4;
        Bundle bundle = zza4.zzs;
        zzbk zzbk = null;
        if (intValue == 1 && zzbyy != null) {
            bundle.putLong(zzdre.READ_FROM_DISK_START.zza(), zzv.zzC().currentTimeMillis());
            zzbk = zzb2.zza(zzbyy, zzau, bundle);
            bundle.putLong(zzdre.READ_FROM_DISK_END.zza(), zzv.zzC().currentTimeMillis());
        }
        if (zzbk != null) {
            zzdeh.zza(zzbk);
            listenableFuture = zzgch.zzh(zzbk);
        } else {
            listenableFuture = zzfgn.zzb(zzfgh.GENERATE_SIGNALS, zza3.zzc()).zzf(zza2).zzi((long) ((Integer) zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS).zza();
            zzgch.zzr(listenableFuture, new zzaw(zzdeh), zzbzw.zza);
        }
        zzhez.zzb(listenableFuture);
        ListenableFuture listenableFuture2 = listenableFuture;
        return listenableFuture;
    }
}

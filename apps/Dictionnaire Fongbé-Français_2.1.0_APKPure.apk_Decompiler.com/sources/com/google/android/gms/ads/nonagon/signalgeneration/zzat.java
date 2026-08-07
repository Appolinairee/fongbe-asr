package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzgcd;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzat implements zzgcd {
    final /* synthetic */ zzau zza;

    zzat(zzau zzau) {
        this.zza = zzau;
    }

    public final void zza(Throwable th) {
        zzv.zzp().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa.zzd(this.zza.zzp, (zzdrq) null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get())));
        zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() && !this.zza.zzG.get()) {
            if (this.zza.zzH.getAndIncrement() < ((Integer) zzbe.zzc().zza(zzbcl.zzjC)).intValue()) {
                this.zza.zzT();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbk zzbk = (zzbk) obj;
        zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjB)).booleanValue()) {
            zzaa.zzd(this.zza.zzp, (zzdrq) null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get())));
            this.zza.zzG.set(true);
        }
    }
}

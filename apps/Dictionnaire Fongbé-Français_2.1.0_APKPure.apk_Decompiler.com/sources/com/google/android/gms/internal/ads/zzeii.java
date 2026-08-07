package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeii implements zzecw {
    private final zzecy zza;
    private final zzedc zzb;
    private final zzfgn zzc;
    private final zzgcs zzd;

    public zzeii(zzfgn zzfgn, zzgcs zzgcs, zzecy zzecy, zzedc zzedc) {
        this.zzc = zzfgn;
        this.zzd = zzgcs;
        this.zzb = zzedc;
        this.zza = zzecy;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzecz zzecz;
        Iterator it = zzfbo.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzecz = null;
                break;
            }
            try {
                zzecz = this.zza.zza((String) it.next(), zzfbo.zzv);
                break;
            } catch (zzfcq unused) {
            }
        }
        if (zzecz == null) {
            return zzgch.zzg(new zzefy("Unable to instantiate mediation adapter class."));
        }
        zzcab zzcab = new zzcab();
        zzecz.zzc.zza(new zzeih(this, zzecz, zzcab));
        if (zzfbo.zzM) {
            Bundle bundle = zzfca.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgn zzfgn = this.zzc;
        return zzffx.zzd(new zzeif(this, zzfca, zzfbo, zzecz), this.zzd, zzfgh.ADAPTER_LOAD_AD_SYN, zzfgn).zzb(zzfgh.ADAPTER_LOAD_AD_ACK).zzd(zzcab).zzb(zzfgh.ADAPTER_WRAP_ADAPTER).zze(new zzeig(this, zzfca, zzfbo, zzecz)).zza();
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        return !zzfbo.zzt.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfca zzfca, zzfbo zzfbo, zzecz zzecz, Void voidR) throws Exception {
        return this.zzb.zza(zzfca, zzfbo, zzecz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws Exception {
        this.zzb.zzb(zzfca, zzfbo, zzecz);
    }
}

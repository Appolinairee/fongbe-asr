package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzegf implements zzecw {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzfca zzfca2 = zzfca;
        zzfbo zzfbo2 = zzfbo;
        String optString = zzfbo2.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfcj zzfcj = zzfca2.zza.zza;
        zzfch zzfch = new zzfch();
        zzfch.zzq(zzfcj);
        zzfch.zzt(optString);
        Bundle zzd = zzd(zzfcj.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfbo2.zzv.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfbo2.zzv.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfbo2.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfbo2.zzD.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzm zzm = zzfcj.zzd;
        Bundle bundle = zzm.zzn;
        List list = zzm.zzo;
        String str = zzm.zzp;
        String str2 = zzm.zzq;
        boolean z = zzm.zzr;
        zzc zzc = zzm.zzs;
        int i = zzm.zzt;
        String str3 = zzm.zzu;
        List list2 = zzm.zzv;
        int i2 = zzm.zzw;
        String str4 = zzm.zzx;
        int i3 = zzm.zzy;
        long j = zzm.zzz;
        zzfch.zzH(new zzm(zzm.zza, zzm.zzb, zzd2, zzm.zzd, zzm.zze, zzm.zzf, zzm.zzg, zzm.zzh, zzm.zzi, zzm.zzj, zzm.zzk, zzm.zzl, zzd, bundle, list, str, str2, z, zzc, i, str3, list2, i2, str4, i3, j));
        zzfcj zzJ = zzfch.zzJ();
        Bundle bundle2 = new Bundle();
        zzfbr zzfbr = zzfca2.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList(zzfbr.zza));
        bundle3.putInt("refresh_interval", zzfbr.zzc);
        bundle3.putString("gws_query_id", zzfbr.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzfcj zzfcj2 = zzfca2.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfcj2.zzf);
        bundle4.putString("allocation_id", zzfbo2.zzw);
        bundle4.putString("ad_source_name", zzfbo2.zzF);
        bundle4.putStringArrayList("click_urls", new ArrayList(zzfbo2.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList(zzfbo2.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbo2.zzp));
        bundle4.putStringArrayList("fill_urls", new ArrayList(zzfbo2.zzm));
        bundle4.putStringArrayList("video_start_urls", new ArrayList(zzfbo2.zzg));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList(zzfbo2.zzh));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList(zzfbo2.zzi));
        bundle4.putString("transaction_id", zzfbo2.zzj);
        bundle4.putString("valid_from_timestamp", zzfbo2.zzk);
        bundle4.putBoolean("is_closable_area_disabled", zzfbo2.zzP);
        bundle4.putString("recursive_server_response_data", zzfbo2.zzao);
        bundle4.putBoolean("is_analytics_logging_enabled", zzfbo2.zzW);
        if (zzfbo2.zzl != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfbo2.zzl.zzb);
            bundle5.putString("rb_type", zzfbo2.zzl.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzJ, bundle2, zzfbo2, zzfca2);
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        return !TextUtils.isEmpty(zzfbo.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    public abstract ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca);
}

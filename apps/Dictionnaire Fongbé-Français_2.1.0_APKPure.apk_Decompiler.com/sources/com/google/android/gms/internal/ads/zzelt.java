package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzelt implements zzetq {
    final zzfcj zza;
    private final long zzb;

    public zzelt(zzfcj zzfcj, long j) {
        this.zza = zzfcj;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuv) obj).zzb;
        zzfcj zzfcj = this.zza;
        bundle.putString("slotname", zzfcj.zzf);
        zzm zzm = zzfcj.zzd;
        boolean z = true;
        if (zzm.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzm.zzg;
        zzfcx.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzm.zza >= 8) {
            int i2 = zzm.zzt;
            if (i2 == -1) {
                z = false;
            }
            zzfcx.zze(bundle, "tag_for_under_age_of_consent", i2, z);
        }
        zzfcx.zzc(bundle, ImagesContract.URL, zzm.zzl);
        zzfcx.zzd(bundle, "neighboring_content_urls", zzm.zzv);
        Bundle bundle2 = (Bundle) zzm.zzc.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzhs)).split(",", -1)));
        for (String str : zzm.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        zzfcx.zzb(bundle, "extras", bundle2);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        zzm zzm = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzm.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        if (i != 0) {
            int i2 = i - 1;
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfcx.zzg(bundle, "is_sdk_preload", true, zzm.zzb());
            zzfcx.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzm.zzb)), zzm.zzb != -1);
            zzfcx.zzb(bundle, "extras", zzm.zzc);
            int i3 = zzm.zzd;
            zzfcx.zze(bundle, "cust_gender", i3, i3 != -1);
            zzfcx.zzd(bundle, "kw", zzm.zze);
            int i4 = zzm.zzg;
            zzfcx.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
            if (zzm.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzm.zzy);
            zzfcx.zze(bundle, "d_imp_hdr", 1, zzm.zza >= 2 && zzm.zzh);
            String str = zzm.zzi;
            zzfcx.zzf(bundle, "ppid", str, zzm.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzm.zzk;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong("long", (long) (location.getLongitude() * 1.0E7d));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfcx.zzc(bundle, ImagesContract.URL, zzm.zzl);
            zzfcx.zzd(bundle, "neighboring_content_urls", zzm.zzv);
            zzfcx.zzb(bundle, "custom_targeting", zzm.zzn);
            zzfcx.zzd(bundle, "category_exclusions", zzm.zzo);
            zzfcx.zzc(bundle, "request_agent", zzm.zzp);
            zzfcx.zzc(bundle, "request_pkg", zzm.zzq);
            zzfcx.zzg(bundle, "is_designed_for_families", zzm.zzr, zzm.zza >= 7);
            if (zzm.zza >= 8) {
                int i5 = zzm.zzt;
                if (i5 == -1) {
                    z = false;
                }
                zzfcx.zze(bundle, "tag_for_under_age_of_consent", i5, z);
                zzfcx.zzc(bundle, "max_ad_content_rating", zzm.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}

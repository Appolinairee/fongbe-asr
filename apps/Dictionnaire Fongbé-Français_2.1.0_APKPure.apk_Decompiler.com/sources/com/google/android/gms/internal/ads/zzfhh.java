package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhh implements Runnable {
    private final List zza = new ArrayList();
    private final zzfhk zzb;
    private String zzc;
    private zzfhm zzd = zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zze;
    private zzfbz zzf;
    private zze zzg;
    private Future zzh;
    private int zzi = 2;

    zzfhh(zzfhk zzfhk) {
        this.zzb = zzfhk;
    }

    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfhh zza(zzfgw zzfgw) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfgw.zzj();
            list.add(zzfgw);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzbzw.zzd.schedule(this, (long) ((Integer) zzbe.zzc().zza(zzbcl.zziG)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhh zzb(String str) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue() && zzfhg.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhh zzc(zze zze2) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzg = zze2;
        }
        return this;
    }

    public final synchronized zzfhh zzd(ArrayList arrayList) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzi = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.zzi = 6;
                                            }
                                        }
                                    }
                                    this.zzi = 5;
                                }
                            }
                            this.zzi = 8;
                        }
                    }
                    this.zzi = 4;
                }
            }
            this.zzi = 3;
        }
        return this;
    }

    public final synchronized zzfhh zze(String str) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfhh zzf(Bundle bundle) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzd = zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfhh zzg(zzfbz zzfbz) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzf = zzfbz;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfgw zzfgw : this.zza) {
                int i = this.zzi;
                if (i != 2) {
                    zzfgw.zzn(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfgw.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzfgw.zzl()) {
                    zzfgw.zzd(this.zze);
                }
                zzfbz zzfbz = this.zzf;
                if (zzfbz != null) {
                    zzfgw.zzb(zzfbz);
                } else {
                    zze zze2 = this.zzg;
                    if (zze2 != null) {
                        zzfgw.zza(zze2);
                    }
                }
                zzfgw.zzf(this.zzd);
                this.zzb.zzb(zzfgw.zzm());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfhh zzi(int i) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdra implements zzdan, zza, zzcwn, zzcvx {
    private final Context zza;
    private final zzfdb zzb;
    private final zzdrw zzc;
    private final zzfca zzd;
    private final zzfbo zze;
    private final zzebk zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) zzbe.zzc().zza(zzbcl.zzgF)).booleanValue();

    public zzdra(Context context, zzfdb zzfdb, zzdrw zzdrw, zzfca zzfca, zzfbo zzfbo, zzebk zzebk, String str) {
        this.zza = context;
        this.zzb = zzfdb;
        this.zzc = zzdrw;
        this.zzd = zzfca;
        this.zze = zzfbo;
        this.zzf = zzebk;
        this.zzg = str;
    }

    private final zzdrv zzd(String str) {
        String str2;
        zzfbz zzfbz = this.zzd.zzb;
        zzdrv zza2 = this.zzc.zza();
        zza2.zzd(zzfbz.zzb);
        zza2.zzc(this.zze);
        zza2.zzb("action", str);
        zza2.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z = false;
        if (!this.zze.zzt.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            if (true != zzv.zzp().zzA(this.zza)) {
                str2 = "offline";
            } else {
                str2 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
            }
            zza2.zzb("device_connectivity", str2);
            zza2.zzb("event_timestamp", String.valueOf(zzv.zzC().currentTimeMillis()));
            zza2.zzb("offline_ad", "1");
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if (zzaa.zzf(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza2.zzb("scar", String.valueOf(z));
            if (z) {
                zzm zzm = this.zzd.zza.zza.zzd;
                zza2.zzb("ragent", zzm.zzp);
                zza2.zzb("rtype", zzaa.zzb(zzaa.zzc(zzm)));
            }
        }
        return zza2;
    }

    private final void zze(zzdrv zzdrv) {
        if (this.zze.zzb()) {
            this.zzf.zzd(new zzebm(zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrv.zze(), 2));
            return;
        }
        zzdrv.zzg();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) zzbe.zzc().zza(zzbcl.zzbB);
                    zzv.zzq();
                    try {
                        str = zzs.zzq(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (!(str2 == null || str == null)) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            zzv.zzp().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzb()) {
            zze(zzd("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzi) {
            zzdrv zzd2 = zzd("ifts");
            zzd2.zzb("reason", "adapter");
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            if (i >= 0) {
                zzd2.zzb("arec", String.valueOf(i));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzd2.zzb("areec", zza2);
            }
            zzd2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzi) {
            zzdrv zzd2 = zzd("ifts");
            zzd2.zzb("reason", "blocked");
            zzd2.zzg();
        }
    }

    public final void zzc(zzdgb zzdgb) {
        if (this.zzi) {
            zzdrv zzd2 = zzd("ifts");
            zzd2.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgb.getMessage())) {
                zzd2.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdgb.getMessage());
            }
            zzd2.zzg();
        }
    }

    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    public final void zzr() {
        if (zzf() || this.zze.zzb()) {
            zze(zzd("impression"));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdgd implements zzcxh, zzr, zzcwn {
    zzecr zza;
    private final Context zzb;
    private final zzcex zzc;
    private final zzfbo zzd;
    private final VersionInfoParcel zze;
    private final zzbbq.zza.C0000zza zzf;
    private final zzecp zzg;

    public zzdgd(Context context, zzcex zzcex, zzfbo zzfbo, VersionInfoParcel versionInfoParcel, zzbbq.zza.C0000zza zza2, zzecp zzecp) {
        this.zzb = context;
        this.zzc = zzcex;
        this.zzd = zzfbo;
        this.zze = versionInfoParcel;
        this.zzf = zza2;
        this.zzg = zzecp;
    }

    private final boolean zzg() {
        return ((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    public final void zzdE() {
    }

    public final void zzdi() {
    }

    public final void zzdo() {
    }

    public final void zzdp() {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfk)).booleanValue() && this.zzc != null) {
            if (this.zza == null && !zzg()) {
                return;
            }
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            } else {
                this.zzg.zzb();
            }
        }
    }

    public final void zzdr() {
    }

    public final void zzds(int i) {
        this.zza = null;
    }

    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
        } else if (this.zza != null && this.zzc != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzfk)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }

    public final void zzs() {
        zzecn zzecn;
        zzeco zzeco;
        zzeco zzeco2;
        zzbbq.zza.C0000zza zza2;
        if ((((Boolean) zzbe.zzc().zza(zzbcl.zzfn)).booleanValue() || this.zzf == zzbbq.zza.C0000zza.REWARD_BASED_VIDEO_AD || (zza2 = this.zzf) == zzbbq.zza.C0000zza.INTERSTITIAL || zza2 == zzbbq.zza.C0000zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            if (!zzv.zzB().zzl(this.zzb)) {
                return;
            }
            if (zzg()) {
                this.zzg.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            zzfcm zzfcm = this.zzd.zzV;
            String zza3 = zzfcm.zza();
            if (zzfcm.zzc() == 1) {
                zzecn = zzecn.VIDEO;
                zzeco = zzeco.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzY == 2) {
                    zzeco2 = zzeco.UNSPECIFIED;
                } else {
                    zzeco2 = zzeco.BEGIN_TO_RENDER;
                }
                zzeco = zzeco2;
                zzecn = zzecn.HTML_DISPLAY;
            }
            this.zza = zzv.zzB().zza(str, this.zzc.zzG(), "", "javascript", zza3, zzeco, zzecn, this.zzd.zzal);
            View zzF = this.zzc.zzF();
            zzecr zzecr = this.zza;
            if (zzecr != null) {
                zzfkp zza4 = zzecr.zza();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
                    zzv.zzB().zzj(zza4, this.zzc.zzG());
                    for (View zzg2 : this.zzc.zzV()) {
                        zzv.zzB().zzg(zza4, zzg2);
                    }
                } else {
                    zzv.zzB().zzj(zza4, zzF);
                }
                this.zzc.zzat(this.zza);
                zzv.zzB().zzk(zza4);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}

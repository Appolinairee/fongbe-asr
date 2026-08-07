package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdoa extends zzcqz {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgc zze;
    private final zzdcw zzf;
    private final zzcwg zzg;
    private final zzcxn zzh;
    private final zzcru zzi;
    private final zzbwm zzj;
    private final zzfnt zzk;
    private final zzfcc zzl;
    private boolean zzm = false;

    zzdoa(zzcqy zzcqy, Context context, zzcex zzcex, zzdgc zzdgc, zzdcw zzdcw, zzcwg zzcwg, zzcxn zzcxn, zzcru zzcru, zzfbo zzfbo, zzfnt zzfnt, zzfcc zzfcc) {
        super(zzcqy);
        String str;
        this.zzc = context;
        this.zze = zzdgc;
        this.zzd = new WeakReference(zzcex);
        this.zzf = zzdcw;
        this.zzg = zzcwg;
        this.zzh = zzcxn;
        this.zzi = zzcru;
        this.zzk = zzfnt;
        zzbwi zzbwi = zzfbo.zzl;
        if (zzbwi != null) {
            str = zzbwi.zza;
        } else {
            str = "";
        }
        this.zzj = new zzbxg(str, zzbwi != null ? zzbwi.zzb : 1);
        this.zzl = zzfcc;
    }

    public final void finalize() throws Throwable {
        try {
            zzcex zzcex = (zzcex) this.zzd.get();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzgA)).booleanValue()) {
                if (!this.zzm && zzcex != null) {
                    zzgcs zzgcs = zzbzw.zzf;
                    Objects.requireNonNull(zzcex);
                    zzgcs.execute(new zzdnz(zzcex));
                }
            } else if (zzcex != null) {
                zzcex.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwm zzc() {
        return this.zzj;
    }

    public final zzfcc zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcex zzcex = (zzcex) this.zzd.get();
        return zzcex != null && !zzcex.zzaG();
    }

    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaM)).booleanValue()) {
            zzv.zzq();
            if (zzs.zzH(this.zzc)) {
                zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdk.zzd(10, (String) null, (zze) null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdgb e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}

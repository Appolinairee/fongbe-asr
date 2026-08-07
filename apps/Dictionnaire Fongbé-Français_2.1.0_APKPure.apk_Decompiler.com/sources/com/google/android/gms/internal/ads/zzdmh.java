package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdmh {
    private final zzfcj zza;
    private final Executor zzb;
    private final zzdow zzc;
    private final zzdnr zzd;
    private final Context zze;
    private final zzdrw zzf;
    private final zzfja zzg;
    private final zzebk zzh;

    public zzdmh(zzfcj zzfcj, Executor executor, zzdow zzdow, Context context, zzdrw zzdrw, zzfja zzfja, zzebk zzebk, zzdnr zzdnr) {
        this.zza = zzfcj;
        this.zzb = executor;
        this.zzc = zzdow;
        this.zze = context;
        this.zzf = zzdrw;
        this.zzg = zzfja;
        this.zzh = zzebk;
        this.zzd = zzdnr;
    }

    private final void zzh(zzcex zzcex) {
        zzj(zzcex);
        zzcex.zzag("/video", zzbjo.zzl);
        zzcex.zzag("/videoMeta", zzbjo.zzm);
        zzcex.zzag("/precache", new zzcdf());
        zzcex.zzag("/delayPageLoaded", zzbjo.zzp);
        zzcex.zzag("/instrument", zzbjo.zzn);
        zzcex.zzag("/log", zzbjo.zzg);
        zzcex.zzag("/click", new zzbin((zzdds) null, (zzcmk) null));
        if (this.zza.zzb != null) {
            zzcex.zzN().zzG(true);
            zzcex.zzag("/open", new zzbkb((zzb) null, (zzbsc) null, (zzebk) null, (zzdrw) null, (zzcmk) null));
        } else {
            zzcex.zzN().zzG(false);
        }
        if (zzv.zzo().zzp(zzcex.getContext())) {
            Map hashMap = new HashMap();
            if (zzcex.zzD() != null) {
                hashMap = zzcex.zzD().zzaw;
            }
            zzcex.zzag("/logScionEvent", new zzbjv(zzcex.getContext(), hashMap));
        }
    }

    private final void zzi(zzcex zzcex, zzcaa zzcaa) {
        if (!(this.zza.zza == null || zzcex.zzq() == null)) {
            zzcex.zzq().zzs(this.zza.zza);
        }
        zzcaa.zzb();
    }

    private static final void zzj(zzcex zzcex) {
        zzcex.zzag("/videoClicked", zzbjo.zzh);
        zzcex.zzN().zzI(true);
        zzcex.zzag("/getNativeAdViewSignals", zzbjo.zzs);
        zzcex.zzag("/getNativeClickMeta", zzbjo.zzt);
    }

    public final ListenableFuture zza(JSONObject jSONObject) {
        return zzgch.zzn(zzgch.zzn(zzgch.zzh((Object) null), new zzdly(this), this.zzb), new zzdlx(this, jSONObject), this.zzb);
    }

    public final ListenableFuture zzb(String str, String str2, zzfbo zzfbo, zzfbr zzfbr, zzs zzs) {
        return zzgch.zzn(zzgch.zzh((Object) null), new zzdlw(this, zzs, zzfbo, zzfbr, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, zzcex zzcex) throws Exception {
        zzblz zzblz = this.zza.zzb;
        zzcaa zza2 = zzcaa.zza(zzcex);
        if (zzblz != null) {
            zzcex.zzaj(zzcgr.zzd());
        } else {
            zzcex.zzaj(zzcgr.zze());
        }
        zzcex.zzN().zzC(new zzdma(this, zzcex, zza2));
        zzcex.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(zzs zzs, zzfbo zzfbo, zzfbr zzfbr, String str, String str2, Object obj) throws Exception {
        zzcex zza2 = this.zzc.zza(zzs, zzfbo, zzfbr);
        zzcaa zza3 = zzcaa.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzaj(zzcgr.zzd());
        } else {
            zzdno zzb2 = this.zzd.zzb();
            zzdno zzdno = zzb2;
            zzcgp zzN = zza2.zzN();
            zzb zzb3 = r11;
            zzb zzb4 = new zzb(this.zze, (zzbxu) null, (zzbus) null);
            zzN.zzV(zzb2, zzdno, zzb2, zzb2, zzb2, false, (zzbjs) null, zzb3, (zzbsj) null, (zzbxu) null, this.zzh, this.zzg, this.zzf, (zzbkj) null, zzb2, (zzbki) null, (zzbkc) null, (zzbjq) null, (zzcmk) null);
            zzj(zza2);
        }
        zza2.zzN().zzC(new zzdmb(this, zza2, zza3));
        zza2.zzae(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzcex zza2 = this.zzc.zza(zzs.zzc(), (zzfbo) null, (zzfbr) null);
        zzcaa zza3 = zzcaa.zza(zza2);
        zzh(zza2);
        zza2.zzN().zzJ(new zzdlz(zza3));
        zza2.loadUrl((String) zzbe.zzc().zza(zzbcl.zzdR));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcex zzcex, zzcaa zzcaa, boolean z, int i, String str, String str2) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdZ)).booleanValue()) {
            zzi(zzcex, zzcaa);
        } else if (z) {
            zzi(zzcex, zzcaa);
        } else {
            zzcaa.zzd(new zzegu(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcex zzcex, zzcaa zzcaa, boolean z, int i, String str, String str2) {
        if (z) {
            if (!(this.zza.zza == null || zzcex.zzq() == null)) {
                zzcex.zzq().zzs(this.zza.zza);
            }
            zzcaa.zzb();
            return;
        }
        zzcaa.zzd(new zzegu(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}

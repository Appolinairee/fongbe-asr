package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnl {
    /* access modifiers changed from: private */
    public final zzdmy zza = new zzdmy();
    private final zza zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzdrw zzd;
    private final Executor zze;
    private final zzava zzf;
    private final VersionInfoParcel zzg;
    private final zzbkf zzh = new zzbkf();
    /* access modifiers changed from: private */
    public final zzebk zzi;
    /* access modifiers changed from: private */
    public final zzfja zzj;
    private final zzebv zzk;
    private final zzfcn zzl;
    private ListenableFuture zzm;

    zzdnl(zzdni zzdni) {
        this.zzc = zzdni.zzb;
        this.zze = zzdni.zze;
        this.zzf = zzdni.zzf;
        this.zzg = zzdni.zzg;
        this.zzb = zzdni.zza;
        this.zzi = zzdni.zzd;
        this.zzj = zzdni.zzh;
        this.zzd = zzdni.zzc;
        this.zzk = zzdni.zzi;
        this.zzl = zzdni.zzj;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcex zza(zzcex zzcex) {
        zzcex zzcex2 = zzcex;
        zzcex2.zzag("/result", this.zzh);
        zzcgp zzN = zzcex.zzN();
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(this.zzc, (zzbxu) null, (zzbus) null);
        zzdmy zzdmy = this.zza;
        zzN.zzV((com.google.android.gms.ads.internal.client.zza) null, zzdmy, zzdmy, zzdmy, zzdmy, false, (zzbjs) null, zzb2, (zzbsj) null, (zzbxu) null, this.zzi, this.zzj, this.zzd, (zzbkj) null, (zzdds) null, (zzbki) null, (zzbkc) null, (zzbjq) null, (zzcmk) null);
        return zzcex2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzf(String str, JSONObject jSONObject, zzcex zzcex) throws Exception {
        return this.zzh.zzb(zzcex, str, jSONObject);
    }

    public final synchronized ListenableFuture zzg(String str, JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgch.zzh((Object) null);
        }
        return zzgch.zzn(listenableFuture, new zzdmz(this, str, jSONObject), this.zze);
    }

    public final synchronized void zzh(zzfbo zzfbo, zzfbr zzfbr, zzcmk zzcmk) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgch.zzr(listenableFuture, new zzdnf(this, zzfbo, zzfbr, zzcmk), this.zze);
        }
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgch.zzr(listenableFuture, new zzdnb(this), this.zze);
            this.zzm = null;
        }
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgch.zzr(listenableFuture, new zzdne(this, "sendMessageToNativeJs", map), this.zze);
        }
    }

    public final synchronized void zzk() {
        zzbcc zzbcc = zzbcl.zzdQ;
        ListenableFuture zzm2 = zzgch.zzm(zzgch.zzk(new zzcfi(this.zzc, this.zzf, this.zzg, this.zzb, this.zzk, this.zzl, (String) zzbe.zzc().zza(zzbcc)), zzbzw.zzf), new zzdna(this), this.zze);
        this.zzm = zzm2;
        zzbzz.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbjp zzbjp) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgch.zzr(listenableFuture, new zzdnc(this, str, zzbjp), this.zze);
        }
    }

    public final void zzm(WeakReference weakReference, String str, zzbjp zzbjp) {
        zzl(str, new zzdnj(this, weakReference, str, zzbjp, (zzdnk) null));
    }

    public final synchronized void zzn(String str, zzbjp zzbjp) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgch.zzr(listenableFuture, new zzdnd(this, str, zzbjp), this.zze);
        }
    }
}

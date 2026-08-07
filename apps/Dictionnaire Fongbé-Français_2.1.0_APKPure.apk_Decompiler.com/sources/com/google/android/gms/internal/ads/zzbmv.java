package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbmv implements zzbmn, zzbmm {
    private final zzcex zza;

    public zzbmv(Context context, VersionInfoParcel versionInfoParcel, zzava zzava, zza zza2) throws zzcfj {
        zzv.zzA();
        zzcex zza3 = zzcfk.zza(context, zzcgr.zza(), "", false, false, (zzava) null, (zzbds) null, versionInfoParcel, (zzbda) null, (zzn) null, (zza) null, zzbbj.zza(), (zzfbo) null, (zzfbr) null, (zzebv) null, (zzfcn) null);
        this.zza = zza3;
        zza3.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzbc.zzb();
        if (zzf.zzu()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (!zzs.zza.post(runnable)) {
            zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        zzs(new zzbmr(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbml.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbml.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbml.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zze.zza("loadHtml on adWebView from html");
        zzs(new zzbms(this, str));
    }

    public final void zzg(String str) {
        zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbmp(this, str));
    }

    public final void zzh(String str) {
        zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbmt(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaE();
    }

    public final zzbnu zzj() {
        return new zzbnu(this);
    }

    public final void zzk(zzbmy zzbmy) {
        zzcgp zzN = this.zza.zzN();
        Objects.requireNonNull(zzbmy);
        zzN.zzJ(new zzbmq(zzbmy));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbml.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbjp zzbjp) {
        this.zza.zzag(str, new zzbmu(this, zzbjp));
    }

    public final void zzr(String str, zzbjp zzbjp) {
        this.zza.zzaA(str, new zzbmo(zzbjp));
    }
}

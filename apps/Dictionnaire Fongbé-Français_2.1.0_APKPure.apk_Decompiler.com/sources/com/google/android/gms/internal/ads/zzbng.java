package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbng implements Runnable {
    final /* synthetic */ zzbnr zza;
    final /* synthetic */ zzbmn zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbns zze;

    zzbng(zzbns zzbns, zzbnr zzbnr, zzbmn zzbmn, ArrayList arrayList, long j) {
        this.zza = zzbnr;
        this.zzb = zzbmn;
        this.zzc = arrayList;
        this.zzd = j;
        this.zze = zzbns;
    }

    public final void run() {
        String str;
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.zze.zza) {
            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1) {
                if (this.zza.zze() != 1) {
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                        this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.zza.zzg();
                    }
                    zzgcs zzgcs = zzbzw.zzf;
                    zzbmn zzbmn = this.zzb;
                    Objects.requireNonNull(zzbmn);
                    zzgcs.execute(new zzbnf(zzbmn));
                    String valueOf = String.valueOf(zzbe.zzc().zza(zzbcl.zzc));
                    int zze2 = this.zza.zze();
                    int zza2 = this.zze.zzi;
                    if (this.zzc.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                    }
                    zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze2 + ". Update status(fullLoadTimeout) is " + zza2 + str + " ms. Total latency(fullLoadTimeout) is " + (zzv.zzC().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}

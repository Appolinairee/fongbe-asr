package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbns {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    /* access modifiers changed from: private */
    public final zzfhk zze;
    private final zzbd zzf;
    private final zzbd zzg;
    /* access modifiers changed from: private */
    public zzbnr zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzbns(Context context, VersionInfoParcel versionInfoParcel, String str, zzbd zzbd, zzbd zzbd2, zzfhk zzfhk) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfhk;
        this.zzf = zzbd;
        this.zzg = zzbd2;
    }

    public final zzbnm zzb(zzava zzava) {
        zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            zze.zza("getEngine: Lock acquired");
            zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                zze.zza("refreshIfDestroyed: Lock acquired");
                zzbnr zzbnr = this.zzh;
                if (zzbnr != null && this.zzi == 0) {
                    zzbnr.zzj(new zzbna(this), new zzbnb());
                }
            }
            zze.zza("refreshIfDestroyed: Lock released");
            zzbnr zzbnr2 = this.zzh;
            if (zzbnr2 != null) {
                if (zzbnr2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        zze.zza("getEngine (NO_UPDATE): Lock released");
                        zzbnm zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i == 1) {
                        this.zzi = 2;
                        zzd((zzava) null);
                        zze.zza("getEngine (PENDING_UPDATE): Lock released");
                        zzbnm zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zze.zza("getEngine (UPDATING): Lock released");
                        zzbnm zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            this.zzh = zzd((zzava) null);
            zze.zza("getEngine (NULL or REJECTED): Lock released");
            zzbnm zza5 = this.zzh.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzbnr zzd(zzava zzava) {
        zzfgw zza2 = zzfgv.zza(this.zzb, 6);
        zza2.zzi();
        zzbnr zzbnr = new zzbnr(this.zzg);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzbzw.zzf.execute(new zzbnc(this, (zzava) null, zzbnr));
        zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnr.zzj(new zzbnh(this, zzbnr, zza2), new zzbni(this, zzbnr, zza2));
        return zzbnr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzava zzava, zzbnr zzbnr) {
        long currentTimeMillis = zzv.zzC().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmv zzbmv = new zzbmv(this.zzb, this.zzd, (zzava) null, (zza) null);
            zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmv.zzk(new zzbmy(this, arrayList, currentTimeMillis, zzbnr, zzbmv));
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmv.zzq("/jsLoaded", new zzbnd(this, currentTimeMillis, zzbnr, zzbmv));
            zzby zzby = new zzby();
            zzbne zzbne = new zzbne(this, (zzava) null, zzbmv, zzby);
            zzby.zzb(zzbne);
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmv.zzq("/requestReload", zzbne);
            zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmv.zzh(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmv.zzf(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmv.zzg(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            zzs.zza.postDelayed(new zzbng(this, zzbnr, zzbmv, arrayList, currentTimeMillis), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzc)).intValue());
        } catch (Throwable th) {
            zzo.zzh("Error creating webview.", th);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                zzbnr.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhD)).booleanValue()) {
                zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnr.zzg();
                return;
            }
            zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbnr.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzbnr zzbnr, zzbmn zzbmn, ArrayList arrayList, long j) {
        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbnr.zze() != -1) {
                if (zzbnr.zze() != 1) {
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                        zzbnr.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnr.zzg();
                    }
                    zzgcs zzgcs = zzbzw.zzf;
                    Objects.requireNonNull(zzbmn);
                    zzgcs.execute(new zzbmx(zzbmn));
                    String valueOf = String.valueOf(zzbe.zzc().zza(zzbcl.zzb));
                    int zze2 = zzbnr.zze();
                    int i = this.zzi;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    long currentTimeMillis = zzv.zzC().currentTimeMillis() - j;
                    zze.zza("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zze2 + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + currentTimeMillis + " ms. Rejecting.");
                    zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbmn zzbmn) {
        if (zzbmn.zzi()) {
            this.zzi = 1;
        }
    }
}

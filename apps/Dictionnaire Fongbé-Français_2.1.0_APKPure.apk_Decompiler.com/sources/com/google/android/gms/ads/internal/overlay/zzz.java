package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfse;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzftb;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftq;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzz {
    private String zza = null;
    private String zzb = null;
    private zzcex zzc = null;
    private zzfse zzd = null;
    private boolean zze = false;
    private zzftb zzf;

    private final zzftd zzl() {
        zzftc zzc2 = zzftd.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        return zzc2.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zza(zzcex zzcex, Context context) {
        this.zzc = zzcex;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfse zzfse;
        if (!this.zze || (zzfse = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfse.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
    }

    public final void zzc() {
        zzfse zzfse;
        if (!this.zze || (zzfse = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfsc zzc2 = zzfsd.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        zzfse.zzb(zzc2.zzc(), this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str, Map map) {
        zzbzw.zzf.execute(new zzx(this, str, map));
    }

    /* access modifiers changed from: package-private */
    public final void zzf(String str, String str2) {
        zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfse zzfse;
        if (!this.zze || (zzfse = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfse.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str, Map map) {
        zzcex zzcex = this.zzc;
        if (zzcex != null) {
            zzcex.zzd(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzfta zzfta) {
        if (!TextUtils.isEmpty(zzfta.zzb())) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
                this.zza = zzfta.zzb();
            }
        }
        switch (zzfta.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfta.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    public final void zzj(zzcex zzcex, zzfsy zzfsy) {
        if (zzcex == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcex;
        if (this.zze || zzk(zzcex.getContext())) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
                this.zzb = zzfsy.zzh();
            }
            zzm();
            zzfse zzfse = this.zzd;
            if (zzfse != null) {
                zzfse.zzd(zzfsy, this.zzf);
                return;
            }
            return;
        }
        zzf("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzftq.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfsf.zza(context);
        } catch (NullPointerException e) {
            zze.zza("Error connecting LMD Overlay service");
            zzv.zzp().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}

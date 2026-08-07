package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdvg implements zzr, zzcgn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzduv zzc;
    private zzcex zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzdl zzh;
    private boolean zzi;

    zzdvg(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(zzdl zzdl) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdl.zze(zzfdk.zzd(16, (String) null, (zze) null));
            } catch (RemoteException unused) {
            }
        } else if (this.zzc == null) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdl.zze(zzfdk.zzd(16, (String) null, (zze) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.zze && !this.zzf) {
                if (zzv.zzC().currentTimeMillis() >= this.zzg + ((long) ((Integer) zzbe.zzc().zza(zzbcl.zziQ)).intValue())) {
                    return true;
                }
            }
            zzo.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdl.zze(zzfdk.zzd(19, (String) null, (zze) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzo.zzj("Ad inspector failed to load.");
        try {
            zzbzm zzp = zzv.zzp();
            zzp.zzw(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            zzdl zzdl = this.zzh;
            if (zzdl != null) {
                zzdl.zze(zzfdk.zzd(17, (String) null, (zze) null));
            }
        } catch (RemoteException e) {
            zzv.zzp().zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    public final void zzdE() {
    }

    public final void zzdi() {
    }

    public final void zzdo() {
    }

    public final synchronized void zzdp() {
        this.zzf = true;
        zzk("");
    }

    public final void zzdr() {
    }

    public final synchronized void zzds(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            zzdl zzdl = this.zzh;
            if (zzdl != null) {
                try {
                    zzdl.zze((zze) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcex zzcex = this.zzd;
        if (zzcex == null || zzcex.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzduv zzduv) {
        this.zzc = zzduv;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str) {
        JSONObject zze2 = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze2.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze2.toString());
    }

    public final synchronized void zzj(zzdl zzdl, zzbkj zzbkj, zzbkc zzbkc, zzbjq zzbjq) {
        zzdl zzdl2 = zzdl;
        synchronized (this) {
            if (zzl(zzdl)) {
                try {
                    zzv.zzA();
                    zzcex zza2 = zzcfk.zza(this.zza, zzcgr.zza(), "", false, false, (zzava) null, (zzbds) null, this.zzb, (zzbda) null, (zzn) null, (zza) null, zzbbj.zza(), (zzfbo) null, (zzfbr) null, (zzebv) null, (zzfcn) null);
                    this.zzd = zza2;
                    zzcgp zzN = zza2.zzN();
                    if (zzN == null) {
                        zzo.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                            zzdl2.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                        } catch (RemoteException e) {
                            zzv.zzp().zzw(e, "InspectorUi.openInspector 3");
                        }
                    } else {
                        this.zzh = zzdl2;
                        zzN.zzV((com.google.android.gms.ads.internal.client.zza) null, (zzbif) null, (zzr) null, (zzbih) null, (zzac) null, false, (zzbjs) null, (zzb) null, (zzbsj) null, (zzbxu) null, (zzebk) null, (zzfja) null, (zzdrw) null, zzbkj, (zzdds) null, new zzbki(this.zza), zzbkc, zzbjq, (zzcmk) null);
                        zzN.zzC(this);
                        this.zzd.loadUrl((String) zzbe.zzc().zza(zzbcl.zziO));
                        zzv.zzj();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, (zzdrw) null);
                        this.zzg = zzv.zzC().currentTimeMillis();
                    }
                } catch (zzcfj e2) {
                    zzo.zzk("Failed to obtain a web view for the ad inspector", e2);
                    try {
                        zzv.zzp().zzw(e2, "InspectorUi.openInspector 0");
                        zzdl2.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                    } catch (RemoteException e3) {
                        zzv.zzp().zzw(e3, "InspectorUi.openInspector 1");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zzf     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzdvf r1 = new com.google.android.gms.internal.ads.zzdvf     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvg.zzk(java.lang.String):void");
    }
}

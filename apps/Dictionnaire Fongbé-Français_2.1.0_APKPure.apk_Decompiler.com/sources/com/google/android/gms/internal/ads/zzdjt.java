package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdjt {
    private final zzdow zza;
    private final zzdnl zzb;
    private final zzcnr zzc;
    private final zzdin zzd;

    public zzdjt(zzdow zzdow, zzdnl zzdnl, zzcnr zzcnr, zzdin zzdin) {
        this.zza = zzdow;
        this.zzb = zzdnl;
        this.zzc = zzcnr;
        this.zzd = zzdin;
    }

    public final View zza() throws zzcfj {
        zzcex zza2 = this.zza.zza(zzs.zzc(), (zzfbo) null, (zzfbr) null);
        zza2.zzF().setVisibility(8);
        zza2.zzag("/sendMessageToSdk", new zzdjn(this));
        zza2.zzag("/adMuted", new zzdjo(this));
        this.zzb.zzm(new WeakReference(zza2), "/loadHtml", new zzdjp(this));
        this.zzb.zzm(new WeakReference(zza2), "/showOverlay", new zzdjq(this));
        this.zzb.zzm(new WeakReference(zza2), "/hideOverlay", new zzdjr(this));
        return zza2.zzF();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcex zzcex, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcex zzcex, Map map) {
        this.zzd.zzh();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcex zzcex, Map map) {
        zzo.zzi("Showing native ads overlay.");
        zzcex.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcex zzcex, Map map) {
        zzo.zzi("Hiding native ads overlay.");
        zzcex.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}

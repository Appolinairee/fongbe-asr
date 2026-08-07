package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefq implements zzefk {
    private final zzdgq zza;
    private final zzgcs zzb;
    private final zzdla zzc;
    private final zzfdi zzd;
    private final zzdnr zze;
    private final zzdrq zzf;

    public zzefq(zzdgq zzdgq, zzgcs zzgcs, zzdla zzdla, zzfdi zzfdi, zzdnr zzdnr, zzdrq zzdrq) {
        this.zza = zzdgq;
        this.zzb = zzgcs;
        this.zzc = zzdla;
        this.zzd = zzfdi;
        this.zze = zzdnr;
        this.zzf = zzdrq;
    }

    private final ListenableFuture zzg(zzfca zzfca, zzfbo zzfbo, JSONObject jSONObject) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzfdi zzfdi = this.zzd;
        zzdla zzdla = this.zzc;
        ListenableFuture zza2 = zzfdi.zza();
        ListenableFuture zza3 = zzdla.zza(zzfca, zzfbo, jSONObject);
        return zzgch.zzc(zza2, zza3).zza(new zzefl(this, zza3, zza2, zzfca, zzfbo, jSONObject), this.zzb);
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        return zzgch.zzn(zzgch.zzn(this.zzd.zza(), new zzefn(this, zzfbo), this.zzb), new zzefo(this, zzfca, zzfbo), this.zzb);
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        zzfbt zzfbt = zzfbo.zzs;
        return (zzfbt == null || zzfbt.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdia zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfca zzfca, zzfbo zzfbo, JSONObject jSONObject) throws Exception {
        zzdif zzdif = (zzdif) listenableFuture.get();
        zzdnl zzdnl = (zzdnl) listenableFuture2.get();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        }
        zzdig zzd2 = this.zza.zzd(new zzcrp(zzfca, zzfbo, (String) null), new zzdir(zzdif), new zzdhd(jSONObject, zzdnl));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            this.zzf.zza().putLong(zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            this.zzf.zza().putLong(zzdre.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd2.zzh().zzb();
        zzd2.zzi().zza(zzdnl);
        zzd2.zzg().zza(zzdif.zzs());
        zzd2.zzl().zza(this.zze, zzdif.zzq());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(zzdre.RENDERING_CONFIGURE_WEBVIEW_END.zza(), zzv.zzC().currentTimeMillis());
        }
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(zzdnl zzdnl, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgch.zzh(zzdnl));
        if (jSONObject.optBoolean("success")) {
            return zzgch.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnv("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(zzfbo zzfbo, zzdnl zzdnl) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziA)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbo.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgch.zzn(zzdnl.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzefm(this, zzdnl), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzf(zzfca zzfca, zzfbo zzfbo, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgch.zzg(new zzdvy(3));
        }
        if (zzfca.zza.zza.zzk <= 1) {
            return zzgch.zzm(zzg(zzfca, zzfbo, jSONArray.getJSONObject(0)), new zzefp(), this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcn)).booleanValue()) {
            this.zzf.zzc("nsl", String.valueOf(length));
        }
        this.zzd.zzc(Math.min(length, zzfca.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfca.zza.zza.zzk);
        for (int i = 0; i < zzfca.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfca, zzfbo, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzgch.zzg(new zzdvy(3)));
            }
        }
        return zzgch.zzh(arrayList);
    }
}

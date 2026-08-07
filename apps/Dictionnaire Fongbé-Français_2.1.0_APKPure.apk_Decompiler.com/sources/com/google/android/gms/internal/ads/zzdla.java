package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdla {
    private final zzgcs zza;
    private final zzdlp zzb;
    private final zzdlu zzc;

    public zzdla(zzgcs zzgcs, zzdlp zzdlp, zzdlu zzdlu) {
        this.zza = zzgcs;
        this.zzb = zzdlp;
        this.zzc = zzdlu;
    }

    static final /* synthetic */ zzdif zzb(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) throws Exception {
        zzdif zzdif = (zzdif) listenableFuture.get();
        zzdif.zzP((List) listenableFuture2.get());
        zzdif.zzM((zzbfw) listenableFuture3.get());
        zzdif.zzQ((zzbfw) listenableFuture4.get());
        zzdif.zzJ((zzbfp) listenableFuture5.get());
        zzdif.zzS(zzdlp.zzj(jSONObject));
        zzdif.zzL(zzdlp.zzi(jSONObject));
        zzcex zzcex = (zzcex) listenableFuture6.get();
        if (zzcex != null) {
            zzdif.zzad(zzcex);
            zzdif.zzac(zzcex.zzF());
            zzdif.zzab(zzcex.zzq());
        }
        zzdif.zzd().putAll((Bundle) listenableFuture7.get());
        zzcex zzcex2 = (zzcex) listenableFuture8.get();
        if (zzcex2 != null) {
            zzdif.zzO(zzcex2);
            zzdif.zzae(zzcex2.zzF());
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            zzcex zzcex3 = (zzcex) listenableFuture9.get();
            if (zzcex3 != null) {
                zzdif.zzT(zzcex3);
            }
        } else {
            zzdif.zzU(listenableFuture9);
            zzdif.zzX(new zzcab());
        }
        for (zzdlt zzdlt : (List) listenableFuture10.get()) {
            if (zzdlt.zza != 1) {
                zzdif.zzN(zzdlt.zzb, zzdlt.zzd);
            } else {
                zzdif.zzZ(zzdlt.zzb, zzdlt.zzc);
            }
        }
        return zzdif;
    }

    private static final boolean zzc(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo, JSONObject jSONObject) {
        zzcab zzcab;
        ListenableFuture zzn;
        zzfca zzfca2 = zzfca;
        zzfbo zzfbo2 = zzfbo;
        JSONObject jSONObject2 = jSONObject;
        ListenableFuture zzb2 = this.zza.zzb(new zzdkv(this, zzfca2, zzfbo2, jSONObject2));
        ListenableFuture zzf = this.zzb.zzf(jSONObject2, "images");
        zzfbr zzfbr = zzfca2.zzb.zzb;
        zzdlp zzdlp = this.zzb;
        ListenableFuture zzg = zzdlp.zzg(jSONObject2, "images", zzfbo2, zzfbr);
        ListenableFuture zze = zzdlp.zze(jSONObject2, "secondary_image");
        ListenableFuture zze2 = zzdlp.zze(jSONObject2, "app_icon");
        ListenableFuture zzd = zzdlp.zzd(jSONObject2, "attribution");
        ListenableFuture zzh = this.zzb.zzh(jSONObject2, zzfbo2, zzfca2.zzb.zzb);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzmO)).booleanValue() || ((Integer) ProcessUtils$$ExternalSyntheticApiModelOutline0.m((Object) jSONObject2.optJSONObject("video")).map(new zzdkw()).map(new zzdkx()).map(new zzdky()).orElse(0)).intValue() != 3) {
            zzcab = zzgch.zzh(new Bundle());
        } else {
            zzdlp zzdlp2 = this.zzb;
            zzcab zzcab2 = new zzcab();
            zzgch.zzr(zzh, new zzdlo(zzdlp2, zzcab2), zzbzw.zzf);
            zzcab = zzcab2;
        }
        ListenableFuture zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        zzdlp zzdlp3 = this.zzb;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzn = zzgch.zzh((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgch.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgch.zzh((Object) null);
                } else {
                    zzn = zzgch.zzn(zzgch.zzh((Object) null), new zzdle(zzdlp3, optString), zzbzw.zzf);
                }
            }
        }
        ListenableFuture listenableFuture = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb2);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zzcab);
        arrayList.add(zza2);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(listenableFuture);
        }
        return zzgch.zza(arrayList).zza(new zzdkz(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzcab, zzg, listenableFuture, zza2), this.zza);
    }
}

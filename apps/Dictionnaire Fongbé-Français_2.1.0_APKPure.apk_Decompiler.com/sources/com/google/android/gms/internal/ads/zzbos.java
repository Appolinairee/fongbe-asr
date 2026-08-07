package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbos implements zzgbo {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbos(ListenableFuture listenableFuture, String str, zzbnz zzbnz, zzbny zzbny) {
        this.zzb = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(Object obj) {
        return zzgch.zzn(this.zzb, new zzboq(this, obj), zzbzw.zzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbnt zzbnt) throws Exception {
        zzcab zzcab = new zzcab();
        zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzbjo.zzo.zzc(uuid, new zzbor(this, zzcab));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbnt.zzl(this.zza, jSONObject);
        return zzcab;
    }
}

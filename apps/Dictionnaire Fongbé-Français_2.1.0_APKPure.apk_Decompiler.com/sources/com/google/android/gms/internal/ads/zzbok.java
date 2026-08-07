package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbok implements zzbnw {
    /* access modifiers changed from: private */
    public final zzbny zza;
    private final zzbnz zzb;
    private final zzbns zzc;
    private final String zzd;

    zzbok(zzbns zzbns, String str, zzbnz zzbnz, zzbny zzbny) {
        this.zzc = zzbns;
        this.zzd = str;
        this.zzb = zzbnz;
        this.zza = zzbny;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbok zzbok, zzbnm zzbnm, zzbnt zzbnt, Object obj, zzcab zzcab) {
        try {
            zzv.zzq();
            String uuid = UUID.randomUUID().toString();
            zzbjo.zzo.zzc(uuid, new zzboj(zzbok, zzbnm, zzcab));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbok.zzb.zzb(obj));
            zzbnt.zzl(zzbok.zzd, jSONObject);
        } catch (Exception e) {
            zzcab.zzd(e);
            zzo.zzh("Unable to invokeJavascript", e);
            zzbnm.zzb();
        } catch (Throwable th) {
            zzbnm.zzb();
            throw th;
        }
    }

    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(Object obj) {
        zzcab zzcab = new zzcab();
        zzbnm zzb2 = this.zzc.zzb((zzava) null);
        zze.zza("callJs > getEngine: Promise created");
        zzb2.zzj(new zzboh(this, zzb2, obj, zzcab), new zzboi(this, zzcab, zzb2));
        return zzcab;
    }
}

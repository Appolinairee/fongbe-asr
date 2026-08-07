package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbcd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbcc zza2 : this.zzb) {
            String str = (String) zzbe.zzc().zza(zza2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcm.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbcc zza3 : this.zzc) {
            String str = (String) zzbe.zzc().zza(zza3);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbcm.zzb());
        return zza2;
    }

    public final void zzc(zzbcc zzbcc) {
        this.zzb.add(zzbcc);
    }

    public final void zzd(zzbcc zzbcc) {
        this.zza.add(zzbcc);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbcc zzbcc : this.zza) {
            if (zzbcc.zze() == 1) {
                zzbcc.zzd(editor, zzbcc.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzo.zzg("Flag Json is null.");
        }
    }
}

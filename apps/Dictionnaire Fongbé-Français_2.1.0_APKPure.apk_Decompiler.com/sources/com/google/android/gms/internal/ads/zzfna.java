package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfna extends zzfmv {
    public zzfna(zzfmo zzfmo, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmo, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfmg.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzflk zza;
        if (!TextUtils.isEmpty(str) && (zza = zzflk.zza()) != null) {
            for (zzfkt zzfkt : zza.zzc()) {
                if (this.zza.contains(zzfkt.zzh())) {
                    zzfkt.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}

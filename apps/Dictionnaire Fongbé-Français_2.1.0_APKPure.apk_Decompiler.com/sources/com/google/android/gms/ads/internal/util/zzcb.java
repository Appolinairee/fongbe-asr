package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcb {
    private final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    private final Context zzc;

    zzcb(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            } else {
                sharedPreferences = this.zzc.getSharedPreferences(str, 0);
            }
            zzca zzca = new zzca(this, str);
            this.zza.put(str, zzca);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzca);
        }
    }

    public final void zzc() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            zzv.zzq();
            Map zzw = zzs.zzw((String) zzbe.zzc().zza(zzbcl.zzkr));
            for (String zzb2 : zzw.keySet()) {
                zzb(zzb2);
            }
            zzd(new zzbz(zzw));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzbz zzbz) {
        this.zzb.add(zzbz);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbtz extends zzbts {
    final /* synthetic */ List zza;

    zzbtz(zzbub zzbub, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzo.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzo.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}

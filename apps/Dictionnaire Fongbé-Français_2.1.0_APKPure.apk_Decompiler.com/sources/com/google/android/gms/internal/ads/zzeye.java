package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeye implements zzgbo {
    public final /* synthetic */ zzfef zza;
    public final /* synthetic */ zzcsd zzb;

    public /* synthetic */ zzeye(zzeyg zzeyg, zzfef zzfef, zzcsd zzcsd) {
        this.zza = zzfef;
        this.zzb = zzcsd;
    }

    public final ListenableFuture zza(Object obj) {
        zzfca zzfca = (zzfca) obj;
        this.zza.zzb = zzfca;
        Iterator it = zzfca.zzb.zza.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfbo) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return this.zzb.zzh(zzgch.zzh(zzfca));
            }
        }
        return zzgch.zzh((Object) null);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfcv {
    private final zzfbo zza;
    private final zzfbr zzb;
    private final zzfja zzc;
    private final zzfir zzd;
    private final zzfhh zze;
    private final zzcmk zzf;

    public zzfcv(zzfja zzfja, zzfir zzfir, zzfbo zzfbo, zzfbr zzfbr, zzcmk zzcmk, zzfhh zzfhh) {
        this.zza = zzfbo;
        this.zzb = zzfbr;
        this.zzc = zzfja;
        this.zzd = zzfir;
        this.zzf = zzcmk;
        this.zze = zzfhh;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        zzfbo zzfbo = this.zza;
        if (!zzfbo.zzai) {
            this.zzc.zzd(str, zzfbo.zzax, this.zze);
            return;
        }
        this.zzd.zza(str, this.zzb.zzb, i);
    }

    public final void zzc(List list, int i) {
        ListenableFuture listenableFuture;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || !zzcmk.zzj(str)) {
                listenableFuture = zzgch.zzh(str);
            } else {
                listenableFuture = this.zzf.zzb(str, zzbc.zze());
            }
            zzgch.zzr(listenableFuture, new zzfcu(this, i), zzbzw.zza);
        }
    }
}

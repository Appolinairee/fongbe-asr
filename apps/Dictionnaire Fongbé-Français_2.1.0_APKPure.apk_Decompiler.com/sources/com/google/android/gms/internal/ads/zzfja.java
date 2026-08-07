package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfja {
    private final Context zza;
    private final Executor zzb;
    private final zzgct zzc;
    private final zzu zzd;
    private final zzfir zze;
    /* access modifiers changed from: private */
    public final zzfhk zzf;

    zzfja(Context context, Executor executor, zzgct zzgct, zzu zzu, zzfir zzfir, zzfhk zzfhk) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgct;
        this.zzd = zzu;
        this.zze = zzfir;
        this.zzf = zzfhk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzt zza(String str) throws Exception {
        return this.zzd.zza(str);
    }

    public final void zzd(String str, zzv zzv, zzfhh zzfhh) {
        if (!zzfhk.zza() || !((Boolean) zzbee.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzfiy(this, str, zzv));
            return;
        }
        zzfgw zza2 = zzfgv.zza(this.zza, 14);
        zza2.zzi();
        zzgch.zzr(zzc(str, zzv), new zzfiz(this, zza2, zzfhh), this.zzb);
    }

    public final void zze(List list, zzv zzv) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), zzv, (zzfhh) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final ListenableFuture zzc(String str, zzv zzv) {
        if (zzv == null) {
            return this.zzc.zzb(new zzfix(this, str));
        }
        return new zzfiq(zzv.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
    }
}

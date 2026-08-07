package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfji extends zzfkh {
    public zzfji(ClientApi clientApi, Context context, int i, zzbpe zzbpe, zzft zzft, zzcf zzcf, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjg, Clock clock) {
        super(clientApi, context, i, zzbpe, zzft, zzcf, scheduledExecutorService, zzfjg, clock);
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zza() {
        zzgdb zze = zzgdb.zze();
        zzby zze2 = this.zza.zze(ObjectWrapper.wrap(this.zzb), new zzs(), this.zze.zza, this.zzd, this.zzc);
        if (zze2 != null) {
            try {
                zze2.zzy(this.zze.zzc, new zzfjh(this, zze, zze2));
            } catch (RemoteException e) {
                zzo.zzk("Failed to load interstitial ad.", e);
                zze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfjc(1, "Failed to create an interstitial ad manager."));
        }
        return zze;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m((Object) ((zzby) obj).zzk());
        } catch (RemoteException e) {
            zzo.zzf("Failed to get response info for  the interstitial ad.", e);
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        }
    }
}

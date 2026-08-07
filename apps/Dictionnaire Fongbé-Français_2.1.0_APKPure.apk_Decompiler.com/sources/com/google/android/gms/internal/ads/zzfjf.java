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
public final class zzfjf extends zzfkh {
    public zzfjf(ClientApi clientApi, Context context, int i, zzbpe zzbpe, zzft zzft, zzcf zzcf, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjg, Clock clock) {
        super(clientApi, context, i, zzbpe, zzft, zzcf, scheduledExecutorService, zzfjg, clock);
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zza() {
        zzgdb zze = zzgdb.zze();
        zzby zzc = this.zza.zzc(ObjectWrapper.wrap(this.zzb), zzs.zzb(), this.zze.zza, this.zzd, this.zzc);
        if (zzc != null) {
            try {
                zzc.zzH(new zzfje(this, zze, this.zze));
                zzc.zzab(this.zze.zzc);
            } catch (RemoteException e) {
                zzo.zzk("Failed to load app open ad.", e);
                zze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfjc(1, "Failed to create an app open ad manager."));
        }
        return zze;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m((Object) ((zzbad) obj).zzf());
        } catch (RemoteException e) {
            zzo.zzf("Failed to get response info for the app open ad.", e);
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        }
    }
}

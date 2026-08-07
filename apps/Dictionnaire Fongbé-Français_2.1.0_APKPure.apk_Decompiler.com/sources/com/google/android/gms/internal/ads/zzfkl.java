package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfkl extends zzfkh {
    public zzfkl(ClientApi clientApi, Context context, int i, zzbpe zzbpe, zzft zzft, zzcf zzcf, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjg, Clock clock) {
        super(clientApi, context, i, zzbpe, zzft, zzcf, scheduledExecutorService, zzfjg, clock);
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zza() {
        zzgdb zze = zzgdb.zze();
        zzbwp zzp = this.zza.zzp(ObjectWrapper.wrap(this.zzb), this.zze.zza, this.zzd, this.zzc);
        zzfkk zzfkk = new zzfkk(this, zze, zzp);
        if (zzp != null) {
            try {
                zzp.zzf(this.zze.zzc, zzfkk);
            } catch (RemoteException unused) {
                zzo.zzj("Failed to load rewarded ad.");
                zze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfjc(1, "Failed to create a rewarded ad."));
        }
        return zze;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m((Object) ((zzbwp) obj).zzc());
        } catch (RemoteException e) {
            zzo.zzf("Failed to get response info for the rewarded ad.", e);
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        }
    }
}

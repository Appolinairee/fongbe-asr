package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbbf {
    /* access modifiers changed from: private */
    public zzbau zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzbbf(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzbav zzbav) {
        zzbaz zzbaz = new zzbaz(this);
        zzbbd zzbbd = new zzbbd(this, zzbav, zzbaz);
        zzbbe zzbbe = new zzbbe(this, zzbaz);
        synchronized (this.zzd) {
            zzbau zzbau = new zzbau(this.zzc, zzv.zzu().zzb(), zzbbd, zzbbe);
            this.zza = zzbau;
            zzbau.checkAvailabilityAndConnect();
        }
        return zzbaz;
    }

    static /* bridge */ /* synthetic */ void zze(zzbbf zzbbf) {
        synchronized (zzbbf.zzd) {
            zzbau zzbau = zzbbf.zza;
            if (zzbau != null) {
                zzbau.disconnect();
                zzbbf.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }
}

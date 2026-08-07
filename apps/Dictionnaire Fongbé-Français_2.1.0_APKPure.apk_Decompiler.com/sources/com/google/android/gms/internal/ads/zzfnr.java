package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfnr implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfop zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfni zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzfnr(Context context, int i, int i2, String str, String str2, String str3, zzfni zzfni) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfni;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfop zzfop = new zzfop(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfop;
        this.zzd = new LinkedBlockingQueue();
        zzfop.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzfou zzc2 = zzc();
        if (zzc2 != null) {
            try {
                zzfpb zzf2 = zzc2.zzf(new zzfoz(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, (Exception) null);
            this.zzd.put(new zzfpb((byte[]) null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzg, (Exception) null);
            this.zzd.put(new zzfpb((byte[]) null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpb zza(int i) {
        zzfpb zzfpb;
        try {
            zzfpb = (zzfpb) this.zzd.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzg, e);
            zzfpb = null;
        }
        zzd(3004, this.zzg, (Exception) null);
        if (zzfpb != null) {
            if (zzfpb.zzc == 7) {
                zzfni.zzg(3);
            } else {
                zzfni.zzg(2);
            }
        }
        return zzfpb == null ? new zzfpb((byte[]) null, 1) : zzfpb;
    }

    public final void zzb() {
        zzfop zzfop = this.zza;
        if (zzfop == null) {
            return;
        }
        if (zzfop.isConnected() || this.zza.isConnecting()) {
            this.zza.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final zzfou zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}

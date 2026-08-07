package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzzq extends HandlerThread implements Handler.Callback {
    private zzdd zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzs zze;

    public zzzq() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzdd zzdd = this.zza;
                if (zzdd != null) {
                    zzdd.zzb(i2);
                    this.zze = new zzzs(this, this.zza.zza(), i2 != 0, (zzzr) null);
                    synchronized (this) {
                        notify();
                    }
                } else {
                    throw null;
                }
            } catch (RuntimeException e) {
                zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzd = e;
                synchronized (this) {
                    notify();
                }
            } catch (zzde e2) {
                zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzd = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzc = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
        } else if (i == 2) {
            try {
                zzdd zzdd2 = this.zza;
                if (zzdd2 != null) {
                    zzdd2.zzc();
                    quit();
                    return true;
                }
                throw null;
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
        }
        return true;
    }

    public final zzzs zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdd(this.zzb, (zzdc) null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzzs zzzs = this.zze;
                zzzs.getClass();
                zzzs zzzs2 = zzzs;
                return zzzs;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzabb {
    private final Handler zza;
    private final zzabc zzb;

    public zzabb(Handler handler, zzabc zzabc) {
        if (zzabc != null) {
            Handler handler2 = handler;
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzabc;
    }

    public final void zza(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaar(this, str, j, j2));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaba(this, str));
        }
    }

    public final void zzc(zzhs zzhs) {
        zzhs.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaaz(this, zzhs));
        }
    }

    public final void zzd(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaat(this, i, j));
        }
    }

    public final void zze(zzhs zzhs) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaax(this, zzhs));
        }
    }

    public final void zzf(zzab zzab, zzht zzht) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaay(this, zzab, zzht));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzp(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzq(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzhs zzhs) {
        zzhs.zza();
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzr(zzhs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzl(i, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzhs zzhs) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzs(zzhs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzab zzab, zzht zzht) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzu(zzab, zzht);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzm(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzt(j, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzo(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzcd zzcd) {
        int i = zzei.zza;
        zzabc zzabc = this.zzb;
        zzabc zzabc2 = zzabc;
        zzabc.zzv(zzcd);
    }

    public final void zzq(Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaau(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaav(this, j, i));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaaw(this, exc));
        }
    }

    public final void zzt(zzcd zzcd) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaas(this, zzcd));
        }
    }
}

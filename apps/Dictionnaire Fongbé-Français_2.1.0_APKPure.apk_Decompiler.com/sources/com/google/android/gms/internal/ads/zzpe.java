package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzpe {
    private final Handler zza;
    private final zzpf zzb;

    public zzpe(Handler handler, zzpf zzpf) {
        if (zzpf != null) {
            Handler handler2 = handler;
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzpf;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzoy(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzoz(this, exc));
        }
    }

    public final void zzc(zzpg zzpg) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzow(this, zzpg));
        }
    }

    public final void zzd(zzpg zzpg) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzox(this, zzpg));
        }
    }

    public final void zze(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpc(this, str, j, j2));
        }
    }

    public final void zzf(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpd(this, str));
        }
    }

    public final void zzg(zzhs zzhs) {
        zzhs.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzot(this, zzhs));
        }
    }

    public final void zzh(zzhs zzhs) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzos(this, zzhs));
        }
    }

    public final void zzi(zzab zzab, zzht zzht) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpa(this, zzab, zzht));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Exception exc) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zza(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Exception exc) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzh(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzpg zzpg) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzi(zzpg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzpg zzpg) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzj(zzpg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzb(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzc(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzhs zzhs) {
        zzhs.zza();
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzd(zzhs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(zzhs zzhs) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zze(zzhs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(zzab zzab, zzht zzht) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzf(zzab, zzht);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzs(long j) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzg(j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(boolean z) {
        int i = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzn(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzei.zza;
        zzpf zzpf = this.zzb;
        zzpf zzpf2 = zzpf;
        zzpf.zzk(i, j, j2);
    }

    public final void zzv(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzou(this, j));
        }
    }

    public final void zzw(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpb(this, z));
        }
    }

    public final void zzx(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzov(this, i, j, j2));
        }
    }
}

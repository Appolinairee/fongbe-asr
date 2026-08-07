package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcem extends zzcay {
    private final zzcbt zzc;
    private zzcen zzd;
    private Uri zze;
    private zzcax zzf;
    private boolean zzg = false;
    private int zzh = 1;

    public zzcem(Context context, zzcbt zzcbt) {
        super(context);
        this.zzc = zzcbt;
        zzcbt.zza(this);
    }

    @EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzm() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    public final int zza() {
        return 0;
    }

    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    public final int zzd() {
        return 0;
    }

    public final int zze() {
        return 0;
    }

    public final long zzf() {
        return 0;
    }

    public final long zzg() {
        return 0;
    }

    public final long zzh() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzd();
        }
    }

    public final String zzj() {
        return "ImmersivePlayer";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            if (!this.zzg) {
                zzcax.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzf();
        }
    }

    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    public final void zzo() {
        zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            zzs.zza.post(new zzcel(this));
        }
    }

    public final void zzp() {
        zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            zzs.zza.post(new zzcek(this));
        }
    }

    public final void zzq(int i) {
        zze.zza("AdImmersivePlayerView seek " + i);
    }

    public final void zzr(zzcax zzcax) {
        this.zzf = zzcax;
    }

    public final void zzs(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcen(parse.toString());
            zzv(3);
            zzs.zza.post(new zzcej(this));
        }
    }

    public final void zzt() {
        zze.zza("AdImmersivePlayerView stop");
        zzcen zzcen = this.zzd;
        if (zzcen != null) {
            zzcen.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    public final void zzu(float f, float f2) {
    }
}

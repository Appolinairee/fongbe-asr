package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbbq;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdql implements zzcyq, zzcxh, zzcvw, zzcwn, zza, zzdbc {
    private final zzbbj zza;
    private boolean zzb = false;

    public zzdql(zzbbj zzbbj, @Nullable zzezj zzezj) {
        this.zza = zzbbj;
        zzbbj.zzc(2);
        if (zzezj != null) {
            zzbbj.zzc(1101);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zzdl(zzbvk zzbvk) {
    }

    public final void zzdm(zzfca zzfca) {
        this.zza.zzb(new zzdqh(zzfca));
    }

    public final void zzdz(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(TypedValues.TYPE_TARGET);
                return;
            case 2:
                this.zza.zzc(LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(LocationRequestCompat.QUALITY_LOW_POWER);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzh() {
        this.zza.zzc(1109);
    }

    public final void zzi(zzbbq.zzb zzb2) {
        this.zza.zzb(new zzdqk(zzb2));
        this.zza.zzc(1103);
    }

    public final void zzj(zzbbq.zzb zzb2) {
        this.zza.zzb(new zzdqi(zzb2));
        this.zza.zzc(1102);
    }

    public final void zzl(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzm(zzbbq.zzb zzb2) {
        this.zza.zzb(new zzdqj(zzb2));
        this.zza.zzc(1104);
    }

    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    public final void zzs() {
        this.zza.zzc(3);
    }
}

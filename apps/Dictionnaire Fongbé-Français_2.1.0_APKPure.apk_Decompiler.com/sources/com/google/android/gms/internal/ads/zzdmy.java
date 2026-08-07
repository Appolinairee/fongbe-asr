package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzdmy implements zza, zzbif, zzr, zzbih, zzac {
    private zza zza;
    private zzbif zzb;
    private zzr zzc;
    private zzbih zzd;
    private zzac zze;

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbif zzbif = this.zzb;
        if (zzbif != null) {
            zzbif.zza(str, bundle);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        zzbih zzbih = this.zzd;
        if (zzbih != null) {
            zzbih.zzb(str, str2);
        }
    }

    public final synchronized void zzdE() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdE();
        }
    }

    public final synchronized void zzdi() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdi();
        }
    }

    public final synchronized void zzdo() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdo();
        }
    }

    public final synchronized void zzdp() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdp();
        }
    }

    public final synchronized void zzdr() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdr();
        }
    }

    public final synchronized void zzds(int i) {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzds(i);
        }
    }

    public final synchronized void zzg() {
        zzac zzac = this.zze;
        if (zzac != null) {
            zzac.zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzh(zza zza2, zzbif zzbif, zzr zzr, zzbih zzbih, zzac zzac) {
        this.zza = zza2;
        this.zzb = zzbif;
        this.zzc = zzr;
        this.zzd = zzbih;
        this.zze = zzac;
    }
}

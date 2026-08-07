package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxr extends zzbvb {
    private final zzcab zza;
    private final zzbvk zzb;

    zzdxr(zzcab zzcab, zzbvk zzbvk) {
        this.zza = zzcab;
        this.zzb = zzbvk;
    }

    public final void zze(zzbb zzbb) {
        this.zza.zzd(zzbb.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvk) {
        this.zza.zzc(new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvk));
    }
}

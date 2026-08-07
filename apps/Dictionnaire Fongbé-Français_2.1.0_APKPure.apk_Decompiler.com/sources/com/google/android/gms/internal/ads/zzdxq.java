package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxq extends zzbvb {
    final /* synthetic */ zzdxs zza;

    protected zzdxq(zzdxs zzdxs) {
        this.zza = zzdxs;
    }

    public final void zze(zzbb zzbb) {
        this.zza.zza.zzd(zzbb.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdxs zzdxs = this.zza;
        zzdxs.zza.zzc(new zzdyi(autoCloseInputStream, zzdxs.zze));
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvk) {
        this.zza.zza.zzc(new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvk));
    }
}

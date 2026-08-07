package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlm implements zzcgn {
    public final /* synthetic */ zzcaa zza;

    public /* synthetic */ zzdlm(zzcaa zzcaa) {
        this.zza = zzcaa;
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzcaa zzcaa = this.zza;
        if (z) {
            zzcaa.zzb();
            return;
        }
        zzcaa.zzd(new zzegu(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}

package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final /* synthetic */ class zzbn implements Runnable {
    public final /* synthetic */ zzbr zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbn(zzbr zzbr, String str) {
        this.zza = zzbr;
        this.zzb = str;
    }

    public final void run() {
        zzcp.zza(this.zza, this.zzb);
    }
}

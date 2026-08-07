package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final /* synthetic */ class zzcm implements ThreadFactory {
    public final /* synthetic */ zzcn zza;
    public final /* synthetic */ String zzb = "Google consent worker";

    public /* synthetic */ zzcm(zzcn zzcn, String str) {
        this.zza = zzcn;
    }

    public final Thread newThread(Runnable runnable) {
        return this.zza.zza(this.zzb, runnable);
    }
}

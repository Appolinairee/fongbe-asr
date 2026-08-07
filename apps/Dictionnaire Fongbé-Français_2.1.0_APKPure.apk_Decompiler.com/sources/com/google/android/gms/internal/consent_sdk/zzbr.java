package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzbr extends WebView {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzbx zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;

    public zzbr(zzbt zzbt, Handler handler, zzbx zzbx) {
        super(zzbt);
        this.zza = handler;
        this.zzb = zzbx;
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbr zzbr, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        zzbx zzbx = this.zzb;
        Objects.requireNonNull(zzbx);
        this.zza.post(new zzbo(zzbx));
    }

    public final void zzd(String str, String str2) {
        this.zza.post(new zzbn(this, str + "(" + str2 + ");"));
    }
}

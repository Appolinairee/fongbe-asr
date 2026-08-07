package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfmw extends AsyncTask {
    private zzfmx zza;
    protected final zzfmo zzd;

    public zzfmw(zzfmo zzfmo) {
        this.zzd = zzfmo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfmx zzfmx = this.zza;
        if (zzfmx != null) {
            zzfmx.zza(this);
        }
    }

    public final void zzb(zzfmx zzfmx) {
        this.zza = zzfmx;
    }
}

package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzr extends AsyncTask {
    final /* synthetic */ zzu zza;

    /* synthetic */ zzr(zzu zzu, zzt zzt) {
        this.zza = zzu;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzu zzu = this.zza;
        String str = (String) obj;
        if (zzu.zzf != null && str != null) {
            zzu.zzf.loadUrl(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzu zzu = this.zza;
            zzu.zzh = (zzava) zzu.zzc.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            zzo.zzk("", e);
        } catch (TimeoutException e2) {
            zzo.zzk("", e2);
        }
        return this.zza.zzp();
    }
}

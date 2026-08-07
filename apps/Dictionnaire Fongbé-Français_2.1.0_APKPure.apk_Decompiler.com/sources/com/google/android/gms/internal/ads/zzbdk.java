package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbdk extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdrw zzd;
    private CustomTabsSession zze;
    private CustomTabsClient zzf;

    private final void zzf(Context context) {
        String packageName;
        if (this.zzf == null && context != null && (packageName = CustomTabsClient.getPackageName(context, (List<String>) null)) != null) {
            CustomTabsClient.bindCustomTabsService(context, packageName, this);
        }
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0);
        this.zze = customTabsClient.newSession(new zzbdj(this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final CustomTabsSession zza() {
        if (this.zze == null) {
            zzbzw.zza.execute(new zzbdi(this));
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdrw zzdrw) {
        if (!this.zzb.getAndSet(true)) {
            this.zzc = context;
            this.zzd = zzdrw;
            zzf(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i) {
        zzdrw zzdrw = this.zzd;
        if (zzdrw != null) {
            zzdrv zza2 = zzdrw.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i));
            zza2.zzg();
        }
    }

    public final void zze(int i) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() && this.zzd != null) {
            zzbzw.zza.execute(new zzbdh(this, i));
        }
    }
}

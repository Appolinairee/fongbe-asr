package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhfl extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhfl(zzbdm zzbdm) {
        this.zza = new WeakReference(zzbdm);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbdm zzbdm = (zzbdm) this.zza.get();
        if (zzbdm != null) {
            zzbdm.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdm zzbdm = (zzbdm) this.zza.get();
        if (zzbdm != null) {
            zzbdm.zzd();
        }
    }
}

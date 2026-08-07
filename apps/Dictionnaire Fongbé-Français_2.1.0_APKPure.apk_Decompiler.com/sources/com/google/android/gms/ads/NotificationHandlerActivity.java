package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbsx zzo = zzbc.zza().zzo(this, new zzbpa());
            if (zzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                zzo.zze(getIntent());
            }
        } catch (RemoteException e) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        finish();
    }
}

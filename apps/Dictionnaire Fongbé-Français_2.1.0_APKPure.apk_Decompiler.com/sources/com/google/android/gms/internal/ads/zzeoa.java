package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeoa implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    zzeoa(zzgcs zzgcs, Context context) {
        this.zza = zzgcs;
        this.zzb = context;
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter);
        }
        return this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final int zza() {
        return 14;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzenz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeob zzc() throws Exception {
        boolean z;
        double d = -1.0d;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlS)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d = ((double) batteryManager.getIntProperty(4)) / 100.0d;
            }
            if (Build.VERSION.SDK_INT < 23 || batteryManager == null) {
                z = zze(zzd());
            } else {
                z = batteryManager.isCharging();
            }
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d = ((double) zzd.getIntExtra("level", -1)) / ((double) zzd.getIntExtra("scale", -1));
            }
            z = zze;
        }
        return new zzeob(d, z);
    }
}

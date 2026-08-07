package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzflu {
    private static final zzflu zza = new zzflu();
    private WeakReference zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public boolean zzd = false;

    public static zzflu zza() {
        return zza;
    }

    public final void zzc() {
        boolean z;
        Context context = (Context) this.zzb.get();
        if (context != null) {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (Build.VERSION.SDK_INT >= 22) {
                z = keyguardManager.isDeviceLocked();
            } else {
                z = keyguardManager.inKeyguardRestrictedInputMode();
            }
            zzd(this.zzc, z);
            this.zzd = z;
        }
    }

    public final void zzd(boolean z, boolean z2) {
        if ((z2 || z) != (this.zzd || this.zzc)) {
            for (zzfkt zzg : zzflk.zza().zzc()) {
                zzg.zzg().zzm(z2 || z);
            }
        }
    }

    public final void zze(Context context) {
        if (context != null) {
            this.zzb = new WeakReference(context);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            context.registerReceiver(new zzflt(this), intentFilter);
        }
    }
}

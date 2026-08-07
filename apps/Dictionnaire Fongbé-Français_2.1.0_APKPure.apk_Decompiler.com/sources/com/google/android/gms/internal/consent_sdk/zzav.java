package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzav implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzay zza;
    private final Activity zzb;

    public zzav(zzay zzay, Activity activity) {
        this.zza = zzay;
        this.zzb = activity;
    }

    /* access modifiers changed from: private */
    public final void zzb() {
        this.zza.zzb.unregisterActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzay zzay = this.zza;
        if (zzay.zzg != null && zzay.zza) {
            zzay.zzg.setOwnerActivity(activity);
            zzay zzay2 = this.zza;
            if (zzay2.zzc != null) {
                zzay2.zzc.zza(activity);
            }
            zzav zzav = (zzav) this.zza.zzl.getAndSet((Object) null);
            if (zzav != null) {
                zzav.zzb();
                zzay zzay3 = this.zza;
                zzav zzav2 = new zzav(zzay3, activity);
                zzay3.zzb.registerActivityLifecycleCallbacks(zzav2);
                this.zza.zzl.set(zzav2);
            }
            zzay zzay4 = this.zza;
            if (zzay4.zzg != null) {
                zzay4.zzg.show();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zzb) {
            if (activity.isChangingConfigurations()) {
                zzay zzay = this.zza;
                if (zzay.zza && zzay.zzg != null) {
                    zzay.zzg.dismiss();
                    return;
                }
            }
            this.zza.zzh(new zzg(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

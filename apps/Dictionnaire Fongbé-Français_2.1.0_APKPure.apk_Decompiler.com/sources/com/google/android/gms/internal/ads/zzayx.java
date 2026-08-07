package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzayx implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzayx(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzayp(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzayv(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzays(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzayr(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzayu(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzayq(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzayt(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzayw zzayw) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzayw.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e) {
            zzo.zzh("Error while dispatching lifecycle callback.", e);
        }
    }
}

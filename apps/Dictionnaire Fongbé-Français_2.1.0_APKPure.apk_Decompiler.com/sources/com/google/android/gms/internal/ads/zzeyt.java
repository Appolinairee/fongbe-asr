package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyt {
    public static void zza(AtomicReference atomicReference, zzeys zzeys) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzeys.zza(obj);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}

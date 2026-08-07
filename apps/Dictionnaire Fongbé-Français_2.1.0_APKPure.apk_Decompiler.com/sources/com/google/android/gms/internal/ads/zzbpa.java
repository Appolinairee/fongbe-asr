package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbpa extends zzbpd {
    public final zzbph zzb(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzbpa.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzbqf((MediationAdapter) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzbqf((Adapter) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
            }
            zzo.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            zzo.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
        }
        throw new RemoteException();
    }

    public final zzbrd zzc(String str) throws RemoteException {
        try {
            return new zzbrq((RtbAdapter) Class.forName(str, false, zzbrh.class.getClassLoader()).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbpa.class.getClassLoader()));
        } catch (Throwable unused) {
            zzo.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbpa.class.getClassLoader()));
        } catch (Throwable unused) {
            zzo.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}

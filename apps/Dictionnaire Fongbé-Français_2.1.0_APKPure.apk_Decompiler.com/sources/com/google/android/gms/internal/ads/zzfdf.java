package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfdf {
    private static zzfdf zza;
    private final Context zzb;
    private final zzcw zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfdf(Context context, zzcw zzcw) {
        this.zzb = context;
        this.zzc = zzcw;
    }

    static zzcw zza(Context context) {
        try {
            return zzcv.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzo.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfdf zzd(Context context) {
        synchronized (zzfdf.class) {
            zzfdf zzfdf = zza;
            if (zzfdf != null) {
                return zzfdf;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbem.zzb.zze()).longValue();
            zzcw zzcw = null;
            if (longValue > 0 && longValue <= 244410203) {
                zzcw = zza(applicationContext);
            }
            zzfdf zzfdf2 = new zzfdf(applicationContext, zzcw);
            zza = zzfdf2;
            return zzfdf2;
        }
    }

    private final zzfb zzg() {
        zzcw zzcw = this.zzc;
        if (zzcw != null) {
            try {
                return zzcw.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpe zzb() {
        return (zzbpe) this.zzd.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r5 = zzg();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(int r3, boolean r4, int r5) {
        /*
            r2 = this;
            com.google.android.gms.ads.internal.zzv.zzq()
            android.content.Context r3 = r2.zzb
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.zzF(r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r0 = 244410000(0xe916690, float:3.5844024E-30)
            r1 = 1
            r4.<init>(r0, r5, r1, r3)
            com.google.android.gms.internal.ads.zzbdv r5 = com.google.android.gms.internal.ads.zzbem.zzc
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            com.google.android.gms.ads.internal.client.zzfb r5 = r2.zzg()
            if (r5 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            int r5 = r5.zza()
            r4.<init>(r0, r5, r1, r3)
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdf.zzc(int, boolean, int):com.google.android.gms.ads.internal.util.client.VersionInfoParcel");
    }

    public final String zze() {
        zzfb zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.internal.ads.zzbpe r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdv r0 = com.google.android.gms.internal.ads.zzbem.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.ads.internal.client.zzcw r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x001c
        L_0x0015:
            com.google.android.gms.internal.ads.zzbpe r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            goto L_0x0013
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L_0x0021
            r4 = r0
        L_0x0021:
            com.google.android.gms.internal.ads.zzfde.zza(r2, r1, r4)
            return
        L_0x0025:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfde.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdf.zzf(com.google.android.gms.internal.ads.zzbpe):void");
    }
}

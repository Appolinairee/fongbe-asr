package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxq {
    private final zzawd zza;
    private final String zzb;
    private final String zzc;
    private volatile Method zzd = null;
    private final Class[] zze;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxq(zzawd zzawd, String str, String str2, Class... clsArr) {
        this.zza = zzawd;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawd.zzk().submit(new zzaxp(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzaxq zzaxq) {
        try {
            zzawd zzawd = zzaxq.zza;
            Class loadClass = zzawd.zzi().loadClass(zzaxq.zzc(zzawd.zzu(), zzaxq.zzb));
            if (loadClass != null) {
                zzaxq.zzd = loadClass.getMethod(zzaxq.zzc(zzaxq.zza.zzu(), zzaxq.zzc), zzaxq.zze);
                Method method = zzaxq.zzd;
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzaxq.zzf.countDown();
            throw th;
        }
        zzaxq.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzavh, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (!this.zzf.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zzd;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}

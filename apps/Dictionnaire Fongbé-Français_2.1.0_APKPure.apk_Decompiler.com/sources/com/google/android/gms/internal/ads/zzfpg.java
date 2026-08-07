package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfpg {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfph zzc;
    private final zzfni zzd;
    private final zzfnd zze;
    private zzfov zzf;
    private final Object zzg = new Object();

    public zzfpg(Context context, zzfph zzfph, zzfni zzfni, zzfnd zzfnd) {
        this.zzb = context;
        this.zzc = zzfph;
        this.zzd = zzfni;
        this.zze = zzfnd;
    }

    private final synchronized Class zzd(zzfow zzfow) throws zzfpf {
        String zzk = zzfow.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfow.zzc())) {
                File zzb2 = zzfow.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfow.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfpf(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new zzfpf(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new zzfpf(2008, e2);
        }
    }

    public final zzfnl zza() {
        zzfov zzfov;
        synchronized (this.zzg) {
            zzfov = this.zzf;
        }
        return zzfov;
    }

    public final zzfow zzb() {
        synchronized (this.zzg) {
            zzfov zzfov = this.zzf;
            if (zzfov == null) {
                return null;
            }
            zzfow zzf2 = zzfov.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfow zzfow) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfow);
            zzfov zzfov = new zzfov(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfow.zze(), null, new Bundle(), 2}), zzfow, this.zzc, this.zzd);
            if (zzfov.zzh()) {
                int zze2 = zzfov.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfov zzfov2 = this.zzf;
                        if (zzfov2 != null) {
                            try {
                                zzfov2.zzg();
                            } catch (zzfpf e) {
                                zzfpf zzfpf = e;
                                this.zzd.zzc(zzfpf.zza(), -1, zzfpf);
                            }
                        }
                        this.zzf = zzfov;
                    }
                    this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfpf(4001, "ci: " + zze2);
            }
            throw new zzfpf(4000, "init failed");
        } catch (Exception e2) {
            throw new zzfpf(2004, (Throwable) e2);
        } catch (zzfpf e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}

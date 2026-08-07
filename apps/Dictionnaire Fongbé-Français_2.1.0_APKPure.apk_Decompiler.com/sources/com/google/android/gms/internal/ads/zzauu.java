package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzauu {
    protected static volatile zzfpk zza = null;
    /* access modifiers changed from: private */
    public static final ConditionVariable zzc = new ConditionVariable();
    private static volatile Random zzd = null;
    protected volatile Boolean zzb;
    /* access modifiers changed from: private */
    public final zzawd zze;

    public zzauu(zzawd zzawd) {
        this.zze = zzawd;
        zzawd.zzk().execute(new zzaut(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzauu.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (this.zzb.booleanValue() && zza != null) {
                zzari zza2 = zzarm.zza();
                zza2.zza(this.zze.zza.getPackageName());
                zza2.zze(j);
                if (str != null) {
                    zza2.zzb(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    zza2.zzf(stringWriter.toString());
                    zza2.zzd(exc.getClass().getName());
                }
                zzfpi zza3 = zza.zza(((zzarm) zza2.zzbr()).zzaV());
                zza3.zza(i);
                if (i2 != -1) {
                    zza3.zzb(i2);
                }
                zza3.zzc();
            }
        } catch (Exception unused) {
        }
    }
}

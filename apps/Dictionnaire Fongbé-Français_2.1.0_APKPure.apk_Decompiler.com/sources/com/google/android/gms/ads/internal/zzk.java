package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzgch;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzk implements Runnable, zzauv {
    protected boolean zza;
    final CountDownLatch zzb = new CountDownLatch(1);
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    /* access modifiers changed from: private */
    public final zzfni zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzcy)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfni.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzbe.zzc().zza(zzbcl.zzcv)).booleanValue();
        this.zzg = ((Boolean) zzbe.zzc().zza(zzbcl.zzcz)).booleanValue();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcx)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdu)).booleanValue()) {
            zzbzw.zza.execute(this);
            return;
        }
        zzbc.zzb();
        if (zzf.zzu()) {
            zzbzw.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzauv zzq() {
        if (zzm() == 2) {
            return (zzauv) this.zze.get();
        }
        return (zzauv) this.zzd.get();
    }

    private final void zzr() {
        List list = this.zzc;
        zzauv zzq = zzq();
        if (!list.isEmpty() && zzq != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzq.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzs(boolean z) {
        String str = this.zzl.afmaVersion;
        Context zzt = zzt(this.zzj);
        zzare zza2 = zzarg.zza();
        zza2.zza(z);
        zza2.zzb(str);
        this.zzd.set(zzauz.zzu(zzt, new zzaux((zzarg) zza2.zzbr())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzaus zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzare zza2 = zzarg.zza();
        zza2.zza(z);
        zza2.zzb(versionInfoParcel.afmaVersion);
        return zzaus.zza(zzt(context), (zzarg) zza2.zzbr(), z2);
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z2 = this.zzl.isClientJar;
            z = false;
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbf)).booleanValue() && z2) {
                z = true;
            }
            if (zzm() == 1) {
                zzs(z);
                if (this.zzo == 2) {
                    this.zzh.execute(new zzi(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                zzaus zzu = zzu(this.zzj, this.zzl, z, this.zzn);
                this.zze.set(zzu);
                if (this.zzg && !zzu.zzr()) {
                    this.zzo = 1;
                    zzs(z);
                }
            }
        } catch (NullPointerException e) {
            this.zzo = 1;
            zzs(z);
            this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
        this.zzb.countDown();
        this.zzj = null;
        this.zzl = null;
    }

    public final String zzb(Context context, byte[] bArr) {
        zzauv zzq;
        if (!zzj() || (zzq = zzq()) == null) {
            return "";
        }
        zzr();
        return zzq.zzf(zzt(context));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, (Activity) null);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return "";
        }
        zzauv zzq = zzq();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            zzv.zzq();
            zzs.zzK(view, 4, (MotionEvent) null);
        }
        if (zzq == null) {
            return "";
        }
        zzr();
        return zzq.zze(zzt(context), str, view, activity);
    }

    public final String zzf(Context context) {
        return zzb(context, (byte[]) null);
    }

    public final String zzg(Context context) {
        try {
            return (String) zzgch.zzj(new zzh(this, context), this.zzh).get((long) ((Integer) zzbe.zzc().zza(zzbcl.zzcP)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauo.zza(context, this.zzm.afmaVersion, true);
        }
    }

    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzky)).booleanValue()) {
            zzauv zzq = zzq();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                zzv.zzq();
                zzs.zzK(view, 2, (MotionEvent) null);
            }
            if (zzq != null) {
                return zzq.zzh(context, view, activity);
            }
            return "";
        } else if (!zzj()) {
            return "";
        } else {
            zzauv zzq2 = zzq();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                zzv.zzq();
                zzs.zzK(view, 2, (MotionEvent) null);
            }
            return zzq2 != null ? zzq2.zzh(context, view, activity) : "";
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzi() {
        Context context = this.zzj;
        zzj zzj2 = new zzj(this);
        zzfni zzfni = this.zzi;
        return new zzfpe(this.zzj, zzfok.zzb(context, zzfni), zzj2, ((Boolean) zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final void zzk(MotionEvent motionEvent) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    public final void zzl(int i, int i2, int i3) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzl(i, i2, i3);
            return;
        }
        this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* access modifiers changed from: protected */
    public final int zzm() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauv zzq;
        zzauv zzq2;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcU)).booleanValue()) {
            if (this.zzb.getCount() == 0 && (zzq2 = zzq()) != null) {
                zzq2.zzn(stackTraceElementArr);
            }
        } else if (zzj() && (zzq = zzq()) != null) {
            zzq.zzn(stackTraceElementArr);
        }
    }

    public final void zzo(View view) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhk implements Runnable {
    public static final Object zza = new Object();
    public static Boolean zzb;
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzfhp zzg = zzfht.zzb();
    private String zzh = "";
    private int zzi;
    private final zzdpj zzj;
    private final List zzk;
    private boolean zzl = false;
    private final zzbvs zzm;

    public zzfhk(Context context, VersionInfoParcel versionInfoParcel, zzdpj zzdpj, zzdzq zzdzq, zzbvs zzbvs) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpj;
        this.zzm = zzbvs;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
            this.zzk = zzs.zzd();
        } else {
            this.zzk = zzfxn.zzn();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                boolean z = false;
                if (!((Boolean) zzbee.zzb.zze()).booleanValue()) {
                    zzb = false;
                } else {
                    if (Math.random() < ((Double) zzbee.zza.zze()).doubleValue()) {
                        z = true;
                    }
                    zzb = Boolean.valueOf(z);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() != 0) {
                    try {
                        synchronized (obj) {
                            zzaV = ((zzfht) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        zzdzn zzdzn = new zzdzn((String) zzbe.zzc().zza(zzbcl.zziD), 60000, new HashMap(), zzaV, "application/x-protobuf", false);
                        zzdzn zzdzn2 = zzdzn;
                        new zzdzp(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(zzdzn);
                    } catch (Exception e) {
                        if (!(e instanceof zzdvy) || ((zzdvy) e).zza() != 3) {
                            zzv.zzp().zzv(e, "CuiMonitor.sendCuiPing");
                        }
                    }
                }
            }
        }
    }

    public final void zzb(zzfha zzfha) {
        zzbzw.zza.zza(new zzfhj(this, zzfha));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzfha zzfha) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        zzv.zzq();
                        this.zzh = zzs.zzq(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        zzv.zzp().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) zzbe.zzc().zza(zzbcl.zziE)).intValue();
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzlK)).booleanValue()) {
                        long j = (long) intValue;
                        zzbzw.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = (long) intValue;
                        zzbzw.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfha != null) {
            synchronized (zzc) {
                if (this.zzg.zza() < ((Integer) zzbe.zzc().zza(zzbcl.zziF)).intValue()) {
                    zzfhl zza2 = zzfho.zza();
                    zza2.zzu(zzfha.zzm());
                    zza2.zzq(zzfha.zzl());
                    zza2.zzg(zzfha.zzb());
                    zza2.zzw(3);
                    zza2.zzn(this.zzf.afmaVersion);
                    zza2.zzb(this.zzh);
                    zza2.zzk(Build.VERSION.RELEASE);
                    zza2.zzr(Build.VERSION.SDK_INT);
                    zza2.zzv(zzfha.zzo());
                    zza2.zzj(zzfha.zza());
                    zza2.zze((long) this.zzi);
                    zza2.zzt(zzfha.zzn());
                    zza2.zzc(zzfha.zze());
                    zza2.zzf(zzfha.zzg());
                    zza2.zzh(zzfha.zzh());
                    zza2.zzi(this.zzj.zzb(zzfha.zzh()));
                    zza2.zzl(zzfha.zzi());
                    zza2.zzm(zzfha.zzd());
                    zza2.zzd(zzfha.zzf());
                    zza2.zzs(zzfha.zzk());
                    zza2.zzo(zzfha.zzj());
                    zza2.zzp(zzfha.zzc());
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
                        zza2.zza(this.zzk);
                    }
                    zzfhp zzfhp = this.zzg;
                    zzfhq zza3 = zzfhr.zza();
                    zza3.zza(zza2);
                    zzfhp.zzb(zza3);
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawr extends zzaxr {
    private static final zzaxs zzh = new zzaxs();
    private final zzary zzi;
    private final Context zzj;
    private final zzatv zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzawr(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, Context context, zzarp zzarp, zzary zzary, zzatv zzatv) {
        super(zzawd, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", zzasc, i, 27);
        this.zzj = context;
        this.zzi = zzary;
        this.zzk = zzatv;
    }

    private final zzats zzc() throws IllegalAccessException, InvocationTargetException {
        int i;
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcN)).booleanValue()) {
            i = ((Integer) zzbe.zzc().zza(zzbcl.zzcS)).intValue();
        } else {
            i = this.zzi.zza();
        }
        zzats zzats = new zzats((String) this.zze.invoke((Object) null, new Object[]{this.zzj, false, ""}));
        zzatv zzatv = this.zzk;
        if (!(zzatv == null || zzatv.zza() == null)) {
            try {
                str = (String) zzatv.zza().get((long) i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzats.zza = str;
            return zzats;
        }
        str = "E";
        zzats.zza = str;
        return zzats;
    }

    private final String zzd() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzasy zzc = this.zza.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzats zzats;
        int i;
        zzats zzats2;
        Boolean bool;
        AtomicReference zza = zzh.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzats zzats3 = (zzats) zza.get();
            if (zzats3 == null || zzawg.zzd(zzats3.zza) || zzats3.zza.equals("E") || zzats3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzawg.zzd((String) null)) {
                    i = 5;
                } else {
                    if (!zzawg.zzd((String) null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    bool.booleanValue();
                    i = 3;
                }
                if (this.zzk != null) {
                    zzats2 = zzc();
                } else {
                    Boolean valueOf = Boolean.valueOf(i == 3 && !this.zzi.zzd());
                    Boolean bool2 = (Boolean) zzbe.zzc().zza(zzbcl.zzcB);
                    String zzb = ((Boolean) zzbe.zzc().zza(zzbcl.zzcA)).booleanValue() ? zzb() : null;
                    if (bool2.booleanValue() && this.zza.zzp() && zzawg.zzd(zzb)) {
                        zzb = zzd();
                    }
                    zzats zzats4 = new zzats((String) this.zze.invoke((Object) null, new Object[]{this.zzj, valueOf, zzb}));
                    if (zzawg.zzd(zzats4.zza) || zzats4.zza.equals("E")) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzawg.zzd(zzd)) {
                                zzats4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzats2 = zzats4;
                }
                zza.set(zzats2);
            }
            zzats = (zzats) zza.get();
        }
        synchronized (this.zzd) {
            if (zzats != null) {
                this.zzd.zzx(zzats.zza);
                this.zzd.zzX(zzats.zzb);
                this.zzd.zzZ(zzats.zzc);
                this.zzd.zzi(zzats.zzd);
                this.zzd.zzw(zzats.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzawg.zzf((String) zzbe.zzc().zza(zzbcl.zzcC));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzawg.zzf((String) zzbe.zzc().zza(zzbcl.zzcD)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzgdb zze = zzgdb.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzaxt(zze));
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

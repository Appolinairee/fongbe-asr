package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbq;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbbj {
    private final zzbbp zza;
    private final zzbbq.zzt.zza zzb;
    private final boolean zzc;

    private zzbbj() {
        this.zzb = zzbbq.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbp();
    }

    public static zzbbj zza() {
        return new zzbbj();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzah(), Long.valueOf(zzv.zzC().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbbq.zzt) this.zzb.zzbr()).zzaV(), 3)});
    }

    private final synchronized void zze(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(zzfpv.zza(zzfpu.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i) {
        zzbbq.zzt.zza zza2 = this.zzb;
        zza2.zzq();
        zza2.zzj(zzs.zzd());
        zzbbn zzbbn = new zzbbn(this.zza, ((zzbbq.zzt) this.zzb.zzbr()).zzaV(), (zzbbo) null);
        int i2 = i - 1;
        zzbbn.zza(i2);
        zzbbn.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbbi zzbbi) {
        if (this.zzc) {
            try {
                zzbbi.zza(this.zzb);
            } catch (NullPointerException e) {
                zzv.zzp().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzeX)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbbj(zzbbp zzbbp) {
        this.zzb = zzbbq.zzt.zzj();
        this.zza = zzbbp;
        this.zzc = ((Boolean) zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbba implements Runnable {
    public final /* synthetic */ zzbbd zza;
    public final /* synthetic */ zzbau zzb;
    public final /* synthetic */ zzbav zzc;
    public final /* synthetic */ zzcab zzd;

    public /* synthetic */ zzbba(zzbbd zzbbd, zzbau zzbau, zzbav zzbav, zzcab zzcab) {
        this.zza = zzbbd;
        this.zzb = zzbau;
        this.zzc = zzbav;
        this.zzd = zzcab;
    }

    public final void run() {
        zzbas zzbas;
        zzbbd zzbbd = this.zza;
        zzbau zzbau = this.zzb;
        zzcab zzcab = this.zzd;
        try {
            zzbax zzq = zzbau.zzq();
            boolean zzp = zzbau.zzp();
            zzbav zzbav = this.zzc;
            if (zzp) {
                zzbas = zzq.zzg(zzbav);
            } else {
                zzbas = zzq.zzf(zzbav);
            }
            if (!zzbas.zze()) {
                zzcab.zzd(new RuntimeException("No entry contents."));
                zzbbf.zze(zzbbd.zzc);
                return;
            }
            zzbbc zzbbc = new zzbbc(zzbbd, zzbas.zzc(), 1);
            int read = zzbbc.read();
            if (read != -1) {
                zzbbc.unread(read);
                zzcab.zzc(zzbbh.zzb(zzbbc, zzbas.zzd(), zzbas.zzg(), zzbas.zza(), zzbas.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zzo.zzh("Unable to obtain a cache service instance.", e);
            zzcab.zzd(e);
            zzbbf.zze(zzbbd.zzc);
        }
    }
}

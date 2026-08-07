package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzexm implements zzcvw, zzcxs, zzezc, zzr, zzcye, zzcwj, zzdds {
    private final zzfds zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexm zzh = null;

    public zzexm(zzfds zzfds) {
        this.zza = zzfds;
    }

    public static zzexm zzi(zzexm zzexm) {
        zzexm zzexm2 = new zzexm(zzexm.zza);
        zzexm zzexm3 = zzexm;
        zzexm2.zzh = zzexm;
        return zzexm2;
    }

    public final void zzdE() {
    }

    public final void zzdd() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzdd();
        } else {
            zzeyt.zza(this.zzd, new zzexd());
        }
    }

    public final void zzdi() {
    }

    public final void zzdo() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzdo();
        } else {
            zzeyt.zza(this.zzf, new zzexa());
        }
    }

    public final void zzdp() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzdp();
            return;
        }
        zzeyt.zza(this.zzf, new zzexl());
        zzeyt.zza(this.zzd, new zzewy());
        zzeyt.zza(this.zzd, new zzewz());
    }

    public final void zzdr() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzdr();
        } else {
            zzeyt.zza(this.zzf, new zzexk());
        }
    }

    public final void zzds(int i) {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzds(i);
        } else {
            zzeyt.zza(this.zzf, new zzexg(i));
        }
    }

    public final void zzg() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzg();
        } else {
            zzeyt.zza(this.zze, new zzexj());
        }
    }

    public final void zzh(zzu zzu) {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzh(zzu);
        } else {
            zzeyt.zza(this.zzg, new zzewx(zzu));
        }
    }

    public final void zzj() {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzj();
            return;
        }
        this.zza.zza();
        zzeyt.zza(this.zzc, new zzexe());
        zzeyt.zza(this.zzd, new zzexf());
    }

    public final void zzl(zzezc zzezc) {
        this.zzh = (zzexm) zzezc;
    }

    public final void zzm(zzr zzr) {
        this.zzf.set(zzr);
    }

    public final void zzn(zzdr zzdr) {
        this.zzg.set(zzdr);
    }

    public final void zzo(zzbag zzbag) {
        this.zzb.set(zzbag);
    }

    public final void zzp(zzbak zzbak) {
        this.zzd.set(zzbak);
    }

    public final void zzq(zze zze2) {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzq(zze2);
        } else {
            zzeyt.zza(this.zzd, new zzexb(zze2));
        }
    }

    public final void zzu() {
    }

    public final void zzk(zzbad zzbad) {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzk(zzbad);
        } else {
            zzeyt.zza(this.zzb, new zzexc(zzbad));
        }
    }

    public final void zzdz(zze zze2) {
        zzexm zzexm = this.zzh;
        if (zzexm != null) {
            zzexm.zzdz(zze2);
            return;
        }
        zzeyt.zza(this.zzb, new zzexh(zze2));
        zzeyt.zza(this.zzb, new zzexi(zze2));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfar implements OnAdMetadataChangedListener, zzcxh, zzcvw, zzcvt, zzcwj, zzcye, zzezc, zzdds {
    private final zzfds zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfar zzi = null;

    public zzfar(zzfds zzfds) {
        this.zza = zzfds;
    }

    public final void onAdMetadataChanged() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.onAdMetadataChanged();
        } else {
            zzeyt.zza(this.zzb, new zzfaf());
        }
    }

    public final void zza() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zza();
            return;
        }
        this.zza.zza();
        zzeyt.zza(this.zzd, new zzfan());
        zzeyt.zza(this.zze, new zzfao());
    }

    public final void zzdd() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzdd();
        } else {
            zzeyt.zza(this.zzd, new zzfag());
        }
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzh(zzu zzu) {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzh(zzu);
        } else {
            zzeyt.zza(this.zzh, new zzfac(zzu));
        }
    }

    public final void zzi(zzdr zzdr) {
        this.zzh.set(zzdr);
    }

    public final void zzj(zzbws zzbws) {
        this.zzd.set(zzbws);
    }

    public final void zzk(zzbww zzbww) {
        this.zzc.set(zzbww);
    }

    public final void zzl(zzezc zzezc) {
        this.zzi = (zzfar) zzezc;
    }

    @Deprecated
    public final void zzm(zzbwc zzbwc) {
        this.zze.set(zzbwc);
    }

    @Deprecated
    public final void zzn(zzbvx zzbvx) {
        this.zzg.set(zzbvx);
    }

    public final void zzo(zzbwx zzbwx) {
        this.zzf.set(zzbwx);
    }

    public final void zzq(zze zze2) {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzq(zze2);
            return;
        }
        zzeyt.zza(this.zzd, new zzfah(zze2));
        zzeyt.zza(this.zzd, new zzfai(zze2));
    }

    public final void zzu() {
    }

    public final void zzb() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzb();
        } else {
            zzeyt.zza(this.zze, new zzfap());
        }
    }

    public final void zze() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zze();
        } else {
            zzeyt.zza(this.zze, new zzfaj());
        }
    }

    public final void zzf() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzf();
        } else {
            zzeyt.zza(this.zze, new zzezv());
        }
    }

    public final void zzs() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzs();
            return;
        }
        zzeyt.zza(this.zzc, new zzfad());
        zzeyt.zza(this.zze, new zzfae());
    }

    public final void zzc() {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzc();
            return;
        }
        zzeyt.zza(this.zzd, new zzezz());
        zzeyt.zza(this.zze, new zzfaa());
        zzeyt.zza(this.zzd, new zzfab());
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzdq(zzbvw, str, str2);
            return;
        }
        zzeyt.zza(this.zzd, new zzfaq(zzbvw));
        zzeyt.zza(this.zzf, new zzezw(zzbvw, str, str2));
        zzeyt.zza(this.zze, new zzezx(zzbvw));
        zzeyt.zza(this.zzg, new zzezy(zzbvw, str, str2));
    }

    public final void zzdz(zze zze2) {
        zzfar zzfar = this.zzi;
        if (zzfar != null) {
            zzfar.zzdz(zze2);
            return;
        }
        int i = zze2.zza;
        zzeyt.zza(this.zzc, new zzfak(zze2));
        zzeyt.zza(this.zzc, new zzfal(i));
        zzeyt.zza(this.zze, new zzfam(i));
    }
}

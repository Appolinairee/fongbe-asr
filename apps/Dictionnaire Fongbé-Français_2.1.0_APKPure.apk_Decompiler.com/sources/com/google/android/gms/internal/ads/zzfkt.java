package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfkt extends zzfkp {
    private final zzfkr zza;
    private final zzflo zzb = new zzflo();
    private zzfnb zzc;
    private zzfma zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final String zzg;

    zzfkt(zzfkq zzfkq, zzfkr zzfkr, String str) {
        this.zza = zzfkr;
        this.zzg = str;
        zzk((View) null);
        if (zzfkr.zzd() == zzfks.HTML || zzfkr.zzd() == zzfks.JAVASCRIPT) {
            this.zzd = new zzfmb(str, zzfkr.zza());
        } else {
            this.zzd = new zzfme(str, zzfkr.zzi(), (String) null);
        }
        this.zzd.zzo();
        zzflk.zza().zzd(this);
        this.zzd.zzf(zzfkq);
    }

    private final void zzk(View view) {
        this.zzc = new zzfnb(view);
    }

    public final void zzb(View view, zzfkw zzfkw, String str) {
        if (!this.zzf) {
            this.zzb.zzb(view, zzfkw, "Ad overlay");
        }
    }

    public final void zzc() {
        if (!this.zzf) {
            this.zzc.clear();
            if (!this.zzf) {
                this.zzb.zzc();
            }
            this.zzf = true;
            this.zzd.zze();
            zzflk.zza().zze(this);
            this.zzd.zzc();
            this.zzd = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzf && zzf() != view) {
            zzk(view);
            this.zzd.zzb();
            Collection<zzfkt> zzc2 = zzflk.zza().zzc();
            if (zzc2 != null && !zzc2.isEmpty()) {
                for (zzfkt zzfkt : zzc2) {
                    if (zzfkt != this && zzfkt.zzf() == view) {
                        zzfkt.zzc.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zze && this.zzd != null) {
            this.zze = true;
            zzflk.zza().zzf(this);
            this.zzd.zzl(zzfls.zzb().zza());
            this.zzd.zzg(zzfli.zza().zzb());
            this.zzd.zzi(this, this.zza);
        }
    }

    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfma zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}

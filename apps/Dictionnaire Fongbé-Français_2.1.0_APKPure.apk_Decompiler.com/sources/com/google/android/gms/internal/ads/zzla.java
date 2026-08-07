package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzla {
    private final zzog zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzkz zze;
    private final HashMap zzf;
    private final Set zzg;
    /* access modifiers changed from: private */
    public final zzlt zzh;
    /* access modifiers changed from: private */
    public final zzdh zzi;
    private boolean zzj;
    private zzgy zzk;
    private zzwb zzl = new zzwb(0);

    public zzla(zzkz zzkz, zzlt zzlt, zzdh zzdh, zzog zzog) {
        this.zza = zzog;
        this.zze = zzkz;
        this.zzh = zzlt;
        this.zzi = zzdh;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzky) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzky zzky) {
        zzkx zzkx = (zzkx) this.zzf.get(zzky);
        if (zzkx != null) {
            zzkx.zza.zzi(zzkx.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzky zzky = (zzky) it.next();
            if (zzky.zzc.isEmpty()) {
                zzs(zzky);
                it.remove();
            }
        }
    }

    private final void zzu(zzky zzky) {
        if (zzky.zze && zzky.zzc.isEmpty()) {
            zzkx zzkx = (zzkx) this.zzf.remove(zzky);
            zzkx.getClass();
            zzkx zzkx2 = zzkx;
            zzkx.zza.zzp(zzkx.zzb);
            zzkx.zza.zzs(zzkx.zzc);
            zzkx.zza.zzr(zzkx.zzc);
            this.zzg.remove(zzky);
        }
    }

    private final void zzv(zzky zzky) {
        zzub zzub = zzky.zza;
        zzkq zzkq = new zzkq(this);
        zzkw zzkw = new zzkw(this, zzky);
        this.zzf.put(zzky, new zzkx(zzub, zzkq, zzkw));
        zzub.zzh(new Handler(zzei.zzz(), (Handler.Callback) null), zzkw);
        zzub.zzg(new Handler(zzei.zzz(), (Handler.Callback) null), zzkw);
        zzub.zzm(zzkq, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzky zzky = (zzky) this.zzb.remove(i2);
                this.zzd.remove(zzky.zzb);
                zzr(i2, -zzky.zza.zzC().zzc());
                zzky.zze = true;
                if (this.zzj) {
                    zzu(zzky);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbq zzb() {
        if (this.zzb.isEmpty()) {
            return zzbq.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzky zzky = (zzky) this.zzb.get(i2);
            zzky.zzd = i;
            i += zzky.zza.zzC().zzc();
        }
        return new zzlh(this.zzb, this.zzl);
    }

    public final zzbq zzc(int i, int i2, List list) {
        boolean z = true;
        zzcw.zzd(i >= 0 && i <= i2 && i2 <= zza());
        if (list.size() != i2 - i) {
            z = false;
        }
        zzcw.zzd(z);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzky) this.zzb.get(i3)).zza.zzt((zzar) list.get(i3 - i));
        }
        return zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzui zzui, zzbq zzbq) {
        this.zze.zzh();
    }

    public final void zzg(zzgy zzgy) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzgy;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzky zzky = (zzky) this.zzb.get(i);
            zzv(zzky);
            this.zzg.add(zzky);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzkx zzkx : this.zzf.values()) {
            try {
                zzkx.zza.zzp(zzkx.zzb);
            } catch (RuntimeException e) {
                zzdo.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzkx.zza.zzs(zzkx.zzc);
            zzkx.zza.zzr(zzkx.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzue zzue) {
        zzky zzky = (zzky) this.zzc.remove(zzue);
        zzky.getClass();
        zzky zzky2 = zzky;
        zzky.zza.zzG(zzue);
        zzky.zzc.remove(((zzty) zzue).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzky);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbq zzk(int i, List list, zzwb zzwb) {
        if (!list.isEmpty()) {
            this.zzl = zzwb;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzky zzky = (zzky) list.get(i2 - i);
                if (i2 > 0) {
                    zzky zzky2 = (zzky) this.zzb.get(i2 - 1);
                    zzky.zzc(zzky2.zzd + zzky2.zza.zzC().zzc());
                } else {
                    zzky.zzc(0);
                }
                zzr(i2, zzky.zza.zzC().zzc());
                this.zzb.add(i2, zzky);
                this.zzd.put(zzky.zzb, zzky);
                if (this.zzj) {
                    zzv(zzky);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzky);
                    } else {
                        zzs(zzky);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbq zzl(int i, int i2, int i3, zzwb zzwb) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbq zzm(int i, int i2, zzwb zzwb) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zzwb;
        zzw(i, i2);
        return zzb();
    }

    public final zzbq zzn(List list, zzwb zzwb) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwb);
    }

    public final zzbq zzo(zzwb zzwb) {
        int zza2 = zza();
        if (zzwb.zzc() != zza2) {
            zzwb = zzwb.zzf().zzg(0, zza2);
        }
        this.zzl = zzwb;
        return zzb();
    }

    public final zzue zzp(zzug zzug, zzyk zzyk, long j) {
        int i = zzlh.zzb;
        Object obj = ((Pair) zzug.zza).first;
        zzug zza2 = zzug.zza(((Pair) zzug.zza).second);
        zzky zzky = (zzky) this.zzd.get(obj);
        zzky.getClass();
        zzky zzky2 = zzky;
        this.zzg.add(zzky);
        zzkx zzkx = (zzkx) this.zzf.get(zzky);
        if (zzkx != null) {
            zzkx.zza.zzk(zzkx.zzb);
        }
        zzky.zzc.add(zza2);
        zzty zzH = zzky.zza.zzI(zza2, zzyk, j);
        this.zzc.put(zzH, zzky);
        zzt();
        return zzH;
    }

    public final zzwb zzq() {
        return this.zzl;
    }
}

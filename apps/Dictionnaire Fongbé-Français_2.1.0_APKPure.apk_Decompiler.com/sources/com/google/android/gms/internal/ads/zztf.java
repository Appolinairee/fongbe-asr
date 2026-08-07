package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zztf implements zzui {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzuq zzc = new zzuq();
    private final zzra zzd = new zzra();
    private Looper zze;
    private zzbq zzf;
    private zzog zzg;

    public /* synthetic */ zzbq zzM() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzog zzb() {
        zzog zzog = this.zzg;
        zzcw.zzb(zzog);
        zzog zzog2 = zzog;
        return zzog;
    }

    /* access modifiers changed from: protected */
    public final zzra zzc(zzug zzug) {
        return this.zzd.zza(0, zzug);
    }

    /* access modifiers changed from: protected */
    public final zzra zzd(int i, zzug zzug) {
        return this.zzd.zza(0, zzug);
    }

    /* access modifiers changed from: protected */
    public final zzuq zze(zzug zzug) {
        return this.zzc.zza(0, zzug);
    }

    /* access modifiers changed from: protected */
    public final zzuq zzf(int i, zzug zzug) {
        return this.zzc.zza(0, zzug);
    }

    public final void zzg(Handler handler, zzrb zzrb) {
        this.zzd.zzb(handler, zzrb);
    }

    public final void zzh(Handler handler, zzur zzur) {
        this.zzc.zzb(handler, zzur);
    }

    public final void zzi(zzuh zzuh) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzuh);
        if (!isEmpty && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzuh zzuh) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzuh);
        if (isEmpty) {
            zzl();
        }
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzuh zzuh, zzgy zzgy, zzog zzog) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg = zzog;
        zzbq zzbq = this.zzf;
        this.zza.add(zzuh);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzuh);
            zzn(zzgy);
        } else if (zzbq != null) {
            zzk(zzuh);
            zzuh.zza(this, zzbq);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzgy zzgy);

    /* access modifiers changed from: protected */
    public final void zzo(zzbq zzbq) {
        this.zzf = zzbq;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzuh) arrayList.get(i)).zza(this, zzbq);
        }
    }

    public final void zzp(zzuh zzuh) {
        this.zza.remove(zzuh);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzuh);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzrb zzrb) {
        this.zzd.zzc(zzrb);
    }

    public final void zzs(zzur zzur) {
        this.zzc.zzi(zzur);
    }

    public /* synthetic */ void zzt(zzar zzar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    public /* synthetic */ boolean zzv() {
        return true;
    }
}

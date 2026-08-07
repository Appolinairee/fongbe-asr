package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaah implements zzcc {
    /* access modifiers changed from: private */
    public static final Executor zza = new zzzu();
    private final Context zzb;
    private final zzaab zzc;
    /* access modifiers changed from: private */
    public final zzaal zzd;
    private final zzaaq zze;
    private final zzbl zzf;
    /* access modifiers changed from: private */
    public final List zzg;
    /* access modifiers changed from: private */
    public final zzabh zzh;
    /* access modifiers changed from: private */
    public final zzcx zzi;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet zzj;
    /* access modifiers changed from: private */
    public zzaai zzk;
    private zzdh zzl;
    /* access modifiers changed from: private */
    public Pair zzm;
    private int zzn;
    private int zzo = 0;

    /* synthetic */ zzaah(zzzw zzzw, zzaag zzaag) {
        Context zza2 = zzzw.zza;
        this.zzb = zza2;
        zzaab zzaab = new zzaab(this, zza2);
        this.zzc = zzaab;
        zzcx zzc2 = zzzw.zzf;
        this.zzi = zzc2;
        zzaal zzf2 = zzzw.zzb;
        this.zzd = zzf2;
        zzf2.zzk(zzc2);
        zzaaq zzaaq = new zzaaq(new zzzx(this, (zzaag) null), zzf2);
        this.zze = zzaaq;
        zzbl zzb2 = zzzw.zzd;
        zzcw.zzb(zzb2);
        zzbl zzbl = zzb2;
        this.zzf = zzb2;
        this.zzg = zzzw.zze;
        this.zzh = new zzzh(zzf2, zzaaq);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzj = copyOnWriteArraySet;
        new zzz().zzag();
        copyOnWriteArraySet.add(zzaab);
    }

    static /* bridge */ /* synthetic */ zzcb zzc(zzaah zzaah, zzab zzab) {
        zzcw.zzf(zzaah.zzo == 0);
        zzk zzw = zzw(zzab.zzC);
        if (zzw.zzd == 7 && zzei.zza < 34) {
            zzi zzc2 = zzw.zzc();
            zzc2.zzd(6);
            zzw = zzc2.zzg();
        }
        zzk zzk2 = zzw;
        zzcx zzcx = zzaah.zzi;
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        Looper looper = myLooper;
        zzaah.zzl = zzcx.zzd(myLooper, (Handler.Callback) null);
        try {
            zzbl zzbl = zzaah.zzf;
            Context context = zzaah.zzb;
            zzn zzn2 = zzn.zza;
            zzdh zzdh = zzaah.zzl;
            Objects.requireNonNull(zzdh);
            zzbl.zza(context, zzk2, zzn2, zzaah, new zzzv(zzdh), zzfxn.zzn(), 0);
            Pair pair = zzaah.zzm;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                zzdz zzdz = (zzdz) zzaah.zzm.second;
                zzdz.zzb();
                zzdz.zza();
            }
            throw null;
        } catch (zzbz e) {
            throw new zzabg(e, zzab);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzaah zzaah, boolean z) {
        if (zzaah.zzo == 1) {
            zzaah.zzn++;
            zzaah.zzh.zzd(z);
            zzdh zzdh = zzaah.zzl;
            zzcw.zzb(zzdh);
            zzdh zzdh2 = zzdh;
            zzdh.zzh(new zzzt(zzaah));
        }
    }

    static /* bridge */ /* synthetic */ boolean zzu(zzaah zzaah, long j) {
        return zzaah.zzn == 0 && zzaah.zze.zze(j);
    }

    /* access modifiers changed from: private */
    public static zzk zzw(zzk zzk2) {
        return (zzk2 == null || !zzk2.zzf()) ? zzk.zza : zzk2;
    }

    public final zzabh zzh() {
        return this.zzc;
    }

    public final void zzq() {
        zzdz.zza.zzb();
        zzdz.zza.zza();
        this.zzm = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        this.zzn--;
    }

    public final void zzs() {
        if (this.zzo != 2) {
            zzdh zzdh = this.zzl;
            if (zzdh != null) {
                zzdh.zze((Object) null);
            }
            this.zzm = null;
            this.zzo = 2;
        }
    }

    public final void zzt(Surface surface, zzdz zzdz) {
        Pair pair = this.zzm;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((zzdz) this.zzm.second).equals(zzdz)) {
            this.zzm = Pair.create(surface, zzdz);
            zzdz.zzb();
            zzdz.zza();
        }
    }
}

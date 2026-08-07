package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zznx implements zzlt {
    private final zzcx zza;
    private final zzbo zzb;
    private final zzbp zzc = new zzbp();
    private final zznw zzd;
    private final SparseArray zze;
    private zzdn zzf;
    private zzbk zzg;
    private zzdh zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zznx zznx) {
        zzlu zzU = zznx.zzU();
        zznx.zzZ(zzU, 1028, new zzly(zzU));
        zznx.zzf.zze();
    }

    private final zzlu zzab(int i, zzug zzug) {
        zzbk zzbk = this.zzg;
        zzbk.getClass();
        if (zzug == null) {
            zzbq zzn = zzbk.zzn();
            if (i >= zzn.zzc()) {
                zzn = zzbq.zza;
            }
            return zzV(zzn, i, (zzug) null);
        } else if (this.zzd.zza(zzug) != null) {
            return zzaa(zzug);
        } else {
            return zzV(zzbq.zza, i, zzug);
        }
    }

    private final zzlu zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzlu zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzlu zzae(zzbd zzbd) {
        zzug zzug;
        if (!(zzbd instanceof zzib) || (zzug = ((zzib) zzbd).zzh) == null) {
            return zzU();
        }
        return zzaa(zzug);
    }

    public final void zzA(zzab zzab, zzht zzht) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_TEXT, new zznl(zzad, zzab, zzht));
    }

    public final void zzB(long j) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ALIAS, new zzmo(zzad, j));
    }

    public final void zzC(Exception exc) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zznt(zzad, exc));
    }

    public final void zzD(zzpg zzpg) {
        zzlu zzad = zzad();
        zzZ(zzad, 1031, new zzni(zzad, zzpg));
    }

    public final void zzE(zzpg zzpg) {
        zzlu zzad = zzad();
        zzZ(zzad, 1032, new zzns(zzad, zzpg));
    }

    public final void zzF(int i, long j, long j2) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_COPY, new zzmk(zzad, i, j, j2));
    }

    public final void zzG(int i, long j) {
        zzlu zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ZOOM_IN, new zzmu(zzac, i, j));
    }

    public final void zzH(Object obj, long j) {
        zzlu zzad = zzad();
        zzZ(zzad, 26, new zznp(zzad, obj, j));
    }

    public final void zzI(int i, int i2, boolean z) {
        zzlu zzad = zzad();
        zzZ(zzad, 1033, new zzmx(zzad, i, i2, z));
    }

    public final void zzJ(Exception exc) {
        zzlu zzad = zzad();
        zzZ(zzad, 1030, new zzmj(zzad, exc));
    }

    public final void zzK(String str, long j, long j2) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zznr(zzad, str, j2, j));
    }

    public final void zzL(String str) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ZOOM_OUT, new zzmt(zzad, str));
    }

    public final void zzM(zzhs zzhs) {
        zzlu zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRAB, new zzng(zzac, zzhs));
    }

    public final void zzN(zzhs zzhs) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zznn(zzad, zzhs));
    }

    public final void zzO(long j, int i) {
        zzlu zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRABBING, new zzna(zzac, j, i));
    }

    public final void zzP(zzab zzab, zzht zzht) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zznh(zzad, zzab, zzht));
    }

    public final void zzQ() {
        zzdh zzdh = this.zzh;
        zzcw.zzb(zzdh);
        zzdh zzdh2 = zzdh;
        zzdh.zzh(new zzno(this));
    }

    public final void zzR(zzlw zzlw) {
        this.zzf.zzf(zzlw);
    }

    public final void zzS(zzbk zzbk, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzcw.zzf(z);
        zzbk.getClass();
        zzbk zzbk2 = zzbk;
        this.zzg = zzbk;
        this.zzh = this.zza.zzd(looper, (Handler.Callback) null);
        this.zzf = this.zzf.zza(looper, new zzmm(this, zzbk));
    }

    /* access modifiers changed from: protected */
    public final zzlu zzU() {
        return zzaa(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public final zzlu zzV(zzbq zzbq, int i, zzug zzug) {
        zzbq zzbq2 = zzbq;
        int i2 = i;
        boolean z = true;
        zzug zzug2 = true == zzbq.zzo() ? null : zzug;
        long zzb2 = this.zza.zzb();
        if (!zzbq2.equals(this.zzg.zzn()) || i2 != this.zzg.zzd()) {
            z = false;
        }
        long j = 0;
        if (zzug2 == null || !zzug2.zzb()) {
            if (z) {
                j = this.zzg.zzj();
            } else if (!zzbq.zzo()) {
                long j2 = zzbq2.zze(i2, this.zzc, 0).zzl;
                j = zzei.zzv(0);
            }
        } else if (z && this.zzg.zzb() == zzug2.zzb && this.zzg.zzc() == zzug2.zzc) {
            j = this.zzg.zzk();
        }
        return new zzlu(zzb2, zzbq, i, zzug2, j, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(zzbk zzbk, zzlw zzlw, zzx zzx) {
        zzlw.zzi(zzbk, new zzlv(zzx, this.zze));
    }

    public final void zzY(int i, long j, long j2) {
        zzlu zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, PointerIconCompat.TYPE_CELL, new zzmh(zzaa, i, j, j2));
    }

    /* access modifiers changed from: protected */
    public final void zzZ(zzlu zzlu, int i, zzdk zzdk) {
        this.zze.put(i, zzlu);
        zzdn zzdn = this.zzf;
        zzdn.zzd(i, zzdk);
        zzdn.zzc();
    }

    public final void zza(zzbg zzbg) {
        zzlu zzU = zzU();
        zzZ(zzU, 13, new zzmd(zzU, zzbg));
    }

    public final void zzaf(int i, zzug zzug, zzuc zzuc) {
        zzlu zzab = zzab(i, zzug);
        zzZ(zzab, PointerIconCompat.TYPE_WAIT, new zzmz(zzab, zzuc));
    }

    public final void zzag(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        zzlu zzab = zzab(i, zzug);
        zzZ(zzab, PointerIconCompat.TYPE_HAND, new zznb(zzab, zztx, zzuc));
    }

    public final void zzah(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        zzlu zzab = zzab(i, zzug);
        zzZ(zzab, 1001, new zznf(zzab, zztx, zzuc));
    }

    public final void zzai(int i, zzug zzug, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        zzlu zzab = zzab(i, zzug);
        zzZ(zzab, PointerIconCompat.TYPE_HELP, new zzml(zzab, zztx, zzuc, iOException, z));
    }

    public final void zzaj(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        zzlu zzab = zzab(i, zzug);
        zzZ(zzab, 1000, new zzmc(zzab, zztx, zzuc));
    }

    public final void zzb(boolean z) {
        zzlu zzU = zzU();
        zzZ(zzU, 3, new zzma(zzU, z));
    }

    public final void zzc(boolean z) {
        zzlu zzU = zzU();
        zzZ(zzU, 7, new zzmp(zzU, z));
    }

    public final void zzd(zzar zzar, int i) {
        zzlu zzU = zzU();
        zzZ(zzU, 1, new zzmf(zzU, zzar, i));
    }

    public final void zze(zzav zzav) {
        zzlu zzU = zzU();
        zzZ(zzU, 14, new zznu(zzU, zzav));
    }

    public final void zzf(boolean z, int i) {
        zzlu zzU = zzU();
        zzZ(zzU, 5, new zzmw(zzU, z, i));
    }

    public final void zzg(zzbe zzbe) {
        zzlu zzU = zzU();
        zzZ(zzU, 12, new zzlx(zzU, zzbe));
    }

    public final void zzh(int i) {
        zzlu zzU = zzU();
        zzZ(zzU, 4, new zzne(zzU, i));
    }

    public final void zzi(int i) {
        zzlu zzU = zzU();
        zzZ(zzU, 6, new zzms(zzU, i));
    }

    public final void zzj(zzbd zzbd) {
        zzlu zzae = zzae(zzbd);
        zzZ(zzae, 10, new zznc(zzae, zzbd));
    }

    public final void zzk(zzbd zzbd) {
        zzlu zzae = zzae(zzbd);
        zzZ(zzae, 10, new zzmv(zzae, zzbd));
    }

    public final void zzl(boolean z, int i) {
        zzlu zzU = zzU();
        zzZ(zzU, -1, new zzmn(zzU, z, i));
    }

    public final void zzn(boolean z) {
        zzlu zzad = zzad();
        zzZ(zzad, 23, new zzmg(zzad, z));
    }

    public final void zzo(int i, int i2) {
        zzlu zzad = zzad();
        zzZ(zzad, 24, new zznv(zzad, i, i2));
    }

    public final void zzq(zzby zzby) {
        zzlu zzU = zzU();
        zzZ(zzU, 2, new zzmq(zzU, zzby));
    }

    public final void zzr(zzcd zzcd) {
        zzlu zzad = zzad();
        zzZ(zzad, 25, new zznj(zzad, zzcd));
    }

    public final void zzs(float f) {
        zzlu zzad = zzad();
        zzZ(zzad, 22, new zzmi(zzad, f));
    }

    public final void zzt(zzlw zzlw) {
        this.zzf.zzb(zzlw);
    }

    public final void zzu() {
        if (!this.zzi) {
            zzlu zzU = zzU();
            this.zzi = true;
            zzZ(zzU, -1, new zznk(zzU));
        }
    }

    public final void zzv(Exception exc) {
        zzlu zzad = zzad();
        zzZ(zzad, 1029, new zznq(zzad, exc));
    }

    public final void zzw(String str, long j, long j2) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TEXT, new zzmr(zzad, str, j2, j));
    }

    public final void zzx(String str) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_NO_DROP, new zzmb(zzad, str));
    }

    public final void zzy(zzhs zzhs) {
        zzlu zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ALL_SCROLL, new zznd(zzac, zzhs));
    }

    public final void zzz(zzhs zzhs) {
        zzlu zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_CROSSHAIR, new zzlz(zzad, zzhs));
    }

    private final zzlu zzaa(zzug zzug) {
        this.zzg.getClass();
        zzbq zza2 = zzug == null ? null : this.zzd.zza(zzug);
        if (zzug == null || zza2 == null) {
            int zzd2 = this.zzg.zzd();
            zzbq zzn = this.zzg.zzn();
            if (zzd2 >= zzn.zzc()) {
                zzn = zzbq.zza;
            }
            return zzV(zzn, zzd2, (zzug) null);
        }
        return zzV(zza2, zza2.zzn(zzug.zza, this.zzb).zzc, zzug);
    }

    public final void zzT(List list, zzug zzug) {
        zzbk zzbk = this.zzg;
        zzbk.getClass();
        zzbk zzbk2 = zzbk;
        this.zzd.zzh(list, zzug, zzbk);
    }

    public final void zzm(zzbi zzbi, zzbi zzbi2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zznw zznw = this.zzd;
        zzbk zzbk = this.zzg;
        zzbk.getClass();
        zzbk zzbk2 = zzbk;
        zznw.zzg(zzbk);
        zzlu zzU = zzU();
        zzZ(zzU, 11, new zznm(zzU, i, zzbi, zzbi2));
    }

    public final void zzp(zzbq zzbq, int i) {
        zzbk zzbk = this.zzg;
        zzbk.getClass();
        zzbk zzbk2 = zzbk;
        this.zzd.zzi(zzbk);
        zzlu zzU = zzU();
        zzZ(zzU, 0, new zzme(zzU, i));
    }

    public zznx(zzcx zzcx) {
        zzcx.getClass();
        zzcx zzcx2 = zzcx;
        this.zza = zzcx;
        this.zzf = new zzdn(zzei.zzz(), zzcx, new zzmy());
        zzbo zzbo = new zzbo();
        this.zzb = zzbo;
        this.zzd = new zznw(zzbo);
        this.zze = new SparseArray();
    }
}

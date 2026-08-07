package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzvp extends zztf implements zzvg {
    private final zzfx zza;
    private final zzrf zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzgy zzh;
    private zzar zzi;
    private final zzvm zzj;
    private final zzyo zzk;

    /* synthetic */ zzvp(zzar zzar, zzfx zzfx, zzvm zzvm, zzrf zzrf, zzyo zzyo, int i, boolean z, zzfvf zzfvf, zzvo zzvo) {
        this.zzi = zzar;
        this.zza = zzfx;
        this.zzj = zzvm;
        this.zzb = zzrf;
        this.zzk = zzyo;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzar zzJ = zzJ();
        zzwc zzwc = r1;
        zzwc zzwc2 = new zzwc(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzJ, z2 ? zzJ.zzc : null);
        zzo(this.zzd ? new zzvl(this, zzwc) : zzwc);
    }

    public final void zzG(zzue zzue) {
        ((zzvk) zzue).zzN();
    }

    public final zzue zzI(zzug zzug, zzyk zzyk, long j) {
        zzfy zza2 = this.zza.zza();
        zzgy zzgy = this.zzh;
        if (zzgy != null) {
            zza2.zzf(zzgy);
        }
        zzam zzam = zzJ().zzb;
        zzam.getClass();
        zzam zzam2 = zzam;
        Uri uri = zzam.zza;
        zzvm zzvm = this.zzj;
        zzb();
        return new zzvk(uri, zza2, new zzti(zzvm.zza), this.zzb, zzc(zzug), this.zzk, zze(zzug), this, zzyk, (String) null, this.zzc, false, zzei.zzs(-9223372036854775807L), (zzzg) null);
    }

    public final synchronized zzar zzJ() {
        return this.zzi;
    }

    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (this.zzd || this.zze != j || this.zzf != z || this.zzg != z2) {
            this.zze = j;
            this.zzf = z;
            this.zzg = z2;
            this.zzd = false;
            zzw();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzgy zzgy) {
        this.zzh = zzgy;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Looper looper = myLooper;
        zzb();
        zzw();
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final synchronized void zzt(zzar zzar) {
        this.zzi = zzar;
    }

    public final void zzz() {
    }
}

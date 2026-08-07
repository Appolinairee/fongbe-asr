package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxm extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxm(int i, zzbr zzbr, int i2, zzxh zzxh, int i3, String str) {
        super(i, zzbr, i2);
        zzfxn zzfxn;
        int i4;
        int i5 = 0;
        this.zzf = zzlk.zza(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzxh.zzw;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzxh.zzu.isEmpty()) {
            zzfxn = zzfxn.zzo("");
        } else {
            zzfxn = zzxh.zzu;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfxn.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzxh.zzx;
            i4 = zzxt.zzc(this.zzd, (String) zzfxn.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int zzb = zzxt.zzb(this.zzd.zzf, zzxh.zzv);
        this.zzk = zzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzc = zzxt.zzc(this.zzd, str, zzxt.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i4 > 0 || (zzxh.zzu.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzlk.zza(i3, zzxh.zzO) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    /* renamed from: zza */
    public final int compareTo(zzxm zzxm) {
        zzfyy zzfyy;
        zzfxc zzd = zzfxc.zzj().zzd(this.zzf, zzxm.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxm.zzi), zzfyy.zzc().zza()).zzb(this.zzj, zzxm.zzj).zzb(this.zzk, zzxm.zzk).zzd(this.zzg, zzxm.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzxm.zzh);
        if (this.zzj == 0) {
            zzfyy = zzfyy.zzc();
        } else {
            zzfyy = zzfyy.zzc().zza();
        }
        zzfxc zzb = zzd.zzc(valueOf, valueOf2, zzfyy).zzb(this.zzl, zzxm.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxm.zzm);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxo) {
        zzxm zzxm = (zzxm) zzxo;
        return false;
    }
}

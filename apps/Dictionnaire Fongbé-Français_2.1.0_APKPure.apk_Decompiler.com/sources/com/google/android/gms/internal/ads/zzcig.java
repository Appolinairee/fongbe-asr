package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcig extends zzeuu {
    private final zzevx zza;
    private final zzcih zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;
    private final zzhfa zzk;
    private final zzhfa zzl = new zzewn(zzffh.zza());
    private final zzhfa zzm;
    private final zzhfa zzn;
    private final zzhfa zzo;
    private final zzhfa zzp;
    private final zzhfa zzq;
    private final zzhfa zzr;
    private final zzhfa zzs;
    private final zzhfa zzt;
    private final zzhfa zzu;
    private final zzhfa zzv;
    private final zzhfa zzw;
    private final zzhfa zzx;
    private final zzhfa zzy;

    /* synthetic */ zzcig(zzcih zzcih, zzevx zzevx, zzcjm zzcjm) {
        zzevx zzevx2 = zzevx;
        this.zzb = zzcih;
        this.zza = zzevx2;
        this.zzc = zzheq.zzc(new zzfhi(zzcih.zzz));
        zzevz zzevz = new zzevz(zzevx2);
        this.zzd = zzevz;
        zzewa zzewa = new zzewa(zzevx2);
        this.zze = zzewa;
        zzewc zzewc = new zzewc(zzevx2);
        this.zzf = zzewc;
        this.zzg = new zzeut(zzcks.zza, zzcih.zzh, zzcih.zze, zzffh.zza(), zzevz, zzewa, zzewc);
        this.zzh = new zzevh(zzckm.zza, zzffh.zza(), zzcih.zzh);
        zzevy zzevy = new zzevy(zzevx2);
        this.zzi = zzevy;
        this.zzj = new zzevp(zzcko.zza, zzffh.zza(), zzevy);
        this.zzk = new zzevw(zzckq.zza, zzcih.zze, zzcih.zzh);
        zzewb zzewb = new zzewb(zzevx2);
        this.zzm = zzewb;
        this.zzn = new zzewj(zzcih.zzal, zzewb, zzewc, zzcku.zza, zzffh.zza(), zzevy, zzcih.zze);
        this.zzo = new zzevd(zzevy, zzckk.zza, zzcih.zzal, zzcih.zze, zzffh.zza());
        zzewd zzewd = new zzewd(zzevx2);
        this.zzp = zzewd;
        zzhfa zzc2 = zzheq.zzc(zzdqq.zza());
        this.zzq = zzc2;
        zzhfa zzc3 = zzheq.zzc(zzdqo.zza());
        this.zzr = zzc3;
        zzhfa zzc4 = zzheq.zzc(zzdqs.zza());
        this.zzs = zzc4;
        zzhfa zzc5 = zzheq.zzc(zzdqu.zza());
        this.zzt = zzc5;
        zzheu zzc6 = zzhev.zzc(4);
        zzc6.zzb(zzfgh.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfgh.BUILD_URL, zzc3);
        zzc6.zzb(zzfgh.HTTP, zzc4);
        zzc6.zzb(zzfgh.PRE_PROCESS, zzc5);
        zzhev zzc7 = zzc6.zzc();
        this.zzu = zzc7;
        zzhfa zzc8 = zzheq.zzc(new zzdqv(zzewd, zzcih.zzh, zzffh.zza(), zzc7));
        this.zzv = zzc8;
        zzhfe zza2 = zzhff.zza(0, 1);
        zza2.zza(zzc8);
        zzhff zzc9 = zza2.zzc();
        this.zzw = zzc9;
        zzfgq zzfgq = new zzfgq(zzc9);
        this.zzx = zzfgq;
        this.zzy = zzheq.zzc(new zzfgp(zzffh.zza(), zzcih.zze, zzfgq));
    }

    private final zzeux zze() {
        zzevx zzevx = this.zza;
        zzbzd zza2 = zzckt.zza();
        zzgcs zzc2 = zzffh.zzc();
        String zzd2 = zzevx.zzd();
        String str = zzd2;
        zzevx zzevx2 = this.zza;
        return new zzeux(zza2, zzc2, zzd2, zzevx2.zzb(), zzevx2.zza());
    }

    private final zzevr zzf() {
        zzevx zzevx = this.zza;
        zzbbu zza2 = zzcki.zza();
        zzgcs zzc2 = zzffh.zzc();
        List zzf2 = zzevx.zzf();
        zzhez.zzb(zzf2);
        List list = zzf2;
        return new zzevr(zza2, zzc2, zzf2);
    }

    public final zzetu zza() {
        Context zzc2 = zzche.zzc(this.zzb.zza);
        zzcih zzcih = this.zzb;
        zzbza zza2 = zzckp.zza();
        zzbzb zza3 = zzckv.zza();
        Object zzb2 = zzcih.zzbo.zzb();
        zzhfa zzhfa = this.zzc;
        zzhfa zzhfa2 = this.zzo;
        zzhfa zzhfa3 = this.zzn;
        zzhfa zzhfa4 = this.zzl;
        zzhfa zzhfa5 = this.zzk;
        zzhfa zzhfa6 = this.zzj;
        zzhfa zzhfa7 = this.zzh;
        zzhfa zzhfa8 = this.zzg;
        return zzewe.zza(zzc2, zza2, zza3, zzb2, zze(), zzf(), zzheq.zza(zzhfa8), zzheq.zza(zzhfa7), zzheq.zza(zzhfa6), zzheq.zza(zzhfa5), zzheq.zza(zzhfa4), zzheq.zza(zzhfa3), zzheq.zza(zzhfa2), zzffh.zzc(), (zzfhh) zzhfa.zzb(), (zzdrw) this.zzb.zzM.zzb());
    }

    public final zzetu zzb() {
        Context zzc2 = zzche.zzc(this.zzb.zza);
        zzevx zzevx = this.zza;
        zzgcs zzc3 = zzffh.zzc();
        zzcih zzcih = this.zzb;
        long longValue = ((Long) zzbe.zzc().zza(zzbcl.zzek)).longValue();
        zzcih zzcih2 = this.zzb;
        zzevx zzevx2 = this.zza;
        return new zzetu(zzc2, zzc3, zzfxs.zzs(new zzesd(new zzevn(zzckp.zza(), zzffh.zzc(), zzevy.zzc(zzevx)), 0, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzesd(new zzevu(zzckr.zza(), (ScheduledExecutorService) zzcih.zze.zzb(), zzche.zzc(this.zzb.zza)), longValue, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzesd(zzeut.zza(zzckt.zza(), zzche.zzc(zzcih2.zza), (ScheduledExecutorService) this.zzb.zze.zzb(), zzffh.zzc(), zzevx2.zza(), zzewa.zzc(zzevx2), zzewc.zzc(zzevx2)), 0, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzesd(new zzewl(zzffh.zzc()), 0, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzevf(zzckn.zza(), zzffh.zzc(), zzche.zzc(this.zzb.zza)), zzf(), zze(), (zzetr) this.zzb.zzbo.zzb(), zzevd.zza(zzevy.zzc(this.zza), zzckl.zza(), (zzbzm) this.zzb.zzal.zzb(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzffh.zzc())), (zzfhh) this.zzc.zzb(), (zzdrw) this.zzb.zzM.zzb());
    }

    public final zzfgn zzc() {
        return (zzfgn) this.zzy.zzb();
    }

    public final zzfhh zzd() {
        return (zzfhh) this.zzc.zzb();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzcgx implements zzckx {
    @Nullable
    private static zzcgx zza;

    private static synchronized zzcgx zzG(Context context, @Nullable zzbpe zzbpe, int i, boolean z, int i2, zzcid zzcid) {
        synchronized (zzcgx.class) {
            zzcgx zzcgx = zza;
            if (zzcgx != null) {
                return zzcgx;
            }
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            zzbcl.zza(context);
            if (((Boolean) zzbed.zze.zze()).booleanValue()) {
                zzbbv.zzd(context);
            }
            zzfdf zzd = zzfdf.zzd(context);
            VersionInfoParcel zzc = zzd.zzc(244410000, false, i2);
            zzd.zzf(zzbpe);
            zzcis zzcis = new zzcis((zzcjm) null);
            zzcgy zzcgy = new zzcgy();
            zzcgy.zzf(zzc);
            zzcgy.zze(context);
            zzcgy.zzd(currentTimeMillis);
            zzcis.zzb(new zzcha(zzcgy, (zzcgz) null));
            zzcis.zzc(new zzcjn(zzcid));
            zzcgx zza2 = zzcis.zza();
            zzv.zzp().zzu(context, zzc);
            zzv.zzc().zzi(context);
            zzv.zzq().zzm(context);
            zzv.zzq().zzl(context);
            zzd.zza(context);
            zzv.zzb().zzd(context);
            zzv.zzw().zzb(context);
            zza2.zza().zzc();
            zzbyj.zzd(context);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().zza(zzbcl.zzaI)).booleanValue()) {
                    new zzeax(context, zzc, new zzbbj(new zzbbp(context)), new zzeac(new zzdzy(context), zza2.zzB())).zzb(zzv.zzp().zzi().zzN());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcgx zzb(Context context, @Nullable zzbpe zzbpe, int i) {
        return zzG(context, zzbpe, 244410000, false, i, new zzcid());
    }

    public abstract zzfjj zzA();

    public abstract zzgcs zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbzb zzE();

    public final zzbzb zzF() {
        return zzE();
    }

    public abstract zzcb zza();

    public abstract zzcjy zzc();

    public abstract zzcnz zzd();

    public abstract zzcpp zze();

    public abstract zzcyl zzf();

    public abstract zzdft zzg();

    public abstract zzdgp zzh();

    public abstract zzdoe zzi();

    public abstract zzdrw zzj();

    public abstract zzdtg zzk();

    public abstract zzduv zzl();

    public abstract zzdvs zzm();

    public abstract zzebv zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzo();

    public abstract zzab zzp();

    public abstract zzau zzq();

    public final zzeuu zzr(zzbvk zzbvk, int i) {
        return zzs(new zzevx(zzbvk, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzeuu zzs(zzevx zzevx);

    public abstract zzewo zzt();

    public abstract zzeyc zzu();

    public abstract zzezt zzv();

    public abstract zzfbh zzw();

    public abstract zzfcy zzx();

    public abstract zzfdi zzy();

    public abstract zzfhk zzz();
}

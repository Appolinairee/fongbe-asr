package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzedx implements zzecw {
    private final zzcpq zza;
    private final Context zzb;
    private final zzdow zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final zzfuc zzf;
    private final zzdrq zzg;

    public zzedx(zzcpq zzcpq, Context context, Executor executor, zzdow zzdow, zzfcj zzfcj, zzfuc zzfuc, zzdrq zzdrq) {
        this.zzb = context;
        this.zza = zzcpq;
        this.zze = executor;
        this.zzc = zzdow;
        this.zzd = zzfcj;
        this.zzf = zzfuc;
        this.zzg = zzdrq;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        return zzgch.zzn(zzgch.zzh((Object) null), new zzedw(this, zzfca, zzfbo), this.zze);
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        zzfbt zzfbt = zzfbo.zzs;
        return (zzfbt == null || zzfbt.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzfca zzfca, zzfbo zzfbo, Object obj) throws Exception {
        View view;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzs zza2 = zzfcp.zza(this.zzb, zzfbo.zzu);
        zzcex zza3 = this.zzc.zza(zza2, zzfbo, zzfca.zzb.zzb);
        zza3.zzac(zzfbo.zzW);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo.zzag) {
            view = new zzdoz(this.zzb, zza3.zzF(), (zzau) this.zzf.apply(zzfbo));
        } else {
            view = zzcql.zza(this.zzb, zza3.zzF(), zzfbo);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcpq zzcpq = this.zza;
        zzcrp zzcrp = new zzcrp(zzfca, zzfbo, (String) null);
        Objects.requireNonNull(zza3);
        zzcon zza4 = zzcpq.zza(zzcrp, new zzcot(view, zza3, new zzedr(zza3), zzfcp.zzb(zza2)));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        }
        zza4.zzh().zzi(zza3, false, (zzbjs) null, this.zzg.zza());
        zza4.zzc().zzo(new zzeds(zza3), zzbzw.zzg);
        String str = zzfbo.zzs.zza;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && zza4.zzi().zze(true)) {
            str = zzcgi.zzb(str, zzcgi.zza(zzfbo));
        }
        zza4.zzh();
        ListenableFuture zzj = zzdov.zzj(zza3, zzfbo.zzs.zzb, str, this.zzg.zza());
        if (zzfbo.zzM) {
            Objects.requireNonNull(zza3);
            zzj.addListener(new zzedt(zza3), this.zze);
        }
        zzj.addListener(new zzedu(this, zza3), this.zze);
        return zzgch.zzm(zzj, new zzedv(zza4), zzbzw.zzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcex zzcex) {
        zzcex.zzab();
        zzfcj zzfcj = this.zzd;
        zzcfz zzq = zzcex.zzq();
        zzga zzga = zzfcj.zza;
        if (!(zzga == null || zzq == null)) {
            zzq.zzs(zzga);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbr)).booleanValue() && !zzcex.isAttachedToWindow()) {
            zzcex.onPause();
            zzcex.zzav(true);
        }
    }
}

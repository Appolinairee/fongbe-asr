package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbbq;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdgh implements zzcvt, zzdcx {
    private final zzbye zza;
    private final Context zzb;
    private final zzbyi zzc;
    private final View zzd;
    private String zze;
    private final zzbbq.zza.C0000zza zzf;

    public zzdgh(zzbye zzbye, Context context, zzbyi zzbyi, View view, zzbbq.zza.C0000zza zza2) {
        this.zza = zzbye;
        this.zzb = context;
        this.zzc = zzbyi;
        this.zzd = view;
        this.zzf = zza2;
    }

    public final void zza() {
        this.zza.zzb(false);
    }

    public final void zzb() {
    }

    public final void zzc() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @ParametersAreNonnullByDefault
    public final void zzdq(zzbvw zzbvw, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbyi zzbyi = this.zzc;
                Context context = this.zzb;
                zzbyi.zzl(context, zzbyi.zza(context), this.zza.zza(), zzbvw.zzc(), zzbvw.zzb());
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzk() {
    }

    public final void zzl() {
        if (this.zzf != zzbbq.zza.C0000zza.APP_OPEN) {
            String zzc2 = this.zzc.zzc(this.zzb);
            this.zze = zzc2;
            this.zze = String.valueOf(zzc2).concat(this.zzf == zzbbq.zza.C0000zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}

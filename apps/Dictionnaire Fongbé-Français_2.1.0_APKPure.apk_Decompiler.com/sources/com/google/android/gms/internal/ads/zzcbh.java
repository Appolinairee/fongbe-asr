package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcbh {
    private final Context zza;
    private final zzcbs zzb;
    private final ViewGroup zzc;
    private zzcbg zzd;

    public zzcbh(Context context, ViewGroup viewGroup, zzcex zzcex) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcex;
        this.zzd = null;
    }

    public final zzcbg zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcbg zzcbg = this.zzd;
        if (zzcbg != null) {
            return zzcbg.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbg zzcbg = this.zzd;
        if (zzcbg != null) {
            zzcbg.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcbr zzcbr) {
        if (this.zzd == null) {
            zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
            Context context = this.zza;
            zzcbs zzcbs = this.zzb;
            zzcbg zzcbg = new zzcbg(context, zzcbs, i5, z, zzcbs.zzm().zza(), zzcbr);
            this.zzd = zzcbg;
            this.zzc.addView(zzcbg, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.zzd.zzF(i, i2, i3, i4);
            this.zzb.zzz(false);
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbg zzcbg = this.zzd;
        if (zzcbg != null) {
            zzcbg.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbg zzcbg = this.zzd;
        if (zzcbg != null) {
            zzcbg.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbg zzcbg = this.zzd;
        if (zzcbg != null) {
            zzcbg.zzC(i);
        }
    }
}

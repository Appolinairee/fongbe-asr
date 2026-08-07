package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdac implements AppEventListener, OnAdMetadataChangedListener, zzcvt, zza, zzcye, zzcwn, zzcxs, zzr, zzcwj, zzdds {
    private final zzczz zza = new zzczz(this, (zzdab) null);
    /* access modifiers changed from: private */
    @Nullable
    public zzekn zzb;
    /* access modifiers changed from: private */
    @Nullable
    public zzekr zzc;
    /* access modifiers changed from: private */
    @Nullable
    public zzexm zzd;
    /* access modifiers changed from: private */
    @Nullable
    public zzfar zze;

    private static void zzn(Object obj, zzdaa zzdaa) {
        if (obj != null) {
            zzdaa.zza(obj);
        }
    }

    public final void onAdClicked() {
        zzn(this.zzb, new zzcys());
        zzn(this.zzc, new zzcyt());
    }

    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzcyy());
    }

    public final void onAppEvent(String str, String str2) {
        zzn(this.zzb, new zzcze(str, str2));
    }

    public final void zza() {
        zzn(this.zzb, new zzczx());
        zzn(this.zze, new zzczy());
    }

    public final void zzb() {
        zzn(this.zzb, new zzczq());
        zzn(this.zze, new zzczr());
    }

    public final void zzc() {
        zzn(this.zzb, new zzcyz());
        zzn(this.zze, new zzcza());
    }

    public final void zzdE() {
        zzn(this.zzd, new zzczl());
    }

    public final void zzdd() {
        zzn(this.zzb, new zzczn());
        zzn(this.zzc, new zzczs());
        zzn(this.zze, new zzczt());
        zzn(this.zzd, new zzczu());
    }

    public final void zzdi() {
        zzn(this.zzd, new zzcyx());
    }

    public final void zzdo() {
        zzn(this.zzd, new zzczk());
    }

    public final void zzdp() {
        zzn(this.zzd, new zzczg());
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
        zzn(this.zzb, new zzczb(zzbvw, str, str2));
        zzn(this.zze, new zzczd(zzbvw, str, str2));
    }

    public final void zzdr() {
        zzn(this.zzd, new zzczm());
    }

    public final void zzds(int i) {
        zzn(this.zzd, new zzczo(i));
    }

    public final void zze() {
        zzn(this.zzb, new zzcyr());
        zzn(this.zze, new zzczc());
    }

    public final void zzf() {
        zzn(this.zzb, new zzcyu());
        zzn(this.zze, new zzcyv());
    }

    public final void zzg() {
        zzn(this.zzd, new zzczp());
    }

    public final void zzh(zzu zzu) {
        zzn(this.zzb, new zzczh(zzu));
        zzn(this.zze, new zzczi(zzu));
        zzn(this.zzd, new zzczj(zzu));
    }

    public final zzczz zzi() {
        return this.zza;
    }

    public final void zzq(zze zze2) {
        zzn(this.zze, new zzczv(zze2));
        zzn(this.zzb, new zzczw(zze2));
    }

    public final void zzr() {
        zzn(this.zzb, new zzcyw());
    }

    public final void zzu() {
        zzn(this.zzb, new zzczf());
    }
}

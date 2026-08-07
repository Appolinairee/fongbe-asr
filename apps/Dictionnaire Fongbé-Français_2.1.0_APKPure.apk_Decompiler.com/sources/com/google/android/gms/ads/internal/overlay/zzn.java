package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdrw;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, zzdrw zzdrw) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            zza zza = adOverlayInfoParcel.zzb;
            if (zza != null) {
                zza.onAdClicked();
            }
            zzdds zzdds = adOverlayInfoParcel.zzu;
            if (zzdds != null) {
                zzdds.zzdd();
            }
            Activity zzi = adOverlayInfoParcel.zzd.zzi();
            zzc zzc = adOverlayInfoParcel.zza;
            Activity activity = (zzc == null || !zzc.zzj || zzi == null) ? context : zzi;
            zzv.zzi();
            zzc zzc2 = adOverlayInfoParcel.zza;
            zza.zzb(activity, zzc2, adOverlayInfoParcel.zzi, zzc2 != null ? zzc2.zzi : null, zzdrw, adOverlayInfoParcel.zzq);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmU)).booleanValue()) {
            zzv.zzq();
            zzs.zzX(context, intent, zzdrw, adOverlayInfoParcel.zzq);
            return;
        }
        zzv.zzq();
        zzs.zzT(context, intent);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemg implements zzetq {
    public final zzs zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzemg(zzs zzs, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzs, "the adSize must not be null");
        this.zza = zzs;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    private final void zzc(Bundle bundle) {
        zzfcx.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfcx.zzf(bundle, "smart_h", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.zza.zzb == -2);
        zzfcx.zzg(bundle, "ene", true, this.zza.zzj);
        zzfcx.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfcx.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfcx.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfcx.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfcx.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfcx.zzc(bundle, "format", this.zzb);
        zzfcx.zzf(bundle, "fluid", "height", this.zzc);
        zzfcx.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfcx.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList arrayList = new ArrayList();
        zzs[] zzsArr = this.zza.zzg;
        if (zzsArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzs zzs : zzsArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzs.zzi);
                bundle3.putInt("height", zzs.zzb);
                bundle3.putInt("width", zzs.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcuv) obj).zzb);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcuv) obj).zza);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfed> CREATOR = new zzfee();
    @Nullable
    public final Context zza;
    public final zzfea zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfea[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfed(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfea[] values = zzfea.values();
        this.zzh = values;
        int[] zza2 = zzfeb.zza();
        this.zzl = zza2;
        int[] zza3 = zzfec.zza();
        this.zzm = zza3;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza2[i5];
        this.zzk = i6;
        int i7 = zza3[i6];
    }

    @Nullable
    public static zzfed zza(zzfea zzfea, Context context) {
        if (zzfea == zzfea.Rewarded) {
            return new zzfed(context, zzfea, ((Integer) zzbe.zzc().zza(zzbcl.zzgi)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgo)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgq)).intValue(), (String) zzbe.zzc().zza(zzbcl.zzgs), (String) zzbe.zzc().zza(zzbcl.zzgk), (String) zzbe.zzc().zza(zzbcl.zzgm));
        } else if (zzfea == zzfea.Interstitial) {
            return new zzfed(context, zzfea, ((Integer) zzbe.zzc().zza(zzbcl.zzgj)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgp)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgr)).intValue(), (String) zzbe.zzc().zza(zzbcl.zzgt), (String) zzbe.zzc().zza(zzbcl.zzgl), (String) zzbe.zzc().zza(zzbcl.zzgn));
        } else if (zzfea != zzfea.AppOpen) {
            return null;
        } else {
            return new zzfed(context, zzfea, ((Integer) zzbe.zzc().zza(zzbcl.zzgw)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgy)).intValue(), ((Integer) zzbe.zzc().zza(zzbcl.zzgz)).intValue(), (String) zzbe.zzc().zza(zzbcl.zzgu), (String) zzbe.zzc().zza(zzbcl.zzgv), (String) zzbe.zzc().zza(zzbcl.zzgx));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfed(@Nullable Context context, zzfea zzfea, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfea.values();
        this.zzl = zzfeb.zza();
        this.zzm = zzfec.zza();
        this.zza = context;
        this.zzi = zzfea.ordinal();
        this.zzb = zzfea;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}

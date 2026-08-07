package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzafn implements zzax {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafn(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzafn(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzei.zza;
        String str = readString;
        this.zzb = readString;
        String readString2 = parcel.readString();
        String str2 = readString2;
        this.zzc = readString2;
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzafn zzb(zzdy zzdy) {
        int zzg2 = zzdy.zzg();
        String zze2 = zzbb.zze(zzdy.zzB(zzdy.zzg(), StandardCharsets.US_ASCII));
        String zzB = zzdy.zzB(zzdy.zzg(), StandardCharsets.UTF_8);
        int zzg3 = zzdy.zzg();
        int zzg4 = zzdy.zzg();
        int zzg5 = zzdy.zzg();
        int zzg6 = zzdy.zzg();
        int zzg7 = zzdy.zzg();
        byte[] bArr = new byte[zzg7];
        zzdy.zzH(bArr, 0, zzg7);
        return new zzafn(zzg2, zze2, zzB, zzg3, zzg4, zzg5, zzg6, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafn zzafn = (zzafn) obj;
            return this.zza == zzafn.zza && this.zzb.equals(zzafn.zzb) && this.zzc.equals(zzafn.zzc) && this.zzd == zzafn.zzd && this.zze == zzafn.zze && this.zzf == zzafn.zzf && this.zzg == zzafn.zzg && Arrays.equals(this.zzh, zzafn.zzh);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public final void zza(zzat zzat) {
        zzat.zza(this.zzh, this.zza);
    }
}

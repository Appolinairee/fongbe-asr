package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzagk extends zzagh {
    public static final Parcelable.Creator<zzagk> CREATOR = new zzagj();
    public final String zza;
    public final String zzb;
    public final String zzc;

    zzagk(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = zzei.zza;
        String str = readString;
        this.zza = readString;
        String readString2 = parcel.readString();
        String str2 = readString2;
        this.zzb = readString2;
        String readString3 = parcel.readString();
        String str3 = readString3;
        this.zzc = readString3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagk zzagk = (zzagk) obj;
            return Objects.equals(this.zzb, zzagk.zzb) && Objects.equals(this.zza, zzagk.zza) && Objects.equals(this.zzc, zzagk.zzc);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = hashCode + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((i2 * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagk(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}

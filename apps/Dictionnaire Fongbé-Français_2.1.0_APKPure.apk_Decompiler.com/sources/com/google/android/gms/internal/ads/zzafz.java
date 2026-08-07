package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzafz extends zzagh {
    public static final Parcelable.Creator<zzafz> CREATOR = new zzafy();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    zzafz(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzei.zza;
        String str = readString;
        this.zza = readString;
        boolean z = true;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() == 0 ? false : z;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagh[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzagh) parcel.readParcelable(zzagh.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafz zzafz = (zzafz) obj;
            return this.zzb == zzafz.zzb && this.zzc == zzafz.zzc && Objects.equals(this.zza, zzafz.zza) && Arrays.equals(this.zzd, zzafz.zzd) && Arrays.equals(this.zze, zzafz.zze);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + true) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : 0);
        parcel.writeByte(this.zzc ? (byte) 1 : 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagh writeParcelable : this.zze) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzafz(String str, boolean z, boolean z2, String[] strArr, zzagh[] zzaghArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaghArr;
    }
}

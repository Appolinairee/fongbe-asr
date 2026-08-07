package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzago extends zzagh {
    public static final Parcelable.Creator<zzago> CREATOR = new zzagn();
    public final String zza;
    public final byte[] zzb;

    zzago(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzei.zza;
        String str = readString;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzago zzago = (zzago) obj;
            return Objects.equals(this.zza, zzago.zza) && Arrays.equals(this.zzb, zzago.zzb);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzago(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzay implements Parcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzaw();
    public final long zza;
    private final zzax[] zzb;

    public zzay(long j, zzax... zzaxArr) {
        this.zza = j;
        this.zzb = zzaxArr;
    }

    zzay(Parcel parcel) {
        this.zzb = new zzax[parcel.readInt()];
        int i = 0;
        while (true) {
            zzax[] zzaxArr = this.zzb;
            if (i < zzaxArr.length) {
                zzaxArr[i] = (zzax) parcel.readParcelable(zzax.class.getClassLoader());
                i++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzay zzay = (zzay) obj;
            return Arrays.equals(this.zzb, zzay.zzb) && this.zza == zzay.zza;
        }
    }

    public final int hashCode() {
        long j = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        int i = (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1));
        String arrays = Arrays.toString(this.zzb);
        if (i == 0) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzax writeParcelable : this.zzb) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzax zzb(int i) {
        return this.zzb[i];
    }

    public final zzay zzc(zzax... zzaxArr) {
        int length = zzaxArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzax[] zzaxArr2 = this.zzb;
        int i = zzei.zza;
        int length2 = zzaxArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaxArr2, length2 + length);
        System.arraycopy(zzaxArr, 0, copyOf, length2, length);
        return new zzay(j, (zzax[]) copyOf);
    }

    public final zzay zzd(zzay zzay) {
        return zzay == null ? this : zzc(zzay.zzb);
    }

    public zzay(List list) {
        this(-9223372036854775807L, (zzax[]) list.toArray(new zzax[0]));
    }
}

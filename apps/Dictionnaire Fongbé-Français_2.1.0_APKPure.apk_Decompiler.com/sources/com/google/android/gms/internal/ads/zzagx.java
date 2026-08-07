package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzagx implements Parcelable.Creator {
    zzagx() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzagy(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzagy[i];
    }
}

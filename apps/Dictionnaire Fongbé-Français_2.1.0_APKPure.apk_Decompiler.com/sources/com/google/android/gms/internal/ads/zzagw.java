package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzagw implements Parcelable.Creator {
    zzagw() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, zzagy.class.getClassLoader());
        return new zzagz(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzagz[i];
    }
}

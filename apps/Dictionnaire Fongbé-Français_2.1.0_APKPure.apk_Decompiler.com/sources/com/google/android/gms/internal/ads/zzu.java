package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzu implements Comparator<zzt>, Parcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzr();
    public final String zza;
    public final int zzb;
    private final zzt[] zzc;
    private int zzd;

    zzu(Parcel parcel) {
        this.zza = parcel.readString();
        int i = zzei.zza;
        zzt[] zztArr = (zzt[]) parcel.createTypedArray(zzt.CREATOR);
        this.zzc = zztArr;
        this.zzb = zztArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzt zzt = (zzt) obj;
        zzt zzt2 = (zzt) obj2;
        if (zzh.zza.equals(zzt.zza)) {
            return !zzh.zza.equals(zzt2.zza) ? 1 : 0;
        }
        return zzt.zza.compareTo(zzt2.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzu zzu = (zzu) obj;
            return Objects.equals(this.zza, zzu.zza) && Arrays.equals(this.zzc, zzu.zzc);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzt zza(int i) {
        return this.zzc[i];
    }

    public final zzu zzb(String str) {
        if (Objects.equals(this.zza, str)) {
            return this;
        }
        return new zzu(str, false, this.zzc);
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzt[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzu(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzt... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzt[] r3 = (com.google.android.gms.internal.ads.zzt[]) r3
        L_0x000e:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzu.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzt[]):void");
    }

    public zzu(String str, zzt... zztArr) {
        this((String) null, true, zztArr);
    }

    public zzu(List list) {
        this((String) null, false, (zzt[]) list.toArray(new zzt[0]));
    }
}

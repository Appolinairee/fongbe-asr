package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfos> CREATOR = new zzfot();
    public final int zza;
    private zzasy zzb = null;
    private byte[] zzc;

    zzfos(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzasy zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzasy.zzd(this.zzc, zzgxb.zza());
                this.zzc = null;
            } catch (zzgyg | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzasy zzasy = this.zzb;
        if (zzasy == null && this.zzc != null) {
            return;
        }
        if (zzasy != null && this.zzc == null) {
            return;
        }
        if (zzasy != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzasy == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}

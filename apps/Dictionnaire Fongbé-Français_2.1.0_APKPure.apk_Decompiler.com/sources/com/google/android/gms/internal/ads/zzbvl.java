package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbvl implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r20)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r18 = r17
            r15 = 0
            r16 = 0
        L_0x0019:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L_0x0088
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r20)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x0083;
                case 2: goto L_0x0079;
                case 3: goto L_0x006f;
                case 4: goto L_0x006a;
                case 5: goto L_0x0065;
                case 6: goto L_0x005b;
                case 7: goto L_0x0056;
                case 8: goto L_0x002a;
                case 9: goto L_0x0051;
                case 10: goto L_0x0047;
                case 11: goto L_0x0042;
                case 12: goto L_0x003d;
                case 13: goto L_0x0038;
                case 14: goto L_0x0033;
                case 15: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0019
        L_0x002e:
            android.os.Bundle r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x0019
        L_0x0033:
            android.os.Bundle r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x0019
        L_0x0038:
            boolean r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0019
        L_0x003d:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0019
        L_0x0042:
            java.lang.String r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0019
        L_0x0047:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzfed> r3 = com.google.android.gms.internal.ads.zzfed.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r13 = r2
            com.google.android.gms.internal.ads.zzfed r13 = (com.google.android.gms.internal.ads.zzfed) r13
            goto L_0x0019
        L_0x0051:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0019
        L_0x0056:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0019
        L_0x005b:
            android.os.Parcelable$Creator r3 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r10 = r2
            android.content.pm.PackageInfo r10 = (android.content.pm.PackageInfo) r10
            goto L_0x0019
        L_0x0065:
            java.util.ArrayList r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0019
        L_0x006a:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0019
        L_0x006f:
            android.os.Parcelable$Creator r3 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r7 = r2
            android.content.pm.ApplicationInfo r7 = (android.content.pm.ApplicationInfo) r7
            goto L_0x0019
        L_0x0079:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r6 = r2
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r6
            goto L_0x0019
        L_0x0083:
            android.os.Bundle r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x0019
        L_0x0088:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzbvk r0 = new com.google.android.gms.internal.ads.zzbvk
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvl.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvk[i];
    }
}

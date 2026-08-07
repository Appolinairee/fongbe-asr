package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbk {
    public final String zza;
    public String zzb;
    public String zzc = null;
    public zzbvk zzd;
    public Bundle zze;
    public Bundle zzf = new Bundle();
    private long zzg = -1;
    private long zzh = -1;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbk(android.util.JsonReader r9, com.google.android.gms.internal.ads.zzbvk r10) throws java.io.IOException {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.zzc = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r8.zzf = r0
            r0 = -1
            r8.zzg = r0
            r8.zzh = r0
            r8.zzd = r10
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.beginObject()
            java.lang.String r1 = ""
            r2 = r1
        L_0x0020:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.String r3 = r9.nextName()
            if (r3 != 0) goto L_0x002d
            r3 = r1
        L_0x002d:
            int r4 = r3.hashCode()
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r4) {
                case -1573145462: goto L_0x0056;
                case -995427962: goto L_0x004c;
                case -271442291: goto L_0x0042;
                case 1725551537: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0060
        L_0x0038:
            java.lang.String r4 = "end_time"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0060
            r3 = 3
            goto L_0x0061
        L_0x0042:
            java.lang.String r4 = "signal_dictionary"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0060
            r3 = 1
            goto L_0x0061
        L_0x004c:
            java.lang.String r4 = "params"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0060
            r3 = 0
            goto L_0x0061
        L_0x0056:
            java.lang.String r4 = "start_time"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0060
            r3 = 2
            goto L_0x0061
        L_0x0060:
            r3 = -1
        L_0x0061:
            if (r3 == 0) goto L_0x0099
            if (r3 == r7) goto L_0x007b
            if (r3 == r6) goto L_0x0074
            if (r3 == r5) goto L_0x006d
            r9.skipValue()
            goto L_0x0020
        L_0x006d:
            long r3 = r9.nextLong()
            r8.zzh = r3
            goto L_0x0020
        L_0x0074:
            long r3 = r9.nextLong()
            r8.zzg = r3
            goto L_0x0020
        L_0x007b:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.beginObject()
        L_0x0083:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.String r3 = r9.nextName()
            java.lang.String r4 = r9.nextString()
            r0.put(r3, r4)
            goto L_0x0083
        L_0x0095:
            r9.endObject()
            goto L_0x0020
        L_0x0099:
            java.lang.String r2 = r9.nextString()
            goto L_0x0020
        L_0x009e:
            r8.zza = r2
            r9.endObject()
            java.util.Set r9 = r0.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ab:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L_0x00ab
            android.os.Bundle r1 = r8.zzf
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.putString(r2, r0)
            goto L_0x00ab
        L_0x00d5:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzck
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0105
            if (r10 == 0) goto L_0x0105
            android.os.Bundle r9 = r10.zzm
            if (r9 == 0) goto L_0x0105
            com.google.android.gms.internal.ads.zzdre r0 = com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_START
            java.lang.String r0 = r0.zza()
            long r1 = r8.zzg
            r9.putLong(r0, r1)
            android.os.Bundle r9 = r10.zzm
            com.google.android.gms.internal.ads.zzdre r10 = com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_END
            java.lang.String r10 = r10.zza()
            long r0 = r8.zzh
            r9.putLong(r10, r0)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzbk.<init>(android.util.JsonReader, com.google.android.gms.internal.ads.zzbvk):void");
    }
}

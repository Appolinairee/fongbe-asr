package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbr {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfbq zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0248, code lost:
        r31.skipValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ExcHandler: IOException | JSONException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:50:0x0133] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfbr(android.util.JsonReader r31) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r30 = this;
            r0 = r30
            r30.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r31.beginObject()
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r19 = r10
            r5 = 0
            r6 = 0
            r18 = 0
            r20 = -1
            r22 = -1
            r24 = 0
            r26 = -1
            r27 = 1
            r10 = r15
        L_0x0035:
            boolean r28 = r31.hasNext()
            if (r28 == 0) goto L_0x0252
            java.lang.String r13 = r31.nextName()
            java.lang.String r7 = "nofill_urls"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x004c
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbs.zzd(r31)
            goto L_0x0035
        L_0x004c:
            java.lang.String r7 = "refresh_interval"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0059
            int r5 = r31.nextInt()
            goto L_0x0035
        L_0x0059:
            java.lang.String r7 = "refresh_load_delay_time_interval"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x0066
            int r26 = r31.nextInt()
            goto L_0x0035
        L_0x0066:
            java.lang.String r7 = "gws_query_id"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0074
            java.lang.String r7 = r31.nextString()
            r8 = r7
            goto L_0x0035
        L_0x0074:
            java.lang.String r7 = "analytics_query_ad_event_id"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = r31.nextString()
            r9 = r7
            goto L_0x0035
        L_0x0082:
            java.lang.String r7 = "is_idless"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0091
            boolean r7 = r31.nextBoolean()
            r18 = r7
            goto L_0x0035
        L_0x0091:
            java.lang.String r7 = "response_code"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x009e
            int r6 = r31.nextInt()
            goto L_0x0035
        L_0x009e:
            java.lang.String r7 = "latency"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x00ab
            long r24 = r31.nextLong()
            goto L_0x0035
        L_0x00ab:
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzig
            r29 = r12
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00d9
            java.lang.String r7 = "public_error"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x00d9
            android.util.JsonToken r7 = r31.peek()
            android.util.JsonToken r12 = android.util.JsonToken.BEGIN_OBJECT
            if (r7 != r12) goto L_0x00d9
            com.google.android.gms.internal.ads.zzfbq r7 = new com.google.android.gms.internal.ads.zzfbq
            r12 = r31
            r7.<init>(r12)
            r19 = r7
            goto L_0x00e8
        L_0x00d9:
            r12 = r31
            java.lang.String r7 = "bidding_data"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x00ec
            java.lang.String r7 = r31.nextString()
            r10 = r7
        L_0x00e8:
            r12 = r29
            goto L_0x0035
        L_0x00ec:
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzkm
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x010a
            java.lang.String r7 = "topics_should_record_observation"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x010a
            r31.nextBoolean()
            goto L_0x00e8
        L_0x010a:
            java.lang.String r7 = "adapter_response_replacement_key"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0119
            java.lang.String r7 = r31.nextString()
            r12 = r7
            goto L_0x0035
        L_0x0119:
            java.lang.String r7 = "response_info_extras"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0147
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzgE
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0143
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.zzbs.zzi(r31)     // Catch:{ IOException | JSONException -> 0x0245, IllegalStateException -> 0x013f }
            android.os.Bundle r7 = com.google.android.gms.ads.internal.util.zzbs.zza(r7)     // Catch:{ IOException | JSONException -> 0x0245, IllegalStateException -> 0x013f }
            if (r7 == 0) goto L_0x00e8
            r2 = r7
            goto L_0x00e8
        L_0x013f:
            r31.skipValue()
            goto L_0x00e8
        L_0x0143:
            r31.skipValue()
            goto L_0x00e8
        L_0x0147:
            java.lang.String r7 = "adRequestPostBody"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzjg
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0167
            java.lang.String r7 = r31.nextString()
            r15 = r7
            goto L_0x00e8
        L_0x0167:
            r31.skipValue()
            goto L_0x00e8
        L_0x016c:
            java.lang.String r7 = "adRequestUrl"
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzjg
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x018d
            java.lang.String r7 = r31.nextString()
            r14 = r7
            goto L_0x00e8
        L_0x018d:
            r31.skipValue()
            goto L_0x00e8
        L_0x0192:
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzjh
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01b3
            java.lang.String r7 = "adResponseBody"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x01b3
            java.lang.String r7 = r31.nextString()
            r11 = r7
            goto L_0x00e8
        L_0x01b3:
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzjh
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01d3
            java.lang.String r7 = "adResponseHeaders"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x01d3
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzi(r31)
            goto L_0x00e8
        L_0x01d3:
            java.lang.String r7 = "max_parallel_renderers"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x01e6
            int r7 = r31.nextInt()
            r12 = 1
            int r27 = java.lang.Math.max(r12, r7)
            goto L_0x00e8
        L_0x01e6:
            r12 = 1
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzjo
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0207
            java.lang.String r7 = "inspector_ad_transaction_extras"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x0207
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbs.zzi(r31)
            goto L_0x00e8
        L_0x0207:
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzcl
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r12.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x024d
            java.lang.String r7 = "latency_extras"
            boolean r7 = java.util.Objects.equals(r13, r7)
            if (r7 == 0) goto L_0x024d
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.zzbs.zzi(r31)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            android.os.Bundle r7 = com.google.android.gms.ads.internal.util.zzbs.zza(r7)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            if (r7 == 0) goto L_0x00e8
            java.lang.String r12 = "start_time"
            double r12 = r7.getDouble(r12)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            long r12 = zza(r12)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            r22 = r12
            java.lang.String r12 = "end_time"
            double r12 = r7.getDouble(r12)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            long r12 = zza(r12)     // Catch:{ IOException | JSONException -> 0x0245, IOException | JSONException -> 0x0245, IllegalStateException -> 0x0248 }
            r20 = r12
            goto L_0x00e8
        L_0x0245:
            goto L_0x00e8
        L_0x0248:
            r31.skipValue()
            goto L_0x00e8
        L_0x024d:
            r31.skipValue()
            goto L_0x00e8
        L_0x0252:
            r29 = r12
            r31.endObject()
            r0.zza = r1
            r0.zzc = r5
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzber.zzc
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x026d
            r1 = -1
            r0.zzd = r1
            goto L_0x0292
        L_0x026d:
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzbdz.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r12 = r1.longValue()
            r16 = -1
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x028e
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzbdz.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r0.zzd = r1
            goto L_0x0292
        L_0x028e:
            r13 = r26
            r0.zzd = r13
        L_0x0292:
            r0.zzb = r8
            r0.zze = r9
            r0.zzf = r6
            r5 = r24
            r0.zzg = r5
            r1 = r19
            r0.zzj = r1
            r9 = r18
            r0.zzh = r9
            r0.zzi = r10
            r0.zzk = r2
            r0.zzl = r14
            r0.zzm = r15
            r0.zzn = r11
            r0.zzo = r3
            r0.zzp = r4
            r8 = r29
            r0.zzq = r8
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzbep.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d4
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzbep.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r27 = r1.intValue()
        L_0x02d4:
            r1 = r27
            r0.zzr = r1
            r5 = r22
            r0.zzs = r5
            r5 = r20
            r0.zzt = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.<init>(android.util.JsonReader):void");
    }

    private static final long zza(double d) {
        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
            return -1;
        }
        return (long) d;
    }
}

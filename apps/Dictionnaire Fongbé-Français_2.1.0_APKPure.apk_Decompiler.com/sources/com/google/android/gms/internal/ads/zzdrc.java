package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrc implements zzcyq, zzcxh, zzcvw, zzdee {
    private final zzdrq zza;
    private final zzdsb zzb;
    private final int zzc;

    zzdrc(zzdrq zzdrq, zzdsb zzdsb, int i) {
        this.zza = zzdrq;
        this.zzb = zzdsb;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j = bundle.getLong(str);
                if (j >= 0) {
                    this.zza.zzc(str, String.valueOf(j));
                }
            }
        }
    }

    private final void zzd(Bundle bundle, zzfxn zzfxn) {
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && bundle != null) {
            bundle.putLong(zzdre.PUBLIC_API_CALLBACK.zza(), zzv.zzC().currentTimeMillis());
            String str2 = "0";
            if (bundle.containsKey("ls")) {
                zzdrq zzdrq = this.zza;
                if (true != bundle.getBoolean("ls")) {
                    str = str2;
                } else {
                    str = "1";
                }
                zzdrq.zzc("ls", str);
            }
            int size = zzfxn.size();
            for (int i = 0; i < size; i++) {
                zzdrf zzdrf = (zzdrf) zzfxn.get(i);
                long j = bundle.getLong(zzdrf.zza().zza(), -1);
                long j2 = bundle.getLong(zzdrf.zzb().zza(), -1);
                if (j > 0 && j2 > 0) {
                    this.zza.zzc(zzdrf.zzc(), String.valueOf(j2 - j));
                }
            }
            zzc(bundle.getBundle("client_sig_latency_key"));
            zzc(bundle.getBundle("gms_sig_latency_key"));
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                if (bundle.containsKey("sod_h")) {
                    zzdrq zzdrq2 = this.zza;
                    if (true == bundle.getBoolean("sod_h")) {
                        str2 = "1";
                    }
                    zzdrq2.zzc("sod_h", str2);
                }
                if (bundle.containsKey("cmr")) {
                    this.zza.zzc("cmr", String.valueOf(bundle.getInt("cmr")));
                }
            }
        }
    }

    public final void zzdl(zzbvk zzbvk) {
        this.zza.zze(zzbvk.zza);
    }

    public final void zzdm(zzfca zzfca) {
        this.zza.zzd(zzfca);
    }

    public final void zzdz(zze zze) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zze.zza));
        this.zza.zzc("ed", zze.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgY)).booleanValue()) {
            this.zza.zzc("emsg", zze.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzgM
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzhq
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            int r1 = r4.zzc
            java.util.Map r0 = r0.zzb()
            java.lang.String r2 = "sgw"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
        L_0x0036:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r5 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzdrq r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdrq r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsb r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzg(r0)
            return
        L_0x005e:
            com.google.android.gms.internal.ads.zzbvk r2 = r5.zzd
            android.os.Bundle r3 = r5.zze
            if (r2 == 0) goto L_0x006c
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzfxn r3 = com.google.android.gms.internal.ads.zzdrf.zza
            r4.zzd(r2, r3)
            goto L_0x0079
        L_0x006c:
            if (r3 == 0) goto L_0x0079
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.internal.ads.zzfxn r2 = com.google.android.gms.internal.ads.zzdrf.zza
            r4.zzd(r3, r2)
        L_0x0079:
            java.lang.String r2 = r5.zzc     // Catch:{ JSONException -> 0x00e4 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x00e4 }
            if (r2 == 0) goto L_0x0084
            java.lang.String r2 = r5.zzb     // Catch:{ JSONException -> 0x00e4 }
            goto L_0x0086
        L_0x0084:
            java.lang.String r2 = r5.zzc     // Catch:{ JSONException -> 0x00e4 }
        L_0x0086:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e4 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00e4 }
            com.google.android.gms.internal.ads.zzdrq r2 = r4.zza
            java.util.Map r2 = r2.zzb()
            r2.put(r1, r0)
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzjz
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x00c0 }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = "1"
            goto L_0x00c8
        L_0x00bd:
            java.lang.String r1 = "0"
            goto L_0x00c8
        L_0x00c0:
            r1 = move-exception
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r1)
        L_0x00c6:
            java.lang.String r1 = "na"
        L_0x00c8:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbvk r5 = r5.zzd
            if (r5 == 0) goto L_0x00d8
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            android.os.Bundle r5 = r5.zza
            r0.zze(r5)
        L_0x00d8:
            com.google.android.gms.internal.ads.zzdsb r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzg(r0)
            return
        L_0x00e4:
            com.google.android.gms.internal.ads.zzdrq r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf"
            r5.put(r1, r0)
            com.google.android.gms.internal.ads.zzdrq r5 = r4.zza
            java.util.Map r5 = r5.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsb r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdrq r0 = r4.zza
            java.util.Map r0 = r0.zzb()
            r5.zzg(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrc.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }

    public final void zzf(String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzg(this.zza.zzb());
        }
    }

    public final void zzs() {
        String str;
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdrf.zzb);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmw)).booleanValue()) {
            zzdrq zzdrq = this.zza;
            if (true != WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                str = "0";
            } else {
                str = "1";
            }
            zzdrq.zzb().put("mafe", str);
        }
        this.zzb.zzg(this.zza.zzb());
    }
}

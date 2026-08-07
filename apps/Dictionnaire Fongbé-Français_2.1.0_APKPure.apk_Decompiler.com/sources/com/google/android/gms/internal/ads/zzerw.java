package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerw implements zzetq {
    private final zzfcj zza;
    private final PackageInfo zzb;
    private final zzg zzc;

    public zzerw(zzfcj zzfcj, PackageInfo packageInfo, zzg zzg) {
        this.zza = zzfcj;
        this.zzb = packageInfo;
        this.zzc = zzg;
    }

    private final void zzc(Bundle bundle) {
        zzbfl zzbfl = this.zza.zzi;
        if (zzbfl != null && zzbfl.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbfl.zzj);
            bundle.putInt("sccg_dir", this.zza.zzi.zzi);
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcuv zzcuv = (zzcuv) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            zzc(zzcuv.zzb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0101, code lost:
        if (r12 == 3) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            java.util.ArrayList r0 = r0.zzg
            com.google.android.gms.internal.ads.zzcuv r12 = (com.google.android.gms.internal.ads.zzcuv) r12
            if (r0 != 0) goto L_0x000a
            goto L_0x01a3
        L_0x000a:
            boolean r1 = r0.isEmpty()
            r2 = 0
            java.lang.String r3 = "native_version"
            if (r1 == 0) goto L_0x0019
            android.os.Bundle r12 = r12.zza
            r12.putInt(r3, r2)
            return
        L_0x0019:
            android.os.Bundle r1 = r12.zza
            r4 = 3
            r1.putInt(r3, r4)
            java.lang.String r3 = "native_templates"
            r1.putStringArrayList(r3, r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            java.lang.String r3 = "native_custom_templates"
            java.util.ArrayList r0 = r0.zzh
            r1.putStringArrayList(r3, r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L_0x00a1
            int r0 = r0.zza
            java.lang.String r6 = "landscape"
            java.lang.String r7 = "portrait"
            java.lang.String r8 = "any"
            java.lang.String r9 = "unknown"
            if (r0 <= r4) goto L_0x006a
            java.lang.String r0 = "enable_native_media_orientation"
            r1.putBoolean(r0, r5)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            int r0 = r0.zzh
            if (r0 == r5) goto L_0x005e
            if (r0 == r3) goto L_0x005c
            if (r0 == r4) goto L_0x005a
            r10 = 4
            if (r0 == r10) goto L_0x0057
            r0 = r9
            goto L_0x005f
        L_0x0057:
            java.lang.String r0 = "square"
            goto L_0x005f
        L_0x005a:
            r0 = r7
            goto L_0x005f
        L_0x005c:
            r0 = r6
            goto L_0x005f
        L_0x005e:
            r0 = r8
        L_0x005f:
            boolean r10 = r9.equals(r0)
            if (r10 != 0) goto L_0x006a
            java.lang.String r10 = "native_media_orientation"
            r1.putString(r10, r0)
        L_0x006a:
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            int r0 = r0.zzc
            if (r0 == 0) goto L_0x007a
            if (r0 == r5) goto L_0x0078
            if (r0 == r3) goto L_0x007b
            r6 = r9
            goto L_0x007b
        L_0x0078:
            r6 = r7
            goto L_0x007b
        L_0x007a:
            r6 = r8
        L_0x007b:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = "native_image_orientation"
            r1.putString(r0, r6)
        L_0x0086:
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            boolean r0 = r0.zzd
            java.lang.String r6 = "native_multiple_images"
            r1.putBoolean(r6, r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            boolean r0 = r0.zzg
            java.lang.String r6 = "use_custom_mute"
            r1.putBoolean(r6, r0)
            android.os.Bundle r12 = r12.zza
            r11.zzc(r12)
        L_0x00a1:
            android.content.pm.PackageInfo r12 = r11.zzb
            if (r12 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            int r2 = r12.versionCode
        L_0x00a8:
            com.google.android.gms.ads.internal.util.zzg r12 = r11.zzc
            int r12 = r12.zza()
            if (r2 <= r12) goto L_0x00ba
            com.google.android.gms.ads.internal.util.zzg r12 = r11.zzc
            r12.zzq()
            com.google.android.gms.ads.internal.util.zzg r12 = r11.zzc
            r12.zzt(r2)
        L_0x00ba:
            com.google.android.gms.ads.internal.util.zzg r12 = r11.zzc
            org.json.JSONObject r12 = r12.zzn()
            r0 = 0
            if (r12 == 0) goto L_0x00d1
            com.google.android.gms.internal.ads.zzfcj r2 = r11.zza
            java.lang.String r2 = r2.zzf
            org.json.JSONArray r12 = r12.optJSONArray(r2)
            if (r12 == 0) goto L_0x00d1
            java.lang.String r0 = r12.toString()
        L_0x00d1:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00dc
            java.lang.String r12 = "native_advanced_settings"
            r1.putString(r12, r0)
        L_0x00dc:
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            int r12 = r12.zzk
            if (r12 <= r5) goto L_0x00e7
            java.lang.String r0 = "max_num_ads"
            r1.putInt(r0, r12)
        L_0x00e7:
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            com.google.android.gms.internal.ads.zzblz r12 = r12.zzb
            if (r12 == 0) goto L_0x0133
            java.lang.String r0 = r12.zzc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0127
            int r0 = r12.zza
            java.lang.String r2 = "p"
            java.lang.String r6 = "l"
            if (r0 < r3) goto L_0x0104
            int r12 = r12.zzd
            if (r12 == r3) goto L_0x0120
            if (r12 == r4) goto L_0x0121
            goto L_0x0120
        L_0x0104:
            int r12 = r12.zzb
            if (r12 == r5) goto L_0x0120
            if (r12 == r3) goto L_0x0121
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Instream ad video aspect ratio "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r12 = " is wrong."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r12)
        L_0x0120:
            r2 = r6
        L_0x0121:
            java.lang.String r12 = "ia_var"
            r1.putString(r12, r2)
            goto L_0x012e
        L_0x0127:
            java.lang.String r12 = r12.zzc
            java.lang.String r0 = "ad_tag"
            r1.putString(r0, r12)
        L_0x012e:
            java.lang.String r12 = "instr"
            r1.putBoolean(r12, r5)
        L_0x0133:
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            com.google.android.gms.internal.ads.zzbhn r12 = r12.zza()
            if (r12 == 0) goto L_0x0140
            java.lang.String r12 = "has_delayed_banner_listener"
            r1.putBoolean(r12, r5)
        L_0x0140:
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzlJ
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x01a3
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r12 = r12.zzi
            if (r12 == 0) goto L_0x01a3
            com.google.android.gms.ads.internal.client.zzga r12 = r12.zzf
            if (r12 == 0) goto L_0x018d
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzga r0 = r0.zzf
            boolean r0 = r0.zza
            java.lang.String r2 = "startMuted"
            r12.putBoolean(r2, r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzga r0 = r0.zzf
            boolean r0 = r0.zzc
            java.lang.String r2 = "clickToExpandRequested"
            r12.putBoolean(r2, r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r0 = r0.zzi
            com.google.android.gms.ads.internal.client.zzga r0 = r0.zzf
            boolean r0 = r0.zzb
            java.lang.String r2 = "customControlsRequested"
            r12.putBoolean(r2, r0)
            java.lang.String r0 = "video"
            r1.putBundle(r0, r12)
        L_0x018d:
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r12 = r12.zzi
            boolean r12 = r12.zzb
            java.lang.String r0 = "disable_image_loading"
            r1.putBoolean(r0, r12)
            com.google.android.gms.internal.ads.zzfcj r12 = r11.zza
            com.google.android.gms.internal.ads.zzbfl r12 = r12.zzi
            int r12 = r12.zze
            java.lang.String r0 = "preferred_ad_choices_position"
            r1.putInt(r0, r12)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerw.zzb(java.lang.Object):void");
    }
}

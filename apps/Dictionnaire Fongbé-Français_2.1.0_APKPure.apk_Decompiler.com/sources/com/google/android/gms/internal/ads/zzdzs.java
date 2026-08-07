package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.net.HttpHeaders;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdzs implements zzffr {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfgw zzc;
    private final zzfhh zzd;

    public zzdzs(String str, zzfhh zzfhh, zzfgw zzfgw) {
        this.zzb = str;
        this.zzd = zzfhh;
        this.zzc = zzfgw;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdvy zzdvy;
        JSONObject zzb2;
        String str;
        zzdzr zzdzr = (zzdzr) obj;
        int optInt = zzdzr.zza.optInt("http_timeout_millis", 60000);
        zzbvm zza2 = zzdzr.zzb;
        String str2 = "";
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            if (zzdzr.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzaZ)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, this.zzb);
                }
            }
            if (zzdzr.zzb.zzk() && (zzb2 = zzdzr.zza) != null) {
                JSONObject optJSONObject = zzb2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            if (zzdzr.zzb != null && !TextUtils.isEmpty(zzdzr.zzb.zzf())) {
                str2 = zzdzr.zzb.zzf();
            }
            zzfhh zzfhh = this.zzd;
            zzfgw zzfgw = this.zzc;
            zzfgw.zzg(true);
            zzfhh.zza(zzfgw);
            return new zzdzn(zzdzr.zzb.zzg(), optInt, hashMap, str2.getBytes(StandardCharsets.UTF_8), "", zzdzr.zzb.zzk());
        }
        if (zza2.zza() == 1) {
            if (zza2.zzh() != null) {
                str2 = TextUtils.join(", ", zza2.zzh());
                zzo.zzg(str2);
            }
            zzdvy = new zzdvy(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdvy = new zzdvy(1);
        }
        zzfhh zzfhh2 = this.zzd;
        zzfgw zzfgw2 = this.zzc;
        zzfgw2.zzh(zzdvy);
        zzfgw2.zzg(false);
        zzfhh2.zza(zzfgw2);
        throw zzdvy;
    }
}

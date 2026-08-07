package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcdf implements zzbjp {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzo.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcde zzcde;
        zzccw zzccw;
        Map map2 = map;
        zzcbs zzcbs = (zzcbs) obj;
        if (zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccx zzz = zzv.zzz();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzcbr zzcbr = new zzcbr((String) map2.get("flags"));
            boolean z = zzcbr.zzk;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = zzz.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzccw = null;
                            break;
                        }
                        zzccw zzccw2 = (zzccw) it.next();
                        if (zzccw2.zza == zzcbs && str.equals(zzccw2.zze())) {
                            zzccw = zzccw2;
                            break;
                        }
                    }
                } else {
                    zzccw = zzz.zza(zzcbs);
                }
                if (zzccw != null) {
                    zzo.zzj("Precache task is already running.");
                    return;
                } else if (zzcbs.zzj() == null) {
                    zzo.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzcbs.zzA(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzcbs.zzy(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzcbs.zzx(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzccp zzccp = zzcbs.zzj().zzb;
                    if (intValue > 0) {
                        int i2 = zzcbr.zzg;
                        int zzu = zzcbj.zzu();
                        if (zzu < i2) {
                            zzcde = new zzcdn(zzcbs, zzcbr);
                        } else {
                            if (((Boolean) zzbe.zzc().zza(zzbcl.zzn)).booleanValue()) {
                                zzu = zzcdk.zzi();
                            }
                            zzcde = zzu < zzcbr.zzb ? new zzcdk(zzcbs, zzcbr) : new zzcdi(zzcbs);
                        }
                    } else {
                        zzcde = new zzcdh(zzcbs);
                    }
                    new zzccw(zzcbs, zzcde, str, strArr).zzb();
                }
            } else {
                zzccw zza = zzz.zza(zzcbs);
                if (zza != null) {
                    zzcde = zza.zzb;
                } else {
                    zzo.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzcde.zzs(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzcde.zzr(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzcde.zzp(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzcde.zzq(zzb8.intValue());
            }
        } else if (!zzz.zzd(zzcbs)) {
            zzo.zzj("Precache abort but no precache task running.");
        }
    }
}

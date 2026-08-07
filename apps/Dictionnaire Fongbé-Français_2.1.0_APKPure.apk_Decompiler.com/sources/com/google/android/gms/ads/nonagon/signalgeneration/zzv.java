package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzv {
    /* access modifiers changed from: private */
    public final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    /* access modifiers changed from: private */
    public final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final zzdsb zzh;
    private Map zzi;

    public zzv(zzdsb zzdsb) {
        this.zzh = zzdsb;
        this.zza = ((Integer) zzbe.zzc().zza(zzbcl.zzgK)).intValue();
        this.zzb = ((Long) zzbe.zzc().zza(zzbcl.zzgL)).longValue();
        this.zzc = ((Boolean) zzbe.zzc().zza(zzbcl.zzgP)).booleanValue();
        this.zzd = ((Boolean) zzbe.zzc().zza(zzbcl.zzgO)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzt(this));
    }

    private final synchronized void zzi(zzdrq zzdrq) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzbzw.zza.execute(new zzs(this, zzdrq, clone, clone2));
        }
    }

    private final void zzj(zzdrq zzdrq, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrq.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdrq zzdrq) {
        zzu zzu = (zzu) this.zze.get(str);
        zzdrq.zzb().put("request_id", str);
        if (zzu != null) {
            zzdrq.zzb().put("mhit", "true");
            return zzu.zzb;
        }
        zzdrq.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdrq zzdrq) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdrq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdrq zzdrq, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzj(zzdrq, arrayDeque, TypedValues.TransitionType.S_TO);
        zzj(zzdrq, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r3.zzc.size() >= r5) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzg(java.lang.String r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zze     // Catch:{ all -> 0x001f }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001f }
            com.google.android.gms.ads.nonagon.signalgeneration.zzu r3 = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) r3     // Catch:{ all -> 0x001f }
            r0 = 0
            if (r3 == 0) goto L_0x001d
            java.util.Set r1 = r3.zzc     // Catch:{ all -> 0x001f }
            r1.add(r4)     // Catch:{ all -> 0x001f }
            java.util.Set r3 = r3.zzc     // Catch:{ all -> 0x001f }
            int r3 = r3.size()     // Catch:{ all -> 0x001f }
            monitor-exit(r2)
            if (r3 >= r5) goto L_0x001c
            r3 = 1
            return r3
        L_0x001c:
            return r0
        L_0x001d:
            monitor-exit(r2)
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzh(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zze     // Catch:{ all -> 0x0019 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0019 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzu r2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) r2     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0016
            java.util.Set r2 = r2.zzc     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0016
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0016:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzh(java.lang.String, java.lang.String):boolean");
    }
}

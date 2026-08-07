package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzedb {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final String zzc;
    private zzfbr zzd = null;
    private zzfbo zze = null;
    private zzw zzf = null;

    public zzedb(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfbo zzfbo) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            return zzfbo.zzap;
        }
        return zzfbo.zzw;
    }

    private final synchronized void zzk(zzfbo zzfbo, int i) {
        Map map = this.zzb;
        String zzj = zzj(zzfbo);
        if (!map.containsKey(zzj)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfbo.zzv.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfbo.zzv.getString(next));
                } catch (JSONException unused) {
                }
            }
            zzw zzw = new zzw(zzfbo.zzE, 0, (zze) null, bundle, zzfbo.zzF, zzfbo.zzG, zzfbo.zzH, zzfbo.zzI);
            try {
                this.zza.add(i, zzw);
            } catch (IndexOutOfBoundsException e) {
                zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(zzj, zzw);
        }
    }

    private final void zzl(zzfbo zzfbo, long j, zze zze2, boolean z) {
        Map map = this.zzb;
        String zzj = zzj(zzfbo);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfbo;
            }
            zzw zzw = (zzw) this.zzb.get(zzj);
            zzw.zzb = j;
            zzw.zzc = zze2;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzgD)).booleanValue() && z) {
                this.zzf = zzw;
            }
        }
    }

    public final zzw zza() {
        return this.zzf;
    }

    public final zzcvm zzb() {
        return new zzcvm(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbo zzfbo) {
        zzk(zzfbo, this.zza.size());
    }

    public final void zze(zzfbo zzfbo) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfbo)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (zzw) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    zzw zzw = (zzw) this.zza.get(indexOf);
                    zzw.zzb = 0;
                    zzw.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfbo zzfbo, long j, zze zze2) {
        zzl(zzfbo, j, zze2, false);
    }

    public final void zzg(zzfbo zzfbo, long j, zze zze2) {
        zzl(zzfbo, j, (zze) null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((zzw) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfbo) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfbr zzfbr) {
        this.zzd = zzfbr;
    }
}

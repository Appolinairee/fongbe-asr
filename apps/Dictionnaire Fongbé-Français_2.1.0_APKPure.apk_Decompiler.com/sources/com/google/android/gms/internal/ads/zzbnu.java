package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbnu implements zzbmm, zzbnt {
    private final zzbnt zza;
    private final HashSet zzb = new HashSet();

    public zzbnu(zzbnt zzbnt) {
        this.zza = zzbnt;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbml.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjp) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbml.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbml.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbml.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbjp zzbjp) {
        this.zza.zzq(str, zzbjp);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjp));
    }

    public final void zzr(String str, zzbjp zzbjp) {
        this.zza.zzr(str, zzbjp);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjp));
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfkq {
    private final zzflb zza;
    private final zzflb zzb;
    private final boolean zzc;
    private final zzfku zzd;
    private final zzfkx zze;

    private zzfkq(zzfku zzfku, zzfkx zzfkx, zzflb zzflb, zzflb zzflb2, boolean z) {
        this.zzd = zzfku;
        this.zze = zzfkx;
        this.zza = zzflb;
        if (zzflb2 == null) {
            this.zzb = zzflb.NONE;
        } else {
            this.zzb = zzflb2;
        }
        this.zzc = z;
    }

    public static zzfkq zza(zzfku zzfku, zzfkx zzfkx, zzflb zzflb, zzflb zzflb2, boolean z) {
        zzfmk.zzc(zzfku, "CreativeType is null");
        zzfmk.zzc(zzfkx, "ImpressionType is null");
        zzfmk.zzc(zzflb, "Impression owner is null");
        if (zzflb == zzflb.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfku == zzfku.DEFINED_BY_JAVASCRIPT && zzflb == zzflb.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfkx != zzfkx.DEFINED_BY_JAVASCRIPT || zzflb != zzflb.NATIVE) {
            return new zzfkq(zzfku, zzfkx, zzflb, zzflb2, z);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfmg.zze(jSONObject, "impressionOwner", this.zza);
        zzfmg.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfmg.zze(jSONObject, "creativeType", this.zzd);
        zzfmg.zze(jSONObject, "impressionType", this.zze);
        zzfmg.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}

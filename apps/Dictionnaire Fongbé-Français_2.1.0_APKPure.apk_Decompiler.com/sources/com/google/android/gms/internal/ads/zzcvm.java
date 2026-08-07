package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcvm extends zzdx {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzedb zzh;
    private final Bundle zzi;

    public zzcvm(zzfbo zzfbo, String str, zzedb zzedb, zzfbr zzfbr, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (zzfbo == null) {
            str3 = null;
        } else {
            str3 = zzfbo.zzab;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfbr == null) {
            str4 = null;
        } else {
            str4 = zzfbr.zzb;
        }
        this.zzd = str4;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfbo != null) {
            try {
                str5 = zzfbo.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str5 != null ? str5 : str;
        this.zze = zzedb.zzc();
        this.zzh = zzedb;
        this.zzf = zzv.zzC().currentTimeMillis() / 1000;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzgE)).booleanValue() || zzfbr == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfbr.zzk;
        }
        this.zzg = (!((Boolean) zzbe.zzc().zza(zzbcl.zzje)).booleanValue() || zzfbr == null || TextUtils.isEmpty(zzfbr.zzi)) ? "" : zzfbr.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final zzw zzf() {
        zzedb zzedb = this.zzh;
        if (zzedb != null) {
            return zzedb.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

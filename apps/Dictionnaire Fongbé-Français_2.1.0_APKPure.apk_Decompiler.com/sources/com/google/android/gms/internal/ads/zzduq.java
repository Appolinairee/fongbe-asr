package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzduq {
    private final zzdua zza;
    private final zzdpj zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzduq(zzdua zzdua, zzdpj zzdpj) {
        this.zza = zzdua;
        this.zzb = zzdpj;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbln zzbln = (zzbln) it.next();
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzjj)).booleanValue()) {
                        zzdpi zza2 = this.zzb.zza(zzbln.zza);
                        if (zza2 != null) {
                            zzbrs zzbrs = zza2.zzc;
                            if (zzbrs != null) {
                                str = zzbrs.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
                        zzdpi zza3 = this.zzb.zza(zzbln.zza);
                        if (zza3 != null) {
                            if (zza3.zzd) {
                                z = true;
                                List list2 = this.zzd;
                                String str3 = zzbln.zza;
                                String zzb2 = this.zzb.zzb(str3);
                                boolean z2 = zzbln.zzb;
                                list2.add(new zzdup(str3, str2, zzb2, z2 ? 1 : 0, zzbln.zzd, zzbln.zzc, z));
                            }
                        }
                    }
                    z = false;
                    List list22 = this.zzd;
                    String str32 = zzbln.zza;
                    String zzb22 = this.zzb.zzb(str32);
                    boolean z22 = zzbln.zzb;
                    list22.add(new zzdup(str32, str2, zzb22, z22 ? 1 : 0, zzbln.zzd, zzbln.zzc, z));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdup zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzduo(this));
    }
}

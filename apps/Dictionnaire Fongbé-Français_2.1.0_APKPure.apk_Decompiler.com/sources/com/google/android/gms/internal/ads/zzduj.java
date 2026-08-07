package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzduj implements zzcvw, zzcyq, zzcxl {
    private final zzduv zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzdui zze;
    private zzcvm zzf;
    private zze zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    zzduj(zzduv zzduv, zzfcj zzfcj, String str) {
        this.zza = zzduv;
        this.zzc = str;
        this.zzb = zzfcj.zzf;
        this.zzd = 0;
        this.zze = zzdui.AD_REQUESTED;
    }

    private static JSONObject zzh(zze zze2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze2.zzc);
        jSONObject.put("errorCode", zze2.zza);
        jSONObject.put("errorDescription", zze2.zzb);
        zze zze3 = zze2.zzd;
        jSONObject.put("underlyingError", zze3 == null ? null : zzh(zze3));
        return jSONObject;
    }

    private final JSONObject zzi(zzcvm zzcvm) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzcvm.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzcvm.zzc());
        jSONObject2.put("responseId", zzcvm.zzi());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzje)).booleanValue()) {
            String zzd2 = zzcvm.zzd();
            if (!TextUtils.isEmpty(zzd2)) {
                zzo.zze("Bidding data: ".concat(String.valueOf(zzd2)));
                jSONObject2.put("biddingData", new JSONObject(zzd2));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject2.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject2.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject2.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject3 = this.zzk;
        if (jSONObject3 != null) {
            jSONObject2.put("adResponseHeaders", jSONObject3);
        }
        JSONObject jSONObject4 = this.zzl;
        if (jSONObject4 != null) {
            jSONObject2.put("transactionExtras", jSONObject4);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
            jSONObject2.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzw zzw : zzcvm.zzj()) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("adapterClassName", zzw.zza);
            jSONObject5.put("latencyMillis", zzw.zzb);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjf)).booleanValue()) {
                jSONObject5.put("credentials", zzbc.zzb().zzi(zzw.zzd));
            }
            zze zze2 = zzw.zzc;
            if (zze2 == null) {
                jSONObject = null;
            } else {
                jSONObject = zzh(zze2);
            }
            jSONObject5.put("error", jSONObject);
            jSONArray.put(jSONObject5);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(zzcqz zzcqz) {
        if (this.zza.zzq()) {
            this.zzf = zzcqz.zzm();
            this.zze = zzdui.AD_LOADED;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfbo.zza(this.zzd));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcvm zzcvm = this.zzf;
        if (zzcvm != null) {
            jSONObject = zzi(zzcvm);
        } else {
            zze zze2 = this.zzg;
            JSONObject jSONObject3 = null;
            if (!(zze2 == null || (iBinder = zze2.zze) == null)) {
                zzcvm zzcvm2 = (zzcvm) iBinder;
                jSONObject3 = zzi(zzcvm2);
                if (zzcvm2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void zzdl(zzbvk zzbvk) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzdm(zzfca zzfca) {
        if (this.zza.zzq()) {
            int i = 0;
            if (!zzfca.zzb.zza.isEmpty()) {
                this.zzd = ((zzfbo) zzfca.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfca.zzb.zzb.zzl)) {
                this.zzh = zzfca.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfca.zzb.zzb.zzm)) {
                this.zzi = zzfca.zzb.zzb.zzm;
            }
            if (zzfca.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfca.zzb.zzb.zzp;
            }
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
                return;
            }
            if (!this.zza.zzs()) {
                this.zzo = true;
                return;
            }
            if (!TextUtils.isEmpty(zzfca.zzb.zzb.zzn)) {
                this.zzj = zzfca.zzb.zzb.zzn;
            }
            if (zzfca.zzb.zzb.zzo.length() > 0) {
                this.zzk = zzfca.zzb.zzb.zzo;
            }
            zzduv zzduv = this.zza;
            JSONObject jSONObject = this.zzk;
            if (jSONObject != null) {
                i = jSONObject.toString().length();
            }
            if (!TextUtils.isEmpty(this.zzj)) {
                i += this.zzj.length();
            }
            zzduv.zzk((long) i);
        }
    }

    public final void zzdz(zze zze2) {
        if (this.zza.zzq()) {
            this.zze = zzdui.AD_LOAD_FAILED;
            this.zzg = zze2;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdui.AD_REQUESTED;
    }
}

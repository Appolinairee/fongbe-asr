package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgcd;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaq implements zzgcd {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbyy zzb;
    final /* synthetic */ zzbyr zzc;
    final /* synthetic */ zzfgw zzd;
    final /* synthetic */ zzau zze;

    zzaq(zzau zzau, ListenableFuture listenableFuture, zzbyy zzbyy, zzbyr zzbyr, zzfgw zzfgw) {
        this.zza = listenableFuture;
        this.zzb = zzbyy;
        this.zzc = zzbyr;
        this.zzd = zzfgw;
        this.zze = zzau;
    }

    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
            zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhh zzr = zzau.zzr(this.zza, this.zzb);
        if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
            zzfgw zzfgw = this.zzd;
            zzfgw.zzh(th);
            zzfgw.zzg(false);
            zzr.zza(zzfgw);
            zzr.zzh();
        }
        if (this.zzc != null) {
            try {
                if (!"Unknown format is no longer supported.".equals(message)) {
                    message = "Internal error. " + message;
                }
                this.zzc.zzb(message);
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject;
        zzbk zzbk = (zzbk) obj;
        zzfhh zzr = zzau.zzr(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            try {
                zzbyr zzbyr = this.zzc;
                if (zzbyr != null) {
                    zzbyr.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                zzo.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                zzfgw zzfgw = this.zzd;
                zzfgw.zzc("QueryInfo generation has been disabled.");
                zzfgw.zzg(false);
                zzr.zza(zzfgw);
                zzr.zzh();
            }
        } else if (zzbk == null) {
            try {
                zzbyr zzbyr2 = this.zzc;
                if (zzbyr2 != null) {
                    zzbyr2.zzc((String) null, (String) null, (Bundle) null);
                }
                this.zzd.zzg(true);
                if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (RemoteException e2) {
                zzfgw zzfgw2 = this.zzd;
                zzfgw2.zzh(e2);
                zzfgw2.zzg(false);
                zzo.zzh("", e2);
                zzv.zzp().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
                throw th;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(zzbk.zzc)) {
                    jSONObject = new JSONObject(zzbk.zzc);
                } else {
                    jSONObject = new JSONObject(zzbk.zzb);
                }
                if (TextUtils.isEmpty(jSONObject.optString("request_id", ""))) {
                    zzo.zzj("The request ID is empty in request JSON.");
                    zzbyr zzbyr3 = this.zzc;
                    if (zzbyr3 != null) {
                        zzbyr3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfgw zzfgw3 = this.zzd;
                    zzfgw3.zzc("Request ID empty");
                    zzfgw3.zzg(false);
                    if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzh();
                        return;
                    }
                    return;
                }
                Bundle bundle = zzbk.zzf;
                zzau zzau = this.zze;
                if (zzau.zzu && bundle != null && bundle.getInt(zzau.zzw, -1) == -1) {
                    zzau zzau2 = this.zze;
                    bundle.putInt(zzau2.zzw, zzau2.zzx.get());
                }
                zzau zzau3 = this.zze;
                if (zzau3.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzau3.zzv))) {
                    if (TextUtils.isEmpty(this.zze.zzz)) {
                        zzau zzau4 = this.zze;
                        zzs zzq = zzv.zzq();
                        zzau zzau5 = this.zze;
                        zzau4.zzz = zzq.zzc(zzau5.zzg, zzau5.zzy.afmaVersion);
                    }
                    zzau zzau6 = this.zze;
                    bundle.putString(zzau6.zzv, zzau6.zzz);
                }
                if (this.zzc != null) {
                    if (!TextUtils.isEmpty(zzbk.zzc)) {
                        this.zzc.zzc(zzbk.zza, zzbk.zzc, bundle);
                    } else {
                        this.zzc.zzc(zzbk.zza, zzbk.zzb, bundle);
                    }
                }
                this.zzd.zzg(true);
                if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (JSONException e3) {
                zzo.zzj("Failed to create JSON object from the request string.");
                zzbyr zzbyr4 = this.zzc;
                if (zzbyr4 != null) {
                    String obj2 = e3.toString();
                    zzbyr4.zzb("Internal error for request JSON: " + obj2);
                }
                zzfgw zzfgw4 = this.zzd;
                zzfgw4.zzh(e3);
                zzfgw4.zzg(false);
                zzv.zzp().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbee.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            }
        }
    }
}

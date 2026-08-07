package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdu extends BroadcastReceiver {
    final /* synthetic */ zzdw zza;

    /* synthetic */ zzdu(zzdw zzdw, zzdv zzdv) {
        this.zza = zzdw;
    }

    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (!(type == 4 || type == 5)) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            break;
                        case 18:
                            break;
                        case 20:
                            if (zzei.zza >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                        default:
                            i = 6;
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzei.zza < 31 || i != 5) {
            zzdw.zzc(this.zza, i);
            return;
        }
        zzdw zzdw = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                TelephonyManager telephonyManager2 = telephonyManager;
                zzdt zzdt = new zzdt(zzdw);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), zzdt);
                telephonyManager.unregisterTelephonyCallback(zzdt);
                return;
            }
            throw null;
        } catch (RuntimeException unused2) {
            zzdw.zzc(zzdw, 5);
        }
    }
}

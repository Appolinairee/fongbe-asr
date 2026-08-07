package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeug implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeug(zzgcs zzgcs, Context context) {
        this.zza = zzgcs;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeuf(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeue zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzv.zzq();
        int i3 = -1;
        if (zzs.zzB(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new zzeue(networkOperator, i2, zzv.zzr().zzm(this.zzb), phoneType, z, i);
    }
}

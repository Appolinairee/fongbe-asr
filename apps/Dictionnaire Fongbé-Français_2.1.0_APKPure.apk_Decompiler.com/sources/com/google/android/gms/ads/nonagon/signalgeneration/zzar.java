package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgcd;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzar implements zzgcd {
    final /* synthetic */ zzbtt zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    zzar(zzau zzau, zzbtt zzbtt, boolean z) {
        this.zza = zzbtt;
        this.zzb = z;
        this.zzc = zzau;
    }

    public final void zza(Throwable th) {
        try {
            zzbtt zzbtt = this.zza;
            String message = th.getMessage();
            zzbtt.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzr || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        zzau zzau = this.zzc;
                        this.zzc.zzq.zzd(zzau.zzZ(uri, zzau.zzA, "1").toString(), (zzv) null, (zzfhh) null);
                    } else {
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhm)).booleanValue()) {
                            this.zzc.zzq.zzd(uri.toString(), (zzv) null, (zzfhh) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}

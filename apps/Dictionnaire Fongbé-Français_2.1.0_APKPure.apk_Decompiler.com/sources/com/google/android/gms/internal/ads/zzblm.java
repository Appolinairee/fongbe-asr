package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzblm implements zzapf {
    /* access modifiers changed from: private */
    public volatile zzbkz zza;
    private final Context zzb;

    public zzblm(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzblm zzblm) {
        if (zzblm.zza != null) {
            zzblm.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzapi zza(zzapm zzapm) throws zzapv {
        Parcelable.Creator<zzbla> creator = zzbla.CREATOR;
        Map zzl = zzapm.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbla zzbla = new zzbla(zzapm.zzk(), strArr, strArr2);
        long elapsedRealtime = zzv.zzC().elapsedRealtime();
        try {
            zzcab zzcab = new zzcab();
            this.zza = new zzbkz(this.zzb, zzv.zzu().zzb(), new zzblk(this, zzcab), new zzbll(this, zzcab));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture zzo = zzgch.zzo(zzgch.zzn(zzcab, new zzbli(this, zzbla), zzbzw.zza), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzey)).intValue(), TimeUnit.MILLISECONDS, zzbzw.zzd);
            zzo.addListener(new zzblj(this), zzbzw.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = zzv.zzC().elapsedRealtime() - elapsedRealtime;
            zze.zza("Http assets remote cache took " + elapsedRealtime2 + "ms");
            zzblc zzblc = (zzblc) new zzbvi(parcelFileDescriptor).zza(zzblc.CREATOR);
            if (zzblc == null) {
                return null;
            }
            if (!zzblc.zza) {
                if (zzblc.zze.length != zzblc.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzblc.zze;
                    if (i >= strArr3.length) {
                        return new zzapi(zzblc.zzc, zzblc.zzd, (Map) hashMap, zzblc.zzg, zzblc.zzh);
                    }
                    hashMap.put(strArr3[i], zzblc.zzf[i]);
                    i++;
                }
            } else {
                throw new zzapv(zzblc.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            zze.zza("Http assets remote cache took " + (zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}

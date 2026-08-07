package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfob {
    private final Context zza;
    private final Executor zzb;
    private final zzfni zzc;
    private final zzfnk zzd;
    private final zzfoa zze;
    private final zzfoa zzf;
    private Task zzg;
    private Task zzh;

    zzfob(Context context, Executor executor, zzfni zzfni, zzfnk zzfnk, zzfny zzfny, zzfnz zzfnz) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfni;
        this.zzd = zzfnk;
        this.zze = zzfny;
        this.zzf = zzfnz;
    }

    public static zzfob zze(Context context, Executor executor, zzfni zzfni, zzfnk zzfnk) {
        zzfob zzfob = new zzfob(context, executor, zzfni, zzfnk, new zzfny(), new zzfnz());
        if (zzfob.zzd.zzh()) {
            zzfob.zzg = zzfob.zzh(new zzfnv(zzfob));
        } else {
            zzfob.zzg = Tasks.forResult(zzfob.zze.zza());
        }
        zzfob.zzh = zzfob.zzh(new zzfnw(zzfob));
        return zzfob;
    }

    private static zzasy zzg(Task task, zzasy zzasy) {
        if (!task.isSuccessful()) {
            return zzasy;
        }
        return (zzasy) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzfnx(this));
    }

    public final zzasy zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzasy zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzasy zzc() throws Exception {
        zzasc zza2 = zzasy.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza2.zzs(id);
            zza2.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzab(6);
        }
        return (zzasy) zza2.zzbr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzasy zzd() throws Exception {
        Context context = this.zza;
        return zzfnq.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawv extends zzaxr {
    public zzawv(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzasc, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zza.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String id = info.getId();
                int i = zzawg.zza;
                if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(id);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    id = zzatr.zza(bArr, true);
                }
                if (id != null) {
                    synchronized (this.zzd) {
                        this.zzd.zzs(id);
                        this.zzd.zzr(info.isLimitAdTrackingEnabled());
                        this.zzd.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zza.zzq()) {
            synchronized (this.zzd) {
                this.zzd.zzs((String) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()}));
            }
            return;
        }
        zzc();
    }

    public final Void zzk() throws Exception {
        if (this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgf implements zzfy {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfy zzc;
    private zzfy zzd;
    private zzfy zze;
    private zzfy zzf;
    private zzfy zzg;
    private zzfy zzh;
    private zzfy zzi;
    private zzfy zzj;
    private zzfy zzk;

    public zzgf(Context context, zzfy zzfy) {
        this.zza = context.getApplicationContext();
        zzfy zzfy2 = zzfy;
        this.zzc = zzfy;
    }

    private final zzfy zzg() {
        if (this.zze == null) {
            zzfq zzfq = new zzfq(this.zza);
            this.zze = zzfq;
            zzh(zzfq);
        }
        return this.zze;
    }

    private final void zzh(zzfy zzfy) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfy.zzf((zzgy) this.zzb.get(i));
        }
    }

    private static final void zzi(zzfy zzfy, zzgy zzgy) {
        if (zzfy != null) {
            zzfy.zzf(zzgy);
        }
    }

    public final long zzb(zzgd zzgd) throws IOException {
        zzfy zzfy;
        zzcw.zzf(this.zzk == null);
        String scheme = zzgd.zza.getScheme();
        Uri uri = zzgd.zza;
        int i = zzei.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgd.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgn zzgn = new zzgn();
                    this.zzd = zzgn;
                    zzh(zzgn);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzfv zzfv = new zzfv(this.zza);
                this.zzf = zzfv;
                zzh(zzfv);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzfy zzfy2 = (zzfy) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                    this.zzg = zzfy2;
                    zzh(zzfy2);
                } catch (ClassNotFoundException unused) {
                    zzdo.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzha zzha = new zzha(2000);
                this.zzh = zzha;
                zzh(zzha);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzfw zzfw = new zzfw();
                this.zzi = zzfw;
                zzh(zzfw);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgw zzgw = new zzgw(this.zza);
                    this.zzj = zzgw;
                    zzh(zzgw);
                }
                zzfy = this.zzj;
            } else {
                zzfy = this.zzc;
            }
            this.zzk = zzfy;
        }
        return this.zzk.zzb(zzgd);
    }

    public final Uri zzc() {
        zzfy zzfy = this.zzk;
        if (zzfy == null) {
            return null;
        }
        return zzfy.zzc();
    }

    public final void zzd() throws IOException {
        zzfy zzfy = this.zzk;
        if (zzfy != null) {
            try {
                zzfy.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzfy zzfy = this.zzk;
        return zzfy == null ? Collections.emptyMap() : zzfy.zze();
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzfy zzfy = this.zzk;
        zzfy.getClass();
        zzfy zzfy2 = zzfy;
        return zzfy.zza(bArr, i, i2);
    }

    public final void zzf(zzgy zzgy) {
        zzgy.getClass();
        this.zzc.zzf(zzgy);
        this.zzb.add(zzgy);
        zzi(this.zzd, zzgy);
        zzi(this.zze, zzgy);
        zzi(this.zzf, zzgy);
        zzi(this.zzg, zzgy);
        zzi(this.zzh, zzgy);
        zzi(this.zzi, zzgy);
        zzi(this.zzj, zzgy);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcck extends zzcay implements TextureView.SurfaceTextureListener, zzcbi {
    private final zzcbs zzc;
    private final zzcbt zzd;
    private final zzcbr zze;
    private zzcax zzf;
    private Surface zzg;
    private zzcbj zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl = 1;
    private zzcbq zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcck(Context context, zzcbt zzcbt, zzcbs zzcbs, boolean z, boolean z2, zzcbr zzcbr) {
        super(context);
        this.zzc = zzcbs;
        this.zzd = zzcbt;
        this.zzn = z;
        this.zze = zzcbr;
        setSurfaceTextureListener(this);
        zzcbt.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzo) {
            this.zzo = true;
            zzs.zza.post(new zzccj(this));
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z, Integer num) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null && !z) {
            zzcbj.zzP(num);
        } else if (this.zzi != null && this.zzg != null) {
            if (z) {
                if (zzad()) {
                    zzcbj.zzU();
                    zzY();
                } else {
                    zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcde zzp2 = this.zzc.zzp(this.zzi);
                if (zzp2 instanceof zzcdn) {
                    zzcbj zza = ((zzcdn) zzp2).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        zzo.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp2 instanceof zzcdk) {
                    zzcdk zzcdk = (zzcdk) zzp2;
                    String zzF = zzF();
                    ByteBuffer zzl2 = zzcdk.zzl();
                    boolean zzm2 = zzcdk.zzm();
                    String zzk2 = zzcdk.zzk();
                    if (zzk2 == null) {
                        zzo.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcbj zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzk2)}, zzF, zzl2, zzm2);
                } else {
                    zzo.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ((Surface) null, true);
            zzcbj zzcbj = this.zzh;
            if (zzcbj != null) {
                zzcbj.zzL((zzcbi) null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            try {
                zzcbj.zzS(surface, z);
            } catch (IOException e) {
                zzo.zzk("", e);
            }
        } else {
            zzo.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbj zzcbj = this.zzh;
        return zzcbj != null && zzcbj.zzV() && !this.zzk;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / ((float) measuredHeight);
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (((float) measuredHeight) * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbq zzcbq = this.zzm;
        if (zzcbq != null) {
            zzcbq.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzcbq zzcbq = new zzcbq(getContext());
            this.zzm = zzcbq;
            zzcbq.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, (Integer) null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        zzs.zza.post(new zzccg(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbq zzcbq = this.zzm;
        if (zzcbq != null) {
            zzcbq.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ((Surface) null, true);
        }
        zzs.zza.post(new zzccc(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcbq zzcbq = this.zzm;
        if (zzcbq != null) {
            zzcbq.zzc(i, i2);
        }
        zzs.zza.post(new zzccb(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new zzcca(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzA(int i) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzN(i);
        }
    }

    public final void zzB(int i) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzR(i);
        }
    }

    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    /* access modifiers changed from: package-private */
    public final zzcbj zzE(Integer num) {
        zzcbr zzcbr = this.zze;
        zzcbs zzcbs = this.zzc;
        zzcef zzcef = new zzcef(zzcbs.getContext(), zzcbr, zzcbs, num);
        zzo.zzi("ExoPlayerAdapter initialized.");
        return zzcef;
    }

    /* access modifiers changed from: package-private */
    public final String zzF() {
        zzcbs zzcbs = this.zzc;
        return zzv.zzq().zzc(zzcbs.getContext(), zzcbs.zzn().afmaVersion);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str) {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(String str) {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(int i, int i2) {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzj(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            try {
                zzcbj.zzT(zza, false);
            } catch (IOException e) {
                zzo.zzk("", e);
            }
        } else {
            zzo.zzj("Trying to set volume before player is initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(int i) {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS() {
        zzcax zzcax = this.zzf;
        if (zzcax != null) {
            zzcax.zze();
        }
    }

    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            return zzcbj.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzr;
    }

    public final int zze() {
        return this.zzq;
    }

    public final long zzf() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            return zzcbj.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            return zzcbj.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            return zzcbj.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z, long j) {
        if (this.zzc != null) {
            zzbzw.zzf.execute(new zzccd(this, z, j));
        }
    }

    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzT = zzT(str, exc);
        zzo.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        zzs.zza.post(new zzcch(this, zzT));
        zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzT = zzT("onLoadException", exc);
        zzo.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new zzcce(this, zzT));
    }

    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
            } else if (i == 4) {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                zzs.zza.post(new zzcci(this));
            }
        }
    }

    public final void zzn() {
        zzs.zza.post(new zzcbz(this));
    }

    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzs.zza.post(new zzccf(this));
        }
    }

    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzs.zza.post(new zzcby(this));
            return;
        }
        this.zzp = true;
    }

    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI((long) i);
        }
    }

    public final void zzr(zzcax zzcax) {
        this.zzf = zzcax;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzC(str, (String[]) null, (Integer) null);
        }
    }

    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    public final void zzu(float f, float f2) {
        zzcbq zzcbq = this.zzm;
        if (zzcbq != null) {
            zzcbq.zzf(f, f2);
        }
    }

    public final void zzv() {
        zzs.zza.post(new zzcbx(this));
    }

    public final Integer zzw() {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            return zzcbj.zzC();
        }
        return null;
    }

    public final void zzx(int i) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzJ(i);
        }
    }

    public final void zzy(int i) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzK(i);
        }
    }

    public final void zzz(int i) {
        zzcbj zzcbj = this.zzh;
        if (zzcbj != null) {
            zzcbj.zzM(i);
        }
    }

    public final void zzC(String str, String[] strArr, Integer num) {
        if (str != null) {
            if (strArr == null) {
                this.zzj = new String[]{str};
            } else {
                this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzi;
            boolean z = false;
            if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4) {
                z = true;
            }
            this.zzi = str;
            zzW(z, num);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzjl implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabc, zzpf, zzwm, zzte, zzhp, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjp zza;

    /* synthetic */ zzjl(zzjp zzjp, zzjo zzjo) {
        this.zza = zzjp;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjp.zzK(this.zza, surfaceTexture);
        this.zza.zzZ(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzac((Object) null);
        this.zza.zzZ(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzZ(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzZ(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzZ(0, 0);
    }

    public final void zza(Exception exc) {
        this.zza.zzq.zzv(exc);
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.zzq.zzw(str, j, j2);
    }

    public final void zzc(String str) {
        this.zza.zzq.zzx(str);
    }

    public final void zzd(zzhs zzhs) {
        this.zza.zzq.zzy(zzhs);
    }

    public final void zze(zzhs zzhs) {
        this.zza.zzq.zzz(zzhs);
    }

    public final void zzf(zzab zzab, zzht zzht) {
        this.zza.zzq.zzA(zzab, zzht);
    }

    public final void zzg(long j) {
        this.zza.zzq.zzB(j);
    }

    public final void zzh(Exception exc) {
        this.zza.zzq.zzC(exc);
    }

    public final void zzi(zzpg zzpg) {
        this.zza.zzq.zzD(zzpg);
    }

    public final void zzj(zzpg zzpg) {
        this.zza.zzq.zzE(zzpg);
    }

    public final void zzk(int i, long j, long j2) {
        this.zza.zzq.zzF(i, j, j2);
    }

    public final void zzl(int i, long j) {
        this.zza.zzq.zzG(i, j);
    }

    public final void zzm(Object obj, long j) {
        this.zza.zzq.zzH(obj, j);
        zzjp zzjp = this.zza;
        if (zzjp.zzF == obj) {
            zzdn zzD = zzjp.zzl;
            zzD.zzd(26, new zzjk());
            zzD.zzc();
        }
    }

    public final void zzn(boolean z) {
        zzjp zzjp = this.zza;
        if (zzjp.zzM != z) {
            zzjp.zzM = z;
            zzdn zzD = this.zza.zzl;
            zzD.zzd(23, new zzji(z));
            zzD.zzc();
        }
    }

    public final void zzo(Exception exc) {
        this.zza.zzq.zzJ(exc);
    }

    public final void zzp(String str, long j, long j2) {
        this.zza.zzq.zzK(str, j, j2);
    }

    public final void zzq(String str) {
        this.zza.zzq.zzL(str);
    }

    public final void zzr(zzhs zzhs) {
        this.zza.zzq.zzM(zzhs);
    }

    public final void zzs(zzhs zzhs) {
        this.zza.zzq.zzN(zzhs);
    }

    public final void zzt(long j, int i) {
        this.zza.zzq.zzO(j, i);
    }

    public final void zzu(zzab zzab, zzht zzht) {
        this.zza.zzq.zzP(zzab, zzht);
    }

    public final void zzv(zzcd zzcd) {
        zzdn zzD = this.zza.zzl;
        zzD.zzd(25, new zzjj(zzcd));
        zzD.zzc();
    }
}

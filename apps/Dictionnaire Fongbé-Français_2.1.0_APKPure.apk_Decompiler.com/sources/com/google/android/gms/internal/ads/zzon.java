package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzon {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Handler zzb;
    private final zzoj zzc;
    private final BroadcastReceiver zzd;
    private final zzok zze;
    private zzoi zzf;
    /* access modifiers changed from: private */
    public zzoo zzg;
    /* access modifiers changed from: private */
    public zze zzh;
    private boolean zzi;
    private final zzpw zzj;

    zzon(Context context, zzpw zzpw, zze zze2, zzoo zzoo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        zzpw zzpw2 = zzpw;
        this.zzj = zzpw;
        this.zzh = zze2;
        this.zzg = zzoo;
        zzok zzok = null;
        Handler handler = new Handler(zzei.zzz(), (Handler.Callback) null);
        this.zzb = handler;
        this.zzc = zzei.zza >= 23 ? new zzoj(this, (zzom) null) : null;
        this.zzd = new zzol(this, (zzom) null);
        Uri zza2 = zzoi.zza();
        this.zze = zza2 != null ? new zzok(this, handler, applicationContext.getContentResolver(), zza2) : zzok;
    }

    /* access modifiers changed from: private */
    public final void zzj(zzoi zzoi) {
        if (this.zzi && !zzoi.equals(this.zzf)) {
            this.zzf = zzoi;
            this.zzj.zza.zzJ(zzoi);
        }
    }

    public final void zzg(zze zze2) {
        this.zzh = zze2;
        zzj(zzoi.zzc(this.zza, zze2, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzoo zzoo = this.zzg;
        zzoo zzoo2 = null;
        if (zzoo == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzoo.zza;
        }
        if (!Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            if (audioDeviceInfo != null) {
                zzoo2 = new zzoo(audioDeviceInfo);
            }
            this.zzg = zzoo2;
            zzj(zzoi.zzc(this.zza, this.zzh, zzoo2));
        }
    }

    public final void zzi() {
        zzoj zzoj;
        if (this.zzi) {
            this.zzf = null;
            if (zzei.zza >= 23 && (zzoj = this.zzc) != null) {
                AudioManager audioManager = (AudioManager) this.zza.getSystemService("audio");
                audioManager.getClass();
                AudioManager audioManager2 = audioManager;
                audioManager.unregisterAudioDeviceCallback(zzoj);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzok zzok = this.zze;
            if (zzok != null) {
                zzok.zzb();
            }
            this.zzi = false;
        }
    }

    public final zzoi zzc() {
        zzoj zzoj;
        if (this.zzi) {
            zzoi zzoi = this.zzf;
            zzoi.getClass();
            zzoi zzoi2 = zzoi;
            return zzoi;
        }
        this.zzi = true;
        zzok zzok = this.zze;
        if (zzok != null) {
            zzok.zza();
        }
        if (zzei.zza >= 23 && (zzoj = this.zzc) != null) {
            Context context = this.zza;
            Handler handler = this.zzb;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            AudioManager audioManager2 = audioManager;
            audioManager.registerAudioDeviceCallback(zzoj, handler);
        }
        zzoi zzd2 = zzoi.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd2;
        return zzd2;
    }
}

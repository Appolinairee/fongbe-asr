package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcbg extends FrameLayout implements zzcax {
    final zzcbu zza;
    private final zzcbs zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbda zze;
    private final long zzf;
    private final zzcay zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcbg(Context context, zzcbs zzcbs, int i, boolean z, zzbda zzbda, zzcbr zzcbr) {
        super(context);
        zzcay zzcay;
        String str;
        Context context2 = context;
        int i2 = i;
        zzbda zzbda2 = zzbda;
        this.zzb = zzcbs;
        this.zze = zzbda2;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbs.zzj());
        zzcaz zzcaz = zzcbs.zzj().zza;
        zzcbt zzcbt = new zzcbt(context, zzcbs.zzn(), zzcbs.zzs(), zzbda, zzcbs.zzk());
        if (i2 == 3) {
            zzcay = new zzcem(context2, zzcbt);
        } else if (i2 == 2) {
            zzcay = new zzcck(context, zzcbt, zzcbs, z, zzcbk.zza(zzcbs), zzcbr);
        } else {
            Context context3 = context;
            zzcay = new zzcaw(context3, zzcbs, z, zzcbk.zza(zzcbs), zzcbr, new zzcbt(context3, zzcbs.zzn(), zzcbs.zzs(), zzbda, zzcbs.zzk()));
        }
        this.zzg = zzcay;
        View view = new View(context2);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcay, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzP)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context2);
        this.zzf = ((Long) zzbe.zzc().zza(zzbcl.zzU)).longValue();
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzR)).booleanValue();
        this.zzk = booleanValue;
        if (zzbda2 != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbda2.zzd("spinner_used", str);
        }
        this.zza = new zzcbu(this);
        zzcay.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl2 = zzl();
        if (zzl2 != null) {
            hashMap.put("playerId", zzl2.toString());
        }
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcay zzcay = this.zzg;
            if (zzcay != null) {
                zzgcs zzgcs = zzbzw.zzf;
                Objects.requireNonNull(zzcay);
                zzgcs.execute(new zzcba(zzcay));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzs.zza.post(new zzcbc(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzs.zza.post(new zzcbf(this, z));
    }

    public final void zzA(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzz(i);
        }
    }

    public final void zzB(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzA(i);
        }
    }

    public final void zzC(int i) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzB(i);
        }
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzb.zze(f);
            zzcay.zzn();
        }
    }

    public final void zzH(float f, float f2) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzb.zzd(false);
            zzcay.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcay zzcay = this.zzg;
        if (zzcay != null && this.zzm == 0) {
            zzcay zzcay2 = this.zzg;
            zzK("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(((float) zzcay.zzc()) / 1000.0f), "videoWidth", String.valueOf(zzcay2.zze()), "videoHeight", String.valueOf(zzcay2.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzs.zza.post(new zzcbb(this));
    }

    public final void zzh() {
        this.zza.zzb();
        zzs.zza.post(new zzcbd(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzs.zza.post(new zzcbe(this));
    }

    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) zzbe.zzc().zza(zzbcl.zzT)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzbe.zzc().zza(zzbcl.zzT)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = zzv.zzC().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = zzv.zzC().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbda zzbda = this.zze;
                if (zzbda != null) {
                    zzbda.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            return zzcay.zzw();
        }
        return null;
    }

    public final void zzn() {
        String str;
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            TextView textView = new TextView(zzcay.getContext());
            Resources zze2 = zzv.zzp().zze();
            if (zze2 == null) {
                str = "AdMob - ";
            } else {
                str = zze2.getString(R.string.watermark_label_prefix);
            }
            textView.setText(String.valueOf(str).concat(this.zzg.zzj()));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzc.bringChildToFront(textView);
        }
    }

    public final void zzo() {
        this.zza.zza();
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzt();
        }
        zzJ();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                this.zzg.zzC(this.zzn, this.zzo, num);
            } else {
                zzK("no_src", new String[0]);
            }
        }
    }

    public final void zzs() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzb.zzd(true);
            zzcay.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            long zza2 = (long) zzcay.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f = ((float) zza2) / 1000.0f;
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzv.zzC().currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzu() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzo();
        }
    }

    public final void zzv() {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzp();
        }
    }

    public final void zzw(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzq(i);
        }
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzy(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzx(i);
        }
    }

    public final void zzz(int i) {
        zzcay zzcay = this.zzg;
        if (zzcay != null) {
            zzcay.zzy(i);
        }
    }
}

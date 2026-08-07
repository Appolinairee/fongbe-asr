package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdkb {
    private final zzdow zza;
    private final zzdnl zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkb(zzdow zzdow, zzdnl zzdnl) {
        this.zza = zzdow;
        this.zzb = zzdnl;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzbc.zzb();
        return zzf.zzx(context, i);
    }

    public final View zza(View view, WindowManager windowManager) throws zzcfj {
        zzcex zza2 = this.zza.zza(zzs.zzc(), (zzfbo) null, (zzfbr) null);
        zza2.zzF().setVisibility(4);
        zza2.zzF().setContentDescription("policy_validator");
        zza2.zzag("/sendMessageToSdk", new zzdjv(this));
        zza2.zzag("/hideValidatorOverlay", new zzdjw(this, windowManager, view));
        zza2.zzag("/open", new zzbkb((zzb) null, (zzbsc) null, (zzebk) null, (zzdrw) null, (zzcmk) null));
        this.zzb.zzm(new WeakReference(zza2), "/loadNativeAdPolicyViolations", new zzdjx(this, view, windowManager));
        this.zzb.zzm(new WeakReference(zza2), "/showValidatorOverlay", new zzdjy());
        return zza2.zzF();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcex zzcex, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcex zzcex, Map map) {
        zzo.zze("Hide native ad policy validator overlay.");
        zzcex.zzF().setVisibility(8);
        if (zzcex.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcex.zzF());
        }
        zzcex.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(View view, WindowManager windowManager, zzcex zzcex, Map map) {
        int i;
        zzcex.zzN().zzC(new zzdjz(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzbe.zzc().zza(zzbcl.zzhV)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzbe.zzc().zza(zzbcl.zzhW)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcex.zzaj(zzcgr.zzb(zzf, zzf2));
            try {
                zzcex.zzG().getSettings().setUseWideViewPort(((Boolean) zzbe.zzc().zza(zzbcl.zzhX)).booleanValue());
                zzcex.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzbe.zzc().zza(zzbcl.zzhY)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb2 = zzbv.zzb();
            zzb2.x = zzf3;
            zzb2.y = zzf4;
            windowManager.updateViewLayout(zzcex.zzF(), zzb2);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.zzc = new zzdka(view, zzcex, str, zzb2, i - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcex.loadUrl(str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }
}

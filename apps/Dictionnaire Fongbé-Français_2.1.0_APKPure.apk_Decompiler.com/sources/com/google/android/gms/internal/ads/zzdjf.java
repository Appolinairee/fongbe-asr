package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdjf {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final zzg zzb;
    private final zzfcj zzc;
    private final zzdik zzd;
    private final zzdif zze;
    private final zzdjt zzf;
    private final zzdkb zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdic zzk;

    public zzdjf(zzg zzg2, zzfcj zzfcj, zzdik zzdik, zzdif zzdif, zzdjt zzdjt, zzdkb zzdkb, Executor executor, Executor executor2, zzdic zzdic) {
        this.zzb = zzg2;
        this.zzc = zzfcj;
        this.zzj = zzfcj.zzi;
        this.zzd = zzdik;
        this.zze = zzdif;
        this.zzf = zzdjt;
        this.zzg = zzdkb;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdic;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzf2 = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf2.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf2.getParent()).removeView(zzf2);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdV)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzf2, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdif zzdif = this.zze;
        if (zzdif.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdif.zzc() == 2 || zzdif.zzc() == 1) {
                this.zzb.zzF(this.zzc.zzf, String.valueOf(zzdif.zzc()), z);
            } else if (zzdif.zzc() == 6) {
                this.zzb.zzF(this.zzc.zzf, "2", z);
                this.zzb.zzF(this.zzc.zzf, "1", z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdkd zzdkd) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbft zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View zzg2 = zzdkd.zzg(strArr[i]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context2 = zzdkd.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdif zzdif = this.zze;
        if (zzdif.zze() != null) {
            zzbfl zzbfl = this.zzj;
            view = zzdif.zze();
            if (zzbfl != null && viewGroup == null) {
                zzh(layoutParams, zzbfl.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdif.zzl() instanceof zzbfg)) {
            view = null;
        } else {
            zzbfg zzbfg = (zzbfg) zzdif.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfg.zzc());
                viewGroup = null;
            }
            zzbfh zzbfh = new zzbfh(context2, zzbfg, layoutParams);
            zzbfh.setContentDescription((CharSequence) zzbe.zzc().zza(zzbcl.zzdT));
            view = zzbfh;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza3 = new zza(zzdkd.zzf().getContext());
                zza3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza3.addView(view);
                FrameLayout zzh2 = zzdkd.zzh();
                if (zzh2 != null) {
                    zzh2.addView(zza3);
                }
            }
            zzdkd.zzq(zzdkd.zzk(), view, true);
        }
        zzfxn zzfxn = zzdjb.zza;
        int size = zzfxn.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdkd.zzg((String) zzfxn.get(i2));
            i2++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzi.execute(new zzdjc(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdif zzdif2 = this.zze;
                if (zzdif2.zzs() != null) {
                    zzdif2.zzs().zzar(new zzdje(zzdkd, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjS)).booleanValue() || !zzi(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdkd.zzf();
                if (zzf2 != null) {
                    context = zzf2.getContext();
                }
                if (context != null && (zza2 = this.zzk.zza()) != null) {
                    try {
                        IObjectWrapper zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi2)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            IObjectWrapper zzj2 = zzdkd.zzj();
                            if (zzj2 != null) {
                                if (((Boolean) zzbe.zzc().zza(zzbcl.zzga)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj2));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(zza);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzo.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdif zzdif3 = this.zze;
                if (zzdif3.zzq() != null) {
                    zzdif3.zzq().zzar(new zzdje(zzdkd, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdkd zzdkd) {
        if (zzdkd != null && this.zzf != null && zzdkd.zzh() != null && this.zzd.zzg()) {
            try {
                zzdkd.zzh().addView(this.zzf.zza());
            } catch (zzcfj e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zzd(zzdkd zzdkd) {
        if (zzdkd != null) {
            Context context = zzdkd.zzf().getContext();
            if (!zzbv.zzh(context, this.zzd.zza)) {
                return;
            }
            if (!(context instanceof Activity)) {
                zzo.zze("Activity context is needed for policy validator.");
            } else if (this.zzg != null && zzdkd.zzh() != null) {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdkd.zzh(), windowManager), zzbv.zzb());
                } catch (zzcfj e) {
                    zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void zze(zzdkd zzdkd) {
        this.zzh.execute(new zzdjd(this, zzdkd));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfmu implements zzflv {
    private static final zzfmu zza = new zzfmu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfmq();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfmr();
    private final List zzf = new ArrayList();
    private int zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzflx zzj = new zzflx();
    private final zzfmn zzk = new zzfmn();
    /* access modifiers changed from: private */
    public final zzfmo zzl = new zzfmo(new zzfmx());
    private long zzm;

    zzfmu() {
    }

    public static zzfmu zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfmu zzfmu) {
        zzfmu.zzg = 0;
        zzfmu.zzi.clear();
        zzfmu.zzh = false;
        for (zzfkt zzfkt : zzflk.zza().zzb()) {
        }
        zzfmu.zzm = System.nanoTime();
        zzfmu.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzflw zza2 = zzfmu.zzj.zza();
        if (zzfmu.zzk.zze().size() > 0) {
            Iterator it = zzfmu.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza((View) null);
                View zza4 = zzfmu.zzk.zza(str);
                zzflw zzb2 = zzfmu.zzj.zzb();
                String zzc2 = zzfmu.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfmg.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfmh.zza("Error with setting not visible reason", e);
                    }
                    zzfmg.zzc(zza3, zza5);
                }
                zzfmg.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmu.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfmu.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza((View) null);
            zzfmu.zzk((View) null, zza2, zza6, 1, false);
            zzfmg.zzf(zza6);
            zzfmu.zzl.zzd(zza6, zzfmu.zzk.zzf(), nanoTime);
            boolean z = zzfmu.zzh;
        } else {
            zzfmu.zzl.zzb();
        }
        zzfmu.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfmu.zzm;
        if (zzfmu.zzf.size() > 0) {
            for (zzfmt zzfmt : zzfmu.zzf) {
                int i = zzfmu.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmt.zzb();
                if (zzfmt instanceof zzfms) {
                    int i2 = zzfmu.zzg;
                    ((zzfms) zzfmt).zza();
                }
            }
        }
        zzflu.zza().zzc();
    }

    private final void zzk(View view, zzflw zzflw, JSONObject jSONObject, int i, boolean z) {
        zzflw.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzflw zzflw, JSONObject jSONObject, boolean z) {
        int zzl2;
        boolean z2;
        if (zzfml.zza(view) == null && (zzl2 = this.zzk.zzl(view)) != 3) {
            JSONObject zza2 = zzflw.zza(view);
            zzfmg.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfmg.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
                } catch (JSONException e) {
                    zzfmh.zza("Error with setting has window focus", e);
                }
                boolean zzj2 = this.zzk.zzj(zzd2);
                Boolean valueOf = Boolean.valueOf(zzj2);
                valueOf.getClass();
                if (zzj2) {
                    try {
                        zza2.put("isPipActive", valueOf);
                    } catch (JSONException e2) {
                        zzfmh.zza("Error with setting is picture-in-picture active", e2);
                    }
                }
                this.zzk.zzh();
            } else {
                zzfmm zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfln zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i = 0; i < size; i++) {
                        jSONArray.put((String) zzb3.get(i));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e3) {
                        zzfmh.zza("Error with setting friendly obstruction", e3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzk(view, zzflw, zza2, zzl2, z || z2);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfmp(this));
    }
}

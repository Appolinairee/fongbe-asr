package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdki implements zzdin {
    private final zzbpt zza;
    private final zzcwl zzb;
    private final zzcvr zzc;
    private final zzddq zzd;
    private final Context zze;
    private final zzfbo zzf;
    private final VersionInfoParcel zzg;
    private final zzfcj zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbpp zzl;
    private final zzbpq zzm;

    public zzdki(zzbpp zzbpp, zzbpq zzbpq, zzbpt zzbpt, zzcwl zzcwl, zzcvr zzcvr, zzddq zzddq, Context context, zzfbo zzfbo, VersionInfoParcel versionInfoParcel, zzfcj zzfcj) {
        this.zzl = zzbpp;
        this.zzm = zzbpq;
        this.zza = zzbpt;
        this.zzb = zzcwl;
        this.zzc = zzcvr;
        this.zzd = zzddq;
        this.zze = context;
        this.zzf = zzfbo;
        this.zzg = versionInfoParcel;
        this.zzh = zzfcj;
    }

    private final void zzb(View view) {
        try {
            zzbpt zzbpt = this.zza;
            if (zzbpt == null || zzbpt.zzA()) {
                zzbpp zzbpp = this.zzl;
                if (zzbpp == null || zzbpp.zzx()) {
                    zzbpq zzbpq = this.zzm;
                    if (zzbpq != null && !zzbpq.zzv()) {
                        this.zzm.zzq(ObjectWrapper.wrap(view));
                        this.zzc.onAdClicked();
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                            this.zzd.zzdd();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            this.zza.zzw(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                this.zzd.zzdd();
            }
        } catch (RemoteException e) {
            zzo.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    public final void zzA(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpt zzbpt = this.zza;
            if (zzbpt != null) {
                zzbpt.zzz(wrap);
                return;
            }
            zzbpp zzbpp = this.zzl;
            if (zzbpp != null) {
                zzbpp.zzw(wrap);
                return;
            }
            zzbpq zzbpq = this.zzm;
            if (zzbpq != null) {
                zzbpq.zzu(wrap);
            }
        } catch (RemoteException e) {
            zzo.zzk("Failed to call untrackView", e);
        }
    }

    public final boolean zzB() {
        return true;
    }

    public final boolean zzC() {
        return this.zzf.zzL;
    }

    public final boolean zzD(Bundle bundle) {
        return false;
    }

    public final int zza() {
        return 0;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void zzh() {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzi() {
    }

    public final void zzj() {
    }

    public final void zzk(zzdh zzdh) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzl(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (!this.zzj || !this.zzf.zzL) {
            zzb(view);
        }
    }

    public final void zzm(String str) {
    }

    public final void zzn(Bundle bundle) {
    }

    public final void zzp(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzL) {
            zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    public final void zzq() {
    }

    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpt zzbpt = this.zza;
                if (zzbpt == null || zzbpt.zzB()) {
                    zzbpp zzbpp = this.zzl;
                    if (zzbpp == null || zzbpp.zzy()) {
                        zzbpq zzbpq = this.zzm;
                        if (zzbpq != null && !zzbpq.zzw()) {
                            this.zzm.zzr();
                            this.zzb.zza();
                            return;
                        }
                        return;
                    }
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                this.zza.zzx();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzo.zzk("Failed to call recordImpression", e);
        }
    }

    public final void zzs() {
    }

    public final void zzt(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzu(Bundle bundle) {
    }

    public final void zzv(View view) {
    }

    public final void zzw() {
        this.zzj = true;
    }

    public final void zzx(zzdd zzdd) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzy(zzbhq zzbhq) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzz(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzfbo r12 = r8.zzf     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.zzaj     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbcc r13 = com.google.android.gms.internal.ads.zzbcl.zzbF     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.zza(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0023
            goto L_0x00e0
        L_0x0023:
            if (r10 != 0) goto L_0x002b
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002c
        L_0x002b:
            r13 = r10
        L_0x002c:
            if (r11 != 0) goto L_0x0034
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0035
        L_0x0034:
            r1 = r11
        L_0x0035:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r2.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r2.putAll(r1)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0044:
            boolean r1 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r1 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r3 = r12.optJSONArray(r1)     // Catch:{ RemoteException -> 0x0124 }
            if (r3 == 0) goto L_0x0044
            java.lang.Object r4 = r2.get(r1)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r4 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r4 = r4.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r4 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r4 = r4.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzbG     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.zza(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r1 = r1.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r1 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzbpt r1 = r8.zza     // Catch:{ RemoteException -> 0x0124 }
            r4 = 0
            if (r1 == 0) goto L_0x0093
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzn()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.zzbpp r1 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            if (r1 == 0) goto L_0x009c
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzk()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.zzbpq r1 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzj()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r1 = r4
        L_0x00a6:
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)     // Catch:{  }
        L_0x00ac:
            if (r4 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r4 = r4.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0044 }
            r1.<init>()     // Catch:{ JSONException -> 0x0044 }
            com.google.android.gms.ads.internal.util.zzbs.zzc(r3, r1)     // Catch:{ JSONException -> 0x0044 }
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch:{ JSONException -> 0x0044 }
            android.content.Context r3 = r8.zze     // Catch:{ JSONException -> 0x0044 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ JSONException -> 0x0044 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x0044 }
        L_0x00c8:
            boolean r6 = r1.hasNext()     // Catch:{ JSONException -> 0x0044 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r1.next()     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0044 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r5, r3)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r4)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0044
        L_0x00e0:
            r8.zzk = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = zzc(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = zzc(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbpt r12 = r8.zza     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzy(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.zzbpp r12 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzv(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbpp r10 = r8.zzl     // Catch:{ RemoteException -> 0x0124 }
            r10.zzu(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.zzbpq r12 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.zzt(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbpq r10 = r8.zzm     // Catch:{ RemoteException -> 0x0124 }
            r10.zzs(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdki.zzz(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }
}

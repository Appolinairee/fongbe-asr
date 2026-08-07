package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdia extends zzcqz {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    /* access modifiers changed from: private */
    public final zzdif zze;
    private final zzdin zzf;
    private final zzdjf zzg;
    private final zzdik zzh;
    private final zzdiq zzi;
    private final zzhel zzj;
    private final zzhel zzk;
    private final zzhel zzl;
    private final zzhel zzm;
    private final zzhel zzn;
    /* access modifiers changed from: private */
    public zzdkd zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbye zzs;
    private final zzava zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdic zzw;
    private final zzekq zzx;
    /* access modifiers changed from: private */
    public final Map zzy = new HashMap();
    private final List zzz = new ArrayList();

    static {
        zzfxn.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdia(zzcqy zzcqy, Executor executor, zzdif zzdif, zzdin zzdin, zzdjf zzdjf, zzdik zzdik, zzdiq zzdiq, zzhel zzhel, zzhel zzhel2, zzhel zzhel3, zzhel zzhel4, zzhel zzhel5, zzbye zzbye, zzava zzava, VersionInfoParcel versionInfoParcel, Context context, zzdic zzdic, zzekq zzekq, zzaym zzaym) {
        super(zzcqy);
        this.zzd = executor;
        this.zze = zzdif;
        this.zzf = zzdin;
        this.zzg = zzdjf;
        this.zzh = zzdik;
        this.zzi = zzdiq;
        this.zzj = zzhel;
        this.zzk = zzhel2;
        this.zzl = zzhel3;
        this.zzm = zzhel4;
        this.zzn = zzhel5;
        this.zzs = zzbye;
        this.zzt = zzava;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdic;
        this.zzx = zzekq;
    }

    public static boolean zzY(View view) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkw)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zzv.zzq();
        long zzx2 = zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzx2 >= ((long) ((Integer) zzbe.zzc().zza(zzbcl.zzkx)).intValue())) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzaa() {
        zzdkd zzdkd = this.zzo;
        if (zzdkd == null) {
            zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj2 = zzdkd.zzj();
        if (zzj2 != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj2);
        }
        return zzdjf.zza;
    }

    private final void zzab(String str, boolean z) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
            ListenableFuture zzw2 = this.zze.zzw();
            if (zzw2 != null) {
                zzgch.zzr(zzw2, new zzdhy(this, "Google", true), this.zzd);
                return;
            }
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzr(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* access modifiers changed from: private */
    public final void zzad(View view, zzecr zzecr) {
        zzcex zzr2 = this.zze.zzr();
        if (this.zzh.zzd() && zzecr != null && zzr2 != null && view != null) {
            zzv.zzB().zzj(zzecr.zza(), view);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        return;
     */
    /* renamed from: zzae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzz(com.google.android.gms.internal.ads.zzdkd r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzp     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0007
            goto L_0x00b9
        L_0x0007:
            r7.zzo = r8     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdjf r0 = r7.zzg     // Catch:{ all -> 0x00bb }
            r0.zze(r8)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdin r1 = r7.zzf     // Catch:{ all -> 0x00bb }
            android.view.View r2 = r8.zzf()     // Catch:{ all -> 0x00bb }
            java.util.Map r3 = r8.zzm()     // Catch:{ all -> 0x00bb }
            java.util.Map r4 = r8.zzn()     // Catch:{ all -> 0x00bb }
            r5 = r8
            r6 = r8
            r1.zzz(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzcK     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzava r0 = r7.zzt     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzauv r0 = r0.zzc()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r8.zzf()     // Catch:{ all -> 0x00bb }
            r0.zzo(r1)     // Catch:{ all -> 0x00bb }
        L_0x0042:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzbS     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzfbo r0 = r7.zzb     // Catch:{ all -> 0x00bb }
            boolean r1 = r0.zzak     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x005b
            goto L_0x00a8
        L_0x005b:
            org.json.JSONObject r0 = r0.zzaj     // Catch:{ all -> 0x00bb }
            java.util.Iterator r0 = r0.keys()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00a8
        L_0x0063:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdkd r2 = r7.zzo     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0075
            r2 = 0
            goto L_0x007f
        L_0x0075:
            java.util.Map r2 = r2.zzl()     // Catch:{ all -> 0x00bb }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00bb }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x00bb }
        L_0x007f:
            java.util.Map r3 = r7.zzy     // Catch:{ all -> 0x00bb }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x00bb }
            r3.put(r1, r4)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00bb }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0063
            android.content.Context r3 = r7.zzv     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzayl r4 = new com.google.android.gms.internal.ads.zzayl     // Catch:{ all -> 0x00bb }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x00bb }
            java.util.List r2 = r7.zzz     // Catch:{ all -> 0x00bb }
            r2.add(r4)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdhx r2 = new com.google.android.gms.internal.ads.zzdhx     // Catch:{ all -> 0x00bb }
            r2.<init>(r7, r1)     // Catch:{ all -> 0x00bb }
            r4.zzc(r2)     // Catch:{ all -> 0x00bb }
            goto L_0x0063
        L_0x00a8:
            com.google.android.gms.internal.ads.zzayl r0 = r8.zzi()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzayl r8 = r8.zzi()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbye r0 = r7.zzs     // Catch:{ all -> 0x00bb }
            r8.zzc(r0)     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)
            return
        L_0x00b9:
            monitor-exit(r7)
            return
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdia.zzz(com.google.android.gms.internal.ads.zzdkd):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: zzaf */
    public final void zzA(zzdkd zzdkd) {
        this.zzf.zzA(zzdkd.zzf(), zzdkd.zzl());
        if (zzdkd.zzh() != null) {
            zzdkd.zzh().setClickable(false);
            zzdkd.zzh().removeAllViews();
        }
        if (zzdkd.zzi() != null) {
            zzdkd.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzB(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0007
            goto L_0x0087
        L_0x0007:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzbS     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x008e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzfbo r0 = r3.zzb     // Catch:{ all -> 0x008e }
            boolean r0 = r0.zzak     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0044
            java.util.Map r0 = r3.zzy     // Catch:{ all -> 0x008e }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x008e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008e }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x008e }
            java.util.Map r2 = r3.zzy     // Catch:{ all -> 0x008e }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x008e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0029
            goto L_0x0087
        L_0x0044:
            if (r7 != 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzbcc r7 = com.google.android.gms.internal.ads.zzbcl.zzdX     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x008e }
            java.lang.Object r7 = r0.zza(r7)     // Catch:{ all -> 0x008e }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x008e }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x0087
            if (r5 == 0) goto L_0x0087
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x008e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x008e }
        L_0x0062:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x008e }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008e }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x008e }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0062
            boolean r0 = zzY(r0)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0062
            r3.zzac(r4, r5, r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r3)
            return
        L_0x0087:
            monitor-exit(r3)
            return
        L_0x0089:
            r3.zzac(r4, r5, r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r3)
            return
        L_0x008e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdia.zzB(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzC(zzdh zzdh) {
        this.zzf.zzk(zzdh);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzD(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdjf r0 = r9.zzg     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzdkd r1 = r9.zzo     // Catch:{ all -> 0x0037 }
            r0.zzc(r1)     // Catch:{ all -> 0x0037 }
            android.widget.ImageView$ScaleType r8 = r9.zzaa()     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzdin r2 = r9.zzf     // Catch:{ all -> 0x0037 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzl(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0037 }
            boolean r10 = r9.zzr     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzdif r10 = r9.zze     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzcex r11 = r10.zzs()     // Catch:{ all -> 0x0037 }
            if (r11 != 0) goto L_0x0023
            goto L_0x0035
        L_0x0023:
            com.google.android.gms.internal.ads.zzcex r10 = r10.zzs()     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0035
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0037 }
            r11.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch:{ all -> 0x0037 }
            monitor-exit(r9)
            return
        L_0x0035:
            monitor-exit(r9)
            return
        L_0x0037:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0037 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdia.zzD(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzE(View view, int i) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            zzdkd zzdkd = this.zzo;
            if (zzdkd == null) {
                zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.zzd.execute(new zzdhu(this, view, zzdkd instanceof zzdiz, i));
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzm(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzn(bundle);
    }

    public final synchronized void zzH() {
        zzdkd zzdkd = this.zzo;
        if (zzdkd == null) {
            zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzd.execute(new zzdhw(this, zzdkd instanceof zzdiz));
        }
    }

    public final void zzI(Bundle bundle) {
        zzcex zzs2 = this.zze.zzs();
        if (zzs2 == null) {
            zzo.zzg("Video webview is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new zzdht(zzs2, jSONObject));
        } catch (JSONException e) {
            zzo.zzh("Error reading event signals", e);
        }
    }

    public final synchronized void zzJ() {
        if (!this.zzq) {
            this.zzf.zzs();
        }
    }

    public final void zzK(View view) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
            zzdif zzdif = this.zze;
            if (zzdif.zzc() != 3) {
                zzcab zzp2 = zzdif.zzp();
                if (zzp2 != null) {
                    zzgch.zzr(zzp2, new zzdhz(this, view), this.zzd);
                    return;
                }
                return;
            }
        }
        zzad(view, this.zze.zzu());
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzt(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzu(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzv(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzw();
    }

    public final synchronized void zzP(zzdd zzdd) {
        this.zzf.zzx(zzdd);
    }

    public final synchronized void zzQ(zzdr zzdr) {
        this.zzx.zza(zzdr);
    }

    public final synchronized void zzR(zzbhq zzbhq) {
        this.zzf.zzy(zzbhq);
    }

    public final synchronized void zzS(zzdkd zzdkd) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbQ)).booleanValue()) {
            zzs.zza.post(new zzdhp(this, zzdkd));
        } else {
            zzz(zzdkd);
        }
    }

    public final synchronized void zzT(zzdkd zzdkd) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbQ)).booleanValue()) {
            zzs.zza.post(new zzdhq(this, zzdkd));
        } else {
            zzA(zzdkd);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzC();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzD = this.zzf.zzD(bundle);
        this.zzq = zzD;
        return zzD;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new zzdhv(this));
        super.zzb();
    }

    public final zzdic zzc() {
        return this.zzw;
    }

    public final zzecr zzf(String str, boolean z) {
        String str2;
        zzecn zzecn;
        zzeco zzeco;
        zzeco zzeco2;
        String str3;
        if (this.zzh.zzd() && !TextUtils.isEmpty(str)) {
            zzdif zzdif = this.zze;
            zzcex zzr2 = zzdif.zzr();
            zzcex zzs2 = zzdif.zzs();
            if (zzr2 == null && zzs2 == null) {
                zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z2 = false;
            boolean z3 = zzr2 != null;
            boolean z4 = zzs2 != null;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzfj)).booleanValue()) {
                this.zzh.zza();
                int zzc2 = this.zzh.zza().zzc();
                int i = zzc2 - 1;
                if (i != 0) {
                    if (i != 1) {
                        if (zzc2 != 1) {
                            str3 = zzc2 != 2 ? "UNKNOWN" : "DISPLAY";
                        } else {
                            str3 = "VIDEO";
                        }
                        zzo.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                        return null;
                    } else if (zzr2 != null) {
                        z2 = true;
                        z4 = false;
                    } else {
                        zzo.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                } else if (zzs2 != null) {
                    z4 = true;
                } else {
                    zzo.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzr2 = zzs2;
            }
            if (zzr2 != null) {
                if (!zzv.zzB().zzl(this.zzv)) {
                    zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.zzu;
                String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (z4) {
                    zzecn = zzecn.VIDEO;
                    zzeco = zzeco.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzdif zzdif2 = this.zze;
                    zzecn zzecn2 = zzecn.NATIVE_DISPLAY;
                    if (zzdif2.zzc() == 3) {
                        zzeco2 = zzeco.UNSPECIFIED;
                    } else {
                        zzeco2 = zzeco.ONE_PIXEL;
                    }
                    zzeco = zzeco2;
                    zzecn = zzecn2;
                }
                zzecr zzb = zzv.zzB().zzb(str4, zzr2.zzG(), "", "javascript", str2, str, zzeco, zzecn, this.zzb.zzal);
                if (zzb == null) {
                    zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.zze.zzW(zzb);
                zzr2.zzat(zzb);
                if (z4) {
                    zzfkp zza = zzb.zza();
                    if (zzs2 != null) {
                        zzv.zzB().zzj(zza, zzs2.zzF());
                    }
                    this.zzr = true;
                }
                if (z) {
                    zzv.zzB().zzk(zzb.zza());
                    zzr2.zzd("onSdkLoaded", new ArrayMap());
                }
                return zzb;
            }
            zzo.zzj("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    public final void zzk() {
        this.zzd.execute(new zzdhr(this));
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            zzdin zzdin = this.zzf;
            Objects.requireNonNull(zzdin);
            executor.execute(new zzdhs(zzdin));
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzecr zzu2 = this.zze.zzu();
        if (this.zzh.zzd() && zzu2 != null && view != null) {
            zzv.zzB().zzg(zzu2.zza(), view);
        }
    }

    public final synchronized void zzv() {
        this.zzf.zzi();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzf.zzj();
        this.zze.zzI();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(View view, boolean z, int i) {
        zzdkd zzdkd = this.zzo;
        if (zzdkd == null) {
            zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        this.zzf.zzp(view, zzdkd.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzaa(), i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzy(boolean z) {
        zzdkd zzdkd = this.zzo;
        if (zzdkd == null) {
            zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        this.zzf.zzp((View) null, zzdkd.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzaa(), 0);
    }

    public static /* synthetic */ void zzl(zzdia zzdia) {
        try {
            zzdif zzdif = zzdia.zze;
            int zzc2 = zzdif.zzc();
            if (zzc2 == 1) {
                zzbgx zzb = zzdia.zzi.zzb();
                if (zzb != null) {
                    zzdia.zzab("Google", true);
                    zzb.zze((zzbgn) zzdia.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                zzbgu zza = zzdia.zzi.zza();
                if (zza != null) {
                    zzdia.zzab("Google", true);
                    zza.zze((zzbgl) zzdia.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                zzbhd zzd2 = zzdia.zzi.zzd(zzdif.zzA());
                if (zzd2 != null) {
                    if (zzdia.zze.zzs() != null) {
                        zzdia.zzf("Google", true);
                    }
                    zzd2.zze((zzbgq) zzdia.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                zzbhk zzf2 = zzdia.zzi.zzf();
                if (zzf2 != null) {
                    zzdia.zzab("Google", true);
                    zzf2.zze((zzbht) zzdia.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                zzo.zzg("Wrong native template id!");
            } else {
                zzbmi zzg2 = zzdia.zzi.zzg();
                if (zzg2 != null) {
                    zzg2.zzg((zzbmc) zzdia.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            zzo.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}

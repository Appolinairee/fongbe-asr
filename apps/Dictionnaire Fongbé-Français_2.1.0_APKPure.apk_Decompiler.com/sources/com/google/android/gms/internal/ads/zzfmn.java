package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfmn {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfmm zzb(View view) {
        zzfmm zzfmm = (zzfmm) this.zzb.get(view);
        if (zzfmm != null) {
            this.zzb.remove(view);
        }
        return zzfmm;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzflk r0 = com.google.android.gms.internal.ads.zzflk.zza()
            if (r0 == 0) goto L_0x012b
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfkt r1 = (com.google.android.gms.internal.ads.zzfkt) r1
            android.view.View r2 = r1.zzf()
            boolean r3 = r1.zzj()
            if (r3 == 0) goto L_0x000e
            java.lang.String r3 = r1.zzh()
            if (r2 == 0) goto L_0x011d
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            r6 = 0
            r7 = 0
            if (r4 < r5) goto L_0x0050
            android.content.Context r4 = r2.getContext()
        L_0x0036:
            boolean r5 = r4 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L_0x0048
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0041
            android.app.Activity r4 = (android.app.Activity) r4
            goto L_0x0049
        L_0x0041:
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x0036
        L_0x0048:
            r4 = r6
        L_0x0049:
            if (r4 == 0) goto L_0x0050
            boolean r4 = r4.isInPictureInPictureMode()
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0058
            java.util.HashSet r5 = r9.zzh
            r5.add(r3)
        L_0x0058:
            boolean r5 = r2.isAttachedToWindow()
            java.lang.String r8 = "noWindowFocus"
            if (r5 != 0) goto L_0x0063
            java.lang.String r6 = "notAttached"
            goto L_0x00bd
        L_0x0063:
            boolean r5 = r2.hasWindowFocus()
            if (r5 == 0) goto L_0x0073
            java.util.Map r5 = r9.zzi
            r5.remove(r2)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            goto L_0x008e
        L_0x0073:
            java.util.Map r5 = r9.zzi
            boolean r5 = r5.containsKey(r2)
            if (r5 == 0) goto L_0x0084
            java.util.Map r5 = r9.zzi
            java.lang.Object r5 = r5.get(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L_0x008e
        L_0x0084:
            java.util.Map r5 = r9.zzi
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5.put(r2, r7)
            r5 = r7
        L_0x008e:
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0098
            if (r4 != 0) goto L_0x0098
            r6 = r8
            goto L_0x00bd
        L_0x0098:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = r2
        L_0x009e:
            if (r5 == 0) goto L_0x00b8
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfml.zza(r5)
            if (r7 == 0) goto L_0x00a8
            r6 = r7
            goto L_0x00bd
        L_0x00a8:
            r4.add(r5)
            android.view.ViewParent r5 = r5.getParent()
            boolean r7 = r5 instanceof android.view.View
            if (r7 == 0) goto L_0x00b6
            android.view.View r5 = (android.view.View) r5
            goto L_0x009e
        L_0x00b6:
            r5 = r6
            goto L_0x009e
        L_0x00b8:
            java.util.HashSet r5 = r9.zzd
            r5.addAll(r4)
        L_0x00bd:
            if (r6 != 0) goto L_0x010a
            java.util.HashSet r4 = r9.zze
            r4.add(r3)
            java.util.HashMap r4 = r9.zza
            r4.put(r2, r3)
            java.util.List r2 = r1.zzi()
            java.util.Iterator r2 = r2.iterator()
        L_0x00d1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000e
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzfln r3 = (com.google.android.gms.internal.ads.zzfln) r3
            com.google.android.gms.internal.ads.zzfnb r4 = r3.zzb()
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x00d1
            java.util.HashMap r5 = r9.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzfmm r5 = (com.google.android.gms.internal.ads.zzfmm) r5
            if (r5 == 0) goto L_0x00fb
            java.lang.String r3 = r1.zzh()
            r5.zzc(r3)
            goto L_0x00d1
        L_0x00fb:
            java.util.HashMap r5 = r9.zzb
            com.google.android.gms.internal.ads.zzfmm r6 = new com.google.android.gms.internal.ads.zzfmm
            java.lang.String r7 = r1.zzh()
            r6.<init>(r3, r7)
            r5.put(r4, r6)
            goto L_0x00d1
        L_0x010a:
            if (r6 == r8) goto L_0x000e
            java.util.HashSet r1 = r9.zzf
            r1.add(r3)
            java.util.HashMap r1 = r9.zzc
            r1.put(r3, r2)
            java.util.HashMap r1 = r9.zzg
            r1.put(r3, r6)
            goto L_0x000e
        L_0x011d:
            java.util.HashSet r1 = r9.zzf
            r1.add(r3)
            java.util.HashMap r1 = r9.zzg
            java.lang.String r2 = "noAdView"
            r1.put(r3, r2)
            goto L_0x000e
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmn.zzi():void");
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        if (!this.zzi.containsKey(view)) {
            return true;
        }
        this.zzi.put(view, true);
        return false;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}

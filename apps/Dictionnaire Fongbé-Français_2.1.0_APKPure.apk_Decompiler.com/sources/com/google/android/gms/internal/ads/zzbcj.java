package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.lifecycle.CoroutineLiveDataKt;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbcj implements SharedPreferences.OnSharedPreferenceChangeListener {
    volatile boolean zza = false;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private Context zzg;
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbcn.zza(new zzbcg(sharedPreferences)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(zzbcc zzbcc) {
        if (!this.zzc.block(CoroutineLiveDataKt.DEFAULT_TIMEOUT)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                    if (this.zzj) {
                    }
                }
                Object zzk = zzbcc.zzk();
                return zzk;
            }
        }
        if (zzbcc.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbcc.zzk();
            }
            return zzbcc.zzb(bundle);
        } else if (zzbcc.zze() != 1 || !this.zzh.has(zzbcc.zzl())) {
            return zzbcn.zza(new zzbch(this, zzbcc));
        } else {
            return zzbcc.zza(this.zzh);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbcc zzbcc) {
        return zzbcc.zzc(this.zze);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzbcf(r3))).optBoolean("local_flags_enabled") != false) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f A[SYNTHETIC, Splitter:B:72:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128 A[SYNTHETIC, Splitter:B:76:0x0128] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.content.Context r11) {
        /*
            r10 = this;
            boolean r0 = r10.zzd
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r10.zzb
            monitor-enter(r0)
            boolean r1 = r10.zzd     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            return
        L_0x000e:
            boolean r1 = r10.zza     // Catch:{ all -> 0x015f }
            r2 = 1
            if (r1 != 0) goto L_0x0015
            r10.zza = r2     // Catch:{ all -> 0x015f }
        L_0x0015:
            java.lang.String r1 = r11.getPackageName()     // Catch:{ all -> 0x015f }
            java.lang.String r3 = "com.google.android.gms"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch:{ all -> 0x015f }
            r10.zzi = r1     // Catch:{ all -> 0x015f }
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x002b
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x015f }
        L_0x002b:
            r10.zzg = r11     // Catch:{ all -> 0x015f }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r11 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r11)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
            android.content.Context r1 = r10.zzg     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
            android.os.Bundle r11 = r11.metaData     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
            r10.zzf = r11     // Catch:{ NameNotFoundException | NullPointerException -> 0x0041 }
        L_0x0041:
            r11 = 0
            android.content.Context r1 = r10.zzg     // Catch:{ all -> 0x0156 }
            android.content.Context r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r1)     // Catch:{ all -> 0x0156 }
            if (r3 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x0052
            android.content.Context r3 = r1.getApplicationContext()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            if (r1 == 0) goto L_0x005d
            com.google.android.gms.ads.internal.client.zzbe.zzb()     // Catch:{ all -> 0x0156 }
            android.content.SharedPreferences r3 = com.google.android.gms.internal.ads.zzbce.zza(r1)     // Catch:{ all -> 0x0156 }
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzbci r4 = new com.google.android.gms.internal.ads.zzbci     // Catch:{ all -> 0x0156 }
            r4.<init>(r10, r3)     // Catch:{ all -> 0x0156 }
            com.google.android.gms.internal.ads.zzbfc.zzc(r4)     // Catch:{ all -> 0x0156 }
        L_0x0068:
            boolean r3 = r10.zzi     // Catch:{ all -> 0x0156 }
            r4 = 0
            if (r3 != 0) goto L_0x00a2
            com.google.android.gms.internal.ads.zzbdv r3 = com.google.android.gms.internal.ads.zzbed.zzd     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = r3.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0156 }
            long r6 = r3.longValue()     // Catch:{ all -> 0x0156 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a2
            android.content.Context r3 = r10.zzg     // Catch:{ all -> 0x0156 }
            int r3 = com.google.android.gms.internal.ads.zzbbv.zza(r3)     // Catch:{ all -> 0x0156 }
            long r6 = (long) r3     // Catch:{ all -> 0x0156 }
            com.google.android.gms.internal.ads.zzbdv r3 = com.google.android.gms.internal.ads.zzbed.zzd     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = r3.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0156 }
            long r8 = r3.longValue()     // Catch:{ all -> 0x0156 }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x00a2
            r10.zzj = r2     // Catch:{ all -> 0x0156 }
            r10.zzd = r2     // Catch:{ all -> 0x0156 }
            r10.zza = r11     // Catch:{ all -> 0x015f }
            android.os.ConditionVariable r11 = r10.zzc     // Catch:{ all -> 0x015f }
            r11.open()     // Catch:{ all -> 0x015f }
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            return
        L_0x00a2:
            boolean r3 = r10.zzi     // Catch:{ all -> 0x0156 }
            if (r3 != 0) goto L_0x00da
            com.google.android.gms.internal.ads.zzbdv r3 = com.google.android.gms.internal.ads.zzbed.zzf     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = r3.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0156 }
            long r6 = r3.longValue()     // Catch:{ all -> 0x0156 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00da
            android.content.Context r3 = r10.zzg     // Catch:{ all -> 0x0156 }
            int r3 = com.google.android.gms.internal.ads.zzbbv.zzb(r3)     // Catch:{ all -> 0x0156 }
            long r3 = (long) r3     // Catch:{ all -> 0x0156 }
            com.google.android.gms.internal.ads.zzbdv r5 = com.google.android.gms.internal.ads.zzbed.zzf     // Catch:{ all -> 0x0156 }
            java.lang.Object r5 = r5.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0156 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0156 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00da
            r10.zzj = r2     // Catch:{ all -> 0x0156 }
            r10.zzd = r2     // Catch:{ all -> 0x0156 }
            r10.zza = r11     // Catch:{ all -> 0x015f }
            android.os.ConditionVariable r11 = r10.zzc     // Catch:{ all -> 0x015f }
            r11.open()     // Catch:{ all -> 0x015f }
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            return
        L_0x00da:
            android.content.Context r3 = r10.zzg     // Catch:{ all -> 0x0156 }
            com.google.android.gms.internal.ads.zzbdv r4 = com.google.android.gms.internal.ads.zzbel.zzg     // Catch:{ all -> 0x0156 }
            java.lang.Object r4 = r4.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0156 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0156 }
            if (r4 == 0) goto L_0x00eb
            goto L_0x0119
        L_0x00eb:
            com.google.android.gms.internal.ads.zzbdv r4 = com.google.android.gms.internal.ads.zzbel.zzh     // Catch:{ all -> 0x0156 }
            java.lang.Object r4 = r4.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0156 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0156 }
            if (r4 == 0) goto L_0x011d
            java.lang.String r4 = "admob"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r11)     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.zzbcf r4 = new com.google.android.gms.internal.ads.zzbcf     // Catch:{ all -> 0x0156 }
            r4.<init>(r3)     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbcn.zza(r4)     // Catch:{ all -> 0x0156 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0156 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011c }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = "local_flags_enabled"
            boolean r3 = r4.optBoolean(r3)     // Catch:{ JSONException -> 0x011c }
            if (r3 == 0) goto L_0x011d
        L_0x0119:
            android.content.Context r1 = r10.zzg     // Catch:{ all -> 0x0156 }
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            if (r1 != 0) goto L_0x0128
            r10.zza = r11     // Catch:{ all -> 0x015f }
            android.os.ConditionVariable r11 = r10.zzc     // Catch:{ all -> 0x015f }
            r11.open()     // Catch:{ all -> 0x015f }
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            return
        L_0x0128:
            com.google.android.gms.ads.internal.client.zzbe.zzb()     // Catch:{ all -> 0x0156 }
            android.content.SharedPreferences r1 = com.google.android.gms.internal.ads.zzbce.zza(r1)     // Catch:{ all -> 0x0156 }
            r10.zze = r1     // Catch:{ all -> 0x0156 }
            com.google.android.gms.internal.ads.zzbdv r1 = com.google.android.gms.internal.ads.zzbel.zza     // Catch:{ all -> 0x0156 }
            java.lang.Object r1 = r1.zze()     // Catch:{ all -> 0x0156 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0156 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0156 }
            if (r1 != 0) goto L_0x0146
            android.content.SharedPreferences r1 = r10.zze     // Catch:{ all -> 0x0156 }
            if (r1 == 0) goto L_0x0146
            r1.registerOnSharedPreferenceChangeListener(r10)     // Catch:{ all -> 0x0156 }
        L_0x0146:
            android.content.SharedPreferences r1 = r10.zze     // Catch:{ all -> 0x0156 }
            r10.zzg(r1)     // Catch:{ all -> 0x0156 }
            r10.zzd = r2     // Catch:{ all -> 0x0156 }
            r10.zza = r11     // Catch:{ all -> 0x015f }
            android.os.ConditionVariable r11 = r10.zzc     // Catch:{ all -> 0x015f }
            r11.open()     // Catch:{ all -> 0x015f }
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            return
        L_0x0156:
            r1 = move-exception
            r10.zza = r11     // Catch:{ all -> 0x015f }
            android.os.ConditionVariable r11 = r10.zzc     // Catch:{ all -> 0x015f }
            r11.open()     // Catch:{ all -> 0x015f }
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcj.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zzi;
    }

    public final Object zzb(zzbcc zzbcc) {
        if (this.zzd || this.zza) {
            return zza(zzbcc);
        }
        return zzbcc.zzk();
    }
}

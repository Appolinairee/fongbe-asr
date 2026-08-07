package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbyi {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final Object zzc = new Object();
    private String zzd = null;
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference((Object) null);
    private final AtomicReference zzg = new AtomicReference((Object) null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi;

    public zzbyi() {
        new AtomicReference((Object) null);
        new ArrayBlockingQueue(20);
        this.zzi = new Object();
    }

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzr(Context context) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzav)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzbe.zzc().zza(zzbcl.zzaw)).intValue()) {
            return false;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzax)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzs(String str, Context context) {
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(this.zzf.get(), (Object[]) null);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final Method zzt(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, (Class[]) null);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            Method method = (Method) this.zzh.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.zzh.put(str2, method);
                } catch (Exception unused) {
                    zzw(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), new Object[]{str});
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final void zzv(Context context, String str, String str2, Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzo.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method = (Method) this.zzh.get("logEventInternal");
                if (method == null) {
                    try {
                        Class<String> cls = String.class;
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.zzh.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String str, boolean z) {
        if (!this.zza.get()) {
            zzo.zzj("Invoke Firebase method " + str + " error.");
            if (z) {
                zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbyf.zza(atomicReference, (Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                zzw("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String zza(Context context) {
        Object zzs;
        if (zzp(context) && (zzs = zzs("generateEventId", context)) != null) {
            return zzs.toString();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb(android.content.Context r13) {
        /*
            r12 = this;
            boolean r0 = r12.zzp(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzat
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r13 = r12.zzs(r0, r13)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference r0 = r12.zzb
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x008d
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzfqs r0 = com.google.android.gms.internal.ads.zzfqv.zza()
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzau
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzbyh r5 = new com.google.android.gms.internal.ads.zzbyh
            r5.<init>(r12)
            r6 = 2
            java.util.concurrent.ExecutorService r0 = r0.zzc(r4, r5, r6)
            goto L_0x0088
        L_0x0054:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzau
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzau
            com.google.android.gms.internal.ads.zzbcj r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r6.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r6 = r4.intValue()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbyh r11 = new com.google.android.gms.internal.ads.zzbyh
            r11.<init>(r12)
            r7 = 1
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
        L_0x0088:
            java.util.concurrent.atomic.AtomicReference r4 = r12.zzb
            com.google.android.gms.internal.ads.zzbyf.zza(r4, r1, r0)
        L_0x008d:
            java.util.concurrent.atomic.AtomicReference r0 = r12.zzb
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.google.android.gms.internal.ads.zzbyg r4 = new com.google.android.gms.internal.ads.zzbyg
            r4.<init>(r12, r13)
            java.util.concurrent.Future r13 = r0.submit(r4)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00a8, Exception -> 0x00a7 }
            java.lang.Object r13 = r13.get(r2, r0)     // Catch:{ TimeoutException -> 0x00a8, Exception -> 0x00a7 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ TimeoutException -> 0x00a8, Exception -> 0x00a7 }
            return r13
        L_0x00a7:
            return r1
        L_0x00a8:
            java.lang.String r13 = "TIME_OUT"
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyi.zzb(android.content.Context):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r5.zzp(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            goto L_0x0045
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference r1 = r5.zzf
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurement"
            r4 = 1
            boolean r1 = r5.zzx(r6, r3, r1, r4)
            if (r1 == 0) goto L_0x0045
            java.lang.reflect.Method r1 = r5.zzt(r6, r0)     // Catch:{ Exception -> 0x0041 }
            java.util.concurrent.atomic.AtomicReference r3 = r5.zzf     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0041 }
            r4 = 0
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = "getCurrentScreenClass"
            java.lang.reflect.Method r6 = r5.zzt(r6, r1)     // Catch:{ Exception -> 0x0041 }
            java.util.concurrent.atomic.AtomicReference r1 = r5.zzf     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r6 = r6.invoke(r1, r4)     // Catch:{ Exception -> 0x0041 }
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0041 }
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r1
        L_0x0040:
            return r2
        L_0x0041:
            r6 = 0
            r5.zzw(r0, r6)
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyi.zzc(android.content.Context):java.lang.String");
    }

    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzs("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zze(Context context) throws Exception {
        return (String) zzs("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) {
        zzv(context, "_aa", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zzv(context, "_aq", str, (Bundle) null);
    }

    public final void zzj(Context context, String str, Map map) {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(Context context, String str, Map map) {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(Context context, String str, String str2, String str3, int i) {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzv(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzm(Context context, zzm zzm) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, zzfv zzfv) {
        zzbyj.zzd(context).zzb().zzc(zzfv);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method = (Method) this.zzh.get("setCurrentScreen");
            if (method == null) {
                try {
                    Class<String> cls = String.class;
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.zzh.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzan)).booleanValue() && !this.zza.get()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzay)).booleanValue()) {
                return true;
            }
            if (this.zze.get() == -1) {
                zzbc.zzb();
                if (!zzf.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzbc.zzb();
                    if (zzf.zzt(context)) {
                        zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    }
                }
                this.zze.set(1);
            }
            if (this.zze.get() == 1) {
                return true;
            }
        }
        return false;
    }
}

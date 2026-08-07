package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbkb implements zzbjp {
    private final zzb zza;
    private final zzdrw zzb;
    private final zzu zzc;
    private final zzbsc zzd;
    private final zzebk zze;
    private final zzcmk zzf;
    private zzaa zzg = null;
    private final zzgcs zzh = zzbzw.zzg;

    public zzbkb(zzb zzb2, zzbsc zzbsc, zzebk zzebk, zzdrw zzdrw, zzcmk zzcmk) {
        this.zza = zzb2;
        this.zzd = zzbsc;
        this.zze = zzebk;
        this.zzb = zzdrw;
        this.zzc = new zzu((String) null);
        this.zzf = zzcmk;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzava zzava, Uri uri, View view, Activity activity, zzfcn zzfcn) {
        if (zzava == null) {
            return uri;
        }
        try {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcn == null) {
                if (zzava.zze(uri)) {
                    return zzava.zza(uri, context, view, activity);
                }
                return uri;
            } else if (zzava.zze(uri)) {
                return zzfcn.zza(uri, context, view, activity);
            } else {
                return uri;
            }
        } catch (zzavb unused) {
            return uri;
        } catch (Exception e) {
            zzv.zzp().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzo.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* access modifiers changed from: private */
    public final void zzh(String str, zza zza2, Map map, String str2) {
        String str3;
        boolean z;
        HashMap hashMap;
        Object obj;
        Object obj2;
        boolean z2;
        zza zza3 = zza2;
        Map map2 = map;
        String str4 = str2;
        zzcex zzcex = (zzcex) zza3;
        zzfbo zzD = zzcex.zzD();
        zzfbr zzR = zzcex.zzR();
        boolean z3 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z = false;
        } else {
            String str5 = zzR.zzb;
            z = zzD.zzb();
            str3 = str5;
        }
        boolean z4 = !((Boolean) zzbe.zzc().zza(zzbcl.zzkC)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
        boolean z5 = ((Boolean) zzbe.zzc().zza(zzbcl.zzmC)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str4)) {
            if (zzcex.zzaF()) {
                zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcgh) zza3).zzaL(zzf(map), zzb(map), z4);
        } else if ("webapp".equalsIgnoreCase(str4)) {
            zzk(false);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzlM)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1")) {
                z3 = true;
            }
            if (str != null) {
                ((zzcgh) zza3).zzaN(zzf(map), zzb(map), str, z4, z3);
            } else {
                ((zzcgh) zza3).zzaM(zzf(map), zzb(map), (String) map2.get("html"), (String) map2.get("baseurl"), z4);
            }
        } else {
            Intent intent = null;
            if ("chrome_custom_tab".equalsIgnoreCase(str4)) {
                Context context = zzcex.getContext();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzeI)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                    zzm(10);
                } else {
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
                        int i = zzbdk.zza;
                        if (CustomTabsClient.getPackageName(context, (List<String>) null) != null) {
                            z3 = true;
                        }
                    } else {
                        z3 = zzbdm.zzg(context);
                    }
                    if (!z3) {
                        zzm(4);
                    } else {
                        zzk(true);
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("Cannot open browser with null or empty url");
                            zzm(7);
                            return;
                        }
                        Uri zzd2 = zzd(zzc(zzcex.getContext(), zzcex.zzI(), Uri.parse(str), zzcex.zzF(), zzcex.zzi(), zzcex.zzS()));
                        if (!z || this.zze == null || !zzl(zza3, zzcex.getContext(), zzd2.toString(), str3)) {
                            this.zzg = new zzbjy(this);
                            ((zzcgh) zza3).zzaJ(new zzc((String) null, zzd2.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4, z5, str3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                zzj(zza2, map, z, str3, z4, z5);
            } else if ("app".equalsIgnoreCase(str4) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                zzj(zza2, map, z, str3, z4, z5);
            } else if ("open_app".equalsIgnoreCase(str4)) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzid)).booleanValue()) {
                    zzk(true);
                    String str6 = (String) map2.get("p");
                    if (str6 == null) {
                        zzo.zzj("Package name missing from open app action.");
                    } else if (!z || this.zze == null || !zzl(zza3, zzcex.getContext(), str6, str3)) {
                        PackageManager packageManager = zzcex.getContext().getPackageManager();
                        if (packageManager == null) {
                            zzo.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                        if (launchIntentForPackage != null) {
                            ((zzcgh) zza3).zzaJ(new zzc(launchIntentForPackage, this.zzg), z4, z5, str3);
                        }
                    }
                }
            } else {
                zzk(true);
                String str7 = (String) map2.get("intent_url");
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        intent = Intent.parseUri(str7, 0);
                    } catch (URISyntaxException e) {
                        zzo.zzh("Error parsing the url: ".concat(String.valueOf(str7)), e);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzd3 = zzd(zzc(zzcex.getContext(), zzcex.zzI(), data, zzcex.zzF(), zzcex.zzi(), zzcex.zzS()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) zzbe.zzc().zza(zzbcl.zzie)).booleanValue()) {
                                intent2.setDataAndType(zzd3, intent2.getType());
                            }
                        }
                        intent2.setData(zzd3);
                    }
                }
                boolean z6 = ((Boolean) zzbe.zzc().zza(zzbcl.zziz)).booleanValue() && "intent_async".equalsIgnoreCase(str4) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z6) {
                    zzbjz zzbjz = r1;
                    hashMap = hashMap2;
                    obj = "p";
                    obj2 = "event_id";
                    zzbjz zzbjz2 = new zzbjz(this, z4, zza2, hashMap, map);
                    this.zzg = zzbjz;
                    z2 = false;
                } else {
                    hashMap = hashMap2;
                    obj2 = "event_id";
                    obj = "p";
                    z2 = z4;
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcex.getContext(), zzcex.zzI(), Uri.parse(str), zzcex.zzF(), zzcex.zzi(), zzcex.zzS())).toString() : str;
                    if (!z || this.zze == null || !zzl(zza3, zzcex.getContext(), uri, str3)) {
                        ((zzcgh) zza3).zzaJ(new zzc((String) map2.get("i"), uri, (String) map2.get("m"), (String) map2.get(obj), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzg), z2, z5, str3);
                    } else if (z6) {
                        hashMap3.put((String) map2.get(obj2), true);
                        ((zzbmk) zza3).zzd("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.zze == null || !zzl(zza3, zzcex.getContext(), intent2.getData().toString(), str3)) {
                    ((zzcgh) zza3).zzaJ(new zzc(intent2, this.zzg), z2, z5, str3);
                } else if (z6) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put((String) map2.get(obj2), true);
                    ((zzbmk) zza3).zzd("openIntentAsync", hashMap4);
                }
            }
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdrw zzdrw = this.zzb;
        if (zzdrw != null) {
            zzebv.zzd(context, zzdrw, this.zze, str, "dialog_not_shown", zzfxq.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: android.content.Intent} */
    /* JADX WARNING: type inference failed for: r17v1, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r17v6, types: [android.net.Uri] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0108, code lost:
        if (com.google.android.gms.internal.ads.zzbka.zzc(r2, r12, r13, r14, r15) == null) goto L_0x010a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r24
            r4 = 1
            r1.zzk(r4)
            r5 = r0
            com.google.android.gms.internal.ads.zzcex r5 = (com.google.android.gms.internal.ads.zzcex) r5
            android.content.Context r12 = r5.getContext()
            com.google.android.gms.internal.ads.zzava r13 = r5.zzI()
            android.view.View r14 = r5.zzF()
            com.google.android.gms.internal.ads.zzfcn r15 = r5.zzS()
            java.lang.String r6 = "activity"
            java.lang.Object r6 = r12.getSystemService(r6)
            r16 = r6
            android.app.ActivityManager r16 = (android.app.ActivityManager) r16
            java.lang.String r6 = "u"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r17 = 0
            if (r7 == 0) goto L_0x003d
        L_0x0039:
            r2 = r17
            goto L_0x0174
        L_0x003d:
            android.net.Uri r8 = android.net.Uri.parse(r6)
            r10 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r11 = r15
            android.net.Uri r6 = zzc(r6, r7, r8, r9, r10, r11)
            android.net.Uri r6 = zzd(r6)
            java.lang.String r7 = "use_first_package"
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r18 = java.lang.Boolean.parseBoolean(r7)
            java.lang.String r7 = "use_running_process"
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r19 = java.lang.Boolean.parseBoolean(r7)
            java.lang.String r7 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r11 = 0
            if (r2 != 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzeC
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r7.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            java.lang.String r2 = r6.getScheme()
            java.lang.String r7 = "http"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.String r8 = "https"
            if (r2 == 0) goto L_0x00a6
            android.net.Uri$Builder r2 = r6.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r8)
            android.net.Uri r17 = r2.build()
        L_0x00a3:
            r2 = r17
            goto L_0x00bd
        L_0x00a6:
            java.lang.String r2 = r6.getScheme()
            boolean r2 = r8.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a3
            android.net.Uri$Builder r2 = r6.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r7)
            android.net.Uri r17 = r2.build()
            goto L_0x00a3
        L_0x00bd:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.zzbka.zza(r6, r12, r13, r14, r15)
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbka.zza(r2, r12, r13, r14, r15)
            if (r4 == 0) goto L_0x00d8
            com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.ads.internal.util.zzs.zzp(r12, r9)
            com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.ads.internal.util.zzs.zzp(r12, r2)
        L_0x00d8:
            r6 = r9
            r7 = r10
            r8 = r12
            r4 = r9
            r9 = r13
            r22 = r10
            r10 = r14
            r0 = 0
            r11 = r15
            android.content.pm.ResolveInfo r7 = com.google.android.gms.internal.ads.zzbka.zzd(r6, r7, r8, r9, r10, r11)
            if (r7 == 0) goto L_0x00f3
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbka.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x00f3:
            if (r2 == 0) goto L_0x010a
            android.content.pm.ResolveInfo r7 = com.google.android.gms.internal.ads.zzbka.zzc(r2, r12, r13, r14, r15)
            if (r7 == 0) goto L_0x010a
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbka.zzb(r6, r7, r8, r9, r10, r11)
            android.content.pm.ResolveInfo r6 = com.google.android.gms.internal.ads.zzbka.zzc(r2, r12, r13, r14, r15)
            if (r6 != 0) goto L_0x0174
        L_0x010a:
            boolean r2 = r22.isEmpty()
            if (r2 == 0) goto L_0x0112
            goto L_0x0173
        L_0x0112:
            if (r19 == 0) goto L_0x015c
            if (r16 == 0) goto L_0x015c
            java.util.List r2 = r16.getRunningAppProcesses()
            if (r2 == 0) goto L_0x015c
            int r6 = r22.size()
            r11 = 0
        L_0x0121:
            if (r11 >= r6) goto L_0x015c
            r7 = r22
            java.lang.Object r8 = r7.get(r11)
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            java.util.Iterator r9 = r2.iterator()
        L_0x012f:
            boolean r10 = r9.hasNext()
            int r16 = r11 + 1
            if (r10 == 0) goto L_0x0157
            java.lang.Object r10 = r9.next()
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10
            java.lang.String r10 = r10.processName
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            java.lang.String r0 = r0.packageName
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0155
            r6 = r4
            r7 = r8
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbka.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x0155:
            r0 = 0
            goto L_0x012f
        L_0x0157:
            r22 = r7
            r11 = r16
            goto L_0x0121
        L_0x015c:
            r7 = r22
            if (r18 == 0) goto L_0x0173
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            r7 = r0
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbka.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x0173:
            r2 = r4
        L_0x0174:
            if (r23 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.zzebk r0 = r1.zze
            if (r0 == 0) goto L_0x0192
            if (r2 == 0) goto L_0x0192
            android.content.Context r0 = r5.getContext()
            android.net.Uri r4 = r2.getData()
            java.lang.String r4 = r4.toString()
            r5 = r21
            boolean r0 = r1.zzl(r5, r0, r4, r3)
            if (r0 != 0) goto L_0x0191
            goto L_0x0194
        L_0x0191:
            return
        L_0x0192:
            r5 = r21
        L_0x0194:
            r0 = r5
            com.google.android.gms.internal.ads.zzcgh r0 = (com.google.android.gms.internal.ads.zzcgh) r0     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            com.google.android.gms.ads.internal.overlay.zzc r4 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            com.google.android.gms.ads.internal.overlay.zzaa r5 = r1.zzg     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            r4.<init>(r2, r5)     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            r2 = r25
            r5 = r26
            r0.zzaJ(r4, r2, r5, r3)     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            return
        L_0x01a6:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkb.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z) {
        zzbsc zzbsc = this.zzd;
        if (zzbsc != null) {
            zzbsc.zza(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzit)).booleanValue() != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (r4 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r4 = r2.zzay;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzdrw r0 = r8.zzb
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.ads.zzebk r1 = r8.zze
            java.lang.String r2 = "offline_open"
            com.google.android.gms.internal.ads.zzebv.zzc(r10, r0, r1, r12, r2)
        L_0x000b:
            com.google.android.gms.internal.ads.zzbzm r0 = com.google.android.gms.ads.internal.zzv.zzp()
            boolean r0 = r0.zzA(r10)
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzebk r9 = r8.zze
            com.google.android.gms.ads.internal.util.client.zzu r10 = r8.zzc
            r9.zzh(r10, r12)
            return r1
        L_0x001e:
            r0 = r9
            com.google.android.gms.internal.ads.zzcex r0 = (com.google.android.gms.internal.ads.zzcex) r0
            com.google.android.gms.internal.ads.zzfbo r2 = r0.zzD()
            r3 = 1
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.ads.internal.util.client.zzw r4 = r2.zzay
            if (r4 == 0) goto L_0x0034
            boolean r4 = r4.zzc()
            if (r4 != 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.zzbtk r2 = r2.zzad
            if (r2 == 0) goto L_0x0049
            boolean r5 = r2.zza
            if (r5 == 0) goto L_0x0049
            java.lang.String r5 = r2.zzb
            if (r5 == 0) goto L_0x0049
            boolean r2 = r2.zzc
            if (r2 == 0) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r4 != 0) goto L_0x0143
            if (r2 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzit
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0062
            goto L_0x0143
        L_0x0062:
            com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.ads.internal.util.zzbr r2 = com.google.android.gms.ads.internal.util.zzs.zzA(r10)
            com.google.android.gms.ads.internal.zzv.zzq()
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r4 = r4.areNotificationsEnabled()
            java.lang.String r5 = "offline_notification_channel"
            com.google.android.gms.ads.internal.util.zzaa r6 = com.google.android.gms.ads.internal.zzv.zzr()
            boolean r5 = r6.zzi(r10, r5)
            com.google.android.gms.internal.ads.zzcgr r6 = r0.zzO()
            boolean r6 = r6.zzi()
            if (r6 == 0) goto L_0x0090
            android.app.Activity r6 = r0.zzi()
            if (r6 != 0) goto L_0x0090
            r6 = 1
            goto L_0x0091
        L_0x0090:
            r6 = 0
        L_0x0091:
            if (r4 != 0) goto L_0x00d1
            com.google.android.gms.ads.internal.zzv.zzq()
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r10)
            boolean r4 = r4.areNotificationsEnabled()
            if (r4 == 0) goto L_0x00a1
            goto L_0x00cb
        L_0x00a1:
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 >= r7) goto L_0x00b8
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzio
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r7.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x00c8
        L_0x00b8:
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzin
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r7.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
        L_0x00c8:
            if (r4 == 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            java.lang.String r9 = "notifications_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00d1:
            if (r5 == 0) goto L_0x00d9
            java.lang.String r9 = "notification_channel_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00d9:
            if (r2 != 0) goto L_0x00e1
            java.lang.String r9 = "work_manager_unavailable"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00e1:
            if (r6 == 0) goto L_0x00e9
            java.lang.String r9 = "ad_no_activity"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00e9:
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzil
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0101
            java.lang.String r9 = "notification_flow_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x0101:
            com.google.android.gms.ads.internal.overlay.zzm r2 = r0.zzL()
            if (r2 == 0) goto L_0x0137
            android.app.Activity r2 = r0.zzi()
            if (r2 == 0) goto L_0x0137
            com.google.android.gms.internal.ads.zzebw r2 = com.google.android.gms.internal.ads.zzebx.zze()
            android.app.Activity r4 = r0.zzi()
            r2.zza(r4)
            r4 = 0
            r2.zzb(r4)
            r2.zzc(r12)
            r2.zzd(r11)
            com.google.android.gms.internal.ads.zzebx r11 = r2.zze()
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()     // Catch:{ Exception -> 0x012e }
            r0.zzf(r11)     // Catch:{ Exception -> 0x012e }
            goto L_0x013f
        L_0x012e:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            r8.zzi(r10, r12, r9)
            return r1
        L_0x0137:
            r10 = r9
            com.google.android.gms.internal.ads.zzcgh r10 = (com.google.android.gms.internal.ads.zzcgh) r10
            r0 = 14
            r10.zzaK(r12, r11, r0)
        L_0x013f:
            r9.onAdClicked()
            return r3
        L_0x0143:
            com.google.android.gms.internal.ads.zzdrw r9 = r8.zzb
            if (r9 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.zzebk r11 = r8.zze
            java.lang.String r0 = "onfs"
            com.google.android.gms.internal.ads.zzebv.zzc(r10, r9, r11, r12, r0)
        L_0x014e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkb.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void zzm(int i) {
        zzdrw zzdrw;
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() && (zzdrw = this.zzb) != null) {
            zzdrv zza2 = zzdrw.zza();
            zza2.zzb("action", "cct_action");
            switch (i) {
                case 2:
                    str = "CONTEXT_NOT_AN_ACTIVITY";
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                case 9:
                    str = "WRONG_EXP_SETUP";
                    break;
                default:
                    str = "OPT_OUT";
                    break;
            }
            zza2.zzb("cct_open_status", str);
            zza2.zzg();
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ListenableFuture listenableFuture;
        zza zza2 = (zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcex zzcex = (zzcex) zza2;
        if (zzcex.zzD() != null) {
            hashMap = zzcex.zzD().zzaw;
        }
        String zzc2 = zzbyk.zzc(str, zzcex.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb2 = this.zza;
        if (zzb2 == null || zzb2.zzc()) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || this.zzf == null || !zzcmk.zzj(zzc2)) {
                listenableFuture = zzgch.zzh(zzc2);
            } else {
                listenableFuture = this.zzf.zzb(zzc2, zzbc.zze());
            }
            zzgch.zzr(listenableFuture, new zzbjx(this, map, zza2, str2), this.zzh);
            return;
        }
        zzb2.zzb(zzc2);
    }
}

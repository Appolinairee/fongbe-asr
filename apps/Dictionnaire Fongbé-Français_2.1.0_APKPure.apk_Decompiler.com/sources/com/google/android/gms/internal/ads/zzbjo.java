package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbjo {
    public static final zzbjp zzA = new zzbjc();
    public static final zzbjp zzB = new zzbje();
    public static final zzbjp zzC = new zzbjf();
    public static final zzbjp zza = new zzbim();
    public static final zzbjp zzb = new zzbio();
    public static final zzbjp zzc = new zzbir();
    public static final zzbjp zzd = new zzbjg();
    public static final zzbjp zze = new zzbjh();
    public static final zzbjp zzf = new zzbis();
    public static final zzbjp zzg = new zzbji();
    public static final zzbjp zzh = new zzbjj();
    public static final zzbjp zzi = new zzbip();
    public static final zzbjp zzj = new zzbjk();
    public static final zzbjp zzk = new zzbjl();
    public static final zzbjp zzl = new zzccs();
    public static final zzbjp zzm = new zzcct();
    public static final zzbjp zzn = new zzbii();
    public static final zzbkf zzo = new zzbkf();
    public static final zzbjp zzp = new zzbjm();
    public static final zzbjp zzq = new zzbjn();
    public static final zzbjp zzr = new zzbit();
    public static final zzbjp zzs = new zzbiu();
    public static final zzbjp zzt = new zzbiv();
    public static final zzbjp zzu = new zzbiw();
    public static final zzbjp zzv = new zzbix();
    public static final zzbjp zzw = new zzbiy();
    public static final zzbjp zzx = new zzbiz();
    public static final zzbjp zzy = new zzbja();
    public static final zzbjp zzz = new zzbjb();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcex r5, java.lang.String r6) {
        /*
            android.net.Uri r0 = android.net.Uri.parse(r6)
            com.google.android.gms.internal.ads.zzava r1 = r5.zzI()     // Catch:{ zzavb -> 0x0052 }
            com.google.android.gms.internal.ads.zzfcn r2 = r5.zzS()     // Catch:{ zzavb -> 0x0052 }
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzlR     // Catch:{ zzavb -> 0x0052 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzavb -> 0x0052 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ zzavb -> 0x0052 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzavb -> 0x0052 }
            boolean r3 = r3.booleanValue()     // Catch:{ zzavb -> 0x0052 }
            if (r3 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x005b
            boolean r1 = r1.zzf(r0)     // Catch:{ zzavb -> 0x0052 }
            if (r1 == 0) goto L_0x005b
            android.content.Context r1 = r5.getContext()     // Catch:{ zzavb -> 0x0052 }
            android.view.View r3 = r5.zzF()     // Catch:{ zzavb -> 0x0052 }
            android.app.Activity r4 = r5.zzi()     // Catch:{ zzavb -> 0x0052 }
            android.net.Uri r0 = r2.zza(r0, r1, r3, r4)     // Catch:{ zzavb -> 0x0052 }
            goto L_0x005b
        L_0x0039:
            if (r1 == 0) goto L_0x005b
            boolean r2 = r1.zzf(r0)     // Catch:{ zzavb -> 0x0052 }
            if (r2 == 0) goto L_0x005b
            android.content.Context r2 = r5.getContext()     // Catch:{ zzavb -> 0x0052 }
            android.view.View r3 = r5.zzF()     // Catch:{ zzavb -> 0x0052 }
            android.app.Activity r4 = r5.zzi()     // Catch:{ zzavb -> 0x0052 }
            android.net.Uri r0 = r1.zza(r0, r2, r3, r4)     // Catch:{ zzavb -> 0x0052 }
            goto L_0x005b
        L_0x0052:
            java.lang.String r1 = "Unable to append parameter to URL: "
            java.lang.String r6 = r1.concat(r6)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)
        L_0x005b:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.google.android.gms.internal.ads.zzfbo r1 = r5.zzD()
            if (r1 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzfbo r6 = r5.zzD()
            java.util.Map r6 = r6.zzaw
        L_0x006c:
            android.content.Context r1 = r5.getContext()
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyk.zzb(r0, r1, r6)
            com.google.android.gms.internal.ads.zzbdv r0 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c1
            r2 = 244410203(0xe91675b, double:1.20754685E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00c1
            com.google.common.util.concurrent.ListenableFuture r5 = r5.zzT()
            com.google.android.gms.internal.ads.zzgby r5 = com.google.android.gms.internal.ads.zzgby.zzu(r5)
            com.google.android.gms.internal.ads.zzbij r0 = new com.google.android.gms.internal.ads.zzbij
            r0.<init>()
            com.google.android.gms.internal.ads.zzgcs r1 = com.google.android.gms.internal.ads.zzbzw.zzg
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgch.zze(r5, r2, r0, r1)
            com.google.android.gms.internal.ads.zzgby r5 = (com.google.android.gms.internal.ads.zzgby) r5
            com.google.android.gms.internal.ads.zzbik r0 = new com.google.android.gms.internal.ads.zzbik
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzgcs r1 = com.google.android.gms.internal.ads.zzbzw.zzg
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgch.zzm(r5, r0, r1)
            com.google.android.gms.internal.ads.zzgby r5 = (com.google.android.gms.internal.ads.zzgby) r5
            com.google.android.gms.internal.ads.zzbil r0 = new com.google.android.gms.internal.ads.zzbil
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzgcs r6 = com.google.android.gms.internal.ads.zzbzw.zzg
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgch.zze(r5, r1, r0, r6)
            com.google.android.gms.internal.ads.zzgby r5 = (com.google.android.gms.internal.ads.zzgby) r5
            return r5
        L_0x00c1:
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgch.zzh(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjo.zza(com.google.android.gms.internal.ads.zzcex, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcge r16, java.util.Map r17) {
        /*
            java.lang.String r1 = "openableIntents"
            android.content.Context r0 = r16.getContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r0 = "data"
            r3 = r17
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0107 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = "intents"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0026:
            int r0 = r3.length()
            if (r6 >= r0) goto L_0x00f2
            org.json.JSONObject r0 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r0.optString(r7)
            java.lang.String r8 = "u"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r9 = "i"
            java.lang.String r9 = r0.optString(r9)
            java.lang.String r10 = "m"
            java.lang.String r10 = r0.optString(r10)
            java.lang.String r11 = "p"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r12 = "c"
            java.lang.String r12 = r0.optString(r12)
            java.lang.String r13 = "intent_url"
            java.lang.String r13 = r0.optString(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r14 = 0
            if (r0 != 0) goto L_0x0075
            android.content.Intent r0 = android.content.Intent.parseUri(r13, r5)     // Catch:{ URISyntaxException -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r13 = "Error parsing the url: "
            java.lang.String r0 = r13.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r15)
        L_0x0075:
            r0 = r14
        L_0x0076:
            r13 = 1
            if (r0 != 0) goto L_0x00c2
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x008b
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.setData(r8)
        L_0x008b:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L_0x0094
            r0.setAction(r9)
        L_0x0094:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x009d
            r0.setType(r10)
        L_0x009d:
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L_0x00a6
            r0.setPackage(r11)
        L_0x00a6:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L_0x00c2
            java.lang.String r8 = "/"
            r9 = 2
            java.lang.String[] r8 = r12.split(r8, r9)
            int r10 = r8.length
            if (r10 != r9) goto L_0x00c2
            android.content.ComponentName r9 = new android.content.ComponentName
            r10 = r8[r5]
            r8 = r8[r13]
            r9.<init>(r10, r8)
            r0.setComponent(r9)
        L_0x00c2:
            r8 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r14 = r2.resolveActivity(r8, r0)     // Catch:{ NullPointerException -> 0x00ca }
            goto L_0x00d7
        L_0x00ca:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.internal.ads.zzbzm r0 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r8 = r8.toString()
            r0.zzw(r9, r8)
        L_0x00d7:
            if (r14 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            r4.put(r7, r13)     // Catch:{ JSONException -> 0x00df }
            goto L_0x00ee
        L_0x00df:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error constructing openable urls response."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r7)
            goto L_0x00ee
        L_0x00e7:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error parsing the intent data."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r7)
        L_0x00ee:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x00f2:
            r0 = r16
            com.google.android.gms.internal.ads.zzbmk r0 = (com.google.android.gms.internal.ads.zzbmk) r0
            r0.zze(r1, r4)
            return
        L_0x00fa:
            r0 = r16
            com.google.android.gms.internal.ads.zzbmk r0 = (com.google.android.gms.internal.ads.zzbmk) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.zze(r1, r2)
            return
        L_0x0107:
            r0 = r16
            com.google.android.gms.internal.ads.zzbmk r0 = (com.google.android.gms.internal.ads.zzbmk) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.zze(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjo.zzb(com.google.android.gms.internal.ads.zzcge, java.util.Map):void");
    }

    public static void zzc(Map map, zzdds zzdds) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkD)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdds != null) {
            zzdds.zzdd();
        }
    }
}

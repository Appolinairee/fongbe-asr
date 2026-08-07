package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzta {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzsg zza() throws zzsu {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzsg) zzd.get(0);
    }

    public static String zzb(zzab zzab) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzab.zzo)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzab.zzo) && (zza2 = zzcy.zza(zzab)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if (!"video/mv-hevc".equals(zzab.zzo)) {
            return null;
        }
        return "video/hevc";
    }

    public static List zzc(zzsp zzsp, zzab zzab, boolean z, boolean z2) throws zzsu {
        String zzb2 = zzb(zzab);
        if (zzb2 == null) {
            return zzfxn.zzn();
        }
        return zzsp.zza(zzb2, z, z2);
    }

    public static synchronized List zzd(String str, boolean z, boolean z2) throws zzsu {
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (zzta.class) {
            zzst zzst = new zzst(str2, z3, z4);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zzst);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zzst, new zzsx(z3, z4));
            if (z3 && zzg.isEmpty() && zzei.zza <= 23) {
                zzg = zzg(zzst, new zzsw((zzsz) null));
                if (!zzg.isEmpty()) {
                    String str3 = ((zzsg) zzg.get(0)).zza;
                    zzdo.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str2 + ". Assuming: " + str3);
                }
            }
            if ("audio/raw".equals(str2)) {
                if (zzei.zza < 26 && zzei.zzb.equals("R9") && zzg.size() == 1 && ((zzsg) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzsg.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                zzh(zzg, new zzsr());
            }
            if (zzei.zza < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsg) zzg.get(0)).zza)) {
                zzg.add((zzsg) zzg.remove(0));
            }
            zzfxn zzl = zzfxn.zzl(zzg);
            hashMap.put(zzst, zzl);
            return zzl;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zze(zzsp zzsp, zzab zzab, boolean z, boolean z2) throws zzsu {
        List zza2 = zzsp.zza(zzab.zzo, z, z2);
        List zzc = zzc(zzsp, zzab, z, z2);
        zzfxk zzfxk = new zzfxk();
        zzfxk.zzh(zza2);
        zzfxk.zzh(zzc);
        return zzfxk.zzi();
    }

    public static List zzf(List list, zzab zzab) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzss(zzab));
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cd, code lost:
        if (r2 != r8) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d3, code lost:
        if (r1.zzb == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d5, code lost:
        r22 = r12;
        r18 = r13;
        r20 = r14;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r6.add(com.google.android.gms.internal.ads.zzsg.zzc(r12, r15, r5, r10, r11, r21, r0, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0047;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0241 A[SYNTHETIC, Splitter:B:149:0x0241] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0261 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zzst r23, com.google.android.gms.internal.ads.zzsv r24) throws com.google.android.gms.internal.ads.zzsu {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x028f }
            r6.<init>()     // Catch:{ Exception -> 0x028f }
            java.lang.String r15 = r1.zza     // Catch:{ Exception -> 0x028f }
            int r14 = r24.zza()     // Catch:{ Exception -> 0x028f }
            boolean r16 = r24.zze()     // Catch:{ Exception -> 0x028f }
            r17 = 0
            r13 = 0
        L_0x001a:
            if (r13 >= r14) goto L_0x028e
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch:{ Exception -> 0x028f }
            int r7 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x028f }
            r8 = 29
            if (r7 < r8) goto L_0x0033
            boolean r7 = r0.isAlias()     // Catch:{ Exception -> 0x028f }
            if (r7 == 0) goto L_0x0033
        L_0x002c:
            r18 = r13
            r20 = r14
            r2 = r15
            goto L_0x0283
        L_0x0033:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x028f }
            boolean r7 = r0.isEncoder()     // Catch:{ Exception -> 0x028f }
            if (r7 != 0) goto L_0x002c
            java.lang.String r7 = ".secure"
            if (r16 != 0) goto L_0x0047
            boolean r9 = r12.endsWith(r7)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
        L_0x0047:
            int r9 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x028f }
            r10 = 24
            if (r9 >= r10) goto L_0x00b7
            java.lang.String r9 = "OMX.SEC.aac.dec"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x005d
            java.lang.String r9 = "OMX.Exynos.AAC.Decoder"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r9 == 0) goto L_0x00b7
        L_0x005d:
            java.lang.String r9 = "samsung"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzc     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 == 0) goto L_0x00b7
            java.lang.String r9 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            java.lang.String r10 = "zeroflte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            java.lang.String r10 = "zerolte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            java.lang.String r10 = "zenlte"
            boolean r9 = r9.startsWith(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = "SC-05G"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = "marinelteatt"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = "404SC"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = "SC-04G"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = "SCV31"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x028f }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
        L_0x00b7:
            int r9 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x028f }
            r11 = 23
            if (r9 > r11) goto L_0x00cd
            java.lang.String r9 = "audio/eac3-joc"
            boolean r9 = r9.equals(r15)     // Catch:{ Exception -> 0x028f }
            if (r9 == 0) goto L_0x00cd
            java.lang.String r9 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r9 = r9.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r9 != 0) goto L_0x002c
        L_0x00cd:
            java.lang.String[] r9 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x028f }
            int r10 = r9.length     // Catch:{ Exception -> 0x028f }
            r11 = 0
        L_0x00d3:
            if (r11 >= r10) goto L_0x00e2
            r5 = r9[r11]     // Catch:{ Exception -> 0x028f }
            boolean r19 = r5.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x028f }
            if (r19 == 0) goto L_0x00df
            goto L_0x0155
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e2:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0108
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "video/hevcdv"
            goto L_0x0155
        L_0x00f5:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 != 0) goto L_0x0105
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x011b
        L_0x0105:
            java.lang.String r5 = "video/dv_hevc"
            goto L_0x0155
        L_0x0108:
            java.lang.String r5 = "video/mv-hevc"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x011d
            java.lang.String r5 = "c2.qti.mvhevc.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = "video/x-mvhevc"
            goto L_0x0155
        L_0x011b:
            r5 = 0
            goto L_0x0155
        L_0x011d:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0130
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0130
            java.lang.String r5 = "audio/x-lg-alac"
            goto L_0x0155
        L_0x0130:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0143
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0143
            java.lang.String r5 = "audio/x-lg-flac"
            goto L_0x0155
        L_0x0143:
            java.lang.String r5 = "audio/ac3"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = "OMX.lge.ac3.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = "audio/lg-ac3"
        L_0x0155:
            if (r5 == 0) goto L_0x002c
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r5)     // Catch:{ Exception -> 0x0232 }
            boolean r9 = r2.zzd(r4, r5, r10)     // Catch:{ Exception -> 0x0232 }
            boolean r11 = r2.zzc(r4, r5, r10)     // Catch:{ Exception -> 0x0232 }
            boolean r8 = r1.zzc     // Catch:{ Exception -> 0x0232 }
            if (r8 != 0) goto L_0x016a
            if (r11 != 0) goto L_0x002c
            goto L_0x016e
        L_0x016a:
            if (r9 != 0) goto L_0x016e
            goto L_0x002c
        L_0x016e:
            boolean r8 = r2.zzd(r3, r5, r10)     // Catch:{ Exception -> 0x0232 }
            boolean r9 = r2.zzc(r3, r5, r10)     // Catch:{ Exception -> 0x0232 }
            boolean r11 = r1.zzb     // Catch:{ Exception -> 0x0232 }
            r20 = 1
            if (r11 != 0) goto L_0x017f
            if (r9 != 0) goto L_0x002c
            goto L_0x0182
        L_0x017f:
            if (r8 == 0) goto L_0x002c
            r8 = 1
        L_0x0182:
            int r9 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0232 }
            r11 = 29
            if (r9 < r11) goto L_0x018e
            boolean r9 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0232 }
            r11 = r9
            goto L_0x0197
        L_0x018e:
            boolean r9 = zzi(r0, r15)     // Catch:{ Exception -> 0x0232 }
            if (r9 != 0) goto L_0x0196
            r11 = 1
            goto L_0x0197
        L_0x0196:
            r11 = 0
        L_0x0197:
            boolean r21 = zzi(r0, r15)     // Catch:{ Exception -> 0x0232 }
            int r9 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0232 }
            r2 = 29
            if (r9 < r2) goto L_0x01a6
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0232 }
            goto L_0x01c9
        L_0x01a6:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzftt.zza(r0)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0232 }
            if (r2 != 0) goto L_0x01c8
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0232 }
            if (r2 != 0) goto L_0x01c8
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0232 }
            if (r0 != 0) goto L_0x01c8
            r0 = 1
            goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            if (r16 == 0) goto L_0x01cf
            boolean r2 = r1.zzb     // Catch:{ Exception -> 0x0232 }
            if (r2 == r8) goto L_0x01d5
        L_0x01cf:
            if (r16 != 0) goto L_0x01fe
            boolean r2 = r1.zzb     // Catch:{ Exception -> 0x01f3 }
            if (r2 != 0) goto L_0x01fe
        L_0x01d5:
            r2 = 0
            r19 = 0
            r7 = r12
            r8 = r15
            r9 = r5
            r22 = r12
            r12 = r21
            r18 = r13
            r13 = r0
            r20 = r14
            r14 = r2
            r2 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzsg r0 = com.google.android.gms.internal.ads.zzsg.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01f1 }
            r6.add(r0)     // Catch:{ Exception -> 0x01f1 }
            goto L_0x0283
        L_0x01f1:
            r0 = move-exception
            goto L_0x01fb
        L_0x01f3:
            r0 = move-exception
            r22 = r12
            r18 = r13
            r20 = r14
            r2 = r15
        L_0x01fb:
            r1 = r22
            goto L_0x0239
        L_0x01fe:
            r22 = r12
            r18 = r13
            r20 = r14
            r2 = r15
            if (r16 != 0) goto L_0x0283
            if (r8 == 0) goto L_0x0283
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f1 }
            r8.<init>()     // Catch:{ Exception -> 0x01f1 }
            r15 = r22
            r8.append(r15)     // Catch:{ Exception -> 0x022f }
            r8.append(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x022f }
            r14 = 0
            r19 = 1
            r8 = r2
            r9 = r5
            r12 = r21
            r13 = r0
            r1 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzsg r0 = com.google.android.gms.internal.ads.zzsg.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x022d }
            r6.add(r0)     // Catch:{ Exception -> 0x022d }
            goto L_0x028e
        L_0x022d:
            r0 = move-exception
            goto L_0x0239
        L_0x022f:
            r0 = move-exception
            r1 = r15
            goto L_0x0239
        L_0x0232:
            r0 = move-exception
            r1 = r12
            r18 = r13
            r20 = r14
            r2 = r15
        L_0x0239:
            int r7 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x028f }
            java.lang.String r8 = "MediaCodecUtil"
            r9 = 23
            if (r7 > r9) goto L_0x0261
            boolean r7 = r6.isEmpty()     // Catch:{ Exception -> 0x028f }
            if (r7 != 0) goto L_0x0261
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028f }
            r0.<init>()     // Catch:{ Exception -> 0x028f }
            java.lang.String r5 = "Skipping codec "
            r0.append(r5)     // Catch:{ Exception -> 0x028f }
            r0.append(r1)     // Catch:{ Exception -> 0x028f }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x028f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x028f }
            com.google.android.gms.internal.ads.zzdo.zzc(r8, r0)     // Catch:{ Exception -> 0x028f }
            goto L_0x0283
        L_0x0261:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028f }
            r2.<init>()     // Catch:{ Exception -> 0x028f }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x028f }
            r2.append(r1)     // Catch:{ Exception -> 0x028f }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x028f }
            r2.append(r5)     // Catch:{ Exception -> 0x028f }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x028f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x028f }
            com.google.android.gms.internal.ads.zzdo.zzc(r8, r1)     // Catch:{ Exception -> 0x028f }
            throw r0     // Catch:{ Exception -> 0x028f }
        L_0x0283:
            int r13 = r18 + 1
            r1 = r23
            r15 = r2
            r14 = r20
            r2 = r24
            goto L_0x001a
        L_0x028e:
            return r6
        L_0x028f:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzsu r1 = new com.google.android.gms.internal.ads.zzsu
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzta.zzg(com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zzsv):java.util.ArrayList");
    }

    private static void zzh(List list, zzsy zzsy) {
        Collections.sort(list, new zzsq(zzsy));
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzei.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbb.zzg(str)) {
            return true;
        }
        String zza2 = zzftt.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (zza2.startsWith("omx.") || zza2.startsWith("c2.")) {
            return false;
        }
        return true;
    }
}

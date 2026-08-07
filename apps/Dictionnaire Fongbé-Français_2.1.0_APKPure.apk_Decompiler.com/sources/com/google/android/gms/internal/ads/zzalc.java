package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzalc {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzali zzf;
    public final String zzg;
    public final String zzh;
    public final zzalc zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzalc zzb(String str, long j, long j2, zzali zzali, String[] strArr, String str2, String str3, zzalc zzalc) {
        return new zzalc(str, (String) null, j, j2, zzali, strArr, str2, str3, zzalc);
    }

    public static zzalc zzc(String str) {
        return new zzalc((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (zzali) null, (String[]) null, "", (String) null, (zzalc) null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcm zzcm = new zzcm();
            zzcm.zzl(new SpannableStringBuilder());
            map.put(str, zzcm);
        }
        CharSequence zzq = ((zzcm) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalc zzalc = (zzalc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzalc.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (!zzg(j) || !"div".equals(this.zza) || (str2 = this.zzh) == null) {
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzk(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzalc zzalc;
        zzali zza2;
        int i;
        Map map4 = map;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcm zzcm = (zzcm) map3.get(str3);
                    zzcm.getClass();
                    zzcm zzcm2 = zzcm;
                    zzalg zzalg = (zzalg) map2.get(str2);
                    zzalg.getClass();
                    zzalg zzalg2 = zzalg;
                    int i2 = zzalg.zzj;
                    zzali zza3 = zzalh.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcm.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcm.zzl(spannableStringBuilder);
                    }
                    if (zza3 != null) {
                        zzalc zzalc2 = this.zzi;
                        if (zza3.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza3.zzh()), intValue, intValue2, 33);
                        }
                        if (zza3.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza3.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza3.zzH()) {
                            zzct.zzb(spannableStringBuilder, new ForegroundColorSpan(zza3.zzd()), intValue, intValue2, 33);
                        }
                        if (zza3.zzG()) {
                            zzct.zzb(spannableStringBuilder, new BackgroundColorSpan(zza3.zzc()), intValue, intValue2, 33);
                        }
                        if (zza3.zzD() != null) {
                            zzct.zzb(spannableStringBuilder, new TypefaceSpan(zza3.zzD()), intValue, intValue2, 33);
                        }
                        if (zza3.zzk() != null) {
                            zzalb zzk2 = zza3.zzk();
                            zzk2.getClass();
                            zzalb zzalb = zzk2;
                            int i3 = zzk2.zza;
                            it = it2;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzk2.zzb;
                            }
                            int i4 = zzk2.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzct.zzb(spannableStringBuilder, new zzcu(i3, i, i4), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzg2 = zza3.zzg();
                        if (zzg2 == 2) {
                            while (true) {
                                if (zzalc2 != null) {
                                    zzali zza4 = zzalh.zza(zzalc2.zzf, zzalc2.zzj, map4);
                                    if (zza4 != null && zza4.zzg() == 1) {
                                        break;
                                    }
                                    zzalc2 = zzalc2.zzi;
                                } else {
                                    zzalc2 = null;
                                    break;
                                }
                            }
                            if (zzalc2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalc2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalc = null;
                                        break;
                                    }
                                    zzalc zzalc3 = (zzalc) arrayDeque.pop();
                                    zzali zza5 = zzalh.zza(zzalc3.zzf, zzalc3.zzj, map4);
                                    if (zza5 != null && zza5.zzg() == 3) {
                                        zzalc = zzalc3;
                                        break;
                                    }
                                    for (int zza6 = zzalc3.zza() - 1; zza6 >= 0; zza6--) {
                                        arrayDeque.push(zzalc3.zzd(zza6));
                                    }
                                }
                                if (zzalc != null) {
                                    if (zzalc.zza() != 1 || zzalc.zzd(0).zzb == null) {
                                        zzdo.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzalc.zzd(0).zzb;
                                        int i5 = zzei.zza;
                                        String str5 = str4;
                                        zzali zza7 = zzalh.zza(zzalc.zzf, zzalc.zzj, map4);
                                        int zzf2 = zza7 != null ? zza7.zzf() : -1;
                                        if (zzf2 == -1 && (zza2 = zzalh.zza(zzalc2.zzf, zzalc2.zzj, map4)) != null) {
                                            zzf2 = zza2.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcs(str4, zzf2), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzg2 == 3 || zzg2 == 4) {
                            spannableStringBuilder.setSpan(new zzala(), intValue, intValue2, 33);
                        }
                        if (zza3.zzF()) {
                            zzct.zzb(spannableStringBuilder, new zzcr(), intValue, intValue2, 33);
                        }
                        int zze2 = zza3.zze();
                        if (zze2 == 1) {
                            zzct.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza3.zza(), true), intValue, intValue2, 33);
                        } else if (zze2 == 2) {
                            zzct.zzb(spannableStringBuilder, new RelativeSizeSpan(zza3.zza()), intValue, intValue2, 33);
                        } else if (zze2 == 3) {
                            zzct.zza(spannableStringBuilder, zza3.zza() / 100.0f, intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza3.zzb() != Float.MAX_VALUE) {
                                zzcm.zzj((zza3.zzb() * -90.0f) / 100.0f);
                            }
                            if (zza3.zzj() != null) {
                                zzcm.zzm(zza3.zzj());
                            }
                            if (zza3.zzi() != null) {
                                zzcm.zzg(zza3.zzi());
                            }
                        }
                        it2 = it;
                    }
                } else {
                    Map map5 = map2;
                    Map map6 = map3;
                }
            }
            Map map7 = map2;
            Map map8 = map3;
            for (int i6 = 0; i6 < zza(); i6++) {
                zzd(i6).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if (!"metadata".equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z) {
                SpannableStringBuilder zzi2 = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi2.append(str2);
            } else if ("br".equals(this.zza) && z) {
                zzi(str, map).append(10);
            } else if (zzg(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence zzq = ((zzcm) entry.getValue()).zzq();
                    zzq.getClass();
                    CharSequence charSequence = zzq;
                    this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
                }
                boolean equals = "p".equals(this.zza);
                for (int i = 0; i < zza(); i++) {
                    zzd(i).zzm(j, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder zzi3 = zzi(str, map);
                    int length = zzi3.length();
                    do {
                        length--;
                        if (length < 0 || zzi3.charAt(length) != ' ') {
                            if (length >= 0 && zzi3.charAt(length) != 10) {
                                zzi3.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (zzi3.charAt(length) != ' ');
                    zzi3.append(10);
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence zzq2 = ((zzcm) entry2.getValue()).zzq();
                    zzq2.getClass();
                    CharSequence charSequence2 = zzq2;
                    this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalc zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalc) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        zzm(j2, false, this.zzg, treeMap);
        zzl(j2, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalg zzalg = (zzalg) map2.get(pair.first);
                zzalg.getClass();
                zzalg zzalg2 = zzalg;
                zzcm zzcm = new zzcm();
                zzcm.zzc(decodeByteArray);
                zzcm.zzh(zzalg.zzb);
                zzcm.zzi(0);
                zzcm.zze(zzalg.zzc, 0);
                zzcm.zzf(zzalg.zze);
                zzcm.zzk(zzalg.zzf);
                zzcm.zzd(zzalg.zzg);
                zzcm.zzo(zzalg.zzj);
                arrayList2.add(zzcm.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalg zzalg3 = (zzalg) map2.get(entry.getKey());
            zzalg3.getClass();
            zzalg zzalg4 = zzalg3;
            zzcm zzcm2 = (zzcm) entry.getValue();
            CharSequence zzq = zzcm2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzala zzala : (zzala[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzala.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzala), spannableStringBuilder.getSpanEnd(zzala), "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == 10 && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == 10) {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcm2.zze(zzalg3.zzc, zzalg3.zzd);
            zzcm2.zzf(zzalg3.zze);
            zzcm2.zzh(zzalg3.zzb);
            zzcm2.zzk(zzalg3.zzf);
            zzcm2.zzn(zzalg3.zzi, zzalg3.zzh);
            zzcm2.zzo(zzalg3.zzj);
            arrayList2.add(zzcm2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalc zzalc) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalc);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i <= 0 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return i <= 0 && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzalc(String str, String str2, long j, long j2, zzali zzali, String[] strArr, String str3, String str4, zzalc zzalc) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzali;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        String str5 = str3;
        this.zzg = str3;
        this.zzi = zzalc;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}

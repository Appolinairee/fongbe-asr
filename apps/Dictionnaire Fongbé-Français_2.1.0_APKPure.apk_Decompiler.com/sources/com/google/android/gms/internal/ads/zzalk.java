package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzalk implements zzakf {
    private final zzdy zza = new zzdy();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalk(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzei.zzC(bArr, 43, bArr.length + -43)) ? "serif" : str;
            int i = bArr[25] * Ascii.DC4;
            this.zzg = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.zzb = z;
            if (z) {
                this.zzf = Math.max(0.0f, Math.min(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.95f));
            } else {
                this.zzf = 0.85f;
            }
        } else {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = str;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(android.text.SpannableStringBuilder r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            if (r5 == r6) goto L_0x0047
            r6 = r9 | 33
            r9 = r5 & 1
            r0 = r5 & 2
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0018
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 3
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002e
        L_0x0018:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002d
        L_0x0021:
            if (r0 == 0) goto L_0x002d
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 2
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r5 = r5 & 4
            if (r5 != 0) goto L_0x003f
            if (r9 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r1)
            r4.setSpan(r5, r7, r8, r6)
            return
        L_0x003f:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r4.setSpan(r5, r7, r8, r6)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalk.zzc(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        String str;
        int i3;
        int i4;
        int i5 = i;
        zzdb zzdb2 = zzdb;
        this.zza.zzJ(bArr, i5 + i2);
        this.zza.zzL(i5);
        zzdy zzdy = this.zza;
        int i6 = 1;
        int i7 = 2;
        zzcw.zzd(zzdy.zzb() >= 2);
        int zzq = zzdy.zzq();
        if (zzq == 0) {
            str = "";
        } else {
            int zzd2 = zzdy.zzd();
            Charset zzC = zzdy.zzC();
            int zzd3 = zzdy.zzd() - zzd2;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            str = zzdy.zzB(zzq - zzd3, zzC);
        }
        if (str.isEmpty()) {
            zzdb2.zza(new zzajx(zzfxn.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        zzc(spannableStringBuilder2, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder2, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.zze;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.zzf;
        while (true) {
            zzdy zzdy2 = this.zza;
            if (zzdy2.zzb() >= 8) {
                int zzd4 = zzdy2.zzd();
                int zzg2 = zzdy2.zzg();
                int zzg3 = this.zza.zzg();
                if (zzg3 == 1937013100) {
                    zzcw.zzd(this.zza.zzb() >= i7);
                    int zzq2 = this.zza.zzq();
                    int i8 = 0;
                    while (i8 < zzq2) {
                        zzdy zzdy3 = this.zza;
                        zzcw.zzd(zzdy3.zzb() >= 12);
                        int zzq3 = zzdy3.zzq();
                        int zzq4 = zzdy3.zzq();
                        zzdy3.zzM(i7);
                        int zzm = zzdy3.zzm();
                        zzdy3.zzM(i6);
                        int zzg4 = zzdy3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            int length2 = spannableStringBuilder.length();
                            i3 = zzq2;
                            zzdo.zzf("Tx3gParser", "Truncating styl end (" + zzq4 + ") to cueText.length() (" + length2 + ").");
                            i4 = spannableStringBuilder.length();
                        } else {
                            i3 = zzq2;
                            i4 = zzq4;
                        }
                        if (zzq3 >= i4) {
                            zzdo.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i4 + ").");
                        } else {
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                            int i9 = zzq3;
                            int i10 = i4;
                            zzc(spannableStringBuilder3, zzm, this.zzc, i9, i10, 0);
                            zzb(spannableStringBuilder3, zzg4, this.zzd, i9, i10, 0);
                        }
                        i8++;
                        zzq2 = i3;
                        i6 = 1;
                        i7 = 2;
                    }
                } else if (zzg3 == 1952608120 && this.zzb) {
                    zzcw.zzd(this.zza.zzb() >= 2);
                    f = Math.max(0.0f, Math.min(((float) this.zza.zzq()) / ((float) this.zzg), 0.95f));
                    this.zza.zzL(zzd4 + zzg2);
                    i6 = 1;
                    i7 = 2;
                }
                this.zza.zzL(zzd4 + zzg2);
                i6 = 1;
                i7 = 2;
            } else {
                zzcm zzcm = new zzcm();
                zzcm.zzl(spannableStringBuilder);
                zzcm.zze(f, 0);
                zzcm.zzf(0);
                zzdb2.zza(new zzajx(zzfxn.zzo(zzcm.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzakr implements zzakf {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf = new Canvas();
    private final zzakk zzg = new zzakk(719, 575, 0, 719, 0, 575);
    private final zzakj zzh = new zzakj(0, zzg(), zzh(), zzi());
    private final zzakq zzi;
    private Bitmap zzj;

    public zzakr(List list) {
        zzdy zzdy = new zzdy((byte[]) list.get(0));
        int zzq = zzdy.zzq();
        int zzq2 = zzdy.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.zzi = new zzakq(zzq, zzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzakj zzc(zzdx zzdx, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        zzdx zzdx2 = zzdx;
        int i6 = 8;
        int zzd2 = zzdx2.zzd(8);
        zzdx2.zzn(8);
        int[] zzg2 = zzg();
        int[] zzh2 = zzh();
        int[] zzi2 = zzi();
        int i7 = i - 2;
        while (i7 > 0) {
            int zzd3 = zzdx2.zzd(i6);
            int zzd4 = zzdx2.zzd(i6);
            int[] iArr = (zzd4 & 128) != 0 ? zzg2 : (zzd4 & 64) != 0 ? zzh2 : zzi2;
            if ((zzd4 & 1) != 0) {
                i5 = zzdx2.zzd(i6);
                i4 = zzdx2.zzd(i6);
                i3 = zzdx2.zzd(i6);
                i2 = zzdx2.zzd(i6);
                i7 -= 6;
            } else {
                int zzd5 = zzdx2.zzd(2) << 6;
                i7 -= 4;
                i3 = zzdx2.zzd(4) << 4;
                i2 = zzd5;
                i5 = zzdx2.zzd(6) << 2;
                i4 = zzdx2.zzd(4) << 4;
            }
            if (i5 == 0) {
                i2 = 255;
            }
            if (i5 == 0) {
                i3 = 0;
            }
            if (i5 == 0) {
                i4 = 0;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr[zzd3] = zzb((byte) (255 - (i2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzd2 = zzd2;
            i6 = 8;
        }
        return new zzakj(zzd2, zzg2, zzh2, zzi2);
    }

    private static zzakl zzd(zzdx zzdx) {
        int zzd2 = zzdx.zzd(16);
        zzdx.zzn(4);
        int zzd3 = zzdx.zzd(2);
        boolean zzp = zzdx.zzp();
        zzdx.zzn(1);
        byte[] bArr = zzei.zzf;
        byte[] bArr2 = zzei.zzf;
        if (zzd3 == 1) {
            zzdx.zzn(zzdx.zzd(8) * 16);
        } else if (zzd3 == 0) {
            int zzd4 = zzdx.zzd(16);
            int zzd5 = zzdx.zzd(16);
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzdx.zzi(bArr, 0, zzd4);
            }
            if (zzd5 > 0) {
                bArr2 = new byte[zzd5];
                zzdx.zzi(bArr2, 0, zzd5);
            } else {
                bArr2 = bArr;
            }
        }
        return new zzakl(zzd2, zzp, bArr, bArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v16, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0224 A[LOOP:3: B:85:0x016c->B:115:0x0224, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0142 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0148 A[LOOP:2: B:37:0x00ac->B:72:0x0148, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            r0 = r24
            r1 = r26
            r8 = r29
            com.google.android.gms.internal.ads.zzdx r9 = new com.google.android.gms.internal.ads.zzdx
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r27
            r10 = r28
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.zza()
            if (r3 == 0) goto L_0x022f
            r14 = 8
            int r3 = r9.zzd(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0229
            r15 = 3
            r7 = 4
            r6 = 1
            r5 = 2
            r16 = 0
            switch(r3) {
                case 16: goto L_0x0150;
                case 17: goto L_0x009b;
                case 18: goto L_0x0041;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0037;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0013
        L_0x0030:
            r3 = 16
            byte[] r12 = zzf(r3, r14, r9)
            goto L_0x0013
        L_0x0037:
            byte[] r11 = zzf(r7, r14, r9)
            goto L_0x0013
        L_0x003c:
            byte[] r13 = zzf(r7, r7, r9)
            goto L_0x0013
        L_0x0041:
            r15 = r2
            r2 = 0
        L_0x0043:
            int r3 = r9.zzd(r14)
            if (r3 == 0) goto L_0x004e
            r17 = r2
            r18 = 1
            goto L_0x0074
        L_0x004e:
            boolean r3 = r9.zzp()
            r4 = 7
            if (r3 != 0) goto L_0x0067
            int r3 = r9.zzd(r4)
            if (r3 == 0) goto L_0x0061
            r17 = r2
            r18 = r3
            r3 = 0
            goto L_0x0074
        L_0x0061:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L_0x0074
        L_0x0067:
            int r3 = r9.zzd(r4)
            int r4 = r9.zzd(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0074:
            if (r18 == 0) goto L_0x008f
            if (r8 == 0) goto L_0x008f
            int r2 = r10 + 1
            float r4 = (float) r10
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r15
            int r5 = r15 + r18
            float r5 = (float) r5
            float r7 = (float) r2
            r2 = r30
            r0 = 1
            r6 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0090
        L_0x008f:
            r0 = 1
        L_0x0090:
            int r15 = r15 + r18
            if (r17 != 0) goto L_0x0098
            r2 = r17
            r6 = 1
            goto L_0x0043
        L_0x0098:
            r2 = r15
            goto L_0x0013
        L_0x009b:
            r0 = 1
            if (r1 != r15) goto L_0x00a8
            if (r12 != 0) goto L_0x00a5
            byte[] r3 = zzc
            r17 = r3
            goto L_0x00aa
        L_0x00a5:
            r17 = r12
            goto L_0x00aa
        L_0x00a8:
            r17 = 0
        L_0x00aa:
            r6 = r2
            r2 = 0
        L_0x00ac:
            int r3 = r9.zzd(r7)
            if (r3 == 0) goto L_0x00b8
            r18 = r2
        L_0x00b4:
            r19 = 1
            goto L_0x0117
        L_0x00b8:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto L_0x00d2
            int r3 = r9.zzd(r15)
            if (r3 == 0) goto L_0x00cc
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r3 = 0
            goto L_0x0117
        L_0x00cc:
            r3 = 0
            r18 = 1
        L_0x00cf:
            r19 = 0
            goto L_0x0117
        L_0x00d2:
            boolean r3 = r9.zzp()
            if (r3 != 0) goto L_0x00e7
            int r3 = r9.zzd(r5)
            int r3 = r3 + r7
            int r4 = r9.zzd(r7)
        L_0x00e1:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x0117
        L_0x00e7:
            int r3 = r9.zzd(r5)
            if (r3 == 0) goto L_0x0113
            if (r3 == r0) goto L_0x010d
            if (r3 == r5) goto L_0x0102
            if (r3 == r15) goto L_0x00f7
            r18 = r2
            r3 = 0
            goto L_0x00cf
        L_0x00f7:
            int r3 = r9.zzd(r14)
            int r3 = r3 + 25
            int r4 = r9.zzd(r7)
            goto L_0x00e1
        L_0x0102:
            int r3 = r9.zzd(r7)
            int r3 = r3 + 9
            int r4 = r9.zzd(r7)
            goto L_0x00e1
        L_0x010d:
            r18 = r2
            r3 = 0
            r19 = 2
            goto L_0x0117
        L_0x0113:
            r18 = r2
            r3 = 0
            goto L_0x00b4
        L_0x0117:
            if (r19 == 0) goto L_0x013b
            if (r8 == 0) goto L_0x013b
            int r2 = r10 + 1
            float r4 = (float) r10
            if (r17 == 0) goto L_0x0122
            byte r3 = r17[r3]
        L_0x0122:
            float r2 = (float) r2
            r3 = r25[r3]
            r8.setColor(r3)
            float r3 = (float) r6
            int r5 = r6 + r19
            float r5 = (float) r5
            r20 = r2
            r2 = r30
            r14 = 2
            r22 = r6
            r6 = r20
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x013e
        L_0x013b:
            r22 = r6
            r14 = 2
        L_0x013e:
            int r6 = r22 + r19
            if (r18 == 0) goto L_0x0148
            r9.zzf()
            r2 = r6
            goto L_0x0013
        L_0x0148:
            r2 = r18
            r5 = 2
            r7 = 4
            r14 = 8
            goto L_0x00ac
        L_0x0150:
            r0 = 1
            r14 = 2
            if (r1 != r15) goto L_0x015e
            if (r11 != 0) goto L_0x015b
            byte[] r3 = zzb
        L_0x0158:
            r17 = r3
            goto L_0x016a
        L_0x015b:
            r17 = r11
            goto L_0x016a
        L_0x015e:
            if (r1 != r14) goto L_0x0168
            if (r13 != 0) goto L_0x0165
            byte[] r3 = zza
            goto L_0x0158
        L_0x0165:
            r17 = r13
            goto L_0x016a
        L_0x0168:
            r17 = 0
        L_0x016a:
            r7 = r2
            r6 = 0
        L_0x016c:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L_0x017b
            r19 = r6
        L_0x0174:
            r4 = 4
            r5 = 8
            r18 = 1
            goto L_0x01e9
        L_0x017b:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L_0x0193
            int r2 = r9.zzd(r15)
            int r2 = r2 + r15
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            r5 = 8
            goto L_0x01e9
        L_0x0193:
            boolean r2 = r9.zzp()
            if (r2 == 0) goto L_0x019d
            r19 = r6
            r2 = 0
            goto L_0x0174
        L_0x019d:
            int r2 = r9.zzd(r14)
            if (r2 == 0) goto L_0x01e1
            if (r2 == r0) goto L_0x01d8
            if (r2 == r14) goto L_0x01c5
            if (r2 == r15) goto L_0x01b2
            r19 = r6
            r2 = 0
            r4 = 4
            r5 = 8
            r18 = 0
            goto L_0x01e9
        L_0x01b2:
            r5 = 8
            int r2 = r9.zzd(r5)
            int r2 = r2 + 29
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            goto L_0x01e9
        L_0x01c5:
            r4 = 4
            r5 = 8
            int r2 = r9.zzd(r4)
            int r2 = r2 + 12
            int r3 = r9.zzd(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            goto L_0x01e9
        L_0x01d8:
            r4 = 4
            r5 = 8
            r19 = r6
            r2 = 0
            r18 = 2
            goto L_0x01e9
        L_0x01e1:
            r4 = 4
            r5 = 8
            r2 = 0
            r18 = 0
            r19 = 1
        L_0x01e9:
            if (r18 == 0) goto L_0x0215
            if (r8 == 0) goto L_0x0215
            int r3 = r10 + 1
            float r6 = (float) r10
            if (r17 == 0) goto L_0x01f4
            byte r2 = r17[r2]
        L_0x01f4:
            float r3 = (float) r3
            r2 = r25[r2]
            r8.setColor(r2)
            float r2 = (float) r7
            int r0 = r7 + r18
            float r0 = (float) r0
            r21 = r2
            r2 = r30
            r22 = r3
            r3 = r21
            r21 = 4
            r4 = r6
            r23 = 8
            r5 = r0
            r6 = r22
            r0 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021a
        L_0x0215:
            r0 = r7
            r21 = 4
            r23 = 8
        L_0x021a:
            int r7 = r0 + r18
            if (r19 == 0) goto L_0x0224
            r9.zzf()
            r2 = r7
            goto L_0x0013
        L_0x0224:
            r6 = r19
            r0 = 1
            goto L_0x016c
        L_0x0229:
            int r10 = r10 + 2
            r2 = r27
            goto L_0x0013
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakr.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i, int i2, zzdx zzdx) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzdx.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : WorkQueueKt.MASK;
                int i7 = i3 != 0 ? WorkQueueKt.MASK : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = i & 2;
                int i4 = i & 4;
                int i5 = 1 != (i & 1) ? 0 : 255;
                int i6 = i3 != 0 ? 255 : 0;
                if (i4 == 0) {
                    i2 = 0;
                }
                iArr[i] = zzb(63, i5, i6, i2);
            } else {
                int i7 = i & 136;
                int i8 = 170;
                int i9 = 85;
                if (i7 == 0) {
                    int i10 = i & 16;
                    int i11 = i & 32;
                    int i12 = i & 2;
                    int i13 = i & 64;
                    int i14 = i & 4;
                    int i15 = 1 != (i & 1) ? 0 : 85;
                    int i16 = i10 != 0 ? 170 : 0;
                    int i17 = i12 != 0 ? 85 : 0;
                    int i18 = i11 != 0 ? 170 : 0;
                    if (i14 == 0) {
                        i9 = 0;
                    }
                    if (i13 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(255, i15 + i16, i17 + i18, i9 + i8);
                } else if (i7 != 8) {
                    int i19 = 43;
                    if (i7 == 128) {
                        int i20 = i & 16;
                        int i21 = i & 32;
                        int i22 = i & 2;
                        int i23 = i & 64;
                        int i24 = i & 4;
                        int i25 = (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK;
                        int i26 = i20 != 0 ? 85 : 0;
                        int i27 = (i22 != 0 ? 43 : 0) + WorkQueueKt.MASK;
                        int i28 = i21 != 0 ? 85 : 0;
                        if (i24 == 0) {
                            i19 = 0;
                        }
                        int i29 = i19 + WorkQueueKt.MASK;
                        if (i23 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(255, i25 + i26, i27 + i28, i29 + i9);
                    } else if (i7 == 136) {
                        int i30 = i & 16;
                        int i31 = i & 32;
                        int i32 = i & 2;
                        int i33 = i & 64;
                        int i34 = i & 4;
                        int i35 = 1 != (i & 1) ? 0 : 43;
                        int i36 = i30 != 0 ? 85 : 0;
                        int i37 = i32 != 0 ? 43 : 0;
                        int i38 = i31 != 0 ? 85 : 0;
                        if (i34 == 0) {
                            i19 = 0;
                        }
                        if (i33 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(255, i35 + i36, i37 + i38, i19 + i9);
                    }
                } else {
                    int i39 = i & 16;
                    int i40 = i & 32;
                    int i41 = i & 2;
                    int i42 = i & 64;
                    int i43 = i & 4;
                    int i44 = 1 != (i & 1) ? 0 : 85;
                    int i45 = i39 != 0 ? 170 : 0;
                    int i46 = i41 != 0 ? 85 : 0;
                    int i47 = i40 != 0 ? 170 : 0;
                    if (i43 == 0) {
                        i9 = 0;
                    }
                    if (i42 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(WorkQueueKt.MASK, i44 + i45, i46 + i47, i9 + i8);
                }
            }
        }
        return iArr;
    }

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        zzajx zzajx;
        int i3;
        int i4;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        Paint paint;
        int[] iArr;
        zzako zzako;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        zzdx zzdx = new zzdx(bArr, i12 + i2);
        zzdx.zzl(i12);
        while (zzdx.zza() >= 48 && zzdx.zzd(8) == 15) {
            zzakq zzakq = this.zzi;
            int zzd2 = zzdx.zzd(8);
            int zzd3 = zzdx.zzd(16);
            int zzd4 = zzdx.zzd(16);
            int zzb2 = zzdx.zzb() + zzd4;
            if (zzd4 * 8 > zzdx.zza()) {
                zzdo.zzf("DvbParser", "Data field length exceeds limit");
                zzdx.zzn(zzdx.zza());
            } else {
                switch (zzd2) {
                    case 16:
                        if (zzd3 == zzakq.zza) {
                            zzakm zzakm = zzakq.zzi;
                            int zzd5 = zzdx.zzd(8);
                            int zzd6 = zzdx.zzd(4);
                            int zzd7 = zzdx.zzd(2);
                            zzdx.zzn(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i13 = zzd4 - 2; i13 > 0; i13 -= 6) {
                                int zzd8 = zzdx.zzd(8);
                                zzdx.zzn(8);
                                sparseArray3.put(zzd8, new zzakn(zzdx.zzd(16), zzdx.zzd(16)));
                            }
                            zzakm zzakm2 = new zzakm(zzd5, zzd6, zzd7, sparseArray3);
                            if (zzakm2.zzb == 0) {
                                if (!(zzakm == null || zzakm.zza == zzakm2.zza)) {
                                    zzakq.zzi = zzakm2;
                                    break;
                                }
                            } else {
                                zzakq.zzi = zzakm2;
                                zzakq.zzc.clear();
                                zzakq.zzd.clear();
                                zzakq.zze.clear();
                                break;
                            }
                        }
                        break;
                    case 17:
                        zzakm zzakm3 = zzakq.zzi;
                        if (zzd3 == zzakq.zza && zzakm3 != null) {
                            int zzd9 = zzdx.zzd(8);
                            zzdx.zzn(4);
                            boolean zzp = zzdx.zzp();
                            zzdx.zzn(3);
                            int zzd10 = zzdx.zzd(16);
                            int zzd11 = zzdx.zzd(16);
                            int zzd12 = zzdx.zzd(3);
                            int zzd13 = zzdx.zzd(3);
                            zzdx.zzn(2);
                            int zzd14 = zzdx.zzd(8);
                            int zzd15 = zzdx.zzd(8);
                            int zzd16 = zzdx.zzd(4);
                            int zzd17 = zzdx.zzd(2);
                            zzdx.zzn(2);
                            int i14 = zzd4 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i14 > 0) {
                                int zzd18 = zzdx.zzd(16);
                                int zzd19 = zzdx.zzd(2);
                                int zzd20 = zzdx.zzd(2);
                                int zzd21 = zzdx.zzd(12);
                                zzdx.zzn(4);
                                int zzd22 = zzdx.zzd(12);
                                int i15 = i14 - 6;
                                if (zzd19 != 1) {
                                    if (zzd19 == 2) {
                                        zzd19 = 2;
                                    } else {
                                        i7 = zzd19;
                                        i14 = i15;
                                        i6 = 0;
                                        i5 = 0;
                                        sparseArray4.put(zzd18, new zzakp(i7, zzd20, zzd21, zzd22, i6, i5));
                                    }
                                }
                                i14 -= 8;
                                i7 = zzd19;
                                i6 = zzdx.zzd(8);
                                i5 = zzdx.zzd(8);
                                sparseArray4.put(zzd18, new zzakp(i7, zzd20, zzd21, zzd22, i6, i5));
                            }
                            zzako zzako2 = new zzako(zzd9, zzp, zzd10, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, sparseArray4);
                            if (zzakm3.zzb == 0 && (zzako = (zzako) zzakq.zzc.get(zzako2.zza)) != null) {
                                int i16 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzako.zzj;
                                    if (i16 < sparseArray5.size()) {
                                        zzako2.zzj.put(sparseArray5.keyAt(i16), (zzakp) sparseArray5.valueAt(i16));
                                        i16++;
                                    }
                                }
                            }
                            zzakq.zzc.put(zzako2.zza, zzako2);
                            break;
                        }
                    case 18:
                        if (zzd3 != zzakq.zza) {
                            if (zzd3 == zzakq.zzb) {
                                zzakj zzc2 = zzc(zzdx, zzd4);
                                zzakq.zzf.put(zzc2.zza, zzc2);
                                break;
                            }
                        } else {
                            zzakj zzc3 = zzc(zzdx, zzd4);
                            zzakq.zzd.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd3 != zzakq.zza) {
                            if (zzd3 == zzakq.zzb) {
                                zzakl zzd23 = zzd(zzdx);
                                zzakq.zzg.put(zzd23.zza, zzd23);
                                break;
                            }
                        } else {
                            zzakl zzd24 = zzd(zzdx);
                            zzakq.zze.put(zzd24.zza, zzd24);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd3 == zzakq.zza) {
                            zzdx.zzn(4);
                            boolean zzp2 = zzdx.zzp();
                            zzdx.zzn(3);
                            int zzd25 = zzdx.zzd(16);
                            int zzd26 = zzdx.zzd(16);
                            if (zzp2) {
                                int zzd27 = zzdx.zzd(16);
                                i10 = zzdx.zzd(16);
                                i9 = zzdx.zzd(16);
                                i8 = zzdx.zzd(16);
                                i11 = zzd27;
                            } else {
                                i10 = zzd25;
                                i8 = zzd26;
                                i11 = 0;
                                i9 = 0;
                            }
                            zzakq.zzh = new zzakk(zzd25, zzd26, i11, i10, i9, i8);
                            break;
                        }
                        break;
                }
                zzdx.zzo(zzb2 - zzdx.zzb());
            }
        }
        zzakq zzakq2 = this.zzi;
        zzakm zzakm4 = zzakq2.zzi;
        if (zzakm4 == null) {
            zzajx = new zzajx(zzfxn.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakk zzakk = zzakq2.zzh;
            if (zzakk == null) {
                zzakk = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (!(bitmap != null && zzakk.zza + 1 == bitmap.getWidth() && zzakk.zzb + 1 == this.zzj.getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakk.zza + 1, zzakk.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzakm4.zzc;
            int i17 = 0;
            while (i17 < sparseArray6.size()) {
                this.zzf.save();
                zzakn zzakn = (zzakn) sparseArray6.valueAt(i17);
                zzako zzako3 = (zzako) this.zzi.zzc.get(sparseArray6.keyAt(i17));
                int i18 = zzakn.zza + zzakk.zzc;
                int i19 = zzakn.zzb + zzakk.zze;
                this.zzf.clipRect(i18, i19, Math.min(zzako3.zzc + i18, zzakk.zzd), Math.min(zzako3.zzd + i19, zzakk.zzf));
                zzakj zzakj = (zzakj) this.zzi.zzd.get(zzako3.zzf);
                if (zzakj == null) {
                    zzakj = (zzakj) this.zzi.zzf.get(zzako3.zzf);
                    if (zzakj == null) {
                        zzakj = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzako3.zzj;
                int i20 = 0;
                while (i20 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i20);
                    zzakp zzakp = (zzakp) sparseArray7.valueAt(i20);
                    zzakl zzakl = (zzakl) this.zzi.zze.get(keyAt);
                    if (zzakl == null) {
                        zzakl = (zzakl) this.zzi.zzg.get(keyAt);
                    }
                    if (zzakl != null) {
                        if (zzakl.zzb) {
                            paint = null;
                        } else {
                            paint = this.zzd;
                        }
                        int i21 = zzako3.zze;
                        int i22 = zzakp.zza + i18;
                        int i23 = zzakp.zzb + i19;
                        sparseArray2 = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray = sparseArray7;
                        if (i21 == 3) {
                            iArr = zzakj.zzd;
                        } else if (i21 == 2) {
                            iArr = zzakj.zzc;
                        } else {
                            iArr = zzakj.zzb;
                        }
                        i4 = i17;
                        int[] iArr2 = iArr;
                        int i24 = i21;
                        int i25 = i22;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        zze(zzakl.zzc, iArr2, i24, i25, i23, paint2, canvas2);
                        zze(zzakl.zzd, iArr2, i24, i25, i23 + 1, paint2, canvas2);
                    } else {
                        sparseArray2 = sparseArray6;
                        i4 = i17;
                        sparseArray = sparseArray7;
                    }
                    i20++;
                    sparseArray6 = sparseArray2;
                    sparseArray7 = sparseArray;
                    i17 = i4;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i26 = i17;
                float f = (float) i19;
                float f2 = (float) i18;
                if (zzako3.zzb) {
                    int i27 = zzako3.zze;
                    if (i27 == 3) {
                        i3 = zzakj.zzd[zzako3.zzg];
                    } else if (i27 == 2) {
                        i3 = zzakj.zzc[zzako3.zzh];
                    } else {
                        i3 = zzakj.zzb[zzako3.zzi];
                    }
                    this.zze.setColor(i3);
                    this.zzf.drawRect(f2, f, (float) (zzako3.zzc + i18), (float) (zzako3.zzd + i19), this.zze);
                }
                zzcm zzcm = new zzcm();
                zzcm.zzc(Bitmap.createBitmap(this.zzj, i18, i19, zzako3.zzc, zzako3.zzd));
                zzcm.zzh(f2 / ((float) zzakk.zza));
                zzcm.zzi(0);
                zzcm.zze(f / ((float) zzakk.zzb), 0);
                zzcm.zzf(0);
                zzcm.zzk(((float) zzako3.zzc) / ((float) zzakk.zza));
                zzcm.zzd(((float) zzako3.zzd) / ((float) zzakk.zzb));
                arrayList.add(zzcm.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i17 = i26 + 1;
                sparseArray6 = sparseArray8;
            }
            zzajx = new zzajx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdb.zza(zzajx);
    }
}

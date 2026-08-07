package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzahk {
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public byte[] zzN;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public zzadu zzT;
    public boolean zzU;
    public boolean zzV = true;
    public zzadt zzW;
    public int zzX;
    /* access modifiers changed from: private */
    public int zzY;
    /* access modifiers changed from: private */
    public String zzZ = "eng";
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzads zzi;
    public byte[] zzj;
    public zzu zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;

    protected zzahk() {
    }

    private static Pair zzf(zzdy zzdy) throws zzbc {
        try {
            zzdy.zzM(16);
            long zzs2 = zzdy.zzs();
            if (zzs2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzs2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzs2 == 826496599) {
                int zzd2 = zzdy.zzd() + 20;
                byte[] zzN2 = zzdy.zzN();
                while (true) {
                    int length = zzN2.length;
                    if (zzd2 < length - 4) {
                        int i = zzd2 + 1;
                        if (zzN2[zzd2] == 0 && zzN2[i] == 0 && zzN2[zzd2 + 2] == 1 && zzN2[zzd2 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN2, zzd2, length)));
                        }
                        zzd2 = i;
                    } else {
                        throw zzbc.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    }
                }
            } else {
                zzdo.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbc {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    byte b3 = bArr[i];
                    i++;
                    b = b3 & 255;
                    if (b != 255) {
                        break;
                    }
                    i2 += 255;
                }
                int i3 = i2 + b;
                int i4 = 0;
                while (true) {
                    byte b4 = bArr[i];
                    i++;
                    b2 = b4 & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i4 += 255;
                }
                int i5 = i4 + b2;
                if (bArr[i] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    int i6 = i + i3;
                    if (bArr[i6] == 3) {
                        int i7 = i6 + i5;
                        if (bArr[i7] == 5) {
                            int length = bArr.length - i7;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i7, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbc.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzbc.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzbc.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzbc.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzdy zzdy) throws zzbc {
        try {
            int zzk2 = zzdy.zzk();
            if (zzk2 == 1) {
                return true;
            }
            if (zzk2 == 65534) {
                zzdy.zzL(24);
                return zzdy.zzt() == zzahm.zze.getMostSignificantBits() && zzdy.zzt() == zzahm.zze.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbc {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.google.android.gms.internal.ads.zzfxn} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        r1 = -1;
        r2 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028d, code lost:
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02bd, code lost:
        r1 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0354, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0355, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x038a, code lost:
        r3 = r1;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a5, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a7, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a8, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ab, code lost:
        if (r0.zzN == null) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ad, code lost:
        r4 = com.google.android.gms.internal.ads.zzacj.zza(new com.google.android.gms.internal.ads.zzdy(r0.zzN));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b8, code lost:
        if (r4 == null) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ba, code lost:
        r3 = r4.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03be, code lost:
        r4 = r17;
        r5 = r0.zzV;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03c4, code lost:
        if (true == r0.zzU) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c6, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c8, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c9, code lost:
        r5 = r5 | r7;
        r7 = new com.google.android.gms.internal.ads.zzz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d3, code lost:
        if (com.google.android.gms.internal.ads.zzbb.zzg(r4) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d5, code lost:
        r7.zzz(r0.zzO);
        r7.zzab(r0.zzQ);
        r7.zzU(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e8, code lost:
        if (com.google.android.gms.internal.ads.zzbb.zzi(r4) == false) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ec, code lost:
        if (r0.zzq != 0) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ee, code lost:
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f0, code lost:
        if (r6 != -1) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f2, code lost:
        r6 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f4, code lost:
        r0.zzo = r6;
        r6 = r0.zzp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f8, code lost:
        if (r6 != -1) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03fa, code lost:
        r6 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03fc, code lost:
        r0.zzp = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03fe, code lost:
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0402, code lost:
        if (r6 == -1) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0404, code lost:
        r9 = r0.zzp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0406, code lost:
        if (r9 == -1) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0408, code lost:
        r9 = ((float) (r0.zzm * r6)) / ((float) (r0.zzl * r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0414, code lost:
        r9 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0418, code lost:
        if (r0.zzx == false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041e, code lost:
        if (r0.zzD == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0424, code lost:
        if (r0.zzE == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x042a, code lost:
        if (r0.zzF == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0430, code lost:
        if (r0.zzG == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0436, code lost:
        if (r0.zzH == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x043c, code lost:
        if (r0.zzI == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0442, code lost:
        if (r0.zzJ == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0448, code lost:
        if (r0.zzK == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x044e, code lost:
        if (r0.zzL == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0454, code lost:
        if (r0.zzM != -1.0f) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0458, code lost:
        r6 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzK * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r0.zzL + 0.5f)));
        r8.putShort((short) ((int) (r0.zzM + 0.5f)));
        r8.putShort((short) r0.zzB);
        r8.putShort((short) r0.zzC);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04db, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04dc, code lost:
        r8 = new com.google.android.gms.internal.ads.zzi();
        r8.zzc(r0.zzy);
        r8.zzb(r0.zzA);
        r8.zzd(r0.zzz);
        r8.zze(r6);
        r8.zzf(r0.zzn);
        r8.zza(r0.zzn);
        r6 = r8.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0502, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0505, code lost:
        if (r0.zza == null) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0511, code lost:
        if (com.google.android.gms.internal.ads.zzahm.zzf.containsKey(r0.zza) == false) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0513, code lost:
        r13 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahm.zzf.get(r0.zza)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0525, code lost:
        if (r0.zzr != 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x052e, code lost:
        if (java.lang.Float.compare(r0.zzs, 0.0f) != 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0536, code lost:
        if (java.lang.Float.compare(r0.zzt, 0.0f) != 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x053e, code lost:
        if (java.lang.Float.compare(r0.zzu, 0.0f) != 0) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0549, code lost:
        if (java.lang.Float.compare(r0.zzu, 90.0f) != 0) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x054b, code lost:
        r11 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0556, code lost:
        if (java.lang.Float.compare(r0.zzu, -180.0f) == 0) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0560, code lost:
        if (java.lang.Float.compare(r0.zzu, 180.0f) != 0) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x056b, code lost:
        if (java.lang.Float.compare(r0.zzu, -90.0f) != 0) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x056d, code lost:
        r11 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0570, code lost:
        r11 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0573, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0574, code lost:
        r7.zzaf(r0.zzl);
        r7.zzK(r0.zzm);
        r7.zzW(r9);
        r7.zzZ(r11);
        r7.zzX(r0.zzv);
        r7.zzad(r0.zzw);
        r7.zzB(r6);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0597, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x059d, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a5, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ad, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05b5, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05bd, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05c7, code lost:
        throw com.google.android.gms.internal.ads.zzbc.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05c8, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05cb, code lost:
        if (r0.zza == null) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05d7, code lost:
        if (com.google.android.gms.internal.ads.zzahm.zzf.containsKey(r0.zza) != false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05d9, code lost:
        r7.zzO(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05de, code lost:
        r7.zzL(r21);
        r7.zzaa(r4);
        r7.zzR(r1);
        r7.zzQ(r0.zzZ);
        r7.zzac(r5);
        r7.zzN(r2);
        r7.zzA(r3);
        r7.zzF(r0.zzk);
        r1 = r7.zzag();
        r2 = r20.zzw(r0.zzc, r6);
        r0.zzW = r2;
        r2.zzm(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x060d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzacq r20, int r21) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r3 = 24
            r5 = 16
            r6 = 1
            r8 = 32
            r9 = 8
            r10 = 4
            r11 = 0
            r12 = 3
            r13 = -1
            switch(r2) {
                case -2095576542: goto L_0x018b;
                case -2095575984: goto L_0x0181;
                case -1985379776: goto L_0x0176;
                case -1784763192: goto L_0x016b;
                case -1730367663: goto L_0x0160;
                case -1482641358: goto L_0x0155;
                case -1482641357: goto L_0x014a;
                case -1373388978: goto L_0x013f;
                case -933872740: goto L_0x0134;
                case -538363189: goto L_0x0129;
                case -538363109: goto L_0x011e;
                case -425012669: goto L_0x0112;
                case -356037306: goto L_0x0106;
                case 62923557: goto L_0x00fa;
                case 62923603: goto L_0x00ee;
                case 62927045: goto L_0x00e2;
                case 82318131: goto L_0x00d7;
                case 82338133: goto L_0x00cc;
                case 82338134: goto L_0x00c1;
                case 99146302: goto L_0x00b5;
                case 444813526: goto L_0x00a9;
                case 542569478: goto L_0x009d;
                case 635596514: goto L_0x0091;
                case 725948237: goto L_0x0085;
                case 725957860: goto L_0x0079;
                case 738597099: goto L_0x006d;
                case 855502857: goto L_0x0061;
                case 1045209816: goto L_0x0055;
                case 1422270023: goto L_0x0049;
                case 1809237540: goto L_0x003e;
                case 1950749482: goto L_0x0032;
                case 1950789798: goto L_0x0026;
                case 1951062397: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0195
        L_0x001a:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 12
            goto L_0x0196
        L_0x0026:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 22
            goto L_0x0196
        L_0x0032:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 17
            goto L_0x0196
        L_0x003e:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 3
            goto L_0x0196
        L_0x0049:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 27
            goto L_0x0196
        L_0x0055:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 29
            goto L_0x0196
        L_0x0061:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 8
            goto L_0x0196
        L_0x006d:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 28
            goto L_0x0196
        L_0x0079:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 24
            goto L_0x0196
        L_0x0085:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 25
            goto L_0x0196
        L_0x0091:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 26
            goto L_0x0196
        L_0x009d:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 20
            goto L_0x0196
        L_0x00a9:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 10
            goto L_0x0196
        L_0x00b5:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 31
            goto L_0x0196
        L_0x00c1:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 1
            goto L_0x0196
        L_0x00cc:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 0
            goto L_0x0196
        L_0x00d7:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 2
            goto L_0x0196
        L_0x00e2:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 19
            goto L_0x0196
        L_0x00ee:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 16
            goto L_0x0196
        L_0x00fa:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 13
            goto L_0x0196
        L_0x0106:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 21
            goto L_0x0196
        L_0x0112:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 30
            goto L_0x0196
        L_0x011e:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 7
            goto L_0x0196
        L_0x0129:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 5
            goto L_0x0196
        L_0x0134:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 32
            goto L_0x0196
        L_0x013f:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 9
            goto L_0x0196
        L_0x014a:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 15
            goto L_0x0196
        L_0x0155:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 14
            goto L_0x0196
        L_0x0160:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 11
            goto L_0x0196
        L_0x016b:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 18
            goto L_0x0196
        L_0x0176:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 23
            goto L_0x0196
        L_0x0181:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 4
            goto L_0x0196
        L_0x018b:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0195
            r2 = 6
            goto L_0x0196
        L_0x0195:
            r2 = -1
        L_0x0196:
            java.lang.String r14 = "text/x-ssa"
            java.lang.String r15 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r7 = "MatroskaExtractor"
            java.lang.String r4 = ". Setting mimeType to audio/x-unknown"
            switch(r2) {
                case 0: goto L_0x03a3;
                case 1: goto L_0x03a0;
                case 2: goto L_0x039d;
                case 3: goto L_0x039a;
                case 4: goto L_0x038d;
                case 5: goto L_0x038d;
                case 6: goto L_0x038d;
                case 7: goto L_0x0371;
                case 8: goto L_0x0357;
                case 9: goto L_0x033b;
                case 10: goto L_0x0337;
                case 11: goto L_0x0326;
                case 12: goto L_0x02e1;
                case 13: goto L_0x02c1;
                case 14: goto L_0x02bb;
                case 15: goto L_0x02b8;
                case 16: goto L_0x02b4;
                case 17: goto L_0x02b0;
                case 18: goto L_0x02a5;
                case 19: goto L_0x02a1;
                case 20: goto L_0x02a1;
                case 21: goto L_0x029d;
                case 22: goto L_0x0291;
                case 23: goto L_0x0258;
                case 24: goto L_0x0234;
                case 25: goto L_0x0206;
                case 26: goto L_0x01eb;
                case 27: goto L_0x01e7;
                case 28: goto L_0x01d4;
                case 29: goto L_0x01d0;
                case 30: goto L_0x01c4;
                case 31: goto L_0x01c0;
                case 32: goto L_0x01af;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            java.lang.String r1 = "Unrecognized codec identifier."
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x01af:
            byte[] r2 = new byte[r10]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r11, r2, r11, r10)
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzo(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0354
        L_0x01c0:
            java.lang.String r17 = "application/pgs"
            goto L_0x03a5
        L_0x01c4:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzo(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x0354
        L_0x01d0:
            java.lang.String r17 = "text/vtt"
            goto L_0x03a5
        L_0x01d4:
            byte[] r1 = com.google.android.gms.internal.ads.zzahm.zzb
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzp(r1, r2)
            r2 = r1
            r17 = r14
            goto L_0x0355
        L_0x01e7:
            r17 = r15
            goto L_0x03a5
        L_0x01eb:
            int r1 = r0.zzP
            if (r1 != r8) goto L_0x01f0
            goto L_0x0253
        L_0x01f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported floating point PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r7, r1)
            goto L_0x028d
        L_0x0206:
            int r1 = r0.zzP
            if (r1 != r9) goto L_0x0210
            r1 = -1
            r2 = 0
            r3 = 0
            r10 = 3
            goto L_0x03a9
        L_0x0210:
            if (r1 != r5) goto L_0x0215
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0253
        L_0x0215:
            if (r1 != r3) goto L_0x021a
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x0253
        L_0x021a:
            if (r1 != r8) goto L_0x021f
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x0253
        L_0x021f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported big endian PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r7, r1)
            goto L_0x028d
        L_0x0234:
            int r1 = r0.zzP
            int r10 = com.google.android.gms.internal.ads.zzei.zzn(r1)
            if (r10 != 0) goto L_0x0253
            int r1 = r0.zzP
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported little endian PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r7, r1)
            goto L_0x028d
        L_0x0253:
            r1 = -1
            r2 = 0
            r3 = 0
            goto L_0x03a9
        L_0x0258:
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            boolean r1 = zzh(r1)
            if (r1 == 0) goto L_0x0288
            int r1 = r0.zzP
            int r10 = com.google.android.gms.internal.ads.zzei.zzn(r1)
            if (r10 != 0) goto L_0x0253
            int r1 = r0.zzP
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r7, r1)
            goto L_0x028d
        L_0x0288:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzdo.zzf(r7, r1)
        L_0x028d:
            r17 = r18
            goto L_0x03a5
        L_0x0291:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0354
        L_0x029d:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03a5
        L_0x02a1:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03a5
        L_0x02a5:
            com.google.android.gms.internal.ads.zzadu r1 = new com.google.android.gms.internal.ads.zzadu
            r1.<init>()
            r0.zzT = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03a5
        L_0x02b0:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03a5
        L_0x02b4:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03a5
        L_0x02b8:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02bd
        L_0x02bb:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02bd:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a6
        L_0x02c1:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzabi r2 = com.google.android.gms.internal.ads.zzabk.zza(r2)
            int r3 = r2.zza
            r0.zzQ = r3
            int r3 = r2.zzb
            r0.zzO = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            r3 = r2
            r10 = -1
            r2 = r1
            r1 = -1
            goto L_0x03a9
        L_0x02e1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzS
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            r2 = r1
            r1 = 5760(0x1680, float:8.071E-42)
            goto L_0x03a7
        L_0x0326:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
            r2 = r1
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a7
        L_0x0337:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03a5
        L_0x033b:
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            android.util.Pair r1 = zzf(r1)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0354:
            r2 = r1
        L_0x0355:
            r1 = -1
            goto L_0x03a7
        L_0x0357:
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzadc r1 = com.google.android.gms.internal.ads.zzadc.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzX = r3
            java.lang.String r1 = r1.zzk
            java.lang.String r17 = "video/hevc"
            goto L_0x038a
        L_0x0371:
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzabr r1 = com.google.android.gms.internal.ads.zzabr.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzX = r3
            java.lang.String r1 = r1.zzl
            java.lang.String r17 = "video/avc"
        L_0x038a:
            r3 = r1
            r1 = -1
            goto L_0x03a8
        L_0x038d:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L_0x0393
            r1 = 0
            goto L_0x0397
        L_0x0393:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0397:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0354
        L_0x039a:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03a5
        L_0x039d:
            java.lang.String r17 = "video/av01"
            goto L_0x03a5
        L_0x03a0:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x03a5
        L_0x03a3:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03a5:
            r1 = -1
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r3 = 0
        L_0x03a8:
            r10 = -1
        L_0x03a9:
            byte[] r4 = r0.zzN
            if (r4 == 0) goto L_0x03be
            com.google.android.gms.internal.ads.zzdy r4 = new com.google.android.gms.internal.ads.zzdy
            byte[] r5 = r0.zzN
            r4.<init>((byte[]) r5)
            com.google.android.gms.internal.ads.zzacj r4 = com.google.android.gms.internal.ads.zzacj.zza(r4)
            if (r4 == 0) goto L_0x03be
            java.lang.String r3 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x03be:
            r4 = r17
            boolean r5 = r0.zzV
            boolean r7 = r0.zzU
            if (r6 == r7) goto L_0x03c8
            r7 = 0
            goto L_0x03c9
        L_0x03c8:
            r7 = 2
        L_0x03c9:
            r5 = r5 | r7
            com.google.android.gms.internal.ads.zzz r7 = new com.google.android.gms.internal.ads.zzz
            r7.<init>()
            boolean r8 = com.google.android.gms.internal.ads.zzbb.zzg(r4)
            if (r8 == 0) goto L_0x03e4
            int r8 = r0.zzO
            r7.zzz(r8)
            int r8 = r0.zzQ
            r7.zzab(r8)
            r7.zzU(r10)
            goto L_0x05c9
        L_0x03e4:
            boolean r6 = com.google.android.gms.internal.ads.zzbb.zzi(r4)
            if (r6 == 0) goto L_0x0593
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x03fe
            int r6 = r0.zzo
            if (r6 != r13) goto L_0x03f4
            int r6 = r0.zzl
        L_0x03f4:
            r0.zzo = r6
            int r6 = r0.zzp
            if (r6 != r13) goto L_0x03fc
            int r6 = r0.zzm
        L_0x03fc:
            r0.zzp = r6
        L_0x03fe:
            int r6 = r0.zzo
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r13) goto L_0x0414
            int r9 = r0.zzp
            if (r9 == r13) goto L_0x0414
            int r10 = r0.zzm
            int r10 = r10 * r6
            int r6 = r0.zzl
            int r6 = r6 * r9
            float r9 = (float) r10
            float r6 = (float) r6
            float r9 = r9 / r6
            goto L_0x0416
        L_0x0414:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0416:
            boolean r6 = r0.zzx
            if (r6 == 0) goto L_0x0502
            float r6 = r0.zzD
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzE
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzF
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzG
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzH
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzI
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzJ
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzK
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzL
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x04db
            float r6 = r0.zzM
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0458
            goto L_0x04db
        L_0x0458:
            r6 = 25
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r8.order(r10)
            r8.put(r11)
            float r10 = r0.zzD
            r12 = 1195593728(0x47435000, float:50000.0)
            float r10 = r10 * r12
            r14 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzE
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzF
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzG
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzH
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzI
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzJ
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzK
            float r10 = r10 * r12
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzL
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.zzM
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.zzB
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.zzC
            short r10 = (short) r10
            r8.putShort(r10)
            goto L_0x04dc
        L_0x04db:
            r6 = 0
        L_0x04dc:
            com.google.android.gms.internal.ads.zzi r8 = new com.google.android.gms.internal.ads.zzi
            r8.<init>()
            int r10 = r0.zzy
            r8.zzc(r10)
            int r10 = r0.zzA
            r8.zzb(r10)
            int r10 = r0.zzz
            r8.zzd(r10)
            r8.zze(r6)
            int r6 = r0.zzn
            r8.zzf(r6)
            int r6 = r0.zzn
            r8.zza(r6)
            com.google.android.gms.internal.ads.zzk r6 = r8.zzg()
            goto L_0x0503
        L_0x0502:
            r6 = 0
        L_0x0503:
            java.lang.String r8 = r0.zza
            if (r8 == 0) goto L_0x0523
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahm.zzf
            java.lang.String r10 = r0.zza
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x0523
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahm.zzf
            java.lang.String r10 = r0.zza
            java.lang.Object r8 = r8.get(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r13 = r8.intValue()
        L_0x0523:
            int r8 = r0.zzr
            if (r8 != 0) goto L_0x0573
            float r8 = r0.zzs
            r10 = 0
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0573
            float r8 = r0.zzt
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0573
            float r8 = r0.zzu
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0541
            goto L_0x0574
        L_0x0541:
            float r8 = r0.zzu
            r10 = 1119092736(0x42b40000, float:90.0)
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x054e
            r11 = 90
            goto L_0x0574
        L_0x054e:
            float r8 = r0.zzu
            r10 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 == 0) goto L_0x0570
            float r8 = r0.zzu
            r10 = 1127481344(0x43340000, float:180.0)
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0563
            goto L_0x0570
        L_0x0563:
            float r8 = r0.zzu
            r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0573
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x0574
        L_0x0570:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0574
        L_0x0573:
            r11 = r13
        L_0x0574:
            int r8 = r0.zzl
            r7.zzaf(r8)
            int r8 = r0.zzm
            r7.zzK(r8)
            r7.zzW(r9)
            r7.zzZ(r11)
            byte[] r8 = r0.zzv
            r7.zzX(r8)
            int r8 = r0.zzw
            r7.zzad(r8)
            r7.zzB(r6)
            r6 = 2
            goto L_0x05c9
        L_0x0593:
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L_0x05c8
            boolean r6 = r14.equals(r4)
            if (r6 != 0) goto L_0x05c8
            java.lang.String r6 = "text/vtt"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05c8
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05c8
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05c8
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x05c0
            goto L_0x05c8
        L_0x05c0:
            java.lang.String r1 = "Unexpected MIME type."
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x05c8:
            r6 = 3
        L_0x05c9:
            java.lang.String r8 = r0.zza
            if (r8 == 0) goto L_0x05de
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahm.zzf
            java.lang.String r9 = r0.zza
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x05de
            java.lang.String r8 = r0.zza
            r7.zzO(r8)
        L_0x05de:
            r8 = r21
            r7.zzL(r8)
            r7.zzaa(r4)
            r7.zzR(r1)
            java.lang.String r1 = r0.zzZ
            r7.zzQ(r1)
            r7.zzac(r5)
            r7.zzN(r2)
            r7.zzA(r3)
            com.google.android.gms.internal.ads.zzu r1 = r0.zzk
            r7.zzF(r1)
            com.google.android.gms.internal.ads.zzab r1 = r7.zzag()
            int r2 = r0.zzc
            r3 = r20
            com.google.android.gms.internal.ads.zzadt r2 = r3.zzw(r2, r6)
            r0.zzW = r2
            r2.zzm(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zze(com.google.android.gms.internal.ads.zzacq, int):void");
    }
}

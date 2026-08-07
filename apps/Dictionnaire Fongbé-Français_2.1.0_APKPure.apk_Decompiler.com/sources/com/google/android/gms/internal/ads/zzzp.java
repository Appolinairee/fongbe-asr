package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkRequest;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzzp extends zzsn implements zzaak {
    private static final int[] zzb = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzcd zzD;
    private zzcd zzE;
    private int zzF;
    private int zzG;
    private zzaai zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzabb zzg;
    private final boolean zzh;
    private final zzaal zzi;
    private final zzaaj zzj;
    private zzzo zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabh zzn = null;
    private boolean zzo;
    private List zzp;
    /* access modifiers changed from: private */
    public Surface zzq;
    private zzzs zzr;
    private zzdz zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzzp(Context context, zzsb zzsb, zzsp zzsp, long j, boolean z, Handler handler, zzabc zzabc, int i, float f) {
        super(2, zzsb, zzsp, false, 30.0f);
        zzabh zzabh = null;
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        Handler handler2 = handler;
        this.zzg = new zzabb(handler, zzabc);
        this.zzf = true;
        this.zzi = new zzaal(applicationContext, this, 0);
        this.zzj = new zzaaj();
        this.zzh = "NVIDIA".equals(zzei.zzc);
        this.zzs = zzdz.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzcd.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzI = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04c4, code lost:
        if (r13.equals("deb") != false) goto L_0x078e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x07a1, code lost:
        if (r0.equals("JSN-L21") == false) goto L_0x07a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean zzaU(java.lang.String r17) {
        /*
            java.lang.String r0 = "OMX.google"
            r1 = r17
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Class<com.google.android.gms.internal.ads.zzzp> r2 = com.google.android.gms.internal.ads.zzzp.class
            monitor-enter(r2)
            boolean r0 = zzc     // Catch:{ all -> 0x07ad }
            if (r0 != 0) goto L_0x07a9
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ all -> 0x07ad }
            r3 = 28
            r4 = 5
            r5 = 6
            r6 = 4
            r7 = 7
            r8 = 2
            r9 = 3
            r10 = -1
            r11 = 1
            if (r0 > r3) goto L_0x0083
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ all -> 0x07ad }
            int r12 = r0.hashCode()     // Catch:{ all -> 0x07ad }
            switch(r12) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0067;
                case -1220066608: goto L_0x005d;
                case -1012436106: goto L_0x0053;
                case -760312546: goto L_0x0049;
                case -64886864: goto L_0x003f;
                case 3415681: goto L_0x0035;
                case 825323514: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r12 = "machuca"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 5
            goto L_0x007c
        L_0x0035:
            java.lang.String r12 = "once"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 6
            goto L_0x007c
        L_0x003f:
            java.lang.String r12 = "magnolia"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 4
            goto L_0x007c
        L_0x0049:
            java.lang.String r12 = "aquaman"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x0053:
            java.lang.String r12 = "oneday"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 7
            goto L_0x007c
        L_0x005d:
            java.lang.String r12 = "dangalUHD"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r12 = "dangalFHD"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x0071:
            java.lang.String r12 = "dangal"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0083
        L_0x0080:
            r1 = 1
            goto L_0x07a5
        L_0x0083:
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ all -> 0x07ad }
            r12 = 27
            if (r0 > r12) goto L_0x0094
            java.lang.String r0 = "HWEML"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ all -> 0x07ad }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x07ad }
            if (r0 == 0) goto L_0x0094
            goto L_0x0080
        L_0x0094:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ all -> 0x07ad }
            int r13 = r0.hashCode()     // Catch:{ all -> 0x07ad }
            r14 = 8
            switch(r13) {
                case -349662828: goto L_0x00f1;
                case -321033677: goto L_0x00e7;
                case 2006354: goto L_0x00dd;
                case 2006367: goto L_0x00d3;
                case 2006371: goto L_0x00c9;
                case 1785421873: goto L_0x00bf;
                case 1785421876: goto L_0x00b5;
                case 1798172390: goto L_0x00aa;
                case 2119412532: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x00fb
        L_0x00a0:
            java.lang.String r13 = "AFTEUFF014"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 5
            goto L_0x00fc
        L_0x00aa:
            java.lang.String r13 = "AFTSO001"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 8
            goto L_0x00fc
        L_0x00b5:
            java.lang.String r13 = "AFTEU014"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 4
            goto L_0x00fc
        L_0x00bf:
            java.lang.String r13 = "AFTEU011"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 3
            goto L_0x00fc
        L_0x00c9:
            java.lang.String r13 = "AFTR"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 2
            goto L_0x00fc
        L_0x00d3:
            java.lang.String r13 = "AFTN"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 1
            goto L_0x00fc
        L_0x00dd:
            java.lang.String r13 = "AFTA"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 0
            goto L_0x00fc
        L_0x00e7:
            java.lang.String r13 = "AFTKMST12"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 7
            goto L_0x00fc
        L_0x00f1:
            java.lang.String r13 = "AFTJMST12"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00fb
            r13 = 6
            goto L_0x00fc
        L_0x00fb:
            r13 = -1
        L_0x00fc:
            switch(r13) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            int r13 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ all -> 0x07ad }
            r15 = 26
            if (r13 > r15) goto L_0x07a5
            java.lang.String r13 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ all -> 0x07ad }
            int r16 = r13.hashCode()     // Catch:{ all -> 0x07ad }
            switch(r16) {
                case -2144781245: goto L_0x0782;
                case -2144781185: goto L_0x0777;
                case -2144781160: goto L_0x076c;
                case -2097309513: goto L_0x0761;
                case -2022874474: goto L_0x0756;
                case -1978993182: goto L_0x074b;
                case -1978990237: goto L_0x0740;
                case -1936688988: goto L_0x0735;
                case -1936688066: goto L_0x072a;
                case -1936688065: goto L_0x071e;
                case -1931988508: goto L_0x0712;
                case -1885099851: goto L_0x0706;
                case -1696512866: goto L_0x06fa;
                case -1680025915: goto L_0x06ee;
                case -1615810839: goto L_0x06e2;
                case -1600724499: goto L_0x06d6;
                case -1554255044: goto L_0x06ca;
                case -1481772737: goto L_0x06be;
                case -1481772730: goto L_0x06b2;
                case -1481772729: goto L_0x06a6;
                case -1320080169: goto L_0x069a;
                case -1217592143: goto L_0x068e;
                case -1180384755: goto L_0x0682;
                case -1139198265: goto L_0x0676;
                case -1052835013: goto L_0x066a;
                case -993250464: goto L_0x065f;
                case -993250458: goto L_0x0654;
                case -965403638: goto L_0x0648;
                case -958336948: goto L_0x063c;
                case -879245230: goto L_0x0630;
                case -842500323: goto L_0x0624;
                case -821392978: goto L_0x0618;
                case -797483286: goto L_0x060c;
                case -794946968: goto L_0x0600;
                case -788334647: goto L_0x05f4;
                case -782144577: goto L_0x05e8;
                case -575125681: goto L_0x05dc;
                case -521118391: goto L_0x05d0;
                case -430914369: goto L_0x05c4;
                case -290434366: goto L_0x05b8;
                case -282781963: goto L_0x05ac;
                case -277133239: goto L_0x05a0;
                case -173639913: goto L_0x0594;
                case -56598463: goto L_0x0588;
                case 2126: goto L_0x057c;
                case 2564: goto L_0x0570;
                case 2715: goto L_0x0564;
                case 2719: goto L_0x0558;
                case 3091: goto L_0x054c;
                case 3483: goto L_0x0540;
                case 73405: goto L_0x0534;
                case 75537: goto L_0x0528;
                case 75739: goto L_0x051c;
                case 76779: goto L_0x0510;
                case 78669: goto L_0x0504;
                case 79305: goto L_0x04f8;
                case 80618: goto L_0x04ec;
                case 88274: goto L_0x04e0;
                case 98846: goto L_0x04d4;
                case 98848: goto L_0x04c8;
                case 99329: goto L_0x04be;
                case 101481: goto L_0x04b2;
                case 1513190: goto L_0x04a7;
                case 1514184: goto L_0x049c;
                case 1514185: goto L_0x0491;
                case 2133089: goto L_0x0485;
                case 2133091: goto L_0x0479;
                case 2133120: goto L_0x046d;
                case 2133151: goto L_0x0461;
                case 2133182: goto L_0x0455;
                case 2133184: goto L_0x0449;
                case 2436959: goto L_0x043d;
                case 2463773: goto L_0x0431;
                case 2464648: goto L_0x0425;
                case 2689555: goto L_0x0419;
                case 3154429: goto L_0x040d;
                case 3284551: goto L_0x0401;
                case 3351335: goto L_0x03f5;
                case 3386211: goto L_0x03e9;
                case 41325051: goto L_0x03dd;
                case 51349633: goto L_0x03d2;
                case 51350594: goto L_0x03c7;
                case 55178625: goto L_0x03bb;
                case 61542055: goto L_0x03b0;
                case 65355429: goto L_0x03a4;
                case 66214468: goto L_0x0398;
                case 66214470: goto L_0x038c;
                case 66214473: goto L_0x0380;
                case 66215429: goto L_0x0374;
                case 66215431: goto L_0x0368;
                case 66215433: goto L_0x035c;
                case 66216390: goto L_0x0350;
                case 76402249: goto L_0x0344;
                case 76404105: goto L_0x0338;
                case 76404911: goto L_0x032c;
                case 80963634: goto L_0x0320;
                case 82882791: goto L_0x0314;
                case 98715550: goto L_0x0308;
                case 101370885: goto L_0x02fc;
                case 102844228: goto L_0x02f0;
                case 165221241: goto L_0x02e4;
                case 182191441: goto L_0x02d8;
                case 245388979: goto L_0x02cc;
                case 287431619: goto L_0x02c0;
                case 307593612: goto L_0x02b4;
                case 308517133: goto L_0x02a8;
                case 316215098: goto L_0x029c;
                case 316215116: goto L_0x0290;
                case 316246811: goto L_0x0284;
                case 316246818: goto L_0x0278;
                case 407160593: goto L_0x026c;
                case 507412548: goto L_0x0260;
                case 793982701: goto L_0x0254;
                case 794038622: goto L_0x0248;
                case 794040393: goto L_0x023c;
                case 835649806: goto L_0x0230;
                case 917340916: goto L_0x0224;
                case 958008161: goto L_0x0218;
                case 1060579533: goto L_0x020c;
                case 1150207623: goto L_0x0200;
                case 1176899427: goto L_0x01f4;
                case 1280332038: goto L_0x01e8;
                case 1306947716: goto L_0x01dc;
                case 1349174697: goto L_0x01d0;
                case 1522194893: goto L_0x01c4;
                case 1691543273: goto L_0x01b8;
                case 1691544261: goto L_0x01ac;
                case 1709443163: goto L_0x01a0;
                case 1865889110: goto L_0x0194;
                case 1906253259: goto L_0x0188;
                case 1977196784: goto L_0x017c;
                case 2006372676: goto L_0x0170;
                case 2019281702: goto L_0x0164;
                case 2029784656: goto L_0x0158;
                case 2030379515: goto L_0x014c;
                case 2033393791: goto L_0x0140;
                case 2047190025: goto L_0x0134;
                case 2047252157: goto L_0x0128;
                case 2048319463: goto L_0x011c;
                case 2048855701: goto L_0x0110;
                default: goto L_0x010e;
            }
        L_0x010e:
            goto L_0x078d
        L_0x0110:
            java.lang.String r3 = "HWWAS-H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 66
            goto L_0x078e
        L_0x011c:
            java.lang.String r3 = "HWVNS-H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 65
            goto L_0x078e
        L_0x0128:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 33
            goto L_0x078e
        L_0x0134:
            java.lang.String r3 = "ELUGA_Note"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 32
            goto L_0x078e
        L_0x0140:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 14
            goto L_0x078e
        L_0x014c:
            java.lang.String r3 = "HWCAM-H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 64
            goto L_0x078e
        L_0x0158:
            java.lang.String r3 = "HWBLN-H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 63
            goto L_0x078e
        L_0x0164:
            java.lang.String r3 = "DM-01K"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 29
            goto L_0x078e
        L_0x0170:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 19
            goto L_0x078e
        L_0x017c:
            java.lang.String r3 = "Infinix-X572"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 69
            goto L_0x078e
        L_0x0188:
            java.lang.String r3 = "PB2-670M"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 100
            goto L_0x078e
        L_0x0194:
            java.lang.String r3 = "santoni"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 117(0x75, float:1.64E-43)
            goto L_0x078e
        L_0x01a0:
            java.lang.String r3 = "iball8735_9806"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 68
            goto L_0x078e
        L_0x01ac:
            java.lang.String r3 = "CPH1715"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 24
            goto L_0x078e
        L_0x01b8:
            java.lang.String r3 = "CPH1609"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 23
            goto L_0x078e
        L_0x01c4:
            java.lang.String r3 = "woods_f"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 133(0x85, float:1.86E-43)
            goto L_0x078e
        L_0x01d0:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 61
            goto L_0x078e
        L_0x01dc:
            java.lang.String r3 = "EverStar_S"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 35
            goto L_0x078e
        L_0x01e8:
            java.lang.String r3 = "hwALE-H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 62
            goto L_0x078e
        L_0x01f4:
            java.lang.String r3 = "itel_S41"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 71
            goto L_0x078e
        L_0x0200:
            java.lang.String r3 = "LS-5017"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 78
            goto L_0x078e
        L_0x020c:
            java.lang.String r3 = "panell_d"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 96
            goto L_0x078e
        L_0x0218:
            java.lang.String r3 = "j2xlteins"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 72
            goto L_0x078e
        L_0x0224:
            java.lang.String r3 = "A7000plus"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 10
            goto L_0x078e
        L_0x0230:
            java.lang.String r3 = "manning"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 81
            goto L_0x078e
        L_0x023c:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 59
            goto L_0x078e
        L_0x0248:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 58
            goto L_0x078e
        L_0x0254:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 57
            goto L_0x078e
        L_0x0260:
            java.lang.String r3 = "QM16XE_U"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x078e
        L_0x026c:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x078e
        L_0x0278:
            java.lang.String r3 = "TB3-850M"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 125(0x7d, float:1.75E-43)
            goto L_0x078e
        L_0x0284:
            java.lang.String r3 = "TB3-850F"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 124(0x7c, float:1.74E-43)
            goto L_0x078e
        L_0x0290:
            java.lang.String r3 = "TB3-730X"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 123(0x7b, float:1.72E-43)
            goto L_0x078e
        L_0x029c:
            java.lang.String r3 = "TB3-730F"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 122(0x7a, float:1.71E-43)
            goto L_0x078e
        L_0x02a8:
            java.lang.String r3 = "A7020a48"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 12
            goto L_0x078e
        L_0x02b4:
            java.lang.String r3 = "A7010a48"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 11
            goto L_0x078e
        L_0x02c0:
            java.lang.String r3 = "griffin"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 60
            goto L_0x078e
        L_0x02cc:
            java.lang.String r3 = "marino_f"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 82
            goto L_0x078e
        L_0x02d8:
            java.lang.String r3 = "CPY83_I00"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 25
            goto L_0x078e
        L_0x02e4:
            java.lang.String r3 = "A2016a40"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 8
            goto L_0x078e
        L_0x02f0:
            java.lang.String r3 = "le_x6"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 77
            goto L_0x078e
        L_0x02fc:
            java.lang.String r3 = "l5460"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 76
            goto L_0x078e
        L_0x0308:
            java.lang.String r3 = "i9031"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 67
            goto L_0x078e
        L_0x0314:
            java.lang.String r3 = "X3_HK"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x078e
        L_0x0320:
            java.lang.String r3 = "V23GB"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x078e
        L_0x032c:
            java.lang.String r3 = "Q4310"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x078e
        L_0x0338:
            java.lang.String r3 = "Q4260"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x078e
        L_0x0344:
            java.lang.String r3 = "PRO7S"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x078e
        L_0x0350:
            java.lang.String r3 = "F3311"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 48
            goto L_0x078e
        L_0x035c:
            java.lang.String r3 = "F3215"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 47
            goto L_0x078e
        L_0x0368:
            java.lang.String r3 = "F3213"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 46
            goto L_0x078e
        L_0x0374:
            java.lang.String r3 = "F3211"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 45
            goto L_0x078e
        L_0x0380:
            java.lang.String r3 = "F3116"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 44
            goto L_0x078e
        L_0x038c:
            java.lang.String r3 = "F3113"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 43
            goto L_0x078e
        L_0x0398:
            java.lang.String r3 = "F3111"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 42
            goto L_0x078e
        L_0x03a4:
            java.lang.String r3 = "E5643"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 30
            goto L_0x078e
        L_0x03b0:
            java.lang.String r3 = "A1601"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 7
            goto L_0x078e
        L_0x03bb:
            java.lang.String r3 = "Aura_Note_2"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 15
            goto L_0x078e
        L_0x03c7:
            java.lang.String r3 = "602LV"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 4
            goto L_0x078e
        L_0x03d2:
            java.lang.String r3 = "601LV"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 3
            goto L_0x078e
        L_0x03dd:
            java.lang.String r3 = "MEIZU_M5"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 83
            goto L_0x078e
        L_0x03e9:
            java.lang.String r3 = "p212"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 92
            goto L_0x078e
        L_0x03f5:
            java.lang.String r3 = "mido"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 85
            goto L_0x078e
        L_0x0401:
            java.lang.String r3 = "kate"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 75
            goto L_0x078e
        L_0x040d:
            java.lang.String r3 = "fugu"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 50
            goto L_0x078e
        L_0x0419:
            java.lang.String r3 = "XE2X"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 136(0x88, float:1.9E-43)
            goto L_0x078e
        L_0x0425:
            java.lang.String r3 = "Q427"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x078e
        L_0x0431:
            java.lang.String r3 = "Q350"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x078e
        L_0x043d:
            java.lang.String r3 = "P681"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 93
            goto L_0x078e
        L_0x0449:
            java.lang.String r3 = "F04J"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 41
            goto L_0x078e
        L_0x0455:
            java.lang.String r3 = "F04H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 40
            goto L_0x078e
        L_0x0461:
            java.lang.String r3 = "F03H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 39
            goto L_0x078e
        L_0x046d:
            java.lang.String r3 = "F02H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 38
            goto L_0x078e
        L_0x0479:
            java.lang.String r3 = "F01J"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 37
            goto L_0x078e
        L_0x0485:
            java.lang.String r3 = "F01H"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 36
            goto L_0x078e
        L_0x0491:
            java.lang.String r3 = "1714"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 2
            goto L_0x078e
        L_0x049c:
            java.lang.String r3 = "1713"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 1
            goto L_0x078e
        L_0x04a7:
            java.lang.String r3 = "1601"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 0
            goto L_0x078e
        L_0x04b2:
            java.lang.String r3 = "flo"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 49
            goto L_0x078e
        L_0x04be:
            java.lang.String r4 = "deb"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x078d
            goto L_0x078e
        L_0x04c8:
            java.lang.String r3 = "cv3"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 27
            goto L_0x078e
        L_0x04d4:
            java.lang.String r3 = "cv1"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 26
            goto L_0x078e
        L_0x04e0:
            java.lang.String r3 = "Z80"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 139(0x8b, float:1.95E-43)
            goto L_0x078e
        L_0x04ec:
            java.lang.String r3 = "QX1"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x078e
        L_0x04f8:
            java.lang.String r3 = "PLE"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x078e
        L_0x0504:
            java.lang.String r3 = "P85"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 94
            goto L_0x078e
        L_0x0510:
            java.lang.String r3 = "MX6"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 86
            goto L_0x078e
        L_0x051c:
            java.lang.String r3 = "M5c"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 80
            goto L_0x078e
        L_0x0528:
            java.lang.String r3 = "M04"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 79
            goto L_0x078e
        L_0x0534:
            java.lang.String r3 = "JGZ"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 73
            goto L_0x078e
        L_0x0540:
            java.lang.String r3 = "mh"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 84
            goto L_0x078e
        L_0x054c:
            java.lang.String r3 = "b5"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 16
            goto L_0x078e
        L_0x0558:
            java.lang.String r3 = "V5"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x078e
        L_0x0564:
            java.lang.String r3 = "V1"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 127(0x7f, float:1.78E-43)
            goto L_0x078e
        L_0x0570:
            java.lang.String r3 = "Q5"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x078e
        L_0x057c:
            java.lang.String r3 = "C1"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 20
            goto L_0x078e
        L_0x0588:
            java.lang.String r3 = "woods_fn"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 134(0x86, float:1.88E-43)
            goto L_0x078e
        L_0x0594:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 31
            goto L_0x078e
        L_0x05a0:
            java.lang.String r3 = "Z12_PRO"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x078e
        L_0x05ac:
            java.lang.String r3 = "BLACK-1X"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 17
            goto L_0x078e
        L_0x05b8:
            java.lang.String r3 = "taido_row"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x078e
        L_0x05c4:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x078e
        L_0x05d0:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 53
            goto L_0x078e
        L_0x05dc:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 51
            goto L_0x078e
        L_0x05e8:
            java.lang.String r3 = "OnePlus5T"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 91
            goto L_0x078e
        L_0x05f4:
            java.lang.String r3 = "whyred"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 132(0x84, float:1.85E-43)
            goto L_0x078e
        L_0x0600:
            java.lang.String r3 = "watson"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 131(0x83, float:1.84E-43)
            goto L_0x078e
        L_0x060c:
            java.lang.String r3 = "SVP-DTV15"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x078e
        L_0x0618:
            java.lang.String r3 = "A7000-a"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 9
            goto L_0x078e
        L_0x0624:
            java.lang.String r3 = "nicklaus_f"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 88
            goto L_0x078e
        L_0x0630:
            java.lang.String r3 = "tcl_eu"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 126(0x7e, float:1.77E-43)
            goto L_0x078e
        L_0x063c:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 34
            goto L_0x078e
        L_0x0648:
            java.lang.String r3 = "s905x018"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x078e
        L_0x0654:
            java.lang.String r3 = "A10-70L"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 6
            goto L_0x078e
        L_0x065f:
            java.lang.String r3 = "A10-70F"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 5
            goto L_0x078e
        L_0x066a:
            java.lang.String r3 = "namath"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 87
            goto L_0x078e
        L_0x0676:
            java.lang.String r3 = "Slate_Pro"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 118(0x76, float:1.65E-43)
            goto L_0x078e
        L_0x0682:
            java.lang.String r3 = "iris60"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 70
            goto L_0x078e
        L_0x068e:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 18
            goto L_0x078e
        L_0x069a:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 52
            goto L_0x078e
        L_0x06a6:
            java.lang.String r3 = "panell_dt"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 99
            goto L_0x078e
        L_0x06b2:
            java.lang.String r3 = "panell_ds"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 98
            goto L_0x078e
        L_0x06be:
            java.lang.String r3 = "panell_dl"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 97
            goto L_0x078e
        L_0x06ca:
            java.lang.String r3 = "vernee_M5"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x078e
        L_0x06d6:
            java.lang.String r3 = "pacificrim"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 95
            goto L_0x078e
        L_0x06e2:
            java.lang.String r3 = "Phantom6"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x078e
        L_0x06ee:
            java.lang.String r3 = "ComioS1"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 21
            goto L_0x078e
        L_0x06fa:
            java.lang.String r3 = "XT1663"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 137(0x89, float:1.92E-43)
            goto L_0x078e
        L_0x0706:
            java.lang.String r3 = "RAIJIN"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 116(0x74, float:1.63E-43)
            goto L_0x078e
        L_0x0712:
            java.lang.String r3 = "AquaPowerM"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 13
            goto L_0x078e
        L_0x071e:
            java.lang.String r3 = "PGN611"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x078e
        L_0x072a:
            java.lang.String r3 = "PGN610"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x078e
        L_0x0735:
            java.lang.String r3 = "PGN528"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x078e
        L_0x0740:
            java.lang.String r3 = "NX573J"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 90
            goto L_0x078e
        L_0x074b:
            java.lang.String r3 = "NX541J"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 89
            goto L_0x078e
        L_0x0756:
            java.lang.String r3 = "CP8676_I02"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 22
            goto L_0x078e
        L_0x0761:
            java.lang.String r3 = "K50a40"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 74
            goto L_0x078e
        L_0x076c:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 56
            goto L_0x078e
        L_0x0777:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 55
            goto L_0x078e
        L_0x0782:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x078d
            r3 = 54
            goto L_0x078e
        L_0x078d:
            r3 = -1
        L_0x078e:
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 11: goto L_0x0080;
                case 12: goto L_0x0080;
                case 13: goto L_0x0080;
                case 14: goto L_0x0080;
                case 15: goto L_0x0080;
                case 16: goto L_0x0080;
                case 17: goto L_0x0080;
                case 18: goto L_0x0080;
                case 19: goto L_0x0080;
                case 20: goto L_0x0080;
                case 21: goto L_0x0080;
                case 22: goto L_0x0080;
                case 23: goto L_0x0080;
                case 24: goto L_0x0080;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x0080;
                case 29: goto L_0x0080;
                case 30: goto L_0x0080;
                case 31: goto L_0x0080;
                case 32: goto L_0x0080;
                case 33: goto L_0x0080;
                case 34: goto L_0x0080;
                case 35: goto L_0x0080;
                case 36: goto L_0x0080;
                case 37: goto L_0x0080;
                case 38: goto L_0x0080;
                case 39: goto L_0x0080;
                case 40: goto L_0x0080;
                case 41: goto L_0x0080;
                case 42: goto L_0x0080;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0080;
                case 46: goto L_0x0080;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x0080;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x0080;
                case 53: goto L_0x0080;
                case 54: goto L_0x0080;
                case 55: goto L_0x0080;
                case 56: goto L_0x0080;
                case 57: goto L_0x0080;
                case 58: goto L_0x0080;
                case 59: goto L_0x0080;
                case 60: goto L_0x0080;
                case 61: goto L_0x0080;
                case 62: goto L_0x0080;
                case 63: goto L_0x0080;
                case 64: goto L_0x0080;
                case 65: goto L_0x0080;
                case 66: goto L_0x0080;
                case 67: goto L_0x0080;
                case 68: goto L_0x0080;
                case 69: goto L_0x0080;
                case 70: goto L_0x0080;
                case 71: goto L_0x0080;
                case 72: goto L_0x0080;
                case 73: goto L_0x0080;
                case 74: goto L_0x0080;
                case 75: goto L_0x0080;
                case 76: goto L_0x0080;
                case 77: goto L_0x0080;
                case 78: goto L_0x0080;
                case 79: goto L_0x0080;
                case 80: goto L_0x0080;
                case 81: goto L_0x0080;
                case 82: goto L_0x0080;
                case 83: goto L_0x0080;
                case 84: goto L_0x0080;
                case 85: goto L_0x0080;
                case 86: goto L_0x0080;
                case 87: goto L_0x0080;
                case 88: goto L_0x0080;
                case 89: goto L_0x0080;
                case 90: goto L_0x0080;
                case 91: goto L_0x0080;
                case 92: goto L_0x0080;
                case 93: goto L_0x0080;
                case 94: goto L_0x0080;
                case 95: goto L_0x0080;
                case 96: goto L_0x0080;
                case 97: goto L_0x0080;
                case 98: goto L_0x0080;
                case 99: goto L_0x0080;
                case 100: goto L_0x0080;
                case 101: goto L_0x0080;
                case 102: goto L_0x0080;
                case 103: goto L_0x0080;
                case 104: goto L_0x0080;
                case 105: goto L_0x0080;
                case 106: goto L_0x0080;
                case 107: goto L_0x0080;
                case 108: goto L_0x0080;
                case 109: goto L_0x0080;
                case 110: goto L_0x0080;
                case 111: goto L_0x0080;
                case 112: goto L_0x0080;
                case 113: goto L_0x0080;
                case 114: goto L_0x0080;
                case 115: goto L_0x0080;
                case 116: goto L_0x0080;
                case 117: goto L_0x0080;
                case 118: goto L_0x0080;
                case 119: goto L_0x0080;
                case 120: goto L_0x0080;
                case 121: goto L_0x0080;
                case 122: goto L_0x0080;
                case 123: goto L_0x0080;
                case 124: goto L_0x0080;
                case 125: goto L_0x0080;
                case 126: goto L_0x0080;
                case 127: goto L_0x0080;
                case 128: goto L_0x0080;
                case 129: goto L_0x0080;
                case 130: goto L_0x0080;
                case 131: goto L_0x0080;
                case 132: goto L_0x0080;
                case 133: goto L_0x0080;
                case 134: goto L_0x0080;
                case 135: goto L_0x0080;
                case 136: goto L_0x0080;
                case 137: goto L_0x0080;
                case 138: goto L_0x0080;
                case 139: goto L_0x0080;
                default: goto L_0x0791;
            }
        L_0x0791:
            int r3 = r0.hashCode()     // Catch:{ all -> 0x07ad }
            r4 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r3 == r4) goto L_0x079b
            goto L_0x07a5
        L_0x079b:
            java.lang.String r3 = "JSN-L21"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x07a5
            goto L_0x0080
        L_0x07a5:
            zzd = r1     // Catch:{ all -> 0x07ad }
            zzc = r11     // Catch:{ all -> 0x07ad }
        L_0x07a9:
            monitor-exit(r2)     // Catch:{ all -> 0x07ad }
            boolean r0 = zzd
            return r0
        L_0x07ad:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07ad }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzaU(java.lang.String):boolean");
    }

    protected static final boolean zzaV(zzsg zzsg) {
        return zzei.zza >= 35 && zzsg.zzh;
    }

    private final Surface zzaW(zzsg zzsg) {
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            return zzabh.zza();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzsg)) {
            return null;
        }
        zzcw.zzf(zzbc(zzsg));
        zzzs zzzs = this.zzr;
        if (!(zzzs == null || zzzs.zza == zzsg.zzf)) {
            zzba();
        }
        if (this.zzr == null) {
            this.zzr = zzzs.zza(this.zze, zzsg.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context, zzsp zzsp, zzab zzab, boolean z, boolean z2) throws zzsu {
        if (zzab.zzo == null) {
            return zzfxn.zzn();
        }
        if (zzei.zza >= 26 && "video/dolby-vision".equals(zzab.zzo) && !zzzn.zza(context)) {
            List zzc2 = zzta.zzc(zzsp, zzab, z, z2);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zzta.zze(zzsp, zzab, z, z2);
    }

    private final void zzaY() {
        zzcd zzcd = this.zzE;
        if (zzcd != null) {
            this.zzg.zzt(zzcd);
        }
    }

    /* access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r3.equals("video/av01") != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        return ((r0 * r1) * 3) / r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzad(com.google.android.gms.internal.ads.zzsg r10, com.google.android.gms.internal.ads.zzab r11) {
        /*
            int r0 = r11.zzv
            int r1 = r11.zzw
            r2 = -1
            if (r0 == r2) goto L_0x00db
            if (r1 != r2) goto L_0x000b
            goto L_0x00db
        L_0x000b:
            java.lang.String r3 = r11.zzo
            r3.getClass()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 2
            r6 = 1
            java.lang.String r7 = "video/avc"
            java.lang.String r8 = "video/hevc"
            if (r4 == 0) goto L_0x003c
            int r3 = com.google.android.gms.internal.ads.zzta.zza
            android.util.Pair r11 = com.google.android.gms.internal.ads.zzcy.zza(r11)
            if (r11 == 0) goto L_0x003b
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0039
            if (r11 == r6) goto L_0x0039
            if (r11 != r5) goto L_0x003b
        L_0x0039:
            r3 = r7
            goto L_0x003c
        L_0x003b:
            r3 = r8
        L_0x003c:
            int r11 = r3.hashCode()
            r4 = 3
            r9 = 4
            switch(r11) {
                case -1664118616: goto L_0x007d;
                case -1662735862: goto L_0x0074;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0062;
                case 1331836730: goto L_0x005a;
                case 1599127256: goto L_0x0050;
                case 1599127257: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0087
        L_0x0046:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x0087
            r5 = 6
            goto L_0x0088
        L_0x0050:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x0087
            r5 = 3
            goto L_0x0088
        L_0x005a:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L_0x0087
            r5 = 5
            goto L_0x0088
        L_0x0062:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x0087
            r5 = 1
            goto L_0x0088
        L_0x006c:
            boolean r11 = r3.equals(r8)
            if (r11 == 0) goto L_0x0087
            r5 = 4
            goto L_0x0088
        L_0x0074:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x0087
            goto L_0x0088
        L_0x007d:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x0087
            r5 = 0
            goto L_0x0088
        L_0x0087:
            r5 = -1
        L_0x0088:
            switch(r5) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00c9;
                case 5: goto L_0x008f;
                case 6: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00db
        L_0x008c:
            r9 = 8
            goto L_0x00d5
        L_0x008f:
            java.lang.String r11 = "BRAVIA 4K 2015"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzd
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x00db
            java.lang.String r11 = "Amazon"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzc
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00bb
            java.lang.String r11 = "KFSOWI"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzd
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x00db
            java.lang.String r11 = "AFTS"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzd
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00bb
            boolean r10 = r10.zzf
            if (r10 != 0) goto L_0x00db
        L_0x00bb:
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r0 = r0 * r1
            int r0 = r0 * 768
            int r0 = r0 / r9
            return r0
        L_0x00c9:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r10 = java.lang.Math.max(r10, r0)
            return r10
        L_0x00d5:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            return r0
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzad(com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzab):int");
    }

    protected static int zzae(zzsg zzsg, zzab zzab) {
        if (zzab.zzp == -1) {
            return zzad(zzsg, zzab);
        }
        int size = zzab.zzr.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzab.zzr.get(i2)).length;
        }
        return zzab.zzp + i;
    }

    private final void zzba() {
        zzzs zzzs = this.zzr;
        if (zzzs != null) {
            zzzs.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(zzsg zzsg) {
        Surface surface = this.zzq;
        return (surface != null && surface.isValid()) || zzaV(zzsg) || zzbc(zzsg);
    }

    private final boolean zzbc(zzsg zzsg) {
        if (zzei.zza < 23 || zzaU(zzsg.zza)) {
            return false;
        }
        if (!zzsg.zzf || zzzs.zzb(this.zze)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void zzA() {
        zzabh zzabh = this.zzn;
        if (zzabh != null && this.zzf) {
            zzabh.zzl();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = -9223372036854775807L;
            zzba();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0;
        this.zzB = 0;
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzj();
        } else {
            this.zzi.zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzE() {
        if (this.zzx > 0) {
            long zzb2 = zzi().zzb();
            this.zzg.zzd(this.zzx, zzb2 - this.zzw);
            this.zzx = 0;
            this.zzw = zzb2;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0;
            this.zzB = 0;
        }
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzk();
        } else {
            this.zzi.zzh();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzF(zzab[] zzabArr, long j, long j2, zzug zzug) throws zzib {
        super.zzF(zzabArr, j, j2, zzug);
        if (this.zzI == -9223372036854775807L) {
            this.zzI = j;
        }
        zzbq zzh2 = zzh();
        if (zzh2.zzo()) {
            this.zzJ = -9223372036854775807L;
            return;
        }
        zzug zzug2 = zzug;
        this.zzJ = zzh2.zzn(zzug.zza, new zzbo()).zzd;
    }

    public final void zzM(float f, float f2) throws zzib {
        super.zzM(f, f2);
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzq(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    public final void zzV(long j, long j2) throws zzib {
        super.zzV(j, j2);
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            try {
                zzabh.zzm(j, j2);
            } catch (zzabg e) {
                throw zzcW(e, e.zza, false, 7001);
            }
        }
    }

    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        zzabh zzabh = this.zzn;
        if (zzabh == null) {
            return true;
        }
        zzabh.zzv();
        return false;
    }

    public final boolean zzX() {
        boolean zzX = super.zzX();
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            return zzabh.zzx(zzX);
        }
        if (!zzX || (zzaz() != null && this.zzq != null)) {
            return this.zzi.zzo(zzX);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final float zzZ(float f, zzab zzab, zzab[] zzabArr) {
        float f2 = -1.0f;
        for (zzab zzab2 : zzabArr) {
            float f3 = zzab2.zzx;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    public final zzsf zzaA(Throwable th, zzsg zzsg) {
        return new zzzk(th, zzsg, this.zzq);
    }

    /* access modifiers changed from: protected */
    public final void zzaD(long j) {
        super.zzaD(j);
        this.zzz--;
    }

    /* access modifiers changed from: protected */
    public final void zzaE(zzhh zzhh) throws zzib {
        this.zzz++;
        int i = zzei.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzaF(zzab zzab) throws zzib {
        zzabh zzabh = this.zzn;
        if (zzabh != null && !zzabh.zzw()) {
            try {
                zzabh.zze(zzab);
            } catch (zzabg e) {
                throw zzcW(e, zzab, false, 7000);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaN(zzsg zzsg) {
        return zzbb(zzsg);
    }

    /* access modifiers changed from: protected */
    public final boolean zzaO(zzhh zzhh) {
        if (zzhh.zzi() && !zzQ() && !zzhh.zzh() && this.zzJ != -9223372036854775807L) {
            return this.zzJ - (zzhh.zze - zzav()) > 100000 && !zzhh.zzl() && zzhh.zze < zzf();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaQ(zzsd zzsd, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsd.zzo(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    /* access modifiers changed from: protected */
    public final void zzaR(int i, int i2) {
        zzhs zzhs = this.zza;
        zzhs.zzh += i;
        int i3 = i + i2;
        zzhs.zzg += i3;
        this.zzx += i3;
        int i4 = this.zzy + i3;
        this.zzy = i4;
        zzhs.zzi = Math.max(i4, zzhs.zzi);
    }

    /* access modifiers changed from: protected */
    public final void zzaS(long j) {
        zzhs zzhs = this.zza;
        zzhs.zzk += j;
        zzhs.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaT(long j, boolean z) throws zzib {
        int zzd2 = zzd(j);
        if (zzd2 == 0) {
            return false;
        }
        if (z) {
            zzhs zzhs = this.zza;
            zzhs.zzd += zzd2;
            zzhs.zzf += this.zzz;
        } else {
            this.zza.zzj++;
            zzaR(zzd2, this.zzz);
        }
        zzaJ();
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzd(false);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final int zzaa(zzsp zzsp, zzab zzab) throws zzsu {
        boolean z;
        int i = 128;
        if (!zzbb.zzi(zzab.zzo)) {
            return 128;
        }
        Context context = this.zze;
        int i2 = 0;
        boolean z2 = zzab.zzs != null;
        List zzaX = zzaX(context, zzsp, zzab, z2, false);
        if (z2 && zzaX.isEmpty()) {
            zzaX = zzaX(context, zzsp, zzab, false, false);
        }
        if (zzaX.isEmpty()) {
            return 129;
        }
        if (!zzaP(zzab)) {
            return 130;
        }
        zzsg zzsg = (zzsg) zzaX.get(0);
        boolean zze2 = zzsg.zze(zzab);
        if (!zze2) {
            int i3 = 1;
            while (true) {
                if (i3 >= zzaX.size()) {
                    break;
                }
                zzsg zzsg2 = (zzsg) zzaX.get(i3);
                if (zzsg2.zze(zzab)) {
                    zzsg = zzsg2;
                    z = false;
                    zze2 = true;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != zze2 ? 3 : 4;
        int i5 = true != zzsg.zzf(zzab) ? 8 : 16;
        int i6 = true != zzsg.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (zzei.zza >= 26 && "video/dolby-vision".equals(zzab.zzo) && !zzzn.zza(context)) {
            i = 256;
        }
        if (zze2) {
            List zzaX2 = zzaX(context, zzsp, zzab, z2, true);
            if (!zzaX2.isEmpty()) {
                zzsg zzsg3 = (zzsg) zzta.zzf(zzaX2, zzab).get(0);
                if (zzsg3.zze(zzab) && zzsg3.zzf(zzab)) {
                    i2 = 32;
                }
            }
        }
        return i | i4 | i5 | i2 | i6;
    }

    /* access modifiers changed from: protected */
    public final zzht zzab(zzsg zzsg, zzab zzab, zzab zzab2) {
        int i;
        int i2;
        zzht zzb2 = zzsg.zzb(zzab, zzab2);
        int i3 = zzb2.zze;
        zzzo zzzo = this.zzk;
        zzzo.getClass();
        zzzo zzzo2 = zzzo;
        if (zzab2.zzv > zzzo.zza || zzab2.zzw > zzzo.zzb) {
            i3 |= 256;
        }
        if (zzae(zzsg, zzab2) > zzzo.zzc) {
            i3 |= 64;
        }
        String str = zzsg.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i = 0;
        }
        return new zzht(str, zzab, zzab2, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zzht zzac(zzke zzke) throws zzib {
        zzht zzac = super.zzac(zzke);
        zzab zzab = zzke.zza;
        zzab.getClass();
        zzab zzab2 = zzab;
        this.zzg.zzf(zzab, zzac);
        return zzac;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r3 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzsa zzaf(com.google.android.gms.internal.ads.zzsg r19, com.google.android.gms.internal.ads.zzab r20, android.media.MediaCrypto r21, float r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            com.google.android.gms.internal.ads.zzab[] r4 = r18.zzT()
            int r5 = r4.length
            int r6 = zzae(r19, r20)
            int r7 = r2.zzv
            int r8 = r2.zzw
            r10 = -1
            r12 = 1
            if (r5 != r12) goto L_0x002d
            if (r6 == r10) goto L_0x0122
            int r4 = zzad(r19, r20)
            if (r4 == r10) goto L_0x0122
            float r5 = (float) r6
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = java.lang.Math.min(r5, r4)
            goto L_0x0122
        L_0x002d:
            r13 = 0
            r14 = 0
        L_0x002f:
            if (r13 >= r5) goto L_0x0072
            r15 = r4[r13]
            com.google.android.gms.internal.ads.zzk r9 = r2.zzC
            if (r9 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzk r9 = r15.zzC
            if (r9 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzz r9 = r15.zzb()
            com.google.android.gms.internal.ads.zzk r15 = r2.zzC
            r9.zzB(r15)
            com.google.android.gms.internal.ads.zzab r15 = r9.zzag()
        L_0x0048:
            com.google.android.gms.internal.ads.zzht r9 = r1.zzb(r2, r15)
            int r9 = r9.zzd
            if (r9 == 0) goto L_0x006f
            int r9 = r15.zzv
            if (r9 == r10) goto L_0x005b
            int r11 = r15.zzw
            if (r11 != r10) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r11 = 0
            goto L_0x005c
        L_0x005b:
            r11 = 1
        L_0x005c:
            r14 = r14 | r11
            int r7 = java.lang.Math.max(r7, r9)
            int r9 = r15.zzw
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = zzae(r1, r15)
            int r6 = java.lang.Math.max(r6, r9)
        L_0x006f:
            int r13 = r13 + 1
            goto L_0x002f
        L_0x0072:
            if (r14 == 0) goto L_0x0122
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Resolutions unknown. Codec max resolution: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = "x"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "MediaCodecVideoRenderer"
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r4)
            int r4 = r2.zzw
            int r10 = r2.zzv
            if (r4 <= r10) goto L_0x0097
            r11 = 1
            goto L_0x0098
        L_0x0097:
            r11 = 0
        L_0x0098:
            if (r11 == 0) goto L_0x009c
            r13 = r4
            goto L_0x009d
        L_0x009c:
            r13 = r10
        L_0x009d:
            if (r12 != r11) goto L_0x00a0
            r4 = r10
        L_0x00a0:
            int[] r10 = zzb
            r14 = 0
        L_0x00a3:
            r15 = 9
            if (r14 >= r15) goto L_0x00e6
            float r15 = (float) r4
            float r12 = (float) r13
            r3 = r10[r14]
            r16 = r10
            float r10 = (float) r3
            if (r3 <= r13) goto L_0x00e6
            float r15 = r15 / r12
            float r10 = r10 * r15
            int r10 = (int) r10
            if (r10 > r4) goto L_0x00b7
            goto L_0x00e6
        L_0x00b7:
            r12 = 1
            if (r12 == r11) goto L_0x00bc
            r15 = r3
            goto L_0x00bd
        L_0x00bc:
            r15 = r10
        L_0x00bd:
            if (r12 != r11) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r3 = r10
        L_0x00c1:
            android.graphics.Point r3 = r1.zza(r15, r3)
            float r10 = r2.zzx
            if (r3 == 0) goto L_0x00d8
            r12 = r11
            double r10 = (double) r10
            int r15 = r3.x
            r17 = r4
            int r4 = r3.y
            boolean r4 = r1.zzg(r15, r4, r10)
            if (r4 == 0) goto L_0x00db
            goto L_0x00e7
        L_0x00d8:
            r17 = r4
            r12 = r11
        L_0x00db:
            int r14 = r14 + 1
            r3 = r22
            r11 = r12
            r10 = r16
            r4 = r17
            r12 = 1
            goto L_0x00a3
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            if (r3 == 0) goto L_0x0122
            int r4 = r3.x
            int r7 = java.lang.Math.max(r7, r4)
            int r3 = r3.y
            int r8 = java.lang.Math.max(r8, r3)
            com.google.android.gms.internal.ads.zzz r3 = r20.zzb()
            r3.zzaf(r7)
            r3.zzK(r8)
            com.google.android.gms.internal.ads.zzab r3 = r3.zzag()
            int r3 = zzad(r1, r3)
            int r6 = java.lang.Math.max(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.<init>(r4)
            r3.append(r7)
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r3)
        L_0x0122:
            java.lang.String r3 = r1.zzc
            com.google.android.gms.internal.ads.zzzo r4 = new com.google.android.gms.internal.ads.zzzo
            r4.<init>(r7, r8, r6)
            r0.zzk = r4
            boolean r5 = r0.zzh
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r3)
            int r3 = r2.zzv
            java.lang.String r7 = "width"
            r6.setInteger(r7, r3)
            int r3 = r2.zzw
            java.lang.String r7 = "height"
            r6.setInteger(r7, r3)
            java.util.List r3 = r2.zzr
            com.google.android.gms.internal.ads.zzdr.zzb(r6, r3)
            float r3 = r2.zzx
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0157
            java.lang.String r8 = "frame-rate"
            r6.setFloat(r8, r3)
        L_0x0157:
            int r3 = r2.zzy
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.zzdr.zza(r6, r8, r3)
            com.google.android.gms.internal.ads.zzk r3 = r2.zzC
            if (r3 == 0) goto L_0x0184
            java.lang.String r8 = "color-transfer"
            int r9 = r3.zzd
            com.google.android.gms.internal.ads.zzdr.zza(r6, r8, r9)
            java.lang.String r8 = "color-standard"
            int r9 = r3.zzb
            com.google.android.gms.internal.ads.zzdr.zza(r6, r8, r9)
            java.lang.String r8 = "color-range"
            int r9 = r3.zzc
            com.google.android.gms.internal.ads.zzdr.zza(r6, r8, r9)
            byte[] r3 = r3.zze
            if (r3 == 0) goto L_0x0184
            java.lang.String r8 = "hdr-static-info"
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r6.setByteBuffer(r8, r3)
        L_0x0184:
            java.lang.String r3 = r2.zzo
            java.lang.String r8 = "video/dolby-vision"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x01a3
            int r3 = com.google.android.gms.internal.ads.zzta.zza
            android.util.Pair r3 = com.google.android.gms.internal.ads.zzcy.zza(r20)
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.zzdr.zza(r6, r8, r3)
        L_0x01a3:
            int r3 = r4.zza
            java.lang.String r8 = "max-width"
            r6.setInteger(r8, r3)
            int r3 = r4.zzb
            java.lang.String r8 = "max-height"
            r6.setInteger(r8, r3)
            int r3 = r4.zzc
            java.lang.String r4 = "max-input-size"
            com.google.android.gms.internal.ads.zzdr.zza(r6, r4, r3)
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            r4 = 23
            if (r3 < r4) goto L_0x01cf
            java.lang.String r3 = "priority"
            r4 = 0
            r6.setInteger(r3, r4)
            r3 = r22
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x01cf
            java.lang.String r4 = "operating-rate"
            r6.setFloat(r4, r3)
        L_0x01cf:
            if (r5 == 0) goto L_0x01de
            java.lang.String r3 = "no-post-process"
            r4 = 1
            r6.setInteger(r3, r4)
            java.lang.String r3 = "auto-frc"
            r4 = 0
            r6.setInteger(r3, r4)
            goto L_0x01df
        L_0x01de:
            r4 = 0
        L_0x01df:
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 35
            if (r3 < r5) goto L_0x01f1
            int r3 = r0.zzF
            int r3 = -r3
            int r3 = java.lang.Math.max(r4, r3)
            java.lang.String r4 = "importance"
            r6.setInteger(r4, r3)
        L_0x01f1:
            android.view.Surface r3 = r18.zzaW(r19)
            com.google.android.gms.internal.ads.zzabh r4 = r0.zzn
            if (r4 == 0) goto L_0x0207
            android.content.Context r4 = r0.zze
            boolean r4 = com.google.android.gms.internal.ads.zzei.zzK(r4)
            if (r4 != 0) goto L_0x0207
            java.lang.String r4 = "allow-frame-drop"
            r5 = 0
            r6.setInteger(r4, r5)
        L_0x0207:
            r4 = 0
            com.google.android.gms.internal.ads.zzsa r1 = com.google.android.gms.internal.ads.zzsa.zzb(r1, r6, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzaf(com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzab, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsa");
    }

    /* access modifiers changed from: protected */
    public final List zzag(zzsp zzsp, zzab zzab, boolean z) throws zzsu {
        return zzta.zzf(zzaX(this.zze, zzsp, zzab, false, false), zzab);
    }

    /* access modifiers changed from: protected */
    public final void zzaj(zzhh zzhh) throws zzib {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhh.zzf;
            byteBuffer.getClass();
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzsd zzaz = zzaz();
                    zzaz.getClass();
                    zzsd zzsd = zzaz;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaz.zzq(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzak(Exception exc) {
        zzdo.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzal(String str, zzsa zzsa, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaU(str);
        zzsg zzaB = zzaB();
        zzaB.getClass();
        zzsg zzsg = zzaB;
        boolean z = false;
        if (zzei.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaB.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh2 = zzaB.zzh();
            int length = zzh2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzh2[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzm = z;
    }

    /* access modifiers changed from: protected */
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    /* access modifiers changed from: protected */
    public final void zzan(zzab zzab, MediaFormat mediaFormat) {
        int i;
        int i2;
        zzsd zzaz = zzaz();
        if (zzaz != null) {
            zzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        float f = zzab.zzz;
        if (zzei.zza >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f = ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        }
        int i3 = zzab.zzy;
        if (i3 == 90 || i3 == 270) {
            f = 1.0f / f;
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        this.zzD = new zzcd(i, i2, f);
        zzabh zzabh = this.zzn;
        if (zzabh == null || !this.zzK) {
            this.zzi.zzl(zzab.zzx);
        } else {
            zzz zzb2 = zzab.zzb();
            zzb2.zzaf(i);
            zzb2.zzK(i2);
            zzb2.zzW(f);
            zzabh.zzg(1, zzb2.zzag());
        }
        this.zzK = false;
    }

    /* access modifiers changed from: protected */
    public final void zzao(zzsd zzsd, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsd.zzn(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzcd zzcd = this.zzD;
            if (!zzcd.equals(zzcd.zza) && !zzcd.equals(this.zzE)) {
                this.zzE = zzcd;
                this.zzg.zzt(zzcd);
            }
            if (this.zzi.zzp() && this.zzq != null) {
                zzaZ();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzr(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    /* access modifiers changed from: protected */
    public final int zzau(zzhh zzhh) {
        int i = zzei.zza;
        return 0;
    }

    public final void zzt() {
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzc();
        } else {
            this.zzi.zzb();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        this.zzE = null;
        this.zzJ = -9223372036854775807L;
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzh();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzcd.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy(boolean z, boolean z2) throws zzib {
        super.zzy(z, z2);
        zzn();
        this.zzg.zze(this.zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzw zzzw = new zzzw(this.zze, this.zzi);
                zzzw.zzd(zzi());
                this.zzn = zzzw.zze().zzh();
            }
            this.zzo = true;
        }
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzo(new zzzl(this), zzgcz.zzc());
            zzaai zzaai = this.zzH;
            if (zzaai != null) {
                this.zzn.zzt(zzaai);
            }
            if (this.zzq != null && !this.zzs.equals(zzdz.zza)) {
                this.zzn.zzp(this.zzq, this.zzs);
            }
            this.zzn.zzn(this.zzv);
            this.zzn.zzq(zzat());
            List list = this.zzp;
            if (list != null) {
                this.zzn.zzs(list);
            }
            this.zzn.zzi(z2);
            return;
        }
        this.zzi.zzk(zzi());
        this.zzi.zze(z2);
    }

    /* access modifiers changed from: protected */
    public final void zzz(long j, boolean z) throws zzib {
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            zzabh.zzd(true);
            this.zzn.zzr(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j, z);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z) {
            zzabh zzabh2 = this.zzn;
            if (zzabh2 != null) {
                zzabh2.zzf(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzar(long j, long j2, zzsd zzsd, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzab) throws zzib {
        boolean z3;
        zzsd zzsd2 = zzsd;
        int i4 = i;
        zzsd.getClass();
        long zzav = j3 - zzav();
        zzabh zzabh = this.zzn;
        if (zzabh != null) {
            try {
                z3 = false;
                try {
                    return zzabh.zzu(j3 + (-this.zzI), z2, j, j2, new zzzm(this, zzsd, i, zzav));
                } catch (zzabg e) {
                    e = e;
                    throw zzcW(e, e.zza, z3, 7001);
                }
            } catch (zzabg e2) {
                e = e2;
                z3 = false;
                throw zzcW(e, e.zza, z3, 7001);
            }
        } else {
            int zza = this.zzi.zza(j3, j, j2, zzaw(), z2, this.zzj);
            if (zza == 4) {
                return false;
            }
            if (z && !z2) {
                zzaQ(zzsd2, i4, zzav);
                return true;
            } else if (this.zzq == null) {
                if (this.zzj.zzc() >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    return false;
                }
                zzaQ(zzsd2, i4, zzav);
                zzaS(this.zzj.zzc());
                return true;
            } else if (zza == 0) {
                zzao(zzsd, i, zzav, zzi().zzc());
                zzaS(this.zzj.zzc());
                return true;
            } else if (zza == 1) {
                zzaaj zzaaj = this.zzj;
                zzsd zzsd3 = zzsd2;
                long zzd2 = zzaaj.zzd();
                long zzc2 = zzaaj.zzc();
                if (zzd2 == this.zzC) {
                    zzaQ(zzsd2, i4, zzav);
                } else {
                    zzao(zzsd, i, zzav, zzd2);
                }
                zzaS(zzc2);
                this.zzC = zzd2;
                return true;
            } else if (zza == 2) {
                Trace.beginSection("dropVideoBuffer");
                zzsd2.zzo(i4, false);
                Trace.endSection();
                zzaR(0, 1);
                zzaS(this.zzj.zzc());
                return true;
            } else if (zza == 3) {
                zzaQ(zzsd2, i4, zzav);
                zzaS(this.zzj.zzc());
                return true;
            } else if (zza == 5) {
                return false;
            } else {
                throw new IllegalStateException(String.valueOf(zza));
            }
        }
    }

    public final void zzu(int i, Object obj) throws zzib {
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.zzq != surface) {
                this.zzq = surface;
                if (this.zzn == null) {
                    this.zzi.zzm(surface);
                }
                this.zzt = false;
                int zzcT = zzcT();
                zzsd zzaz = zzaz();
                if (zzaz != null && this.zzn == null) {
                    zzsg zzaB = zzaB();
                    zzaB.getClass();
                    zzsg zzsg = zzaB;
                    boolean zzbb = zzbb(zzaB);
                    if (zzei.zza < 23 || !zzbb || this.zzl) {
                        zzaG();
                        zzaC();
                    } else {
                        Surface zzaW = zzaW(zzaB);
                        if (zzei.zza >= 23 && zzaW != null) {
                            zzaz.zzp(zzaW);
                        } else if (zzei.zza >= 35) {
                            zzaz.zzi();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (surface != null) {
                    zzaY();
                    if (zzcT == 2) {
                        zzabh zzabh = this.zzn;
                        if (zzabh != null) {
                            zzabh.zzf(true);
                        } else {
                            this.zzi.zzc(true);
                        }
                    }
                } else {
                    this.zzE = null;
                    zzabh zzabh2 = this.zzn;
                    if (zzabh2 != null) {
                        zzabh2.zzb();
                    }
                }
            } else if (surface != null) {
                zzaY();
                Surface surface2 = this.zzq;
                if (surface2 != null && this.zzt) {
                    this.zzg.zzq(surface2);
                }
            }
        } else if (i == 7) {
            obj.getClass();
            zzaai zzaai = (zzaai) obj;
            this.zzH = zzaai;
            zzabh zzabh3 = this.zzn;
            if (zzabh3 != null) {
                zzabh3.zzt(zzaai);
            }
        } else if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzG != intValue) {
                this.zzG = intValue;
            }
        } else if (i == 16) {
            obj.getClass();
            this.zzF = ((Integer) obj).intValue();
            zzsd zzaz2 = zzaz();
            if (zzaz2 != null && zzei.zza >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.zzF));
                zzaz2.zzq(bundle);
            }
        } else if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzu = intValue2;
            zzsd zzaz3 = zzaz();
            if (zzaz3 != null) {
                zzaz3.zzr(intValue2);
            }
        } else if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzv = intValue3;
            zzabh zzabh4 = this.zzn;
            if (zzabh4 != null) {
                zzabh4.zzn(intValue3);
            } else {
                this.zzi.zzj(intValue3);
            }
        } else if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzp = list;
            zzabh zzabh5 = this.zzn;
            if (zzabh5 != null) {
                zzabh5.zzs(list);
            }
        } else if (i != 14) {
            super.zzu(i, obj);
        } else {
            obj.getClass();
            zzdz zzdz = (zzdz) obj;
            if (zzdz.zzb() != 0 && zzdz.zza() != 0) {
                this.zzs = zzdz;
                zzabh zzabh6 = this.zzn;
                if (zzabh6 != null) {
                    Surface surface3 = this.zzq;
                    zzcw.zzb(surface3);
                    Surface surface4 = surface3;
                    zzabh6.zzp(surface3, zzdz);
                }
            }
        }
    }
}

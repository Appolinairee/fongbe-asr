package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzw;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbo {
    public final zzbxr zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcm zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtk zzad;
    public final zzu zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final zzv zzax;
    public final zzw zzay;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbwi zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfbt zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x078c, code lost:
        r10 = r85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08f7, code lost:
        r10 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08f9, code lost:
        r9 = r83;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfbo(android.util.JsonReader r85) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r84 = this;
            r0 = r84
            r84.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.zzfxn.zzn()
            com.google.android.gms.internal.ads.zzfxn r21 = com.google.android.gms.internal.ads.zzfxn.zzn()
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r85.beginObject()
            r23 = 0
            r24 = 0
            java.lang.String r25 = ""
            r26 = -1
            r27 = r16
            r28 = r17
            r29 = r18
            r30 = r19
            r31 = r20
            r32 = r21
            r33 = r22
            r19 = r23
            r34 = r19
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r41 = r25
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r56 = r45
            r60 = r56
            r62 = r60
            r64 = r62
            r66 = r64
            r67 = r66
            r68 = r67
            r69 = r68
            r70 = r69
            r75 = r70
            r76 = r75
            r77 = r76
            r81 = r77
            r40 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = -1
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r61 = -1
            r63 = 0
            r65 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r82 = 0
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r15 = r39
            r11 = r81
            r12 = r11
            r13 = 0
            r14 = 0
        L_0x00f5:
            boolean r22 = r85.hasNext()
            if (r22 == 0) goto L_0x08fd
            java.lang.String r22 = r85.nextName()
            if (r22 != 0) goto L_0x0104
            r23 = r25
            goto L_0x0106
        L_0x0104:
            r23 = r22
        L_0x0106:
            int r22 = r23.hashCode()
            switch(r22) {
                case -2138196627: goto L_0x0682;
                case -1980587809: goto L_0x0671;
                case -1965512151: goto L_0x0660;
                case -1964744830: goto L_0x064f;
                case -1871425831: goto L_0x063e;
                case -1843156475: goto L_0x062d;
                case -1828733410: goto L_0x061b;
                case -1812055556: goto L_0x0609;
                case -1785028569: goto L_0x05f7;
                case -1776946669: goto L_0x05e5;
                case -1662989631: goto L_0x05d3;
                case -1620470467: goto L_0x05c1;
                case -1550155393: goto L_0x05af;
                case -1440104884: goto L_0x059d;
                case -1439500848: goto L_0x058b;
                case -1428969291: goto L_0x0579;
                case -1406227629: goto L_0x0567;
                case -1403779768: goto L_0x0555;
                case -1375413093: goto L_0x0543;
                case -1360811658: goto L_0x0531;
                case -1306015996: goto L_0x051f;
                case -1303332046: goto L_0x050d;
                case -1289032093: goto L_0x04fb;
                case -1240082064: goto L_0x04e9;
                case -1234181075: goto L_0x04d7;
                case -1168140544: goto L_0x04c5;
                case -1152230954: goto L_0x04b4;
                case -1146534047: goto L_0x04a2;
                case -1115838944: goto L_0x0490;
                case -1081936678: goto L_0x047e;
                case -1078050970: goto L_0x046c;
                case -1051269058: goto L_0x045a;
                case -982608540: goto L_0x0448;
                case -972056451: goto L_0x0436;
                case -776859333: goto L_0x0425;
                case -570101180: goto L_0x0413;
                case -544216775: goto L_0x0401;
                case -437057161: goto L_0x03f0;
                case -404433734: goto L_0x03de;
                case -404326515: goto L_0x03cc;
                case -397704715: goto L_0x03ba;
                case -388807511: goto L_0x03a8;
                case -369773488: goto L_0x0396;
                case -213449460: goto L_0x0384;
                case -213424028: goto L_0x0372;
                case -180214626: goto L_0x0360;
                case -154616268: goto L_0x034e;
                case -29338502: goto L_0x033c;
                case 3107: goto L_0x032a;
                case 3355: goto L_0x0318;
                case 3076010: goto L_0x0306;
                case 37109963: goto L_0x02f4;
                case 63195984: goto L_0x02e2;
                case 107433883: goto L_0x02d0;
                case 230323073: goto L_0x02bf;
                case 418392395: goto L_0x02ad;
                case 542250332: goto L_0x029b;
                case 549176928: goto L_0x0289;
                case 597473788: goto L_0x0277;
                case 754887508: goto L_0x0265;
                case 791122864: goto L_0x0254;
                case 805095541: goto L_0x0242;
                case 1010584092: goto L_0x0230;
                case 1100650276: goto L_0x021e;
                case 1141602460: goto L_0x020c;
                case 1186014765: goto L_0x01fa;
                case 1321720943: goto L_0x01e8;
                case 1422388341: goto L_0x01d6;
                case 1437255331: goto L_0x01c4;
                case 1637553475: goto L_0x01b2;
                case 1638957285: goto L_0x01a1;
                case 1686319423: goto L_0x018f;
                case 1688341040: goto L_0x017e;
                case 1799285870: goto L_0x016c;
                case 1839650832: goto L_0x015b;
                case 1875425491: goto L_0x0149;
                case 2068142375: goto L_0x0137;
                case 2072888499: goto L_0x0125;
                case 2075506442: goto L_0x0113;
                default: goto L_0x010d;
            }
        L_0x010d:
            r83 = r9
            r22 = r10
            goto L_0x0693
        L_0x0113:
            r22 = r10
            java.lang.String r10 = "render_serially"
            r83 = r9
            r9 = r23
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 75
            goto L_0x0694
        L_0x0125:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "manual_tracking_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 15
            goto L_0x0694
        L_0x0137:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 52
            goto L_0x0694
        L_0x0149:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 42
            goto L_0x0694
        L_0x015b:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 0
            goto L_0x0694
        L_0x016c:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 48
            goto L_0x0694
        L_0x017e:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 7
            goto L_0x0694
        L_0x018f:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 55
            goto L_0x0694
        L_0x01a1:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 6
            goto L_0x0694
        L_0x01b2:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 40
            goto L_0x0694
        L_0x01c4:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 58
            goto L_0x0694
        L_0x01d6:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_collapsible"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 70
            goto L_0x0694
        L_0x01e8:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 31
            goto L_0x0694
        L_0x01fa:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 66
            goto L_0x0694
        L_0x020c:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "adapter_response_info_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 56
            goto L_0x0694
        L_0x021e:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 11
            goto L_0x0694
        L_0x0230:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 9
            goto L_0x0694
        L_0x0242:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "analytics_event_name_to_parameters_map"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 76
            goto L_0x0694
        L_0x0254:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 5
            goto L_0x0694
        L_0x0265:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 17
            goto L_0x0694
        L_0x0277:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 27
            goto L_0x0694
        L_0x0289:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 16
            goto L_0x0694
        L_0x029b:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "consent_form_action_identifier"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 72
            goto L_0x0694
        L_0x02ad:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 36
            goto L_0x0694
        L_0x02bf:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 4
            goto L_0x0694
        L_0x02d0:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 24
            goto L_0x0694
        L_0x02e2:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 33
            goto L_0x0694
        L_0x02f4:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 68
            goto L_0x0694
        L_0x0306:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 22
            goto L_0x0694
        L_0x0318:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 23
            goto L_0x0694
        L_0x032a:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 18
            goto L_0x0694
        L_0x033c:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 32
            goto L_0x0694
        L_0x034e:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 61
            goto L_0x0694
        L_0x0360:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 63
            goto L_0x0694
        L_0x0372:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 46
            goto L_0x0694
        L_0x0384:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 65
            goto L_0x0694
        L_0x0396:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 50
            goto L_0x0694
        L_0x03a8:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 64
            goto L_0x0694
        L_0x03ba:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 45
            goto L_0x0694
        L_0x03cc:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 38
            goto L_0x0694
        L_0x03de:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 62
            goto L_0x0694
        L_0x03f0:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 3
            goto L_0x0694
        L_0x0401:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 26
            goto L_0x0694
        L_0x0413:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "late_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 74
            goto L_0x0694
        L_0x0425:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 2
            goto L_0x0694
        L_0x0436:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 60
            goto L_0x0694
        L_0x0448:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 10
            goto L_0x0694
        L_0x045a:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 25
            goto L_0x0694
        L_0x046c:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 8
            goto L_0x0694
        L_0x047e:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 21
            goto L_0x0694
        L_0x0490:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 12
            goto L_0x0694
        L_0x04a2:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 43
            goto L_0x0694
        L_0x04b4:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 1
            goto L_0x0694
        L_0x04c5:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 14
            goto L_0x0694
        L_0x04d7:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 30
            goto L_0x0694
        L_0x04e9:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 51
            goto L_0x0694
        L_0x04fb:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 29
            goto L_0x0694
        L_0x050d:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 34
            goto L_0x0694
        L_0x051f:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 20
            goto L_0x0694
        L_0x0531:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 19
            goto L_0x0694
        L_0x0543:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 54
            goto L_0x0694
        L_0x0555:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 44
            goto L_0x0694
        L_0x0567:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 67
            goto L_0x0694
        L_0x0579:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 39
            goto L_0x0694
        L_0x058b:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 37
            goto L_0x0694
        L_0x059d:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 35
            goto L_0x0694
        L_0x05af:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 13
            goto L_0x0694
        L_0x05c1:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 47
            goto L_0x0694
        L_0x05d3:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 53
            goto L_0x0694
        L_0x05e5:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 57
            goto L_0x0694
        L_0x05f7:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "parallel_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 73
            goto L_0x0694
        L_0x0609:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 49
            goto L_0x0694
        L_0x061b:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "network_ping_config"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 77
            goto L_0x0694
        L_0x062d:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_consent"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 71
            goto L_0x0694
        L_0x063e:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "recursive_server_response_data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 69
            goto L_0x0694
        L_0x064f:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "offline_ad_config"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 78
            goto L_0x0694
        L_0x0660:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 41
            goto L_0x0694
        L_0x0671:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 28
            goto L_0x0694
        L_0x0682:
            r83 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0693
            r9 = 59
            goto L_0x0694
        L_0x0693:
            r9 = -1
        L_0x0694:
            switch(r9) {
                case 0: goto L_0x08f1;
                case 1: goto L_0x08e6;
                case 2: goto L_0x08df;
                case 3: goto L_0x08d8;
                case 4: goto L_0x08d1;
                case 5: goto L_0x08c6;
                case 6: goto L_0x08bf;
                case 7: goto L_0x08b8;
                case 8: goto L_0x08b1;
                case 9: goto L_0x08aa;
                case 10: goto L_0x08a3;
                case 11: goto L_0x0898;
                case 12: goto L_0x0890;
                case 13: goto L_0x0886;
                case 14: goto L_0x087d;
                case 15: goto L_0x0875;
                case 16: goto L_0x086d;
                case 17: goto L_0x0865;
                case 18: goto L_0x085a;
                case 19: goto L_0x0854;
                case 20: goto L_0x084e;
                case 21: goto L_0x0848;
                case 22: goto L_0x0842;
                case 23: goto L_0x083c;
                case 24: goto L_0x0836;
                case 25: goto L_0x082c;
                case 26: goto L_0x0822;
                case 27: goto L_0x081c;
                case 28: goto L_0x0816;
                case 29: goto L_0x0810;
                case 30: goto L_0x080a;
                case 31: goto L_0x0804;
                case 32: goto L_0x07fe;
                case 33: goto L_0x07f8;
                case 34: goto L_0x07f2;
                case 35: goto L_0x07ec;
                case 36: goto L_0x07e6;
                case 37: goto L_0x07dc;
                case 38: goto L_0x07d6;
                case 39: goto L_0x07d0;
                case 40: goto L_0x07ca;
                case 41: goto L_0x07c4;
                case 42: goto L_0x07be;
                case 43: goto L_0x07b8;
                case 44: goto L_0x07b2;
                case 45: goto L_0x07ac;
                case 46: goto L_0x07a6;
                case 47: goto L_0x07a0;
                case 48: goto L_0x079a;
                case 49: goto L_0x0790;
                case 50: goto L_0x0789;
                case 51: goto L_0x077f;
                case 52: goto L_0x0779;
                case 53: goto L_0x0773;
                case 54: goto L_0x076d;
                case 55: goto L_0x0767;
                case 56: goto L_0x0761;
                case 57: goto L_0x075b;
                case 58: goto L_0x0755;
                case 59: goto L_0x074f;
                case 60: goto L_0x0749;
                case 61: goto L_0x0743;
                case 62: goto L_0x073d;
                case 63: goto L_0x0737;
                case 64: goto L_0x0731;
                case 65: goto L_0x072b;
                case 66: goto L_0x0727;
                case 67: goto L_0x0721;
                case 68: goto L_0x071b;
                case 69: goto L_0x0715;
                case 70: goto L_0x070f;
                case 71: goto L_0x0709;
                case 72: goto L_0x0703;
                case 73: goto L_0x06fd;
                case 74: goto L_0x06f7;
                case 75: goto L_0x06f1;
                case 76: goto L_0x06d8;
                case 77: goto L_0x06bb;
                case 78: goto L_0x069e;
                default: goto L_0x0697;
            }
        L_0x0697:
            r10 = r85
            r85.skipValue()
            goto L_0x08f7
        L_0x069e:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zziw
            java.lang.Object r9 = r9.zzj()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06b6
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            com.google.android.gms.ads.internal.util.client.zzw r39 = com.google.android.gms.ads.internal.util.client.zzw.zzd(r9)
            goto L_0x08f7
        L_0x06b6:
            r85.skipValue()
            goto L_0x078c
        L_0x06bb:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zziu
            java.lang.Object r9 = r9.zzj()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06d3
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            com.google.android.gms.ads.internal.util.client.zzv r38 = com.google.android.gms.ads.internal.util.client.zzv.zza(r9)
            goto L_0x08f7
        L_0x06d3:
            r85.skipValue()
            goto L_0x078c
        L_0x06d8:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzam
            java.lang.Object r9 = r9.zzj()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x06ec
            java.util.Map r33 = com.google.android.gms.ads.internal.util.zzbs.zze(r85)
            goto L_0x08f7
        L_0x06ec:
            r85.skipValue()
            goto L_0x078c
        L_0x06f1:
            boolean r82 = r85.nextBoolean()
            goto L_0x08f7
        L_0x06f7:
            java.util.List r32 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x06fd:
            java.lang.String r81 = r85.nextString()
            goto L_0x08f7
        L_0x0703:
            int r80 = r85.nextInt()
            goto L_0x08f7
        L_0x0709:
            boolean r79 = r85.nextBoolean()
            goto L_0x08f7
        L_0x070f:
            boolean r78 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0715:
            java.lang.String r76 = r85.nextString()
            goto L_0x08f7
        L_0x071b:
            java.lang.String r75 = r85.nextString()
            goto L_0x08f7
        L_0x0721:
            boolean r74 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0727:
            com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x078c
        L_0x072b:
            boolean r73 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0731:
            java.lang.String r37 = r85.nextString()
            goto L_0x08f7
        L_0x0737:
            boolean r72 = r85.nextBoolean()
            goto L_0x08f7
        L_0x073d:
            org.json.JSONObject r31 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x0743:
            boolean r71 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0749:
            java.lang.String r70 = r85.nextString()
            goto L_0x08f7
        L_0x074f:
            java.lang.String r69 = r85.nextString()
            goto L_0x08f7
        L_0x0755:
            java.lang.String r68 = r85.nextString()
            goto L_0x08f7
        L_0x075b:
            java.lang.String r67 = r85.nextString()
            goto L_0x08f7
        L_0x0761:
            java.lang.String r77 = r85.nextString()
            goto L_0x08f7
        L_0x0767:
            java.lang.String r66 = r85.nextString()
            goto L_0x08f7
        L_0x076d:
            org.json.JSONObject r30 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x0773:
            boolean r65 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0779:
            java.lang.String r64 = r85.nextString()
            goto L_0x08f7
        L_0x077f:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            com.google.android.gms.ads.internal.client.zzu r36 = com.google.android.gms.ads.internal.client.zzu.zza(r9)
            goto L_0x08f7
        L_0x0789:
            r85.nextBoolean()
        L_0x078c:
            r10 = r85
            goto L_0x08f7
        L_0x0790:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            com.google.android.gms.internal.ads.zzbtk r35 = com.google.android.gms.internal.ads.zzbtk.zza(r9)
            goto L_0x08f7
        L_0x079a:
            boolean r63 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07a0:
            java.lang.String r62 = r85.nextString()
            goto L_0x08f7
        L_0x07a6:
            java.lang.String r60 = r85.nextString()
            goto L_0x08f7
        L_0x07ac:
            int r61 = r85.nextInt()
            goto L_0x08f7
        L_0x07b2:
            int r59 = r85.nextInt()
            goto L_0x08f7
        L_0x07b8:
            boolean r58 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07be:
            boolean r57 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07c4:
            org.json.JSONObject r29 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x07ca:
            java.lang.String r56 = r85.nextString()
            goto L_0x08f7
        L_0x07d0:
            boolean r55 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07d6:
            int r54 = r85.nextInt()
            goto L_0x08f7
        L_0x07dc:
            java.lang.String r9 = r85.nextString()
            int r53 = zzd(r9)
            goto L_0x08f7
        L_0x07e6:
            boolean r52 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07ec:
            boolean r51 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07f2:
            boolean r50 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07f8:
            boolean r49 = r85.nextBoolean()
            goto L_0x08f7
        L_0x07fe:
            boolean r48 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0804:
            boolean r47 = r85.nextBoolean()
            goto L_0x08f7
        L_0x080a:
            boolean r46 = r85.nextBoolean()
            goto L_0x08f7
        L_0x0810:
            org.json.JSONObject r28 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x0816:
            org.json.JSONObject r27 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x081c:
            java.lang.String r45 = r85.nextString()
            goto L_0x08f7
        L_0x0822:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            com.google.android.gms.internal.ads.zzbxr r34 = com.google.android.gms.internal.ads.zzbxr.zza(r9)
            goto L_0x08f7
        L_0x082c:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            java.lang.String r44 = r9.toString()
            goto L_0x08f7
        L_0x0836:
            java.lang.String r43 = r85.nextString()
            goto L_0x08f7
        L_0x083c:
            java.lang.String r42 = r85.nextString()
            goto L_0x08f7
        L_0x0842:
            org.json.JSONObject r16 = com.google.android.gms.ads.internal.util.zzbs.zzi(r85)
            goto L_0x08f7
        L_0x0848:
            java.lang.String r41 = r85.nextString()
            goto L_0x08f7
        L_0x084e:
            java.util.List r18 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x0854:
            java.util.List r17 = com.google.android.gms.internal.ads.zzfbp.zza(r85)
            goto L_0x08f7
        L_0x085a:
            com.google.android.gms.internal.ads.zzfbt r9 = new com.google.android.gms.internal.ads.zzfbt
            r10 = r85
            r9.<init>(r10)
            r19 = r9
            goto L_0x08f7
        L_0x0865:
            r10 = r85
            java.util.List r20 = com.google.android.gms.internal.ads.zzfbp.zza(r85)
            goto L_0x08f7
        L_0x086d:
            r10 = r85
            int r40 = r85.nextInt()
            goto L_0x08f7
        L_0x0875:
            r10 = r85
            java.util.List r21 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x087d:
            r10 = r85
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            r10 = r9
            goto L_0x08f9
        L_0x0886:
            r10 = r85
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            r10 = r22
            goto L_0x00f5
        L_0x0890:
            r10 = r85
            java.util.List r8 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x0898:
            r10 = r85
            org.json.JSONArray r9 = com.google.android.gms.ads.internal.util.zzbs.zzf(r85)
            com.google.android.gms.internal.ads.zzbwi r15 = com.google.android.gms.internal.ads.zzbwi.zza(r9)
            goto L_0x08f7
        L_0x08a3:
            r10 = r85
            java.lang.String r11 = r85.nextString()
            goto L_0x08f7
        L_0x08aa:
            r10 = r85
            java.lang.String r12 = r85.nextString()
            goto L_0x08f7
        L_0x08b1:
            r10 = r85
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08b8:
            r10 = r85
            java.util.List r6 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08bf:
            r10 = r85
            java.util.List r5 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08c6:
            r10 = r85
            int r9 = r85.nextInt()
            int r14 = zze(r9)
            goto L_0x08f7
        L_0x08d1:
            r10 = r85
            java.util.List r4 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08d8:
            r10 = r85
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08df:
            r10 = r85
            java.util.List r2 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
            goto L_0x08f7
        L_0x08e6:
            r10 = r85
            java.lang.String r9 = r85.nextString()
            int r13 = zzc(r9)
            goto L_0x08f7
        L_0x08f1:
            r10 = r85
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbs.zzd(r85)
        L_0x08f7:
            r10 = r22
        L_0x08f9:
            r9 = r83
            goto L_0x00f5
        L_0x08fd:
            r83 = r9
            r22 = r10
            r10 = r85
            r85.endObject()
            r0.zza = r1
            r0.zzb = r13
            r0.zzc = r2
            r0.zzd = r3
            r0.zzf = r4
            r0.zze = r14
            r0.zzg = r5
            r0.zzh = r6
            r0.zzi = r7
            r0.zzj = r12
            r0.zzk = r11
            r0.zzl = r15
            r0.zzm = r8
            r0.zzn = r9
            r9 = r22
            r0.zzo = r9
            r11 = r21
            r0.zzp = r11
            r1 = r40
            r0.zzq = r1
            r12 = r20
            r0.zzr = r12
            r9 = r19
            r0.zzs = r9
            r13 = r18
            r0.zzt = r13
            r14 = r17
            r0.zzu = r14
            r1 = r41
            r0.zzw = r1
            r15 = r16
            r0.zzv = r15
            r1 = r42
            r0.zzx = r1
            r1 = r43
            r0.zzy = r1
            r1 = r44
            r0.zzz = r1
            r1 = r34
            r0.zzA = r1
            r1 = r45
            r0.zzB = r1
            r1 = r27
            r0.zzC = r1
            r1 = r28
            r0.zzD = r1
            r1 = r46
            r0.zzJ = r1
            r1 = r47
            r0.zzK = r1
            r1 = r48
            r0.zzL = r1
            r1 = r49
            r0.zzM = r1
            r1 = r50
            r0.zzN = r1
            r1 = r51
            r0.zzO = r1
            r1 = r52
            r0.zzP = r1
            r1 = r53
            r0.zzQ = r1
            r1 = r54
            r0.zzR = r1
            r1 = r55
            r0.zzT = r1
            r1 = r56
            r0.zzU = r1
            com.google.android.gms.internal.ads.zzfcm r1 = new com.google.android.gms.internal.ads.zzfcm
            r2 = r29
            r1.<init>(r2)
            r0.zzV = r1
            r1 = r57
            r0.zzW = r1
            r1 = r58
            r0.zzX = r1
            r1 = r59
            r0.zzY = r1
            r1 = r60
            r0.zzZ = r1
            r1 = r61
            r0.zzaa = r1
            r1 = r62
            r0.zzab = r1
            r1 = r63
            r0.zzac = r1
            r1 = r35
            r0.zzad = r1
            r1 = r36
            r0.zzae = r1
            r1 = r64
            r0.zzaf = r1
            r1 = r65
            r0.zzag = r1
            r1 = r30
            r0.zzah = r1
            r1 = r66
            r0.zzE = r1
            r1 = r67
            r0.zzF = r1
            r1 = r68
            r0.zzG = r1
            r1 = r69
            r0.zzH = r1
            r1 = r70
            r0.zzI = r1
            r1 = r71
            r0.zzai = r1
            r1 = r31
            r0.zzaj = r1
            r1 = r72
            r0.zzak = r1
            r1 = r37
            r0.zzal = r1
            r1 = r73
            r0.zzam = r1
            r1 = r74
            r0.zzS = r1
            r1 = r75
            r0.zzan = r1
            r1 = r76
            r0.zzao = r1
            r1 = r77
            r0.zzap = r1
            r1 = r78
            r0.zzaq = r1
            r1 = r79
            r0.zzar = r1
            r1 = r80
            r0.zzas = r1
            r1 = r32
            r0.zzau = r1
            r1 = r81
            r0.zzat = r1
            r1 = r82
            r0.zzav = r1
            r1 = r33
            r0.zzaw = r1
            r1 = r38
            r0.zzax = r1
            r1 = r39
            r0.zzay = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbo.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    private static int zze(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}

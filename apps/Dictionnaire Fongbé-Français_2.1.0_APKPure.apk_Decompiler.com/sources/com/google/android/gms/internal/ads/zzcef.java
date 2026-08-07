package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcef extends zzcbj implements zzgy, zzlw {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdq zzc;
    private final zzxt zzd;
    private final zzcbr zze;
    private final WeakReference zzf;
    private final zzvn zzg;
    private zzim zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbi zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq = new Object();
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcds zzt;
    private final Set zzu = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e7, code lost:
        if (r5.zzi == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ec, code lost:
        if (r5.zzl == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdw(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        if (r5.zzh <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdx(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdy(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (r5.zzi == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcdz(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r4.limit() <= 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcea(r5, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcef(android.content.Context r4, com.google.android.gms.internal.ads.zzcbr r5, com.google.android.gms.internal.ads.zzcbs r6, java.lang.Integer r7) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzq = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zzu = r0
            r3.zzb = r4
            r3.zze = r5
            r3.zzr = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            r3.zzf = r7
            com.google.android.gms.internal.ads.zzcdq r7 = new com.google.android.gms.internal.ads.zzcdq
            r7.<init>()
            r3.zzc = r7
            com.google.android.gms.internal.ads.zzxt r0 = new com.google.android.gms.internal.ads.zzxt
            r0.<init>(r4)
            r3.zzd = r0
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "SimpleExoPlayerAdapter initialize "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L_0x003f:
            java.util.concurrent.atomic.AtomicInteger r1 = zzD()
            r1.incrementAndGet()
            com.google.android.gms.internal.ads.zzlq r1 = new com.google.android.gms.internal.ads.zzlq
            com.google.android.gms.internal.ads.zzced r2 = new com.google.android.gms.internal.ads.zzced
            r2.<init>(r3)
            r1.<init>(r4, r2)
            r1.zzb(r0)
            r1.zza(r7)
            com.google.android.gms.internal.ads.zzlr r7 = r1.zzc()
            r3.zzh = r7
            r7.zzy(r3)
            r7 = 0
            r3.zzl = r7
            r0 = 0
            r3.zzn = r0
            r3.zzm = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zzs = r0
            r0 = 0
            r3.zzt = r0
            if (r6 == 0) goto L_0x0078
            java.lang.String r0 = r6.zzr()
        L_0x0078:
            com.google.android.gms.internal.ads.zzful r0 = com.google.android.gms.internal.ads.zzful.zzd(r0)
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.zzb(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.zzo = r0
            if (r6 == 0) goto L_0x008d
            int r0 = r6.zzf()
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            r3.zzp = r0
            com.google.android.gms.internal.ads.zzvn r0 = new com.google.android.gms.internal.ads.zzvn
            com.google.android.gms.ads.internal.util.zzs r1 = com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r6.zzn()
            java.lang.String r6 = r6.afmaVersion
            java.lang.String r4 = r1.zzc(r4, r6)
            boolean r6 = r3.zzj
            if (r6 == 0) goto L_0x00c0
            java.nio.ByteBuffer r6 = r3.zzi
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x00c0
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = r3.zzi
            r5.get(r4)
            com.google.android.gms.internal.ads.zzcdu r5 = new com.google.android.gms.internal.ads.zzcdu
            r5.<init>(r4)
            goto L_0x012c
        L_0x00c0:
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzcg
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r1.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 1
            if (r6 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzbY
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r2.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00e9
        L_0x00e5:
            boolean r6 = r5.zzi
            if (r6 != 0) goto L_0x00ea
        L_0x00e9:
            r7 = 1
        L_0x00ea:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzcdw r6 = new com.google.android.gms.internal.ads.zzcdw
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00f4:
            int r6 = r5.zzh
            if (r6 <= 0) goto L_0x00fe
            com.google.android.gms.internal.ads.zzcdx r6 = new com.google.android.gms.internal.ads.zzcdx
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.zzcdy r6 = new com.google.android.gms.internal.ads.zzcdy
            r6.<init>(r3, r4, r7)
        L_0x0103:
            boolean r4 = r5.zzi
            if (r4 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzcdz r4 = new com.google.android.gms.internal.ads.zzcdz
            r4.<init>(r3, r6)
            r5 = r4
            goto L_0x010f
        L_0x010e:
            r5 = r6
        L_0x010f:
            java.nio.ByteBuffer r4 = r3.zzi
            if (r4 == 0) goto L_0x012c
            int r4 = r4.limit()
            if (r4 <= 0) goto L_0x012c
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r6 = r3.zzi
            r6.get(r4)
            com.google.android.gms.internal.ads.zzcea r6 = new com.google.android.gms.internal.ads.zzcea
            r6.<init>(r5, r4)
            r5 = r6
        L_0x012c:
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzl
            com.google.android.gms.internal.ads.zzbcj r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r6.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0144
            com.google.android.gms.internal.ads.zzcee r4 = new com.google.android.gms.internal.ads.zzcee
            r4.<init>()
            goto L_0x0149
        L_0x0144:
            com.google.android.gms.internal.ads.zzcdv r4 = new com.google.android.gms.internal.ads.zzcdv
            r4.<init>()
        L_0x0149:
            com.google.android.gms.internal.ads.zzvm r6 = new com.google.android.gms.internal.ads.zzvm
            r6.<init>(r4)
            r0.<init>(r5, r6)
            r3.zzg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcef.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbr, com.google.android.gms.internal.ads.zzcbs, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzad()) {
            return (long) this.zzl;
        }
        return 0;
    }

    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map zze2 = ((zzgt) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzftt.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    public final Integer zzC() {
        return this.zzr;
    }

    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzH() {
        zzim zzim = this.zzh;
        if (zzim != null) {
            zzim.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    public final void zzI(long j) {
        zzg zzg2 = (zzg) this.zzh;
        zzg2.zza(zzg2.zzd(), j, 5, false);
    }

    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    public final void zzK(int i) {
        this.zzc.zzm(i);
    }

    public final void zzL(zzcbi zzcbi) {
        this.zzk = zzcbi;
    }

    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    public final void zzN(int i) {
        this.zzc.zzo(i);
    }

    public final void zzO(boolean z) {
        this.zzh.zzq(z);
    }

    public final void zzP(Integer num) {
        this.zzr = num;
    }

    public final void zzQ(boolean z) {
        if (this.zzh != null) {
            int i = 0;
            while (true) {
                this.zzh.zzx();
                if (i < 2) {
                    zzxt zzxt = this.zzd;
                    zzxg zzc2 = zzxt.zzf().zzc();
                    zzc2.zzq(i, !z);
                    zzxt.zzl(zzc2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzR(int i) {
        for (WeakReference weakReference : this.zzu) {
            zzcdp zzcdp = (zzcdp) weakReference.get();
            if (zzcdp != null) {
                zzcdp.zzm(i);
            }
        }
    }

    public final void zzS(Surface surface, boolean z) {
        zzim zzim = this.zzh;
        if (zzim != null) {
            zzim.zzr(surface);
        }
    }

    public final void zzT(float f, boolean z) {
        zzim zzim = this.zzh;
        if (zzim != null) {
            zzim.zzs(f);
        }
    }

    public final void zzU() {
        this.zzh.zzt();
    }

    public final boolean zzV() {
        return this.zzh != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfy zzW(String str, boolean z) {
        zzcef zzcef = true != z ? null : this;
        zzcbr zzcbr = this.zze;
        return new zzcei(str, zzcef, zzcbr.zzd, zzcbr.zze, zzcbr.zzm, zzcbr.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfy zzX(String str, boolean z) {
        zzcef zzcef = true != z ? null : this;
        zzcbr zzcbr = this.zze;
        zzcdp zzcdp = new zzcdp(str, zzcef, zzcbr.zzd, zzcbr.zze, zzcbr.zzh);
        this.zzu.add(new WeakReference(zzcdp));
        return zzcdp;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfy zzY(String str, boolean z) {
        zzgg zzgg = new zzgg();
        zzgg.zzf(str);
        zzgg.zze(true != z ? null : this);
        zzgg.zzc(this.zze.zzd);
        zzgg.zzd(this.zze.zze);
        zzgg.zzb(true);
        return zzgg.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfy zzZ(zzfx zzfx) {
        zzfy zza2 = zzfx.zza();
        zzcec zzcec = new zzcec(this);
        return new zzcds(this.zzb, zza2, this.zzo, this.zzp, this, zzcec);
    }

    public final void zza(zzfy zzfy, zzgd zzgd, boolean z, int i) {
        this.zzl += i;
    }

    /* access modifiers changed from: package-private */
    public final zzui zzaa(Uri uri) {
        zzaf zzaf = new zzaf();
        zzaf.zzb(uri);
        zzar zzc2 = zzaf.zzc();
        zzvn zzvn = this.zzg;
        zzvn.zza(this.zze.zzf);
        return zzvn.zzb(zzc2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(boolean z, long j) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi != null) {
            zzcbi.zzi(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzlj[] zzac(Handler handler, zzabc zzabc, zzpf zzpf, zzwm zzwm, zzte zzte) {
        zzsp zzsp = zzsp.zza;
        Context context = this.zzb;
        zzqs zzqs = new zzqs(context, new zzrv(context), zzsp, false, handler, zzpf, new zzqa(context).zzd());
        zzsp zzsp2 = zzsp.zza;
        Context context2 = this.zzb;
        return new zzlj[]{zzqs, new zzzp(context2, new zzrv(context2), zzsp2, 0, false, handler, zzabc, -1, 30.0f)};
    }

    public final void zzb(zzfy zzfy, zzgd zzgd, boolean z) {
    }

    public final void zzc(zzfy zzfy, zzgd zzgd, boolean z) {
    }

    public final void zzd(zzfy zzfy, zzgd zzgd, boolean z) {
        if (zzfy instanceof zzgt) {
            synchronized (this.zzq) {
                this.zzs.add((zzgt) zzfy);
            }
        } else if (zzfy instanceof zzcds) {
            this.zzt = (zzcds) zzfy;
            zzcbs zzcbs = (zzcbs) this.zzf.get();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs != null && this.zzt.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                zzs.zza.post(new zzceb(zzcbs, hashMap));
            }
        }
    }

    public final void zze(zzlu zzlu, zzab zzab, zzht zzht) {
        zzcbs zzcbs = (zzcbs) this.zzf.get();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs != null) {
            HashMap hashMap = new HashMap();
            String str = zzab.zzn;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzab.zzo;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzab.zzk;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcbs.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzlu zzlu, int i, long j, long j2) {
    }

    public final /* synthetic */ void zzg(zzlu zzlu, zzuc zzuc) {
    }

    public final void zzh(zzlu zzlu, int i, long j) {
        this.zzm += i;
    }

    public final /* synthetic */ void zzi(zzbk zzbk, zzlv zzlv) {
    }

    public final void zzj(zzlu zzlu, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi == null) {
            return;
        }
        if (this.zze.zzj) {
            zzcbi.zzl("onLoadException", iOException);
        } else {
            zzcbi.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzlu zzlu, int i) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi != null) {
            zzcbi.zzm(i);
        }
    }

    public final void zzl(zzlu zzlu, zzbd zzbd) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi != null) {
            zzcbi.zzk("onPlayerError", zzbd);
        }
    }

    public final /* synthetic */ void zzm(zzlu zzlu, zzbi zzbi, zzbi zzbi2, int i) {
    }

    public final void zzn(zzlu zzlu, Object obj, long j) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi != null) {
            zzcbi.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzlu zzlu, zzhs zzhs) {
    }

    public final void zzp(zzlu zzlu, zzab zzab, zzht zzht) {
        zzcbs zzcbs = (zzcbs) this.zzf.get();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcbs != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzab.zzx));
            hashMap.put("bitRate", String.valueOf(zzab.zzj));
            int i = zzab.zzv;
            int i2 = zzab.zzw;
            hashMap.put("resolution", i + "x" + i2);
            String str = zzab.zzn;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzab.zzo;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzab.zzk;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcbs.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzlu zzlu, zzcd zzcd) {
        zzcbi zzcbi = this.zzk;
        if (zzcbi != null) {
            zzcbi.zzD(zzcd.zzb, zzcd.zzc);
        }
    }

    public final int zzr() {
        return this.zzm;
    }

    public final int zzt() {
        return this.zzh.zzf();
    }

    public final long zzv() {
        return this.zzh.zzi();
    }

    public final long zzw() {
        return (long) this.zzl;
    }

    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min((long) this.zzl, this.zzt.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzh.zzk();
    }

    public final long zzz() {
        return this.zzh.zzl();
    }

    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzui zzui;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzui = zzaa(uriArr[0]);
            } else {
                zzui[] zzuiArr = new zzui[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzuiArr[i] = zzaa(uriArr[i]);
                }
                zzui = new zzuy(false, false, new zztr(), zzuiArr);
            }
            this.zzh.zzB(zzui);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}

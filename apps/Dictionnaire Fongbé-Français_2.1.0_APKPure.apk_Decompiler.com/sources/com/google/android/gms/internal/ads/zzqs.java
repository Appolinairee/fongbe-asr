package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.NotificationManagerCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzqs extends zzsn implements zzkk {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzpe zzc;
    private final zzpm zzd;
    private final zzrz zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzab zzi;
    private zzab zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    private int zzo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzqs(Context context, zzsb zzsb, zzsp zzsp, boolean z, Handler handler, zzpf zzpf, zzpm zzpm) {
        super(1, zzsb, zzsp, false, 44100.0f);
        zzrz zzrz = zzei.zza >= 35 ? new zzrz(zzry.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpm;
        this.zze = zzrz;
        this.zzo = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzc = new zzpe(handler, zzpf);
        zzpm.zzq(new zzqq(this, (zzqr) null));
    }

    private final int zzaQ(zzsg zzsg, zzab zzab) {
        if (!"OMX.google.raw.decoder".equals(zzsg.zza) || zzei.zza >= 24 || (zzei.zza == 23 && zzei.zzM(this.zzb))) {
            return zzab.zzp;
        }
        return -1;
    }

    private static List zzaR(zzsp zzsp, zzab zzab, boolean z, zzpm zzpm) throws zzsu {
        zzsg zza;
        if (zzab.zzo == null) {
            return zzfxn.zzn();
        }
        if (!zzpm.zzA(zzab) || (zza = zzta.zza()) == null) {
            return zzta.zze(zzsp, zzab, false, false);
        }
        return zzfxn.zzo(zza);
    }

    private final void zzaS() {
        long zzb2 = this.zzd.zzb(zzW());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzb2 = Math.max(this.zzk, zzb2);
            }
            this.zzk = zzb2;
            this.zzl = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzA() {
        zzrz zzrz;
        this.zzd.zzk();
        if (zzei.zza >= 35 && (zzrz = this.zze) != null) {
            zzrz.zzb();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzD() {
        this.zzd.zzi();
    }

    /* access modifiers changed from: protected */
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    /* access modifiers changed from: protected */
    public final float zzZ(float f, zzab zzab, zzab[] zzabArr) {
        int i = -1;
        for (zzab zzab2 : zzabArr) {
            int i2 = zzab2.zzE;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final long zza() {
        if (zzcT() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final int zzaa(zzsp zzsp, zzab zzab) throws zzsu {
        int i;
        boolean z;
        int i2 = 128;
        if (!zzbb.zzg(zzab.zzo)) {
            return 128;
        }
        int i3 = zzab.zzK;
        boolean zzaP = zzaP(zzab);
        int i4 = 1;
        if (!zzaP || (i3 != 0 && zzta.zza() == null)) {
            i = 0;
        } else {
            zzor zzd2 = this.zzd.zzd(zzab);
            if (!zzd2.zzb) {
                i = 0;
            } else {
                i = true != zzd2.zzc ? 512 : 1536;
                if (zzd2.zzd) {
                    i |= 2048;
                }
            }
            if (this.zzd.zzA(zzab)) {
                return i | 172;
            }
        }
        if ((!"audio/raw".equals(zzab.zzo) || this.zzd.zzA(zzab)) && this.zzd.zzA(zzei.zzA(2, zzab.zzD, zzab.zzE))) {
            List zzaR = zzaR(zzsp, zzab, false, this.zzd);
            if (!zzaR.isEmpty()) {
                if (!zzaP) {
                    i4 = 2;
                } else {
                    zzsg zzsg = (zzsg) zzaR.get(0);
                    boolean zze2 = zzsg.zze(zzab);
                    if (!zze2) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= zzaR.size()) {
                                break;
                            }
                            zzsg zzsg2 = (zzsg) zzaR.get(i5);
                            if (zzsg2.zze(zzab)) {
                                zzsg = zzsg2;
                                z = false;
                                zze2 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    z = true;
                    int i6 = true != zze2 ? 3 : 4;
                    int i7 = 8;
                    if (zze2 && zzsg.zzf(zzab)) {
                        i7 = 16;
                    }
                    int i8 = true != zzsg.zzg ? 0 : 64;
                    if (true != z) {
                        i2 = 0;
                    }
                    return i6 | i7 | 32 | i8 | i2 | i;
                }
            }
        }
        return i4 | 128;
    }

    /* access modifiers changed from: protected */
    public final zzht zzab(zzsg zzsg, zzab zzab, zzab zzab2) {
        int i;
        int i2;
        zzht zzb2 = zzsg.zzb(zzab, zzab2);
        int i3 = zzb2.zze;
        if (zzaM(zzab2)) {
            i3 |= 32768;
        }
        if (zzaQ(zzsg, zzab2) > this.zzf) {
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
    public final zzsa zzaf(zzsg zzsg, zzab zzab, MediaCrypto mediaCrypto, float f) {
        int zzaQ = zzaQ(zzsg, zzab);
        if (r0 != 1) {
            for (zzab zzab2 : zzT()) {
                if (zzsg.zzb(zzab, zzab2).zzd != 0) {
                    zzaQ = Math.max(zzaQ, zzaQ(zzsg, zzab2));
                }
            }
        }
        this.zzf = zzaQ;
        this.zzg = zzei.zza < 24 && "OMX.SEC.aac.dec".equals(zzsg.zza) && "samsung".equals(zzei.zzc) && (zzei.zzb.startsWith("zeroflte") || zzei.zzb.startsWith("herolte") || zzei.zzb.startsWith("heroqlte"));
        String str = zzsg.zza;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzsg.zzc;
        int i = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", zzab.zzD);
        mediaFormat.setInteger("sample-rate", zzab.zzE);
        zzdr.zzb(mediaFormat, zzab.zzr);
        zzdr.zza(mediaFormat, "max-input-size", i);
        if (zzei.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzei.zza != 23 || (!"ZTE B2017G".equals(zzei.zzd) && !"AXON 7 mini".equals(zzei.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzei.zza <= 28 && "audio/ac4".equals(zzab.zzo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzei.zza >= 24 && this.zzd.zza(zzei.zzA(4, zzab.zzD, zzab.zzE)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzei.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (zzei.zza >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzsg.zzb) || "audio/raw".equals(zzab.zzo)) ? null : zzab;
        return zzsa.zza(zzsg, mediaFormat, zzab, (MediaCrypto) null, this.zze);
    }

    /* access modifiers changed from: protected */
    public final List zzag(zzsp zzsp, zzab zzab, boolean z) throws zzsu {
        return zzta.zzf(zzaR(zzsp, zzab, false, this.zzd), zzab);
    }

    /* access modifiers changed from: protected */
    public final void zzaj(zzhh zzhh) {
        zzab zzab;
        if (zzei.zza >= 29 && (zzab = zzhh.zza) != null && Objects.equals(zzab.zzo, "audio/opus") && zzaL()) {
            ByteBuffer byteBuffer = zzhh.zzf;
            byteBuffer.getClass();
            ByteBuffer byteBuffer2 = byteBuffer;
            zzab zzab2 = zzhh.zza;
            zzab2.getClass();
            zzab zzab3 = zzab2;
            int i = zzab2.zzG;
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzr(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzak(Exception exc) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzal(String str, zzsa zzsa, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    /* access modifiers changed from: protected */
    public final void zzao() {
        this.zzl = true;
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        this.zzd.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzaq() throws zzib {
        try {
            this.zzd.zzj();
        } catch (zzpl e) {
            throw zzcW(e, e.zzc, e.zzb, true != zzaL() ? 5002 : 5003);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzas(zzab zzab) {
        zzn();
        return this.zzd.zzA(zzab);
    }

    public final zzbe zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzbe zzbe) {
        this.zzd.zzs(zzbe);
    }

    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    public final zzkk zzl() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy(boolean z, boolean z2) throws zzib {
        super.zzy(z, z2);
        this.zzc.zzh(this.zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    /* access modifiers changed from: protected */
    public final void zzz(long j, boolean z) throws zzib {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzk = j;
        this.zzn = false;
        this.zzl = true;
    }

    /* access modifiers changed from: protected */
    public final zzht zzac(zzke zzke) throws zzib {
        zzab zzab = zzke.zza;
        zzab.getClass();
        zzab zzab2 = zzab;
        this.zzi = zzab;
        zzht zzac = super.zzac(zzke);
        this.zzc.zzi(zzab, zzac);
        return zzac;
    }

    /* access modifiers changed from: protected */
    public final boolean zzar(long j, long j2, zzsd zzsd, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzab) throws zzib {
        byteBuffer.getClass();
        if (this.zzj != null && (i2 & 2) != 0) {
            zzsd.getClass();
            zzsd zzsd2 = zzsd;
            zzsd.zzo(i, false);
            return true;
        } else if (z) {
            if (zzsd != null) {
                zzsd.zzo(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (!this.zzd.zzx(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzsd != null) {
                    zzsd.zzo(i, false);
                }
                this.zza.zze += i3;
                return true;
            } catch (zzpi e) {
                zzab zzab2 = this.zzi;
                if (zzaL()) {
                    zzn();
                }
                throw zzcW(e, zzab2, e.zzb, 5001);
            } catch (zzpl e2) {
                if (zzaL()) {
                    zzn();
                }
                throw zzcW(e2, zzab, e2.zzb, 5002);
            }
        }
    }

    public final void zzu(int i, Object obj) throws zzib {
        zzrz zzrz;
        if (i == 2) {
            zzpm zzpm = this.zzd;
            obj.getClass();
            zzpm.zzw(((Float) obj).floatValue());
        } else if (i == 3) {
            zze zze2 = (zze) obj;
            zzpm zzpm2 = this.zzd;
            zze2.getClass();
            zze zze3 = zze2;
            zzpm2.zzm(zze2);
        } else if (i == 6) {
            zzf zzf2 = (zzf) obj;
            zzpm zzpm3 = this.zzd;
            zzf2.getClass();
            zzf zzf3 = zzf2;
            zzpm3.zzo(zzf2);
        } else if (i != 12) {
            if (i == 16) {
                obj.getClass();
                this.zzo = ((Integer) obj).intValue();
                zzsd zzaz = zzaz();
                if (zzaz != null && zzei.zza >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzo));
                    zzaz.zzq(bundle);
                }
            } else if (i == 9) {
                zzpm zzpm4 = this.zzd;
                obj.getClass();
                zzpm4.zzv(((Boolean) obj).booleanValue());
            } else if (i != 10) {
                super.zzu(i, obj);
            } else {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                this.zzd.zzn(intValue);
                if (zzei.zza >= 35 && (zzrz = this.zze) != null) {
                    zzrz.zzd(intValue);
                }
            }
        } else if (zzei.zza >= 23) {
            this.zzd.zzu(zzoc$$ExternalSyntheticApiModelOutline2.m(obj));
        }
    }

    /* access modifiers changed from: protected */
    public final void zzan(zzab zzab, MediaFormat mediaFormat) throws zzib {
        int i;
        int[] iArr;
        int i2;
        zzab zzab2 = this.zzj;
        int[] iArr2 = null;
        boolean z = true;
        if (zzab2 != null) {
            zzab = zzab2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzab.zzo)) {
                i = zzab.zzF;
            } else if (zzei.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? zzei.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzz zzz = new zzz();
            zzz.zzaa("audio/raw");
            zzz.zzU(i);
            zzz.zzG(zzab.zzG);
            zzz.zzH(zzab.zzH);
            zzz.zzT(zzab.zzl);
            Object obj = zzab.zzm;
            zzz.zzM(zzab.zza);
            zzz.zzO(zzab.zzb);
            zzz.zzP(zzab.zzc);
            zzz.zzQ(zzab.zzd);
            zzz.zzac(zzab.zze);
            zzz.zzY(zzab.zzf);
            zzz.zzz(mediaFormat.getInteger("channel-count"));
            zzz.zzab(mediaFormat.getInteger("sample-rate"));
            zzab zzag = zzz.zzag();
            if (this.zzg && zzag.zzD == 6 && (i2 = zzab.zzD) < 6) {
                iArr2 = new int[i2];
                for (int i3 = 0; i3 < zzab.zzD; i3++) {
                    iArr2[i3] = i3;
                }
            } else if (this.zzh) {
                int i4 = zzag.zzD;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzab = zzag;
        }
        try {
            if (zzei.zza >= 29) {
                if (zzaL()) {
                    zzn();
                }
                if (zzei.zza < 29) {
                    z = false;
                }
                zzcw.zzf(z);
            }
            this.zzd.zze(zzab, 0, iArr2);
        } catch (zzph e) {
            throw zzcW(e, e.zza, false, 5001);
        }
    }
}

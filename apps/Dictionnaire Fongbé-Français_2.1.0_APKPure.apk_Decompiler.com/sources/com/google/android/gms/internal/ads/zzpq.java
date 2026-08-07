package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzpq {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzcx zzI;
    private final zzpp zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzpo zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpq(zzpp zzpp) {
        zzpp zzpp2 = zzpp;
        this.zza = zzpp;
        try {
            Class[] clsArr = null;
            this.zzm = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzcx.zza;
    }

    private final long zzl() {
        long zzb2 = this.zzI.zzb();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            AudioTrack audioTrack2 = audioTrack;
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzei.zzp(zzei.zzq(zzei.zzs(zzb2) - this.zzx, this.zzi), this.zzf));
        }
        if (zzb2 - this.zzr >= 5) {
            AudioTrack audioTrack3 = this.zzc;
            audioTrack3.getClass();
            AudioTrack audioTrack4 = audioTrack3;
            int playState = audioTrack3.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = (long) audioTrack3.getPlaybackHeadPosition();
                boolean z = this.zzg;
                long j = playbackHeadPosition & KeyboardMap.kValueMask;
                long j2 = 0;
                if (z) {
                    if (playState != 2) {
                        i = playState;
                    } else if (j == 0) {
                        this.zzu = this.zzs;
                    }
                    j += this.zzu;
                    playState = i;
                }
                if (zzei.zza <= 29) {
                    if (j != 0) {
                        j2 = j;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = zzb2;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    j = j2;
                }
                if (this.zzs > j) {
                    this.zzt++;
                }
                this.zzs = j;
            }
            this.zzr = zzb2;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzei.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0;
        this.zzC = 0;
        this.zzF = 0;
        this.zzj = false;
    }

    public final long zza(boolean z) {
        long j;
        long j2;
        Method method;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        if (audioTrack.getPlayState() == 3) {
            long zzc2 = this.zzI.zzc() / 1000;
            if (zzc2 - this.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzm2 = zzm();
                if (zzm2 != 0) {
                    this.zzb[this.zzv] = zzei.zzr(zzm2, this.zzi) - zzc2;
                    this.zzv = (this.zzv + 1) % 10;
                    int i = this.zzw;
                    if (i < 10) {
                        this.zzw = i + 1;
                    }
                    this.zzl = zzc2;
                    this.zzk = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzw;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += this.zzb[i2] / ((long) i3);
                        i2++;
                    }
                }
            }
            if (!this.zzg) {
                zzpo zzpo = this.zze;
                zzpo.getClass();
                zzpo zzpo2 = zzpo;
                if (zzpo.zzg(zzc2)) {
                    long zzb2 = zzpo.zzb();
                    long zza2 = zzpo.zza();
                    long zzm3 = zzm();
                    if (Math.abs(zzb2 - zzc2) > 5000000) {
                        this.zza.zzd(zza2, zzb2, zzc2, zzm3);
                        zzpo.zzd();
                    } else {
                        zzpo zzpo3 = zzpo;
                        if (Math.abs(zzei.zzt(zza2, this.zzf) - zzm3) > 5000000) {
                            this.zza.zzc(zza2, zzb2, zzc2, zzm3);
                            zzpo3.zzd();
                        } else {
                            zzpo3.zzc();
                        }
                    }
                }
                if (this.zzp && (method = this.zzm) != null && zzc2 - this.zzq >= 500000) {
                    try {
                        AudioTrack audioTrack3 = this.zzc;
                        if (audioTrack3 != null) {
                            Integer num = (Integer) method.invoke(audioTrack3, (Object[]) null);
                            int i4 = zzei.zza;
                            Integer num2 = num;
                            long intValue = (((long) num.intValue()) * 1000) - this.zzh;
                            this.zzn = intValue;
                            long max = Math.max(intValue, 0);
                            this.zzn = max;
                            if (max > 5000000) {
                                this.zza.zza(max);
                                this.zzn = 0;
                            }
                            this.zzq = zzc2;
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        this.zzm = null;
                    }
                }
            }
        }
        long zzc3 = this.zzI.zzc() / 1000;
        zzpo zzpo4 = this.zze;
        zzpo4.getClass();
        zzpo zzpo5 = zzpo4;
        boolean zzf2 = zzpo4.zzf();
        if (zzf2) {
            j = zzei.zzt(zzpo4.zza(), this.zzf) + zzei.zzq(zzc3 - zzpo4.zzb(), this.zzi);
        } else {
            if (this.zzw == 0) {
                j2 = zzm();
            } else {
                j2 = zzei.zzq(this.zzk + zzc3, this.zzi);
            }
            j = !z ? Math.max(0, j2 - this.zzn) : j2;
        }
        if (this.zzD != zzf2) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j3 = zzc3 - this.zzF;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            j = ((j * j4) + ((1000 - j4) * (this.zzE + zzei.zzq(j3, this.zzi)))) / 1000;
        }
        if (!this.zzj) {
            long j5 = this.zzB;
            if (j > j5) {
                this.zzj = true;
                int i5 = zzei.zza;
                this.zza.zzb(this.zzI.zza() - zzei.zzv(zzei.zzr(zzei.zzv(j - j5), this.zzi)));
            }
        }
        this.zzC = zzc3;
        this.zzB = j;
        this.zzD = zzf2;
        return j;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzei.zzs(this.zzI.zzb());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r7
            com.google.android.gms.internal.ads.zzpo r0 = new com.google.android.gms.internal.ads.zzpo
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L_0x0023
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            r0 = 23
            if (r4 >= r0) goto L_0x0023
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L_0x0024
            r4 = 6
            if (r5 != r4) goto L_0x0023
            r5 = 6
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r2.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzei.zzJ(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzei.zzt(r4, r6)
            goto L_0x003d
        L_0x003c:
            r4 = r0
        L_0x003d:
            r2.zzh = r4
            r4 = 0
            r2.zzs = r4
            r2.zzt = r4
            r2.zzG = r3
            r2.zzH = r4
            r2.zzu = r4
            r2.zzo = r3
            r2.zzx = r0
            r2.zzy = r0
            r2.zzq = r4
            r2.zzn = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzcx zzcx) {
        this.zzI = zzcx;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzei.zzs(this.zzI.zzb());
        }
        zzpo zzpo = this.zze;
        zzpo.getClass();
        zzpo zzpo2 = zzpo;
        zzpo.zze();
    }

    public final boolean zzg(long j) {
        if (j > zzei.zzp(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            AudioTrack audioTrack2 = audioTrack;
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            } else if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zzg2 = zzg(j);
        this.zzo = zzg2;
        if (z && !zzg2 && playState != 1) {
            this.zza.zze(this.zzd, zzei.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zzpo zzpo = this.zze;
            zzpo.getClass();
            zzpo zzpo2 = zzpo;
            zzpo.zze();
            return true;
        }
        this.zzz = zzl();
        return false;
    }
}

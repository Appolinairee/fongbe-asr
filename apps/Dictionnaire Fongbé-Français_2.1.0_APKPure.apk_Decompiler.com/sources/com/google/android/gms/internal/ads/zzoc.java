package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzoc implements zzlw, zzod {
    private final Context zza;
    private final zzoe zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzbp zze = new zzbp();
    private final zzbo zzf = new zzbo();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzbd zzn;
    private zzob zzo;
    private zzob zzp;
    private zzob zzq;
    private zzab zzr;
    private zzab zzs;
    private zzab zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzoc(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzoa zzoa = new zzoa(zzoa.zza);
        this.zzb = zzoa;
        zzoa.zzh(this);
    }

    public static zzoc zzb(Context context) {
        MediaMetricsManager m = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(context.getSystemService("media_metrics"));
        if (m == null) {
            return null;
        }
        return new zzoc(context, m.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzei.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            PlaybackMetrics.Builder unused = builder.setAudioUnderrunCount(this.zzy);
            PlaybackMetrics.Builder unused2 = this.zzj.setVideoFramesDropped(this.zzw);
            PlaybackMetrics.Builder unused3 = this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            PlaybackMetrics.Builder unused4 = builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            PlaybackMetrics.Builder unused5 = builder3.setNetworkBytesRead(j2);
            PlaybackMetrics.Builder unused6 = this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzab zzab, int i) {
        if (!Objects.equals(this.zzs, zzab)) {
            int i2 = this.zzs == null ? 1 : 0;
            this.zzs = zzab;
            zzx(0, j, zzab, i2);
        }
    }

    private final void zzu(long j, zzab zzab, int i) {
        if (!Objects.equals(this.zzt, zzab)) {
            int i2 = this.zzt == null ? 1 : 0;
            this.zzt = zzab;
            zzx(2, j, zzab, i2);
        }
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzbq zzbq, zzug zzug) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzug != null && (zza2 = zzbq.zza(zzug.zza)) != -1) {
            int i = 0;
            zzbq.zzd(zza2, this.zzf, false);
            zzbq.zze(this.zzf.zzc, this.zze, 0);
            zzam zzam = this.zze.zzd.zzb;
            int i2 = 2;
            if (zzam != null) {
                int zzo2 = zzei.zzo(zzam.zza);
                i = zzo2 != 0 ? zzo2 != 1 ? zzo2 != 2 ? 1 : 4 : 5 : 3;
            }
            PlaybackMetrics.Builder unused = builder.setStreamType(i);
            zzbp zzbp = this.zze;
            long j = zzbp.zzm;
            if (j != -9223372036854775807L && !zzbp.zzk && !zzbp.zzi && !zzbp.zzb()) {
                PlaybackMetrics.Builder unused2 = builder.setMediaDurationMillis(zzei.zzv(j));
            }
            if (true != this.zze.zzb()) {
                i2 = 1;
            }
            PlaybackMetrics.Builder unused3 = builder.setPlaybackType(i2);
            this.zzz = true;
        }
    }

    private final void zzw(long j, zzab zzab, int i) {
        if (!Objects.equals(this.zzr, zzab)) {
            int i2 = this.zzr == null ? 1 : 0;
            this.zzr = zzab;
            zzx(1, j, zzab, i2);
        }
    }

    private final void zzx(int i, long j, zzab zzab, int i2) {
        TrackChangeEvent.Builder m = zzoc$$ExternalSyntheticApiModelOutline2.m(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzab != null) {
            TrackChangeEvent.Builder unused = m.setTrackState(1);
            TrackChangeEvent.Builder unused2 = m.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzab.zzn;
            if (str != null) {
                TrackChangeEvent.Builder unused3 = m.setContainerMimeType(str);
            }
            String str2 = zzab.zzo;
            if (str2 != null) {
                TrackChangeEvent.Builder unused4 = m.setSampleMimeType(str2);
            }
            String str3 = zzab.zzk;
            if (str3 != null) {
                TrackChangeEvent.Builder unused5 = m.setCodecName(str3);
            }
            int i3 = zzab.zzj;
            if (i3 != -1) {
                TrackChangeEvent.Builder unused6 = m.setBitrate(i3);
            }
            int i4 = zzab.zzv;
            if (i4 != -1) {
                TrackChangeEvent.Builder unused7 = m.setWidth(i4);
            }
            int i5 = zzab.zzw;
            if (i5 != -1) {
                TrackChangeEvent.Builder unused8 = m.setHeight(i5);
            }
            int i6 = zzab.zzD;
            if (i6 != -1) {
                TrackChangeEvent.Builder unused9 = m.setChannelCount(i6);
            }
            int i7 = zzab.zzE;
            if (i7 != -1) {
                TrackChangeEvent.Builder unused10 = m.setAudioSampleRate(i7);
            }
            String str4 = zzab.zzd;
            if (str4 != null) {
                int i8 = zzei.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                TrackChangeEvent.Builder unused11 = m.setLanguage((String) create.first);
                if (create.second != null) {
                    TrackChangeEvent.Builder unused12 = m.setLanguageRegion((String) create.second);
                }
            }
            float f = zzab.zzx;
            if (f != -1.0f) {
                TrackChangeEvent.Builder unused13 = m.setVideoFrameRate(f);
            }
        } else {
            TrackChangeEvent.Builder unused14 = m.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(m.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzob zzob) {
        if (zzob == null) {
            return false;
        }
        return zzob.zzc.equals(this.zzb.zze());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzlu zzlu, String str) {
        zzug zzug = zzlu.zzd;
        if (zzug == null || !zzug.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = zzoc$$ExternalSyntheticApiModelOutline2.m().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            zzv(zzlu.zzb, zzlu.zzd);
        }
    }

    public final void zzd(zzlu zzlu, String str, boolean z) {
        zzug zzug = zzlu.zzd;
        if ((zzug == null || !zzug.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzlu zzlu, zzab zzab, zzht zzht) {
    }

    public final void zzf(zzlu zzlu, int i, long j, long j2) {
        long j3;
        zzug zzug = zzlu.zzd;
        if (zzug != null) {
            zzug zzug2 = zzug;
            String zzf2 = this.zzb.zzf(zzlu.zzb, zzug);
            Long l = (Long) this.zzh.get(zzf2);
            Long l2 = (Long) this.zzg.get(zzf2);
            HashMap hashMap = this.zzh;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(zzf2, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.zzg;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(zzf2, Long.valueOf(j4 + ((long) i)));
        }
    }

    public final void zzg(zzlu zzlu, zzuc zzuc) {
        zzug zzug = zzlu.zzd;
        if (zzug != null) {
            zzab zzab = zzuc.zzb;
            zzab.getClass();
            zzab zzab2 = zzab;
            zzug zzug2 = zzug;
            zzob zzob = new zzob(zzab, 0, this.zzb.zzf(zzlu.zzb, zzug));
            int i = zzuc.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzp = zzob;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.zzq = zzob;
                        return;
                    }
                    return;
                }
            }
            this.zzo = zzob;
        }
    }

    public final /* synthetic */ void zzh(zzlu zzlu, int i, long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f1, code lost:
        if (r8 != 1) goto L_0x01f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzbk r20, com.google.android.gms.internal.ads.zzlv r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r2 = r21.zzb()
            if (r2 != 0) goto L_0x000c
            goto L_0x03d9
        L_0x000c:
            r2 = 0
            r3 = 0
        L_0x000e:
            int r4 = r21.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0038
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzlu r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzoe r4 = r0.zzb
            r4.zzk(r6)
            goto L_0x0035
        L_0x0026:
            if (r4 != r5) goto L_0x0030
            com.google.android.gms.internal.ads.zzoe r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzj(r6, r5)
            goto L_0x0035
        L_0x0030:
            com.google.android.gms.internal.ads.zzoe r4 = r0.zzb
            r4.zzi(r6)
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0038:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzlu r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzbq r7 = r6.zzb
            com.google.android.gms.internal.ads.zzug r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x0051:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00cd
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.zzby r7 = r20.zzo()
            com.google.android.gms.internal.ads.zzfxn r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L_0x006c:
            if (r13 >= r12) goto L_0x0092
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzbx r14 = (com.google.android.gms.internal.ads.zzbx) r14
            r15 = 0
        L_0x0075:
            int r5 = r14.zza
            int r16 = r13 + 1
            if (r15 >= r5) goto L_0x008d
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzab r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzu r5 = r5.zzs
            if (r5 == 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            int r15 = r15 + 1
            goto L_0x0075
        L_0x008d:
            r13 = r16
            r5 = 11
            goto L_0x006c
        L_0x0092:
            r5 = r10
        L_0x0093:
            if (r5 == 0) goto L_0x00cd
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzei.zza
            android.media.metrics.PlaybackMetrics$Builder r7 = androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0.m((java.lang.Object) r7)
            r12 = 0
        L_0x009e:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c9
            com.google.android.gms.internal.ads.zzt r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b2
            r5 = 3
            goto L_0x00ca
        L_0x00b2:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00bc
            r5 = 2
            goto L_0x00ca
        L_0x00bc:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00c6
            r5 = 6
            goto L_0x00ca
        L_0x00c6:
            int r12 = r12 + 1
            goto L_0x009e
        L_0x00c9:
            r5 = 1
        L_0x00ca:
            android.media.metrics.PlaybackMetrics.Builder unused = r7.setDrmType(r5)
        L_0x00cd:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00da
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00da:
            com.google.android.gms.internal.ads.zzbd r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00e2
            goto L_0x0284
        L_0x00e2:
            android.content.Context r7 = r0.zza
            int r8 = r5.zza
            r12 = 1001(0x3e9, float:1.403E-42)
            if (r8 != r12) goto L_0x00ef
            r7 = 20
        L_0x00ec:
            r8 = 0
            goto L_0x025f
        L_0x00ef:
            r8 = r5
            com.google.android.gms.internal.ads.zzib r8 = (com.google.android.gms.internal.ads.zzib) r8
            int r12 = r8.zzc
            if (r12 != r11) goto L_0x00f8
            r12 = 1
            goto L_0x00f9
        L_0x00f8:
            r12 = 0
        L_0x00f9:
            int r8 = r8.zzg
            java.lang.Throwable r13 = r5.getCause()
            r13.getClass()
            r17 = r13
            java.lang.Throwable r17 = (java.lang.Throwable) r17
            boolean r14 = r13 instanceof java.io.IOException
            r15 = 23
            if (r14 == 0) goto L_0x01eb
            boolean r8 = r13 instanceof com.google.android.gms.internal.ads.zzgr
            if (r8 == 0) goto L_0x0118
            com.google.android.gms.internal.ads.zzgr r13 = (com.google.android.gms.internal.ads.zzgr) r13
            int r7 = r13.zzc
            r8 = r7
            r7 = 5
            goto L_0x025f
        L_0x0118:
            boolean r8 = r13 instanceof com.google.android.gms.internal.ads.zzgq
            if (r8 != 0) goto L_0x01e7
            boolean r8 = r13 instanceof com.google.android.gms.internal.ads.zzbc
            if (r8 == 0) goto L_0x0122
            goto L_0x01e7
        L_0x0122:
            boolean r8 = r13 instanceof com.google.android.gms.internal.ads.zzgp
            if (r8 != 0) goto L_0x01b9
            boolean r12 = r13 instanceof com.google.android.gms.internal.ads.zzgz
            if (r12 == 0) goto L_0x012c
            goto L_0x01b9
        L_0x012c:
            int r7 = r5.zza
            r8 = 1002(0x3ea, float:1.404E-42)
            if (r7 != r8) goto L_0x0135
            r7 = 21
            goto L_0x00ec
        L_0x0135:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzqy
            if (r7 == 0) goto L_0x0185
            java.lang.Throwable r7 = r13.getCause()
            r7.getClass()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r8 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0157
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = com.google.android.gms.internal.ads.zzei.zzm(r7)
            int r8 = zzr(r7)
            goto L_0x0255
        L_0x0157:
            int r8 = com.google.android.gms.internal.ads.zzei.zza
            if (r8 < r15) goto L_0x0164
            boolean r8 = androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0.m((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0164
            r7 = 27
            goto L_0x00ec
        L_0x0164:
            boolean r8 = r7 instanceof android.media.NotProvisionedException
            if (r8 == 0) goto L_0x016b
            r7 = 24
            goto L_0x00ec
        L_0x016b:
            boolean r8 = r7 instanceof android.media.DeniedByServerException
            if (r8 == 0) goto L_0x0173
            r7 = 29
            goto L_0x00ec
        L_0x0173:
            boolean r8 = r7 instanceof com.google.android.gms.internal.ads.zzri
            if (r8 == 0) goto L_0x0179
            goto L_0x0201
        L_0x0179:
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzqx
            if (r7 == 0) goto L_0x0181
            r7 = 28
            goto L_0x00ec
        L_0x0181:
            r7 = 30
            goto L_0x00ec
        L_0x0185:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzgm
            if (r7 == 0) goto L_0x01b5
            java.lang.Throwable r7 = r13.getCause()
            boolean r7 = r7 instanceof java.io.FileNotFoundException
            if (r7 == 0) goto L_0x01b5
            java.lang.Throwable r7 = r13.getCause()
            r7.getClass()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Throwable r7 = r7.getCause()
            boolean r8 = r7 instanceof android.system.ErrnoException
            r12 = 31
            if (r8 == 0) goto L_0x01b1
            android.system.ErrnoException r7 = (android.system.ErrnoException) r7
            int r7 = r7.errno
            int r8 = android.system.OsConstants.EACCES
            if (r7 != r8) goto L_0x01b1
            r7 = 32
            goto L_0x00ec
        L_0x01b1:
            r7 = 31
            goto L_0x00ec
        L_0x01b5:
            r7 = 9
            goto L_0x00ec
        L_0x01b9:
            com.google.android.gms.internal.ads.zzdw r7 = com.google.android.gms.internal.ads.zzdw.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01c6
            r7 = 3
            goto L_0x00ec
        L_0x01c6:
            java.lang.Throwable r7 = r13.getCause()
            boolean r12 = r7 instanceof java.net.UnknownHostException
            if (r12 == 0) goto L_0x01d1
            r7 = 6
            goto L_0x00ec
        L_0x01d1:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01d8
            r7 = 7
            goto L_0x00ec
        L_0x01d8:
            if (r8 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.zzgp r13 = (com.google.android.gms.internal.ads.zzgp) r13
            int r7 = r13.zzb
            if (r7 != r11) goto L_0x01e3
            r7 = 4
            goto L_0x00ec
        L_0x01e3:
            r7 = 8
            goto L_0x00ec
        L_0x01e7:
            r7 = 11
            goto L_0x00ec
        L_0x01eb:
            if (r12 == 0) goto L_0x01f5
            r7 = 35
            if (r8 == 0) goto L_0x00ec
            if (r8 != r11) goto L_0x01f5
            goto L_0x00ec
        L_0x01f5:
            if (r12 == 0) goto L_0x01fd
            if (r8 != r9) goto L_0x01fd
            r7 = 15
            goto L_0x00ec
        L_0x01fd:
            if (r12 == 0) goto L_0x0205
            if (r8 != r6) goto L_0x0205
        L_0x0201:
            r7 = 23
            goto L_0x00ec
        L_0x0205:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzsj
            if (r7 == 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzsj r13 = (com.google.android.gms.internal.ads.zzsj) r13
            java.lang.String r7 = r13.zzd
            int r7 = com.google.android.gms.internal.ads.zzei.zzm(r7)
            r8 = r7
            r7 = 13
            goto L_0x025f
        L_0x0215:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzsf
            r8 = 14
            if (r7 == 0) goto L_0x0223
            com.google.android.gms.internal.ads.zzsf r13 = (com.google.android.gms.internal.ads.zzsf) r13
            int r7 = r13.zzb
            r8 = r7
            r7 = 14
            goto L_0x025f
        L_0x0223:
            boolean r7 = r13 instanceof java.lang.OutOfMemoryError
            if (r7 == 0) goto L_0x022b
            r7 = 14
            goto L_0x00ec
        L_0x022b:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzpi
            if (r7 == 0) goto L_0x0239
            com.google.android.gms.internal.ads.zzpi r13 = (com.google.android.gms.internal.ads.zzpi) r13
            int r7 = r13.zza
            r8 = 17
            r8 = r7
            r7 = 17
            goto L_0x025f
        L_0x0239:
            boolean r7 = r13 instanceof com.google.android.gms.internal.ads.zzpl
            if (r7 == 0) goto L_0x0247
            com.google.android.gms.internal.ads.zzpl r13 = (com.google.android.gms.internal.ads.zzpl) r13
            int r7 = r13.zza
            r8 = 18
            r8 = r7
            r7 = 18
            goto L_0x025f
        L_0x0247:
            boolean r7 = r13 instanceof android.media.MediaCodec.CryptoException
            if (r7 == 0) goto L_0x025b
            android.media.MediaCodec$CryptoException r13 = (android.media.MediaCodec.CryptoException) r13
            int r7 = r13.getErrorCode()
            int r8 = zzr(r7)
        L_0x0255:
            r18 = r8
            r8 = r7
            r7 = r18
            goto L_0x025f
        L_0x025b:
            r7 = 22
            goto L_0x00ec
        L_0x025f:
            android.media.metrics.PlaybackSession r12 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r13 = androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0.m()
            long r14 = r0.zzd
            long r14 = r3 - r14
            android.media.metrics.PlaybackErrorEvent$Builder r13 = r13.setTimeSinceCreatedMillis(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r7 = r13.setErrorCode(r7)
            android.media.metrics.PlaybackErrorEvent$Builder r7 = r7.setSubErrorCode(r8)
            android.media.metrics.PlaybackErrorEvent$Builder r5 = r7.setException(r5)
            android.media.metrics.PlaybackErrorEvent r5 = r5.build()
            r12.reportPlaybackErrorEvent(r5)
            r0.zzz = r11
            r0.zzn = r10
        L_0x0284:
            boolean r5 = r1.zzd(r6)
            if (r5 == 0) goto L_0x02b0
            com.google.android.gms.internal.ads.zzby r5 = r20.zzo()
            boolean r7 = r5.zzb(r6)
            boolean r8 = r5.zzb(r11)
            boolean r5 = r5.zzb(r9)
            if (r7 != 0) goto L_0x02a1
            if (r8 != 0) goto L_0x02a1
            if (r5 == 0) goto L_0x02b0
            r5 = 1
        L_0x02a1:
            if (r7 != 0) goto L_0x02a6
            r0.zzw(r3, r10, r2)
        L_0x02a6:
            if (r8 != 0) goto L_0x02ab
            r0.zzt(r3, r10, r2)
        L_0x02ab:
            if (r5 != 0) goto L_0x02b0
            r0.zzu(r3, r10, r2)
        L_0x02b0:
            com.google.android.gms.internal.ads.zzob r5 = r0.zzo
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L_0x02c8
            com.google.android.gms.internal.ads.zzob r5 = r0.zzo
            com.google.android.gms.internal.ads.zzab r7 = r5.zza
            int r8 = r7.zzw
            r12 = -1
            if (r8 == r12) goto L_0x02c8
            int r5 = r5.zzb
            r0.zzw(r3, r7, r2)
            r0.zzo = r10
        L_0x02c8:
            com.google.android.gms.internal.ads.zzob r5 = r0.zzp
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L_0x02db
            com.google.android.gms.internal.ads.zzob r5 = r0.zzp
            com.google.android.gms.internal.ads.zzab r7 = r5.zza
            int r5 = r5.zzb
            r0.zzt(r3, r7, r2)
            r0.zzp = r10
        L_0x02db:
            com.google.android.gms.internal.ads.zzob r5 = r0.zzq
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L_0x02ee
            com.google.android.gms.internal.ads.zzob r5 = r0.zzq
            com.google.android.gms.internal.ads.zzab r7 = r5.zza
            int r5 = r5.zzb
            r0.zzu(r3, r7, r2)
            r0.zzq = r10
        L_0x02ee:
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzdw r5 = com.google.android.gms.internal.ads.zzdw.zzb(r5)
            int r5 = r5.zza()
            switch(r5) {
                case 0: goto L_0x030f;
                case 1: goto L_0x030c;
                case 2: goto L_0x030a;
                case 3: goto L_0x0308;
                case 4: goto L_0x0306;
                case 5: goto L_0x0304;
                case 6: goto L_0x02fb;
                case 7: goto L_0x0302;
                case 8: goto L_0x02fb;
                case 9: goto L_0x02ff;
                case 10: goto L_0x02fd;
                default: goto L_0x02fb;
            }
        L_0x02fb:
            r13 = 1
            goto L_0x0310
        L_0x02fd:
            r13 = 7
            goto L_0x0310
        L_0x02ff:
            r13 = 8
            goto L_0x0310
        L_0x0302:
            r13 = 3
            goto L_0x0310
        L_0x0304:
            r13 = 6
            goto L_0x0310
        L_0x0306:
            r13 = 5
            goto L_0x0310
        L_0x0308:
            r13 = 4
            goto L_0x0310
        L_0x030a:
            r13 = 2
            goto L_0x0310
        L_0x030c:
            r13 = 9
            goto L_0x0310
        L_0x030f:
            r13 = 0
        L_0x0310:
            int r5 = r0.zzm
            if (r13 == r5) goto L_0x032f
            r0.zzm = r13
            android.media.metrics.PlaybackSession r5 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r7 = com.google.android.gms.internal.ads.zzoc$$ExternalSyntheticApiModelOutline2.m()
            android.media.metrics.NetworkEvent$Builder r7 = r7.setNetworkType(r13)
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.NetworkEvent$Builder r7 = r7.setTimeSinceCreatedMillis(r12)
            android.media.metrics.NetworkEvent r7 = r7.build()
            r5.reportNetworkEvent(r7)
        L_0x032f:
            int r5 = r20.zzf()
            if (r5 == r6) goto L_0x0337
            r0.zzu = r2
        L_0x0337:
            r5 = r20
            com.google.android.gms.internal.ads.zzlr r5 = (com.google.android.gms.internal.ads.zzlr) r5
            com.google.android.gms.internal.ads.zzib r5 = r5.zzC()
            r7 = 10
            if (r5 != 0) goto L_0x0346
            r0.zzv = r2
            goto L_0x034e
        L_0x0346:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x034e
            r0.zzv = r11
        L_0x034e:
            int r2 = r20.zzf()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x0358
            r5 = 5
            goto L_0x03a6
        L_0x0358:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x035f
            r5 = 13
            goto L_0x03a6
        L_0x035f:
            r5 = 4
            if (r2 != r5) goto L_0x0365
            r5 = 11
            goto L_0x03a6
        L_0x0365:
            r8 = 12
            if (r2 != r6) goto L_0x0387
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x0385
            if (r2 == r6) goto L_0x0385
            if (r2 != r8) goto L_0x0372
            goto L_0x0385
        L_0x0372:
            boolean r2 = r20.zzu()
            if (r2 != 0) goto L_0x037a
            r5 = 7
            goto L_0x03a6
        L_0x037a:
            int r2 = r20.zzg()
            if (r2 == 0) goto L_0x0383
            r5 = 10
            goto L_0x03a6
        L_0x0383:
            r5 = 6
            goto L_0x03a6
        L_0x0385:
            r5 = 2
            goto L_0x03a6
        L_0x0387:
            if (r2 != r9) goto L_0x039b
            boolean r2 = r20.zzu()
            if (r2 != 0) goto L_0x0390
            goto L_0x03a6
        L_0x0390:
            int r2 = r20.zzg()
            if (r2 == 0) goto L_0x0399
            r5 = 9
            goto L_0x03a6
        L_0x0399:
            r5 = 3
            goto L_0x03a6
        L_0x039b:
            if (r2 != r11) goto L_0x03a4
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03a4
            r5 = 12
            goto L_0x03a6
        L_0x03a4:
            int r5 = r0.zzl
        L_0x03a6:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03c8
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = com.google.android.gms.internal.ads.zzoc$$ExternalSyntheticApiModelOutline2.m()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03c8:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03d9
            com.google.android.gms.internal.ads.zzoe r3 = r0.zzb
            com.google.android.gms.internal.ads.zzlu r1 = r1.zzc(r2)
            r3.zzg(r1)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoc.zzi(com.google.android.gms.internal.ads.zzbk, com.google.android.gms.internal.ads.zzlv):void");
    }

    public final void zzj(zzlu zzlu, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
    }

    public final /* synthetic */ void zzk(zzlu zzlu, int i) {
    }

    public final void zzl(zzlu zzlu, zzbd zzbd) {
        this.zzn = zzbd;
    }

    public final void zzm(zzlu zzlu, zzbi zzbi, zzbi zzbi2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    public final /* synthetic */ void zzn(zzlu zzlu, Object obj, long j) {
    }

    public final void zzo(zzlu zzlu, zzhs zzhs) {
        this.zzw += zzhs.zzg;
        this.zzx += zzhs.zze;
    }

    public final /* synthetic */ void zzp(zzlu zzlu, zzab zzab, zzht zzht) {
    }

    public final void zzq(zzlu zzlu, zzcd zzcd) {
        zzob zzob = this.zzo;
        if (zzob != null) {
            zzab zzab = zzob.zza;
            if (zzab.zzw == -1) {
                zzz zzb2 = zzab.zzb();
                zzb2.zzaf(zzcd.zzb);
                zzb2.zzK(zzcd.zzc);
                this.zzo = new zzob(zzb2.zzag(), 0, zzob.zzc);
            }
        }
    }
}

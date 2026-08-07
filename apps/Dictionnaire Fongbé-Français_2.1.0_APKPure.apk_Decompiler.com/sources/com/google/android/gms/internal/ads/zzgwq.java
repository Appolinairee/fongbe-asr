package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgwq implements zzgzp {
    private final zzgwp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwq(zzgwp zzgwp) {
        zzgye.zzc(zzgwp, "input");
        zzgwp zzgwp2 = zzgwp;
        this.zza = zzgwp;
        zzgwp.zzc = this;
    }

    private final void zzO(Object obj, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgzv.zzh(obj, this, zzgxb);
            if (this.zzb != this.zzc) {
                throw new zzgyg("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzP(Object obj, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        zzgwp zzgwp = this.zza;
        int zzm = zzgwp.zzm();
        if (zzgwp.zza < zzgwp.zzb) {
            int zzd2 = zzgwp.zzd(zzm);
            this.zza.zza++;
            zzgzv.zzh(obj, this, zzgxb);
            this.zza.zzy(0);
            zzgwp zzgwp2 = this.zza;
            zzgwp2.zza--;
            zzgwp2.zzz(zzd2);
            return;
        }
        throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    public static zzgwq zzq(zzgwp zzgwp) {
        zzgwq zzgwq = zzgwp.zzc;
        if (zzgwq != null) {
            return zzgwq;
        }
        return new zzgwq(zzgwp);
    }

    public final void zzA(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgyr.zzg(this.zza.zzn());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc2 = zzm + this.zza.zzc();
                do {
                    zzgyr.zzg(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc3 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzB(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxi) {
            zzgxi zzgxi = (zzgxi) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc2 = this.zza.zzc() + zzm;
                do {
                    zzgxi.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgxi.zzh(this.zza.zzb());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc3 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    @Deprecated
    public final void zzC(List list, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                Object zze = zzgzv.zze();
                zzO(zze, zzgzv, zzgxb);
                zzgzv.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    public final void zzD(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgxs.zzi(this.zza.zzg());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgxs.zzi(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzE(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyr.zzg(this.zza.zzo());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgyr.zzg(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzF(List list, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                Object zze = zzgzv.zze();
                zzP(zze, zzgzv, zzgxb);
                zzgzv.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    public final void zzG(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc2 = this.zza.zzc() + zzm;
                do {
                    zzgxs.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgxs.zzi(this.zza.zzj());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc3 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzH(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgyr.zzg(this.zza.zzs());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc2 = zzm + this.zza.zzc();
                do {
                    zzgyr.zzg(this.zza.zzs());
                } while (this.zza.zzc() < zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc3 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzI(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgxs.zzi(this.zza.zzk());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgxs.zzi(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzJ(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyr.zzg(this.zza.zzt());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgyr.zzg(this.zza.zzt());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzl;
        int i;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgyo) && !z) {
                zzgyo zzgyo = (zzgyo) list;
                do {
                    zzp();
                    zzgyo.zzb();
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                do {
                    list.add(z ? zzs() : zzr());
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            }
            this.zzd = i;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    public final void zzL(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgxs.zzi(this.zza.zzm());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgxs.zzi(this.zza.zzm());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzM(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgyr.zzg(this.zza.zzu());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgyr.zzg(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzl();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    public final zzgwj zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    public final void zzt(Object obj, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        zzR(3);
        zzO(obj, zzgzv, zzgxb);
    }

    public final void zzu(Object obj, zzgzv zzgzv, zzgxb zzgxb) throws IOException {
        zzR(2);
        zzP(obj, zzgzv, zzgxb);
    }

    public final void zzv(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgvz) {
            zzgvz zzgvz = (zzgvz) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgvz.zzg(this.zza.zzB());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgvz.zzg(this.zza.zzB());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    public final void zzx(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgwy) {
            zzgwy zzgwy = (zzgwy) list;
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    zzgwy.zzh(this.zza.zza());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc2 = zzm + this.zza.zzc();
                do {
                    zzgwy.zzh(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc3 = zzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzy(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    zzgxs.zzi(this.zza.zze());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else if (i2 == 2) {
                zzgwp zzgwp = this.zza;
                int zzc2 = zzgwp.zzc() + zzgwp.zzm();
                do {
                    zzgxs.zzi(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else if (i3 == 2) {
                zzgwp zzgwp2 = this.zza;
                int zzc3 = zzgwp2.zzc() + zzgwp2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc3);
                zzQ(zzc3);
                return;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }

    public final void zzz(List list) throws IOException {
        int i;
        int zzl;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc2 = this.zza.zzc() + zzm;
                do {
                    zzgxs.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                return;
            } else if (i2 == 5) {
                do {
                    zzgxs.zzi(this.zza.zzf());
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc3 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc3);
                return;
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i = zzl;
            } else {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
        }
        this.zzd = i;
    }
}

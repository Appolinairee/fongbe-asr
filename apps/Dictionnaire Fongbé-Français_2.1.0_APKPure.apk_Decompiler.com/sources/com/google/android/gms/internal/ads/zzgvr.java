package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgvs;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzgvr<MessageType extends zzgvs<MessageType, BuilderType>, BuilderType extends zzgvr<MessageType, BuilderType>> implements zzgzb {
    private String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzgzn) {
                ((zzgzn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (T next : iterable) {
                if (next == null) {
                    zzc(list, size2);
                }
                list.add(next);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj = list2.get(i);
            if (obj == null) {
                zzc(list, size2);
            }
            list.add(obj);
        }
    }

    protected static zzhag zzbb(zzgzc zzgzc) {
        return new zzhag(zzgzc);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    protected static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgye.zzb;
        iterable.getClass();
        if (iterable instanceof zzgyo) {
            List zza = ((zzgyo) iterable).zza();
            zzgyo zzgyo = (zzgyo) list;
            int size = list.size();
            for (Object next : zza) {
                if (next == null) {
                    String str = "Element at index " + (zzgyo.size() - size) + " is null.";
                    int size2 = zzgyo.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            zzgyo.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzgwj) {
                    zzgwj zzgwj = (zzgwj) next;
                    zzgyo.zzb();
                } else if (next instanceof byte[]) {
                    byte[] bArr2 = (byte[]) next;
                    zzgwj.zzv(bArr2, 0, bArr2.length);
                    zzgyo.zzb();
                } else {
                    zzgyo.add((String) next);
                }
            }
        } else if (iterable instanceof zzgzl) {
            list.addAll((Collection) iterable);
        } else {
            zzb(iterable, list);
        }
    }

    private static void zzc(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    /* renamed from: zzaC */
    public abstract BuilderType zzaP();

    /* access modifiers changed from: protected */
    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgwj zzgwj) throws zzgyg {
        try {
            zzgwp zzl = zzgwj.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF */
    public BuilderType zzaR(zzgwp zzgwp) throws IOException {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzaW(zzgwp, zzgxb.zza);
    }

    /* renamed from: zzaG */
    public BuilderType zzaS(zzgzc zzgzc) {
        if (zzbt().getClass().isInstance(zzgzc)) {
            return zzaD((zzgvs) zzgzc);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgwp zzG = zzgwp.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI */
    public BuilderType zzaU(byte[] bArr) throws zzgyg {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        try {
            zzgwp zzl = zzgwj.zzl();
            zzaW(zzl, zzgxb);
            zzl.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaK */
    public abstract BuilderType zzaW(zzgwp zzgwp, zzgxb zzgxb) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgxb zzgxb) throws IOException {
        zzgwp zzG = zzgwp.zzG(inputStream, 4096);
        zzaW(zzG, zzgxb);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM */
    public BuilderType zzaY(byte[] bArr, zzgxb zzgxb) throws zzgyg {
        return zzba(bArr, 0, bArr.length, zzgxb);
    }

    /* renamed from: zzaN */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzgyg {
        try {
            zzgwp zzH = zzgwp.zzH(bArr, i, i2, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaO */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzgxb zzgxb) throws zzgyg {
        try {
            zzgwp zzH = zzgwp.zzH(bArr, i, i2, false);
            zzaW(zzH, zzgxb);
            zzH.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzgzb zzaQ(zzgwj zzgwj) throws zzgyg {
        zzaE(zzgwj);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaV(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        zzaJ(zzgwj, zzgxb);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaX(InputStream inputStream, zzgxb zzgxb) throws IOException {
        zzaL(inputStream, zzgxb);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzbf(inputStream, zzgxb.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgxb zzgxb) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgvq(inputStream, zzgwp.zzE(read, inputStream)), zzgxb);
        return true;
    }
}

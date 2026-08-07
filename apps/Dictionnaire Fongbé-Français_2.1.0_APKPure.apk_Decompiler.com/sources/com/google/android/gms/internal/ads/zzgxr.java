package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzgxr;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzgxr<MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> extends zzgvs<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgxr<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhai zzt = zzhai.zzc();

    protected static zzgxt zzbA() {
        return zzgvz.zzd();
    }

    protected static zzgxt zzbB(zzgxt zzgxt) {
        int size = zzgxt.size();
        return zzgxt.zze(size + size);
    }

    protected static zzgxu zzbC() {
        return zzgwy.zze();
    }

    protected static zzgxu zzbD(zzgxu zzgxu) {
        int size = zzgxu.size();
        return zzgxu.zzg(size + size);
    }

    protected static zzgxy zzbE() {
        return zzgxi.zze();
    }

    protected static zzgxy zzbF(zzgxy zzgxy) {
        int size = zzgxy.size();
        return zzgxy.zzg(size + size);
    }

    protected static zzgxz zzbG() {
        return zzgxs.zzg();
    }

    protected static zzgxz zzbH(zzgxz zzgxz) {
        int size = zzgxz.size();
        return zzgxz.zzh(size + size);
    }

    protected static zzgyc zzbI() {
        return zzgyr.zzh();
    }

    protected static zzgyc zzbJ(zzgyc zzgyc) {
        int size = zzgyc.size();
        return zzgyc.zze(size + size);
    }

    protected static <E> zzgyd<E> zzbK() {
        return zzgzn.zzd();
    }

    protected static <E> zzgyd<E> zzbL(zzgyd<E> zzgyd) {
        int size = zzgyd.size();
        return zzgyd.zzf(size + size);
    }

    static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzbQ(zzgzc zzgzc, String str, Object[] objArr) {
        return new zzgzo(zzgzc, str, objArr);
    }

    static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e);
        }
    }

    protected static <T extends zzgxr> void zzbZ(Class<T> cls, T t) {
        t.zzbV();
        zzc.put(cls, t);
    }

    public static <ContainingType extends zzgzc, Type> zzgxp<ContainingType, Type> zzbe(ContainingType containingtype, zzgzc zzgzc, zzgxw zzgxw, int i, zzhau zzhau, boolean z, Class cls) {
        return new zzgxp(containingtype, zzgzn.zzd(), zzgzc, new zzgxo(zzgxw, i, zzhau, true, z), cls);
    }

    public static <ContainingType extends zzgzc, Type> zzgxp<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgzc zzgzc, zzgxw zzgxw, int i, zzhau zzhau, Class cls) {
        return new zzgxp(containingtype, type, zzgzc, new zzgxo(zzgxw, i, zzhau, false, false), cls);
    }

    static <T extends zzgxr> T zzbh(Class<T> cls) {
        T t = (zzgxr) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzgxr) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((zzgxr) zzhao.zzg(cls)).zzbt();
            if (t != null) {
                zzc.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzgxr<T, ?>> T zzbk(T t, InputStream inputStream) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T zzg = zzg(t, inputStream, zzgxb.zza);
        zzf(zzg);
        return zzg;
    }

    protected static <T extends zzgxr<T, ?>> T zzbl(T t, InputStream inputStream, zzgxb zzgxb) throws zzgyg {
        T zzg = zzg(t, inputStream, zzgxb);
        zzf(zzg);
        return zzg;
    }

    protected static <T extends zzgxr<T, ?>> T zzbm(T t, zzgwj zzgwj) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T zzbr = zzbr(t, zzgwj, zzgxb.zza);
        zzf(zzbr);
        return zzbr;
    }

    protected static <T extends zzgxr<T, ?>> T zzbn(T t, zzgwp zzgwp) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzbs(t, zzgwp, zzgxb.zza);
    }

    protected static <T extends zzgxr<T, ?>> T zzbo(T t, InputStream inputStream) throws zzgyg {
        zzgwp zzG = zzgwp.zzG(inputStream, 4096);
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T zzbz = zzbz(t, zzG, zzgxb.zza);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgxr<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzbv(t, byteBuffer, zzgxb.zza);
    }

    protected static <T extends zzgxr<T, ?>> T zzbq(T t, byte[] bArr) throws zzgyg {
        int length = bArr.length;
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T zzi = zzi(t, bArr, 0, length, zzgxb.zza);
        zzf(zzi);
        return zzi;
    }

    protected static <T extends zzgxr<T, ?>> T zzbr(T t, zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        T zzh = zzh(t, zzgwj, zzgxb);
        zzf(zzh);
        return zzh;
    }

    protected static <T extends zzgxr<T, ?>> T zzbs(T t, zzgwp zzgwp, zzgxb zzgxb) throws zzgyg {
        T zzbz = zzbz(t, zzgwp, zzgxb);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgxr<T, ?>> T zzbu(T t, InputStream inputStream, zzgxb zzgxb) throws zzgyg {
        T zzbz = zzbz(t, zzgwp.zzG(inputStream, 4096), zzgxb);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgxr<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgxb zzgxb) throws zzgyg {
        zzgwp zzgwp;
        int i = zzgwp.zzd;
        if (byteBuffer.hasArray()) {
            zzgwp = zzgwp.zzH(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (!byteBuffer.isDirect() || !zzhao.zzB()) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzgwp = zzgwp.zzH(bArr, 0, remaining, true);
        } else {
            zzgwp = new zzgwn(byteBuffer, false, (zzgwo) null);
        }
        T zzbs = zzbs(t, zzgwp, zzgxb);
        zzf(zzbs);
        return zzbs;
    }

    protected static <T extends zzgxr<T, ?>> T zzbx(T t, byte[] bArr, zzgxb zzgxb) throws zzgyg {
        T zzi = zzi(t, bArr, 0, bArr.length, zzgxb);
        zzf(zzi);
        return zzi;
    }

    protected static <T extends zzgxr<T, ?>> T zzby(T t, zzgwp zzgwp) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzbz(t, zzgwp, zzgxb.zza);
    }

    static <T extends zzgxr<T, ?>> T zzbz(T t, zzgwp zzgwp, zzgxb zzgxb) throws zzgyg {
        T zzbj = t.zzbj();
        try {
            zzgzv zzb2 = zzgzm.zza().zzb(zzbj.getClass());
            zzb2.zzh(zzbj, zzgwq.zzq(zzgwp), zzgxb);
            zzb2.zzf(zzbj);
            return zzbj;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg((IOException) e);
            }
            throw e;
        } catch (zzhag e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyg) {
                throw ((zzgyg) e3.getCause());
            }
            throw new zzgyg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgyg) {
                throw ((zzgyg) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzgzv<?> zzgzv) {
        if (zzgzv != null) {
            return zzgzv.zza(this);
        }
        return zzgzm.zza().zzb(getClass()).zza(this);
    }

    /* access modifiers changed from: private */
    public static <MessageType extends zzgxn<MessageType, BuilderType>, BuilderType, T> zzgxp<MessageType, T> zzd(zzgwz<MessageType, T> zzgwz) {
        return (zzgxp) zzgwz;
    }

    private static <T extends zzgxr<T, ?>> T zzf(T t) throws zzgyg {
        if (t == null || t.zzbw()) {
            return t;
        }
        throw t.zzaP().zza();
    }

    private static <T extends zzgxr<T, ?>> T zzg(T t, InputStream inputStream, zzgxb zzgxb) throws zzgyg {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgwp zzG = zzgwp.zzG(new zzgvq(inputStream, zzgwp.zzE(read, inputStream)), 4096);
            T zzbz = zzbz(t, zzG, zzgxb);
            zzG.zzy(0);
            return zzbz;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg((IOException) e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzgyg(e2);
        }
    }

    private static <T extends zzgxr<T, ?>> T zzh(T t, zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        zzgwp zzl = zzgwj.zzl();
        T zzbz = zzbz(t, zzl, zzgxb);
        zzl.zzy(0);
        return zzbz;
    }

    /* access modifiers changed from: private */
    public static <T extends zzgxr<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzgxb zzgxb) throws zzgyg {
        if (i2 == 0) {
            return t;
        }
        T zzbj = t.zzbj();
        try {
            zzgzv zzb2 = zzgzm.zza().zzb(zzbj.getClass());
            zzb2.zzi(zzbj, bArr, i, i + i2, new zzgvx(zzgxb));
            zzb2.zzf(zzbj);
            return zzbj;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg((IOException) e);
            }
            throw e;
        } catch (zzhag e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyg) {
                throw ((zzgyg) e3.getCause());
            }
            throw new zzgyg(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhai.zzc()) {
            this.zzt = zzhai.zzf();
        }
    }

    /* access modifiers changed from: private */
    public static final <T extends zzgxr<T, ?>> boolean zzk(T t, boolean z) {
        byte byteValue = ((Byte) t.zzdc(zzgxq.GET_MEMOIZED_IS_INITIALIZED, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzgzm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzgxq.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, (Object) null);
        }
        return zzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgzm.zza().zzb(getClass()).zzk(this, (zzgxr) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgze.zza(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public int zzaM(zzgzv zzgzv) {
        if (zzcd()) {
            int zzc2 = zzc(zzgzv);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzc2);
        } else if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        } else {
            int zzc3 = zzc(zzgzv);
            zzaS(zzc3);
            return zzc3;
        }
    }

    public zzgzh zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    /* access modifiers changed from: package-private */
    public void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* access modifiers changed from: package-private */
    public int zzaW() {
        return zzgzm.zza().zzb(getClass()).zzb(this);
    }

    /* access modifiers changed from: package-private */
    public int zzaX() {
        return this.zzq;
    }

    public int zzaY() {
        return zzaM((zzgzv) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> BuilderType zzaZ() {
        return (zzgxl) zzdc(zzgxq.NEW_BUILDER, (Object) null, (Object) null);
    }

    public final zzgzk<MessageType> zzbN() {
        return (zzgzk) zzdc(zzgxq.GET_PARSER, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public Object zzbO() throws Exception {
        return zzdc(zzgxq.BUILD_MESSAGE_INFO, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public void zzbS() {
        this.zzq = 0;
    }

    /* access modifiers changed from: package-private */
    public void zzbT() {
        zzaS(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public void zzbU() {
        zzgzm.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    /* access modifiers changed from: package-private */
    public void zzbV() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public void zzbW(int i, zzgwj zzgwj) {
        zzj();
        zzhai zzhai = this.zzt;
        zzhai.zzg();
        if (i != 0) {
            zzhai.zzj((i << 3) | 2, zzgwj);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: protected */
    public final void zzbX(zzhai zzhai) {
        this.zzt = zzhai.zze(this.zzt, zzhai);
    }

    /* access modifiers changed from: protected */
    public void zzbY(int i, int i2) {
        zzj();
        zzhai zzhai = this.zzt;
        zzhai.zzg();
        if (i != 0) {
            zzhai.zzj(i << 3, Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    /* renamed from: zzbb */
    public final BuilderType zzcX() {
        return (zzgxl) zzdc(zzgxq.NEW_BUILDER, (Object) null, (Object) null);
    }

    /* renamed from: zzbc */
    public final BuilderType zzbM() {
        BuilderType buildertype = (zzgxl) zzdc(zzgxq.NEW_BUILDER, (Object) null, (Object) null);
        buildertype.zzbj(this);
        return buildertype;
    }

    /* renamed from: zzbi */
    public final MessageType zzbt() {
        return (zzgxr) zzdc(zzgxq.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public MessageType zzbj() {
        return (zzgxr) zzdc(zzgxq.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
    }

    public final boolean zzbw() {
        return zzk(this, true);
    }

    public void zzcY(zzgww zzgww) throws IOException {
        zzgzm.zza().zzb(getClass()).zzj(this, zzgwx.zza(zzgww));
    }

    /* access modifiers changed from: package-private */
    public void zzca(int i) {
        this.zzq = i;
    }

    /* access modifiers changed from: package-private */
    public boolean zzcc() {
        return zzaX() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    public boolean zzce(int i, zzgwp zzgwp) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgwp);
    }

    /* access modifiers changed from: protected */
    public abstract Object zzdc(zzgxq zzgxq, Object obj, Object obj2);
}

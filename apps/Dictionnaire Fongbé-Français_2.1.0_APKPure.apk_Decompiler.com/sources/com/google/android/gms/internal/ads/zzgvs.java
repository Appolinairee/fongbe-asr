package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgvs;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzgvs<MessageType extends zzgvs<MessageType, BuilderType>, BuilderType extends zzgvr<MessageType, BuilderType>> implements zzgzc {
    protected int zzq = 0;

    protected static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgvr.zzbd(iterable, list);
    }

    protected static void zzaR(zzgwj zzgwj) throws IllegalArgumentException {
        if (!zzgwj.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdF(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzaM(zzgzv zzgzv) {
        return zzaL();
    }

    public zzgwj zzaN() {
        try {
            int zzaY = zzaY();
            zzgwj zzgwj = zzgwj.zzb;
            byte[] bArr = new byte[zzaY];
            zzgws zzgws = new zzgws(bArr, 0, zzaY);
            zzcY(zzgws);
            zzgws.zzF();
            return new zzgwg(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdF("ByteString"), e);
        }
    }

    public zzgzh zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    /* access modifiers changed from: package-private */
    public zzhag zzaP() {
        return new zzhag(this);
    }

    /* access modifiers changed from: package-private */
    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzgwu zzgwu = new zzgwu(outputStream, zzgww.zzB(zzgww.zzD(zzaY) + zzaY));
        zzgwu.zzu(zzaY);
        zzcY(zzgwu);
        zzgwu.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgwu zzgwu = new zzgwu(outputStream, zzgww.zzB(zzaY()));
        zzcY(zzgwu);
        zzgwu.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzgws zzgws = new zzgws(bArr, 0, zzaY);
            zzcY(zzgws);
            zzgws.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdF("byte array"), e);
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaad implements zzfvf {
    public final Object zza() {
        int i = zzaae.zza;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object invoke = cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null);
            if (invoke != null) {
                return (zzca) invoke;
            }
            throw null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public enum zzgyi {
    VOID(Void.class, Void.class, (Class) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzgwj.class, zzgwj.class, zzgwj.zzb),
    ENUM(Integer.TYPE, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    
    private final Class zzl;

    private zzgyi(Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public final Class zza() {
        return this.zzl;
    }
}

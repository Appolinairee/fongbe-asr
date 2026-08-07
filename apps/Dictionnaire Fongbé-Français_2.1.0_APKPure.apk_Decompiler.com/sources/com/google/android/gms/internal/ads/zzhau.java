package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public enum zzhau {
    DOUBLE(zzhav.DOUBLE, 1),
    FLOAT(zzhav.FLOAT, 5),
    INT64(zzhav.LONG, 0),
    UINT64(zzhav.LONG, 0),
    INT32(zzhav.INT, 0),
    FIXED64(zzhav.LONG, 1),
    FIXED32(zzhav.INT, 5),
    BOOL(zzhav.BOOLEAN, 0),
    STRING(zzhav.STRING, 2),
    GROUP(zzhav.MESSAGE, 3),
    MESSAGE(zzhav.MESSAGE, 2),
    BYTES(zzhav.BYTE_STRING, 2),
    UINT32(zzhav.INT, 0),
    ENUM(zzhav.ENUM, 0),
    SFIXED32(zzhav.INT, 5),
    SFIXED64(zzhav.LONG, 1),
    SINT32(zzhav.INT, 0),
    SINT64(zzhav.LONG, 0);
    
    private final zzhav zzt;

    private zzhau(zzhav zzhav, int i) {
        this.zzt = zzhav;
    }

    public final zzhav zza() {
        return this.zzt;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public enum zzgxh {
    DOUBLE(0, 1, zzgyi.DOUBLE),
    FLOAT(1, 1, zzgyi.FLOAT),
    INT64(2, 1, zzgyi.LONG),
    UINT64(3, 1, zzgyi.LONG),
    INT32(4, 1, zzgyi.INT),
    FIXED64(5, 1, zzgyi.LONG),
    FIXED32(6, 1, zzgyi.INT),
    BOOL(7, 1, zzgyi.BOOLEAN),
    STRING(8, 1, zzgyi.STRING),
    MESSAGE(9, 1, zzgyi.MESSAGE),
    BYTES(10, 1, zzgyi.BYTE_STRING),
    UINT32(11, 1, zzgyi.INT),
    ENUM(12, 1, zzgyi.ENUM),
    SFIXED32(13, 1, zzgyi.INT),
    SFIXED64(14, 1, zzgyi.LONG),
    SINT32(15, 1, zzgyi.INT),
    SINT64(16, 1, zzgyi.LONG),
    GROUP(17, 1, zzgyi.MESSAGE),
    DOUBLE_LIST(18, 2, zzgyi.DOUBLE),
    FLOAT_LIST(19, 2, zzgyi.FLOAT),
    INT64_LIST(20, 2, zzgyi.LONG),
    UINT64_LIST(21, 2, zzgyi.LONG),
    INT32_LIST(22, 2, zzgyi.INT),
    FIXED64_LIST(23, 2, zzgyi.LONG),
    FIXED32_LIST(24, 2, zzgyi.INT),
    BOOL_LIST(25, 2, zzgyi.BOOLEAN),
    STRING_LIST(26, 2, zzgyi.STRING),
    MESSAGE_LIST(27, 2, zzgyi.MESSAGE),
    BYTES_LIST(28, 2, zzgyi.BYTE_STRING),
    UINT32_LIST(29, 2, zzgyi.INT),
    ENUM_LIST(30, 2, zzgyi.ENUM),
    SFIXED32_LIST(31, 2, zzgyi.INT),
    SFIXED64_LIST(32, 2, zzgyi.LONG),
    SINT32_LIST(33, 2, zzgyi.INT),
    SINT64_LIST(34, 2, zzgyi.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgyi.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgyi.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgyi.LONG),
    UINT64_LIST_PACKED(38, 3, zzgyi.LONG),
    INT32_LIST_PACKED(39, 3, zzgyi.INT),
    FIXED64_LIST_PACKED(40, 3, zzgyi.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgyi.INT),
    BOOL_LIST_PACKED(42, 3, zzgyi.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgyi.INT),
    ENUM_LIST_PACKED(44, 3, zzgyi.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgyi.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgyi.LONG),
    SINT32_LIST_PACKED(47, 3, zzgyi.INT),
    SINT64_LIST_PACKED(48, 3, zzgyi.LONG),
    GROUP_LIST(49, 2, zzgyi.MESSAGE),
    MAP(50, 4, zzgyi.VOID);
    
    private static final zzgxh[] zzZ = null;
    private final int zzab;

    static {
        zzZ = new zzgxh[r1];
        for (zzgxh zzgxh : values()) {
            zzZ[zzgxh.zzab] = zzgxh;
        }
    }

    private zzgxh(int i, int i2, zzgyi zzgyi) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzgyi.zza();
        } else if (i3 == 3) {
            zzgyi.zza();
        }
        if (i2 == 1) {
            zzgyi zzgyi2 = zzgyi.VOID;
            zzgyi.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}

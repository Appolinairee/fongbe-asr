package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgze {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzgzc zzgzc, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgzc, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i, str, zzb2);
            }
        } else {
            sb.append(10);
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzhaf.zza(zzgwj.zzw((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgwj) {
                sb.append(": \"");
                sb.append(zzhaf.zza((zzgwj) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgxr) {
                sb.append(" {");
                zzd((zzgxr) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                zzb(sb, i3, "key", entry.getKey());
                zzb(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzgzc zzgzc, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        zzgzc zzgzc2 = zzgzc;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgzc.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i3, substring.substring(0, substring.length() - 4), zzgxr.zzbP(method2, zzgzc2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i3, substring.substring(0, substring.length() - 3), zzgxr.zzbP(method, zzgzc2, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object zzbP = zzgxr.zzbP(method4, zzgzc2, new Object[0]);
                    if (method5 == null) {
                        if (zzbP instanceof Boolean) {
                            if (!((Boolean) zzbP).booleanValue()) {
                            }
                        } else if (zzbP instanceof Integer) {
                            if (((Integer) zzbP).intValue() == 0) {
                            }
                        } else if (zzbP instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbP).floatValue()) == 0) {
                            }
                        } else if (!(zzbP instanceof Double)) {
                            if (zzbP instanceof String) {
                                z = zzbP.equals("");
                            } else if (zzbP instanceof zzgwj) {
                                z = zzbP.equals(zzgwj.zzb);
                            } else if (zzbP instanceof zzgzc) {
                                if (zzbP == ((zzgzc) zzbP).zzbt()) {
                                }
                            } else if ((zzbP instanceof Enum) && ((Enum) zzbP).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzbP).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgxr.zzbP(method5, zzgzc2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i3, substring, zzbP);
                }
            }
            i2 = 3;
        }
        if (zzgzc2 instanceof zzgxn) {
            Iterator zzf = ((zzgxn) zzgzc2).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                int i5 = ((zzgxo) entry2.getKey()).zza;
                zzb(sb2, i3, "[" + i5 + "]", entry2.getValue());
            }
        }
        zzhai zzhai = ((zzgxr) zzgzc2).zzt;
        if (zzhai != null) {
            zzhai.zzi(sb2, i3);
        }
    }
}

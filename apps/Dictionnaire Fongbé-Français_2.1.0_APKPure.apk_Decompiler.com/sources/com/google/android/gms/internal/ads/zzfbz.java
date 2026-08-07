package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbz {
    public final List zza;
    public final zzfbr zzb;
    public final List zzc;
    public final zzbvk zzd;

    zzfbz(JsonReader jsonReader, zzbvk zzbvk) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbvk;
        if (!(!((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue() || zzbvk == null || (bundle2 = zzbvk.zzm) == null)) {
            bundle2.putLong(zzdre.SERVER_RESPONSE_PARSE_START.zza(), zzv.zzC().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfbr zzfbr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfbo(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfbr = new zzfbr(jsonReader);
                        if (!(!((Boolean) zzbe.zzc().zza(zzbcl.zzcl)).booleanValue() || zzbvk == null || (bundle = zzbvk.zzm) == null)) {
                            bundle.putLong(zzdre.NORMALIZATION_AD_RESPONSE_START.zza(), zzfbr.zzs);
                            zzbvk.zzm.putLong(zzdre.NORMALIZATION_AD_RESPONSE_END.zza(), zzfbr.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfby(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfbr == null ? new zzfbr(new JsonReader(new StringReader("{}"))) : zzfbr;
    }

    public static zzfbz zza(Reader reader, zzbvk zzbvk) throws zzfbs {
        try {
            zzfbz zzfbz = new zzfbz(new JsonReader(reader), zzbvk);
            IOUtils.closeQuietly((Closeable) reader);
            return zzfbz;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfbs("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) reader);
            throw th;
        }
    }
}

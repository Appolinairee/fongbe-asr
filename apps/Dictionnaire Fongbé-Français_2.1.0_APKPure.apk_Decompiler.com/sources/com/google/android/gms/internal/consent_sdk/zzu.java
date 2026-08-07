package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzu {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzam zzd;
    private final zzbk zze;
    private final zzl zzf;
    private final zzx zzg;
    private final zze zzh;

    zzu(Application application, zzab zzab, Handler handler, Executor executor, zzam zzam, zzbk zzbk, zzl zzl, zzx zzx, zze zze2) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzam;
        this.zze = zzbk;
        this.zzf = zzl;
        this.zzg = zzx;
        this.zzh = zze2;
    }

    private final zzch zzd(zzcf zzcf) throws zzg {
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str = zzcf.zza;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                zzcb zzcb = zzcf.zzb;
                if (zzcb != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i = zzcb.zzc;
                    if (i != 1) {
                        jsonWriter.name("os_type");
                        int i2 = i - 1;
                        if (i2 == 0) {
                            jsonWriter.value("UNKNOWN");
                        } else if (i2 == 1) {
                            jsonWriter.value("ANDROID");
                        }
                    }
                    String str2 = zzcb.zza;
                    if (str2 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str2);
                    }
                    Integer num = zzcb.zzb;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str3 = zzcf.zzc;
                if (str3 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str3);
                }
                Boolean bool = zzcf.zzd;
                if (bool != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool.booleanValue());
                }
                Map map = zzcf.zze;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jsonWriter.name((String) entry.getKey());
                        jsonWriter.value((String) entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzcd zzcd = zzcf.zzf;
                if (zzcd != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzcd.zza;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzcd.zzb;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d = zzcd.zzc;
                    if (d != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d);
                    }
                    List<zzcc> list = zzcd.zzd;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzcc zzcc : list) {
                            jsonWriter.beginObject();
                            Integer num4 = zzcc.zza;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = zzcc.zzb;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = zzcc.zzc;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = zzcc.zzd;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzbz zzbz = zzcf.zzg;
                if (zzbz != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str4 = zzbz.zza;
                    if (str4 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str4);
                    }
                    String str5 = zzbz.zzb;
                    if (str5 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str5);
                    }
                    String str6 = zzbz.zzc;
                    if (str6 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str6);
                    }
                    jsonWriter.endObject();
                }
                zzce zzce = zzcf.zzh;
                if (zzce != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str7 = zzce.zza;
                    if (str7 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str7);
                    }
                    jsonWriter.endObject();
                }
                List<zzca> list2 = zzcf.zzi;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzca ordinal : list2) {
                        switch (ordinal.ordinal()) {
                            case 0:
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                break;
                            case 1:
                                jsonWriter.value("ALWAYS_SHOW");
                                break;
                            case 2:
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                                break;
                            case 3:
                                jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                break;
                            case 4:
                                jsonWriter.value("GEO_OVERRIDE_OTHER");
                                break;
                            case 5:
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                break;
                            case 6:
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                break;
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzch zza2 = zzch.zza(new JsonReader(new StringReader(headerField)));
                        zza2.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza2;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        jsonReader = new JsonReader(bufferedReader);
                        zzch zza3 = zzch.zza(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return zza3;
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                }
                throw th;
                throw th;
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzz zzz) {
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        this.zzb.post(new zzr(onConsentInfoUpdateSuccessListener));
        if (zzz.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zze.zzc();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                String zza2 = zzci.zza(this.zza);
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zza2 + "\") to set this as a debug device.");
            }
            zzz zza3 = new zzw(this.zzg, zzd(this.zzf.zzc(activity, consentRequestParameters))).zza();
            this.zzd.zzg(zza3.zza);
            this.zzd.zzi(zza3.zzb);
            this.zze.zzd(zza3.zzc);
            this.zzh.zza().execute(new zzs(this, onConsentInfoUpdateSuccessListener, zza3));
        } catch (zzg e) {
            this.zzb.post(new zzp(onConsentInfoUpdateFailureListener, e));
        } catch (RuntimeException e2) {
            this.zzb.post(new zzq(onConsentInfoUpdateFailureListener, new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))))));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new zzt(this, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener));
    }
}

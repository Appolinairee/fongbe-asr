package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.work.WorkRequest;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzay implements ConsentForm {
    boolean zza = false;
    /* access modifiers changed from: private */
    public final Application zzb;
    /* access modifiers changed from: private */
    public final zzbt zzc;
    private final zzam zzd;
    private final zzbm zze;
    private final zzdp zzf;
    /* access modifiers changed from: private */
    public Dialog zzg;
    private zzbr zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    /* access modifiers changed from: private */
    public final AtomicReference zzl = new AtomicReference();

    public zzay(Application application, zzab zzab, zzbt zzbt, zzam zzam, zzbm zzbm, zzdp zzdp) {
        this.zzb = application;
        this.zzc = zzbt;
        this.zzd = zzam;
        this.zze = zzbm;
        this.zzf = zzdp;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza((Activity) null);
        zzav zzav = (zzav) this.zzl.getAndSet((Object) null);
        if (zzav != null) {
            zzav.zzb();
        }
    }

    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        String str;
        zzco.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            if (true != this.zza) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, str).zza());
            return;
        }
        this.zzh.zzc();
        zzav zzav = new zzav(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzav);
        this.zzl.set(zzav);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    /* access modifiers changed from: package-private */
    public final zzbr zzc() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbr zzb2 = ((zzbs) this.zzf).zza();
        zzbr zzbr = zzb2;
        this.zzh = zzb2;
        zzb2.setBackgroundColor(0);
        zzb2.getSettings().setJavaScriptEnabled(true);
        zzb2.setWebViewClient(new zzbp(zzb2, (zzbq) null));
        this.zzj.set(new zzaw(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, (zzax) null));
        zzbr zzbr2 = this.zzh;
        zzbm zzbm = this.zze;
        zzbr2.loadDataWithBaseURL(zzbm.zza(), zzbm.zzb(), "text/html", "UTF-8", (String) null);
        zzco.zza.postDelayed(new zzau(this), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            this.zzd.zzg(3);
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzg zzg2) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            onConsentFormDismissedListener.onConsentFormDismissed(zzg2.zza());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi() {
        zzaw zzaw = (zzaw) this.zzj.getAndSet((Object) null);
        if (zzaw != null) {
            zzaw.onConsentFormLoadSuccess(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(zzg zzg2) {
        zzaw zzaw = (zzaw) this.zzj.getAndSet((Object) null);
        if (zzaw != null) {
            zzaw.onConsentFormLoadFailure(zzg2.zza());
        }
    }
}

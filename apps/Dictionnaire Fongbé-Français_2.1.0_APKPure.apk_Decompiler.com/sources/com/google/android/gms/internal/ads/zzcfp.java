package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcfp extends FrameLayout implements zzcex {
    private final zzcex zza;
    private final zzcbh zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcfp(zzcex zzcex) {
        super(zzcex.getContext());
        this.zza = zzcex;
        this.zzb = new zzcbh(zzcex.zzE(), this, this);
        addView((View) zzcex);
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        zzecp zzP;
        zzecr zzQ = zzQ();
        if (zzQ != null) {
            zzs.zza.post(new zzcfm(zzQ));
            zzcex zzcex = this.zza;
            zzfqw zzfqw = zzs.zza;
            Objects.requireNonNull(zzcex);
            zzfqw.postDelayed(new zzcfl(zzcex), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzfd)).intValue());
            return;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() || (zzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            zzs.zza.post(new zzcfn(this, zzP));
        }
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    public final void onAdClicked() {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    public final void zzC(zzcfz zzcfz) {
        this.zza.zzC(zzcfz);
    }

    public final zzfbo zzD() {
        return this.zza.zzD();
    }

    public final Context zzE() {
        return this.zza.zzE();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return (WebView) this.zza;
    }

    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    public final zzava zzI() {
        return this.zza.zzI();
    }

    public final zzazx zzJ() {
        return this.zza.zzJ();
    }

    public final zzbfk zzK() {
        return this.zza.zzK();
    }

    public final zzm zzL() {
        return this.zza.zzL();
    }

    public final zzm zzM() {
        return this.zza.zzM();
    }

    public final zzcgp zzN() {
        return ((zzcfw) this.zza).zzaO();
    }

    public final zzcgr zzO() {
        return this.zza.zzO();
    }

    public final zzecp zzP() {
        return this.zza.zzP();
    }

    public final zzecr zzQ() {
        return this.zza.zzQ();
    }

    public final zzfbr zzR() {
        return this.zza.zzR();
    }

    public final zzfcn zzS() {
        return this.zza.zzS();
    }

    public final ListenableFuture zzT() {
        return this.zza.zzT();
    }

    public final String zzU() {
        return this.zza.zzU();
    }

    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final void zzW(zzfbo zzfbo, zzfbr zzfbr) {
        this.zza.zzW(zzfbo, zzfbr);
    }

    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    public final void zzY() {
        this.zza.zzY();
    }

    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    public final void zza(String str) {
        ((zzcfw) this.zza).zzaT(str);
    }

    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    public final boolean zzaD(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaW)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z, i);
        return true;
    }

    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    public final boolean zzaG() {
        return this.zzc.get();
    }

    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaI(boolean z) {
        zzcex zzcex = this.zza;
        zzfqw zzfqw = zzs.zza;
        Objects.requireNonNull(zzcex);
        zzfqw.post(new zzcfl(zzcex));
    }

    public final void zzaJ(zzc zzc2, boolean z, boolean z2, String str) {
        this.zza.zzaJ(zzc2, z, z2, str);
    }

    public final void zzaK(String str, String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    public final void zzaL(boolean z, int i, boolean z2) {
        this.zza.zzaL(z, i, z2);
    }

    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaM(z, i, str, str2, z2);
    }

    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaN(z, i, str, z2, z3);
    }

    public final void zzaa() {
        this.zza.zzaa();
    }

    public final void zzab() {
        this.zza.zzab();
    }

    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    public final void zzad() {
        this.zza.zzad();
    }

    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, (String) null);
    }

    public final void zzaf() {
        this.zza.zzaf();
    }

    public final void zzag(String str, zzbjp zzbjp) {
        this.zza.zzag(str, zzbjp);
    }

    public final void zzah() {
        zzecr zzQ;
        zzecp zzP;
        TextView textView = new TextView(getContext());
        zzv.zzq();
        textView.setText(zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() || (zzP = zzP()) == null) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzfe)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
                zzv.zzB().zzg(zzQ.zza(), textView);
                return;
            }
            return;
        }
        zzP.zza(textView);
    }

    public final void zzai(zzm zzm) {
        this.zza.zzai(zzm);
    }

    public final void zzaj(zzcgr zzcgr) {
        this.zza.zzaj(zzcgr);
    }

    public final void zzak(zzazx zzazx) {
        this.zza.zzak(zzazx);
    }

    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    public final void zzap(zzbfi zzbfi) {
        this.zza.zzap(zzbfi);
    }

    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    public final void zzar(zzbfk zzbfk) {
        this.zza.zzar(zzbfk);
    }

    public final void zzas(zzecp zzecp) {
        this.zza.zzas(zzecp);
    }

    public final void zzat(zzecr zzecr) {
        this.zza.zzat(zzecr);
    }

    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    public final void zzaw(zzm zzm) {
        this.zza.zzaw(zzm);
    }

    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    public final void zzaz(String str, zzbjp zzbjp) {
        this.zza.zzaz(str, zzbjp);
    }

    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    public final void zzdd() {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.zzdd();
        }
    }

    public final void zzde() {
        this.zza.zzde();
    }

    public final void zzdf() {
        this.zza.zzdf();
    }

    public final void zzdg() {
        this.zza.zzdg();
    }

    public final void zzdn(zzayj zzayj) {
        this.zza.zzdn(zzayj);
    }

    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    public final int zzf() {
        return this.zza.zzf();
    }

    public final int zzg() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdW)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    public final int zzh() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdW)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zza.zzi();
    }

    public final zza zzj() {
        return this.zza.zzj();
    }

    public final zzbcx zzk() {
        return this.zza.zzk();
    }

    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfw) this.zza).zzb(str, jSONObject.toString());
    }

    public final zzbcy zzm() {
        return this.zza.zzm();
    }

    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    public final zzcbh zzo() {
        return this.zzb;
    }

    public final zzcde zzp(String str) {
        return this.zza.zzp(str);
    }

    public final zzcfz zzq() {
        return this.zza.zzq();
    }

    public final String zzr() {
        return this.zza.zzr();
    }

    public final String zzs() {
        return this.zza.zzs();
    }

    public final void zzt(String str, zzcde zzcde) {
        this.zza.zzt(str, zzcde);
    }

    public final void zzu() {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.zzu();
        }
    }

    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    public final void zzw() {
        this.zza.zzw();
    }

    public final void zzx(int i) {
    }

    public final void zzy(int i) {
    }

    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}

package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.Map;

public abstract class FlutterMediationExtras {
    Map<String, Object> extras;

    public abstract Pair<Class<? extends MediationExtrasReceiver>, Bundle> getMediationExtras();

    public void setMediationExtras(Map<String, Object> map) {
        this.extras = map;
    }
}

package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfqz implements SensorEventListener {
    protected zzfqz(String str, String str2) {
        zzfqy.zza();
        zzfqx.zza();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}

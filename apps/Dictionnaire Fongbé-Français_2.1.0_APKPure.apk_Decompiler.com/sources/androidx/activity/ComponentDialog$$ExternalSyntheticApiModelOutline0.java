package androidx.activity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.telephony.SubscriptionManager;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ComponentDialog$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ NotificationChannel m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static /* synthetic */ JobWorkItem m(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Notification.MessagingStyle.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof Icon;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return SubscriptionManager.class;
    }
}

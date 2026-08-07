package io.flutter.embedding.engine.deferredcomponents;

import com.google.android.play.core.tasks.OnSuccessListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PlayStoreDeferredComponentManager$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ PlayStoreDeferredComponentManager f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PlayStoreDeferredComponentManager$$ExternalSyntheticLambda0(PlayStoreDeferredComponentManager playStoreDeferredComponentManager, String str, int i) {
        this.f$0 = playStoreDeferredComponentManager;
        this.f$1 = str;
        this.f$2 = i;
    }

    public final void onSuccess(Object obj) {
        this.f$0.m392lambda$installDeferredComponent$0$ioflutterembeddingenginedeferredcomponentsPlayStoreDeferredComponentManager(this.f$1, this.f$2, (Integer) obj);
    }
}

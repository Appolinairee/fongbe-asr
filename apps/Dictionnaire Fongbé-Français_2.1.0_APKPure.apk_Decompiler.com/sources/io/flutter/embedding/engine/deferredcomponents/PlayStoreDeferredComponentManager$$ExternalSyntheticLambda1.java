package io.flutter.embedding.engine.deferredcomponents;

import com.google.android.play.core.tasks.OnFailureListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PlayStoreDeferredComponentManager$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ PlayStoreDeferredComponentManager f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ PlayStoreDeferredComponentManager$$ExternalSyntheticLambda1(PlayStoreDeferredComponentManager playStoreDeferredComponentManager, int i, String str) {
        this.f$0 = playStoreDeferredComponentManager;
        this.f$1 = i;
        this.f$2 = str;
    }

    public final void onFailure(Exception exc) {
        this.f$0.m393lambda$installDeferredComponent$1$ioflutterembeddingenginedeferredcomponentsPlayStoreDeferredComponentManager(this.f$1, this.f$2, exc);
    }
}

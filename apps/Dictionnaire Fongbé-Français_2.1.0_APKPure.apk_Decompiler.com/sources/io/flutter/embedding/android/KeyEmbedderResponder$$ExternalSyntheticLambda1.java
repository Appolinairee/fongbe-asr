package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardMap;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class KeyEmbedderResponder$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ KeyEmbedderResponder f$0;
    public final /* synthetic */ KeyboardMap.KeyPair f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ KeyEvent f$3;

    public /* synthetic */ KeyEmbedderResponder$$ExternalSyntheticLambda1(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        this.f$0 = keyEmbedderResponder;
        this.f$1 = keyPair;
        this.f$2 = j;
        this.f$3 = keyEvent;
    }

    public final void run() {
        this.f$0.m387lambda$synchronizePressingKey$0$ioflutterembeddingandroidKeyEmbedderResponder(this.f$1, this.f$2, this.f$3);
    }
}

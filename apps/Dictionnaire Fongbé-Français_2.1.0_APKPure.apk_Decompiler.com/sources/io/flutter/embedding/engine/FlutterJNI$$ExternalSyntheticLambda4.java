package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FlutterJNI$$ExternalSyntheticLambda4 implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ long f$0;

    public /* synthetic */ FlutterJNI$$ExternalSyntheticLambda4(long j) {
        this.f$0 = j;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f$0, imageDecoder, imageInfo, source);
    }
}

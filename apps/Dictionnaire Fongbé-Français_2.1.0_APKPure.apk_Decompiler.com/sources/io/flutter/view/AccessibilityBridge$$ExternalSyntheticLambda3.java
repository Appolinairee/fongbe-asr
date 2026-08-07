package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AccessibilityBridge$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ AccessibilityBridge.SemanticsNode f$0;

    public /* synthetic */ AccessibilityBridge$$ExternalSyntheticLambda3(AccessibilityBridge.SemanticsNode semanticsNode) {
        this.f$0 = semanticsNode;
    }

    public final boolean test(Object obj) {
        return AccessibilityBridge.lambda$shouldSetCollectionInfo$0(this.f$0, (AccessibilityBridge.SemanticsNode) obj);
    }
}

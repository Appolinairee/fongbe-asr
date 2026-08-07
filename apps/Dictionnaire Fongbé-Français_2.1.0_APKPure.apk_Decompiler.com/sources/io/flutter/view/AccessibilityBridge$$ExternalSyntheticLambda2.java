package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AccessibilityBridge$$ExternalSyntheticLambda2 implements Predicate {
    public final boolean test(Object obj) {
        return ((AccessibilityBridge.SemanticsNode) obj).hasFlag(AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING);
    }
}

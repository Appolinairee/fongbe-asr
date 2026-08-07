package androidx.preference;

import androidx.activity.BackEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0 implements FragmentManager.OnBackStackChangedListener {
    public final /* synthetic */ PreferenceHeaderFragmentCompat f$0;

    public /* synthetic */ PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
        this.f$0 = preferenceHeaderFragmentCompat;
    }

    public /* synthetic */ void onBackStackChangeCancelled() {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeCancelled(this);
    }

    public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeCommitted(this, fragment, z);
    }

    public /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeProgressed(this, backEventCompat);
    }

    public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeStarted(this, fragment, z);
    }

    public final void onBackStackChanged() {
        PreferenceHeaderFragmentCompat.m64onViewCreated$lambda10(this.f$0);
    }
}

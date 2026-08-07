package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private final Bundle mExtras = new Bundle();
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(NotificationCompat.Builder builder) {
        List<String> list;
        NotificationCompat.Builder builder2 = builder;
        this.mBuilderCompat = builder2;
        Context context = builder2.mContext;
        this.mContext = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = Api26Impl.createBuilder(builder2.mContext, builder2.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(builder2.mContext);
        }
        Notification notification = builder2.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder2.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder2.mContentTitle).setContentText(builder2.mContentText).setContentInfo(builder2.mContentInfo).setContentIntent(builder2.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder2.mFullScreenIntent, (notification.flags & 128) != 0).setNumber(builder2.mNumber).setProgress(builder2.mProgressMax, builder2.mProgress, builder2.mProgressIndeterminate);
        if (Build.VERSION.SDK_INT < 23) {
            this.mBuilder.setLargeIcon(builder2.mLargeIcon == null ? null : builder2.mLargeIcon.getBitmap());
        } else {
            Api23Impl.setLargeIcon(this.mBuilder, builder2.mLargeIcon == null ? null : builder2.mLargeIcon.toIcon(context));
        }
        this.mBuilder.setSubText(builder2.mSubText).setUsesChronometer(builder2.mUseChronometer).setPriority(builder2.mPriority);
        if (builder2.mStyle instanceof NotificationCompat.CallStyle) {
            for (NotificationCompat.Action addAction : ((NotificationCompat.CallStyle) builder2.mStyle).getActionsListWithSystemActions()) {
                addAction(addAction);
            }
        } else {
            Iterator<NotificationCompat.Action> it = builder2.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        }
        if (builder2.mExtras != null) {
            this.mExtras.putAll(builder2.mExtras);
        }
        this.mContentView = builder2.mContentView;
        this.mBigContentView = builder2.mBigContentView;
        this.mBuilder.setShowWhen(builder2.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, builder2.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, builder2.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, builder2.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, builder2.mGroupSummary);
        this.mGroupAlertBehavior = builder2.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, builder2.mCategory);
        Api21Impl.setColor(this.mBuilder, builder2.mColor);
        Api21Impl.setVisibility(this.mBuilder, builder2.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, builder2.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            list = combineLists(getPeople(builder2.mPersonList), builder2.mPeople);
        } else {
            list = builder2.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                Api21Impl.addPerson(this.mBuilder, addPerson);
            }
        }
        this.mHeadsUpContentView = builder2.mHeadsUpContentView;
        if (builder2.mInvisibleActions.size() > 0) {
            Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle = bundle == null ? new Bundle() : bundle;
            Bundle bundle2 = new Bundle(bundle);
            Bundle bundle3 = new Bundle();
            for (int i = 0; i < builder2.mInvisibleActions.size(); i++) {
                bundle3.putBundle(Integer.toString(i), NotificationCompatJellybean.getBundleForAction(builder2.mInvisibleActions.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
        }
        if (Build.VERSION.SDK_INT >= 23 && builder2.mSmallIcon != null) {
            Api23Impl.setSmallIcon(this.mBuilder, builder2.mSmallIcon);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(builder2.mExtras);
            Api24Impl.setRemoteInputHistory(this.mBuilder, builder2.mRemoteInputHistory);
            if (builder2.mContentView != null) {
                Api24Impl.setCustomContentView(this.mBuilder, builder2.mContentView);
            }
            if (builder2.mBigContentView != null) {
                Api24Impl.setCustomBigContentView(this.mBuilder, builder2.mBigContentView);
            }
            if (builder2.mHeadsUpContentView != null) {
                Api24Impl.setCustomHeadsUpContentView(this.mBuilder, builder2.mHeadsUpContentView);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setBadgeIconType(this.mBuilder, builder2.mBadgeIcon);
            Api26Impl.setSettingsText(this.mBuilder, builder2.mSettingsText);
            Api26Impl.setShortcutId(this.mBuilder, builder2.mShortcutId);
            Api26Impl.setTimeoutAfter(this.mBuilder, builder2.mTimeout);
            Api26Impl.setGroupAlertBehavior(this.mBuilder, builder2.mGroupAlertBehavior);
            if (builder2.mColorizedSet) {
                Api26Impl.setColorized(this.mBuilder, builder2.mColorized);
            }
            if (!TextUtils.isEmpty(builder2.mChannelId)) {
                this.mBuilder.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<Person> it2 = builder2.mPersonList.iterator();
            while (it2.hasNext()) {
                Api28Impl.addPerson(this.mBuilder, it2.next().toAndroidPerson());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder2.mAllowSystemGeneratedContextualActions);
            Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder2.mBubbleMetadata));
            if (builder2.mLocusId != null) {
                Api29Impl.setLocusId(this.mBuilder, builder2.mLocusId.toLocusId());
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && builder2.mFgsDeferBehavior != 0) {
            Api31Impl.setForegroundServiceBehavior(this.mBuilder, builder2.mFgsDeferBehavior);
        }
        if (builder2.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate((long[]) null);
            this.mBuilder.setSound((Uri) null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.mBuilder.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
                }
                Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }

    private static List<String> combineLists(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    private static List<String> getPeople(List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person resolveToLegacyUri : list) {
            arrayList.add(resolveToLegacyUri.resolveToLegacyUri());
        }
        return arrayList;
    }

    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.mContext;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        Notification buildInternal = buildInternal();
        if (makeContentView != null) {
            buildInternal.contentView = makeContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            buildInternal.contentView = this.mBuilderCompat.mContentView;
        }
        if (!(style == null || (makeBigContentView = style.makeBigContentView(this)) == null)) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (!(style == null || (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) == null)) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(style == null || (extras = NotificationCompat.getExtras(buildInternal)) == null)) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    private void addAction(NotificationCompat.Action action) {
        Notification.Action.Builder builder;
        Bundle bundle;
        IconCompat iconCompat = action.getIconCompat();
        if (Build.VERSION.SDK_INT >= 23) {
            builder = Api23Impl.createBuilder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        } else {
            builder = Api20Impl.createBuilder(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
        }
        if (action.getRemoteInputs() != null) {
            for (RemoteInput addRemoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                Api20Impl.addRemoteInput(builder, addRemoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setAllowGeneratedReplies(builder, action.getAllowGeneratedReplies());
        }
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setSemanticAction(builder, action.getSemanticAction());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setContextual(builder, action.isContextual());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setAuthenticationRequired(builder, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        Api20Impl.addExtras(builder, bundle);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(builder));
    }

    /* access modifiers changed from: protected */
    public Notification buildInternal() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (!(Api20Impl.getGroup(build) == null || (build.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                    removeSoundAndVibration(build);
                }
                if (Api20Impl.getGroup(build) != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build);
                }
            }
            return build;
        }
        this.mBuilder.setExtras(this.mExtras);
        Notification build2 = this.mBuilder.build();
        RemoteViews remoteViews = this.mContentView;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.mBigContentView;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.mHeadsUpContentView;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.mGroupAlertBehavior != 0) {
            if (!(Api20Impl.getGroup(build2) == null || (build2.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                removeSoundAndVibration(build2);
            }
            if (Api20Impl.getGroup(build2) != null && (build2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(build2);
            }
        }
        return build2;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static Notification.Action.Builder createBuilder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action build(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder setGroup(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder setGroupSummary(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        static Notification.Builder setLocalOnly(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        static Notification.Builder setSortKey(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Notification.Builder addPerson(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder setCategory(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder setColor(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        static Notification.Builder setVisibility(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        static Notification.Builder setPublicVersion(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder setSound(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder setSmallIcon(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Notification.Builder createBuilder(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static Notification.Builder setColorized(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static Notification.Builder setBadgeIconType(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder setShortcutId(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder setTimeoutAfter(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }

        static Notification.Builder addPerson(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static Notification.Builder setLocusId(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }

        static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }
}

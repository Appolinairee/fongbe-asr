package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0;
import io.flutter.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<ViewAndId, Integer> originToFlutterId;
    private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors();
    private final View rootAccessibilityView;

    AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long access$100 = this.reflectionAccessors.getSourceNodeId(createAccessibilityNodeInfo);
        if (access$100 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(access$100.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
        if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.id)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, viewAndId.view);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long access$300 = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (access$300 != null) {
            Integer num = this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$300.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long access$500 = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i2);
            if (access$500 != null) {
                int access$200 = ReflectionAccessors.getVirtualNodeId(access$500.longValue());
                ViewAndId viewAndId = new ViewAndId(view, access$200);
                if (this.originToFlutterId.containsKey(viewAndId)) {
                    i = this.originToFlutterId.get(viewAndId).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, access$200, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        ViewAndId viewAndId = new ViewAndId(view, i);
        this.originToFlutterId.put(viewAndId, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, viewAndId);
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfo2.setContextClickable(PrintHelper$$ExternalSyntheticApiModelOutline0.m$2(accessibilityNodeInfo));
        }
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(PrintHelper$$ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo));
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(PrintHelper$$ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo));
            accessibilityNodeInfo2.setHintText(PrintHelper$$ExternalSyntheticApiModelOutline0.m$1(accessibilityNodeInfo));
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long access$600 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
        if (access$600 == null) {
            return false;
        }
        int access$200 = ReflectionAccessors.getVirtualNodeId(access$600.longValue());
        Integer num = this.originToFlutterId.get(new ViewAndId(view, access$200));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            Integer valueOf = Integer.valueOf(i);
            valueOf.getClass();
            cacheVirtualIdMappings(view, access$200, i);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long access$6002 = this.reflectionAccessors.getRecordSourceNodeId(record);
            if (access$6002 == null) {
                return false;
            }
            ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$6002.longValue()));
            if (!this.originToFlutterId.containsKey(viewAndId)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.id, i2, bundle);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long access$600 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (access$600 == null) {
            return null;
        }
        return this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$600.longValue())));
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
        if (viewAndId == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties;
            motionEvent2.getPointerProperties(i2, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i2, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2] = pointerCoords2;
            pointerCoords2.x -= (float) rect.left;
            pointerCoordsArr[i2].y -= (float) rect.top;
        }
        return viewAndId.view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public View platformViewOfNode(int i) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.view;
    }

    private static class ViewAndId {
        final int id;
        final View view;

        private ViewAndId(View view2, int i) {
            this.view = view2;
            this.id = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAndId)) {
                return false;
            }
            ViewAndId viewAndId = (ViewAndId) obj;
            if (this.id != viewAndId.id || !this.view.equals(viewAndId.view)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.view.hashCode() + 31) * 31) + this.id;
        }
    }

    private static class ReflectionAccessors {
        private final Field childNodeIdsField;
        private final Method getChildId;
        private final Method getParentNodeId;
        private final Method getRecordSourceNodeId;
        private final Method getSourceNodeId;
        private final Method longArrayGetIndex;

        /* access modifiers changed from: private */
        public static int getVirtualNodeId(long j) {
            return (int) (j >> 32);
        }

        private static boolean isBitSet(long j, int i) {
            return (j & (1 << i)) != 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.reflect.Field} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private ReflectionAccessors() {
            /*
                r10 = this;
                java.lang.String r0 = "getSourceNodeId"
                java.lang.String r1 = "AccessibilityBridge"
                r10.<init>()
                r2 = 0
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r3 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.reflect.Method r3 = r3.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x0015
            L_0x000f:
                java.lang.String r3 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
                io.flutter.Log.w(r1, r3)
                r3 = r2
            L_0x0015:
                java.lang.Class<android.view.accessibility.AccessibilityRecord> r4 = android.view.accessibility.AccessibilityRecord.class
                java.lang.reflect.Method r0 = r4.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x001c }
                goto L_0x0022
            L_0x001c:
                java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
                io.flutter.Log.w(r1, r0)
                r0 = r2
            L_0x0022:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                r6 = 0
                r7 = 1
                if (r4 > r5) goto L_0x0053
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r5 = "getParentNodeId"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r2)     // Catch:{ NoSuchMethodException -> 0x0033 }
                goto L_0x0039
            L_0x0033:
                java.lang.String r4 = "can't invoke getParentNodeId with reflection"
                io.flutter.Log.w(r1, r4)
                r4 = r2
            L_0x0039:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r8 = "getChildId"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0049 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0049 }
                r7[r6] = r9     // Catch:{ NoSuchMethodException -> 0x0049 }
                java.lang.reflect.Method r1 = r5.getMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x0049 }
                r5 = r2
                goto L_0x0050
            L_0x0049:
                java.lang.String r5 = "can't invoke getChildId with reflection"
                io.flutter.Log.w(r1, r5)
                r1 = r2
                r5 = r1
            L_0x0050:
                r2 = r4
                r4 = r5
                goto L_0x007b
            L_0x0053:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r5 = "mChildNodeIds"
                java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                r4.setAccessible(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                java.lang.String r5 = "android.util.LongArray"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                java.lang.String r8 = "get"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                r7[r6] = r9     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                java.lang.reflect.Method r1 = r5.getMethod(r8, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0073 }
                r5 = r1
                r1 = r2
                goto L_0x007b
            L_0x0073:
                java.lang.String r4 = "can't access childNodeIdsField with reflection"
                io.flutter.Log.w(r1, r4)
                r1 = r2
                r4 = r1
                r5 = r4
            L_0x007b:
                r10.getSourceNodeId = r3
                r10.getParentNodeId = r2
                r10.getRecordSourceNodeId = r0
                r10.getChildId = r1
                r10.childNodeIdsField = r4
                r10.longArrayGetIndex = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.<init>():void");
        }

        /* access modifiers changed from: private */
        public Long getSourceNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
            } catch (IllegalAccessException e) {
                Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.w(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public Long getChildId(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            Method method = this.getChildId;
            if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException e) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e);
                    return null;
                } catch (InvocationTargetException e2) {
                    Log.w(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e2);
                    return null;
                }
            } else {
                try {
                    Long l = (Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i)});
                    l.longValue();
                    return l;
                } catch (IllegalAccessException e3) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e3);
                    return null;
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e4) {
                    Log.w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e4);
                    return null;
                }
            }
        }

        /* access modifiers changed from: private */
        public Long getParentNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getParentNodeId;
            if (method != null) {
                try {
                    Long l = (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
                    l.longValue();
                    return l;
                } catch (IllegalAccessException e) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e);
                } catch (InvocationTargetException e2) {
                    Log.w(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e2);
                }
            }
            return yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l = null;
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (isBitSet(readLong, 0)) {
                obtain2.readInt();
            }
            if (isBitSet(readLong, 1)) {
                obtain2.readLong();
            }
            if (isBitSet(readLong, 2)) {
                obtain2.readInt();
            }
            if (isBitSet(readLong, 3)) {
                l = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l;
        }

        /* access modifiers changed from: private */
        public Long getRecordSourceNodeId(AccessibilityRecord accessibilityRecord) {
            Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, (Object[]) null);
            } catch (IllegalAccessException e) {
                Log.w(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.w(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }
    }
}

package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class AndroidTouchProcessor {
    static final int BYTES_PER_FIELD = 8;
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final String TAG = "AndroidTouchProcessor";
    private int cachedVerticalScrollFactor;
    private final MotionEventTracker motionEventTracker;
    private final Map<Integer, float[]> ongoingPans = new HashMap();
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;

    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    private int getPointerChangeForAction(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    private int getPointerChangeForPanZoom(int i) {
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 8;
        }
        return (i == 6 || i == 0) ? 9 : -1;
    }

    private int getPointerDeviceTypeForToolType(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 3;
        }
        return 1;
    }

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z) {
        this.renderer = flutterRenderer;
        this.motionEventTracker = MotionEventTracker.getInstance();
        this.trackMotionEvents = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    public boolean onTouchEvent(MotionEvent motionEvent, Matrix matrix) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        int i = (!z2 || getPointerDeviceTypeForToolType(motionEvent2.getToolType(motionEvent.getActionIndex())) != 0) ? 0 : 1;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != motionEvent.getActionIndex() && motionEvent2.getToolType(i2) == 1) {
                    addPointerForIndex(motionEvent, i2, 5, 1, matrix, allocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
            if (i != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                addPointerForIndex(motionEvent, i3, pointerChangeForAction, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, allocateDirect, context);
        if (allocateDirect.position() % 288 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i, i2, i3, matrix, byteBuffer, (Context) null);
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        float[] fArr;
        long j;
        int i4;
        double d;
        double d2;
        double d3;
        int i5;
        double d4;
        double d5;
        double d6;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i6 = i;
        int i7 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        Context context2 = context;
        int i8 = -1;
        if (i7 != -1) {
            int pointerId = motionEvent.getPointerId(i);
            int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i));
            float[] fArr2 = {motionEvent.getX(i), motionEvent.getY(i)};
            matrix.mapPoints(fArr2);
            long j2 = 0;
            if (pointerDeviceTypeForToolType == 1) {
                float[] fArr3 = fArr2;
                j = (long) (motionEvent.getButtonState() & 31);
                if (j == 0 && motionEvent.getSource() == 8194 && i7 == 4) {
                    fArr = fArr3;
                    this.ongoingPans.put(Integer.valueOf(pointerId), fArr);
                } else {
                    fArr = fArr3;
                }
            } else {
                fArr = fArr2;
                j = pointerDeviceTypeForToolType == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.ongoingPans.containsKey(Integer.valueOf(pointerId));
            if (containsKey) {
                int pointerChangeForPanZoom = getPointerChangeForPanZoom(i7);
                if (pointerChangeForPanZoom != -1) {
                    i8 = pointerChangeForPanZoom;
                } else {
                    return;
                }
            }
            if (this.trackMotionEvents) {
                j2 = this.motionEventTracker.track(motionEvent2).getId();
            }
            int i9 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            int i10 = i8;
            byteBuffer2.putLong(j2);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                i4 = i10;
                byteBuffer2.putLong((long) i4);
                byteBuffer2.putLong(4);
            } else {
                i4 = i10;
                byteBuffer2.putLong((long) i7);
                byteBuffer2.putLong((long) pointerDeviceTypeForToolType);
            }
            byteBuffer2.putLong((long) i9);
            byteBuffer2.putLong((long) pointerId);
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr4 = this.ongoingPans.get(Integer.valueOf(pointerId));
                byteBuffer2.putDouble((double) fArr4[0]);
                byteBuffer2.putDouble((double) fArr4[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d2 = 0.0d;
                d = 1.0d;
            } else {
                d2 = (double) motionRange.getMin();
                d = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble(d);
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i6));
                d3 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            } else {
                d3 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i));
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble(d3);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i6));
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i6));
            } else {
                byteBuffer2.putDouble(d3);
            }
            byteBuffer2.putLong((long) i3);
            if (i9 == 1) {
                Context context3 = context;
                if (context3 != null) {
                    d6 = (double) getHorizontalScrollFactor(context3);
                    d5 = (double) getVerticalScrollFactor(context3);
                } else {
                    d6 = 48.0d;
                    d5 = 48.0d;
                }
                i5 = i4;
                byteBuffer2.putDouble(d6 * ((double) (-motionEvent2.getAxisValue(10, i6))));
                byteBuffer2.putDouble(d5 * ((double) (-motionEvent2.getAxisValue(9, i6))));
            } else {
                i5 = i4;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            if (containsKey) {
                float[] fArr5 = this.ongoingPans.get(Integer.valueOf(pointerId));
                byteBuffer2.putDouble((double) (fArr[0] - fArr5[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr5[1]));
                d4 = 0.0d;
            } else {
                d4 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d4);
            byteBuffer2.putLong(0);
            if (containsKey && i5 == 9) {
                this.ongoingPans.remove(Integer.valueOf(pointerId));
            }
        }
    }

    private float getHorizontalScrollFactor(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        }
        return (float) getVerticalScrollFactorPre26(context);
    }

    private float getVerticalScrollFactor(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return getVerticalScrollFactorAbove26(context);
        }
        return (float) getVerticalScrollFactorPre26(context);
    }

    private float getVerticalScrollFactorAbove26(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int getVerticalScrollFactorPre26(Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }
}

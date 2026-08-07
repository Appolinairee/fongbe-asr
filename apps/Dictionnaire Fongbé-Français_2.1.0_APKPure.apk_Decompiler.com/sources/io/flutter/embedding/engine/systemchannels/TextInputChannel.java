package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodHandler;
    /* access modifiers changed from: private */
    public TextInputMethodHandler textInputMethodHandler;

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(String str, Bundle bundle);

        void setClient(int i, Configuration configuration);

        void setEditableSizeAndTransform(double d, double d2, double[] dArr);

        void setEditingState(TextEditState textEditState);

        void setPlatformViewClient(int i, boolean z);

        void show();
    }

    public TextInputChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler != null) {
                    String str = methodCall.method;
                    Object obj = methodCall.arguments;
                    Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1779068172:
                            if (str.equals("TextInput.setPlatformViewClient")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1015421462:
                            if (str.equals("TextInput.setEditingState")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -37561188:
                            if (str.equals("TextInput.setClient")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 270476819:
                            if (str.equals("TextInput.hide")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 270803918:
                            if (str.equals("TextInput.show")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 649192816:
                            if (str.equals("TextInput.sendAppPrivateCommand")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1204752139:
                            if (str.equals("TextInput.setEditableSizeAndTransform")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1727570905:
                            if (str.equals("TextInput.finishAutofillContext")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1904427655:
                            if (str.equals("TextInput.clearClient")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 2113369584:
                            if (str.equals("TextInput.requestAutofill")) {
                                c = 9;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            try {
                                JSONObject jSONObject = (JSONObject) obj;
                                TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                                result.success((Object) null);
                                return;
                            } catch (JSONException e) {
                                result.error("error", e.getMessage(), (Object) null);
                                return;
                            }
                        case 1:
                            try {
                                TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                                result.success((Object) null);
                                return;
                            } catch (JSONException e2) {
                                result.error("error", e2.getMessage(), (Object) null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                                result.success((Object) null);
                                return;
                            } catch (NoSuchFieldException | JSONException e3) {
                                result.error("error", e3.getMessage(), (Object) null);
                                return;
                            }
                        case 3:
                            TextInputChannel.this.textInputMethodHandler.hide();
                            result.success((Object) null);
                            return;
                        case 4:
                            TextInputChannel.this.textInputMethodHandler.show();
                            result.success((Object) null);
                            return;
                        case 5:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                String string = jSONObject2.getString("action");
                                String string2 = jSONObject2.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                                result.success((Object) null);
                                return;
                            } catch (JSONException e4) {
                                result.error("error", e4.getMessage(), (Object) null);
                                return;
                            }
                        case 6:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                double d = jSONObject3.getDouble("width");
                                double d2 = jSONObject3.getDouble("height");
                                JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i = 0; i < 16; i++) {
                                    dArr[i] = jSONArray2.getDouble(i);
                                }
                                TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d, d2, dArr);
                                result.success((Object) null);
                                return;
                            } catch (JSONException e5) {
                                result.error("error", e5.getMessage(), (Object) null);
                                return;
                            }
                        case 7:
                            TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                            result.success((Object) null);
                            return;
                        case 8:
                            TextInputChannel.this.textInputMethodHandler.clearClient();
                            result.success((Object) null);
                            return;
                        case 9:
                            TextInputChannel.this.textInputMethodHandler.requestAutofill();
                            result.success((Object) null);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                }
            }
        };
        this.parsingMethodHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", (Object) null);
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public void updateEditingState(int i, String str, int i2, int i3, int i4, int i5) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        HashMap<Object, Object> createEditingStateJSON = createEditingStateJSON(str, i2, i3, i4, i5);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), createEditingStateJSON}));
    }

    public void updateEditingStateWithDeltas(int i, ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> createEditingDeltaJSON = createEditingDeltaJSON(arrayList);
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i), createEditingDeltaJSON}));
    }

    public void updateEditingStateWithTag(int i, HashMap<String, TextEditState> hashMap) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            TextEditState textEditState = (TextEditState) next.getValue();
            hashMap2.put((String) next.getKey(), createEditingStateJSON(textEditState.text, textEditState.selectionStart, textEditState.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }

    public void newline(int i) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    public void go(int i) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    public void search(int i) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    public void send(int i) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    public void done(int i) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    public void next(int i) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    public void previous(int i) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    public void unspecifiedAction(int i) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    public void commitContent(int i, Map<String, Object> map) {
        Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i), "TextInputAction.commitContent", map}));
    }

    public void performPrivateCommand(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler2) {
        this.textInputMethodHandler = textInputMethodHandler2;
    }

    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final Autofill autofill;
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final Configuration[] fields;
        public final Integer inputAction;
        public final InputType inputType;
        public final boolean obscureText;
        public final TextCapitalization textCapitalization;

        public static Configuration fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            JSONArray jSONArray;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                Autofill autofill2 = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("fields");
                    int length = jSONArray2.length();
                    Configuration[] configurationArr2 = new Configuration[length];
                    for (int i = 0; i < length; i++) {
                        configurationArr2[i] = fromJson(jSONArray2.getJSONObject(i));
                    }
                    configurationArr = configurationArr2;
                } else {
                    configurationArr = null;
                }
                Integer inputActionFromTextInputAction = inputActionFromTextInputAction(string);
                ArrayList arrayList = new ArrayList();
                if (jSONObject2.isNull("contentCommitMimeTypes")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject2.getJSONArray("contentCommitMimeTypes");
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(jSONArray.optString(i2));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                TextCapitalization fromValue = TextCapitalization.fromValue(jSONObject2.getString("textCapitalization"));
                InputType fromJson = InputType.fromJson(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    autofill2 = Autofill.fromJson(jSONObject2.getJSONObject("autofill"));
                }
                return new Configuration(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, fromValue, fromJson, inputActionFromTextInputAction, string2, autofill2, (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer inputActionFromTextInputAction(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.inputActionFromTextInputAction(java.lang.String):java.lang.Integer");
        }

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public static Autofill fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = translateAutofillHint(jSONArray.getString(i));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
                if (r0.equals("familyName") == false) goto L_0x002f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String translateAutofillHint(java.lang.String r17) {
                /*
                    r0 = r17
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r17.hashCode()
                    int r1 = r17.hashCode()
                    java.lang.String r3 = "postalCode"
                    java.lang.String r4 = "postalAddress"
                    java.lang.String r5 = "password"
                    java.lang.String r6 = "newUsername"
                    java.lang.String r7 = "username"
                    java.lang.String r8 = "creditCardExpirationYear"
                    java.lang.String r9 = "creditCardExpirationDate"
                    java.lang.String r10 = "creditCardNumber"
                    java.lang.String r11 = "gender"
                    java.lang.String r12 = "creditCardExpirationDay"
                    java.lang.String r13 = "creditCardSecurityCode"
                    java.lang.String r14 = "newPassword"
                    java.lang.String r15 = "creditCardExpirationMonth"
                    r16 = -1
                    switch(r1) {
                        case -2058889126: goto L_0x01e5;
                        case -1917283616: goto L_0x01d9;
                        case -1844815832: goto L_0x01cf;
                        case -1825589953: goto L_0x01c3;
                        case -1821235109: goto L_0x01b9;
                        case -1757573738: goto L_0x01af;
                        case -1682373820: goto L_0x01a5;
                        case -1658955742: goto L_0x0199;
                        case -1567118045: goto L_0x018c;
                        case -1476752575: goto L_0x017e;
                        case -1413737489: goto L_0x0170;
                        case -1377792129: goto L_0x0162;
                        case -1249512767: goto L_0x0156;
                        case -1186060294: goto L_0x0148;
                        case -1151034798: goto L_0x013c;
                        case -835992323: goto L_0x012e;
                        case -818219584: goto L_0x0120;
                        case -747304516: goto L_0x0112;
                        case -613980922: goto L_0x0106;
                        case -613352043: goto L_0x00fa;
                        case -549230602: goto L_0x00ec;
                        case -265713450: goto L_0x00e0;
                        case 3373707: goto L_0x00d2;
                        case 96619420: goto L_0x00c4;
                        case 253202685: goto L_0x00b6;
                        case 588174851: goto L_0x00a8;
                        case 798554127: goto L_0x009f;
                        case 892233837: goto L_0x0092;
                        case 991032982: goto L_0x0087;
                        case 1069376125: goto L_0x007a;
                        case 1216985755: goto L_0x006f;
                        case 1469046696: goto L_0x0062;
                        case 1662667945: goto L_0x0057;
                        case 1921869058: goto L_0x004a;
                        case 2011152728: goto L_0x003f;
                        case 2011773919: goto L_0x0032;
                        default: goto L_0x002f;
                    }
                L_0x002f:
                    r2 = -1
                    goto L_0x01f0
                L_0x0032:
                    java.lang.String r1 = "birthdayDay"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x003b
                    goto L_0x002f
                L_0x003b:
                    r2 = 35
                    goto L_0x01f0
                L_0x003f:
                    boolean r1 = r0.equals(r3)
                    if (r1 != 0) goto L_0x0046
                    goto L_0x002f
                L_0x0046:
                    r2 = 34
                    goto L_0x01f0
                L_0x004a:
                    java.lang.String r1 = "postalAddressExtended"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0053
                    goto L_0x002f
                L_0x0053:
                    r2 = 33
                    goto L_0x01f0
                L_0x0057:
                    boolean r1 = r0.equals(r4)
                    if (r1 != 0) goto L_0x005e
                    goto L_0x002f
                L_0x005e:
                    r2 = 32
                    goto L_0x01f0
                L_0x0062:
                    java.lang.String r1 = "givenName"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x006b
                    goto L_0x002f
                L_0x006b:
                    r2 = 31
                    goto L_0x01f0
                L_0x006f:
                    boolean r1 = r0.equals(r5)
                    if (r1 != 0) goto L_0x0076
                    goto L_0x002f
                L_0x0076:
                    r2 = 30
                    goto L_0x01f0
                L_0x007a:
                    java.lang.String r1 = "birthday"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0083
                    goto L_0x002f
                L_0x0083:
                    r2 = 29
                    goto L_0x01f0
                L_0x0087:
                    boolean r1 = r0.equals(r6)
                    if (r1 != 0) goto L_0x008e
                    goto L_0x002f
                L_0x008e:
                    r2 = 28
                    goto L_0x01f0
                L_0x0092:
                    java.lang.String r1 = "telephoneNumber"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x009b
                    goto L_0x002f
                L_0x009b:
                    r2 = 27
                    goto L_0x01f0
                L_0x009f:
                    java.lang.String r1 = "familyName"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x01f0
                    goto L_0x002f
                L_0x00a8:
                    java.lang.String r1 = "birthdayMonth"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00b2
                    goto L_0x002f
                L_0x00b2:
                    r2 = 25
                    goto L_0x01f0
                L_0x00b6:
                    java.lang.String r1 = "addressState"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00c0
                    goto L_0x002f
                L_0x00c0:
                    r2 = 24
                    goto L_0x01f0
                L_0x00c4:
                    java.lang.String r1 = "email"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00ce
                    goto L_0x002f
                L_0x00ce:
                    r2 = 23
                    goto L_0x01f0
                L_0x00d2:
                    java.lang.String r1 = "name"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00dc
                    goto L_0x002f
                L_0x00dc:
                    r2 = 22
                    goto L_0x01f0
                L_0x00e0:
                    boolean r1 = r0.equals(r7)
                    if (r1 != 0) goto L_0x00e8
                    goto L_0x002f
                L_0x00e8:
                    r2 = 21
                    goto L_0x01f0
                L_0x00ec:
                    java.lang.String r1 = "telephoneNumberCountryCode"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x00f6
                    goto L_0x002f
                L_0x00f6:
                    r2 = 20
                    goto L_0x01f0
                L_0x00fa:
                    boolean r1 = r0.equals(r8)
                    if (r1 != 0) goto L_0x0102
                    goto L_0x002f
                L_0x0102:
                    r2 = 19
                    goto L_0x01f0
                L_0x0106:
                    boolean r1 = r0.equals(r9)
                    if (r1 != 0) goto L_0x010e
                    goto L_0x002f
                L_0x010e:
                    r2 = 18
                    goto L_0x01f0
                L_0x0112:
                    java.lang.String r1 = "nameSuffix"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x011c
                    goto L_0x002f
                L_0x011c:
                    r2 = 17
                    goto L_0x01f0
                L_0x0120:
                    java.lang.String r1 = "middleName"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x012a
                    goto L_0x002f
                L_0x012a:
                    r2 = 16
                    goto L_0x01f0
                L_0x012e:
                    java.lang.String r1 = "namePrefix"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0138
                    goto L_0x002f
                L_0x0138:
                    r2 = 15
                    goto L_0x01f0
                L_0x013c:
                    boolean r1 = r0.equals(r10)
                    if (r1 != 0) goto L_0x0144
                    goto L_0x002f
                L_0x0144:
                    r2 = 14
                    goto L_0x01f0
                L_0x0148:
                    java.lang.String r1 = "postalAddressExtendedPostalCode"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0152
                    goto L_0x002f
                L_0x0152:
                    r2 = 13
                    goto L_0x01f0
                L_0x0156:
                    boolean r1 = r0.equals(r11)
                    if (r1 != 0) goto L_0x015e
                    goto L_0x002f
                L_0x015e:
                    r2 = 12
                    goto L_0x01f0
                L_0x0162:
                    java.lang.String r1 = "addressCity"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x016c
                    goto L_0x002f
                L_0x016c:
                    r2 = 11
                    goto L_0x01f0
                L_0x0170:
                    java.lang.String r1 = "middleInitial"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x017a
                    goto L_0x002f
                L_0x017a:
                    r2 = 10
                    goto L_0x01f0
                L_0x017e:
                    java.lang.String r1 = "countryName"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0188
                    goto L_0x002f
                L_0x0188:
                    r2 = 9
                    goto L_0x01f0
                L_0x018c:
                    java.lang.String r1 = "telephoneNumberDevice"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x0196
                    goto L_0x002f
                L_0x0196:
                    r2 = 8
                    goto L_0x01f0
                L_0x0199:
                    java.lang.String r1 = "fullStreetAddress"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x01a3
                    goto L_0x002f
                L_0x01a3:
                    r2 = 7
                    goto L_0x01f0
                L_0x01a5:
                    boolean r1 = r0.equals(r12)
                    if (r1 != 0) goto L_0x01ad
                    goto L_0x002f
                L_0x01ad:
                    r2 = 6
                    goto L_0x01f0
                L_0x01af:
                    boolean r1 = r0.equals(r13)
                    if (r1 != 0) goto L_0x01b7
                    goto L_0x002f
                L_0x01b7:
                    r2 = 5
                    goto L_0x01f0
                L_0x01b9:
                    boolean r1 = r0.equals(r14)
                    if (r1 != 0) goto L_0x01c1
                    goto L_0x002f
                L_0x01c1:
                    r2 = 4
                    goto L_0x01f0
                L_0x01c3:
                    java.lang.String r1 = "telephoneNumberNational"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x01cd
                    goto L_0x002f
                L_0x01cd:
                    r2 = 3
                    goto L_0x01f0
                L_0x01cf:
                    boolean r1 = r0.equals(r15)
                    if (r1 != 0) goto L_0x01d7
                    goto L_0x002f
                L_0x01d7:
                    r2 = 2
                    goto L_0x01f0
                L_0x01d9:
                    java.lang.String r1 = "oneTimeCode"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x01e3
                    goto L_0x002f
                L_0x01e3:
                    r2 = 1
                    goto L_0x01f0
                L_0x01e5:
                    java.lang.String r1 = "birthdayYear"
                    boolean r1 = r0.equals(r1)
                    if (r1 != 0) goto L_0x01ef
                    goto L_0x002f
                L_0x01ef:
                    r2 = 0
                L_0x01f0:
                    switch(r2) {
                        case 0: goto L_0x0243;
                        case 1: goto L_0x0240;
                        case 2: goto L_0x023f;
                        case 3: goto L_0x023c;
                        case 4: goto L_0x023b;
                        case 5: goto L_0x023a;
                        case 6: goto L_0x0239;
                        case 7: goto L_0x0236;
                        case 8: goto L_0x0233;
                        case 9: goto L_0x0230;
                        case 10: goto L_0x022d;
                        case 11: goto L_0x022a;
                        case 12: goto L_0x0229;
                        case 13: goto L_0x0226;
                        case 14: goto L_0x0225;
                        case 15: goto L_0x0222;
                        case 16: goto L_0x021f;
                        case 17: goto L_0x021c;
                        case 18: goto L_0x021b;
                        case 19: goto L_0x021a;
                        case 20: goto L_0x0217;
                        case 21: goto L_0x0216;
                        case 22: goto L_0x0213;
                        case 23: goto L_0x0210;
                        case 24: goto L_0x020d;
                        case 25: goto L_0x020a;
                        case 26: goto L_0x0207;
                        case 27: goto L_0x0204;
                        case 28: goto L_0x0203;
                        case 29: goto L_0x0200;
                        case 30: goto L_0x01ff;
                        case 31: goto L_0x01fc;
                        case 32: goto L_0x01fb;
                        case 33: goto L_0x01f8;
                        case 34: goto L_0x01f7;
                        case 35: goto L_0x01f4;
                        default: goto L_0x01f3;
                    }
                L_0x01f3:
                    return r0
                L_0x01f4:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f7:
                    return r3
                L_0x01f8:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01fb:
                    return r4
                L_0x01fc:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01ff:
                    return r5
                L_0x0200:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0203:
                    return r6
                L_0x0204:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0207:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x020a:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020d:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x0210:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0213:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0216:
                    return r7
                L_0x0217:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x021a:
                    return r8
                L_0x021b:
                    return r9
                L_0x021c:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021f:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0222:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0225:
                    return r10
                L_0x0226:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0229:
                    return r11
                L_0x022a:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022d:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x0230:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0233:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0236:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0239:
                    return r12
                L_0x023a:
                    return r13
                L_0x023b:
                    return r14
                L_0x023c:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023f:
                    return r15
                L_0x0240:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0243:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.translateAutofillHint(java.lang.String):java.lang.String");
            }

            public Autofill(String str, String[] strArr, String str2, TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }
        }

        public Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TextCapitalization textCapitalization2, InputType inputType2, Integer num, String str, Autofill autofill2, String[] strArr, Configuration[] configurationArr) {
            this.obscureText = z;
            this.autocorrect = z2;
            this.enableSuggestions = z3;
            this.enableIMEPersonalizedLearning = z4;
            this.enableDeltaModel = z5;
            this.textCapitalization = textCapitalization2;
            this.inputType = inputType2;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill2;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final TextInputType type;

        public static InputType fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }

        public InputType(TextInputType textInputType, boolean z, boolean z2) {
            this.type = textInputType;
            this.isSigned = z;
            this.isDecimal = z2;
        }
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");
        
        private final String encodedName;

        static TextInputType fromValue(String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }

        private TextInputType(String str) {
            this.encodedName = str;
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        private final String encodedName;

        static TextCapitalization fromValue(String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }

        private TextCapitalization(String str) {
            this.encodedName = str;
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public static TextEditState fromJson(JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public TextEditState(String str, int i, int i2, int i3, int i4) throws IndexOutOfBoundsException {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 <= str.length()) {
                this.text = str;
                this.selectionStart = i;
                this.selectionEnd = i2;
                this.composingStart = i3;
                this.composingEnd = i4;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            }
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }

        public boolean hasComposing() {
            int i = this.composingStart;
            return i >= 0 && this.composingEnd > i;
        }
    }
}

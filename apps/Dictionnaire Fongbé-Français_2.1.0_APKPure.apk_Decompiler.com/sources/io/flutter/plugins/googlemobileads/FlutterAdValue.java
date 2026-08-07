package io.flutter.plugins.googlemobileads;

public class FlutterAdValue {
    final String currencyCode;
    final int precisionType;
    final long valueMicros;

    public FlutterAdValue(int i, String str, long j) {
        this.precisionType = i;
        this.currencyCode = str;
        this.valueMicros = j;
    }
}

package androidx.datastore.preferences.protobuf;

final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("newInstance");
        return invokeSubclassFactory != null ? invokeSubclassFactory : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return invokeSubclassFactory != null ? invokeSubclassFactory : ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = EXTENSION_REGISTRY_CLASS;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean isFullRegistry(androidx.datastore.preferences.protobuf.ExtensionRegistryLite r1) {
        /*
            boolean r0 = androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime
            if (r0 != 0) goto L_0x0014
            java.lang.Class<?> r0 = EXTENSION_REGISTRY_CLASS
            if (r0 == 0) goto L_0x0014
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.isFullRegistry(androidx.datastore.preferences.protobuf.ExtensionRegistryLite):boolean");
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}

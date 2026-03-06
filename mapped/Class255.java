/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1668;
import mapped.Class244;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3286;
import mapped.Class3814;
import mapped.Class3815;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class5433;
import mapped.Class5836;
import mapped.Class6283;

public class Class255
extends Class253 {
    public Class255(String a2, String b2, Boolean c2) {
        super(a2, b2, c2);
    }

    @Override
    public void method505(Object object) {
        Class255.method586(this, (Boolean)object);
    }

    public static Class3814 method585() {
        return Class3815.INSTANCE;
    }

    private static void method586(Class255 class255, Boolean bl2) {
        class255.method583(bl2);
    }

    public void method587() {
        Class244 b2 = this.method502();
        if (b2 instanceof Class278) {
            Class278 a2 = (Class278)b2;
            a2.method1264();
        }
    }

    private static void method588() {
        Class3979.method19561();
    }

    private static void method589(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method590() {
        Class5836.method22897();
    }

    @Override
    public void method583(Boolean c2) {
        super.method583(c2);
        Class244 d2 = this.method502();
        if (d2 instanceof Class278) {
            Class278 b2 = (Class278)d2;
            Class6283 a2 = b2.method1275();
            a2.method24284(c2);
            if (c2.booleanValue()) {
                Class255.method591().method18546(b2);
                Class4036.method20085(0.38788843f, 0.2595932f, Class3286.field7067, 0.9970321f, 0.0012795329f, Class5433.field10131);
                return;
            }
            Class255.method585().method18540(b2);
        }
    }

    public static Class3814 method591() {
        return Class3815.INSTANCE;
    }

    private static void method592(Class278 class278) {
        class278.method1268();
    }

    public void method593() {
        Class244 b2 = this.method502();
        if (b2 instanceof Class278) {
            Class278 a2 = (Class278)b2;
            Class255.method592(a2);
        }
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}


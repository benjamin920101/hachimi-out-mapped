/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1505;
import mapped.Class242;
import mapped.Class243;
import mapped.Class3979;
import mapped.Class5450;
import mapped.Class5457;
import mapped.Class5836;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4070 {
    private final List field9409 = new CopyOnWriteArrayList();
    private static long[] field9410 = new long[2];

    public void method20247() {
        this.field9409.removeIf(Class4070::method20261);
    }

    private static int method20248(int n2, int n3, Class1505 class1505, Class5457 class5457) {
        return Class5450.method21124(n2, n3, class1505, class5457);
    }

    private static boolean method20249(String a2, Class243 b2) {
        return b2.method446().contains(a2);
    }

    public boolean method20250(Class243 a2) {
        return this.field9409.remove(a2);
    }

    private static void method20251() {
        Class5836.method22897();
    }

    public boolean method20252(String a2) {
        return this.field9409.removeIf(arg_0 -> Class4070.method20249(a2, arg_0));
    }

    public void method20253(Class243 a2) {
        this.field9409.add(a2);
    }

    public List method20254() {
        return this.field9409;
    }

    static {
        Class4070.method20258(5494898550846855374L);
    }

    public boolean method20255(String a2) {
        return this.field9409.stream().anyMatch(arg_0 -> Class4070.method20256(a2, arg_0));
    }

    private static boolean method20256(String a2, Class243 b2) {
        return b2.method446().contains(a2);
    }

    public List method20257() {
        ArrayList<String> b2 = new ArrayList<String>();
        for (Class243 a2 : this.method20254()) {
            b2.add(a2.method445());
        }
        return b2;
    }

    private static void method20258(long l2) {
        Class4070.field9410[0] = l2 ^ 0x4C41CD1E680918CEL;
        Class4070.field9410[1] = l2 ^ 0x4C41CD1E680918CFL;
    }

    public void method20259(Class243 ... b2) {
        Class243[] class243Array = b2;
        int n2 = class243Array.length;
        for (int i2 = (int)field9410[0]; i2 < n2; ++i2) {
            Class243 a2 = class243Array[i2];
            this.method20253(a2);
        }
    }

    private static void method20260() {
        Class3979.method19561();
    }

    private static boolean method20261(Class243 a2) {
        return (!(a2 instanceof Class242) ? (int)field9410[1] : (int)field9410[0]) != 0;
    }

    public boolean method20262(String a2) {
        return this.field9409.removeIf(arg_0 -> Class4070.method20263(a2, arg_0));
    }

    private static boolean method20263(String a2, Class243 b2) {
        return Integer.valueOf(a2.toUpperCase().hashCode()).equals(b2.method446().toUpperCase().hashCode());
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


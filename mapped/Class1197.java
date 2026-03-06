/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  net.minecraft.util.Formatting
 *  net.minecraft.text.Text
 *  net.minecraft.text.Style
 *  net.minecraft.text.OrderedText
 */
package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class212;
import mapped.AutoMount;
import mapped.Class3259;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class4196;
import mapped.Colors;
import mapped.Socials;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class5984;
import mapped.Class606;
import mapped.Class6305;
import mapped.Class803;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.OrderedText;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1197 {
    private static final Map field4729;
    private static long[] field4730;

    private static Colors method13199() {
        return Colors.method10620();
    }

    private static void method13200() {
        Class1745.method15538();
    }

    private static boolean method13201() {
        return Class4196.method20801();
    }

    private static boolean method13202(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method13203(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method13204(int n2, int n3, Class212 class212, Class606 class606) {
        return Class3259.method16682(n2, n3, class212, class606);
    }

    public static Map method13205() {
        return field4729;
    }

    private static boolean method13206(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method13207(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method13208(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method13209(long l2) {
        Class1197.field4730[1] = l2 ^ 0x5EF1EE874A554159L;
        Class1197.field4730[0] = l2 ^ 0x5EF1EE874A5541FEL;
        Class1197.field4730[2] = l2 ^ 0x5EF1EE874AAABE01L;
        Class1197.field4730[3] = l2 ^ 0x5EF1EE874A5541FFL;
    }

    private static void method13210() {
        Class3979.method19561();
    }

    private static boolean method13211() {
        return Class3979.method19543();
    }

    public static String method13212(class_2561 a2) {
        StringBuilder b2 = new StringBuilder();
        a2.method_27658((arg_0, arg_1) -> Class1197.method13219(b2, arg_0, arg_1), class_2583.field_24360);
        return b2.toString();
    }

    private static boolean method13213() {
        return Class3979.method19543();
    }

    private static void method13214() {
        Class1807.method15744();
    }

    private static void method13215(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method13216(int n2, int n3, AutoMount class324, Class5984 class5984) {
        return Class3259.method16690(n2, n3, class324, class5984);
    }

    private static void method13217() {
        Class1745.method15538();
    }

    static {
        field4730 = new long[4];
        Class1197.method13209(6841511573787591166L);
        field4729 = (Map)Stream.of(class_124.values()).filter(class_124::method_543).collect(ImmutableMap.toImmutableMap(class_124::method_532, Function.identity()));
    }

    private static int method13218(Socials class458) {
        return class458.method10627();
    }

    private static Optional method13219(StringBuilder c2, class_2583 d2, String e2) {
        if (!e2.isEmpty()) {
            if (d2.method_10973() != null) {
                int b2 = d2.method_10973().method_27716();
                int n2 = Class1197.method13199().method10621();
                if (b2 == ((int)field4730[2] | ~n2) - ~n2) {
                    c2.append((char)field4730[1]).append("s");
                } else if (b2 == (Class1197.method13218(Socials.method10623()) & (int)field4730[2])) {
                    c2.append((char)field4730[1]).append("g");
                } else {
                    class_124 a2 = (class_124)Class1197.method13205().get(b2);
                    if (a2 != null) {
                        c2.append((char)field4730[1]).append(a2.method_36145());
                    }
                }
            } else if (d2.method_10987()) {
                c2.append((char)field4730[1]).append("k");
            } else if (d2.method_10984()) {
                c2.append((char)field4730[1]).append("l");
            } else if (d2.method_10986()) {
                c2.append((char)field4730[1]).append("m");
            } else if (d2.method_10965()) {
                c2.append((char)field4730[1]).append("n");
            } else {
                if (d2.method_10966()) {
                    c2.append((char)field4730[1]).append("o");
                    Class5836.method22907(Class6305.field12944);
                    return null;
                }
                c2.append((char)field4730[1]).append("r");
            }
            c2.append(e2);
        }
        return Optional.empty();
    }

    public static String method13220(class_5481 a2) {
        StringBuilder b2 = new StringBuilder();
        a2.accept((arg_0, arg_1, arg_2) -> Class1197.method13223(b2, arg_0, arg_1, arg_2));
        return b2.toString();
    }

    private static boolean method13221() {
        return Class1807.method15753();
    }

    public static String method13222(String b2) {
        if (b2 == null) {
            return null;
        }
        char[] c2 = b2.toCharArray();
        char[] d2 = new char[c2.length];
        int e2 = (int)field4730[0];
        for (int a2 = (int)field4730[0]; a2 < c2.length; ++a2) {
            if (c2[a2] == (int)field4730[1]) {
                ++a2;
                continue;
            }
            d2[e2++] = c2[a2];
        }
        return new String(d2, (int)field4730[0], e2);
    }

    /*
     * Unable to fully structure code
     */
    private static boolean method13223(StringBuilder c, int d, class_2583 e, int f) {
        block18: {
            block19: {
                if (e.method_10973() == null) break block19;
                b = e.method_10973().method_27716();
                v0 = Colors.method10620().method10621();
                if (b == ((int)Class1197.field4730[2] | ~v0) - ~v0) {
                    v1 = 25559;
                    return Blink.method4987();
                }
                v2 = 25560;
                if (true) ** GOTO lbl11
                block4: while (true) {
                    v2 = 25558;
lbl11:
                    // 2 sources

                    switch (v2) {
                        case 25560: {
                            continue block4;
                        }
                        case 25559: {
                            c.append((char)Class1197.field4730[1]).append("s");
                            break block4;
                        }
                        default: {
                            if (b == (Socials.method10623().method10627() & (int)Class1197.field4730[2])) {
                                c.append((char)Class1197.field4730[1]).append("g");
                                break block4;
                            }
                            a = (class_124)Class1197.field4729.get(b);
                            if (a == null) break block18;
                            c.append((char)Class1197.field4730[1]).append(a.method_36145());
                        }
                    }
                    break;
                }
                break block18;
            }
            if (e.method_10987()) {
                c.append((char)Class1197.field4730[1]).append("k");
            } else if (e.method_10984()) {
                c.append((char)Class1197.field4730[1]).append("l");
            } else if (e.method_10986()) {
                c.append((char)Class1197.field4730[1]).append("m");
            } else if (e.method_10965()) {
                c.append((char)Class1197.field4730[1]).append("n");
            } else {
                if (e.method_10966()) {
                    c.append((char)Class1197.field4730[1]).append("o");
                    while (true) {
                        // Infinite loop
                    }
                }
                c.append((char)Class1197.field4730[1]).append("r");
            }
        }
        c.appendCodePoint(f);
        return (boolean)((int)Class1197.field4730[3]);
    }

    private static boolean method13224() {
        return Class3979.method19543();
    }

    private static void method13225() {
        Class1807.method15744();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


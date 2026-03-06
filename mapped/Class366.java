/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_310
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class1215;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class207;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3833;
import mapped.Class3979;
import mapped.Class40;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class447;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6198;
import mapped.Class69;
import mapped.Class932;
import mapped.Class956;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class366
extends Class278 {
    private static long[] field1191 = new long[2];
    Class248 field1192;
    Class248 field1193;
    Class248 field1194 = this.method450(new Class253("Legit", "Legit safe walk", (boolean)field1191[0]));

    public static void method4755(class_744 class_7442, boolean bl2) {
        class_7442.field_3903 = bl2;
    }

    private static void method4756(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method4757(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public boolean method4758(double a2, double b2, double c2) {
        class_238 d2 = Class366.method4784(field290).method_5829();
        class_238 e2 = new class_238(d2.field_1323, d2.field_1322, d2.field_1324, d2.field_1320, d2.field_1322 + 0.5, d2.field_1324);
        return (!Class366.method4768((class_1297)Class366.field290.field_1724, e2.method_989(a2, b2, c2)) ? (int)field1191[1] : (int)field1191[0]) != 0;
    }

    private static void method4759(long l2) {
        Class366.field1191[0] = l2 ^ 0xB9D34B3CE454D10FL;
        Class366.field1191[1] = l2 ^ 0xB9D34B3CE454D10EL;
    }

    private static void method4760() {
        Class1503.method14420();
    }

    private static void method4761(float f2) {
        Class5836.method22907(f2);
    }

    public boolean method4762() {
        return (!((Boolean)this.field1192.method507()).booleanValue() || Class447.method10252() ? (int)field1191[1] : (int)field1191[0]) != 0;
    }

    private static void method4763() {
        Class5836.method22890();
    }

    private static boolean method4764(Class366 class366, double d2, double d3, double d4) {
        return class366.method4758(d2, d3, d4);
    }

    private static void method4765() {
        Class4146.method20694();
    }

    static {
        Class366.method4759(-5056615231706050289L);
    }

    private static void method4766() {
        Class5836.method22890();
    }

    private static void method4767(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method4768(class_1297 class_12972, class_238 class_2383) {
        return Class1215.method13246(class_12972, class_2383);
    }

    private static boolean method4769(Class366 class366) {
        return class366.method4762();
    }

    private static int method4770(int n2, int n3, Class207 class207, Class3833 class3833) {
        return Class932.method12624(n2, n3, class207, class3833);
    }

    private static void method4771() {
        Class5659.method22184();
    }

    private static void method4772() {
        Class4146.method20694();
    }

    private static void method4773() {
        Class4146.method20697();
    }

    private static void method4774() {
        Class1745.method15538();
    }

    private static Object method4775(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=-100)
    public void method4776(Class69 a2) {
        if (Class366.field290.field_1724.method_24828()) {
            int n2 = 11118;
            Class1745.method15538();
            return;
        }
        int n3 = 11119;
        block12: while (true) {
            switch (n3) {
                case 11119: {
                    n3 = 11117;
                    continue block12;
                }
                case 11118: {
                    int n4 = (Boolean)this.field1194.method507() == false ? 56401 : 56400;
                    block13: while (true) {
                        switch (n4) {
                            case 56401: {
                                n4 = 56399;
                                continue block13;
                            }
                            case 56400: {
                                int n5 = Class366.method4769(this) ? 43690 : 43691;
                                block14: while (true) {
                                    switch (n5) {
                                        case 43691: {
                                            n5 = 43689;
                                            continue block14;
                                        }
                                        case 43690: {
                                            if (this.method4758(((Float)this.field1193.method507()).floatValue(), -1.0, 0.0)) {
                                                Class366.field290.field_1724.field_3913.field_3903 = (int)field1191[1];
                                                return;
                                            }
                                            if (this.method4758(0.0, Class6198.field12605, ((Float)Class366.method4775(this.field1193)).floatValue())) {
                                                Class366.method4755(Class366.field290.field_1724.field_3913, (boolean)field1191[1]);
                                                Class366.method4782();
                                                return;
                                            }
                                            if (!this.method4758(((Float)this.field1193.method507()).floatValue(), -1.0, ((Float)this.field1193.method507()).floatValue())) break block13;
                                            Class366.field290.field_1724.field_3913.field_3903 = (int)field1191[1];
                                            return;
                                        }
                                        default: {
                                            return;
                                        }
                                    }
                                    break;
                                }
                            }
                            default: {
                                return;
                            }
                        }
                        break;
                    }
                    if (this.method4758(-((Float)this.field1193.method507()).floatValue(), -1.0, 0.0)) {
                        Class366.field290.field_1724.field_3913.field_3903 = (int)field1191[1];
                        return;
                    }
                    if (Class366.method4764(this, 0.0, -1.0, -((Float)this.field1193.method507()).floatValue())) {
                        Class366.field290.field_1724.field_3913.field_3903 = (int)field1191[1];
                        return;
                    }
                    if (!Class366.method4777(this, -((Float)this.field1193.method507()).floatValue(), -1.0, -((Float)this.field1193.method507()).floatValue())) return;
                    Class366.field290.field_1724.field_3913.field_3903 = (int)field1191[1];
                    return;
                }
            }
            break;
        }
    }

    private static boolean method4777(Class366 class366, double d2, double d3, double d4) {
        return class366.method4758(d2, d3, d4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method4778(Class40 a2) {
        int n2 = !Class366.method4781(field290).method_5715() ? 9378 : 9379;
        int n3 = n2;
        if (n3 != 9378) {
            if (n3 == 9379) return;
            return;
        } else {
            if (((Boolean)Class366.method4783(this).method507()).booleanValue()) {
                Class366.method4779();
                return;
            }
            if (!this.method4762()) return;
            a2.method10();
            a2.method79((boolean)field1191[1]);
        }
    }

    private static void method4779() {
        Class5836.method22890();
    }

    private static void method4780() {
        Class5836.method22885();
    }

    public Class366() {
        super("SafeWalk", "Prevents you from walking off ledges", Class556.field2752);
        this.field1193 = this.method450(new Class252("Offset", "offset for checks", Float.valueOf(0.0f), Float.valueOf(0.3f), Float.valueOf(Class956.field4004)));
        this.field1192 = this.method450(new Class253("PhasedOnly", "Works only when you are phasing", (boolean)field1191[0]));
    }

    public static class_746 method4781(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4782() {
        Class3979.method19561();
    }

    public static Class248 method4783(Class366 class366) {
        return class366.field1194;
    }

    public static class_746 method4784(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4785() {
        Class4146.method20694();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


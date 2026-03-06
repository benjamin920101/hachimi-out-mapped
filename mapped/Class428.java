/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2680
 */
package mapped;

import java.util.HashSet;
import java.util.List;
import mapped.Class3979;
import mapped.Class4045;
import mapped.Class427;
import mapped.Class532;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class650;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2680;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class428
extends Class427 {
    private static final List field1955;
    protected static final class_2680 field1956;
    private static long[] field1957;

    private static boolean method8598(Class650 a2) {
        return (a2.method11449() == class_2246.field_10540 ? (int)field1957[1] : (int)field1957[2]) != 0;
    }

    static {
        field1957 = new long[3];
        Class428.method8606(-1126618547607765832L);
        field1956 = class_2246.field_10540.method_9564();
        field1955 = new Class532();
    }

    protected int method8599() {
        HashSet<Class650> c2 = new HashSet<Class650>();
        for (class_2248 b2 : field1955) {
            int a2 = this.method8592(b2);
            if (a2 == (int)field1957[0]) continue;
            c2.add(new Class650(b2, a2));
        }
        Class650 d2 = c2.stream().filter(Class428::method8598).findFirst().orElse(null);
        if (d2 != null) {
            return d2.method11450();
        }
        Class650 e2 = c2.stream().filter(Class428::method8603).findFirst().orElse(null);
        if (e2 != null) {
            return e2.method11450();
        }
        Class650 f2 = c2.stream().filter(Class428::method8600).findFirst().orElse(null);
        if (f2 != null) {
            return f2.method11450();
        }
        return (int)field1957[0];
    }

    private static boolean method8600(Class650 a2) {
        return (a2.method11449() == class_2246.field_10443 ? (int)field1957[1] : (int)field1957[2]) != 0;
    }

    private static int method8601(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static boolean method8602() {
        return Class3979.method19543();
    }

    public Class428(String a2, String b2, Class556 c2, int d2) {
        super(a2, b2, c2, d2);
    }

    private static boolean method8603(Class650 a2) {
        if (a2.method11449() == class_2246.field_22423) {
            int n2 = (int)field1957[1];
            while (true) {
                // Infinite loop
            }
        }
        return (int)field1957[2] != 0;
    }

    private static boolean method8604() {
        return Class3979.method19544();
    }

    private static int method8605(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method8606(long l2) {
        Class428.field1957[0] = l2 ^ 0xFA28D9997870347L;
        Class428.field1957[1] = l2 ^ 0xF05D72666878FCB9L;
        Class428.field1957[2] = l2 ^ 0xF05D72666878FCB8L;
    }

    public Class428(String a2, String b2, Class556 c2) {
        super(a2, b2, c2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


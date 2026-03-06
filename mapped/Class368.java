/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2817
 *  net.minecraft.class_2960
 *  net.minecraft.class_8709
 *  net.minecraft.class_8710
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class278;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6009;
import net.minecraft.class_2596;
import net.minecraft.class_2817;
import net.minecraft.class_2960;
import net.minecraft.class_8709;
import net.minecraft.class_8710;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class368
extends Class278 {
    private static long[] field1198 = new long[1];

    @Class1
    public void method4803(Class131 c2) {
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_2817) {
            class_8710 b2;
            class_2817 class_28172 = (class_2817)class_25962;
            try {
                class_8710 class_87102;
                b2 = class_87102 = class_28172.comp_1647();
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            class_2960 a2 = b2.method_56479().comp_2242();
            if (Integer.valueOf("brand".hashCode()).equals(a2.method_12832().hashCode())) {
                c2.method14((boolean)field1198[0]);
                Class368.method4806().method21342((class_2596)new class_2817((class_8710)new class_8709("vanilla")));
                return;
            }
            if (Integer.valueOf("fabric".hashCode()).equals(a2.method_12836().hashCode()) && !field290.method_1542()) {
                c2.method14((boolean)field1198[0]);
            }
        }
    }

    private static void method4804() {
        Class6009.method23561();
    }

    private static void method4805(long l2) {
        Class368.field1198[0] = l2 ^ 0xC7F14259621DC143L;
    }

    public Class368() {
        super("ClientSpoof", "Spoofs your client brand", Class556.field2755);
    }

    static {
        Class368.method4805(-4039374439108984510L);
    }

    public static Class5496 method4806() {
        return Class5723.field11048;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


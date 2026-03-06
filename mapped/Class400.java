/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class278;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import net.minecraft.class_2596;
import net.minecraft.class_2846;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class400
extends Class278 {
    public Class400() {
        super("NoMineAnimation", "Prevents the serverside mine animation", Class556.field2755);
    }

    private static void method5897(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    @Class1
    public void method5898(Class131 b2) {
        class_2846 a2;
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2846 && (a2 = (class_2846)class_25962).method_12363() == class_2846.class_2847.field_12968) {
            Class400.method5897(Class5723.field11048, (class_2596)new class_2846(class_2846.class_2847.field_12971, a2.method_12362(), a2.method_12360()));
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


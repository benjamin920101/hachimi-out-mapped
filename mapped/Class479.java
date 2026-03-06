/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_6880
 */
package mapped;

import mapped.Class244;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_6880;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class479
implements Comparable {
    private int field2503;
    private final class_6880 field2504;
    private final int field2505;

    public int method10774() {
        return this.field2505;
    }

    public void method10775() {
        class_1293 a2 = Class244.field290.field_1724.method_6112(this.field2504);
        if (a2 != null) {
            this.field2503 = a2.method_5584();
        }
    }

    public int method10776(Class479 a2) {
        return Class479.method10780(a2).compareTo(this.method10779());
    }

    public int method10777() {
        return this.field2503;
    }

    public class_6880 method10778() {
        return this.field2504;
    }

    public Class479(class_6880 a2, int b2, int c2) {
        this.field2504 = a2;
        this.field2505 = b2;
        this.field2503 = c2;
    }

    public int compareTo(Object object) {
        return this.method10776((Class479)object);
    }

    public String method10779() {
        return ((class_1291)this.method10778().comp_349()).method_5560().getString();
    }

    private static String method10780(Class479 class479) {
        return class479.method10779();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


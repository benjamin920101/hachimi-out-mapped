/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_3414
 *  net.minecraft.class_3419
 */
package mapped;

import mapped.Class3;
import mapped.Class8;
import net.minecraft.class_243;
import net.minecraft.class_3414;
import net.minecraft.class_3419;

@Class3
public class Class143
extends Class8 {
    private final class_3414 field187;
    private final class_243 field188;
    private final class_3419 field189;

    public Class143(class_243 a2, class_3414 b2, class_3419 c2) {
        this.field188 = a2;
        this.field187 = b2;
        this.field189 = c2;
    }

    public static class_3419 method278(Class143 class143) {
        return class143.field189;
    }

    public class_3414 method279() {
        return this.field187;
    }

    public class_3419 method280() {
        return Class143.method278(this);
    }

    public class_243 method281() {
        return this.field188;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2394
 */
package mapped;

import mapped.Class3;
import mapped.Class8;
import net.minecraft.class_2394;

@Class3
public class Class39
extends Class8 {
    private int field55;
    private final class_2394 field56;
    private int field57;

    public Class39(class_2394 a2, int b2, int c2) {
        this.field56 = a2;
        this.field57 = b2;
        this.field55 = c2;
    }

    public void method72(int a2) {
        this.field57 = a2;
    }

    public int method73() {
        return this.field55;
    }

    public void method74(int a2) {
        this.field55 = a2;
    }

    public static int method75(Class39 class39) {
        return class39.field57;
    }

    public class_2394 method76() {
        return this.field56;
    }

    public int method77() {
        return Class39.method75(this);
    }
}


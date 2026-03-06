/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 */
package mapped;

import mapped.Class3;
import mapped.Class8;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;

@Class3
public class Class178
extends Class8 {
    private final class_2680 field227;
    private final class_2338 field228;
    private class_265 field229;

    public Class178(class_265 a2, class_2338 b2, class_2680 c2) {
        this.field228 = b2;
        this.field227 = c2;
        this.field229 = a2;
    }

    public class_265 method345() {
        return this.field229;
    }

    public class_2338 method346() {
        return this.field228;
    }

    public class_2680 method347() {
        return this.field227;
    }

    public static class_2680 method348(Class178 class178) {
        return class178.field227;
    }

    public void method349(class_265 a2) {
        this.field229 = a2;
    }

    public class_2248 method350() {
        return Class178.method348(this).method_26204();
    }
}


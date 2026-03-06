/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.entity.model.EntityModel
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class171
extends Class8 {
    private final int field216;
    private final class_4587 field217;
    private final float field218;
    private final float field219;
    private final float field220;
    private final class_4588 field221;
    private final int field222;
    private final float field223;
    private final class_583 field224;
    private final class_1309 field225;

    private static String WU5bnrt4qXjWibDY(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x6A64C5FA));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public int method329() {
        return this.field216;
    }

    public static class_1309 method330(Class171 class171) {
        return class171.field225;
    }

    public float method331() {
        return this.field220;
    }

    public class_583 method332() {
        return this.field224;
    }

    public class_4587 method333() {
        return this.field217;
    }

    public class_4588 method334() {
        return this.field221;
    }

    public Class171(class_1309 a2, class_583 b2, class_4587 c2, class_4588 d2, int e2, int f2, float g2, float h2, float i2, float j2) {
        this.field225 = a2;
        this.field224 = b2;
        this.field217 = c2;
        this.field221 = d2;
        this.field216 = e2;
        this.field222 = f2;
        this.field223 = g2;
        this.field219 = h2;
        this.field218 = i2;
        this.field220 = j2;
    }

    public static float method335(Class171 class171) {
        return class171.field223;
    }

    public int method336() {
        return this.field222;
    }

    public class_1309 method337() {
        return Class171.method330(this);
    }

    public float method338() {
        return Class171.method339(this);
    }

    public static float method339(Class171 class171) {
        return class171.field218;
    }

    public float method340() {
        return this.field219;
    }

    public static CallSite 11WVAJqid8tBaBnm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class171.WU5bnrt4qXjWibDY(string7), Class171.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class171.WU5bnrt4qXjWibDY(string5)), Class171.WU5bnrt4qXjWibDY(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class171.WU5bnrt4qXjWibDY(string5)), Class171.WU5bnrt4qXjWibDY(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public float method341() {
        return Class171.method335(this);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.minecraft.client.texture.Sprite
 *  net.minecraft.client.render.model.BakedModel
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.BlockState
 *  net.minecraft.util.math.random.Random
 *  net.minecraft.client.render.model.BakedQuad
 *  net.minecraft.client.render.model.json.ModelOverrideList
 *  net.minecraft.client.render.model.json.ModelTransformation
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import mapped.Class1018;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class5659;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.random.Random;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelOverrideList;
import net.minecraft.client.render.model.json.ModelTransformation;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3880
implements class_1087 {
    private final List field8819 = new ObjectArrayList();
    private static long[] field8820 = new long[2];
    private class_1087 field8821;

    private static void method19231(long l2) {
        Class3880.method19233(l2);
    }

    public boolean method_4708() {
        return this.field8821.method_4708();
    }

    public static class_1087 method19232(Class3880 class3880) {
        return class3880.field8821;
    }

    private static void method19233(long l2) {
        Class3880.field8820[0] = l2 ^ 0xE74F1B7A8D44378AL;
        Class3880.field8820[1] = l2 ^ 0xE74F1B7A8D44378BL;
    }

    public boolean method_4713() {
        return this.field8821.method_4713();
    }

    public static void method19234(Class3880 class3880, class_1087 class_10872) {
        class3880.field8821 = class_10872;
    }

    public class_1058 method_4711() {
        return this.field8821.method_4711();
    }

    public class_809 method_4709() {
        return this.field8821.method_4709();
    }

    public class_806 method_4710() {
        return this.field8821.method_4710();
    }

    public List method_4707(@Nullable class_2680 c2, @Nullable class_2350 d2, class_5819 e2) {
        if (d2 != null) {
            return this.method19237(d2) ? this.field8821.method_4707(c2, d2, e2) : ImmutableList.of();
        }
        this.field8819.clear();
        List b2 = this.field8821.method_4707(c2, null, e2);
        for (class_777 a2 : b2) {
            if (!this.method19237(a2.method_3358())) continue;
            this.field8819.add(a2);
        }
        return this.field8819;
    }

    private static void method19235(boolean bl2) {
        Class1108.method12918(bl2);
    }

    static {
        Class3880.method19231(-1779173114618038390L);
    }

    public void method19236(class_1087 a2) {
        Class3880.method19234(this, a2);
    }

    private boolean method19237(class_2350 a2) {
        if (a2 == class_2350.field_11035) {
            int n2 = (int)field8820[1];
            return Class5659.method22229(Class1018.field4210, 0.7224948276764429, 0.4145419414896119, 0.03996879083981131);
        }
        return (int)field8820[0] != 0;
    }

    private static void method19238() {
        Class1503.method14420();
    }

    public boolean method_4712() {
        return this.field8821.method_4712();
    }

    public boolean method_24304() {
        return Class3880.method19232(this).method_24304();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


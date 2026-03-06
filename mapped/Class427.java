/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 */
package mapped;

import java.util.function.Predicate;
import mapped.Class248;
import mapped.Class253;
import mapped.Class4045;
import mapped.Class414;
import mapped.Class556;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

public class Class427
extends Class414 {
    protected Class248 field1952 = this.method450(new Class253("StrictDirection", "Places on visible sides only", (boolean)field1953[0]));
    private static long[] field1953 = new long[5];
    protected Class248 field1954 = this.method450(new Class253("Rotate", "Rotates to block before placing", (boolean)field1953[0]));

    protected int method8592(class_2248 d2) {
        int c2 = (int)field1953[0];
        if (c2 < (int)field1953[4]) {
            class_1747 a2;
            class_1799 b2 = Class427.field290.field_1724.method_31548().method_5438(c2);
            class_1792 class_17922 = b2.method_7909();
            if (class_17922 instanceof class_1747 && (a2 = (class_1747)class_17922).method_7711() == d2) {
                return c2;
            }
            ++c2;
            return Class4045.method20103(1757687803);
        }
        return (int)field1953[3];
    }

    protected int method8593(Predicate c2) {
        for (int b2 = (int)field1953[0]; b2 < (int)field1953[4]; ++b2) {
            class_1799 a2 = Class427.field290.field_1724.method_31548().method_5438(b2);
            if (a2.method_7960()) continue;
            if (!c2.test(a2)) continue;
            return b2;
        }
        return (int)field1953[3];
    }

    private static void method8594(long l2) {
        Class427.field1953[3] = l2 ^ 0x6F52FD744ACA5798L;
        Class427.field1953[2] = l2 ^ 0x90AD028BB535A865L;
        Class427.field1953[1] = l2 ^ 0x90AD028BB535A866L;
        Class427.field1953[4] = l2 ^ 0x90AD028BB535A86EL;
        Class427.field1953[0] = l2 ^ 0x90AD028BB535A867L;
    }

    private static int method8595(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    static {
        Class427.method8594(-8021752562213083033L);
    }

    public Class427(String a2, String b2, Class556 c2, int d2) {
        super(a2, b2, c2, d2);
        Class248[] class248Array = new Class248[(int)field1953[2]];
        class248Array[(int)Class427.field1953[0]] = this.field1952;
        class248Array[(int)Class427.field1953[1]] = this.field1954;
        this.method451(class248Array);
    }

    private static int method8596(int n2) {
        return Class4045.method20096(n2);
    }

    public Class427(String a2, String b2, Class556 c2) {
        super(a2, b2, c2);
        Class248[] class248Array = new Class248[(int)field1953[2]];
        class248Array[(int)Class427.field1953[0]] = this.field1952;
        class248Array[(int)Class427.field1953[1]] = this.field1954;
        this.method451(class248Array);
    }

    private static int method8597(int n2) {
        return Class4045.method20095(n2);
    }

    private static Object l(char c2) {
        return ((Object[])l)[c2];
    }
}


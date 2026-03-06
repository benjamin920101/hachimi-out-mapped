/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import mapped.Class1;
import mapped.Class1097;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1547;
import mapped.Class170;
import mapped.Class229;
import mapped.Class251;
import mapped.Class3815;
import mapped.Class408;
import mapped.Class4122;
import mapped.Class461;
import mapped.Class533;
import mapped.Class5659;
import mapped.Class597;
import mapped.Class6023;
import mapped.Class6322;
import mapped.Class803;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3978 {
    private static long[] field9072 = new long[3];
    private float field9073 = 1.0f;
    private long field9074;
    private final Deque field9075 = new Class533((int)field9072[0]);

    private static int method19505(int n2, int n3, Class251 class251, Class1097 class1097) {
        return Class461.method10641(n2, n3, class251, class1097);
    }

    static {
        Class3978.method19527(-8312741902386802542L);
    }

    private static float method19506() {
        return Class6322.method24336();
    }

    public float method19507(Class597 a2) {
        float f2;
        block5: {
            block4: {
                block3: {
                    block2: {
                        block1: {
                            int n2 = Class1547.field5805[a2.ordinal()];
                            if (n2 == 1) break block1;
                            if (n2 == 2) break block2;
                            if (n2 == 3) break block3;
                            if (n2 != 4) {
                                throw new MatchException(null, null);
                            }
                            break block4;
                        }
                        f2 = this.method19528();
                        break block5;
                    }
                    f2 = this.method19525();
                    break block5;
                }
                f2 = Class3978.method19508(this);
                break block5;
            }
            f2 = 20.0f;
        }
        return f2;
    }

    private static float method19508(Class3978 class3978) {
        return class3978.method19518();
    }

    private static float method19509(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    private static float method19510() {
        return Class6322.method24325();
    }

    private static Deque method19511(Class3978 class3978) {
        return Class3978.method19531(class3978);
    }

    public void method19512(float a2) {
        this.field9073 = a2;
    }

    public Class3978() {
        Class3815.INSTANCE.method18546(this);
    }

    private static void method19513(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public boolean method19514() {
        return (this.field9075.size() >= (int)field9072[0] ? (int)field9072[1] : (int)field9072[2]) != 0;
    }

    private static float method19515() {
        return Class803.method12221();
    }

    private static float method19516() {
        return Class5659.method22208();
    }

    private static boolean method19517() {
        return Class408.method6431();
    }

    public float method19518() {
        float b2 = 20.0f;
        try {
            Iterator iterator = this.field9075.iterator();
            while (iterator.hasNext()) {
                float a2 = ((Float)iterator.next()).floatValue();
                if (!(a2 < b2)) continue;
                b2 = a2;
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        return b2;
    }

    private static float method19519() {
        return Class6322.method24325();
    }

    public static void method19520(Class3978 class3978, long l2) {
        class3978.field9074 = l2;
    }

    @Class1
    public void method19521(Class170 a2) {
        if (this.field9073 != 1.0f) {
            a2.method10();
            a2.method327(Class3978.method19523(this));
        }
    }

    private static float method19522() {
        return Class5659.method22223();
    }

    public static float method19523(Class3978 class3978) {
        return class3978.field9073;
    }

    public static Deque method19524(Class3978 class3978) {
        return class3978.field9075;
    }

    public float method19525() {
        try {
            if (!Class3978.method19524(this).isEmpty()) {
                return Math.min(100.0f, ((Float)Class3978.method19511(this).getFirst()).floatValue());
            }
        }
        catch (NoSuchElementException noSuchElementException) {
            // empty catch block
        }
        return 20.0f;
    }

    @Class1
    public void method19526(Class229 a2) {
        this.field9075.clear();
    }

    private static void method19527(long l2) {
        Class3978.field9072[2] = l2 ^ 0x8CA3354856BAD092L;
        Class3978.field9072[1] = l2 ^ 0x8CA3354856BAD093L;
        Class3978.field9072[0] = l2 ^ 0x8CA3354856BAD086L;
    }

    public float method19528() {
        float c2 = 0.0f;
        try {
            ArrayList b2 = Lists.newArrayList((Iterable)this.field9075);
            if (b2.isEmpty()) {
                return Class6322.method24336();
            }
            Iterator iterator = b2.iterator();
            while (iterator.hasNext()) {
                float a2 = ((Float)iterator.next()).floatValue();
                c2 += a2;
            }
            c2 /= Math.max((float)b2.size(), 1.0f);
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        return Math.min(100.0f, c2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method19529(Class133 b2) {
        int n2 = Class4122.field9561.field_1724 != null ? 39433 : 39434;
        block4: while (true) {
            switch (n2) {
                case 39434: {
                    n2 = 39432;
                    continue block4;
                }
                case 39433: {
                    if (Class4122.field9561.field_1687 != null) break block4;
                }
                default: {
                    return;
                }
            }
            break;
        }
        if (b2.method251() instanceof class_2761) {
            float a2 = 20000.0f / (float)(System.currentTimeMillis() - this.field9074);
            this.field9075.addFirst(Float.valueOf(a2));
            Class3978.method19520(this, System.currentTimeMillis());
        }
    }

    public Queue method19530() {
        return this.field9075;
    }

    public static Deque method19531(Class3978 class3978) {
        return class3978.field9075;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


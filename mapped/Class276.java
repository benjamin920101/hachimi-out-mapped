/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.MathHelper
 */
package mapped;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1108;
import mapped.Class1150;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class189;
import mapped.Class198;
import mapped.Class248;
import mapped.Class261;
import mapped.Class263;
import mapped.Class266;
import mapped.Class267;
import mapped.Class268;
import mapped.Class269;
import mapped.Class270;
import mapped.Class271;
import mapped.Class272;
import mapped.Class273;
import mapped.Class274;
import mapped.Class277;
import mapped.Class278;
import mapped.Class298;
import mapped.Class299;
import mapped.Class3211;
import mapped.Class333;
import mapped.Class342;
import mapped.Class389;
import mapped.Class3979;
import mapped.Class4033;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class435;
import mapped.Class447;
import mapped.Class489;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5760;
import mapped.Class579;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class613;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class683;
import mapped.Class735;
import mapped.Class750;
import mapped.Class765;
import mapped.Class968;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;

public class Class276
extends Class266 {
    private final List field386 = new CopyOnWriteArrayList();
    private static long[] field387 = new long[9];
    private float field388;
    private final Class277 field389;
    private boolean field390;
    private final Class6283 field391 = new Class6283((boolean)field387[0], Class765.field3448, Class489.field2551);

    private static void method1158(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method1159() {
        Class6009.method23561();
    }

    public void method1160(float a2) {
        this.field388 += a2;
    }

    private static void method1161(Class270 class270) {
        class270.method877();
    }

    public static float method1162() {
        return 1.0f;
    }

    private static void method1163() {
        Class3979.method19561();
    }

    public List method1164() {
        return this.field386;
    }

    private static void method1165(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method1166(int n2, int n3, Class198 class198, Class447 class447) {
        return Class5760.method22625(n2, n3, class198, class447);
    }

    private static void method1167(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static float method1168(Class273 class273) {
        return class273.method1067();
    }

    public boolean method1169() {
        return this.field390;
    }

    private static void method1170() {
        Class4146.method20697();
    }

    private static void method1171() {
        Class5659.method22184();
    }

    public static boolean method1172(Class276 class276) {
        return class276.field390;
    }

    private static void method1173() {
        Class1745.method15538();
    }

    private static Class277 method1174(Class276 class276) {
        return Class276.method1241(class276);
    }

    private static void method1175() {
        Class6009.method23560();
    }

    public float method1176() {
        return (float)this.field391.method24281();
    }

    private static void method1177(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1178() {
        Class6454.method24594();
    }

    private static float method1179(Class273 class273) {
        return class273.method1064();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void method649(double c, double d, int e) {
        block9: {
            block6: {
                block8: {
                    block5: {
                        block7: {
                            if (!this.method744(c, d)) break block6;
                            if (e != 0) break block5;
                            var6_4 = Class276.method1174(this);
                            if (!(var6_4 instanceof Class278)) break block7;
                            v0 = 10298;
                            ** GOTO lbl12
                        }
                        v0 = 10299;
                        if (true) ** GOTO lbl12
                        while (true) {
                            v0 = var7_6 = 10297;
lbl12:
                            // 3 sources

                            if (var7_6 == 10298) break;
                            if (var7_6 == 10299) {
                                continue;
                            }
                            break block5;
                            break;
                        }
                        a = (Class278)var6_4;
                        a.method1273();
                        break block8;
                    }
                    if (e != (int)Class276.field387[2]) {
                        Class5836.method22890();
                        return;
                    }
                    this.field390 = Class276.method1238(this) == false ? (int)Class276.field387[2] : (int)Class276.field387[0];
                    this.field391.method24284(Class276.method1244(this));
                }
                if (!Class333.method2989().method3011()) break block9;
                Class5723.field11041.method22448(Class5693.field10948);
                break block9;
            }
            if (Class276.method1219(this)) {
                for (Class268 b : this.field386) {
                    if (!Class276.method1197(b).method503()) continue;
                    b.method649(c, d, e);
                }
            }
        }
    }

    private static void method1180(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1181() {
        Class298.method1924();
    }

    private static void method1182() {
        Class4146.method20697();
    }

    private static void method1183() {
        Class1745.method15538();
    }

    private static int method1184(int n2, int n3, Class683 class683, Class342 class342) {
        return Class5760.method22649(n2, n3, class683, class342);
    }

    private static void method1185(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static float method1186() {
        return 1.0f;
    }

    static {
        Class276.method1187(-3592425017766434749L);
    }

    private static void method1187(long l2) {
        Class276.field387[0] = l2 ^ 0xCE25247AD5CE2843L;
        Class276.field387[2] = l2 ^ 0xCE25247AD5CE2842L;
        Class276.field387[4] = l2 ^ 0xCE25247AD5CE285AL;
        Class276.field387[8] = l2 ^ 0xCE25247AD5CE285DL;
        Class276.field387[6] = l2 ^ 0x31DADB852A6482E9L;
        Class276.field387[3] = l2 ^ 0xCE25247AD5CE2827L;
        Class276.field387[1] = l2 ^ 0xCE25247AD5CE2871L;
        Class276.field387[5] = l2 ^ 0xCE25247AD5CE2857L;
        Class276.field387[7] = l2 ^ 0x31DADB852A31D7BCL;
    }

    public static float method1188() {
        return 1.0f;
    }

    @Override
    public void method722(double b2, double c2, int d2) {
        if (Class276.method1172(this)) {
            for (Class268 a2 : this.field386) {
                a2.method722(b2, c2, d2);
            }
        }
    }

    private static void method1189() {
        Class5659.method22184();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Class276(Class277 b2, Class261 c2, float d2, float e2) {
        super(c2, d2, e2, 95.0f, 13.0f);
        this.field389 = b2;
        Iterator iterator = b2.method471().iterator();
        block4: while (true) {
            if (!iterator.hasNext()) {
                this.field390 = (int)field387[0];
                return;
            }
            Class248 a2 = (Class248)iterator.next();
            if (Integer.valueOf("Enabled".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) {
                throw null;
            }
            if (a2.method507() instanceof Boolean) {
                this.field386.add(new Class272(c2, this, a2, d2, e2));
                continue;
            }
            int n2 = a2.method507() instanceof Double ? 47812 : 47813;
            block5: while (true) {
                switch (n2) {
                    case 47813: {
                        n2 = 47811;
                        continue block5;
                    }
                    case 47812: {
                        this.field386.add(new Class274(c2, this, a2, d2, e2));
                        continue block4;
                    }
                }
                break;
            }
            if (a2.method507() instanceof Float) {
                this.field386.add(new Class274(c2, this, a2, d2, e2));
                throw null;
            }
            if (a2.method507() instanceof Integer) {
                this.field386.add(new Class274(c2, this, a2, d2, e2));
                continue;
            }
            if (!(a2.method507() instanceof Enum)) {
                throw null;
            }
            this.field386.add(new Class271(c2, this, a2, d2, e2));
            throw null;
        }
    }

    private static void method1190(float f2) {
        Class5836.method22907(f2);
    }

    private static Class277 method1191(Class276 class276) {
        return class276.method1228();
    }

    private static void method1192() {
        Class298.method1924();
    }

    private static void method1193() {
        Class6009.method23560();
    }

    private static void method1194() {
        Class6009.method23560();
    }

    @Override
    public void method707(class_332 a2, float b2, float c2, float d2) {
        this.method1209(a2, this.field340, this.field337, b2, c2, d2);
    }

    private static void method1195() {
        Class4146.method20694();
    }

    private static int method1196(int n2, int n3, Class435 class435, Class299 class299) {
        return Class5760.method22654(n2, n3, class435, class299);
    }

    private static Class248 method1197(Class268 class268) {
        return class268.method826();
    }

    private static void method1198() {
        Class4146.method20697();
    }

    private static void method1199(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1200(float f2) {
        Class5836.method22907(f2);
    }

    private static Class277 method1201(Class276 class276) {
        return Class276.method1205(class276);
    }

    private static void method1202() {
        Class6454.method24594();
    }

    private static void method1203(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Class333 method1204() {
        return Class333.method2989();
    }

    public static Class277 method1205(Class276 class276) {
        return class276.field389;
    }

    private static float method1206(Class271 class271) {
        return class271.method911();
    }

    private static void method1207() {
        Class3979.method19561();
    }

    private static void method1208() {
        Class6009.method23560();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void method1209(class_332 n2, float o2, float p2, float q2, float r2, float s2) {
        Object e2;
        block22: {
            int n3;
            int E2;
            int n4;
            int u2;
            float t2;
            block23: {
                block20: {
                    block21: {
                        int n5;
                        Class278 a2;
                        this.method753(Class6454.method24637() + Class276.method1243().method2999());
                        this.field340 = o2;
                        this.field337 = p2;
                        t2 = 1.0f;
                        Class277 class277 = Class276.method1201(this);
                        u2 = class277 instanceof Class278 && !((t2 = (float)(a2 = (Class278)class277).method1275().method24281()) > 0.01f) ? (int)field387[0] : (int)field387[2];
                        t2 *= 1.7f;
                        boolean v2 = this.method740(q2, r2);
                        if (v2 != this.field345.method24288()) {
                            this.field345.method24284(v2);
                        }
                        if (Class267.field350 == null) {
                            int n6 = 46558;
                            Class1503.method14417(0.97983503f, 0.9990016f);
                            return;
                        }
                        int n7 = 46557;
                        boolean bl2 = true;
                        do {
                            if (!bl2 || (bl2 = false) || !true) {
                                n7 = n5 = 46556;
                            }
                            if (n5 != 46557) continue;
                            if (Class276.method1217().isEmpty()) break block20;
                            break block21;
                        } while (n5 == 46558);
                        break block20;
                    }
                    n4 = (int)field387[2];
                    break block23;
                }
                n4 = (int)field387[0];
            }
            int w2 = n4;
            int x2 = w2 != 0 && !Class276.method1191(this).method446().toLowerCase().contains(Class267.field350.toLowerCase()) ? (int)field387[2] : (int)field387[0];
            double y2 = this.field345.method24281();
            if (x2 != 0) {
                int n8 = (int)field387[8];
                Class6009.method23559(true);
                return;
            }
            int z2 = (int)((double)((int)field387[5] + ((Boolean)Class333.method2989().field836.method507() != false ? (int)field387[0] : (int)field387[4])) * class_3532.method_15350((double)y2, (double)0.0, (double)1.0));
            int A2 = (int)((double)(x2 != 0 ? (int)field387[4] : (int)field387[1]) * class_3532.method_15350((double)y2, (double)0.0, (double)1.0));
            int B2 = Class276.method1224(Class333.method2989(), new Color((int)(255.0 * y2), (int)(Class4033.field9285 * y2), (int)(Class750.field3395 * y2), z2 + ((Boolean)Class333.method2989().field836.method507() != false ? (int)field387[4] : (int)field387[0])).getRGB());
            this.method742(n2, u2 != 0 ? Class333.method2989().method3028((x2 != 0 ? (int)field387[1] : (int)field387[3]) + A2, t2) : B2);
            int C2 = (int)field387[7];
            int D2 = (int)field387[6];
            int n9 = E2 = (Boolean)Class276.method1236(Class333.method2989()).method507() == false || t2 > Class735.field3354 ? C2 : D2;
            if (w2 != 0) {
                E2 = x2 != 0 ? D2 : C2;
            }
            this.method771(n2, this.field389.method446(), o2 + 2.0f, p2 + Class276.method1220(Class333.method2989()) * Class276.method1162(), E2);
            double F2 = Class276.method1234(this.field391);
            if (((Boolean)Class333.method2989().field847.method507()).booleanValue()) {
                this.method771(n2, F2 > Class3211.field6889 ? "-" : "+", o2 + 86.0f, p2 + Class333.method2989().method3018() * Class276.method1188(), C2);
            }
            int n10 = n3 = F2 > (double)0.01f ? 46309 : 46310;
            if (n3 != 46309) {
                if (n3 == 46310) {
                    Class3979.method19561();
                    return;
                }
                Iterator iterator = this.field386.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    Class268 m2 = (Class268)iterator.next();
                    if (m2 instanceof Class269) {
                        Class269 i2 = (Class269)m2;
                        i2.method837((boolean)field387[0]);
                    }
                    if (m2 instanceof Class270) {
                        Class270 j2 = (Class270)m2;
                        Class276.method1161(j2);
                    }
                    if (!(m2 instanceof Class273)) {
                        Class276.method1245(0.9113777f);
                        return;
                    }
                    Class273 k2 = (Class273)m2;
                    k2.method1009();
                    if (!(m2 instanceof Class274)) continue;
                    Class274 l2 = (Class274)m2;
                    l2.method1139();
                }
            }
            this.field388 = this.field337 + this.field339 * 1.0f + 1.0f;
            float g2 = 0.0f;
            Iterator iterator = this.field386.iterator();
            while (true) {
                Class271 d2;
                Class273 c2;
                if (!iterator.hasNext()) {
                    boolean h2 = Class333.method2989().method2998();
                    if (h2) {
                        break;
                    }
                    break block22;
                }
                e2 = (Class268)iterator.next();
                if (!((Class268)e2).method826().method503()) {
                    Class298.method1924();
                    return;
                }
                g2 += ((Class263)e2).method778();
                if (e2 instanceof Class273 && Class276.method1179(c2 = (Class273)e2) > 0.01f) {
                    g2 += Class276.method1168(c2) * Class276.method1237(c2) * this.method1176();
                    Class5836.method22907(0.4309728f);
                    return;
                }
                if (!(e2 instanceof Class271) || !((d2 = (Class271)e2).method911() > 0.01f)) continue;
                g2 += Class276.method1246(d2) * Class276.method1206(d2) * this.method1176();
            }
            this.method737(this.field340, Class276.method1214(this) - Class276.method1210(), this.field340 + this.field341 * 1.0f, (double)this.field388 + (double)(1.0f + g2) * F2);
        }
        if ((e2 = Class276.method1211(this).iterator()).hasNext()) {
            Class4036.method20085(Class968.field4040, 0.04356754f, 0.42078274f, 0.18632662f, 0.7686747f, 0.6008375f);
            return;
        }
        Class276.method1229();
    }

    public static float method1210() {
        return 1.0f;
    }

    private static List method1211(Class276 class276) {
        return Class276.method1233(class276);
    }

    private static void method1212() {
        Class5659.method22184();
    }

    private static void method1213(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Override
    public void method646(int b2, int c2, int d2) {
        if (this.field390) {
            Iterator iterator = this.field386.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    Class5836.method22885();
                    return;
                }
                Class268 a2 = (Class268)iterator.next();
                a2.method646(b2, c2, d2);
            }
        }
    }

    public static float method1214(Class276 class276) {
        return class276.field388;
    }

    private static int method1215(int n2, int n3, Class389 class389, Class1150 class1150) {
        return Class5760.method22667(n2, n3, class389, class1150);
    }

    private static boolean method1216(Class248 class248) {
        return class248.method503();
    }

    public static String method1217() {
        return Class267.field350;
    }

    private static void method1218() {
        Class5836.method22897();
    }

    public static boolean method1219(Class276 class276) {
        return class276.field390;
    }

    private static float method1220(Class333 class333) {
        return class333.method3018();
    }

    private static void method1221() {
        Class5836.method22890();
    }

    private static void method1222(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1223() {
        Class1807.method15744();
    }

    private static int method1224(Class333 class333, int n2) {
        return class333.method2990(n2);
    }

    private static void method1225() {
        Class1807.method15744();
    }

    private static int method1226(int n2, int n3, Class613 class613, Class189 class189) {
        return Class5760.method22648(n2, n3, class613, class189);
    }

    private static void method1227(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public Class277 method1228() {
        return this.field389;
    }

    private static void method1229() {
        Class6009.method23561();
    }

    private static int method1230(Class333 class333, int n2, float f2) {
        return class333.method3028(n2, f2);
    }

    private static void method1231(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1232(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static List method1233(Class276 class276) {
        return class276.field386;
    }

    private static double method1234(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method1235() {
        Class1745.method15538();
    }

    public static Class248 method1236(Class333 class333) {
        return class333.field844;
    }

    private static float method1237(Class273 class273) {
        return class273.method1064();
    }

    public static boolean method1238(Class276 class276) {
        return class276.field390;
    }

    private static int method1239(int n2, int n3, Class579 class579, Class273 class273) {
        return Class5760.method22617(n2, n3, class579, class273);
    }

    @Override
    public void method727(char b2, int c2) {
        if (!this.field390) {
            Class6009.method23559(false);
            return;
        }
        for (Class268 a2 : this.field386) {
            a2.method727(b2, c2);
        }
    }

    private static void method1240(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class277 method1241(Class276 class276) {
        return class276.field389;
    }

    private static void method1242() {
        Class4146.method20694();
    }

    private static Class333 method1243() {
        return Class333.method2989();
    }

    public static boolean method1244(Class276 class276) {
        return class276.field390;
    }

    private static void method1245(float f2) {
        Class5836.method22907(f2);
    }

    private static float method1246(Class271 class271) {
        return class271.method901();
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}


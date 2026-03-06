/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1405;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Chams;
import mapped.Class3510;
import mapped.Class3511;
import mapped.Class3814;
import mapped.Class4146;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class8;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3815
implements Class3814 {
    public static final Class3814 INSTANCE;
    private static long[] field8636;
    private static final Class1405 field8637;
    private final Map field8638;
    private final Map field8639;
    private final Map field8640 = new ConcurrentHashMap();

    @Override
    public void method18544(Class3511 a2) {
        Class3815.method18582(this, a2, (boolean)field8636[1]);
    }

    private static void method18547() {
        Class4146.method20694();
    }

    private static void method18548(long l2) {
        Class3815.field8636[1] = l2 ^ 0x9EA090F7AD682DD4L;
        Class3815.field8636[0] = l2 ^ 0x9EA090F7AD682DD5L;
        Class3815.field8636[2] = l2 ^ 0x9EA090F7AD682DD6L;
    }

    private static void method18549() {
        Class5836.method22885();
    }

    @Override
    public void method18546(Object a2) {
        Class3815.method18565(this, this.method18577(a2.getClass(), a2), (boolean)field8636[1]);
    }

    private static void method18550() {
        Class5836.method22890();
    }

    private static void method18551(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method18552(Class3815 class3815, List list, boolean bl2) {
        class3815.method18560(list, bl2);
    }

    private List method18553(Class a2, Object b2, Object c2) {
        CopyOnWriteArrayList d2 = new CopyOnWriteArrayList();
        this.method18581(d2, a2, b2);
        return d2;
    }

    private void method18554(List a2, Class3511 b2) {
        int c2 = (int)field8636[1];
        if (c2 < a2.size() && b2.method17731() <= ((Class3511)a2.get(c2)).method17731()) {
            ++c2;
            while (true) {
                // Infinite loop
            }
        }
        a2.add(c2, b2);
    }

    private static void method18555(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Override
    public void method18538(Class a2) {
        this.method18563(this.method18577(a2, null), (boolean)field8636[0]);
    }

    private boolean method18556(Method a2) {
        if (!a2.isAnnotationPresent(Class1.class)) {
            return (int)field8636[1] != 0;
        }
        if (a2.getReturnType() != Class3815.method18559()) {
            return (int)field8636[1] != 0;
        }
        if (a2.getParameterCount() != (int)field8636[0]) {
            return (int)field8636[1] != 0;
        }
        if (!a2.getParameters()[(int)field8636[1]].getType().isPrimitive()) {
            int n2 = (int)field8636[0];
            return Class1807.method15742();
        }
        return (int)field8636[1] != 0;
    }

    private static void method18557(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method18558(boolean bl2) {
        Class1108.method12918(bl2);
    }

    static {
        field8636 = new long[3];
        Class3815.method18548(-7016448826002625068L);
        INSTANCE = new Class3815();
        field8637 = Class3815::method18562;
    }

    public static Class method18559() {
        return Void.TYPE;
    }

    private void method18560(List b2, boolean c2) {
        for (Class3511 a2 : b2) {
            this.method18568(a2, c2);
        }
    }

    private static void method18561(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Override
    public void method18542(Class a2) {
        Class3815.method18552(this, this.method18577(a2, null), (boolean)field8636[0]);
    }

    private static MethodHandles.Lookup method18562(Method a2, Class b2) throws InvocationTargetException, IllegalAccessException {
        Object[] objectArray = new Object[(int)field8636[2]];
        objectArray[(int)Class3815.field8636[1]] = b2;
        objectArray[(int)Class3815.field8636[0]] = MethodHandles.lookup();
        return (MethodHandles.Lookup)a2.invoke(null, objectArray);
    }

    private void method18563(List b2, boolean c2) {
        Iterator iterator = b2.iterator();
        if (iterator.hasNext()) {
            Class3511 a2 = (Class3511)iterator.next();
            this.method18566(a2, c2);
            while (true) {
                // Infinite loop
            }
        }
    }

    private static void method18564(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method18565(Class3815 class3815, List list, boolean bl2) {
        class3815.method18560(list, bl2);
    }

    private void method18566(Class3511 a2, boolean b2) {
        List c2 = (List)this.field8638.get(a2.method17726());
        if (c2 != null) {
            if (b2) {
                if (a2.method17729()) {
                    c2.remove(a2);
                }
            } else {
                c2.remove(a2);
            }
        }
    }

    private static void method18567(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private void method18568(Class3511 a2, boolean b2) {
        if (b2) {
            if (a2.method17729()) {
                this.method18554(this.field8638.computeIfAbsent(a2.method17726(), Class3815::method18571), a2);
            }
        } else {
            Class3815.method18578(this, this.field8638.computeIfAbsent(a2.method17726(), Class3815::method18573), a2);
        }
    }

    private static void method18569() {
        Chams.method1924();
    }

    private static void method18570() {
        Class1807.method15744();
    }

    private static List method18571(Class a2) {
        return new CopyOnWriteArrayList();
    }

    private static void method18572() {
        Class1503.method14420();
    }

    private static List method18573(Class a2) {
        return new CopyOnWriteArrayList();
    }

    private static void method18574(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Override
    public void method18540(Object a2) {
        this.method18563(this.method18577(a2.getClass(), a2), (boolean)field8636[1]);
    }

    private static Map method18575(Class3815 class3815) {
        return Class3815.method18580(class3815);
    }

    @Override
    public void method18545(Class3511 a2) {
        this.method18566(a2, (boolean)field8636[1]);
    }

    private static void method18576() {
        Class4146.method20694();
    }

    @Override
    public Class8 method18539(Class8 b2) {
        Iterator iterator;
        List c2 = (List)this.field8638.get(b2.getClass());
        if (c2 != null && (iterator = c2.iterator()).hasNext()) {
            Class5659.method22184();
            return null;
        }
        return b2;
    }

    private List method18577(Class b2, Object c2) {
        Function<Object, List> d2 = arg_0 -> this.method18553(b2, c2, arg_0);
        if (c2 == null) {
            return this.field8639.computeIfAbsent(b2, d2);
        }
        for (Object a2 : this.field8640.keySet()) {
            if (a2 != c2) continue;
            return (List)this.field8640.get(c2);
        }
        List e2 = d2.apply(c2);
        Class3815.method18575(this).put(c2, e2);
        return e2;
    }

    @Override
    public Object method18541(Object b2) {
        Iterator iterator;
        List c2 = (List)this.field8638.get(b2.getClass());
        if (c2 != null && (iterator = c2.iterator()).hasNext()) {
            Class3511 a2 = (Class3511)iterator.next();
            a2.method17730(b2);
            Class3815.method18570();
            return null;
        }
        return b2;
    }

    private static void method18578(Class3815 class3815, List list, Class3511 class3511) {
        class3815.method18554(list, class3511);
    }

    private static void method18579(Class3815 class3815, List list, Class clazz, Object object) {
        class3815.method18581(list, clazz, object);
    }

    public static Map method18580(Class3815 class3815) {
        return class3815.field8640;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method18581(List b2, Class c2, Object d2) {
        Method[] methodArray = c2.getDeclaredMethods();
        int n2 = methodArray.length;
        int n3 = (int)field8636[1];
        while (true) {
            block4: {
                int n4;
                if (n3 >= n2) {
                    Class5836.method22885();
                    return;
                }
                Method a2 = methodArray[n3];
                int n5 = !this.method18556(a2) ? 63598 : 63597;
                while ((n4 = n5) != 63597) {
                    if (n4 == 63598) {
                        n5 = 63596;
                        continue;
                    }
                    break block4;
                }
                b2.add(new Class3510(field8637, c2, d2, a2));
            }
            ++n3;
        }
    }

    @Override
    public boolean method18543(Class a2) {
        List b2 = (List)this.field8638.get(a2);
        return (b2 != null && !b2.isEmpty() ? (int)field8636[0] : (int)field8636[1]) != 0;
    }

    private static void method18582(Class3815 class3815, Class3511 class3511, boolean bl2) {
        class3815.method18568(class3511, bl2);
    }

    public Class3815() {
        this.field8639 = new ConcurrentHashMap();
        this.field8638 = new ConcurrentHashMap();
    }

    private static boolean method18583(Class8 class8) {
        return class8.method11();
    }

    private static void method18584() {
        Class5659.method22184();
    }

    private static void method18585(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method18586(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


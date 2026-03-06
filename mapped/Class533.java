/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.ConcurrentLinkedDeque;
import mapped.Class1108;
import mapped.Class803;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class533
extends ConcurrentLinkedDeque {
    private final int field2635;

    private static boolean method10939(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static CallSite oVWl5jjk6rUFeLMq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class533.d5tGA5NFQ141r9Ao(string7), Class533.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class533.d5tGA5NFQ141r9Ao(string5)), Class533.d5tGA5NFQ141r9Ao(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class533.d5tGA5NFQ141r9Ao(string5)), Class533.d5tGA5NFQ141r9Ao(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String d5tGA5NFQ141r9Ao(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xF8749BDB));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10940(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public Class533(int a2) {
        this.field2635 = a2;
    }

    @Override
    public void addFirst(@NotNull Object a2) {
        super.addFirst(a2);
        while (this.size() > this.field2635) {
            super.removeLast();
        }
    }

    @Override
    public boolean add(@NotNull Object a2) {
        boolean b2 = super.add(a2);
        while (b2 && this.size() > this.field2635) {
            super.remove();
        }
        return b2;
    }

    public int method10941() {
        return this.field2635;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


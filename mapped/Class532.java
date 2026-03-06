/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedList;
import net.minecraft.block.Blocks;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class532
extends LinkedList {
    private static String QURSlQ1YzhIFyOAB(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x3AD9BA0C));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite 3W6W9TujvLqJmofI(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class532.QURSlQ1YzhIFyOAB(string7), Class532.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class532.QURSlQ1YzhIFyOAB(string5)), Class532.QURSlQ1YzhIFyOAB(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class532.QURSlQ1YzhIFyOAB(string5)), Class532.QURSlQ1YzhIFyOAB(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    Class532() {
        this.add(class_2246.field_10540);
        this.add(class_2246.field_22423);
        this.add(class_2246.field_10443);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


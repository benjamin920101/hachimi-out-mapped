/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  net.minecraft.class_2172
 */
package mapped;

import com.mojang.brigadier.CommandDispatcher;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class8;
import net.minecraft.class_2172;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class147
extends Class8 {
    private class_2172 field192;
    private CommandDispatcher field193;
    private String field194;

    public static void method284(Class147 class147, class_2172 class_21722) {
        class147.field192 = class_21722;
    }

    public String method285() {
        return this.field194;
    }

    public void method286(class_2172 a2) {
        Class147.method284(this, a2);
    }

    public CommandDispatcher method287() {
        return this.field193;
    }

    public static class_2172 method288(Class147 class147) {
        return class147.field192;
    }

    public void method289(CommandDispatcher a2) {
        this.field193 = a2;
    }

    public class_2172 method290() {
        return Class147.method288(this);
    }

    private static String JJVOmAGtPoYrRCfT(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xAC93446));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite f2qfeyFn1Ol4jC6W(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class147.JJVOmAGtPoYrRCfT(string7), Class147.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class147.JJVOmAGtPoYrRCfT(string5)), Class147.JJVOmAGtPoYrRCfT(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class147.JJVOmAGtPoYrRCfT(string5)), Class147.JJVOmAGtPoYrRCfT(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void method291(String a2) {
        this.field194 = a2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


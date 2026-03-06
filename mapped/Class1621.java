/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.class_640
 */
package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4146;
import net.minecraft.class_640;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1621
implements ArgumentType {
    private static long[] field6050 = new long[1];

    public static String method14775(CommandContext a2, String b2) {
        return (String)a2.getArgument(b2, String.class);
    }

    private static void method14776() {
        Class4146.method20694();
    }

    private static void method14777(long l2) {
        Class1621.field6050[0] = l2 ^ 0xD312B33781F95E2BL;
    }

    private static void method14778(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method14779(long l2) {
        Class1621.method14777(l2);
    }

    static {
        Class1621.method14779(-3237328131140788693L);
    }

    public Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.method14780(stringReader);
    }

    public String method14780(StringReader a2) throws CommandSyntaxException {
        return a2.readString();
    }

    public CompletableFuture listSuggestions(CommandContext d2, SuggestionsBuilder e2) {
        String[] f2 = d2.getInput().split(" ");
        Collection g2 = Class4122.field9561.field_1724.field_3944.method_2880();
        block0: for (class_640 c2 : g2) {
            String b2 = c2.method_2966().getName();
            String[] stringArray = f2;
            int n2 = stringArray.length;
            for (int i2 = (int)field6050[0]; i2 < n2; ++i2) {
                String a2 = stringArray[i2];
                if (!a2.isBlank() && !b2.toLowerCase().startsWith(a2.toLowerCase())) continue;
                e2.suggest(b2);
                continue block0;
            }
        }
        return e2.buildFuture();
    }

    public static Class1621 method14781() {
        return new Class1621();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


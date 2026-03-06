/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.class_1299
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_7922
 *  net.minecraft.class_7923
 */
package mapped;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import mapped.Class1503;
import mapped.Class1561;
import mapped.Class248;
import mapped.Class249;
import mapped.Class257;
import mapped.Class258;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import net.minecraft.class_1299;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7922;
import net.minecraft.class_7923;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1338
implements ArgumentType {
    private static void method13716() {
        Class6009.method23560();
    }

    public static class_7922 method13717() {
        return class_7923.field_41175;
    }

    public static Object method13718(CommandContext a2, String b2) {
        return a2.getArgument(b2, Object.class);
    }

    private static void method13719(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method13720() {
        Class1503.method14420();
    }

    public static Class1338 method13721() {
        return new Class1338();
    }

    private static void method13722() {
        Class5836.method22897();
    }

    private static void method13723(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method13724() {
        Class1503.method14420();
    }

    private static void method13725() {
        Class5836.method22897();
    }

    public CompletableFuture listSuggestions(CommandContext d2, SuggestionsBuilder e2) {
        Class248 f2 = Class1561.method14529(d2, "setting");
        String g2 = StringArgumentType.getString((CommandContext)d2, (String)"value");
        if (!Integer.valueOf("add".toUpperCase().hashCode()).equals(g2.toUpperCase().hashCode())) {
            if (!Integer.valueOf("remove".toUpperCase().hashCode()).equals(g2.toUpperCase().hashCode()) && !Integer.valueOf("del".toUpperCase().hashCode()).equals(g2.toUpperCase().hashCode())) {
                return e2.buildFuture();
            }
        }
        if (f2 instanceof Class249) {
            for (class_1792 a2 : class_7923.field_41178) {
                e2.suggest(class_7923.field_41178.method_10221((Object)a2).method_12832());
            }
        }
        if (f2 instanceof Class257) {
            for (class_2248 b2 : class_7923.field_41175) {
                e2.suggest(class_7923.field_41175.method_10221((Object)b2).method_12832());
            }
        }
        if (f2 instanceof Class258) {
            for (class_1299 c2 : class_7923.field_41177) {
                e2.suggest(class_7923.field_41177.method_10221((Object)c2).method_12832());
            }
        }
        return e2.buildFuture();
    }

    public Object parse(StringReader a2) throws CommandSyntaxException {
        String b2 = a2.readString();
        class_1792 c2 = (class_1792)class_7923.field_41178.method_10223(class_2960.method_60655((String)"minecraft", (String)b2));
        if (c2 != class_1802.field_8162) {
            return c2;
        }
        class_2248 d2 = (class_2248)Class1338.method13717().method_10223(class_2960.method_60655((String)"minecraft", (String)b2));
        if (d2 != class_2246.field_10124) {
            return d2;
        }
        class_1299 e2 = (class_1299)Class1338.method13726().method_10223(class_2960.method_60655((String)"minecraft", (String)b2));
        if (Integer.valueOf("pig".toUpperCase().hashCode()).equals(b2.toUpperCase().hashCode()) || e2 != class_1299.field_6093) {
            return e2;
        }
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherParseException().createWithContext((ImmutableStringReader)a2, null);
    }

    public static class_7922 method13726() {
        return class_7923.field_41177;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


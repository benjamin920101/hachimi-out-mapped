/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.class_2172
 */
package mapped;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import mapped.Class244;
import mapped.Class277;
import mapped.Class5723;
import net.minecraft.class_2172;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1463
implements ArgumentType {
    private static long[] field5553 = new long[3];

    public CompletableFuture listSuggestions(CommandContext a2, SuggestionsBuilder b2) {
        return class_2172.method_9264(Class5723.field11055.method20679().stream().map(Class244::method446), (SuggestionsBuilder)b2);
    }

    public Collection getExamples() {
        return Class5723.field11055.method20679().stream().map(Class244::method446).limit(field5553[2]).toList();
    }

    static {
        Class1463.method14385(-2221354914710968582L);
    }

    public static Class277 method14384(CommandContext a2, String b2) {
        return (Class277)a2.getArgument(b2, Class277.class);
    }

    public Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.method14387(stringReader);
    }

    private static void method14385(long l2) {
        Class1463.field5553[2] = l2 ^ 0xE12C29796C95A6F0L;
        Class1463.field5553[0] = l2 ^ 0xE12C29796C95A6FBL;
        Class1463.field5553[1] = l2 ^ 0xE12C29796C95A6FAL;
    }

    public static Class1463 method14386() {
        return new Class1463();
    }

    public Class277 method14387(StringReader a2) throws CommandSyntaxException {
        String b2 = a2.readString();
        Object[] objectArray = new Object[(int)field5553[0]];
        objectArray[(int)Class1463.field5553[1]] = b2.toLowerCase();
        String c2 = String.format("%s-module", objectArray);
        Class277 d2 = Class5723.field11055.method20668(c2);
        if (d2 == null) {
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherParseException().createWithContext((ImmutableStringReader)a2, null);
        }
        return d2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}


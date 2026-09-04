/*
 * Decompiled with CFR 0.152.
 */
package software.bernie.shadowed.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import software.bernie.shadowed.fasterxml.jackson.core.JsonParser;
import software.bernie.shadowed.fasterxml.jackson.databind.DeserializationContext;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonDeserializer;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonNode;
import software.bernie.shadowed.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import software.bernie.shadowed.fasterxml.jackson.databind.node.ArrayNode;
import software.bernie.shadowed.fasterxml.jackson.databind.node.NullNode;
import software.bernie.shadowed.fasterxml.jackson.databind.node.ObjectNode;

public class JsonNodeDeserializer1
extends JsonNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer1 instance = new JsonNodeDeserializer1();

    protected JsonNodeDeserializer1() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> nodeClass) {
        if (nodeClass == ObjectNode.class) {
            return JsonNodeDeserializer.ObjectDeserializer.getInstance();
        }
        if (nodeClass == ArrayNode.class) {
            return JsonNodeDeserializer.ArrayDeserializer.getInstance();
        }
        return instance;
    }

    @Override
    public JsonNode getNullValue(DeserializationContext ctxt) {
        return NullNode.getInstance();
    }

    @Override
    public JsonNode deserialize(JsonParser p2, DeserializationContext ctxt) throws IOException {
        switch (p2.getCurrentTokenId()) {
            case 1: {
                return this.deserializeObject(p2, ctxt, ctxt.getNodeFactory());
            }
            case 3: {
                return this.deserializeArray(p2, ctxt, ctxt.getNodeFactory());
            }
        }
        return this.deserializeAny(p2, ctxt, ctxt.getNodeFactory());
    }
}


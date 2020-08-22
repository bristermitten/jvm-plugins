package me.bristermitten.common.gradient;

import com.google.gson.JsonObject;

public final class JsonSerializer
{

    private JsonSerializer()
    {
    }

    public static JsonObject toObject(final String text, final String color)
    {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("text", text);

        if (color != null) jsonObject.addProperty("color", color);

        return jsonObject;
    }
}

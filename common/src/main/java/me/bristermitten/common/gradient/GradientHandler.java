package me.bristermitten.common.gradient;

import net.minecraft.server.v1_16_R2.ChatComponentText;
import net.minecraft.server.v1_16_R2.ChatHexColor;
import net.minecraft.server.v1_16_R2.ChatModifier;
import net.minecraft.server.v1_16_R2.IChatMutableComponent;
import org.bukkit.Color;
import org.bukkit.craftbukkit.v1_16_R2.util.CraftChatMessage;

import java.util.List;

public final class GradientHandler
{

    public static String toGradient(String text, final Gradient gradient)
    {
        IChatMutableComponent base = new ChatComponentText("");

        final int length = text.length();
        final List<Color> colors = gradient.getColors();

        final ColorGradient colorGradient = new ColorGradient(colors, length);

        for (char character : text.toCharArray())
        {
            IChatMutableComponent iChatBaseComponents = new ChatComponentText(String.valueOf(character));
            iChatBaseComponents.c(ChatModifier.a.setColor(ChatHexColor.a(colorGradient.next())));
            base.addSibling(iChatBaseComponents);
        }
        return CraftChatMessage.fromComponent(base);
    }

    /**
     * Allows generation of a multi-part gradient with a fixed number of steps
     */
    private static class ColorGradient
    {

        private final List<Color> colors;

        private final int stepSize;
        private int step = 0;
        private int stepIndex = 0;

        private ColorGradient(final List<Color> colors, final int totalColors)
        {
            this.colors = colors;
            stepSize = totalColors / (colors.size() - 1);
        }


        private static Color getGradientInterval(final Color start, final Color end, final float interval)
        {
            int r = (int) (end.getRed() * interval + start.getRed() * (1 - interval));
            int g = (int) (end.getGreen() * interval + start.getGreen() * (1 - interval));
            int b = (int) (end.getBlue() * interval + start.getBlue() * (1 - interval));

            return Color.fromRGB(r, g, b);
        }

        private int next()
        {
            final Color color;
            if (stepIndex + 1 < colors.size())
            {
                final Color start = colors.get(stepIndex);
                final Color end = colors.get(stepIndex + 1);
                final float interval = (float) step / stepSize;

                color = getGradientInterval(start, end, interval);
            } else
            {
                color = colors.get(colors.size() - 1);
            }

            step += 1;
            if (step >= stepSize)
            {
                step = 0;
                stepIndex++;
            }

            return color.asRGB();
        }

    }
}

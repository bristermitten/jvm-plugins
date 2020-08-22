package me.bristermitten.java;

import me.bristermitten.common.gradient.Gradient;
import me.bristermitten.common.gradient.GradientHandler;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author AlexL
 */
public class JavaCommand implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("Only players can experience Java...");
            return true;
        }

        final Gradient gradient = new Gradient();
        gradient.getColors().add(Color.fromRGB(248, 153, 23)); //Java orange
        gradient.getColors().add(Color.fromRGB(82, 131, 162)); //Java Blue

        final String text = GradientHandler.toGradient("The consistency and trendsetting power of Java compels you!", gradient);

        ((Player) sender).kickPlayer(text);
        return true;
    }
}

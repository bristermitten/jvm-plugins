package me.bristermitten.groovy

import me.bristermitten.common.gradient.Gradient
import me.bristermitten.common.gradient.GradientHandler
import org.bukkit.Color
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * @author AlexL
 */
class GroovyCommand implements CommandExecutor {
    @Override
    boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can experience Groovy...")
            return true
        }

        def gradient = new Gradient()
        gradient.colors.add Color.fromRGB(97, 156, 188) //groovy color
        gradient.colors.add Color.WHITE

        def json = GradientHandler.toGradient("The dynamic power of Groovy compels you!", gradient)
        sender.kickPlayer(json)
        return true
    }
}

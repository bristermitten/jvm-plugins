package me.bristermitten.kotlin

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
class KotlinCommand : CommandExecutor
{
	override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean
	{
		if (sender !is Player)
		{
			sender.sendMessage("Only players can experience Kotlin...")
			return true
		}

		val gradient = Gradient()
		gradient.colors += Color.fromRGB(39, 137, 217)
		gradient.colors += Color.fromRGB(248, 137, 9)

		val json = GradientHandler.toGradient("The elegant syntax and null safety of Kotlin compels you!", gradient)
		sender.kickPlayer(json)

		return true
	}
}

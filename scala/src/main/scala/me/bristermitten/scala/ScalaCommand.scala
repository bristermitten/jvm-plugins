package me.bristermitten.scala

import me.bristermitten.common.gradient.{Gradient, GradientHandler}
import org.bukkit.Color
import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player

/**
 * @author AlexL
 */
class ScalaCommand extends CommandExecutor {

  override def onCommand(sender: CommandSender, command: Command, s: String, strings: Array[String]): Boolean = {
    if (!sender.isInstanceOf[Player]) {
      sender.sendMessage("Only players can experience Scala...")
      return false
    }

    val player = sender.asInstanceOf[Player]

    val gradient = new Gradient()

    gradient.getColors add Color.fromRGB(216, 51, 34) //Scala red
    gradient.getColors add Color.fromRGB(124, 12, 28) //Scala black

    val json = GradientHandler.toGradient("The weird and complicated syntax of Scala compels you!", gradient)

    player.kickPlayer(json)
    true
  }
}

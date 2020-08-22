package me.bristermitten.scala

import org.bukkit.ChatColor

/**
 * @author AlexL
 */
object StringExtensions {
  implicit def coloredString(s: String) = new {
    def colored = ChatColor.translateAlternateColorCodes('&', s)
  }
}

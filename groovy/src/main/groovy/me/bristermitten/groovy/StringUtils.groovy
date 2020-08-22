package me.bristermitten.groovy

import org.bukkit.ChatColor

/**
 * @author AlexL
 */
class StringUtils {
    static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&' as char, s)
    }
}

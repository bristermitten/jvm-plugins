package me.bristermitten.kotlin

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author AlexL
 */
class KotlinPlugin : JavaPlugin()
{
	override fun onEnable()
	{
		println("Hello from Kotlin!")
		getCommand("kotlin")?.setExecutor(KotlinCommand())
	}
}

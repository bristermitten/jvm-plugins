package me.bristermitten.scala

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author AlexL
 */
class ScalaPlugin extends JavaPlugin {
  override def onEnable(): Unit = {
    println("Hello from Scala!")
    getCommand("scala").setExecutor(new ScalaCommand())
  }
}

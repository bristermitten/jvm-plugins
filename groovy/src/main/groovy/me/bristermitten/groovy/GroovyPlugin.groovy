package me.bristermitten.groovy

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author AlexL
 */
class GroovyPlugin extends JavaPlugin {

    @Override
    void onEnable() {
        println "Hello from Groovy!"
        getCommand("groovy").executor = new GroovyCommand()
    }
}

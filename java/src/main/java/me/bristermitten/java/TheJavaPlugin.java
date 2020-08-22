package me.bristermitten.java;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author AlexL
 */
public class TheJavaPlugin extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        System.out.println("Hello from Java!");
        getCommand("java").setExecutor(new JavaCommand());
    }
}

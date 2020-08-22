package com.example.myplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPluginJava extends JavaPlugin implements Listener {
    private static MyPluginJava instance;

    public MyPluginJava() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("You cannot create another instance of the main class");
        }
    }

    public static MyPluginJava get() {
        return instance;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

        MyPlugin.onEnable();
    }

    @Override
    public void onDisable() {
        MyPlugin.onDisable();
    }

    // Event Handlers
    //
    // Every method below needs to be annotated with @EventHandler and call MyPlugin.onEventName(event).
    // We need this to be in Java because Spigot uses Java's reflection to call events, and Scala
    // would require a different approach to reflection, which Spigot doesn't support

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        MyPlugin.onJoin(event);
    }
}

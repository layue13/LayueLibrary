package com.layue13.layuelibrary.bukkit.bungee;

import com.google.common.base.Preconditions;
import com.layue13.layuelibrary.bukkit.common.LifeCycle;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class BungeeMessageHandler implements LifeCycle {
    private final Plugin plugin;


    public BungeeMessageHandler(@NotNull Plugin plugin) {
        Preconditions.checkNotNull(plugin);
        this.plugin = plugin;
    }

    @Override
    public void load() {
        this.plugin.getServer().getMessenger().registerOutgoingPluginChannel(plugin, "BungeeCord");
        this.plugin.getServer().getMessenger().registerIncomingPluginChannel(plugin, "BungeeCord",
                (channel, player, message) -> {

                });
    }

    @Override
    public void unload() {
        this.plugin.getServer().getMessenger().unregisterOutgoingPluginChannel(plugin);
        this.plugin.getServer().getMessenger().unregisterIncomingPluginChannel(plugin);
    }
}

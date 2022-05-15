package com.layue13.layuelibrary.bukkit.bungee;

import com.google.common.base.Preconditions;
import com.layue13.layuelibrary.bukkit.common.LifeCycle;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class BungeeHelper implements LifeCycle {
    private final Plugin plugin;
    private final BungeeMessageHandler bungeeMessageHandler;

    public BungeeHelper(@NotNull Plugin plugin) {
        Preconditions.checkNotNull(plugin);

        this.plugin = plugin;
        this.bungeeMessageHandler = new BungeeMessageHandler(plugin);
        load();
    }

    public Plugin getCreator() {
        return plugin;
    }

    @Override
    public void load() {
        this.bungeeMessageHandler.load();
    }

    @Override
    public void unload() {
        this.bungeeMessageHandler.unload();
    }
}

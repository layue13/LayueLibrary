package com.layue13.layuelibrary.bukkit.bungee;

import com.google.common.base.Preconditions;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class BungeeHelper {
    private final Plugin plugin;

    public BungeeHelper(@NotNull Plugin plugin) {
        Preconditions.checkNotNull(plugin);

        this.plugin = plugin;
    }

    public Plugin getCreator() {
        return plugin;
    }
}

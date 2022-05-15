package com.layue13.layuelibrary.bukkit;

import com.layue13.layuelibrary.bukkit.bungee.BungeeHelper;
import com.layue13.layuelibrary.bukkit.bungee.BungeeHelperFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class LayueLibraryBukkitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        BungeeHelper bungeeHelper = BungeeHelperFactory.createBungeeHelper(this);
    }

    @Override
    public void onDisable() {

    }
}

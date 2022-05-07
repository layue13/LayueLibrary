package com.layue13.layuelibrary.bukkit.bungee;

import com.google.common.base.Preconditions;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BungeeHelperFactory {
    private static final Set<BungeeHelper> bungeeHelpers = new HashSet<>();

    public static BungeeHelper createBungeeHelper(@NotNull Plugin plugin) {
        Preconditions.checkNotNull(plugin);

        for (BungeeHelper bungeeHelper : bungeeHelpers) {
            if (bungeeHelper.getCreator().equals(plugin)) {
                return bungeeHelper;
            }
        }
        BungeeHelper bungeeHelper = new BungeeHelper(plugin);
        bungeeHelpers.add(bungeeHelper);
        return bungeeHelper;
    }
}

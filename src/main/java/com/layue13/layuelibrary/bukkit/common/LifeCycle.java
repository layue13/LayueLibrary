package com.layue13.layuelibrary.bukkit.common;

public interface LifeCycle {
    void load();

    void unload();

    default void reload() {
        unload();
        load();
    }
}

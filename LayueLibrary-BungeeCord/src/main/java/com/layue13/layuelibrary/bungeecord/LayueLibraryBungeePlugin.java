package com.layue13.layuelibrary.bungeecord;

import net.md_5.bungee.api.plugin.Plugin;

public class LayueLibraryBungeePlugin extends Plugin {
    @Override
    public void onEnable() {
        this.getProxy().registerChannel("LayueLibrary");
    }
}

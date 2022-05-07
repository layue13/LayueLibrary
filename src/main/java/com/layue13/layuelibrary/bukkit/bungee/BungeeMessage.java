package com.layue13.layuelibrary.bukkit.bungee;

import java.util.UUID;

public class BungeeMessage {
    private final UUID messageId;
    private final byte[] content;

    public BungeeMessage(UUID messageId, byte[] content) {
        this.messageId = messageId;
        this.content = content;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public byte[] getContent() {
        return content;
    }


}

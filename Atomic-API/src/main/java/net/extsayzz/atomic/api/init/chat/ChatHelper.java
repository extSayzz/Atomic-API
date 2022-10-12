package net.extsayzz.atomic.api.init.chat;

import net.md_5.bungee.api.ChatColor;

public final class ChatHelper {
    public static String fixColor(String string) {
        return ChatColor.translateAlternateColorCodes('&', string).replace(">>", "»").replace("<<", "«");
    }

    private ChatHelper() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

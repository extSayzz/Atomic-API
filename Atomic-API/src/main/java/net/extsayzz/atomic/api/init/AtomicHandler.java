package net.extsayzz.atomic.api.init;

import net.extsayzz.atomic.api.init.chat.ChatHelper;
import net.extsayzz.atomic.api.init.config.ConfigAPI;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutKickDisconnect;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public final class AtomicHandler {

    private static final ConfigAPI configAPI;
    private static String debugString = "null";
    private boolean debug;

    static {
        configAPI = new ConfigAPI("plugins/Atomic-AntiCrash/", "config.yml");
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public static ConfigAPI getConfigAPI() {
        return configAPI;
    }


    public void kick(Player player) {
        debugString = "Too many CustomPayload bytes";
        String msg = ChatHelper.fixColor("&8<< &fAtomic-Light &8>> \n\n&7" + debug + "!");
        PacketPlayOutKickDisconnect paaa = new PacketPlayOutKickDisconnect(IChatBaseComponent.ChatSerializer.a("{text:\"" + msg + "\"}"));
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket(paaa);
    }
}

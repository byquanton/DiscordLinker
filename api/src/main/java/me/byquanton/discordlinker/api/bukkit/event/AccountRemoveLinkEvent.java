package me.byquanton.discordlinker.api.bukkit.event;

import me.byquanton.discordlinker.api.account.AbstractDiscordAccount;
import me.byquanton.discordlinker.api.account.AbstractMinecraftAccount;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountRemoveLinkEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final AbstractDiscordAccount discordAccount;
    private final AbstractMinecraftAccount minecraftAccount;

    public AccountRemoveLinkEvent(AbstractDiscordAccount discordAccount, AbstractMinecraftAccount minecraftAccount) {
        this.discordAccount = discordAccount;
        this.minecraftAccount = minecraftAccount;
    }

    public AbstractDiscordAccount getDiscordAccount() {
        return discordAccount;
    }

    public AbstractMinecraftAccount getMinecraftAccount() {
        return minecraftAccount;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
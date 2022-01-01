package me.byquanton.discordlinker.account;

import me.byquanton.discordlinker.api.account.AbstractDiscordAccount;
import me.byquanton.discordlinker.api.account.AbstractMinecraftAccount;
import org.bukkit.OfflinePlayer;

import java.util.Objects;
import java.util.UUID;

public class MinecraftAccount extends AbstractMinecraftAccount {

    private final OfflinePlayer player;

    public MinecraftAccount(OfflinePlayer player){
        this.player = player;
    }

    @Override
    public String getName() {
        return player.getName();
    }

    @Override
    public UUID getUniqueId() {
        return player.getUniqueId();
    }

    @Override
    public AbstractDiscordAccount getDiscordAccount() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinecraftAccount that = (MinecraftAccount) o;
        return player.equals(that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }
}

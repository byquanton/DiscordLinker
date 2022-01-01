package me.byquanton.discordlinker;

import me.byquanton.discordlinker.account.DiscordAccount;
import me.byquanton.discordlinker.account.MinecraftAccount;
import me.byquanton.discordlinker.api.DiscordLinkerApi;
import me.byquanton.discordlinker.api.InstanceHolder;
import me.byquanton.discordlinker.api.account.AbstractDiscordAccount;
import me.byquanton.discordlinker.api.account.AbstractMinecraftAccount;
import me.byquanton.discordlinker.discord.DiscordBot;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class DiscordLinker extends JavaPlugin implements DiscordLinkerApi {

    private DiscordBot discordBot;

    @Override
    public void onLoad() {
        InstanceHolder.set(this);
        discordBot = new DiscordBot(getConfig().getString("discord.token"), this);
    }

    @Override
    public void onEnable() {

    }


    @Override
    public AbstractMinecraftAccount getMinecraftAccount(UUID uuid) {
        return new MinecraftAccount(getServer().getPlayer(uuid));
    }

    @Override
    public AbstractDiscordAccount getDiscordAccount(String discordId) {
        try {
            return getDiscordAccount(Long.parseLong(discordId));
        } catch (NumberFormatException e) {
            return getDiscordAccount(-1);
        }
    }

    @Override
    public AbstractDiscordAccount getDiscordAccount(long discordId) {
        return new DiscordAccount(discordId);
    }
}

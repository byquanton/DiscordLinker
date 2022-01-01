package me.byquanton.discordlinker.api;

import me.byquanton.discordlinker.api.account.AbstractDiscordAccount;
import me.byquanton.discordlinker.api.account.AbstractMinecraftAccount;

import java.util.UUID;

public interface DiscordLinkerApi {

    static DiscordLinkerApi getInstance(){return InstanceHolder.getApi();};

    AbstractMinecraftAccount getMinecraftAccount(UUID uuid);

    AbstractDiscordAccount getDiscordAccount(String discordId);

    AbstractDiscordAccount getDiscordAccount(long discordId);

}

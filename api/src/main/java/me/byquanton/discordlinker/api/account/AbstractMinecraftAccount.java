package me.byquanton.discordlinker.api.account;

import java.util.UUID;

public abstract class AbstractMinecraftAccount {

    public abstract String getName();

    public abstract UUID getUniqueId();

    public abstract AbstractDiscordAccount getDiscordAccount();

}

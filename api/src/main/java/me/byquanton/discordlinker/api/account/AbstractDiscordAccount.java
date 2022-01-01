package me.byquanton.discordlinker.api.account;

import java.util.List;

public abstract class AbstractDiscordAccount {

    public String getDiscordIdAsString(){
        return String.valueOf(getDiscordId());
    }

    public abstract long getDiscordId();

    public abstract List<AbstractMinecraftAccount> getMinecraftAccounts();

}

package me.byquanton.discordlinker.account;

import me.byquanton.discordlinker.api.account.AbstractDiscordAccount;
import me.byquanton.discordlinker.api.account.AbstractMinecraftAccount;

import java.util.List;
import java.util.Objects;

public class DiscordAccount extends AbstractDiscordAccount {

    private long discordId;

    public DiscordAccount(long discordId){
        discordId = discordId;
    }

    @Override
    public long getDiscordId() {
        return discordId;
    }

    @Override
    public List<AbstractMinecraftAccount> getMinecraftAccounts() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscordAccount that = (DiscordAccount) o;
        return getDiscordId() == that.getDiscordId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiscordId());
    }
}

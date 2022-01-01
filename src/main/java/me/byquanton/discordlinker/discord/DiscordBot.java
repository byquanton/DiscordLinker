package me.byquanton.discordlinker.discord;

import me.byquanton.discordlinker.DiscordLinker;
import me.byquanton.discordlinker.account.DiscordAccount;
import me.byquanton.discordlinker.api.DiscordLinkerApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;
import org.javacord.api.entity.permission.PermissionType;
import org.javacord.api.entity.permission.PermissionsBuilder;

public class DiscordBot {

    private DiscordLinker discordLinker;
    private DiscordApi api;
    private Logger logger = LogManager.getLogger("Discord Bot");

    public DiscordBot(String token, DiscordLinker discordLinker) {
        api = new DiscordApiBuilder().setToken(token).setIntents(Intent.GUILD_MESSAGE_REACTIONS).login().join();
        discordLinker = discordLinker;

        if (api.getServers().size() == 0) {
            logger.info("Bot Invite Url: " + api.createBotInvite(new PermissionsBuilder().setAllowed(PermissionType.MANAGE_CHANNELS, PermissionType.MANAGE_MESSAGES).build()));
        }
    }

}

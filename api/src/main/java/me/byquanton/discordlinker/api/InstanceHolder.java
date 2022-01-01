package me.byquanton.discordlinker.api;

public class InstanceHolder {
    private static DiscordLinkerApi api;

    public static void set(DiscordLinkerApi discordLinkerApi){
        api = discordLinkerApi;
    }

    public static DiscordLinkerApi getApi() {
        return api;
    }
}

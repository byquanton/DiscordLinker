import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.3.3"
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "me.byquanton.discordlink"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
    implementation(project(":api"))
    implementation("cloud.commandframework", "cloud-paper", "1.6.0")
    bukkitLibrary("org.javacord","javacord-core","3.3.2")
    bukkitLibrary("org.javacord","javacord-api","3.3.2")
}


tasks {
    assemble {
        dependsOn(reobfJar)
    }

    shadowJar {
        fun reloc(pkg: String) = relocate(pkg, "me.byquanton.discordlinker.dependency.$pkg")

        reloc("cloud.commandframework")
        reloc("io.leangen.geantyref")
    }

    reobfJar {
        outputJar.set(layout.buildDirectory.file("libs/DiscordLinker-Paper.jar"))
    }
}

bukkit {
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "me.byquanton.discordlinker.DiscordLinker"
    apiVersion = "1.18"
    authors = listOf("byquanton")
}

package dland_items.dland_items;

import dland_items.dland_items.Commands.dlandItem;
import dland_items.dland_items.Completers.dlandItemCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class DLand_Items extends JavaPlugin {
    public static String version = "1.1.4";
    @Override
    public void onEnable() {

        getCommand("dlanditem").setExecutor(new dlandItem());
        getCommand("dlanditem").setTabCompleter(new dlandItemCompleter());
        System.out.println("> DLand Items is Enable");

    }

    @Override
    public void onDisable() {
        // I want make normal message in 1.1.5
        System.out.println("> DLand Items is Disable");
    }
}

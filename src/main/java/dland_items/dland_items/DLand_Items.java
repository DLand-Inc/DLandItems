package dland_items.dland_items;

import dland_items.dland_items.Commands.dlandItem;
import dland_items.dland_items.Commands.dlandItemArmor;
import dland_items.dland_items.Commands.dlandItemGun;
import dland_items.dland_items.Completers.dlandItemCompleter;
import dland_items.dland_items.Guns.GunEvents;
import dland_items.dland_items.Items.RuneEvent;
import dland_items.dland_items.Mobs.MobEvents;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class DLand_Items extends JavaPlugin {
    public static String version = "1.1.5";
    @Override
    public void onEnable() {

        getCommand("dlanditem").setExecutor(new dlandItem());
        getCommand("dlanditem").setTabCompleter(new dlandItemCompleter());

        getCommand("dlanditemarmor").setExecutor(new dlandItemArmor());
        getCommand("dlanditemgun").setExecutor(new dlandItemGun());

        //getServer().getPluginManager().registerEvents(new GunEvents(),this);
        //getServer().getPluginManager().registerEvents(new MobEvents(this),this);
        getServer().getPluginManager().registerEvents(new RuneEvent(),this);
        // Recipes



        System.out.println("> DLand Items is Enable");

    }

    @Override
    public void onDisable() {
        // I want make normal message in 1.1.6
        System.out.println("> DLand Items is Disable");
    }
}

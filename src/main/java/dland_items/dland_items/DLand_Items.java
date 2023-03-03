package dland_items.dland_items;

import dland_items.dland_items.Commands.dlandItem;
import dland_items.dland_items.Commands.dlandItemArmor;
import dland_items.dland_items.Commands.dlandItemGun;
import dland_items.dland_items.Completers.dlandItemCompleter;
import dland_items.dland_items.Guns.GunEvents;
import dland_items.dland_items.Items.ItemEvents.ExpBottle;
import dland_items.dland_items.Items.ItemEvents.GoldenHead;
import dland_items.dland_items.Items.Items;
import dland_items.dland_items.Items.RuneEvent;
import dland_items.dland_items.Mobs.MobEvents;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

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
        getServer().getPluginManager().registerEvents(new GoldenHead(),this);
        getServer().getPluginManager().registerEvents(new ExpBottle(),this);

        // Recipes

        ShapedRecipe expBottleRecipe = new ShapedRecipe(new ItemStack(Material.EXPERIENCE_BOTTLE,8));
        expBottleRecipe.shape("AAA","ABA","AAA");
        expBottleRecipe.setIngredient('A',Material.LAPIS_LAZULI);
        expBottleRecipe.setIngredient('B',Material.GOLD_NUGGET);
        Bukkit.addRecipe(expBottleRecipe);


        ShapedRecipe alchemyBottle = new ShapedRecipe(Items.getAlchemyBottle());
        alchemyBottle.shape("ABA","BCB","ABA");
        alchemyBottle.setIngredient('A',Material.GLASS);
        alchemyBottle.setIngredient('B',Material.GLOWSTONE_DUST);
        alchemyBottle.setIngredient('C',Material.GLASS_BOTTLE);
        Bukkit.addRecipe(alchemyBottle);

        ShapedRecipe gorkSubst = new ShapedRecipe(Items.getGorkayaSubstanstiya());
        gorkSubst.shape("ABA","BCB","ABA");
        gorkSubst.setIngredient('A',Material.EMERALD_BLOCK);
        gorkSubst.setIngredient('B',Material.GLOWSTONE_DUST);
        gorkSubst.setIngredient('C',Material.IRON_AXE);
        Bukkit.addRecipe(gorkSubst);

        System.out.println("> DLand Items is Enable");

    }

    @Override
    public void onDisable() {
        // I want make normal message in 1.1.6
        System.out.println("> DLand Items is Disable");
    }
}

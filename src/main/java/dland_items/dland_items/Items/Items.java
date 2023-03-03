package dland_items.dland_items.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class Items {
    // Tank Fragment
    public static ItemStack TankFragment;
    private void method() {
        TankFragment = new ItemStack(Material.IRON_NUGGET, 4);
        ItemMeta TankFragmentMeta = TankFragment.getItemMeta();
        TankFragmentMeta.setDisplayName(ChatColor.BLUE + "Tank Fragment");
        TankFragmentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        TankFragmentMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
        List<String> loreList = new ArrayList<>();
        loreList.add(ChatColor.WHITE + "Используй в крафте Танк-Брони");
        loreList.add("");
        loreList.add("" + ChatColor.BLUE + ChatColor.BOLD + "Редкий");
        TankFragmentMeta.setLore(loreList);
        TankFragment.setItemMeta(TankFragmentMeta);
    }
    public static ItemStack StreenghRune;
    public ItemStack StreenghRuneItem() {
        StreenghRune = new ItemStack(Material.PLAYER_HEAD,1);
        ItemMeta StreenghRuneMeta = StreenghRune.getItemMeta();
        StreenghRuneMeta.setDisplayName(ChatColor.GOLD + "Руны Силы");
        List<String> loreList = new ArrayList<>();
        loreList.add(ChatColor.GOLD + "Сила : " + ChatColor.RED + "+1");
        loreList.add("");
        loreList.add("" + ChatColor.GOLD + ChatColor.BOLD + "Легендарный");
        NamespacedKey RuneKey = new NamespacedKey((Plugin) this, "Rune");
        return StreenghRune;
    }

    public static ItemStack getAlchemyBottle() {
        ItemStack alchemyBottle = new ItemStack(Material.GLASS_BOTTLE,1);
        ItemMeta alchemyBottleMeta = alchemyBottle.getItemMeta();
        alchemyBottleMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Бутылка Алхимика");
        List<String> loreList = new ArrayList<>();
        loreList.add(ChatColor.LIGHT_PURPLE + "> Используется для создания");
        loreList.add(ChatColor.LIGHT_PURPLE + "  зелий у алхимика");
        loreList.add("");
        loreList.add("" + ChatColor.BLUE + ChatColor.BOLD + "Редкий");
        alchemyBottleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        alchemyBottleMeta.addEnchant(Enchantment.KNOCKBACK,1,false);
        alchemyBottleMeta.setLore(loreList);
        alchemyBottle.setItemMeta(alchemyBottleMeta);

        return alchemyBottle;
    }

    public static ItemStack getGorkayaSubstanstiya(){
        ItemStack gorkSubst = new ItemStack(Material.GLOWSTONE_DUST,1);
        ItemMeta gorkSubstMeta = gorkSubst.getItemMeta();
        gorkSubstMeta.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + "Горькая Субстанция");
        List<String> loreList = new ArrayList<>();
        loreList.add(ChatColor.LIGHT_PURPLE + "> Используется для создания");
        loreList.add(ChatColor.LIGHT_PURPLE + "Зелья Дурного Знамени");
        loreList.add("");
        loreList.add("" + ChatColor.BLUE + ChatColor.BOLD + "Редкий");
        gorkSubstMeta.setLore(loreList);
        gorkSubstMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        gorkSubstMeta.addEnchant(Enchantment.KNOCKBACK,1,false);

        gorkSubst.setItemMeta(gorkSubstMeta);
        return gorkSubst;
    }
}

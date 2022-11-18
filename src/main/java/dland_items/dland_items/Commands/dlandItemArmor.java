package dland_items.dland_items.Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class dlandItemArmor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("dlanditems.armor")) {
            Player player = (Player) sender;
            if (args[0].equalsIgnoreCase("tankarmor")) {
                ItemStack TankChestplate = new ItemStack(Material.IRON_CHESTPLATE,1);
                ItemMeta TankChestplateMeta = TankChestplate.getItemMeta();
                TankChestplateMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Chestplate");
                List<String> loreList = new ArrayList<>();
                loreList.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                loreList.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                loreList.add("");
                loreList.add(ChatColor.GOLD + "Способность : ");
                loreList.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                loreList.add("");
                loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                TankChestplateMeta.setLore(loreList);
                float tank_speed = -0.005f;
                TankChestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                TankChestplateMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                TankChestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                TankChestplate.setItemMeta(TankChestplateMeta);
                player.getInventory().addItem(TankChestplate);


                ItemStack TankLeggings = new ItemStack(Material.IRON_LEGGINGS,1);
                ItemMeta TankLeggingsMeta = TankLeggings.getItemMeta();
                TankLeggingsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Leggings");
                List<String> loreList2 = new ArrayList<>();
                loreList2.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                loreList2.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                loreList2.add("");
                loreList2.add(ChatColor.GOLD + "Способность : ");
                loreList2.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                loreList2.add("");
                loreList2.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                TankLeggingsMeta.setLore(loreList2);
                TankLeggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                TankLeggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                TankLeggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                TankLeggings.setItemMeta(TankLeggingsMeta);
                player.getInventory().addItem(TankLeggings);


                ItemStack TankBoots = new ItemStack(Material.IRON_BOOTS,1);
                ItemMeta TankBootsMeta = TankBoots.getItemMeta();
                TankBootsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Boots");
                List<String> loreList3 = new ArrayList<>();
                loreList3.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                loreList3.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                loreList3.add("");
                loreList3.add(ChatColor.GOLD + "Способность : ");
                loreList3.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                loreList3.add("");
                loreList3.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                TankBootsMeta.setLore(loreList3);
                TankBootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                TankBootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                TankBootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                TankBoots.setItemMeta(TankBootsMeta);
                player.getInventory().addItem(TankBoots);

                ItemStack TankHelmet = new ItemStack(Material.IRON_HELMET,1);
                ItemMeta TankHelmetMeta = TankHelmet.getItemMeta();
                TankHelmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Helmet");
                List<String> loreList4 = new ArrayList<>();
                loreList4.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                loreList4.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                loreList4.add("");
                loreList4.add(ChatColor.GOLD + "Способность : ");
                loreList4.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                loreList4.add("");
                loreList4.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                TankHelmetMeta.setLore(loreList4);
                TankHelmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                TankHelmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                TankHelmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                TankHelmet.setItemMeta(TankHelmetMeta);
                player.getInventory().addItem(TankHelmet);
                return true;
            }
        } else {
            sender.sendMessage("" + ChatColor.RED + "У вас нет прав на команду /dlia !");
            // now used 4 lorelists
        }
        return false;
    }
}

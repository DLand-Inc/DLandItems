package dland_items.dland_items.Items;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RuneEvent implements Listener {

    public static PotionEffect streengh = new PotionEffect(PotionEffectType.INCREASE_DAMAGE,100*10000,0);
    public static PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 100*10000,0);
    public static PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 100*10000,0);
    public static PotionEffect health_boost = new PotionEffect(PotionEffectType.HEALTH_BOOST, 100*10000, 0); // 3 Hearth
    public static PotionEffect night_vision = new PotionEffect(PotionEffectType.NIGHT_VISION,100*10000,220); // Full Vision
    @EventHandler
    public void onItemHoldGetEffect(PlayerItemHeldEvent event) {
        if (event.getPlayer().getInventory().getItem(event.getNewSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Силы")){
            event.getPlayer().addPotionEffect(streengh);
            event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Силы'");
        } else if (event.getPlayer().getInventory().getItem(event.getNewSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Скорости")){
            event.getPlayer().addPotionEffect(speed);
            event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Скорости'");
        } else if (event.getPlayer().getInventory().getItem(event.getNewSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Регенерации")){
            event.getPlayer().addPotionEffect(regen);
            event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Регенирации'");
        } else if (event.getPlayer().getInventory().getItem(event.getNewSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Здоровья")){
            event.getPlayer().addPotionEffect(health_boost);
            event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Здоровья'");
        } else if (event.getPlayer().getInventory().getItem(event.getNewSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Ночного-Виденья")){
            event.getPlayer().addPotionEffect(night_vision);
            event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Ночного-Виденья'");
        }
    }

    @EventHandler
    public void onItemHoldRemoveEffect(PlayerItemHeldEvent event) {
        if (event.getPlayer().getInventory().getItem(event.getPreviousSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Силы")){
            event.getPlayer().removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Силы' покинула вас");
        } else if (event.getPlayer().getInventory().getItem(event.getPreviousSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Скорости")){
            event.getPlayer().removePotionEffect(PotionEffectType.SPEED);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Скорости' покинула вас");
        } else if (event.getPlayer().getInventory().getItem(event.getPreviousSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Регенерации")){
            event.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Регенирации' покинула вас");
        } else if (event.getPlayer().getInventory().getItem(event.getPreviousSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Здоровья")){
            event.getPlayer().removePotionEffect(PotionEffectType.HEALTH_BOOST);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Здоровья' покинула вас");
        } else if (event.getPlayer().getInventory().getItem(event.getPreviousSlot()).getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Ночного-Виденья")){
            event.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Ночного виденья' покинула вас");
        }
    }

    @EventHandler
    public void onItemDropRemoveEffect(PlayerDropItemEvent event) {
        if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Силы")) {
            event.getPlayer().removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Силы' покинула вас");
        } else if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Скорости")) {
            event.getPlayer().removePotionEffect(PotionEffectType.SPEED);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Скорости' покинула вас");
        } else if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Регенерации")) {
            event.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Регенирации' покинула вас");
        } else if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Здоровья")) {
            event.getPlayer().removePotionEffect(PotionEffectType.HEALTH_BOOST);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Здоровья' покинула вас");
        } else if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Ночного-Виденья")) {
            event.getPlayer().removePotionEffect(PotionEffectType.NIGHT_VISION);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Ночного виденья' покинула вас");
        }
    }

    @EventHandler
    public void onArmorStandItemChange(PlayerArmorStandManipulateEvent event) {
        if (event.getPlayerItem().getItemMeta().getDisplayName().equals(org.bukkit.ChatColor.GOLD + "Руна Силы")) {
            event.getPlayer().removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
            event.getPlayer().sendMessage(ChatColor.RED + "Магия 'Руны Силы' покинула вас");
        }
    }


    @EventHandler
    public void onInventoryMoveItem(InventoryCloseEvent event) {
        String handItemName = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName();

    }
}

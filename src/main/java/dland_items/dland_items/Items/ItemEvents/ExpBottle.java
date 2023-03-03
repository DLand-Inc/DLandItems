package dland_items.dland_items.Items.ItemEvents;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExpBottle implements Listener {

    @EventHandler
    public void expBottle(PlayerInteractEvent e){
        if (e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[30LvL]")) {
                e.getPlayer().giveExp(1395);
                e.getPlayer().sendMessage(ChatColor.GREEN + "Вы успешно получили 30 лвл опыта :D");
            } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[50LvL]")) {
                e.getPlayer().giveExp(5345);
                e.getPlayer().sendMessage(ChatColor.GREEN + "Вы успешно получили 50 лвл опыта :D");
            } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[70LvL]")) {
                e.getPlayer().giveExp(12895);
                e.getPlayer().sendMessage(ChatColor.GREEN + "Вы успешно получили 70 лвл опыта :D");
            } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[100LvL]")) {
                e.getPlayer().giveExp(30970);
                e.getPlayer().sendMessage(ChatColor.GREEN + "Вы успешно получили 100 лвл опыта :D");
            }
        }
    }
}

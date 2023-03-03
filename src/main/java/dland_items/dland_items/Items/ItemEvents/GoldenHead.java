package dland_items.dland_items.Items.ItemEvents;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class GoldenHead implements Listener {

    @EventHandler
    public void rightClick(PlayerInteractEvent e){
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Золотая Голова")){
                e.getPlayer().setHealth(20);
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,200,0));

                    ItemStack GoldenHead = new ItemStack(Material.GOLDEN_APPLE, 1);
                    ItemMeta GoldenHeadMeta = GoldenHead.getItemMeta();
                if (GoldenHeadMeta != null) {
                    GoldenHeadMeta.setDisplayName(ChatColor.GOLD + "Золотая Голова");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Способность - ПКМ : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Регенерация");
                    loreList.add("");
                    loreList.add("" + ChatColor.GOLD + ChatColor.BOLD + "Легендарный");
                    GoldenHeadMeta.setLore(loreList);

                    GoldenHead.setItemMeta(GoldenHeadMeta);

                    e.getPlayer().getInventory().removeItem(GoldenHead);
                    e.getPlayer().sendMessage(ChatColor.GREEN + "Вы успешно воспользовались золотой головой! ");
                }
            }
        }
    }
}

package dland_items.dland_items.Items;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RuneEvent implements Listener {

    @EventHandler
    public void SwitchItemEvent(PlayerInteractEvent event){
        PersistentDataContainer data = event.getPlayer().getInventory().getItemInOffHand().getItemMeta().getPersistentDataContainer();
        NamespacedKey RuneKey = new NamespacedKey("rune", "rune");

        // Effects .                                                               1 second = duration:20
        PotionEffect streengh = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200,0);
        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 200,0);
        PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 200 ,0);
        PotionEffect health_boost = new PotionEffect(PotionEffectType.HEALTH_BOOST, 200, 0); // 3 Hearth
        PotionEffect night_vision = new PotionEffect(PotionEffectType.NIGHT_VISION,200,220); // Full Vision

        if (data.has(RuneKey, PersistentDataType.STRING)) {
            String rune_type = data.get(RuneKey, PersistentDataType.STRING);
            if (rune_type.equalsIgnoreCase("streengh")){
                event.getPlayer().addPotionEffect(streengh);
                event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Силы'. Когда он закончится просто нажмите ЛКМ.");
            } else if (rune_type.equalsIgnoreCase("speed")){
                event.getPlayer().addPotionEffect(speed);
                event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Скорости'. Когда он закончится просто нажмите ЛКМ.");
            } else if (rune_type.equalsIgnoreCase("regen")){
                event.getPlayer().addPotionEffect(regen);
                event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Регенирации'. Когда он закончится просто нажмите ЛКМ.");
            } else if (rune_type.equalsIgnoreCase("health_boost")){
                event.getPlayer().addPotionEffect(health_boost);
                event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Здоровья'. Когда он закончится просто нажмите ЛКМ.");
            } else if (rune_type.equalsIgnoreCase("night_vision")){
                event.getPlayer().addPotionEffect(night_vision);
                event.getPlayer().sendMessage(ChatColor.GREEN + "Вы получили эффект 'Руны Ночного-Виденья'. Когда он закончится просто нажмите ЛКМ.");
            }
        }
    }
}

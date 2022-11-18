package dland_items.dland_items.Mobs;

import dland_items.dland_items.DLand_Items;
import dland_items.dland_items.Items.Items;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class MobEvents implements Listener {
    private final NamespacedKey isRealKey;

    public MobEvents(DLand_Items plugin) {
        this.isRealKey = new NamespacedKey((Plugin) this, "isReal");
    }

    @EventHandler
    public void entitySpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof Zombie zombie) {
            if (Math.random() <= 0.02) {
                zombie.setCustomName("Tank Zombie");
                zombie.setGlowing(true);
                zombie.setMaxHealth(40);
                zombie.setHealth(40);
                zombie.getPersistentDataContainer().set(isRealKey, PersistentDataType.INTEGER, 1);
            }
        }
    }

    @EventHandler
    public void entityDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof Zombie zombie && zombie.getName().equals("Tank Zombie")) {
            if (zombie.getPersistentDataContainer().has(isRealKey, PersistentDataType.INTEGER)) {
                Player killer = zombie.getKiller();
                if (killer != null) {
                    killer.getInventory().addItem(Items.TankFragment);
                    killer.sendTitle("Вы убили Tank Zombie!","С него выпало 4 фрагмента");
                }
            }
        }
    }
}

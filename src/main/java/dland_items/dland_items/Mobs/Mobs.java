package dland_items.dland_items.Mobs;


import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.Plugin;

public class Mobs {
    // Tank Zombie
    public static Zombie TankZombie;
    private void TankZombieMethod() {
        TankZombie.setCustomName("Tank Zombie");
        TankZombie.setGlowing(true);
        TankZombie.setMaxHealth(40);
        TankZombie.setHealth(40);
    }
    public void TankZombie(EntitySpawnEvent event){
        Zombie TankZombie = (Zombie) event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.ZOMBIE);
        TankZombie.setCustomName("Tank Zombie");
        TankZombie.setGlowing(true);
        TankZombie.setMaxHealth(40);
        TankZombie.setHealth(40);
        NamespacedKey TankZombieKey = new NamespacedKey((Plugin) this, "isRealy");
    }
}

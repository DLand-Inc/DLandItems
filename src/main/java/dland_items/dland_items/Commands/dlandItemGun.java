package dland_items.dland_items.Commands;

import dland_items.dland_items.Guns.ArmsHandler;
import dland_items.dland_items.Guns.Gun;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dlandItemGun implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (args[1].equalsIgnoreCase("frozenscythe")) {
            Gun gun = Gun.valueOf("FROZEN_SCYTHE");
            ArmsHandler.handle(gun,player);
            return true;
        }
        return false;
    }
}

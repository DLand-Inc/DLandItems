package dland_items.dland_items.Completers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class dlandItemCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1){
            return List.of(
                "give"
            );
        } else if (args.length == 3){
            return List.of(
                "SharpSword",
                "LuckyPickaxe",
                "InfinyHoe",
                "HunterSword",
                "AdminSword",
                "AdminStick",
                "DLandList"
            );
        } else if (args.length == 4 && args[2].equalsIgnoreCase("dlandlist")) {
            return List.of(
                "List"
            );
        } else if (args.length == 5 && args[2].equalsIgnoreCase("dlandlist")) {
            return List.of(
                "RED",
                "BLUE"
            );
        }
        return null;
    }
}

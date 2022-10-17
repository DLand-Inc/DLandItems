package dland_items.dland_items.Commands;

import dland_items.dland_items.DLand_Items;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class dlandItem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = Bukkit.getPlayer(args[1]);
        if (sender.hasPermission("dlanditems.give")) {
            if (args[0].equals("give")) {
                if (args[2].equalsIgnoreCase("sharpsword")) {
                    ItemStack name = new ItemStack(Material.DIAMOND_SWORD, 1);
                    ItemStack SharpSword = new ItemStack(Material.DIAMOND_SWORD, 1);
                    ItemMeta SharpSwordMeta = SharpSword.getItemMeta();
                    SharpSwordMeta.setDisplayName(ChatColor.DARK_PURPLE + "SharpSword");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Урон : " + ChatColor.RED + "12");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• x1.7 Damage Booster");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                    SharpSwordMeta.setLore(loreList);
                    SharpSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    SharpSwordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    //                SharpSwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 7,true);
                    SharpSwordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("GENERIC_ATTACK_DAMAGE", 12, AttributeModifier.Operation.ADD_NUMBER));

                    SharpSword.setItemMeta(SharpSwordMeta);
                    player.getInventory().addItem(SharpSword);
                    return true;
                } else if (args[2].equalsIgnoreCase("luckypickaxe")) {
                    ItemStack LuckyPickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                    ItemMeta LuckyPickaxeMeta = LuckyPickaxe.getItemMeta();
                    LuckyPickaxeMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 7, true);
                    LuckyPickaxeMeta.setDisplayName(ChatColor.DARK_PURPLE + "LuckyPickaxe");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Удача : " + ChatColor.GREEN + "+7");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Удача VII");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "Эпический");
                    LuckyPickaxeMeta.setLore(loreList);
                    LuckyPickaxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    LuckyPickaxeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                    LuckyPickaxe.setItemMeta(LuckyPickaxeMeta);
                    player.getInventory().addItem(LuckyPickaxe);
                    return true;
                } else if (args[2].equalsIgnoreCase("infinyhoe")) {
                    ItemStack InfiniHoe = new ItemStack(Material.NETHERITE_HOE, 1);
                    ItemMeta InfiniHoeMeta = InfiniHoe.getItemMeta();
                    InfiniHoeMeta.setDisplayName(ChatColor.DARK_PURPLE + "Infiny-Hoe");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Урон : " + ChatColor.RED + "0");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Неразрушимость");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "Эпический");
                    InfiniHoeMeta.setLore(loreList);
                    InfiniHoeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    InfiniHoeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    InfiniHoeMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
                    InfiniHoeMeta.setUnbreakable(true);

                    InfiniHoe.setItemMeta(InfiniHoeMeta);
                    player.getInventory().addItem(InfiniHoe);
                    return true;
                } else if (args[2].equalsIgnoreCase("huntersword")) {
                    ItemStack HunterSword = new ItemStack(Material.DIAMOND_SWORD, 1);
                    ItemMeta HunterSwordMeta = HunterSword.getItemMeta();
                    HunterSwordMeta.setDisplayName(ChatColor.DARK_PURPLE + "Hunter's Sword");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Дроп Лута : " + ChatColor.DARK_AQUA + "+5");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Добыча V");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                    HunterSwordMeta.setLore(loreList);
                    HunterSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    HunterSwordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    HunterSwordMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS,5,true);

                    HunterSword.setItemMeta(HunterSwordMeta);
                    player.getInventory().addItem(HunterSword);
                    return true;
                } else if (args[2].equalsIgnoreCase("adminsword")) {
                    ItemStack AdminSword = new ItemStack(Material.NETHERITE_SWORD, 1);
                    ItemMeta AdminSwordMeta = AdminSword.getItemMeta();
                    AdminSwordMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Меч Админа");
                    AdminSwordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("GENERIC_ATTACK_DAMAGE", 1000, AttributeModifier.Operation.ADD_NUMBER));
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Урон : " + ChatColor.RED + ChatColor.BOLD + "1000");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Особенности : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Мгновенная Смерть");
                    loreList.add("");
                    loreList.add("" + ChatColor.RED + ChatColor.BOLD + "Админский");
                    AdminSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    AdminSwordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    AdminSwordMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
                    AdminSwordMeta.setLore(loreList);

                    AdminSword.setItemMeta(AdminSwordMeta);
                    if (player.hasPermission("dlanditems.admin")) {
                        player.getInventory().addItem(AdminSword);
                        return true;
                    } else {
                        sender.sendMessage(ChatColor.RED + "У выбранного игрока нет прав на хранение данного предмета");
                        return true;
                    }
                } else if (args[2].equalsIgnoreCase("adminstick")) {
                    ItemStack AdminStick = new ItemStack(Material.STICK, 1);
                    ItemMeta AdminStickMeta = AdminStick.getItemMeta();
                    AdminStickMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Палка Админа");
                    AdminStickMeta.addEnchant(Enchantment.KNOCKBACK, 1000, false);
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Откидывание : " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "1000");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Особенности : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Пукан в космос");
                    loreList.add("");
                    loreList.add("" + ChatColor.RED + ChatColor.BOLD + "Админский");
                    AdminStickMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    AdminStickMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    AdminStickMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
                    AdminStickMeta.setLore(loreList);

                    AdminStick.setItemMeta(AdminStickMeta);
                    if (player.hasPermission("dlanditems.admin")) {
                        player.getInventory().addItem(AdminStick);
                        return true;
                    } else {
                        sender.sendMessage(ChatColor.RED + "У выбранного игрока нет прав на хранение данного предмета");
                        return true;
                    }
                } else if (args[2].equalsIgnoreCase("dlandlist")) {
                    if (args.length >= 4) {
                        ItemStack DLandList = new ItemStack(Material.PAPER, 1);
                        ItemMeta DLandListMeta = DLandList.getItemMeta();
                        DLandListMeta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "D" + ChatColor.BLUE + ChatColor.BOLD + "Land");
                        List<String> loreList = new ArrayList<>();
                        if (args.length == 5) {
                            if (args[4].equalsIgnoreCase("red")) {
                                loreList.add(ChatColor.RED + args[3]);
                            } else if (args[4].equalsIgnoreCase("blue")){
                                loreList.add(ChatColor.BLUE + args[3]);
                            }
                        } else {
                            loreList.add(args[3]);
                        }
                        loreList.add(ChatColor.DARK_GRAY + "Создано админом DLand");
                        DLandListMeta.setLore(loreList);
                        DLandList.setItemMeta(DLandListMeta);

                        if (player.hasPermission("dlanditems.admin")){
                            player.getInventory().addItem(DLandList);
                            return true;
                        } else {
                            sender.sendMessage(ChatColor.RED + "У выбранного игрока нет прав на хранение данного предмета");
                            return true;
                        }
                    } else {
                        sender.sendMessage(ChatColor.RED + "Вы не указали описание предмета (после DLandList)!");
                        return true;
                    }
                }
            }
        } else {
            player.sendMessage(ChatColor.RED + "У вас нет прав, для использования DLand Items -> Give");
            return true;
        }
        return false;
    }
}

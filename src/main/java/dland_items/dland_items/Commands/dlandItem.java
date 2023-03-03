package dland_items.dland_items.Commands;

import dland_items.dland_items.DLand_Items;
import dland_items.dland_items.Items.Items;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

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
                } else if (args[2].equalsIgnoreCase("tankchestplate")) {
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
                    return true;
                } else if (args[2].equalsIgnoreCase("tankleggings")) {
                    ItemStack TankLeggings = new ItemStack(Material.IRON_LEGGINGS,1);
                    ItemMeta TankLeggingsMeta = TankLeggings.getItemMeta();
                    TankLeggingsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Leggings");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                    loreList.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                    TankLeggingsMeta.setLore(loreList);
                    float tank_speed = -0.005f;
                    TankLeggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                    TankLeggingsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                    TankLeggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    TankLeggings.setItemMeta(TankLeggingsMeta);
                    player.getInventory().addItem(TankLeggings);
                    return true;
                } else if (args[2].equalsIgnoreCase("tankboots")) {
                    ItemStack TankBoots = new ItemStack(Material.IRON_BOOTS,1);
                    ItemMeta TankBootsMeta = TankBoots.getItemMeta();
                    TankBootsMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Boots");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                    loreList.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                    TankBootsMeta.setLore(loreList);
                    float tank_speed = -0.005f;
                    TankBootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                    TankBootsMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                    TankBootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    TankBoots.setItemMeta(TankBootsMeta);
                    player.getInventory().addItem(TankBoots);
                    return true;
                } else if (args[2].equalsIgnoreCase("tankhelmet")) {
                    ItemStack TankHelmet = new ItemStack(Material.IRON_HELMET,1);
                    ItemMeta TankHelmetMeta = TankHelmet.getItemMeta();
                    TankHelmetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Helmet");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.RED + "Здоровье : " + ChatColor.RED + "+2");
                    loreList.add(ChatColor.GOLD + "Скорость : " + ChatColor.WHITE + "-1");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Способность : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "• Запас Здоровья II");
                    loreList.add("");
                    loreList.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Эпический");
                    TankHelmetMeta.setLore(loreList);
                    float tank_speed = -0.005f;
                    TankHelmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_MOVEMENT_SPEED", tank_speed, AttributeModifier.Operation.ADD_NUMBER));
                    TankHelmetMeta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("GENERIC_MAX_HELTH", 4, AttributeModifier.Operation.ADD_NUMBER));
                    TankHelmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    TankHelmet.setItemMeta(TankHelmetMeta);
                    player.getInventory().addItem(TankHelmet);
                    return true;
                } else if (args[2].equalsIgnoreCase("streenghrune")){
                    ItemStack StreenghRune = new ItemStack(Material.FIREWORK_STAR,1);
                    ItemMeta StreenghRuneMeta = StreenghRune.getItemMeta();
                    StreenghRuneMeta.setDisplayName(org.bukkit.ChatColor.GOLD + "Руна Силы");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(org.bukkit.ChatColor.GOLD + "Сила : " + org.bukkit.ChatColor.RED + "+1");
                    loreList.add("");
                    loreList.add("" + org.bukkit.ChatColor.GOLD + org.bukkit.ChatColor.BOLD + "Легендарный");
                    StreenghRuneMeta.setLore(loreList);
                    NamespacedKey RuneKey = new NamespacedKey("rune", "rune");
                    StreenghRuneMeta.getPersistentDataContainer().set(RuneKey, PersistentDataType.STRING, "streengh");
                    StreenghRune.setItemMeta(StreenghRuneMeta);
                    player.getInventory().addItem(StreenghRune);
                    return true;
                } else if (args[2].equalsIgnoreCase("healthrune")){
                    ItemStack HealthRune = new ItemStack(Material.FIREWORK_STAR,1);
                    ItemMeta HealthRuneMeta = HealthRune.getItemMeta();
                    HealthRuneMeta.setDisplayName(org.bukkit.ChatColor.GOLD + "Руна Здоровья");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(org.bukkit.ChatColor.GOLD + "Здоровье : " + org.bukkit.ChatColor.RED + "+3");
                    loreList.add("");
                    loreList.add("" + org.bukkit.ChatColor.GOLD + org.bukkit.ChatColor.BOLD + "Легендарный");
                    HealthRuneMeta.setLore(loreList);
                    NamespacedKey RuneKey = new NamespacedKey("rune", "rune");
                    HealthRuneMeta.getPersistentDataContainer().set(RuneKey, PersistentDataType.STRING, "health_boost");
                    HealthRune.setItemMeta(HealthRuneMeta);
                    player.getInventory().addItem(HealthRune);
                    return true;
                } else if (args[2].equalsIgnoreCase("regenrune")){
                    ItemStack RegenRune = new ItemStack(Material.FIREWORK_STAR,1);
                    ItemMeta RegenRuneMeta = RegenRune.getItemMeta();
                    RegenRuneMeta.setDisplayName(org.bukkit.ChatColor.GOLD + "Руна Регенерации");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(org.bukkit.ChatColor.GOLD + "Регенерация : " + org.bukkit.ChatColor.RED + "+1");
                    loreList.add("");
                    loreList.add("" + org.bukkit.ChatColor.GOLD + org.bukkit.ChatColor.BOLD + "Легендарный");
                    RegenRuneMeta.setLore(loreList);
                    NamespacedKey RuneKey = new NamespacedKey("rune", "rune");
                    RegenRuneMeta.getPersistentDataContainer().set(RuneKey, PersistentDataType.STRING, "regen");
                    RegenRune.setItemMeta(RegenRuneMeta);
                    player.getInventory().addItem(RegenRune);
                    return true;
                } else if (args[2].equalsIgnoreCase("speedrune")){
                    ItemStack SpeedRune = new ItemStack(Material.FIREWORK_STAR,1);
                    ItemMeta SpeedRuneMeta = SpeedRune.getItemMeta();
                    SpeedRuneMeta.setDisplayName(org.bukkit.ChatColor.GOLD + "Руна Скорости");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(org.bukkit.ChatColor.GOLD + "Скорость : " + org.bukkit.ChatColor.GREEN + "+1");
                    loreList.add("");
                    loreList.add("" + org.bukkit.ChatColor.GOLD + org.bukkit.ChatColor.BOLD + "Легендарный");
                    SpeedRuneMeta.setLore(loreList);
                    NamespacedKey RuneKey = new NamespacedKey("rune", "rune");
                    SpeedRuneMeta.getPersistentDataContainer().set(RuneKey, PersistentDataType.STRING, "speed");
                    SpeedRune.setItemMeta(SpeedRuneMeta);
                    player.getInventory().addItem(SpeedRune);
                    return true;
                } else if (args[2].equalsIgnoreCase("nightvisionrune")){
                    ItemStack NightVisionRune = new ItemStack(Material.FIREWORK_STAR,1);
                    ItemMeta NightVisionRuneMeta = NightVisionRune.getItemMeta();
                    NightVisionRuneMeta.setDisplayName(org.bukkit.ChatColor.GOLD + "Руна Ночного-Виденья");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(org.bukkit.ChatColor.GOLD + "Ночное-Виденье : " + org.bukkit.ChatColor.YELLOW + "ON");
                    loreList.add("");
                    loreList.add("" + org.bukkit.ChatColor.GOLD + org.bukkit.ChatColor.BOLD + "Легендарный");
                    NightVisionRuneMeta.setLore(loreList);
                    NamespacedKey RuneKey = new NamespacedKey("rune", "rune");
                    NightVisionRuneMeta.getPersistentDataContainer().set(RuneKey, PersistentDataType.STRING, "night_vision");
                    NightVisionRune.setItemMeta(NightVisionRuneMeta);
                    player.getInventory().addItem(NightVisionRune);
                    return true;
                } else if (args[2].equalsIgnoreCase("goldenhead")) {
                    ItemStack GoldenHead = new ItemStack(Material.GOLDEN_APPLE,1);
                    ItemMeta GoldenHeadMeta = GoldenHead.getItemMeta();
                    GoldenHeadMeta.setDisplayName(ChatColor.GOLD + "Золотая Голова");
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Способность - ПКМ : ");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Регенерация");
                    loreList.add("");
                    loreList.add("" + ChatColor.GOLD + ChatColor.BOLD + "Легендарный");
                    GoldenHeadMeta.setLore(loreList);


                    GoldenHead.setItemMeta(GoldenHeadMeta);
                    player.getInventory().addItem(GoldenHead);
                    return true;
                }  else if (args[2].equalsIgnoreCase("exp30")) {
                    if (player.getTotalExperience() >= 1395){
                        player.giveExp(-1395);
                        player.sendMessage(ChatColor.GREEN + "Вы успешно поместили 30 лвл в бутылёк! ");
                        ItemStack exp30 = new ItemStack(Material.EXPERIENCE_BOTTLE,1);
                        ItemMeta exp30Meta = exp30.getItemMeta();
                        exp30Meta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[30LvL]");
                        List<String> loreList = new ArrayList<>();
                        loreList.add(ChatColor.LIGHT_PURPLE + "Просто киньте под себя и получите +30 лвл");
                        loreList.add(ChatColor.DARK_GRAY + "Работает только в основной руке!!!");
                        loreList.add("");
                        loreList.add("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Эпический");
                        exp30Meta.setLore(loreList);

                        exp30.setItemMeta(exp30Meta);
                        player.getInventory().addItem(exp30);
                    } else {
                        player.sendMessage(ChatColor.RED + "У вас недостаточно опыта :<");
                    }
                    return true;
                } else if (args[2].equalsIgnoreCase("exp50")) {
                    if (player.getTotalExperience() >= 5345){
                        player.giveExp(-5345);
                        player.sendMessage(ChatColor.GREEN + "Вы успешно поместили 50 лвл в бутылёк! ");
                        ItemStack exp30 = new ItemStack(Material.EXPERIENCE_BOTTLE,1);
                        ItemMeta exp30Meta = exp30.getItemMeta();
                        exp30Meta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[50LvL]");
                        List<String> loreList = new ArrayList<>();
                        loreList.add(ChatColor.LIGHT_PURPLE + "Просто киньте под себя и получите +50 лвл");
                        loreList.add(ChatColor.DARK_GRAY + "Работает только в основной руке!!!");
                        loreList.add("");
                        loreList.add("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Эпический");
                        exp30Meta.setLore(loreList);

                        exp30.setItemMeta(exp30Meta);
                        player.getInventory().addItem(exp30);
                    } else {
                        player.sendMessage(ChatColor.RED + "У вас недостаточно опыта :<");
                    }
                    return true;
                } else if (args[2].equalsIgnoreCase("exp70")) {
                    if (player.getTotalExperience() >= 12895){
                        player.giveExp(-12895);
                        player.sendMessage(ChatColor.GREEN + "Вы успешно поместили 70 лвл в бутылёк! ");
                        ItemStack exp30 = new ItemStack(Material.EXPERIENCE_BOTTLE,1);
                        ItemMeta exp30Meta = exp30.getItemMeta();
                        exp30Meta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[750LvL]");
                        List<String> loreList = new ArrayList<>();
                        loreList.add(ChatColor.LIGHT_PURPLE + "Просто киньте под себя и получите +70 лвл");
                        loreList.add(ChatColor.DARK_GRAY + "Работает только в основной руке!!!");
                        loreList.add("");
                        loreList.add("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Эпический");
                        exp30Meta.setLore(loreList);

                        exp30.setItemMeta(exp30Meta);
                        player.getInventory().addItem(exp30);
                    } else {
                        player.sendMessage(ChatColor.RED + "У вас недостаточно опыта :<");
                    }
                    return true;
                } else if (args[2].equalsIgnoreCase("exp100")) {
                    if (player.getTotalExperience() >= 30970){
                        player.giveExp(-30970);
                        player.sendMessage(ChatColor.GREEN + "Вы успешно поместили 100 лвл в бутылёк! ");
                        ItemStack exp30 = new ItemStack(Material.EXPERIENCE_BOTTLE,1);
                        ItemMeta exp30Meta = exp30.getItemMeta();
                        exp30Meta.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Бутылёк опыта " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "[100LvL]");
                        List<String> loreList = new ArrayList<>();
                        loreList.add(ChatColor.LIGHT_PURPLE + "Просто киньте под себя и получите +100 лвл");
                        loreList.add(ChatColor.DARK_GRAY + "Работает только в основной руке!!!");
                        loreList.add("");
                        loreList.add("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Эпический");
                        exp30Meta.setLore(loreList);

                        exp30.setItemMeta(exp30Meta);
                        player.getInventory().addItem(exp30);
                    } else {
                        player.sendMessage(ChatColor.RED + "У вас недостаточно опыта :<");
                    }
                    return true;
                } else if (args[2].equalsIgnoreCase("badomen_potion")) {
                    if (player.getInventory().containsAtLeast(Items.getGorkayaSubstanstiya(),2)) {
                        player.getInventory().removeItem(Items.getAlchemyBottle());
                        player.getInventory().removeItem(Items.getGorkayaSubstanstiya());
                        player.getInventory().removeItem(Items.getGorkayaSubstanstiya());
                        player.sendMessage("Типа всё усшепно ._.");

                    } else {
                        player.sendMessage(ChatColor.RED + "У вас нет необходимых ингредиентов! ");
                    }
                    return true;
                } else if (args[2].equalsIgnoreCase("fastpickaxe")) {
                    ItemStack a = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                    ItemMeta aM = a.getItemMeta();
                    aM.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Я ЕСТЬ СКОРОСТЬ!!!");
                    aM.addEnchant(Enchantment.DIG_SPEED, 6,true);
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Эффективность : " + ChatColor.DARK_AQUA + "+6");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Особенность");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Моментальное разрушение");
                    loreList.add(ChatColor.LIGHT_PURPLE + "  камня");
                    loreList.add("");
                    loreList.add("" + ChatColor.GOLD + ChatColor.BOLD + "Легендарный");
                    aM.setLore(loreList);
                    aM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    a.setItemMeta(aM);
                    player.getInventory().addItem(a);
                    return true;
                } else if (args[2].equalsIgnoreCase("fastaxe")) {
                    ItemStack a = new ItemStack(Material.DIAMOND_AXE, 1);
                    ItemMeta aM = a.getItemMeta();
                    aM.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Я ЕСТЬ СКОРОСТЬ!!!");
                    aM.addEnchant(Enchantment.DIG_SPEED, 7,true);
                    List<String> loreList = new ArrayList<>();
                    loreList.add(ChatColor.GOLD + "Эффективность : " + ChatColor.DARK_AQUA + "+7");
                    loreList.add("");
                    loreList.add(ChatColor.GOLD + "Особенность");
                    loreList.add(ChatColor.LIGHT_PURPLE + "· Быстрое разрушение");
                    loreList.add(ChatColor.LIGHT_PURPLE + "  древесины");
                    loreList.add("");
                    loreList.add("" + ChatColor.GOLD + ChatColor.BOLD + "Легендарный");
                    aM.setLore(loreList);
                    aM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    a.setItemMeta(aM);

                    player.getInventory().addItem(a);
                    return true;
                }
            }
        } else {
            player.sendMessage(ChatColor.RED + "У вас нет прав, для использования DLand Items -> Give");
            return true;
        }
        return false;
    }
}

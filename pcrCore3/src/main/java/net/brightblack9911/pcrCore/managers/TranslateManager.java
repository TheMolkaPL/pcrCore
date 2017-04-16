package net.brightblack9911.pcrCore.managers;

import java.util.Map;

import org.bukkit.Material;

import com.google.common.collect.Maps;

public class TranslateManager
{
	private static TranslateManager instance;

	private final Map<Material, String> TRANSLATIONS = Maps.newHashMap();

	public TranslateManager() {
		loadTranslations();
	}
	
	public void addTranslate(Material m, String s) {
		TRANSLATIONS.put(m, s);
	}

	public void loadTranslations() {
		addTranslate(Material.AIR, "Lapka");
		addTranslate(Material.STONE, "Kamien");
		addTranslate(Material.GRASS, "Bloki trawy");
		addTranslate(Material.DIRT, "Ziemia");
		addTranslate(Material.COBBLESTONE, "Bruk");
		addTranslate(Material.WOOD, "Deski");
		addTranslate(Material.SAPLING, "Sadzonka");
		addTranslate(Material.BEDROCK, "Bedrock");
		addTranslate(Material.WATER, "Woda");
		addTranslate(Material.STATIONARY_WATER, "Woda");
		addTranslate(Material.LAVA, "Lawa");
		addTranslate(Material.STATIONARY_LAVA, "Lawa");
		addTranslate(Material.SAND, "Piasek");
		addTranslate(Material.GRAVEL, "Zwir");
		addTranslate(Material.GOLD_ORE, "Ruda zlota");
		addTranslate(Material.IRON_ORE, "Ruda zelaza");
		addTranslate(Material.COAL_ORE, "Ruda wegla");
		addTranslate(Material.LOG, "Drewno");
		addTranslate(Material.LEAVES, "Liscie");
		addTranslate(Material.SPONGE, "Gabka");
		addTranslate(Material.GLASS, "Szklo");
		addTranslate(Material.LAPIS_ORE, "Ruda lipisu");
		addTranslate(Material.LAPIS_BLOCK, "Blok lapisu");
		addTranslate(Material.DISPENSER, "Dozownik");
		addTranslate(Material.SANDSTONE, "Pisakowiec");
		addTranslate(Material.NOTE_BLOCK, "Note block");
		addTranslate(Material.BED_BLOCK, "Lozko");
		addTranslate(Material.POWERED_RAIL, "Zasilane tory");
		addTranslate(Material.DETECTOR_RAIL, "Tory z czujnikiem");
		addTranslate(Material.PISTON_STICKY_BASE, "Tlok");
		addTranslate(Material.WEB, "Pajeczyna");
		addTranslate(Material.LONG_GRASS, "Trawa");
		addTranslate(Material.DEAD_BUSH, "Uschneity krzak");
		addTranslate(Material.PISTON_BASE, "Tlok");
		addTranslate(Material.PISTON_EXTENSION, "Tlok");
		addTranslate(Material.WOOL, "Welna");
		addTranslate(Material.PISTON_MOVING_PIECE, "Tlok");
		addTranslate(Material.YELLOW_FLOWER, "Tulipan");
		addTranslate(Material.RED_ROSE, "Roza");
		addTranslate(Material.BROWN_MUSHROOM, "Brazowy grzyb");
		addTranslate(Material.RED_MUSHROOM, "Muchomor");
		addTranslate(Material.GOLD_BLOCK, "Blok zlota");
		addTranslate(Material.IRON_BLOCK, "Blok zelaza");
		addTranslate(Material.DOUBLE_STEP, "Podwojna polplytka");
		addTranslate(Material.STEP, "Polplytka");
		addTranslate(Material.BRICK, "Cegly");
		addTranslate(Material.TNT, "Tnt");
		addTranslate(Material.BOOKSHELF, "Biblioteczka");
		addTranslate(Material.MOSSY_COBBLESTONE, "Zamszony bruk");
		addTranslate(Material.OBSIDIAN, "Obsydian");
		addTranslate(Material.TORCH, "Pochodnia");
		addTranslate(Material.FIRE, "Ogien");
		addTranslate(Material.MOB_SPAWNER, "Mob spawner");
		addTranslate(Material.WOOD_STAIRS, "Drewniane schodki");
		addTranslate(Material.CHEST, "Skrzynia");
		addTranslate(Material.REDSTONE_WIRE, "Redstone");
		addTranslate(Material.DIAMOND_ORE, "Ruda diamentu");
		addTranslate(Material.DIAMOND_BLOCK, "Blok diamentu");
		addTranslate(Material.WORKBENCH, "Stol rzemieslniczy");
		addTranslate(Material.CROPS, "Nasionka");
		addTranslate(Material.SOIL, "Nasionka");
		addTranslate(Material.FURNACE, "Piecyk");
		addTranslate(Material.BURNING_FURNACE, "Piecyk");
		addTranslate(Material.SIGN_POST, "Tabliczka");
		addTranslate(Material.WOODEN_DOOR, "Drewniane drzwi");
		addTranslate(Material.LADDER, "Drabinka");
		addTranslate(Material.RAILS, "Tory");
		addTranslate(Material.COBBLESTONE_STAIRS, "brukowe schody");
		addTranslate(Material.WALL_SIGN, "Tabliczka");
		addTranslate(Material.LEVER, "Dzwignia");
		addTranslate(Material.STONE_PLATE, "Plytka naciskowa");
		addTranslate(Material.IRON_DOOR_BLOCK, "Zelazne drzwi");
		addTranslate(Material.WOOD_PLATE, "Plytka nasickowa");
		addTranslate(Material.REDSTONE_ORE, "Ruda redstone");
		addTranslate(Material.GLOWING_REDSTONE_ORE, "Ruda redstone");
		addTranslate(Material.REDSTONE_TORCH_OFF, "Czerwona pochodnia");
		addTranslate(Material.REDSTONE_TORCH_ON, "Czerwona pochodnia");
		addTranslate(Material.STONE_BUTTON, "Kamienny przycisk");
		addTranslate(Material.SNOW, "Snieg");
		addTranslate(Material.ICE, "Lod");
		addTranslate(Material.SNOW_BLOCK, "Snieg");
		addTranslate(Material.CACTUS, "Kaktus");
		addTranslate(Material.CLAY, "Glina");
		addTranslate(Material.SUGAR_CANE_BLOCK, "Trzcina");
		addTranslate(Material.JUKEBOX, "Szafa grajaca");
		addTranslate(Material.FENCE, "Plotek");
		addTranslate(Material.PUMPKIN, "Dynia");
		addTranslate(Material.NETHERRACK, "Netherrack");
		addTranslate(Material.SOUL_SAND, "Pisaek dusz");
		addTranslate(Material.GLOWSTONE, "Jasnoglaz");
		addTranslate(Material.PORTAL, "Portal");
		addTranslate(Material.JACK_O_LANTERN, "Jack'o'latern");
		addTranslate(Material.CAKE_BLOCK, "Ciasto");
		addTranslate(Material.DIODE_BLOCK_OFF, "Przekaznik");
		addTranslate(Material.DIODE_BLOCK_ON, "Przekaznik");
		addTranslate(Material.STAINED_GLASS, "Utwardzone szklo");
		addTranslate(Material.TRAP_DOOR, "Wlaz");
		addTranslate(Material.MONSTER_EGGS, "Jajko potwora");
		addTranslate(Material.SMOOTH_BRICK, "Cegly");
		addTranslate(Material.HUGE_MUSHROOM_1, "Duzy grzyb");
		addTranslate(Material.HUGE_MUSHROOM_2, "Duzy grzyb");
		addTranslate(Material.IRON_FENCE, "Kraty");
		addTranslate(Material.THIN_GLASS, "Szyba");
		addTranslate(Material.MELON_BLOCK, "Arbuz");
		addTranslate(Material.PUMPKIN_STEM, "Dynia");
		addTranslate(Material.MELON_STEM, "Arbuz");
		addTranslate(Material.VINE, "Pnacze");
		addTranslate(Material.FENCE_GATE, "Furtka");
		addTranslate(Material.BRICK_STAIRS, "Ceglane schodki");
		addTranslate(Material.SMOOTH_STAIRS, "Kamienne schodki");
		addTranslate(Material.MYCEL, "Grzybnia");
		addTranslate(Material.WATER_LILY, "Lilia wodna");
		addTranslate(Material.NETHER_BRICK, "Cegly netherowe");
		addTranslate(Material.NETHER_FENCE, "Netherowy plotek");
		addTranslate(Material.NETHER_BRICK_STAIRS, "Netherowe schodki");
		addTranslate(Material.NETHER_WARTS, "Brodawki");
		addTranslate(Material.ENCHANTMENT_TABLE, "Stol do enchantu");
		addTranslate(Material.BREWING_STAND, "Stol alchemiczny");
		addTranslate(Material.CAULDRON, "Kociol");
		addTranslate(Material.ENDER_PORTAL, "Ender portal");
		addTranslate(Material.ENDER_PORTAL_FRAME, "Ender portal");
		addTranslate(Material.ENDER_STONE, "Kamien kresu");
		addTranslate(Material.DRAGON_EGG, "Jajko smoka");
		addTranslate(Material.REDSTONE_LAMP_OFF, "Lampa");
		addTranslate(Material.REDSTONE_LAMP_ON, "Lampa");
		addTranslate(Material.WOOD_DOUBLE_STEP, "Podwojna drewniana polplytka");
		addTranslate(Material.WOOD_STEP, "Drewnania polplytka");
		addTranslate(Material.COCOA, "Kakao");
		addTranslate(Material.SANDSTONE_STAIRS, "Piaskowe schodki");
		addTranslate(Material.EMERALD_ORE, "Ruda szmaragdu");
		addTranslate(Material.ENDER_CHEST, "Skrzynia kresu");
		addTranslate(Material.TRIPWIRE_HOOK, "Potykacz");
		addTranslate(Material.TRIPWIRE, "Potykacz");
		addTranslate(Material.EMERALD_BLOCK, "Blok szmaragdu");
		addTranslate(Material.SPRUCE_WOOD_STAIRS, "Drewniane schodki");
		addTranslate(Material.BIRCH_WOOD_STAIRS, "Drewniane schodki");
		addTranslate(Material.JUNGLE_WOOD_STAIRS, "Drewniane schodki");
		addTranslate(Material.COMMAND, "Blok polecen");
		addTranslate(Material.BEACON, "Magiczna latarnia");
		addTranslate(Material.COBBLE_WALL, "Brukowy plotek");
		addTranslate(Material.FLOWER_POT, "Doniczka");
		addTranslate(Material.CARROT, "Marchewka");
		addTranslate(Material.POTATO, "Ziemniak");
		addTranslate(Material.WOOD_BUTTON, "drewniany przycisk");
		addTranslate(Material.SKULL, "Glowa");
		addTranslate(Material.ANVIL, "Kowadlo");
		addTranslate(Material.TRAPPED_CHEST, "Skrzynka z pulapka");
		addTranslate(Material.GOLD_PLATE, "Zlota polplytka");
		addTranslate(Material.IRON_PLATE, "Zelaza polplytka");
		addTranslate(Material.REDSTONE_COMPARATOR_OFF, "Komparator");
		addTranslate(Material.REDSTONE_COMPARATOR_ON, "Komparator");
		addTranslate(Material.DAYLIGHT_DETECTOR, "Detektor swiatla dziennego");
		addTranslate(Material.REDSTONE_BLOCK, "Blok redstone");
		addTranslate(Material.QUARTZ_ORE, "Ruda kwarcu");
		addTranslate(Material.HOPPER, "Lej");
		addTranslate(Material.QUARTZ_BLOCK, "Blok kwarcu");
		addTranslate(Material.QUARTZ_STAIRS, "Lwarcowe schodki");
		addTranslate(Material.ACTIVATOR_RAIL, "Tory aktywacyjne");
		addTranslate(Material.DROPPER, "Podajnik");
		addTranslate(Material.STAINED_CLAY, "Utwardzona glina");
		addTranslate(Material.STAINED_GLASS_PANE, "Utwardzona szyba");
		addTranslate(Material.LEAVES_2, "Liscie");
		addTranslate(Material.LOG_2, "Drewno");
		addTranslate(Material.ACACIA_STAIRS, "Drewniane schodki");
		addTranslate(Material.DARK_OAK_STAIRS, "Drewniane schodki");
		addTranslate(Material.HAY_BLOCK, "Sloma");
		addTranslate(Material.CARPET, "Dywan");
		addTranslate(Material.HARD_CLAY, "Glina");
		addTranslate(Material.COAL_BLOCK, "Blok wegla");
		addTranslate(Material.PACKED_ICE, "Utwardzony lod");
		addTranslate(Material.DOUBLE_PLANT, "Sadzonka");
		addTranslate(Material.IRON_SPADE, "Zelazna lopata");
		addTranslate(Material.IRON_PICKAXE, "Zelazny kilof");
		addTranslate(Material.IRON_AXE, "Zelazna siekiera");
		addTranslate(Material.FLINT_AND_STEEL, "Zapalniczka");
		addTranslate(Material.APPLE, "Jablko");
		addTranslate(Material.BOW, "Luk");
		addTranslate(Material.ARROW, "Strzala");
		addTranslate(Material.COAL, "Wegiel");
		addTranslate(Material.DIAMOND, "Diament");
		addTranslate(Material.IRON_INGOT, "Sztabka zelaza");
		addTranslate(Material.GOLD_INGOT, "Sztabka zlota");
		addTranslate(Material.IRON_SWORD, "Zelazny miecz");
		addTranslate(Material.WOOD_SWORD, "Drewniany miecz");
		addTranslate(Material.WOOD_SPADE, "Drewniana lopata");
		addTranslate(Material.WOOD_PICKAXE, "Drewniany kilof");
		addTranslate(Material.WOOD_AXE, "Drewnania siekiera");
		addTranslate(Material.STONE_SWORD, "Kamienny miecz");
		addTranslate(Material.STONE_SPADE, "Kamienna lopata");
		addTranslate(Material.STONE_PICKAXE, "Kamienny kilof");
		addTranslate(Material.STONE_AXE, "Kamienna siekiera");
		addTranslate(Material.DIAMOND_SWORD, "Diamentowy miecz");
		addTranslate(Material.DIAMOND_SPADE, "Diamentowa lopata");
		addTranslate(Material.DIAMOND_PICKAXE, "Diamentowy kilof");
		addTranslate(Material.DIAMOND_AXE, "Diamentowa siekiera");
		addTranslate(Material.STICK, "Patyk");
		addTranslate(Material.BOWL, "Miseczka");
		addTranslate(Material.MUSHROOM_SOUP, "Zupa grzybowa");
		addTranslate(Material.GOLD_SWORD, "Zloty miecz");
		addTranslate(Material.GOLD_SPADE, "Zlota lopata");
		addTranslate(Material.GOLD_PICKAXE, "Zloty kilof");
		addTranslate(Material.GOLD_AXE, "Zlota siekiera");
		addTranslate(Material.STRING, "Nitka");
		addTranslate(Material.FEATHER, "Pioro");
		addTranslate(Material.SULPHUR, "Proch strzelniczy");
		addTranslate(Material.WOOD_HOE, "Drewniana motyka");
		addTranslate(Material.STONE_HOE, "Kamienna motyka");
		addTranslate(Material.IRON_HOE, "Zelazna motyka");
		addTranslate(Material.DIAMOND_HOE, "Diemtnowa motyka");
		addTranslate(Material.GOLD_HOE, "Zlota motyka");
		addTranslate(Material.SEEDS, "Nasionka");
		addTranslate(Material.WHEAT, "Pszenica");
		addTranslate(Material.BREAD, "Chleb");
		addTranslate(Material.LEATHER_HELMET, "Skorzany helm");
		addTranslate(Material.LEATHER_CHESTPLATE, "Skorzana klata");
		addTranslate(Material.LEATHER_LEGGINGS, "Skorzane spodnie");
		addTranslate(Material.LEATHER_BOOTS, "Skorzane buty");
		addTranslate(Material.CHAINMAIL_HELMET, "Helm z kolcza");
		addTranslate(Material.CHAINMAIL_CHESTPLATE, "Klata z kolcza");
		addTranslate(Material.CHAINMAIL_LEGGINGS, "Spodnie z kolcza");
		addTranslate(Material.CHAINMAIL_BOOTS, "Buty z kolcza");
		addTranslate(Material.IRON_HELMET, "Zelazny helm");
		addTranslate(Material.IRON_CHESTPLATE, "Zelazna klata");
		addTranslate(Material.IRON_LEGGINGS, "Zelazne spodnie");
		addTranslate(Material.IRON_BOOTS, "Zelazne buty");
		addTranslate(Material.DIAMOND_HELMET, "Diamentowy helm");
		addTranslate(Material.DIAMOND_CHESTPLATE, "Diamentowa klata");
		addTranslate(Material.DIAMOND_LEGGINGS, "Diamentowe spodnie");
		addTranslate(Material.DIAMOND_BOOTS, "Diamentowe buty");
		addTranslate(Material.GOLD_HELMET, "Zloty helm");
		addTranslate(Material.GOLD_CHESTPLATE, "Zlota klata");
		addTranslate(Material.GOLD_LEGGINGS, "Zlote spodnie");
		addTranslate(Material.GOLD_BOOTS, "Zlote buty");
		addTranslate(Material.FLINT, "Krzemien");
		addTranslate(Material.PORK, "Schab");
		addTranslate(Material.GRILLED_PORK, "Pieczony schab");
		addTranslate(Material.PAINTING, "Obraz");
		addTranslate(Material.GOLDEN_APPLE, "Zlote jablko");
		addTranslate(Material.SIGN, "Znak");
		addTranslate(Material.WOOD_DOOR, "Drewniane drzwi");
		addTranslate(Material.BUCKET, "Wiaderko");
		addTranslate(Material.WATER_BUCKET, "Wiaderko wody");
		addTranslate(Material.LAVA_BUCKET, "Wiaderko lawy");
		addTranslate(Material.MINECART, "Wagonik");
		addTranslate(Material.SADDLE, "Siodlo");
		addTranslate(Material.IRON_DOOR, "Zelazne drzwi");
		addTranslate(Material.REDSTONE, "Czerwony proszek");
		addTranslate(Material.SNOW_BALL, "Sniezka");
		addTranslate(Material.BOAT, "Lodka");
		addTranslate(Material.LEATHER, "Skora");
		addTranslate(Material.MILK_BUCKET, "Wiaderko mleka");
		addTranslate(Material.CLAY_BRICK, "Cegly");
		addTranslate(Material.CLAY_BALL, "Kulka gliny");
		addTranslate(Material.SUGAR_CANE, "Trzcina cukrowa");
		addTranslate(Material.PAPER, "Papier");
		addTranslate(Material.BOOK, "Ksiazka");
		addTranslate(Material.SLIME_BALL, "Kulka szlamu");
		addTranslate(Material.STORAGE_MINECART, "Wagonik");
		addTranslate(Material.POWERED_MINECART, "Wagonik");
		addTranslate(Material.EGG, "Jajko");
		addTranslate(Material.COMPASS, "Kompas");
		addTranslate(Material.FISHING_ROD, "Wedka");
		addTranslate(Material.WATCH, "Zegar");
		addTranslate(Material.GLOWSTONE_DUST, "Jasnopyl");
		addTranslate(Material.RAW_FISH, "Ryba");
		addTranslate(Material.COOKED_FISH, "Pieczona ryba");
		addTranslate(Material.INK_SACK, "Czarny barwnik");
		addTranslate(Material.BONE, "Kosc");
		addTranslate(Material.SUGAR, "Cukier");
		addTranslate(Material.CAKE, "Ciasto");
		addTranslate(Material.BED, "Lozko");
		addTranslate(Material.DIODE, "Przekaznik");
		addTranslate(Material.COOKIE, "Ciastko");
		addTranslate(Material.MAP, "Mapa");
		addTranslate(Material.SHEARS, "Nozyce");
		addTranslate(Material.MELON, "Arbuz");
		addTranslate(Material.PUMPKIN_SEEDS, "Nasiono dyni");
		addTranslate(Material.MELON_SEEDS, "Nasiono melona");
		addTranslate(Material.RAW_BEEF, "Stek");
		addTranslate(Material.COOKED_BEEF, "Pieczony stek");
		addTranslate(Material.RAW_CHICKEN, "Kurczak");
		addTranslate(Material.COOKED_CHICKEN, "Upieczony kurczak");
		addTranslate(Material.ROTTEN_FLESH, "Zgnile mieso");
		addTranslate(Material.ENDER_PEARL, "Perla endermana");
		addTranslate(Material.BLAZE_ROD, "Palka blaza");
		addTranslate(Material.GHAST_TEAR, "Lza gasta");
		addTranslate(Material.GOLD_NUGGET, "Zloty samorodek");
		addTranslate(Material.NETHER_STALK, "Brodawka netherowa");
		addTranslate(Material.POTION, "Mikstura");
		addTranslate(Material.GLASS_BOTTLE, "Szklana butelka");
		addTranslate(Material.SPIDER_EYE, "Oko pajaka");
		addTranslate(Material.FERMENTED_SPIDER_EYE, "Zfermentowane oko pajaka");
		addTranslate(Material.BLAZE_POWDER, "Blaze powder");
		addTranslate(Material.MAGMA_CREAM, "Magmowy krem");
		addTranslate(Material.BREWING_STAND_ITEM, "Stol alchemiczny");
		addTranslate(Material.CAULDRON_ITEM, "Kociol");
		addTranslate(Material.EYE_OF_ENDER, "Sko kresu");
		addTranslate(Material.SPECKLED_MELON, "Arbuz");
		addTranslate(Material.MONSTER_EGG, "Jajko spawnujace");
		addTranslate(Material.EXP_BOTTLE, "Butelka z expem");
		addTranslate(Material.FIREBALL, "Kula ognia");
		addTranslate(Material.BOOK_AND_QUILL, "Ksiazka z piorem");
		addTranslate(Material.WRITTEN_BOOK, "Zapisana ksiazka");
		addTranslate(Material.EMERALD, "Emerald");
		addTranslate(Material.ITEM_FRAME, "Ramka na obraz");
		addTranslate(Material.FLOWER_POT_ITEM, "Doniczka");
		addTranslate(Material.CARROT_ITEM, "Marchewka");
		addTranslate(Material.POTATO_ITEM, "Ziemniak");
		addTranslate(Material.BAKED_POTATO, "Upieczony ziemniak");
		addTranslate(Material.POISONOUS_POTATO, "Trujacy ziemniak");
		addTranslate(Material.EMPTY_MAP, "Pusta mapa");
		addTranslate(Material.GOLDEN_CARROT, "Zlota marchewka");
		addTranslate(Material.SKULL_ITEM, "Glowa");
		addTranslate(Material.CARROT_STICK, "Marchewka na patyku");
		addTranslate(Material.NETHER_STAR, "Gwiazda netherowa");
		addTranslate(Material.PUMPKIN_PIE, "Placek dyniowy");
		addTranslate(Material.FIREWORK, "Fajerwerka");
		addTranslate(Material.FIREWORK_CHARGE, "Fajerwerka");
		addTranslate(Material.ENCHANTED_BOOK, "Enchantowana ksiazka");
		addTranslate(Material.REDSTONE_COMPARATOR, "Komperator");
		addTranslate(Material.NETHER_BRICK_ITEM, "Cegla netherowa");
		addTranslate(Material.QUARTZ, "Kwarc");
		addTranslate(Material.EXPLOSIVE_MINECART, "Wagonik z tnt");
		addTranslate(Material.HOPPER_MINECART, "Wagonik z lejem");
		addTranslate(Material.IRON_BARDING, "Zelazna motyka");
		addTranslate(Material.GOLD_BARDING, "Zlota motyka");
		addTranslate(Material.DIAMOND_BARDING, "Diamentowa motyka");
		addTranslate(Material.LEASH, "Lasso");
		addTranslate(Material.NAME_TAG, "Name tag");
		addTranslate(Material.COMMAND_MINECART, "Wagonik z blokiem polecen");
		addTranslate(Material.GOLD_RECORD, "Plyta muzyczna");
		addTranslate(Material.GREEN_RECORD, "Plyta muzyczna");
		addTranslate(Material.RECORD_3, "Plyta muzyczna");
		addTranslate(Material.RECORD_4, "Plyta muzyczna");
		addTranslate(Material.RECORD_5, "Plyta muzyczna");
		addTranslate(Material.RECORD_6, "Plyta muzyczna");
		addTranslate(Material.RECORD_7, "Plyta muzyczna");
		addTranslate(Material.RECORD_8, "Plyta muzyczna");
		addTranslate(Material.RECORD_9, "Plyta muzyczna");
		addTranslate(Material.RECORD_10, "Plyta muzyczna");
		addTranslate(Material.RECORD_11, "Plyta muzyczna");
		addTranslate(Material.RECORD_12, "Plyta muzyczna");
		addTranslate(Material.GOLDEN_APPLE, "Kox");
	}

	public String getTranslate(Material m) {
		if (TRANSLATIONS.containsKey(m)) {
			return TRANSLATIONS.get(m);
		}
		return m.name();
	}

	public static TranslateManager getInstance() {
		if (instance == null) instance = new TranslateManager();
		return instance;
	}
}
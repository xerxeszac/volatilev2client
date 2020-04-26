package com.client;

public class Configuration {
	
	public static boolean newFonts = false;

	/**
	 * Attack option priorities 0 -> Depends on combat level 1 -> Always right-click
	 * 2 -> Left-click where available 3 -> Hidden
	 */
	public static int playerAttackOptionPriority = 0;
	public static int npcAttackOptionPriority = 2;

	public static boolean debug = false;
	public static final boolean DUMP_SPRITES = false;

	public static int xpSize = 0;
	public static int xpSpeed = 0;
	public static int xpDuration = 0;
	public static int xpColour = 0;
	public static int xpGroup = 0;

	public static boolean enableSmoothShading = true;
	public static boolean enableTileBlending = true;
	public static boolean enableAntiAliasing = false;
	public static boolean enableFogRendering = false;
    public static boolean enableRainbowFog = false;
	public static boolean bountyHunter = true;
	public static boolean playerNames = false;
	public static int chatColor = 0;
    public static int fogColor = 0xDCDBDF;
	public static long fogDelay = 500;
	public static final int CLIENT_VERSION = 4;
	public static Boolean LIVE_SERVER = false;
	public static final int PORT = 43594;

	public static final String CLIENT_TITLE =  Configuration.LIVE_SERVER ? "Volatile" : "Volatile - Localworld";
	public static Boolean DUMP_DATA = false;
	public static int dumpID = 180;
	public static Boolean DUMP_OTHER = false;

	/**
	 * Used to repack indexes Index 1 = Models Index 2 = Animations Index 3 =
	 * Sounds/Music Index 4 = Maps You can only do up to 300 files at a time
	 */

	public static final String CACHE_NAME = "VolatileCache";

	public static boolean repackIndexOne = false, repackIndexTwo = false, repackIndexThree = false,
			repackIndexFour = false;

	public static final String CACHE_LINK = "https://www.dropbox.com/s/ykartjqw0ttj1qz/VolatileCache.zip?dl=1"; // Link for every client below client

	public static final String MEDIA_ARCHIVES_LINK = "https://www.dl.dropboxusercontent.com/sh/qpw6qpe1gqm8zq6/AABqDA9gScRH72FQBebyKm0Ba"; // Link for every
																									// client below //
	public static final String SPRITE_CACHE_URL = "https://www.dl.dropboxusercontent.com/sh/1km7safuq247s6l/AACFc43UzputgyZ_0SXUgDola"; // Link for every client below
																						// client v1.12 - being
	public static final String VERSION_URL = "http://playVolatile.net/versiontracker/cachevers";
	
	public static final String CLIENT_VERSION_URL = "http://playVolatile.net/versiontracker/clientvers.txt";
	
	public static final String CLIENT_URL = "https://www.dropbox.com/s/9r0z9h7ymtfp25p/clientunobf.jar?dl=1";
	
	/**
	 * Seasonal Events
	 */
	public static boolean HALLOWEEN = false;
	public static boolean CHRISTMAS = false;
	public static boolean CHRISTMAS_EVENT = false;
	public static boolean EASTER = false;

	public static boolean osbuddyGameframe = false;

	public static boolean oldGameframe = false;
	public static int gameWorld = 1;

	public static int xpPosition;
	public static boolean escapeCloseInterface = false;
	public static boolean inventoryContextMenu = true;
	public static int statMenuColor = 0x00FFFF;//0xFF00FF;
	public static boolean alwaysLeftClickAttack;
	public static boolean hideCombatOverlay;

}

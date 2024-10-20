package winlyps.feedCommand

import org.bukkit.plugin.java.JavaPlugin

class FeedCommand : JavaPlugin() {

    override fun onEnable() {
        // Register the feed command
        getCommand("feed")?.setExecutor(FeedCommandExecutor(this))

        logger.info("FeedCommand plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("FeedCommand plugin has been disabled.")
    }
}
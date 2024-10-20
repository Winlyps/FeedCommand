package winlyps.feedCommand

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class FeedCommandExecutor(private val plugin: FeedCommand) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("Only players can use this command.")
            return true
        }

        if (!sender.hasPermission("feedcommand.use") && !sender.isOp) {
            sender.sendMessage("You do not have permission to use this command.")
            return true
        }

        sender.foodLevel = 20
        sender.saturation = 20f

        return true
    }
}
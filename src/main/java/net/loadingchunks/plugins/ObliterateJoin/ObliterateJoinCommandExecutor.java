package net.loadingchunks.plugins.ObliterateJoin;

/*
    This file is part of ObliterateJoin

    ObliterateJoin is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ObliterateJoin is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ObliterateJoin.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ObliterateJoinCommandExecutor implements CommandExecutor {

    private ObliterateJoin plugin;

    public ObliterateJoinCommandExecutor(ObliterateJoin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin.getLogger().info("onCommand Reached in ObliterateJoin");

        if (command.getName().equalsIgnoreCase("oj") && args.length > 0 && args[0].equalsIgnoreCase("reload") && (sender.hasPermission("oj.reload") || sender.isOp())) {
        	plugin.reloadConfig();
        	sender.sendMessage(ChatColor.GREEN + "Reloaded ObliterateJoin");
        	return true;
        }
        return false;
    }
}

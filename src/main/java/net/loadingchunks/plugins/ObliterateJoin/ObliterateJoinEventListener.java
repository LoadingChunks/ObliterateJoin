package net.loadingchunks.plugins.ObliterateJoin;

/*
    This file is part of ObliterateJoin

    {ObliterateJoin} is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    {ObliterateJoin} is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with {ObliterateJoin}.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ObliterateJoinEventListener implements Listener {

	private ObliterateJoin plugin;

	public ObliterateJoinEventListener(ObliterateJoin plugin) {
		this.plugin = plugin;
	}

	@EventHandler (priority = EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent e) {
		if(plugin.getConfig().getBoolean("disable.join"))
			e.setJoinMessage(null);
	}
	
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onQuit(PlayerQuitEvent e) {
		if(plugin.getConfig().getBoolean("disable.quit"))
			e.setQuitMessage(null);
	}
}

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

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ObliterateJoin extends JavaPlugin {

	//ClassListeners
	private final ObliterateJoinCommandExecutor commandExecutor = new ObliterateJoinCommandExecutor(this);
	private final ObliterateJoinEventListener eventListener = new ObliterateJoinEventListener(this);
	//ClassListeners

	public void onDisable() {
		// add any code you want to be executed when your plugin is disabled
	}

	public void onEnable() { 

		PluginManager pm = this.getServer().getPluginManager();

		getCommand("oj").setExecutor(commandExecutor);

		// you can register multiple classes to handle events if you want
		// just call pm.registerEvents() on an instance of each class
		pm.registerEvents(eventListener, this);

	}
}

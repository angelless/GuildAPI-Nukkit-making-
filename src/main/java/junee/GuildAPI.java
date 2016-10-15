package junee;

import junee.Commands.*;

import cn.nukkit.utils.Config;
import cn.nukkit.plugin.PluginBase;

class iGuild extends PluginBase {
	
	public Config config; 

	public void onLoad(){
	}
	public void onEnable(){
    //커맨드 등록
		this.getServer().getCommandMap().register("길드초대", new GuildInvite());
		this.getServer().getCommandMap().register("부길드장", new regGuildManager());
		this.getServer().getCommandMap().register("길드탈퇴", new GuildLeave());
	}
	
	public void onDisable(){
	}
}

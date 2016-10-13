package junee;

import junee.Commands.*;

class iGuild extends PluginBase {

  public Config config;

  public void onLoad(){
  }
  public void onEnable(){
    this.getServer().getCommandMap().register("길드초대", new GuildInvite());
    this.getServer().getCommandMap().register("길드매니져임명" new GuildManager());
    this.getServer().getCommandMap().register("길드탈퇴", new GuildLeave());
  }
}

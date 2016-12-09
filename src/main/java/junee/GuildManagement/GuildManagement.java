package junee.GuildManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.google.gson.JsonArray;

import cn.nukkit.plugin.PluginBase;

class GuildManagement extends PluginBase{
    LinkedHashMap<String, ArrayList<String>> Guildname = new LinkedHashMap<String,ArrayList<String>>();
	LinkedHashMap<String,String> GuildMem = new LinkedHashMap<String,String>();
	public String GuildRank;
	
	public GuildManagement() {
	}
	
	public void saveGuildList(String Guildname,String GuildCEO){
		this.Guildname.put(Guildname, this.GuildMem.put(GuildCEO,"GuildCEO"));
		
	}
	public boolean GuildMemberadd(String GuildMember,String GuildCEO/*자동 사용자 확인*/) {
		if(this.Guildname.containsKey(GuildCEO)){
		this.Guildname.put(this.Guildname, this.GuildMem.put(GuildMember, "GuildMember" ));
		//todo put안에 Guildname을 자동으로 알아내게 하기	
    }
		}
	}
}

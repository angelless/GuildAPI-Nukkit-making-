package junee;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.event.Listener;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.Utils;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

import java.io.File;
import java.util.*;

public class MyGuild extends PluginBase implements Listener {
	
	public Config config;
	
	public void onload(){
		this.getLogger().info(TextFormat.AQUA + "MyGuild플러그인이 정상적으로 로딩 완료했습니다");
		this.getServer().getCommandMap().register("길드도움말",new GuildHelpCommand(this));
	}
	
	// config저장
	@Override
	public void onEnable(){
		this.getDataFolder().mkdirs();
		
		if(!(new File(this.getDataFolder(),"config.yml").exists()))
				{
			
			saveResourse("config.json");
			
				}
		this.config = getConfig();
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info(TextFormat.AQUA + "MyGuild 플러그인이 정상적으로 활성화 되었습니다!");
		
	}
	
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args)
	{
		switch(cmd.getName())
		{
		
		case "길드":
		
		// /길드 뒤에 아무것도 안썻을경우
		if(args.length == 0)
		{
		
			sender.sendMessage(TextFormat.RED + "알수 없는 명령어입니다!");
			sender.sendMessage(TextFormat.AQUA + "사용법: /길드");
			sender.sendMessage(TextFormat.DARK_GREEN + "자세한 내용은 /길드 도움말 로 확인하세요");
			
		}
		else
		{
			if(args[0].equalsIgnoreCase("도움말"))
			{
				sender.sendMessage(TextFormat.AQUA + "은행  <입금/출금> <금액> :<금액>만큼의 돈을 입/출금합니다");
				sender.sendMessage(TextFormat.AQUA + "채팅 :길드채팅방 혹은 일반 채팅으로 전환합니다");
				sender.sendMessage(TextFormat.AQUA + "pvp <on/off> : 길드원간의 피비피를 활성화하거나 비활성화 합니다.");
				sender.sendMessage(TextFormat.AQUA + "양도 <풀래이어> : 길드장 권한을  <플레이어>에게 양도합니다");
				sender.sendMessage(TextFormat.AQUA + "전쟁  <신청/참여> :전쟁을 신청/타길드의 전쟁에 참여합니다");
				sender.sendMessage(TextFormat.AQUA + "부길드장<부여/해임> <플레이어> : <플레이어>에게 부길드장을 부여/해임합니다");
				sender.sendMessage(TextFormat.AQUA + "다음 명령어를 보시려면 /길드 도움말 2를 쳐주세요");
			}
				else if(args[0].equalsIgnoreCase("도움말 2"))
				{
					sender.sendMessage(TextFormat.AQUA + "");
				}
			
			}
		
		}
		return true;
				
	}
		
	private void saveResourse(String string) {
		// TODO 자동 생성된 메소드 스텁
		
	}

	public void guildchat(){
		
	}
	

}

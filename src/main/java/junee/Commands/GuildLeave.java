package junee.Commands;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class GuildLeave extends Command {
	
	public GuildLeave(){
		super("길드탈퇴","현재 가입되어있는 길드에서 탈퇴합니다","/길드탈퇴");
	}
	
	@Override
	public boolean execute(CommandSender arg0, String arg1, String[] arg2) {
		// TODO 자동 생성된 메소드 스텁
		return false;
	}

}

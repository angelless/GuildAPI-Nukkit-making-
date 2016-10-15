package junee.Commands;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class regGuildManager extends Command{

public regGuildManager(){
  super("부길드장임명","부길드장를 임명/해임 합니다","/길드매니져임명 <닉네임>");
}

@Override
public boolean execute(CommandSender arg0, String arg1, String[] arg2) {
	// TODO 자동 생성된 메소드 스텁
	return false;
}

}

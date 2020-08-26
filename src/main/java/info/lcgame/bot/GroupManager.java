package info.lcgame.bot;

import info.lcgame.BotMain;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactoryJvm;
import net.mamoe.mirai.utils.BotConfiguration;

public class GroupManager {

    private Bot bot = null;

    public GroupManager() {

        this.bot = BotFactoryJvm.newBot(2867147241L, BotMain.getConfig().getProperty("password"), new BotConfiguration() {

            {
                fileBasedDeviceInfo(BotMain.getConfig().getProperty("deviceInfoPath"));
            }

        });

    }

    public Bot getBot() {
        return bot;
    }
}

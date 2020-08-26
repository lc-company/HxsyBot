package info.lcgame;

import info.lcgame.bot.BotManager;

import java.io.*;
import java.util.Properties;

public class BotMain {

    private final static Properties config = new Properties();

    public static void main(String[] args) throws IOException {

        config.load(new BufferedReader(new FileReader(new File("./config.properties"))));
        BotManager.groupManager.login();
        BotManager.groupManager.join();

    }

    public static Properties getConfig() {
        return config;
    }
}

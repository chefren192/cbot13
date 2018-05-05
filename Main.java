package main;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {

    public static JDA jda;


    public static void main(String[] args) throws Exception {
            jda = new JDABuilder(AccountType.BOT)
                    .setToken("NDQyMzQzNzc4MTY3MjkxOTIy.Dc9c4g.qvlfA_lnNiLf2AHy_sP27xRZ39I")
                    .buildBlocking();
            jda.setAutoReconnect(true);

        }
    }

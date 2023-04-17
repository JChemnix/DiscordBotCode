import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import javax.security.auth.login.LoginException;

public class BotMain {
    public static void main(String[] args) throws Exception{
        long AKID = 521850636321423371L;
        long testServerID = 532759776090783744L;
        long SubServerID = 577755726747926548L;

        JDABuilder jdaBuilder = JDABuilder.createDefault("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        jdaBuilder.setChunkingFilter(ChunkingFilter.include(AKID,testServerID, SubServerID));
        jdaBuilder.setMemberCachePolicy(MemberCachePolicy.ALL);
        jdaBuilder.enableIntents(GatewayIntent.GUILD_MEMBERS);
        jdaBuilder.build();

        JDA jda = null;

        //jdaBuilder.addEventListeners(new Test());

        jdaBuilder.addEventListeners(new FunMessages());

        jdaBuilder.addEventListeners(new ServerJoin());

        jdaBuilder.addEventListeners(new ServerLeave());

        //jdaBuilder.addEventListeners(new RecruitsCheck());

        //jdaBuilder.addEventListeners(new Ping());



        jdaBuilder.setActivity(Activity.watching("how I will take over the world!"));

        try{
            jda = jdaBuilder.build();
        }catch (LoginException e){
            e.printStackTrace();
        }
    }
}

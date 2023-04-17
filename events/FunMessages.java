package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class FunMessages extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e){
    String serv = e.getGuild().toString();
    serv = serv.replaceAll("\\D", "");

        if (serv.equals("577755726747926548") || serv.equals("521850636321423371")) { return;}

        else{

            if (e.getMessage().getContentRaw().equals("<@!822926867396558909>")) {
                e.getChannel().sendMessage("https://tenor.com/view/genos-one-ounch-m-an-anime-gif-5748979").queue();
            }

            else if (e.getMessage().getContentRaw().equalsIgnoreCase("what in tarnation")) {
                e.getChannel().sendMessage("https://i.imgur.com/kpQ4uE7.png").queue();
            }

            else if (e.getMessage().getContentRaw().equalsIgnoreCase("one sec")) {
                e.getChannel().sendMessage("https://cdn.discordapp.com/attachments/825054170628620359/832066726623182868/KWJmfE9h.png").queue();
            }








        }//end of serv check
}//end of onMessageReceived (main)



}//end of class

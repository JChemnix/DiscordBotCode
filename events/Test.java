package events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class Test extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String serv = e.getGuild().toString();
        serv = serv.replaceAll("\\D", "");

        if (serv.equals("577755726747926548")) { //changed to SubServer
            if (e.getMessage().getContentRaw().matches(">check.*")) {


                //END OF TEST CODE********************
            }//end of if "(message)"*********************************
        }//end of serv = "test"************************
    }//end of onMessageReceived (main)************************


}//and of class**************************

package events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.concurrent.Task;

import java.util.List;
import java.util.Objects;

public class Ping extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String serv = e.getGuild().toString();
        serv = serv.replaceAll("\\D", "");

        if (serv.equals("532759776090783744")) {


            if (e.getMessage().getContentRaw().equals("~ping")) {


            }//end of if "p"
        }
    }//end of onMessageReceived



}// end of class

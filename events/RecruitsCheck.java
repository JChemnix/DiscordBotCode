package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.lang.reflect.Member;
import java.util.List;

public class RecruitsCheck extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String serv = e.getGuild().toString();
        serv = serv.replaceAll("\\D", "");

        if (serv.equals("577755726747926548")) { //changed to recitment server
            if (e.getMessage().getContentRaw().matches(">rolefix.*")) {
                long AKID = 521850636321423371L;
                long AKRecruiterID = 549230892309020685L;

                String list = e.getGuild().getMembersWithRoles().toString();
                String[] arrList = list.split("/");
//                String[] arrlList = arrList.replaceAll("\\d", "");
//                s.replace("577755726747926548", "");

                for (String s : arrList) {
                    //User user = e.getJDA().getUserById(memebrs.indexOf(i))

                    System.out.println(s);
//                    List userRoles = e.getJDA().getGuildById(521850636321423371L).getMember(memebrs.indexOf(i))
//
//                    e.getJDA().getGuildById(AKID).

                }


            }
        }
    }

}

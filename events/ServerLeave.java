package events;

import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ServerLeave extends ListenerAdapter {
    @Override
    public void onGuildMemberRemove (GuildMemberRemoveEvent e){
        String serv = e.getGuild().toString();
        serv = serv.replaceAll("\\D", "");

        if (serv.equals("577755726747926548")) {

            final String recruiterRoleID = "680465191523319913";
            final String SSLongDumpChannel = "824178783321325618";

            if (e.getMember().getRoles().contains(e.getGuild().getRoleById(recruiterRoleID))) {
                e.getGuild().getTextChannelById(SSLongDumpChannel)
                        .sendMessage("**Recruiter " + "<@" + e.getMember().getIdLong() + ">" +
                                " has left the server!**")
                        .queue();
            }

        }//end of serv == SubServer
    }// end of onGuildLeave
}//end of class

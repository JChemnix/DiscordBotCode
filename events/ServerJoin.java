package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ServerJoin extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent e) {
        String serv = e.getGuild().toString();
        serv = serv.replaceAll("\\D", "");

        if (serv.equals("577755726747926548")) {
            //makes sure who join's is apart of SubServer first

            final String AKServerID = "521850636321423371";
            final String SSLogDumpChannel = "824178783321325618";

            final String recruiterRoleID = "822677805195460639";
            final String guestRoleID = "823045366982115338";

            if (e.getJDA().getGuildById(AKServerID).isMember(e.getMember().getUser()) == false) {
                e.getGuild().addRoleToMember(e.getMember(), e.getJDA().getRoleById(guestRoleID)).queue();

            } else {

                if (roleCheck(e,AKServerID)){

                    e.getGuild().getTextChannelById(SSLogDumpChannel)
                            .sendMessage("<@" + e.getMember().getIdLong() + ">" +
                                    " was given Verified Clan Member role")
                            .queue();
                    e.getGuild().addRoleToMember(e.getMember(), e.getJDA().getRoleById(recruiterRoleID)).queue();
               }
                else{

                    e.getGuild().addRoleToMember(e.getMember(), e.getJDA().getRoleById(guestRoleID)).queue();
                }


            }//end of else statement
        }//end of main if statement

    }// end of (main)


    public boolean roleCheck (GuildMemberJoinEvent e, String AKServerID) {
        User person = e.getMember().getUser();

        final String clanlessID = "595045402143752212";

        final String AKID = "521854159390113793";
        final String IKID = "566032412618784768";
        final String HKID = "604195078973554698";
        final String WKID = "606538892547457027";
        final String YKID = "874903017445535754";
        final String CWID = "931364353213595709";

        if (e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                .contains(e.getJDA().getGuildById(AKServerID).getRoleById(clanlessID))){
            return false;

        }else if (
                e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                        .contains(e.getJDA().getGuildById(AKServerID).getRoleById(AKID))
                    ||
                e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                        .contains(e.getJDA().getGuildById(AKServerID).getRoleById(IKID))

                    ||
                e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                        .contains(e.getJDA().getGuildById(AKServerID).getRoleById(HKID))

                    ||
                e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                        .contains(e.getJDA().getGuildById(AKServerID).getRoleById(WKID))
                    ||
                e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                        .contains(e.getJDA().getGuildById(AKServerID).getRoleById(YKID))
                    ||
                    e.getJDA().getGuildById(AKServerID).getMember(person).getRoles()
                            .contains(e.getJDA().getGuildById(AKServerID).getRoleById(CWID))
        ){
            return true;

        } else {
            //if no roles from list detected, make recruiter
            return false;
        }
    }// end of roleCheck method

}// end of listening class

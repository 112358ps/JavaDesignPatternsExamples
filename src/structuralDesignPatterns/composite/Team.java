package structuralDesignPatterns.composite;

import java.util.ArrayList;

public class Team {
    
    ArrayList<Team> subTeams;
    ArrayList<TeamMember> teamMembers;

    String teamName;
    public Team(String teamName){
        this.teamName = teamName;
    }

    public void addTeam(Team t){
        if(subTeams == null){
            subTeams = new ArrayList<Team>();
        }
        subTeams.add(t);
    }

    public void addMember(TeamMember tm){
        if(teamMembers == null){
            teamMembers = new ArrayList<TeamMember>();
        }
        teamMembers.add(tm);
    }

    public void goToBerserkMode(){
        if(subTeams == null && teamMembers == null){
            return;
        }
        System.out.println("Going to berserk mode:: Team "+ teamName);
        if (teamMembers != null){
            for (TeamMember tm : teamMembers) {
                tm.berserkMode();
            }
        }

        if (subTeams != null){
            for (Team t : subTeams) {
                t.goToBerserkMode();
            }
        }
    }
}

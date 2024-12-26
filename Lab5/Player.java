public class Player {
    private String name;
    private String team;
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getTeam() {
        return team;
    }
    
    public void setTeam(String t) {
        this.team = t;
    }
    
    public boolean isSameTeam(Player p) {
        if ( this.team.equals(p.team))
            return true;
        return false;
    }
}

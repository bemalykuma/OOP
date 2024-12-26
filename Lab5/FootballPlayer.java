public class FootballPlayer extends Player {
    
    private int playerNumber;
    private String position;
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    public void setPlayerNumber(int n) {
        playerNumber = n;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String p) {
        this.position = p;
    }
    
    public boolean isSamePosition(FootballPlayer p) {
        if ( this.position.equals(p.position)) {
            if (super.getTeam().equals(p.getTeam())) {
                return true;
            }
        }
        return false;
    }
}

package Classes;

public class Team {

    // * Attributes *
    private boolean state = true;
    private int count = 1;
    private String teamName;
    private int teamCode;
    private Coach teamCoach;
    private Player p;
    private Player[] teamPlayers = new Player[1];    // you should convet 1 to 11 . count of players

    // * Constructors *
    public Team() {
    }

    // * Setter *
    public void setTeamCode(int teamCode) {
        if (teamCode > 0) {
            this.teamCode = teamCode;
        } else {
            System.out.println(" The entered Team Code is not valid\n" +
                    "We have saved " + this.count + " for you ");
            this.teamCode = this.count;
        }
    }

    public void setState(boolean newState) {
        this.state = newState;
    }

    // * Getter *
    public Coach getTeamCoach() {
        return teamCoach;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamCode() {
        return teamCode;
    }

    public Player[] getPlayers() {
        return teamPlayers;
    }

    public boolean getState(){
        return state;
    }

    // * Methods *
    public void read() {
        this.state = true;

        System.out.print(" Enter Your Team Name : ");
        this.teamName = global_Var.console.next();

        System.out.print(" Enter Your Team Code : ");
        int code = global_Var.console.nextInt();
        setTeamCode(code);

        System.out.println(" Enter Your Team Coach Information's ");
        this.teamCoach = new Coach();
        this.teamCoach.read();

        for (int i = 0; i < this.teamPlayers.length; i++) {
            System.out.println(" Enter the Team Players' Information ");
            this.teamPlayers[i] = new Player();
            this.teamPlayers[i].read();
        }
    }

    public void show() {
        System.out.println(" Team Name : " + this.teamName + "  Team Coach : " + this.teamCoach.firstName + " " + this.teamCoach.lastName + "\n" +
                " Team Code : " + this.teamCode + "\n" +
                " Team Players : ");
        for (int i = 0; i < this.teamPlayers.length; i++) {
            System.out.println(" " + (i + 1) + ") " + teamPlayers[i].firstName + " " + teamPlayers[i].lastName);
        }
    }

    public void showTeamName(){
        System.out.println(" Team Name is : " + this.teamName);
    }
}

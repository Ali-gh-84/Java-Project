//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Classes.Date;
import Classes.Player;
import Classes.Team;
import Classes.global_Var;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Team team[] = new Team[1];  // you should convet 1 to 16 . count of players
        int count = 0;
        boolean finish = true;

        System.out.println("\n * Welcome to my program  :) * \n");

        Thread.sleep(1000);

        while (finish) {
            System.out.println(
                    """
                                     1) Receive Team Information's \s
                                     2) Show Teams Information's \s
                                     3) Searching Team by Team Code \s
                                     4) Searching Coach of Team by Team Name \s
                                     5) Searching Team Name by Coach's National Code \s
                                     6) Searching Team Name by Player's National Code \s
                                     7) Shows all Players Who are Over 30 Years Old as of 1/1/1402. \s
                                     8) Deleting Information a Team \s
                                     9) Exit \s
                            """
            );
            Thread.sleep(500);

            System.out.print(" Enter a Number Between 1-9 for Choose an Option : ");
            int choose = global_Var.console.nextInt();
            Thread.sleep(500);

            switch (choose) {
                case 1:
                    System.out.println("\n Enter Team Information's ");
                    team[count] = new Team();
                    team[count].read();
                    count += 1;
                    System.out.println(" the Team Was Successfully Registered. \n");
                    Thread.sleep(500);
                    break;
                case 2:
                    System.out.println(" Teams information ");
                    for (int i = 0; i < count; i++) {
                        if (team[i].getState()) {
                            team[i].show();
                        } else {
                            System.out.println(" Nothing Found. ");
                        }
                    }
                    Thread.sleep(500);
                    break;
                case 3:
                    System.out.print(" Enter Team Code for Search : ");
                    int search = global_Var.console.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (team[i].getTeamCode() == search) {
                            team[i].show();
                        } else {
                            System.out.println(" Nothing Found. ");
                        }
                    }
                    break;
                case 4:
                    System.out.print(" Enter Team Name for Search : ");
                    String searchCoach = global_Var.console.next();
                    for (int i = 0; i < count; i++) {
                        if (team[i].getTeamName().contains(searchCoach)) {
                            team[i].getTeamCoach().showFullNameCoach();
                        } else {
                            System.out.println(" Nothing Found. ");
                        }
                    }
                    Thread.sleep(500);
                    break;
                case 5:
                    System.out.print(" Enter Coach National Code's for Search : ");
                    int searchTeamNameWithCoach = global_Var.console.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (team[i].getTeamCoach().getNationalCode() == searchTeamNameWithCoach) {
                            team[i].showTeamName();
                        } else {
                            System.out.println(" Nothing Found. ");
                        }
                    }
                    Thread.sleep(500);
                    break;
                case 6:
                    System.out.print(" Enter Player National Code's for Search : ");
                    int searchTeamNameWithPlayer = global_Var.console.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (team[i].getPlayers()[i].getNationalCode() == searchTeamNameWithPlayer) {
                            team[i].showTeamName();
                        } else {
                            System.out.println(" Nothing Found. ");
                        }
                    }
                    Thread.sleep(500);
                    break;
                case 7:
                    System.out.println("Players over 30 years old are : ");
                    Date currentDate = new Date(1402, 1, 1);
                    for (int i = 0; i < count; i++) {
                        Player[] allplayer = team[i].getPlayers();
                        for (Player p : allplayer) {
                            p.getBirthDate().calculateAge(currentDate);
                            if (p.getBirthDate().calculateAge(currentDate)) {
                                p.showFullNamePlayer();
                            } else {
                                System.out.println(" Nothing Found. ");
                            }
                        }
                    }
                    Thread.sleep(500);
                    break;
                case 8:
                    System.out.print(" Enter Team Code For Search Team for Delete : ");
                    int searchTeam = global_Var.console.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (team[i].getTeamCode() == searchTeam) {
                            System.out.print(" Are You Sure You Want to Delete the Team (y/n) ? ");
                            char confirm = global_Var.console.next().toLowerCase().charAt(0);
                            if (confirm == 'y') {
                                team[i].setState(false);
                                System.out.println("Team deleted.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Nothing Found.");
                    }
                    Thread.sleep(500);
                    break;
                case 9:
                    System.out.println(" Thanks for Use My Application :) \n");
                    Thread.sleep(500);
                    finish = false;
                    break;
                default:
                    System.out.println(" Please Choose a Number Between 1 and 9 :) \n");
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballtest;

import java.util.Scanner;

/**
 *
 * @author ardol7945
 */
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static int switchControler = 0;
    public static String commandsArray[]
            = {"displayPoints", "displayWins",
                "displayLoses", "displayTies",
                "addWins", "addLoses",
                "addTies", "addPoints",
                "exit"};
    public static String answer;
    public static boolean running = true;

    public static void main(String[] args) {
        BaseballTeam baseballTeam = new BaseballTeam();
        String stats;
        int wins, loses, ties;

        Scanner input = new Scanner(System.in);
        while (running) {
            switch (switchControler) {
                case 0:
                    System.out.println("What happened in this game(win/lose/tie)?");
                    stats = input.nextLine();
                    System.out.println("Your team has gained" + baseballTeam.points(stats) + " points");
                    switchControler = 1;
                    break;

                case 1:
                    System.out.println("What do you want to do next?");

                    displayAllCOmmands();
                    answer = input.nextLine();
                    commands();

                    break;
                case 2:
                    System.out.println(baseballTeam.getWins() + " wins");
                    switchControler = 1;
                    break;
                case 3:
                    System.out.println(baseballTeam.getLoses() + " loses");
                    switchControler = 1;
                    break;
                case 4:
                    System.out.println(baseballTeam.getTies() + " ties");
                    switchControler = 1;
                    break;
                case 5:
                    System.out.println("how manay more wins?");
                    wins = input.nextInt();
                    baseballTeam.setWins(wins);
                    switchControler = 1;
                    break;
                case 6:
                    System.out.println("how manay more loses?");
                    wins = input.nextInt();
                    baseballTeam.setLoses(wins);
                    switchControler = 1;
                    break;
                case 7:
                    System.out.println("how manay more ties?");
                    wins = input.nextInt();
                    baseballTeam.setTies(wins);
                    switchControler = 1;
                    break;
                case 8:
                    System.out.println(baseballTeam.getOverallPoints());
                    switchControler = 1;
                    break;
                case 9:
                    running = false;
                    break;
            }
        }

// TODO code application logic here
    }

    public static void displayAllCOmmands() {
        for (int i = 0; i <= commandsArray.length - 1; i++) {
            System.out.println(commandsArray[i]);
        }
    }

    public static void commands() {
        if (answer.equalsIgnoreCase(commandsArray[0])) {
            switchControler = 8;
        } else if (answer.equalsIgnoreCase(commandsArray[1])) {
            switchControler = 2;
        } else if (answer.equalsIgnoreCase(commandsArray[2])) {
            switchControler = 3;
        } else if (answer.equalsIgnoreCase(commandsArray[3])) {
            switchControler = 4;
        } else if (answer.equalsIgnoreCase(commandsArray[4])) {
            switchControler = 5;
        } else if (answer.equalsIgnoreCase(commandsArray[5])) {
            switchControler = 6;
        } else if (answer.equalsIgnoreCase(commandsArray[6])) {
            switchControler = 7;
        } else if (answer.equalsIgnoreCase(commandsArray[7])) {
            switchControler = 1;
        } else if (answer.equalsIgnoreCase(commandsArray[8])) {
            switchControler = 9;
        }

    }

}

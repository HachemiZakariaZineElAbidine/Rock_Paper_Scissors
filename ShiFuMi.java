package Pro;
import java.util.Random;
import java.util.Scanner;
//new java app
public class ShiFuMi {
    public static void main(String[] args){
        int player;
        int pc;
        int game_number = 1;
        int win = 0;
        int draw = 0;
        int lose= 0;
        int Min = 1;
        int Max = 3;
        boolean game = true;
        int game_choice = 0;


        Scanner nc = new Scanner(System.in);
        System.out.println("Rock Paper Scissos\n");

        while(game) {
            pc = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Game number"+game_number);
            do {
                System.out.println("1 - for Rock ");
                System.out.println("2 - for Paper");
                System.out.println("3 - for Scissors");
                System.out.print("Give your choice :  ");
                player = nc.nextInt();
                if(player != 1 && player != 2 && player != 3)
                { System.out.println("Error you should give 1 or 2 or 3\n"); }
            }while(player != 1 && player != 2 && player != 3);


            if (player == 1) {
                if (pc == 1) {
                    System.out.println("Draw");
                    draw++;
                } else if (pc == 2) {
                    System.out.println("You lose");
                    lose++;
                } else {
                    System.out.println("You win");
                    win++;
                }
            }

            if (player == 2) {
                if (pc == 1) {
                    System.out.println("You win");
                    win++;
                } else if (pc == 2) {
                    System.out.println("Draw");
                    draw++;
                } else {
                    System.out.println("You lose");
                    lose++;
                }
            }

            if (player == 3) {
                if (pc == 1) {
                    System.out.println("You lose");
                    lose++;
                } else if (pc == 2) {
                    System.out.println("You win");
                    win++;
                } else {
                    System.out.println("Draw");
                    draw++;
                }
            }
            System.out.println("\nScore");
            System.out.println("Win : "+win);
            System.out.println("Draw : "+draw);
            System.out.println("Lose : "+lose);
            System.out.println("\n");



            do {
                System.out.println("1- for play");
                System.out.println("2- for quit");
                System.out.print("Give your choice :  ");
                game_choice = nc.nextInt();
                if(game_choice == 2)
                { game = false; }
                else if(game_choice != 1 && game_choice !=2)
                { System.out.println("You should choose between 1 and 2\n");}
            } while (game_choice != 1 && game_choice != 2);
            System.out.println("\n");
            game_number++;
        }
        System.out.println("\nFinal score");
        System.out.println("Win : "+win);
        System.out.println("Draw : "+draw);
        System.out.println("Lose : "+lose);
    }
    }

